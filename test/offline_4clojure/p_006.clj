;; Intro to Vectors - Elementary
;; Vectors can be constructed several ways.  You can compare them with lists.
;;<br/><br/><b>Note</b>: the brackets [] surrounding the blanks __ are part of the test case.
;; tags - 
;; restricted - 
(ns offline-4clojure.p6
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))
  __)