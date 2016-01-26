;; Read a binary number - Easy
;; Convert a binary number, provided in the form of a string, to its numerical value.
;; tags - 
;; restricted - 
(ns offline-4clojure.p122
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 0 (__ "0"))))
    (deftest test4clj-1 (is (= 7 (__ "111"))))
    (deftest test4clj-2 (is (= 8 (__ "1000"))))
    (deftest test4clj-3 (is (= 9 (__ "1001"))))
    (deftest test4clj-4 (is (= 255 (__ "11111111"))))
    (deftest test4clj-5 (is (= 1365 (__ "10101010101"))))
    (deftest test4clj-6 (is (= 65535 (__ "1111111111111111")))))
  __)