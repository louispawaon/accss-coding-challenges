'''
The "look and say" sequence is defined as follows: beginning with the term 1, each subsequent term visually describes the digits appearing in the previous term. The first few terms are as follows:

1
11
21
1211
111221

As an example, the fourth term is 1211, since the third term consists of one 2 and one 1.

Given an integer N, print the Nth term of this sequence.
'''

def lookandsay(N):
    sequence="1" #Initialized first iterated sequence
    if N==1:
        return sequence #First sequence
    for x in range(1,N): #Running the sequence n-1 times
        seq=''
        counter=1

        for y in range (1, len(sequence)): #Iteration through the iterated sequence
            if sequence[y]==sequence[y-1]: #If iteration is found similar, the counter adds up
                counter+=1
            else: #Else the current counter is used to be concatenated to the new iterated sequence 
                seq=seq+str(counter)+str(sequence[y-1])
                counter=1 #Reset of counter
        seq=seq+str(counter)+str(sequence[-1]) #Final Concatenation
        sequence=seq
    return sequence 

N=int(input())
print(lookandsay(N))
