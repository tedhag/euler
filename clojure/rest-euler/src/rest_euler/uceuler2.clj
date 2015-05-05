(ns rest-euler.uceuler2
  "Use Case for problem id:2"
  (:gen-class))

(def fibonacci 
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn even_fibonacci [] 
  (reduce + 
    (for [n fibonacci 
          :let [m2 (mod n 2)]
          :when (= m2 0)
          :while (< n 4000000)] n)))

(defn solve [id]
  (str "Solved UC " id ": Result is: " 
    (even_fibonacci)))