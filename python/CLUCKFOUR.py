z = int(input())
count = 0
while (z > 0):
    a = int(input())
    while (a > 0):
        b = int(a % 10)
        if (b == 4):
            count = count + 1
        a = a/10
    print(count)
    count = 0
    z -= 1
