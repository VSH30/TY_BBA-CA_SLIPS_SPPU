'''Write a Python function that accepts a string and calculate the number of upper case 
letters and lower case letters. 
Sample String: 'The quick Brown Fox'
Expected Output: 
No. of Upper case characters: 3
No. of Lower case characters: 13'''

def StrCount(s):
    d = {'upper':0,'lower':0}
    for x in str(s):
        if x.isupper():
            d['upper'] += 1
        elif x.islower():
            d['lower'] += 1
    return d

s = input("Enter a String: ")
cnt = StrCount(s)

print("No. of Upper case characters :",cnt['upper'])
print("No. of Lower case characters :",cnt['lower'])
