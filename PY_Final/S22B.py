'''Write a python script to implement bubble sort using list'''

def BubbleSort(l):
    for x in range(len(l)):
        for y in range(len(l)-x-1):
            if(l[y] > l[y+1]):
                l[y],l[y+1] = l[y+1],l[y]
    return l

l = [4,35,76,2,43,78,90,6,4,1]
print(l)
print(BubbleSort(l))