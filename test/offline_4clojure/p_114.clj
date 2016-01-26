;; Global take-while - Medium
;; <p><a
;;href="http://clojuredocs.org/clojure_core/clojure.core/take-while">take-while</a>
;;is great for filtering sequences, but it limited: you can only examine
;;a single item of the sequence at a time. What if you need to keep
;;track of some state as you go over the sequence?</p>
;;
;;<p>Write a function which accepts an integer <code>n</code>, a predicate <code>p</code>, and a sequence. It should return a lazy sequence of items in the list up to, but not including, the <code>n</code>th item that satisfies the predicate.</p>
;; tags - seqs:higher-order-functions
;; restricted - 
(ns offline-4clojure.p114
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          [2 3 5 7 11 13]
          (__ 4 #(= 2 (mod % 3)) [2 3 5 7 11 13 17 19 23]))))
    (deftest
      test4clj-1
      (is
        (=
          ["this" "is" "a" "sentence"]
          (__
            3
            #(some #{\i} %)
            ["this" "is" "a" "sentence" "i" "wrote"]))))
    (deftest
      test4clj-2
      (is
        (=
          ["this" "is"]
          (__ 1 #{"a"} ["this" "is" "a" "sentence" "i" "wrote"])))))
  __)