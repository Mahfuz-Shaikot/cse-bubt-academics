#include <iostream>
#include <string>
using namespace std;

void allocate(int part[], int n, int proc[], int m, string type) {

    bool used[100] = {0};
    int frag = 0;
    int allocation[100];

    for (int i = 0; i < m; i++) {
        allocation[i] = -1;
    }

    cout << type << "\nAllocation: \n";

    for (int i = 0; i < m; i++) {

        int pos = -1;

        for (int j = 0; j < n; j++) {
            if (!used[j] && part[j] >= proc[i]) {
                pos = j;
                break;
            }
        }

        if (pos != -1) {
            allocation[i] = pos;
            used[pos] = true;
            frag += part[pos] - proc[i];
        }
    }


    for (int i = 0; i < m; i++) {
        if (allocation[i] != -1)
            cout << "Process " << i+1 << " (size " << proc[i] << ")  Partition " << allocation[i]+1 << "\n";
        else
            cout << "Process " << i+1 << " (size " << proc[i] << ") Not Allocated\n";
    }

    cout << "\nTotal Internal Fragmentation: " << frag << "\n\n";
}

int main() {
    int n, m, part[100], proc[100];

    cin >> n;
    for (int i = 0; i < n; i++) cin >> part[i];

    cin >> m;
    for (int i = 0; i < m; i++) cin >> proc[i];

    allocate(part, n, proc, m, "First Fit");
}
