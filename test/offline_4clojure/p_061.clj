;; Map Construction - Easy
;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;; tags - core-functions
;; restricted - zipmap
(ns offline-4clojure.p61
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})))
    (deftest
      test4clj-1
      (is
        (=
          (__ [1 2 3 4] ["one" "two" "three"])
          {1 "one", 2 "two", 3 "three"})))
    (deftest
      test4clj-2
      (is
        (=
          (__ [:foo :bar] ["foo" "bar" "baz"])
          {:foo "foo", :bar "bar"}))))
  __)