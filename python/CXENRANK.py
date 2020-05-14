z = int(input())
temp = 0
temp2 = 0
result = 0
while (z > 0):
    u=int(input())
    v=int(input())
    temp=(u+v)+1
    temp2=temp*(temp-1)/2+1
    result=int(temp2+1)
    print(result)
    z -= 1
