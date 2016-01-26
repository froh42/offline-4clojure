;; Interpose a Seq - Easy
;; Write a function which separates the items of a sequence by an arbitrary value.
;; tags - seqs:core-functions
;; restricted - interpose
(ns offline-4clojure.p40
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 0 [1 2 3]) [1 0 2 0 3])))
    (deftest
      test4clj-1
      (is
        (=
          (apply str (__ ", " ["one" "two" "three"]))
          "one, two, three")))
    (deftest
      test4clj-2
      (is (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))))
  __)