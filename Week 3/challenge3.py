'''
It's time to send and receive secret messages.

Create two functions that take a string and an array and return a coded or decoded message.

The first letter of the string, or the first element of the array represents the Character Code of that letter. The next elements are the differences between the characters: e.g. A +3 --> C or z -1 --> y.

For example:

encrypt("Hello") ➞ [72, 29, 7, 0, 3]
// H = 72, the difference between the H and e is 29 (upper- and lowercase).
// The difference between the two l's is obviously 0.

decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"

encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]
'''

def encrypt(message):
    encryptedArr=[]
    placeholder=ord(message[0]) #For the first character of the message 
    encryptedArr.append(placeholder) #Immediate append to the encryptedArr
    for i in range(0,len(message)-1): #To exclude placeholder
        placeholder=(ord(message[i+1])-ord(message[i])) #Finding the difference of the next placeholders
        encryptedArr.append(placeholder)
    print(encryptedArr)

def decrypt(decryptArr):
    decryptedMess = ""
    firstLetter=chr(decryptArr[0]) #For the first character of the decrypted message
    nextLetterValue=(abs(decryptArr[1])+(decryptArr[0])) #For the second character since the value of [1]+[0] = ASCII value of the second character in the messaage
    secondLetter=chr(nextLetterValue)
    decryptedMess=firstLetter+secondLetter

    for j in range(2,len(decryptArr)):
        nextLetters=(nextLetterValue+decryptArr[j]) #Using the nextLetterValue to be the template for the succeeding characters of the message
        decryptedMess+=chr(nextLetters) #Appending to string
        nextLetterValue=nextLetters #Changing the new value
    print(decryptedMess)

decryptArr=[] 
choice=input("encrypt or decrypt?: ")

if choice == "encrypt":
    message=input("Enter message to be encrypted: ")
    encrypt(message)
elif choice == "decrypt":
    size = int(input("Enter decrypt message size: ")) #Decrypt Array Size
    for x in range (0, size):
        message=int(input())
        decryptArr.append(message)
    print(decryptArr) #Print Decrypt Array for checking purposes
    decrypt(decryptArr)
