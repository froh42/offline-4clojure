;; Crossword puzzle - Hard
;; Write a function that takes a string and a partially-filled crossword puzzle board, and determines if the input string can be legally placed onto the board.
;;</br></br>
;;
;;The crossword puzzle board consists of a collection of partially-filled rows.  Empty spaces are denoted with an underscore (_), unusable spaces are denoted with a hash symbol (#), and pre-filled spaces have a character in place; the whitespace characters are for legibility and should be ignored.
;;</br></br>
;;For a word to be legally placed on the board:
;;</br>
;;- It may use empty spaces (underscores)
;;</br>
;;- It may use but must not conflict with any pre-filled characters.
;;</br>
;;- It must not use any unusable spaces (hashes).
;;</br>
;;- There must be no empty spaces (underscores) or extra characters before or after the word (the word may be bound by unusable spaces though).
;;</br>
;;- Characters are not case-sensitive. 
;;</br>
;;- Words may be placed vertically (proceeding top-down only), or horizontally (proceeding left-right only).
;; tags - game
;; restricted - 
(ns offline-4clojure.p111
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= true (__ "the" ["_ # _ _ e"]))))
    (deftest
      test4clj-1
      (is (= false (__ "the" ["c _ _ _" "d _ # e" "r y _ _"]))))
    (deftest
      test4clj-2
      (is (= true (__ "joy" ["c _ _ _" "d _ # e" "r y _ _"]))))
    (deftest
      test4clj-3
      (is (= false (__ "joy" ["c o n j" "_ _ y _" "r _ _ #"]))))
    (deftest
      test4clj-4
      (is
        (=
          true
          (__
            "clojure"
            ["_ _ _ # j o y" "_ _ o _ _ _ _" "_ _ f _ # _ _"])))))
  __)