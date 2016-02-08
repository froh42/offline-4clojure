;; The Big Divide - Medium
;; <p>Write a function which calculates the sum of all natural numbers under <i>n</i> (first argument) which are evenly divisible by at least one of <i>a</i> and <i>b</i> (second and third argument). Numbers <i>a</i> and <i>b</i> are guaranteed to be <a href="http://en.wikipedia.org/wiki/Coprime">coprimes</a>.</p>
;;
;;<p>Note: Some test cases have a very large <i>n</i>, so the most obvious solution will exceed the time limit.</p>
;; tags - math
;; restricted - 
(ns offline-4clojure.p148
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 0 (__ 3 17 11))))
    (deftest test4clj-1 (is (= 23 (__ 10 3 5))))
    (deftest test4clj-2 (is (= 233168 (__ 1000 3 5))))
    (deftest
      test4clj-3
      (is (= "2333333316666668" (str (__ 100000000 3 5)))))
    (deftest
      test4clj-4
      (is
        (=
          "110389610389889610389610"
          (str (__ (* 10000 10000 10000) 7 11)))))
    (deftest
      test4clj-5
      (is
        (=
          "1277732511922987429116"
          (str (__ (* 10000 10000 10000) 757 809)))))
    (deftest
      test4clj-6
      (is
        (=
          "4530161696788274281"
          (str (__ (* 10000 10000 1000) 1597 3571))))))
  __)