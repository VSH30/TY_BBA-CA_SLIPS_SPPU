'''Write a Python program to check if a given key already exists in a dictionary. If 
key exists replace with another key/value pair.'''

students = {'VSH':1,'Shabaz':9,'Shravani':17,'Adnan':52,'Saniya':54}
print(students)

k = input("Enter a Name: ")
if(k in students.keys()):
    students['Vishal'] = students.pop('VSH')
    print(students)
else:
    print("Given key is not present in the Dict.")
