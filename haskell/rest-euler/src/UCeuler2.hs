module UCeuler2
( solve
) where

-- With an anonymus function that takes a pair (a, b) in list and 
-- returns a new pair with (b (+ a b)).
-- We iterate over that function, i.e the output is the new input.
-- The first position in each pair is the Fibonacci sequence
-- that is map(ped) to a new lazy sequence
-- The $ operator is for avoiding parenthesis. Anything appearing 
-- after it will take precedence over anything that comes before.  
fibonacci :: [Integer]
fibonacci = map fst $ iterate (\(a,b) -> (b,a+b)) (0,1)

-- create new lazy list of even fibonacci numbers
even_fibonacci :: [Integer]
even_fibonacci = [ x | x <- fibonacci, (x `mod` 2==0) ]

solve :: Int -> [Char]
solve ucid = "Solved UC "++show(ucid)++": Result is: "++show(sum (takeWhile (<4000000) even_fibonacci))