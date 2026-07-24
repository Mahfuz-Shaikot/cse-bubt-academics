from collections import deque
import numpy as np

srt = np.array([[1, 7, 2], [5, 3, 9], [0, 8, 4]])
fsh = np.array([[1, 2, 3], [4, 5, 7], [8, 9, 0]])

q = deque([start])
visit = {tuple(start.flatten())}

while q:
  state = q.popleft()

  if np.array equal (state, goal) :
    print("Goal Found")
