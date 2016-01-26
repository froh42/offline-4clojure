;; Get the Caps - Easy
;; Write a function which takes a string and returns a new string containing only the capital letters.
;; tags - strings
;; restricted - 
(ns offline-4clojure.p29
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ "HeLlO, WoRlD!") "HLOWRD")))
    (deftest test4clj-1 (is (empty? (__ "nothing"))))
    (deftest test4clj-2 (is (= (__ "$#A(*&987Zf") "AZ"))))
  __)