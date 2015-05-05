(ns rest-euler.uceuler1
  "Use Case for problem id:1"
  (:gen-class))

(def numbers (range 1000))

(defn multiples-of-3-and-5 []
(reduce + 
  (for [n numbers 
        :let [m3 (mod n 3) 
              m5 (mod n 5)]
        :when (or (= m3 0) (= m5 0))] n)))

(defn solve [id]
(str "Solved UC " id ": Result is: " 
  (multiples-of-3-and-5)))