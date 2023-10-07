'''Write a Python script using class to reverse a string word by word'''

class Strrr:
    def get_String(self):
        self.s = input("Enter a String: ")
    def rev_String(self):
        self.t = self.s.split()[::-1]
        self.r = []
        for x in self.t:
            self.r.append(x)
        self.r = " ".join(self.r)
        print(self.r)

s = Strrr()
s.get_String()
s.rev_String()

