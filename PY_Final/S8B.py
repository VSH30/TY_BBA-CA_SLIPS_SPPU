''' Write a Python class which has two methods get_String and print_String. get_String 
accept a string from the user and print_String print the string in upper case. Further 
modify the program to reverse a string word by word and print it in lower case'''

class Strrr:
    def get_String(self):
        self.s = input("Enter a String: ")
    def print_String(self):
        print(self.s.upper())
    def rev_String(self):
        self.t = self.s.split()[::-1]
        self.r = []
        for x in self.t:
            self.r.append(x)
        self.r = " ".join(self.r)
        print(self.r)

s = Strrr()
s.get_String()
s.print_String()
s.rev_String()

