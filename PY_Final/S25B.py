'''To create a class which performs basic calculator'''

class Calculator:
    def __init__(v,a,b):
        v.a = a
        v.b = b
    def addition(v):
        return v.a+v.b
    def substraction(v):
        return v.a-v.b
    def multiplication(v):
        return v.a*v.b
    def division(v):
        return v.a/v.b
    def powww(v):
        return v.a**v.b
    
x = int(input("Enter num 1: "))
y = int(input("Enter num2: "))

c = Calculator(x,y)
l = True

while(l):
    print("----Select choice----")
    print("1.Add")
    print("2.Sub")
    print("3.Mul")
    print("4.Div")
    print("5.Power")
    print("0.Exit")

    ch = int(input("Enter choice: "))
    
    if ch == 1:
        print("Add = ",c.addition())
    elif ch == 2:
        print("Sub = ",c.substraction())
    elif ch == 3:
        print("Mul = ",c.multiplication())
    elif ch == 4:
        print("Div = ",c.division())
    elif ch == 5:
        print("Pow = ",c.powww())
    elif ch == 0:
        l = False
    else:
        print("INVALID OPTION!!!")