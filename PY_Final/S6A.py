'''Write python script using package to calculate area and volume of cube and sphere'''

from pkg import cube as c
from pkg import sphere as sp

r = 5
s = 10

print("Area of Cube =",c.area(s))
print("Volume of Cube =",c.vol(s))

print("Area of Sphere =",sp.area(r))
print("Volume of Sphere =",sp.vol(r))

