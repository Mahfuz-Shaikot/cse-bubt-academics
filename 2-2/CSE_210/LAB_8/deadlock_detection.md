# Lab Task: Deadlock Detection Using a Resource Allocation Graph (RAG)

---

## Task Description

This task implements **deadlock detection** using a **Resource Allocation Graph (RAG)** for a system where each resource has only **one instance**.

Since every resource is unique, the presence of a **cycle** in the directed graph directly indicates a **deadlock**.

The implementation uses a **Depth First Search (DFS)** algorithm to detect cycles within the graph.

---

# Source Code

```cpp
#include <stdio.h>

#define MAX 26

int adj[MAX][MAX];
int visited[MAX];
int inStack[MAX];

// DFS function to detect cycles in a directed graph
int dfs(int v) {

    visited[v] = 1;
    inStack[v] = 1;

    for (int i = 0; i < MAX; i++) {

        if (adj[v][i]) {

            if (!visited[i]) {

                if (dfs(i))
                    return 1;

            } else if (inStack[i]) {

                return 1;   // Cycle detected
            }
        }
    }

    inStack[v] = 0;
    return 0;
}

int main() {

    int n, e;
    char from, to;

    // Initialize adjacency matrix and helper arrays
    for (int i = 0; i < MAX; i++) {

        visited[i] = 0;
        inStack[i] = 0;

        for (int j = 0; j < MAX; j++)
            adj[i][j] = 0;
    }

    printf("Number of Nodes: ");
    scanf("%d", &n);

    printf("Number of Edges: ");
    scanf("%d", &e);

    printf("Edges:\n");

    for (int i = 0; i < e; i++) {

        scanf(" %c %c", &from, &to);

        int u = (from >= 'A' && from <= 'Z')
                    ? from - 'A'
                    : from - 'a';

        int v = (to >= 'A' && to <= 'Z')
                    ? to - 'A'
                    : to - 'a';

        adj[u][v] = 1;
    }

    int deadlock = 0;

    for (int i = 0; i < MAX; i++) {

        if (!visited[i] && dfs(i)) {
            deadlock = 1;
            break;
        }
    }

    printf("Deadlock: %s\n", deadlock ? "Yes" : "No");

    return 0;
}
```

---

# Compilation

**Syntax**

```bash
g++ <source_file.cpp> -o <output_file>
```

**Command Executed**

```bash
g++ test.cpp -o test
```

---

# Program Execution

**Syntax**

```bash
./<output_file>
```

**Command Executed**

```bash
./test
```

---

# Terminal Log

```bash
22:07:03 /home/censxred/Desktop/programming/DSA/

$ cd "/home/censxred/Desktop/programming/temp/" && \
g++ test.cpp -o test && \
"/home/censxred/Desktop/programming/temp/"test

Number of Nodes: 13
Number of Edges: 13

Edges:

R A
A S
C S
F S
W F
D S
U D
G U
V G
D T
T E
E V
B T

Deadlock: Yes
```

---

# Observation

| Property          | Value                                  |
| ----------------- | -------------------------------------- |
| Number of Nodes   | **13**                                 |
| Number of Edges   | **13**                                 |
| Detection Method  | **DFS Cycle Detection**                |
| Graph Type        | **Directed Resource Allocation Graph** |
| Deadlock Detected | **Yes**                                |

---

# Findings and Analysis

## Graph Composition

- The Resource Allocation Graph (RAG) consists of **13 nodes** connected through **13 directed edges**.
- Each node represents either a process or a resource.
- Every resource has a **single instance**, allowing deadlock detection through cycle identification.

---

## Cycle Detection

- The graph is represented using an **adjacency matrix**.
- Nodes are mapped from characters (`A-Z`) into array indices (`0-25`).
- A **Depth First Search (DFS)** traversal is performed from every unvisited node.
- The algorithm maintains:
  - `visited[]` to record explored nodes.
  - `inStack[]` to track nodes currently in the recursion stack.
- Encountering a node already present in the recursion stack confirms a cycle.

---

## Deadlock Status

The DFS algorithm successfully detected a cycle in the graph and produced:

```text
Deadlock: Yes
```

This confirms that the system has entered a **deadlock state**.

---

## Identified Cycle

The detected circular dependency is:

```text
G → U → D → T → E → V → G
```

This closed loop forms a **circular wait condition**, where each process is waiting for another process or resource within the same cycle.

As a result:

- No process inside the loop can continue execution.
- None of the requested resources can be released.
- The system remains permanently blocked unless external intervention occurs.

---

# Conclusion

This implementation successfully demonstrates **deadlock detection** using a **Resource Allocation Graph (RAG)** and a **Depth First Search (DFS)** cycle detection algorithm.

Because each resource has only one instance, the existence of a cycle directly indicates a deadlock. The program efficiently detects this condition using recursion and the recursion-stack technique, correctly identifying the cycle and reporting:

```text
Deadlock: Yes
```

The experiment verifies that **DFS-based cycle detection** is an effective method for identifying deadlocks in single-instance resource allocation systems.
