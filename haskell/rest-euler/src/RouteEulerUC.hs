module RouteEulerUC
( route
) where

import qualified UCeuler1 as UC1
import qualified UCeuler2 as UC2
import qualified UCeuler3 as UC3
import qualified UCeuler4 as UC4

route :: Int -> [Char]
route 1 = UC1.solve 1
route 2 = UC2.solve 2
route 3 = UC3.solve 3
route 4 = UC4.solve 4
route x = "UC not implemented"
