;; Local bindings - Elementary
;; Clojure lets you give local names to values using the special let-form.
;; tags - syntax
;; restricted - 
(ns offline-4clojure.p35
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ (let [x 5] (+ 2 x)))))
    (deftest test4clj-1 (is (= __ (let [x 3 y 10] (- y x)))))
    (deftest test4clj-2 (is (= __ (let [x 21] (let [y 3] (/ x y)))))))
  __)