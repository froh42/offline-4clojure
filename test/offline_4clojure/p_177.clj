;;; Balancing Brackets - Medium
;;; When parsing a snippet of code it's often a good idea to do a sanity check to see if all the brackets match up. Write a function that takes in a string and returns truthy if all square [ ] round ( ) and curly { } brackets are properly paired and legally nested, or returns falsey otherwise.
;;; tags - parsing
;;; restricted -
;(ns offline-4clojure.p177
;  (:use clojure.test)
;  (:use offline-4clojure.core))
;
;(??
;  (do
;    (deftest test4clj-0 (is (__ "This string has no brackets.")))
;    (deftest
;      test4clj-1
;      (is
;        (__
;          "class Test {\r\n      public static void main(String[] args) {\r\n        System.out.println(\"Hello world.\");\r\n      }\r\n    }")))
;    (deftest test4clj-2 (is (not (__ "(start, end]"))))
;    (deftest test4clj-3 (is (not (__ "())"))))
;    (deftest test4clj-4 (is (not (__ "[ { ] } "))))
;    (deftest
;      test4clj-5
;      (is (__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")))
;    (deftest
;      test4clj-6
;      (is
;        (not
;          (__
;            "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))))
;    (deftest test4clj-7 (is (not (__ "[")))))
;  __)