(ns rest-euler.route-euleruc
  
  "Function router for different Euler Use Cases (problems)"
  
  (:gen-class)
  (:require  [liberator.core :refer [defresource]]
             [rest-euler.uceuler1 :as uc1]
             [rest-euler.uceuler2 :as uc2]
             [rest-euler.uceuler3 :as uc3]
             [rest-euler.uceuler4 :as uc4]
             [rest-euler.uceuler5 :as uc5]))

(defn router [id] 
  (case id;id as string
      "1" (uc1/solve id)
      "2" (uc2/solve id)
      "3" (uc3/solve id)
      "4" (uc4/solve id)
      "5" (uc5/solve id)
      "Not implemented yet!"))

(defresource id [id]
  :available-media-types ["text/html" "application/json"]
  :allowed-methods [:get]
  :handle-ok (router id))