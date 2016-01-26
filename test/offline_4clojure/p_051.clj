;; Advanced Destructuring - Easy
;; Here is an example of some more sophisticated destructuring.
;; tags - destructuring
;; restricted - 
(ns offline-4clojure.p51
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          [1 2 [3 4 5] [1 2 3 4 5]]
          (let [[a b & c :as d] __] [a b c d])))))
  __)