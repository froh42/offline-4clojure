;; Decurry - Medium
;; Write a function that accepts a curried function of unknown arity <i>n</i>.  Return an equivalent function of <i>n</i> arguments.
;;<br/>
;;You may wish to read <a href="http://en.wikipedia.org/wiki/Currying">this</a>.
;; tags - partial-functions
;; restricted - 
(ns offline-4clojure.p158
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          10
          ((__ (fn [a] (fn [b] (fn [c] (fn [d] (+ a b c d))))))
            1
            2
            3
            4))))
    (deftest
      test4clj-1
      (is
        (=
          24
          ((__ (fn [a] (fn [b] (fn [c] (fn [d] (* a b c d))))))
            1
            2
            3
            4))))
    (deftest
      test4clj-2
      (is (= 25 ((__ (fn [a] (fn [b] (* a b)))) 5 5)))))
  __)