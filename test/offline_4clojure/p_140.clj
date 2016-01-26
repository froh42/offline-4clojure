;; Veitch, Please! - Hard
;; Create a function which accepts as input a boolean algebra function in the form of a set of sets, where the inner sets are collections of symbols corresponding to the input boolean variables which satisfy the function (the inputs of the inner sets are conjoint, and the sets themselves are disjoint... also known as canonical minterms).  Note:&nbsp;capitalized symbols represent truth, and lower-case symbols represent negation of the inputs.  Your function must return the minimal function which is logically equivalent to the input.
;;</br></br>
;;PS &mdash; You may want to give this a read before proceeding: <a href="http://en.wikipedia.org/wiki/K_map">K-Maps</a>
;; tags - math:circuit-design
;; restricted - 
(ns offline-4clojure.p140
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          (__
            #{#{'A 'B 'C 'd} #{'B 'C 'a 'd} #{'A 'B 'c 'd}
              #{'A 'C 'b 'd} #{'A 'C 'b 'D} #{'A 'b 'c 'd}
              #{'A 'b 'c 'D} #{'A 'B 'c 'D}})
          #{#{'A 'c} #{'A 'b} #{'B 'C 'd}})))
    (deftest
      test4clj-1
      (is (= (__ #{#{'A 'B 'C 'd} #{'A 'B 'C 'D}}) #{#{'A 'B 'C}})))
    (deftest
      test4clj-2
      (is
        (=
          (__
            #{#{'b 'c 'a 'd} #{'B 'c 'a 'd} #{'b 'c 'a 'D}
              #{'A 'B 'C 'd} #{'A 'C 'b 'd} #{'A 'C 'b 'D}
              #{'B 'c 'a 'D} #{'A 'B 'C 'D}})
          #{#{'c 'a} #{'A 'C}})))
    (deftest
      test4clj-3
      (is
        (=
          (__ #{#{'C 'b 'a} #{'B 'C 'a} #{'B 'c 'a} #{'b 'c 'a}})
          #{#{'a}})))
    (deftest
      test4clj-4
      (is
        (=
          (__
            #{#{'B 'c 'a 'd} #{'b 'c 'a 'D} #{'A 'B 'C 'd}
              #{'A 'C 'b 'D} #{'B 'C 'a 'D} #{'A 'B 'c 'D}})
          #{#{'B 'c 'a 'd} #{'b 'c 'a 'D} #{'A 'B 'C 'd} #{'A 'C 'b 'D}
            #{'B 'C 'a 'D} #{'A 'B 'c 'D}})))
    (deftest
      test4clj-5
      (is
        (=
          (__
            #{#{'b 'c 'a 'd} #{'B 'c 'a 'd} #{'b 'c 'a 'D}
              #{'A 'B 'c 'd} #{'B 'c 'a 'D} #{'A 'B 'c 'D}})
          #{#{'c 'a} #{'B 'c}})))
    (deftest
      test4clj-6
      (is
        (=
          (__
            #{#{'B 'c 'a 'd} #{'b 'c 'a 'D} #{'A 'B 'C 'd}
              #{'B 'C 'a 'd} #{'A 'B 'c 'd} #{'A 'C 'b 'D}
              #{'A 'b 'c 'D} #{'C 'b 'a 'D}})
          #{#{'B 'd} #{'b 'D}})))
    (deftest
      test4clj-7
      (is
        (=
          (__
            #{#{'b 'c 'a 'd} #{'A 'C 'b 'd} #{'C 'b 'a 'd}
              #{'A 'b 'c 'd} #{'B 'C 'a 'D} #{'B 'c 'a 'D}
              #{'A 'B 'c 'D} #{'A 'B 'C 'D}})
          #{#{'b 'd} #{'B 'D}}))))
  __)