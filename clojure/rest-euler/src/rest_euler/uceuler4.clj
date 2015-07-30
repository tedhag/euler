(ns rest-euler.uceuler4
  "Use Case for problem id:4." 
  (:gen-class))

;;A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome made from the product of two 3-digit numbers. 

(defn is-palindrome? [n]
    (= (seq (str n)) (reverse (str n))))

(defn palindromes [] 
  (for [x (range 100 1000)
        y (range 100 1000)
        :let [z (* x y)]
        :when (is-palindrome? z)] z))

(defn max-palindrome []
  (reduce max (palindromes)))

(defn solve [id]
  (str "Solved UC " id ": Result is: " (max-palindrome)))