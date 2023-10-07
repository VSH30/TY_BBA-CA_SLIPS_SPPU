'''Write a Python Program to Check if given number is prime or not. Also find 
factorial of the given no using user defined function'''

def checkPrime(x):
    if x < 2:
        return False
    for i in range(2,x):
        if x%i == 0:
            return False
    return True

def fact(x):
    if x == 0:
        return 1
    else:
        return x*(fact(x-1))
    
n = int(input("Enter n: "))
if checkPrime(n):
    print(n,"is Prime")
else:
    print(n,"is Not Prime")

print("Factorial of",n,"=",fact(n))