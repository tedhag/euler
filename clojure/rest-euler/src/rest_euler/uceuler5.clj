(ns rest-euler.uceuler5
  "Use Case for problem id:5." 
  (:gen-class))

(defn solve [id]
  (str "Solved UC " id ": Result is: " (max-palindrome)))