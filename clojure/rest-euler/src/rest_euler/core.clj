(ns rest-euler.core
  
  "Euler REST router. Functions for routing different url regarding specified use cases (problems)
   The Use Cases (problems) implementations are divied into different use case files."
  
  (:gen-class)
  (:require [compojure.core :refer [defroutes GET]]
            [rest-euler.ucgetrootpage :as root]
            [rest-euler.route-euleruc :as euler]
            ))

(defroutes routes
  (GET "/" [] (root/getrootpage))
  (GET "/uc/:id" [id] (euler/id id))
  )

(def handler
  (-> routes))
