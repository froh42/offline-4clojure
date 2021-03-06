;; Squares Squared - Hard
;; Create a function of two integer arguments: the start and end, respectively.  You must create a vector of strings which renders a 45&deg; rotated square of integers which are successive squares from the start point up to and including the end point.  If a number comprises multiple digits, wrap them around the shape individually.  If there are not enough digits to complete the shape, fill in the rest with asterisk characters.  The direction of the drawing should be clockwise, starting from the center of the shape and working outwards, with the initial direction being down and to the right.
;; tags - data-juggling
;; restricted - 
(ns offline-4clojure.p138
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 2 2) ["2"])))
    (deftest test4clj-1 (is (= (__ 2 4) [" 2 " "* 4" " * "])))
    (deftest test4clj-2 (is (= (__ 3 81) [" 3 " "1 9" " 8 "])))
    (deftest test4clj-3 (is (= (__ 4 20) [" 4 " "* 1" " 6 "])))
    (deftest
      test4clj-4
      (is (= (__ 2 256) ["  6  " " 5 * " "2 2 *" " 6 4 " "  1  "])))
    (deftest
      test4clj-5
      (is
        (=
          (__ 10 10000)
          ["   0   "
           "  1 0  "
           " 0 1 0 "
           "* 0 0 0"
           " * 1 * "
           "  * *  "
           "   *   "]))))
  __)