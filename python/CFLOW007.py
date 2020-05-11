z = int(input())
result = 0
while (z > 0):
    a = int(input())
    while (a > 0):
        b = int(a % 10)
        result = (result*10)+b
        a = int(a/10)
    print(result)
    result = 0
    z -= 1
