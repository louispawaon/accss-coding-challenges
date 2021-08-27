'''
Challenge #1 Higher Number [EASY]
Write a function that returns true if there exists at least one number that is larger than or equal to n

For example:

existsHigher([5, 3, 15, 22, 4], 10) ➞ true

existsHigher([1, 2, 3, 4, 5], 8) ➞ false

existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true

existsHigher([], 5) ➞ false

notes:
Return false for an empty array [].
'''
def existsHigher(arrNum, n):
    if arrNum==[]:
        return False #If arrNum is empty, immediately return false
    return any(x>=n for x in arrNum) #Use any() function to find that for every x in arrNum, if any x is higher than n, it returns True, otherwise, False

arrNum=[]
size = int(input("Enter Array Size: ")) #Array Size
for i in range(0, size):
    element=int(input()) #Array Element
    arrNum.append(element) 
print(arrNum) #Print Array
n = int(input("Enter n: ")) #Enter Prompt
print(existsHigher(arrNum, n))
