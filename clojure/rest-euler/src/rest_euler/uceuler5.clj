(ns rest-euler.uceuler5
  "Use Case for problem id:5." 
  (:gen-class))

;; Solved using LCM - Least Common Multiple

;; gcd - greatest common divisor (using Euclid's algorithm)
;; gcd(a,b) = gcd(b, a mod b)
;; To compute gcd(48,18), divide 48 by 18 to 
;, get a quotient of 2 and a remainder of 12.
;; Then divide 18 by 12 to get a quotient of 1 
;; and a remainder of 6. 
;; Then divide 12 by 6 to get a remainder of 0, 
;; which means that 6 is the gcd.
;; The if-statement is not necessary when there are
;; no 'zeros' 
(defn gcd [a b] 
  (if (zero? b) a (recur b (mod a b))))

;; lcm = a*b / gcd(a,b)
(defn lcm [a b] (/ (* a b) (gcd a b)))

(defn smallest-even-divisable [] 
  (reduce #(lcm %1 %2) (range 1 21)))

(defn solve [id]
  (str "Solved UC " id ": Result is: " 
    (smallest-even-divisable)))