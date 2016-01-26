;; Pairwise Disjoint Sets - Easy
;; 
;;<p>
;;Given a set of sets, create a function which returns <code>true</code> 
;;if no two of those sets have any elements in common<sup>1</sup> and <code>false</code> otherwise. 
;;Some of the test cases are a bit tricky, so pay a little more attention to them. 
;;</p>
;;
;;<p>
;;<sup>1</sup>Such sets are usually called <i>pairwise disjoint</i> or <i>mutually disjoint</i>.
;;</p>
;;
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p153
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ #{#{\L \P} #{\E \e \R} #{\U} #{\s} #{\.}}) true)))
    (deftest
      test4clj-1
      (is
        (=
          (__
            #{#{:c :b :a} #{:e :c :b :d :a} #{:c :b :d :a} #{:b :a}
              #{:a}})
          false)))
    (deftest
      test4clj-2
      (is
        (=
          (__
            #{#{1 [3 4] 2 [5]} #{[1 2 3] [4 5]} #{4 3 5 [2] [1]}
              #{[3 4 5] [1 2]}})
          true)))
    (deftest
      test4clj-3
      (is
        (=
          (__ #{#{''f ''a ''c} #{'c 'e 'd} #{'b 'a} #{'h 'f 'i 'g}})
          true)))
    (deftest
      test4clj-4
      (is
        (=
          (__
            #{#{#{} #{:z} #{:y :z :x} #{:y :x}}
              #{'(:x :y :z) '(:z) '(:x :y) '()}
              #{'[:x :y :z] [] {} [:x :y] [:z]}})
          false)))
    (deftest
      test4clj-5
      (is
        (=
          (__
            #{#{(symbol "true") 'false}
              #{(keyword "yes") :offline-4clojure.download/no}
              #{:yes :no} #{0 (class 1)} #{false (= "true")}
              #{(class '1) (int \0)}})
          false)))
    (deftest
      test4clj-6
      (is
        (=
          (__
            #{#{#(-> %) #(-> %) #(-> %)} #{distinct?}
              #{#(-> %) #(-> %)} #{#(-> %) #(-> %) #(-> %)}})
          true)))
    (deftest
      test4clj-7
      (is
        (=
          (__
            #{#{contains? set nil? (do)} #{}
              #{mapcat '+ '* (comment mapcat)} #{'mapcat (#(-> *)) +}})
          false))))
  __)