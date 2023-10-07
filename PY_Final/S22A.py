'''Write a python class to accept a string and number n from user and display n 
repetition of strings by overloading * operator'''

class Strrr:
    def __init__(self,s):
        self.s = s
    def __mul__(self,n):
        return (self.s * n)

S = Strrr(input("Enter a String: "))
print(S*int(input("Enter n: ")))