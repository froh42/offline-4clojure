;; Transitive Closure - Hard
;; Write a function which generates the <a href="http://en.wikipedia.org/wiki/Transitive_closure">transitive closure</a> of a <a href="http://en.wikipedia.org/wiki/Binary_relation">binary relation</a>.  The relation will be represented as a set of 2 item vectors.
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p84
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (let [divides #{[27 9] [8 4] [4 2] [9 3]}]
          (= (__ divides) #{[27 9] [27 3] [8 4] [4 2] [9 3] [8 2]}))))
    (deftest
      test4clj-1
      (is
        (let [more-legs #{["man" "snake"] ["cat" "man"]
                          ["spider" "cat"]}]
          (=
            (__ more-legs)
            #{["man" "snake"] ["spider" "man"] ["cat" "man"]
              ["cat" "snake"] ["spider" "snake"] ["spider" "cat"]}))))
    (deftest
      test4clj-2
      (is
        (let [progeny #{["son" "grandson"] ["uncle" "cousin"]
                        ["father" "son"]}]
          (=
            (__ progeny)
            #{["son" "grandson"] ["uncle" "cousin"] ["father" "son"]
              ["father" "grandson"]})))))
  __)