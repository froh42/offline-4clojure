;; Parentheses... Again - Medium
;; <p>In a family of languages like Lisp, having balanced parentheses is a defining feature of the language. Luckily, Lisp has almost no syntax, except for these "delimiters" -- and that hardly qualifies as "syntax", at least in any useful computer programming sense.</p>
;;
;;<p>It is not a difficult exercise to find all the combinations of well-formed parentheses if we only have N pairs to work with. For instance, if we only have 2 pairs, we only have two possible combinations: "()()" and "(())". Any other combination of length 4 is ill-formed. Can you see why? </p>
;;
;;<p>Generate all possible combinations of well-formed parentheses of length <code>2n</code> (n pairs of parentheses).
;;For this problem, we only consider '(' and ')', but the answer is similar if you work with only {} or only [].</p>
;;
;;<p>There is an interesting pattern in the numbers!</p>
;; tags - math:combinatorics
;; restricted - 
(ns offline-4clojure.p195
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          [#{""} #{"()"} #{"(())" "()()"}]
          (map (fn [n] (__ n)) [0 1 2]))))
    (deftest
      test4clj-1
      (is (= #{"(()())" "((()))" "()()()" "()(())" "(())()"} (__ 3))))
    (deftest test4clj-2 (is (= 16796 (count (__ 10)))))
    (deftest
      test4clj-3
      (is
        (=
          (nth (sort (filter #(.contains % "(()()()())") (__ 9))) 6)
          "(((()()()())(())))")))
    (deftest
      test4clj-4
      (is (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))"))))
  __)