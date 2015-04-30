{-# LANGUAGE OverloadedStrings #-}
import Web.Scotty
import Data.String

import RouteEulerUC

main = scotty 3000 $ do
  get "/" $ do
    html "Hello! This is the root-URL for Haskell REST service"
  get "/uc/:id" $ do
    ucid <- param "id" :: ActionM Int
    html $ (fromString (route ucid))
    