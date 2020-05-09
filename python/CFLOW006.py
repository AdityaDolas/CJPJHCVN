z = int(input())
count = 0
while (z > 0):
    a = int(input())
    while(a > 0):
        b = a % 10
        count = count + int(b)
        a = a/10
    print(int(count))
    count = 0
    z = z-1
