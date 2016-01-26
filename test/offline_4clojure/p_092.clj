;; Read Roman numerals - Hard
;; Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function to parse a Roman-numeral string and return the number it represents.
;;<br /><br />
;;You can assume that the input will be well-formed, in upper-case, and follow the <a href="http://en.wikipedia.org/wiki/Roman_numerals#Subtractive_principle">subtractive principle</a>. You don't need to handle any numbers greater than MMMCMXCIX (3999), the largest number representable with ordinary letters.
;; tags - strings:math
;; restricted - 
(ns offline-4clojure.p92
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 14 (__ "XIV"))))
    (deftest test4clj-1 (is (= 827 (__ "DCCCXXVII"))))
    (deftest test4clj-2 (is (= 3999 (__ "MMMCMXCIX"))))
    (deftest test4clj-3 (is (= 48 (__ "XLVIII")))))
  __)