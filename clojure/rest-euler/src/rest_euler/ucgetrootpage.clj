(ns rest-euler.ucgetrootpage
  
  "Use Case for getting root page information, i.e no real data delivery"
  
  (:gen-class)
  (:require  [liberator.core :refer [defresource]]))

(defresource getrootpage []
  :available-media-types ["text/html"]
  :allowed-methods [:get]
  :handle-ok (str "Hello! This is the root-URL for Euler REST service"))