;; Sets: conj - Elementary
;; When operating on a set, the conj function returns a new set with one or more keys "added".
;; tags - 
;; restricted - 
(ns offline-4clojure.p9
  (:use clojure.test)
  (:use offline-4clojure.core))

(?? (do (deftest test4clj-0 (is (= #{1 4 3 2} (conj #{1 4 3} __))))) 2)