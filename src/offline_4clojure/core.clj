(ns offline-4clojure.core
  (:use clojure.test)
  (:use clojure.pprint)
  (:use clojure.walk)
  (:require [clojure.zip :as zip])
  (:require [offline-4clojure.form-zip :as fz]))

; for editing the tree
(defn fill-in-solution [template solution]
  ; loop/recur durch alle Elemente des Tree, fange mit dem zipseq an, mache dann mit der jeweils nächsten loc weiter.
  (loop [loc (fz/form-zip template)]
    ; Ende? Dann gib den Ergebnisbaum aus
    (if (zip/end? loc)
      (zip/root loc)
      ; Sonst laufe weiter mit dem nächsten Element bzw. mit dem "neuen" Element, das wir erzeugen
      (recur
        ; Nächstes
        (zip/next
          (do
            #_(print "Current: " (zip/node loc) "\n")
            (if (= (zip/node loc) '__)
              (do
                #_(print "Replacing")
                (loop [l loc seq solution]
                  (if (empty? seq)
                    (-> l zip/remove zip/next)
                    (recur (zip/insert-left l (first seq)) (rest seq))
                    )))
              loc)))))))

(defmacro ?? [template & solution]
  #_(print (fill-in-solution template solution))
  (fill-in-solution template solution))

