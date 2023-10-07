'''Write a python program to count repeated characters in a string.
Sample string: 'thequickbrownfoxjumpsoverthelazydog'
Expected output: o-4, e-3, u-2, h-2, r-2, t-2'''

s =  'thequickbrownfoxjumpsoverthelazydog'

d = {x:s.count(x) for x in s if s.count(x)>1}

for x,y in d.items():
    print(x,'-',y,sep='',end=',')