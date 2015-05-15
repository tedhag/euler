module UCeuler3
( solve
) where

import Primes


-- (Perfect Squares at http://en.wikipedia.org/wiki/Prime_factor)
-- x is the variable from primes that is multiplied with it self
-- and less then n
perfect_squares n = takeWhile (\x -> x^2 < n) primes


prime_factors n = filter (\x -> x `rem` n ==0) primes

solve :: Int -> [Char]
solve ucid = "Solved UC "++show(ucid)++": Result is: "++show(prime_factors 100)