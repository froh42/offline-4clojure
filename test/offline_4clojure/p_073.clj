;; Analyze a Tic-Tac-Toe Board - Hard
;; A <a href="http://en.wikipedia.org/wiki/Tic-tac-toe">tic-tac-toe</a> board is represented by a two dimensional vector. X is represented by :x, O is represented by :o, and empty is represented by :e.  A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row.  Write a function which analyzes a tic-tac-toe board and returns :x if X has won, :o if O has won, and nil if neither player has won.
;; tags - game
;; restricted - 
(ns offline-4clojure.p73
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= nil (__ [[:e :e :e] [:e :e :e] [:e :e :e]]))))
    (deftest
      test4clj-1
      (is (= :x (__ [[:x :e :o] [:x :e :e] [:x :e :o]]))))
    (deftest
      test4clj-2
      (is (= :o (__ [[:e :x :e] [:o :o :o] [:x :e :x]]))))
    (deftest
      test4clj-3
      (is (= nil (__ [[:x :e :o] [:x :x :e] [:o :x :o]]))))
    (deftest
      test4clj-4
      (is (= :x (__ [[:x :e :e] [:o :x :e] [:o :e :x]]))))
    (deftest
      test4clj-5
      (is (= :o (__ [[:x :e :o] [:x :o :e] [:o :e :x]]))))
    (deftest
      test4clj-6
      (is (= nil (__ [[:x :o :x] [:x :o :x] [:o :x :o]])))))
  __)