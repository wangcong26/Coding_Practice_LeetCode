def reverse(s):
    right = len(s) - 1
    left = 0
    myList = list(s)
    while (left < right):
        myList[left], myList[right] = myList[right], myList[left]
        left += 1
        right -= 1

    result = ''.join(myList)
    return result


myString1 = 'abcde'
myString2 = 'abcd'

# print(myString1)
print(reverse(myString1))
print(reverse(myString2))