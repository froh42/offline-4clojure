;; Comparisons - Easy
;; For any orderable data type it's possible to derive all of the basic comparison operations (&lt;, &le;, =, &ne;, &ge;, and &gt;) from a single operation (any operator but = or &ne; will work). Write a function that takes three arguments, a <var>less than</var> operator for the data and two items to compare. The function should return a keyword describing the relationship between the two items. The keywords for the relationship between <var>x</var> and <var>y</var> are as follows:
;;
;;<ul>
;;<li><var>x</var> = <var>y</var> &rarr; :eq</li>
;;<li><var>x</var> &gt; <var>y</var> &rarr; :gt</li>
;;<li><var>x</var> &lt; <var>y</var> &rarr; :lt</li>
;;</ul>
;; tags - 
;; restricted - 
(ns offline-4clojure.p166
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= :gt (__ < 5 1))))
    (deftest
      test4clj-1
      (is
        (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum"))))
    (deftest
      test4clj-2
      (is (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3))))
    (deftest test4clj-3 (is (= :gt (__ > 0 2)))))
  __)