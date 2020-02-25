import collections
from collections import deque

d = deque("hello")
d.append('4')  # add to the end

print('Before removing')
print(d)

# remove one element from right end
d.pop()
print(d)

# remove one element from left end
d.popleft()
print(d)

# clear all the elements
# d.clear()

# append to the end
d.extend('456')
d.extend([1, 2, 3])
d.extend('hey')
print(d)

# rotate to the left by one: -1
d.rotate(-1)
print(d)

d.rotate(-2)
print(d)

# maxlen
d = deque("hello", maxlen=5)
print(d)
d.append(1)
print(d)
d.extend([1, 2, 4])
print(d)
