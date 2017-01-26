__author__ = 'Alex'

def NOD():
    a = int(input("Type first: "))
    b = int(input("Type second: "))
    while a != b:
        if a > b:
            a = a - b
        if b > a:
            b = b - a
    print(a)

NOD()