;; Hello World - Elementary
;; Write a function which returns a personalized greeting.
;; tags - 
;; restricted - 
(ns offline-4clojure.p16
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ "Dave") "Hello, Dave!")))
    (deftest test4clj-1 (is (= (__ "Jenn") "Hello, Jenn!")))
    (deftest test4clj-2 (is (= (__ "Rhea") "Hello, Rhea!"))))
  __)