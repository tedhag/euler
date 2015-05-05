(ns rest-euler.route-euleruc
  
  "Function router for different Euler Use Cases (problems)"
  
  (:gen-class)
  (:require  [liberator.core :refer [defresource]]
             [rest-euler.uceuler1 :as uc1]
             [rest-euler.uceuler2 :as uc2]))

(defn router [id] 
  (case id;id as string
      "1" (uc1/solve id)
      "2" (uc2/solve id)
      "Not implemented yet!"))

(defresource id [id]
  :available-media-types ["text/html" "application/json"]
  :allowed-methods [:get]
  :handle-ok (router id))