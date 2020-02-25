def compress(chars):
    """
    :type chars: List[str]
    :rtype: int
    """
    letter = {}
    for any in chars:
        if any not in chars:
            letter[any] = 1
        else:
            letter[any] = letter.get(any,0)+ 1

    return letter

test=["a","a","b","b","c","c","c"]
letters=compress(test)
print(letters)

final=''
for key, value in letters.items():
    final=final+key+str(value)
print(len(final))