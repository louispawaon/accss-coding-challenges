'''
Given a string consisting of parentheses, single digits, and positive and negative signs, convert the string into a mathematical expression to obtain the answer.

Don't use eval or a similar built-in parser.

For example, given '-1 + (2 + 3)', you should return 4.
'''
#Attempting to follow PEMDAS

import string
def evaluation(expression):
    symbols = '^*()/+-' #Storing basic mathematical symbols, executes only the basics of PEMDAS
    formula = [(x,expression.index(x)) for x in expression if x in string.digits+symbols] #Storing the expression in iteration with the symbols in a list
    result = eval(''.join(x[0] for x in formula)) #Evalution
    expression = expression[:formula[0][1]] + str(result) + expression[formula[-1][1]+1:] #Concatenation of answer
    return expression

expression=input()
print(evaluation(expression))

