;; Love Triangle - Hard
;; Everyone loves triangles, and it's easy to understand why&mdash;they're so wonderfully symmetric (except scalenes, they suck).
;;<br/><br/>
;;Your passion for triangles has led you to become a miner (and part-time Clojure programmer) where you work all day to chip out isosceles-shaped minerals from rocks gathered in a nearby open-pit mine.  There are too many rocks coming from the mine to harvest them all so you've been tasked with writing a program to analyze the mineral patterns of each rock, and determine which rocks have the biggest minerals.
;;<br/><br/>
;;Someone has already written a <a href="http://en.wikipedia.org/wiki/Computer_vision">computer-vision</a> system for the mine.  It images each rock as it comes into the processing centre and creates a cross-sectional <a href="http://en.wikipedia.org/wiki/Bit_array">bitmap</a> of mineral (1) and rock (0) concentrations for each one.
;;<br/><br/>
;;You must now create a function which accepts a collection of integers, each integer when read in base-2 gives the bit-representation of the rock (again, 1s are mineral and 0s are worthless scalene-like rock).  You must return the cross-sectional area of the largest harvestable mineral from the input rock, as follows:
;;<br>
;;<ul>
;;<li>The minerals only have smooth faces when sheared vertically or horizontally from the rock's cross-section</li>
;;<li>The mine is only concerned with harvesting isosceles triangles (such that one or two sides can be sheared)</li>
;;<li>If only one face of the mineral is sheared, its opposing vertex must be a point (ie. the smooth face must be of odd length), and its two equal-length sides must intersect the shear face at 45&deg; (ie. those sides must cut even-diagonally)</li>
;;<li>The harvested mineral may not contain any traces of rock</li>
;;<li>The mineral may lie in any orientation in the plane</li>
;;<li>Area should be calculated as the sum of 1s that comprise the mineral</li>
;;<li>Minerals must have a minimum of three measures of area to be harvested</li>
;;<li>If no minerals can be harvested from the rock, your function should return nil</li>
;;</ul>
;; tags - search:data-juggling
;; restricted - 
(ns offline-4clojure.p127
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 10 (__ [15 15 15 15 15]))))
    (deftest test4clj-1 (is (= 15 (__ [1 3 7 15 31]))))
    (deftest test4clj-2 (is (= 3 (__ [3 3]))))
    (deftest test4clj-3 (is (= 4 (__ [7 3]))))
    (deftest test4clj-4 (is (= 6 (__ [17 22 6 14 22]))))
    (deftest test4clj-5 (is (= 9 (__ [18 7 14 14 6 3]))))
    (deftest test4clj-6 (is (= nil (__ [21 10 21 10]))))
    (deftest test4clj-7 (is (= nil (__ [0 31 0 31 0])))))
  __)