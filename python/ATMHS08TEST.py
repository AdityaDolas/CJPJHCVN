x,y = input().split()
n1 = int(x)
n2 = float(y)
if ((n1+0.5) < n2 and (n1 % 5 == 0)):
       x=(n2 - n1) - 0.5
       print('%.2f' % x)
else:
      print('%.2f' % n2)