;; Best Hand - Hard
;; <p>Following on from <a href="http://www.4clojure.com/problem/128">Recognize Playing Cards</a>, determine the best poker hand that can be made with five cards. The hand rankings are listed below for your convenience.</p>
;;
;;<ol>
;;  <li>Straight flush: All cards in the same suit, and in sequence</li>
;;  <li>Four of a kind: Four of the cards have the same rank</li>
;;  <li>Full House: Three cards of one rank, the other two of another rank</li>
;;  <li>Flush: All cards in the same suit</li>
;;  <li>Straight: All cards in sequence (aces can be high or low, but not both at once)</li>
;;  <li>Three of a kind: Three of the cards have the same rank</li>
;;  <li>Two pair: Two pairs of cards have the same rank</li>
;;  <li>Pair: Two cards have the same rank</li>
;;  <li>High card: None of the above conditions are met</li>
;;</ol>
;; tags - strings:game
;; restricted - 
(ns offline-4clojure.p178
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= :high-card (__ ["HA" "D2" "H3" "C9" "DJ"]))))
    (deftest test4clj-1 (is (= :pair (__ ["HA" "HQ" "SJ" "DA" "HT"]))))
    (deftest
      test4clj-2
      (is (= :two-pair (__ ["HA" "DA" "HQ" "SQ" "HT"]))))
    (deftest
      test4clj-3
      (is (= :three-of-a-kind (__ ["HA" "DA" "CA" "HJ" "HT"]))))
    (deftest
      test4clj-4
      (is (= :straight (__ ["HA" "DK" "HQ" "HJ" "HT"]))))
    (deftest
      test4clj-5
      (is (= :straight (__ ["HA" "H2" "S3" "D4" "C5"]))))
    (deftest
      test4clj-6
      (is (= :flush (__ ["HA" "HK" "H2" "H4" "HT"]))))
    (deftest
      test4clj-7
      (is (= :full-house (__ ["HA" "DA" "CA" "HJ" "DJ"]))))
    (deftest
      test4clj-8
      (is (= :four-of-a-kind (__ ["HA" "DA" "CA" "SA" "DJ"]))))
    (deftest
      test4clj-9
      (is (= :straight-flush (__ ["HA" "HK" "HQ" "HJ" "HT"])))))
  __)