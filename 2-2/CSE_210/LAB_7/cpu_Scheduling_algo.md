# Lab 3: CPU Scheduling Algorithms

---

# 1. First Come First Serve (FCFS) Process Scheduling

## Source Code

```c
#include <stdio.h>

int main() {
    int processCount;
    printf("Enter the number of processes: ");
    scanf("%d", &processCount);

    int processId[processCount], arrivalTime[processCount], burstTime[processCount];
    int waitingTime[processCount], turnaroundTime[processCount];
    int i, j, temp;
    double totalWait = 0, totalTurn = 0;

    printf("Enter the CPU burst times: ");
    for (i = 0; i < processCount; i++) {
        scanf("%d", &burstTime[i]);
        processId[i] = i + 1;
    }

    printf("Enter the arrival times: ");
    for (i = 0; i < processCount; i++) {
        scanf("%d", &arrivalTime[i]);
    }

    // Sort by arrival time
    for (i = 0; i < processCount - 1; i++) {
        for (j = i + 1; j < processCount; j++) {
            if (arrivalTime[i] > arrivalTime[j]) {

                temp = arrivalTime[i];
                arrivalTime[i] = arrivalTime[j];
                arrivalTime[j] = temp;

                temp = burstTime[i];
                burstTime[i] = burstTime[j];
                burstTime[j] = temp;

                temp = processId[i];
                processId[i] = processId[j];
                processId[j] = temp;
            }
        }
    }

    waitingTime[0] = 0;
    turnaroundTime[0] = burstTime[0];
    int currentTime = arrivalTime[0] + burstTime[0];

    for (i = 1; i < processCount; i++) {

        if (currentTime < arrivalTime[i])
            currentTime = arrivalTime[i];

        waitingTime[i] = currentTime - arrivalTime[i];
        turnaroundTime[i] = waitingTime[i] + burstTime[i];
        currentTime += burstTime[i];
    }

    printf("\n--- FCFS Scheduling Result ---\n");

    for (i = 0; i < processCount; i++) {

        printf("Process %d: Waiting Time = %d, Turnaround Time = %d\n",
               processId[i], waitingTime[i], turnaroundTime[i]);

        totalWait += waitingTime[i];
        totalTurn += turnaroundTime[i];
    }

    printf("\nAverage Waiting Time: %.2f", totalWait / processCount);
    printf("\nAverage Turnaround Time: %.2f\n", totalTurn / processCount);

    return 0;
}
```

---

## Compilation

**Syntax**

```bash
gcc -o <output_file> <source_file.c>
```

**Command Executed**

```bash
gcc -o output 1.c
```

---

## Program Execution

**Syntax**

```bash
./<output_file>
```

**Command Executed**

```bash
./output
```

---

## Terminal Log

```bash
22:36:39 /home/censxred/cse-207/
$ gcc -o output 1.c

22:36:46 /home/censxred/cse-207/
$ ./output

Enter the number of processes: 3

Enter the CPU burst times:
5 7 9

Enter the arrival times:
4 0 2

--- FCFS Scheduling Result ---

Process 2: Waiting Time = 0, Turnaround Time = 7
Process 3: Waiting Time = 5, Turnaround Time = 14
Process 1: Waiting Time = 12, Turnaround Time = 17

Average Waiting Time: 5.67
Average Turnaround Time: 12.67

22:37:05 /home/censxred/cse-207/
```

---

## Observation

| Metric                  |     Value |
| ----------------------- | --------: |
| Number of Processes     |         3 |
| Average Waiting Time    |  **5.67** |
| Average Turnaround Time | **12.67** |

### Result Analysis

- Processes are executed according to their **arrival time**.
- Once a process starts execution, it runs until completion.
- No preemption occurs.
- Longer processes may increase the waiting time of shorter processes arriving later (Convoy Effect).

---

# 2. Shortest Job First (SJF) Scheduling (Non-Preemptive)

## Source Code

```c
#include <stdio.h>

int main() {
    int processCount;
    printf("Enter the number of processes: ");
    scanf("%d", &processCount);

    int processId[processCount], arrivalTime[processCount], burstTime[processCount];
    int waitingTime[processCount], turnaroundTime[processCount], isCompleted[processCount];
    int i, time = 0, completedCount = 0;
    double totalWait = 0, totalTurn = 0;

    printf("Enter the CPU burst times: ");
    for (i = 0; i < processCount; i++) {
        scanf("%d", &burstTime[i]);
        processId[i] = i + 1;
        isCompleted[i] = 0;
    }

    printf("Enter the arrival times: ");
    for (i = 0; i < processCount; i++) {
        scanf("%d", &arrivalTime[i]);
    }

    // Find earliest arrival
    int minArrival = arrivalTime[0];
    for (i = 1; i < processCount; i++) {
        if (arrivalTime[i] < minArrival)
            minArrival = arrivalTime[i];
    }
    time = minArrival;

    // Process execution
    while (completedCount < processCount) {

        int shortestIndex = -1;
        int minBurst = 99999;

        for (i = 0; i < processCount; i++) {
            if (arrivalTime[i] <= time && isCompleted[i] == 0) {
                if (burstTime[i] < minBurst) {
                    minBurst = burstTime[i];
                    shortestIndex = i;
                }
            }
        }

        if (shortestIndex == -1) {
            time++;
            continue;
        }

        waitingTime[shortestIndex] = time - arrivalTime[shortestIndex];
        turnaroundTime[shortestIndex] = waitingTime[shortestIndex] + burstTime[shortestIndex];

        time += burstTime[shortestIndex];
        isCompleted[shortestIndex] = 1;
        completedCount++;
    }

    printf("\n--- Shortest Job First (Non-Preemptive) Result ---\n");

    for (i = 0; i < processCount; i++) {

        printf("Process %d: Waiting Time = %d, Turnaround Time = %d\n",
               processId[i],
               waitingTime[i],
               turnaroundTime[i]);

        totalWait += waitingTime[i];
        totalTurn += turnaroundTime[i];
    }

    printf("\nAverage Waiting Time: %.2f", totalWait / processCount);
    printf("\nAverage Turnaround Time: %.2f\n", totalTurn / processCount);

    return 0;
}
```

---

## Compilation

**Syntax**

```bash
gcc -o <output_file> <source_file.c>
```

**Command Executed**

```bash
gcc -o output 2.c
```

---

## Program Execution

**Syntax**

```bash
./<output_file>
```

**Command Executed**

```bash
./output
```

---

## Terminal Log

```bash
22:37:48 /home/censxred/cse-207/
$ gcc -o output 2.c

22:37:53 /home/censxred/cse-207/
$ ./output

Enter the number of processes: 3

Enter the CPU burst times:
5 7 9

Enter the arrival times:
4 0 2

--- Shortest Job First (Non-Preemptive) Result ---

Process 1: Waiting Time = 3, Turnaround Time = 8
Process 2: Waiting Time = 0, Turnaround Time = 7
Process 3: Waiting Time = 10, Turnaround Time = 19

Average Waiting Time: 4.33
Average Turnaround Time: 11.33

22:38:23 /home/censxred/cse-207/
```

---

## Observation

| Metric                  |     Value |
| ----------------------- | --------: |
| Number of Processes     |         3 |
| Average Waiting Time    |  **4.33** |
| Average Turnaround Time | **11.33** |

### Result Analysis

- The scheduler selects the **shortest available CPU burst** among the processes that have already arrived.
- Once a process starts executing, it **continues until completion** (non-preemptive).
- This scheduling algorithm generally produces a **lower average waiting time** than FCFS.
- A drawback is that **longer processes may experience starvation** if short jobs continue to arrive.

---

# 3. Shortest Job First (SJF) Scheduling (Preemptive / SRTF)

## Source Code

```c
#include <stdio.h>

int main() {
    int processCount;
    printf("Enter the number of processes: ");
    scanf("%d", &processCount);

    int processId[processCount], arrivalTime[processCount], burstTime[processCount];
    int remainingTime[processCount], waitingTime[processCount];
    int turnaroundTime[processCount], finishTime[processCount];
    int completed = 0, time = 0, shortestIndex = -1;
    double totalWait = 0, totalTurn = 0;

    printf("Enter the CPU burst times: ");
    for (int i = 0; i < processCount; i++) {
        scanf("%d", &burstTime[i]);
        processId[i] = i + 1;
        remainingTime[i] = burstTime[i];
    }

    printf("Enter the arrival times: ");
    for (int i = 0; i < processCount; i++) {
        scanf("%d", &arrivalTime[i]);
    }

    while (completed < processCount) {

        int minRemaining = 99999;
        shortestIndex = -1;

        for (int i = 0; i < processCount; i++) {
            if (arrivalTime[i] <= time && remainingTime[i] > 0) {
                if (remainingTime[i] < minRemaining) {
                    minRemaining = remainingTime[i];
                    shortestIndex = i;
                }
            }
        }

        if (shortestIndex == -1) {
            time++;
            continue;
        }

        remainingTime[shortestIndex]--;
        time++;

        if (remainingTime[shortestIndex] == 0) {
            completed++;

            finishTime[shortestIndex] = time;

            turnaroundTime[shortestIndex] =
                finishTime[shortestIndex] - arrivalTime[shortestIndex];

            waitingTime[shortestIndex] =
                turnaroundTime[shortestIndex] - burstTime[shortestIndex];
        }
    }

    printf("\n--- SJF (Pre-emptive / SRTF) Scheduling Result ---\n");

    for (int i = 0; i < processCount; i++) {

        printf("Process %d: Waiting Time = %d, Turnaround Time = %d\n",
               processId[i],
               waitingTime[i],
               turnaroundTime[i]);

        totalWait += waitingTime[i];
        totalTurn += turnaroundTime[i];
    }

    printf("\nAverage Waiting Time: %.2f", totalWait / processCount);
    printf("\nAverage Turnaround Time: %.2f\n", totalTurn / processCount);

    return 0;
}
```

---

## Compilation

**Syntax**

```bash
gcc -o <output_file> <source_file.c>
```

**Command Executed**

```bash
gcc -o output 3.c
```

---

## Program Execution

**Syntax**

```bash
./<output_file>
```

**Command Executed**

```bash
./output
```

---

## Terminal Log

```bash
22:38:30 /home/censxred/cse-207/
$ gcc -o output 3.c

22:38:37 /home/censxred/cse-207/
$ ./output

Enter the number of processes: 3

Enter the CPU burst times:
5 7 9

Enter the arrival times:
4 0 2

--- SJF (Pre-emptive / SRTF) Scheduling Result ---

Process 1: Waiting Time = 3, Turnaround Time = 8
Process 2: Waiting Time = 0, Turnaround Time = 7
Process 3: Waiting Time = 10, Turnaround Time = 19

Average Waiting Time: 4.33
Average Turnaround Time: 11.33

22:38:54 /home/censxred/cse-207/
```

---

## Observation

| Metric                  |     Value |
| ----------------------- | --------: |
| Number of Processes     |         3 |
| Average Waiting Time    |  **4.33** |
| Average Turnaround Time | **11.33** |

### Result Analysis

- The scheduler always executes the process with the **shortest remaining execution time**.
- If a newly arrived process has a **shorter remaining burst time**, the currently running process is **preempted** immediately.
- This algorithm generally provides the **minimum average waiting time** among SJF-based scheduling methods.
- Compared to the non-preemptive version, it requires **continuous monitoring and decision-making**, increasing implementation complexity.
- Long-running processes may still suffer from **starvation** if shorter processes continue to arrive.

---

# 4. Summary of Findings and Challenges

---

## 4.1 First Come First Serve (FCFS)

### Findings

- Processes are executed strictly in the order of their arrival.
- FCFS is one of the simplest CPU scheduling algorithms to implement.
- No process is interrupted once execution begins.
- Scheduling decisions are straightforward because they only depend on arrival time.

### Challenges

- **Higher Average Waiting Time**
  - Waiting time is often greater than that of SJF because process length is not considered.

- **Convoy Effect**
  - A long process can delay all subsequent shorter processes, reducing CPU utilization and system responsiveness.

- **Limited Optimization**
  - The algorithm cannot optimize CPU allocation based on burst time or process priority.

---

## 4.2 Shortest Job First (SJF) – Non-Preemptive

### Findings

- Processes with the smallest CPU burst time are executed first.
- The algorithm generally achieves a lower average waiting time than FCFS.
- Once a process starts executing, it continues until completion.

### Challenges

- **Burst Time Prediction**
  - The CPU burst time must be estimated in advance, which is often difficult in real-world systems.

- **Implementation Complexity**
  - Selecting the shortest available job increases scheduling complexity compared to FCFS.

- **Starvation**
  - Longer processes may experience indefinite delays if shorter jobs continue to arrive.

---

## 4.3 Shortest Job First (SJF) – Preemptive (SRTF)

### Findings

- The scheduler always selects the process with the shortest remaining execution time.
- If a newly arrived process has a shorter remaining burst time, the currently running process is immediately preempted.
- SRTF generally provides the lowest average waiting time among the three scheduling algorithms.

### Challenges

- **Potential Starvation**
  - Long-running processes may be postponed repeatedly if shorter jobs continue to arrive.

- **Higher Implementation Complexity**
  - The scheduler must continuously monitor process arrivals and remaining execution times, increasing computational overhead.

- **Frequent Context Switching**
  - Because processes may be interrupted multiple times, the number of context switches increases, introducing additional system overhead.

---

# Overall Comparison

| Algorithm                   | Advantages                                             | Disadvantages                                                                      |
| --------------------------- | ------------------------------------------------------ | ---------------------------------------------------------------------------------- |
| **FCFS**                    | Simple, easy to implement, fair based on arrival order | High waiting time, Convoy Effect                                                   |
| **SJF (Non-Preemptive)**    | Lower average waiting time than FCFS                   | Requires burst-time prediction, possible starvation                                |
| **SJF (Preemptive / SRTF)** | Lowest average waiting time, better CPU utilization    | Highest implementation complexity, frequent context switching, possible starvation |

---

# Conclusion

Among the three scheduling algorithms implemented:

- **FCFS** is the simplest algorithm but often results in higher waiting and turnaround times due to the Convoy Effect.
- **SJF (Non-Preemptive)** improves overall performance by selecting the shortest available job but may cause starvation for longer processes.
- **SJF (Preemptive / SRTF)** offers the best scheduling efficiency by always executing the process with the shortest remaining time, although it introduces greater implementation complexity and additional context-switching overhead.

The experimental results showed that both **SJF (Non-Preemptive)** and **SJF (Preemptive / SRTF)** achieved an average waiting time of **4.33**, outperforming **FCFS**, which recorded an average waiting time of **5.67** for the given test case.
