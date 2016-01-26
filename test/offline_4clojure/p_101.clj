;; Levenshtein Distance - Hard
;; Given two sequences x and y, calculate the <a href="https://secure.wikimedia.org/wikipedia/en/wiki/Levenshtein_distance">Levenshtein distance</a> of x and y, i. e. the minimum number of edits needed to transform x into y.  The allowed edits are:<br/><br/>- insert a single item<br/>- delete a single item<br/>- replace a single item with another item<br/><br/>WARNING: Some of the test cases may timeout if you write an inefficient solution!
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p101
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ "kitten" "sitting") 3)))
    (deftest
      test4clj-1
      (is (= (__ "closure" "clojure") (__ "clojure" "closure") 1)))
    (deftest test4clj-2 (is (= (__ "xyx" "xyyyx") 2)))
    (deftest test4clj-3 (is (= (__ "" "123456") 6)))
    (deftest
      test4clj-4
      (is (= (__ "Clojure" "Clojure") (__ "" "") (__ [] []) 0)))
    (deftest test4clj-5 (is (= (__ [1 2 3 4] [0 2 3 4 5]) 2)))
    (deftest test4clj-6 (is (= (__ '(:a :b :c :d) '(:a :d)) 2)))
    (deftest
      test4clj-7
      (is (= (__ "ttttattttctg" "tcaaccctaccat") 10)))
    (deftest
      test4clj-8
      (is (= (__ "gaattctaatctc" "caaacaaaaaattt") 9))))
  __)