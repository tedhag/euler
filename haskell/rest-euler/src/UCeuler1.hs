module UCeuler1
( solve, 
  test
) where

multiples_of_3_and_5 = [x | x <-[1..999], (x `mod` 3==0) || (x `mod` 5==0)]

solve :: Int -> [Char]
solve id = "Solved UC "++show(id)++": Result is: "++show(sum multiples_of_3_and_5)
