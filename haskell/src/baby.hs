doubleMe x = x + x

doubleUs x y = x*2 + y*2

comp2 = [x*2 | x <- [1..10], x*2 >= 12]

mod3 = [x | x <-[1..9], x `mod` 3==0]

mod5 = [x | x <-[1..9], x `mod` 5==0]

mod35 = [x | x <-[1..999], (x `mod` 3==0) || (x `mod` 5==0)]

solve id = "Solved UC "++show(id)++": Result is: "++show(sum mod35)


