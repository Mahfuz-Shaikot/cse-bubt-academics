#include <iostream>
using namespace std;

int main() {
    int n, m;
    cout << "Enter the no. of processes: ";
    cin >> n;
    cout << "Enter the no. of resources: ";
    cin >> m;

    int alloc[10][10], maxm[10][10], avail[10];
    int need[10][10], finish[10] = {0};

    cout << "\nEnter allocation matrix:\n";
    for (int i = 0; i < n; i++) {
        cout << "Process " << i + 1 << ": ";
        for (int j = 0; j < m; j++) {
            cin >> alloc[i][j];
        }
    }

    cout << "\nEnter maximum matrix:\n";
    for (int i = 0; i < n; i++) {
        cout << "Process " << i + 1 << ": ";
        for (int j = 0; j < m; j++) {
            cin >> maxm[i][j];
        }
    }

    cout << "\nEnter available resources: ";
    for (int j = 0; j < m; j++) {
        cin >> avail[j];
    }

    cout << "\nNeed matrix:\n";
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            need[i][j] = maxm[i][j] - alloc[i][j];
            cout << need[i][j] << " ";
        }
        cout << endl;
    }

    // Safety algorithm
    int safeSeq[10], count = 0;
    int work[10];
    for (int i = 0; i < m; i++) work[i] = avail[i];

    while (count < n) {
        bool found = false;
        for (int i = 0; i < n; i++) {
            if (!finish[i]) {
                bool canAllocate = true;
                for (int j = 0; j < m; j++) {
                    if (need[i][j] > work[j]) {
                        canAllocate = false;
                        break;
                    }
                }

                if (canAllocate) {
                    for (int k = 0; k < m; k++)
                        work[k] += alloc[i][k];

                    safeSeq[count++] = i;
                    finish[i] = 1;
                    found = true;
                }
            }
        }

        if (!found) {
            cout << "\nThe system is not in a safe state.\n";
            return 0;
        }
    }

    cout << "\nThe system is in a safe state.\nSafe sequence is: < ";
    for (int i = 0; i < n; i++)
        cout << "P" << safeSeq[i] + 1 << (i < n - 1 ? " " : " ");
    cout << ">\n";

    return 0;
}
