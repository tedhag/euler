module UCeuler3
( solve
) where

import Primes

-- 
perfect_squares n = takeWhile (< i) primes
    where i = round . sqrt . fromIntegral $ n


largestPrimeFactor :: Integer -> Integer
largestPrimeFactor n =
    maximum (filter (\x -> ((n `mod` x) == 0)) (perfect_squares n))

solve :: Int -> [Char]
solve ucid = "Solved UC "++show(ucid)++": Result is: "++show(largestPrimeFactor 600851475143)