;; Map Defaults - Elementary
;; When retrieving values from a map, you can specify default values in case the key is not found:<br/><br/>(= 2 (:foo {:bar 0, :baz 1} 2))<br/><br/>However, what if you want the map itself to contain the default values?  Write a function which takes a default value and a sequence of keys and constructs a map.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p156
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 0 [:a :b :c]) {:a 0, :b 0, :c 0})))
    (deftest
      test4clj-1
      (is (= (__ "x" [1 2 3]) {1 "x", 2 "x", 3 "x"})))
    (deftest
      test4clj-2
      (is (= (__ [:a :b] [:foo :bar]) {:foo [:a :b], :bar [:a :b]}))))
  __)