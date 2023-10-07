"""Write a python program to accept string and remove the characters which have odd 
index values of given string using user defined function"""

def remOdd(s):
    return s[::2]

s = "0123456789"
print(remOdd(s)) 