;; A nil key - Elementary
;; Write a function which, given a key and map, returns true <a href="http://en.wikipedia.org/wiki/If_and_only_if">iff</a> the map contains an entry with that key and its value is nil.
;; tags - maps
;; restricted - 
(ns offline-4clojure.p134
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (true? (__ :a {:a nil, :b 2}))))
    (deftest test4clj-1 (is (false? (__ :b {:a nil, :b 2}))))
    (deftest test4clj-2 (is (false? (__ :c {:a nil, :b 2})))))
  __)