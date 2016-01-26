;; For Science! - Hard
;; A mad scientist with tenure has created an experiment tracking mice in a maze.  Several mazes have been randomly generated, and you've been tasked with writing a program to determine the mazes in which it's possible for the mouse to reach the cheesy endpoint.  Write a function which accepts a maze in the form of a collection of rows, each row is a string where:
;;<ul>
;;<li>spaces represent areas where the mouse can walk freely</li>
;;<li>hashes (#) represent walls where the mouse can not walk</li>
;;<li>M represents the mouse's starting point</li>
;;<li>C represents the cheese which the mouse must reach</li>
;;</ul>
;;The mouse is not allowed to travel diagonally in the maze (only up/down/left/right), nor can he escape the edge of the maze.  Your function must return true iff the maze is solvable by the mouse.
;; tags - game
;; restricted - 
(ns offline-4clojure.p117
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= true (__ ["M   C"]))))
    (deftest test4clj-1 (is (= false (__ ["M # C"]))))
    (deftest
      test4clj-2
      (is
        (=
          true
          (__ ["#######" "#     #" "#  #  #" "#M # C#" "#######"]))))
    (deftest
      test4clj-3
      (is
        (=
          false
          (__
            ["########"
             "#M  #  #"
             "#   #  #"
             "# # #  #"
             "#   #  #"
             "#  #   #"
             "#  # # #"
             "#  #   #"
             "#  #  C#"
             "########"]))))
    (deftest
      test4clj-4
      (is
        (=
          false
          (__
            ["M     " "      " "      " "      " "    ##" "    #C"]))))
    (deftest
      test4clj-5
      (is
        (=
          true
          (__ ["C######" " #     " " #   # " " #   #M" "     # "]))))
    (deftest
      test4clj-6
      (is
        (=
          true
          (__
            ["C# # # #"
             "        "
             "# # # # "
             "        "
             " # # # #"
             "        "
             "# # # #M"])))))
  __)