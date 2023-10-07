'''Write a python script to define the class person having members name, address. 
Create a subclass called Employee with members staffed salary. Create 'n' objects of the 
Employee class and display all the details of the employee.'''

class Person:
    def __init__(self,n,a):
        self.name = n
        self.address = a

class Employee(Person):
    def __init__(self, n, a, id, sal):
        super().__init__(n, a)
        self.id = id
        self.sal = sal
    def __str__(self):
        return f"Employee ID = {self.id}\nEmployee Name = {self.name}\nEmployee Add = {self.address}\nEmployee Sal = {self.sal}"

t = (Employee("VSH","Chinchwad",1,5000),Employee("Shabaz","Chinchwad",9,10000),Employee("Shravani","Chinchwad",17,15000),Employee("Adnan","Vallabhnagar",52,20000),Employee("Saniya","Vallabhnagar",54,25000))

for x in t:
    print("---------------------------")
    print(x)