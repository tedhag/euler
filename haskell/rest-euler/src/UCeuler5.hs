module UCeuler5
( solve
) where

smallest_even_divisable :: Int
smallest_even_divisable = foldr1 lcm [1..20]

solve :: Int -> [Char]
solve ucid = "Solved UC "++show(ucid)++": Result is: "++show(smallest_even_divisable)