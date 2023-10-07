'''Define a class named Rectangle which can be constructed by a length and width. 
The Rectangle class has a method which can compute the area and Perimeter.'''

class Rectangle:
    def __init__(self,l,b):
        self.l = l
        self.b = b
    def area(self):
        return self.l*self.b
    def perim(self):
        return 2*(self.l+self.b)

r = Rectangle(int(input("Enter Length: ")),  int(input("Enter Breadth: ")))
print("Area =",r.area())
print("Perimeter =",r.perim())