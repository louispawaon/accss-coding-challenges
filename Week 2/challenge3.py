'''
Challenge 3

Hermione has come up with a precise formula for determining whether or not a phrase was ssspoken by a parssseltongue 
(a reference from the Harry Potter universe; the language of ssserpents and those who can converse with them).

Each word in a sssentence must contain either:
Two or more consecutive instances of the letter "s" (i.e. must be together ss..), or...
Zero instances of the letter "s" by itself.
For example:

isParselTongue("Sshe ssselects to eat that apple. ") ➞ true

isParselTongue("She ssselects to eat that apple. ") ➞ false
// "She" only contains one "s".

isParselTongue("Beatrice samples lemonade") ➞ false
// While "samples" has 2 instances of "s", they are not together.
'''
def isParselTongue(message):
    for x in range(0, len(message)-1):
        if(ord(message[x])+1)==(ord(message[x+1])):
            print("truers")
            return True
        else:return False

cipher = "Sshe ssselects to eat that apple.".lower()
check='s'
decode = cipher.split()
message = [i for i in decode if i[0]==check]
for w in message:
    if(isParselTongue(w)):
        print("hello")
    else:
        print("bye")

    