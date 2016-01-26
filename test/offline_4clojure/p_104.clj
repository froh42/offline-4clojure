;; Write Roman Numerals - Medium
;; This is the inverse of <a href='92'>Problem 92</a>, but much easier. Given an integer smaller than 4000, return the corresponding roman numeral in uppercase, adhering to the <a href='http://www.numericana.com/answer/roman.htm#valid'>subtractive principle</a>.
;; tags - strings:math
;; restricted - 
(ns offline-4clojure.p104
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= "I" (__ 1))))
    (deftest test4clj-1 (is (= "XXX" (__ 30))))
    (deftest test4clj-2 (is (= "IV" (__ 4))))
    (deftest test4clj-3 (is (= "CXL" (__ 140))))
    (deftest test4clj-4 (is (= "DCCCXXVII" (__ 827))))
    (deftest test4clj-5 (is (= "MMMCMXCIX" (__ 3999))))
    (deftest test4clj-6 (is (= "XLVIII" (__ 48)))))
  __)