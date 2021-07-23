'''
CHALLENGE 1
There are N prisoners standing in a circle, waiting to be executed. The executions are carried out starting with the kth person, and removing every successive kth person going clockwise until there is no one left.

Given N and k, write an algorithm to determine where a prisoner should stand in order to be the last survivor.

For example, if N = 5 and k = 2, the order of executions would be [2, 4, 1, 5, 3], so you should return 3.

Bonus: Find an O(log N) solution if k = 2.'''

def survivor(prisoners,k):
    k-=1 #Execution Begins with k
    deadman=k #The next dead man
    while len(prisoners)>1:
        prisoners.pop(deadman) #Removing the previous deadman from the list
        deadman=(deadman+k)%(len(prisoners)) #Executing the next deadman
        print(prisoners) #Showing the remaining criminals
    return prisoners[0]

N=int(input())
k=int(input())
prisoners=list(range(1,N+1)) #Listing Prisoners
print('Survivor: ',survivor(prisoners, k))
