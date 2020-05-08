x,y=input().split()
a=int(x)
b=int(y)
result=0
while (a>0):
    z=input()
    c=int(z)
    if(c%b==0):
        result=result+1
    a=a-1
print(result)

