def isPanlindrome(s):
    s = list(s.lower())

    new = []

    for each in s:
        if each.isalnum():
            new.append(each)

    left = 0
    right = len(new) - 1

