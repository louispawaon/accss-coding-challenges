'''
CHALLENGE 1
There are N prisoners standing in a circle, waiting to be executed. The executions are carried out starting with the kth person, and removing every successive kth person going clockwise until there is no one left.

Given N and k, write an algorithm to determine where a prisoner should stand in order to be the last survivor.

For example, if N = 5 and k = 2, the order of executions would be [2, 4, 1, 5, 3], so you should return 3.

Bonus: Find an O(log N) solution if k = 2.'''

def survivor(prisoners,k):
    k-=1 #Execution Begins at k=2
    deadman=k #The next dead man
    while len(prisoners)>1:
        prisoners.pop(deadman) #Removing the previous deadman from the list
        deadman=(deadman+k)%(len(prisoners)) #Executing the next deadman
        print(prisoners) #Showing the remaining criminals
    return prisoners[0]

def bonus(k):

N=int(input())
k=int(input())
prisoners=list(range(1,N+1)) #Listing Prisoners
if k==2:
    print('Bonus Challenge Survivor: ',bonus(N))
print('Survivor: ',survivor(prisoners, k))

'''
def josephus(n):
	
	# Find value of 2 ^ (1 + floor(Log n))
	# which is a power of 2 whose value
	# is just above n.
	p = 1
	while p <= n:
		p *= 2

	# Return 2n - 2^(1 + floor(Logn)) + 1
	return (2 * n) - p + 1
'''