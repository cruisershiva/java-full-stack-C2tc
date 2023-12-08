list=[]
def case1():
    print("enter your product")
    s=input()
    list.append(s)

def case2():
    list.sort()
    print(list)

def case3():
    exit(0)

def default_case():
    return "This is the default case"

while True:
    switch_dict = {
        1: case1,
        2: case2,
        3: case3
    }
    print('enter your choice')
    n=int(input())
    switch_dict.get(n, default_case)()
    