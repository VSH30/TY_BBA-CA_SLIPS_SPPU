'''Write a python script to create a class Rectangle with data member's length, width 
and methods area, perimeter which can compute the area and perimeter of rectangle. '''

class Rectangle:
    def __init__(self,l,w):
        self.l = l
        self.w = w
    def area(self):
        return self.l*self.w
    def perim(self):
        return 2*(self.l+self.w)

r = Rectangle(int(input("Enter length: ")), int(input("Enter width: ")))

print("Area of Rectangle =",r.area())
print("Perimeter of Rectangle =",r.perim())