;; Cartesian Product - Easy
;; Write a function which calculates the <a href="http://en.wikipedia.org/wiki/Cartesian_product"> Cartesian product</a> of two sets.
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p90
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          (__
            #{"queen" "king" "ace"}
            #{"&#9827;" "&#9824;" "&#9830;" "&#9829;"})
          #{["king" "&#9829;"] ["ace" "&#9829;"] ["ace" "&#9830;"]
            ["king" "&#9824;"] ["ace" "&#9827;"] ["queen" "&#9829;"]
            ["ace" "&#9824;"] ["king" "&#9830;"] ["queen" "&#9827;"]
            ["queen" "&#9830;"] ["king" "&#9827;"]
            ["queen" "&#9824;"]})))
    (deftest
      test4clj-1
      (is
        (=
          (__ #{1 3 2} #{4 5})
          #{[2 5] [3 4] [1 4] [1 5] [2 4] [3 5]})))
    (deftest
      test4clj-2
      (is
        (=
          300
          (count (__ (into #{} (range 10)) (into #{} (range 30))))))))
  __)