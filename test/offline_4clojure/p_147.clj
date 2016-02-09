;; Pascal's Trapezoid - Easy
;; <p>Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each next one is constructed from the previous following the rules used in <a href="http://en.wikipedia.org/wiki/Pascal's_triangle">Pascal's Triangle</a>. For example, for [3 1 2], the next row is [3 4 3 2].</p>
;;<p>Beware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an arithmetic operator like + and the result is too large to fit into a 64-bit integer, an exception is thrown. You can use +' to indicate that you would rather overflow into Clojure's slower, arbitrary-precision bigint.</p>
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p147
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (second (__ [2 3 2])) [2 5 5 2])))
    (deftest
      test4clj-1
      (is
        (=
          (take 5 (__ [1]))
          [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])))
    (deftest
      test4clj-2
      (is (= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]])))
    (deftest
      test4clj-3
      (is (= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2])))))))
  __)