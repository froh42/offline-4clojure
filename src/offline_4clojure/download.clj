(ns offline-4clojure.download
  (:require [clj-http.client :as http]
            [clojure.string :as string]
            [clojure.string :as string]
            [clojure.java.io :as io]
            [clojure.pprint :as pp]
            [cheshire.core :as ches]))

(pp/set-pprint-dispatch pp/code-dispatch)

(defn fetch-problem-data [n]
  (println "fetching" n)
  (ches/parse-string
    (:body
      (http/get (str "http://www.4clojure.com/api/problem/" n)
                (merge {:socket-timeout 1000 :conn-timeout 1000} #_{:proxy-host "proxy1.sulzer.de" :proxy-port 88})
                ))))

(defn strip-cr [somestr]
  (string/replace somestr "\r" ""))

(defn render-single-test [idx item]
  `(~'deftest ~(symbol (str "test4clj-" idx)) (~'is ~(read-string item))))


(defn render-tests [tests]
  (pp/set-pprint-dispatch pp/code-dispatch)
  (pp/write `(~'?? (do ~@(map-indexed render-single-test tests)) ~'__) :stream nil))


(defn display-vector [title entries]
  (str title " - "
       (string/join ":" entries)))

(defn generate-ns [n]
  (pp/set-pprint-dispatch pp/code-dispatch)
  (pp/write
    `(~'ns ~(symbol (str "offline-4clojure.p" n))
       (:use clojure.test)
       (:use offline-4clojure.core))
    :stream nil))


(defn commnt [somestr]
  (str ";; "
       (string/replace somestr #"\n" "\n;;")))

(defn generate-file [n]
  (let [problem-data (fetch-problem-data n)]

    (string/join "\n"
                 [(commnt (str
                            (problem-data "title")
                            " - "
                            (problem-data "difficulty")))
                  (commnt (strip-cr (problem-data "description")))
                  (commnt (display-vector "tags"
                                          (problem-data "tags")))

                  (commnt (display-vector "restricted"
                                          (problem-data "restricted")))
                  (generate-ns n)
                  ""
                  (render-tests (problem-data "tests"))

                  ])))

(defn write-file [n]
  (println "starting" (format "test/offline_4clojure/p_%03d.clj" n))
  (let [fn (format "test/offline_4clojure/p_%03d.clj" n)]
    (io/make-parents fn)
    (spit fn (generate-file n))
    )
  (println "wrote" (format "test/offline_4clojure/p_%03d.clj" n))
  )

(defn -main
  [& args]
  (doseq [i (range 1 300)]
    (try
       (write-file i)
       (catch Exception e nil))))


