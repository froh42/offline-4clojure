;; Number Maze - Hard
;; Given a pair of numbers, the start and end point, find a path between the two using only three possible operations:<ul>
;;<li>double</li>
;;<li>halve (odd numbers cannot be halved)</li>
;;<li>add 2</li></ul>
;;
;;Find the shortest path through the "maze". Because there are multiple shortest paths, you must return the length of the shortest path, not the path itself.
;; tags - numbers
;; restricted - 
(ns offline-4clojure.p106
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 1 (__ 1 1))))
    (deftest test4clj-1 (is (= 3 (__ 3 12))))
    (deftest test4clj-2 (is (= 3 (__ 12 3))))
    (deftest test4clj-3 (is (= 3 (__ 5 9))))
    (deftest test4clj-4 (is (= 9 (__ 9 2))))
    (deftest test4clj-5 (is (= 5 (__ 9 12)))))
  __)