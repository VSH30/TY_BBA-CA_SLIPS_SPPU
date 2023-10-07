'''Write a python script to define a class student having members roll no, name, age, 
gender. Create a subclass called Test with member marks of 3 subjects. Create three 
objects of the Test class and display all the details of the student with total marks.'''

class Student:
    def __init__(self,rno,name,age):
        self.rno = rno
        self.name = name
        self.age = age

class Test(Student):
    def __init__(self, rno, name, age, py, oose, java):
        super().__init__(rno, name, age)
        self.py = py
        self.oose = oose
        self.java = java
        self.total = py+oose+java
    def __str__(self):
        return f"-------------------------------------\nRoll No = {self.rno}\nName = {self.name}\nAge = {self.age}\n------Marks:------\nPython = {self.py}\nOOSE = {self.oose}\nJava = {self.java}\nTotal Marks = {self.total}\n-------------------------------------"

s1 = Test(1,"VSH",23,40,50,60)
s2 = Test(9,"Shabaz",20,55,65,75)
s3 = Test(17,"Shravani",20,66,77,88)

print(s1)
print(s2)
print(s3)

