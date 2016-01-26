;; Intro to Reduce - Elementary
;; <a href='http://clojuredocs.org/clojure_core/clojure.core/reduce'>Reduce</a> takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p64
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 15 (reduce __ [1 2 3 4 5]))))
    (deftest test4clj-1 (is (= 0 (reduce __ []))))
    (deftest test4clj-2 (is (= 6 (reduce __ 1 [2 3])))))
  __)