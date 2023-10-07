import datetime
class InvalidDateException(ValueError):
    pass
try:
    y = int(input("Enter Year: "))
    m = int(input("Enter Month: "))
    d = int(input("Enter Date: "))
    try:
        d1 = datetime.date(y,m,d)
    except ValueError as e:
        raise InvalidDateException(e)
except InvalidDateException as e:
    print("Invalid Date:",e)