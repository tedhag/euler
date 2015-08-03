(ns rest-euler.uceuler5
  "Use Case for problem id:5." 
  (:gen-class))

(def divisors 
  (range 1 11))

(defn evenly-divisable? [x]
  (if (= 0
        (reduce + 
          (for [n divisors
            :let [y (mod x n)]
            ;; check for not evenly divisable
            :when (not= y 0)] y))) x))

;;take the second value as the first is 0
(defn smallest-even-divisable []
  (second (filter evenly-divisable? (range))))

(defn solve [id]
  (str "Solved UC " id ": Result is: " 
    ;;(evenly-divisable? 2520)))
    (smallest-even-divisable)))