''' Write a Python script using class, which has two methods get_String and 
print_String. get_String accept a string from the user and print_String print the string in 
upper case.'''

class Strrr:
    def get_String(self):
        self.s = input("Enter a String: ")
    def print_String(self):
        print(self.s.upper())

s = Strrr()
s.get_String()
s.print_String()

