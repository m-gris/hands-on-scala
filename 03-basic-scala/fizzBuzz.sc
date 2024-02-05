
def isMultipleOf(x: Int, y: Int): Boolean = 
  y % x == 0 

def isMultipleOfBoth(x: Int, y: Int, z: Int): Boolean = 
  isMultipleOf(x, z) && isMultipleOf(y, z)


for (i <- Range.inclusive(1, 100)) {
  println(
    if isMultipleOfBoth(3, 5, i) then "FizzBuzz"
    else if isMultipleOf(3, i) then "Fizz"
    else if  isMultipleOf(5, i) then "Buzz"
    else i
) }
