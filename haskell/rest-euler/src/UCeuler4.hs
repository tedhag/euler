module UCeuler4
( solve
) where

-- A palindromic number reads the same both ways.
-- The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
-- Find the largest palindrome made from the product of two 3-digit numbers.

-- A palindrome is the same char sequence reversed
is_palindrome :: Int -> Bool
is_palindrome x = (show x) == (reverse $ show x)

palindromes :: [Int]
palindromes = [ x*y | x <- [100..1000], y <- [100..1000], is_palindrome(x*y) ]

max_palindrome :: Int
max_palindrome = maximum palindromes

solve :: Int -> [Char]
solve ucid = "Solved UC "++show(ucid)++": Result is: "++show(max_palindrome)