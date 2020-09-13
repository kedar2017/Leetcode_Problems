
'''
from math import sqrt

C,H = 50,30


def calc(D):

    D = int(D)
    return str(int(round(sqrt((2*C*D)/H))))


D = input().split(',')                     # splits in comma position and set up in list
D = map(calc, D) # using comprehension method. It works in order of the previous code
print(",".join(D))
'''

'''
X,Y = map(int,input().split(','))

out = []

out = [[i*j for j in range(Y)] for i in range(X)]


for i in range(X):
    out.append([])
    for j in range(Y):
        out[i].append(i*j)

print(out)
'''

'''
inp = input().split(',')

print(','.join(sorted(inp)))
'''

'''
inp = input().split()
inp = list(map(lambda x : x.upper(),inp))
print(' '.join(inp))
'''

'''
inp = input().split()
inp = set(inp)
inp = sorted(inp)
print(' '.join(inp))
'''

'''
inp = input().split(',')

inp = list(filter(lambda x: int(x,2)%5==0,inp))

print(','.join(inp))
'''

'''
def func(num):
    for i in num:
        if int(i)%2 == 0:
            continue
        return False
    return True

ans = [str(i) for i in range(1000,3000)]

ans = list(filter(func,ans))
print(','.join(ans))
'''
'''
D = 0
L = 0

inp = input()

for ch in inp:
    if ch >= '0' and ch <= '9':
        D+=1
    elif (ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z'):
        L+=1

print("DIGITS = " + str(D))
print("LETTERS = " + str(L))
'''
'''
def question_15(string_digit):
    return sum(int(string_digit * n) for n in range(1, 5))

inp = input()
#inp = list(map(lambda x, y: int(x)+int(y),[inp*i for i in range(1,5)]))

print(question_15(inp))
'''
'''
final = 0
inp = input().splitlines()
for i in inp:
    print(i)
    if i.split()[0] == 'D':
        final = final + int(i.split()[1])
    else:
        final = final - int(i.split()[1])
print(final)
'''
'''
inp = tuple(input().split(','))

ans.append(inp)

ans.sort(key = lambda x : (x[0],int(x[1]),int(x[2])))
'''
'''
class Gen:
    def divisible(self,n):
        for i in range(0,n+1):
            if i%7 == 0:
                yield i

generator = Gen().divisible(int(input()))
for i in generator:
    print(i)
'''
'''
inp = input().split(' ')
ans = {}
for i in inp:
    ans[i] = inp.count(i)

for key in sorted(ans.keys()):

    print(str(key) + ':' + str(ans[key]))
'''
'''
class Example:

    number = 1

    def __init__(self, num):

        self.number = num
        return

ex = Example(5)

print(ex.number)
print(Example.number)

'''
'''
ans = {i:i*i for i in range(1,21)}

for i in ans.keys():
    print(i)
'''

ans = {i:i*i for i in range(1,21)}

for i in ans.keys():
    print(i)
