;; Language of a DFA - Hard
;; A <a href="http://en.wikipedia.org/wiki/Deterministic_finite_automaton">deterministic finite automaton (DFA)</a> is an abstract machine that recognizes a <a href=" http://en.wikipedia.org/wiki/Regular_language">regular language</a>. Usually a DFA is defined by a 5-tuple, but instead we'll use a map with 5 keys:
;;
;;<ul>
;;<li><var>:states</var> is the set of states for the DFA.</li>
;;<li><var>:alphabet</var> is the set of symbols included in the language recognized by the DFA. </li>
;;<li><var>:start</var> is the start state of the DFA. </li>
;;<li><var>:accepts</var> is the set of accept states in the DFA. </li>
;;<li><var>:transitions</var> is the transition function for the DFA, mapping <var>:states</var> &#x2a2f <var>:alphabet</var> onto <var>:states</var>.</li>
;;</ul>
;;
;;Write a function that takes as input a DFA definition (as described above) and returns a sequence enumerating all strings in the language recognized by the DFA.
;;
;;Note: Although the DFA itself is finite and only recognizes finite-length strings it can still recognize an infinite set of finite-length strings. And because stack space is finite, make sure you don't get stuck in an infinite loop that's not producing results every so often!
;; tags - automata:seqs
;; restricted - 
(ns offline-4clojure.p164
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          #{"ab" "a" "abc"}
          (set
            (__
              '{:states #{q1 q3 q0 q2},
                :alphabet #{a c b},
                :start q0,
                :accepts #{q1 q3 q2},
                :transitions {q0 {a q1}, q1 {b q2}, q2 {c q3}}})))))
    (deftest
      test4clj-1
      (is
        (=
          #{"hello" "hi" "hey"}
          (set
            (__
              '{:states #{q4 q1 q3 q0 q7 q2 q5 q6},
                :alphabet #{i y o e l h},
                :start q0,
                :accepts #{q4 q7 q2},
                :transitions
                {q0 {h q1},
                 q1 {i q2, e q3},
                 q3 {l q5, y q4},
                 q5 {l q6},
                 q6 {o q7}}})))))
    (deftest
      test4clj-2
      (is
        (=
          (set
            (let [ss "vwxyz"]
              (for [i ss j ss k ss l ss] (str i j k l))))
          (set
            (__
              '{:states #{q4 q1 q3 q0 q2},
                :alphabet #{x y v w z},
                :start q0,
                :accepts #{q4},
                :transitions
                {q0 {v q1, w q1, x q1, y q1, z q1},
                 q1 {v q2, w q2, x q2, y q2, z q2},
                 q2 {v q3, w q3, x q3, y q3, z q3},
                 q3 {v q4, w q4, x q4, y q4, z q4}}})))))
    (deftest
      test4clj-3
      (is
        (let [res (take
                    2000
                    (__
                      '{:states #{q1 q0},
                        :alphabet #{0 1},
                        :start q0,
                        :accepts #{q0},
                        :transitions
                        {q0 {0 q0, 1 q1}, q1 {0 q1, 1 q0}}}))]
          (and
            (every? (partial re-matches #"0*(?:10*10*)*") res)
            (= res (distinct res))))))
    (deftest
      test4clj-4
      (is
        (let [res (take
                    2000
                    (__
                      '{:states #{q1 q0},
                        :alphabet #{n m},
                        :start q0,
                        :accepts #{q1},
                        :transitions {q0 {n q0, m q1}}}))]
          (and
            (every? (partial re-matches #"n*m") res)
            (= res (distinct res))))))
    (deftest
      test4clj-5
      (is
        (let [res (take
                    2000
                    (__
                      '{:states #{q4 q1 q3 q9 q0 q7 q2 q8 q5 q6},
                        :alphabet #{t i p o m l},
                        :start q0,
                        :accepts #{q8 q5},
                        :transitions
                        {q4 {t q5},
                         q1 {i q2, o q6},
                         q3 {i q4},
                         q9 {o q6},
                         q0 {l q1},
                         q7 {p q8},
                         q2 {m q3},
                         q8 {l q9},
                         q6 {o q7}}}))]
          (and
            (every? (partial re-matches #"limit|(?:loop)+") res)
            (= res (distinct res)))))))
  __)