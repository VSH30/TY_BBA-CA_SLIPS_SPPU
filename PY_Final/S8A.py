'''Write a python script to find the repeated items of a tuple '''

t = (3,4,6,7,5,2,13,4,3,6,8)
l = []
[l.append(x) for x in t if t.count(x)>1 and x not in l]

print(t)
print(l)

