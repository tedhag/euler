module Primes
( primes
) where

-- Since 1 and x are always divisors of x we append them to the list 
-- comprehension that checks for -- divisors from 2 to (x `div` 2). 
-- Why x `div` 2 and not [2..x]? Well no divisor of a number will ever 
-- be larger than half of the number, so we can save some cpu there.
divisors :: Integer -> [Integer]
divisors x = 1:[ y | y <- [2..(x `div` 2)], x `mod` y == 0] ++ [x]

-- A prime number (or a prime) is a natural number greater than 1 
-- that has no positive divisors other than 1 and itself.  -Wikipedia
-- so x is prime if divisors x == [1,x]
isPrime :: Integer -> Bool
isPrime x = divisors x == [1,x]

-- We can now define our prime number generator as:
primes :: [Integer]
primes = [ x | x <- [2..], isPrime x]

-- A test function for GHCi
limit_primes :: Int -> [Integer]
limit_primes n = take n $ primes