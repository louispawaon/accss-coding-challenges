import math #import math library
'''
Create a function to find only the root value of x in any quadratic equation ax^2 + bx + c. The function will take three arguments:
a as the coefficient of x^2
b as the coefficient of x
c as the constant term
For example:

quadraticEquation(1, 2, -3) ➞ 1

quadraticEquation(2, -7, 3) ➞ 3

quadraticEquation(1, -12, -28) ➞ 14
'''

def quadraticEquation(a,b,c):

    #Finding the discriminant b^2-4ac
    discri = (math.pow(b,2))-4*a*c
    sqrt_dis = math.sqrt(abs(discri)) #Square Root of the Disrciminant

    #Checking the Discriminant

    if discri >0: #Discriminant is greater than zero, it produces 2 possible answers
        positive = (-b+sqrt_dis)/(2*a)
        #Negative root excluded as part of instruction
        #negative = (-b-sqrt_dis)/(2*a)
        print("Answer: ",math.floor(positive))

    elif discri == 0: #If Discriminant is zero, it immediately removes the sqrt_dis
        answer = -b/(2*a)
        print("Answer: ",math.floor(answer))

    #For special case tests only 
    else: #If Discriminant can somehow be less than zero, it will produce an imaginary solution
        answer = -b/(2*a)
        posimaginary = '+ i'
        negatimaginary = "- i"
        print("Answer/s:",answer,posimaginary,"and",answer,negatimaginary)

a = int(input("Enter a: "))
b = int(input("Enter b: "))
c = int(input("Enter c: "))
quadraticEquation(a,b,c)

#i could've used cmath library instead of the math library but i opted math because i'm more familiar with it