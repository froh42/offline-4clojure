;; Palindrome Detector - Easy
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;                Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p27
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (false? (__ '(1 2 3 4 5)))))
    (deftest test4clj-1 (is (true? (__ "racecar"))))
    (deftest test4clj-2 (is (true? (__ [:foo :bar :foo]))))
    (deftest test4clj-3 (is (true? (__ '(1 1 3 3 1 1)))))
    (deftest test4clj-4 (is (false? (__ '(:a :b :c))))))
  __)