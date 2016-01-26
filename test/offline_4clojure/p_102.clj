;; intoCamelCase - Medium
;; When working with java, you often need to create an object with <code>fieldsLikeThis</code>, but you'd rather work with a hashmap that has <code>:keys-like-this</code> until it's time to convert. Write a function which takes lower-case hyphen-separated strings and converts them to camel-case strings.
;; tags - strings
;; restricted - 
(ns offline-4clojure.p102
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ "something") "something")))
    (deftest test4clj-1 (is (= (__ "multi-word-key") "multiWordKey")))
    (deftest test4clj-2 (is (= (__ "leaveMeAlone") "leaveMeAlone"))))
  __)