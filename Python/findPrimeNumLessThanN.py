def findPrimes1(n):
    def isPrime(n):
        for i in range(2, n):
            if n % i == 0:
                return False
        return True

    if n < 0:
        return 0
    if n == 1:
        return False

    myList = []
    for number in range(2, n):
        if isPrime(number):
            myList.append(number)

    return myList


def findPrimesLessThanN(n):
    # create a list of Boolean with all True
    myList = [True for each in range(n)]
    # I think I can set myList[0], myList[1] = False, False,
    # but I realized it's not necessary later.

    # start with 2, and delete all its multiples from the range
    start_num = 2

    # only need to test up to sqrt of n
    while (start_num * start_num <= n):
        # In the beginning, they are all True
        # Index of the list is basically the range we want to remove non-prime from
        if myList[start_num] == True:
            # here is to set any multiple of start_num to False in myList because they are not primes
            for i in range(start_num * start_num, n, start_num):
                myList[i] = False
        start_num += 1
    result = []

    # Now we can append the numbers left.
    # They are all primes. The number is basically the index number in myList
    for i in range(2, n):
        if myList[i]:
            result.append(i)

    return result


# print(findPrimes1(25))
print(findPrimesLessThanN(25))
