module RouteEulerUC
( route
) where

import qualified UCeuler1 as UC1
import qualified UCeuler2 as UC2

route :: Int -> [Char]
route 1 = UC1.solve 1
route 2 = UC2.solve 2
route x = "UC not implemented"
