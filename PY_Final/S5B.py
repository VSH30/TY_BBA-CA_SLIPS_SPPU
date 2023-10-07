'''Write a python script to generate Fibonacci terms using generator function'''

def fib():
    a, b = 0, 1
    while True:
        yield a
        a, b = b, a + b

f = fib()

for x in range(10):
    print(next(f))
    