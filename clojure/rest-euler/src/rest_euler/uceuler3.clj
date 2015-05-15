(ns rest-euler.uceuler3
  "Use Case for problem id:3." 
  (:gen-class))


;; There is of course a way to generate a lazy-list of infinte prime numbers, 
;; but that is to be solved later...
(def primes 
  ;; reduce is used as (reduce f val coll). 
  ;; val is supplied as [2], returns the 
  ;; result of applying f to val and the first item in coll, then 
  ;; applying f to that result and the 2nd item, etc.
  (reduce
    ;;First argument as an anonymus function
    ;;Takes the primes and the next increased number as args
    (fn [primes number]
      ;; checks if the number modulo with so far found primes is zero
      ;; partial modulo with number is map(-ped) with all primes
      (if (some zero? (map (partial mod number) primes))
        primes
        ;; if found adds to primes
        (conj primes number))) 
    ;;Second argument as val, the vector to place the primes
    [2]
    ;; Third argument as coll, generating all numbers from 3
    ;; and take(ing) the 10000 first, that should be enough
    (take 10000 (iterate inc 3))))

(defn prime-factors [n]
  ;; Using filter (filter pred coll). 
  ;; Returns a lazy sequence of the items in coll for which (pred item) returns true.   
  (filter
    ;; 'pred' 
    ;; Anonymus function that filter if the reminder
    ;; for n divided by % is zero, i.e. evenly divided by take-while input
    ;; (Perfect square numbers)
    #(zero? (rem n %))
    ;; 'coll'
    ;; From the primes collection we use take-while (take-while pred coll)
    ;; Using an anonymus function that gives all primes multiplied with it self
    ;; and that are less than n 
    ;; (Perfect Squares at http://en.wikipedia.org/wiki/Prime_factor)
    (take-while #(> n (* % %)) primes)))

(defn largest_prime_factor [n] 
  (reduce max (prime-factors n)))

(defn solve [id]
  (str "Solved UC " id ": Result is: " (largest_prime_factor 600851475143)))