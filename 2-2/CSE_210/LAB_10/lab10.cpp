#include <iostream>
#include <string>
using namespace std;

void allocate(const int part[], int n, const int proc[], int m, const string &type) {
    int used[100] = {0};
    int alloc[100];
    int frag = 0;

    for (int i = 0; i < m; i++) {
        alloc[i] = -1;
        int pos = -1;

        if (type == "First Fit") {
            for (int j = 0; j < n; j++) {
                if (!used[j] && proc[i] <= part[j]) {
                    pos = j;
                    break;
                }
            }
        } 
        else if (type == "Best Fit") {
            int best = 1e9;
            for (int j = 0; j < n; j++) {
                if (!used[j] && proc[i] <= part[j] && (part[j] - proc[i]) < best) {
                    best = part[j] - proc[i];
                    pos = j;
                }
            }
        } 
        else if (type == "Worst Fit") {
            int worst = -1;
            for (int j = 0; j < n; j++) {
                if (!used[j] && proc[i] <= part[j] && (part[j] - proc[i]) > worst) {
                    worst = part[j] - proc[i];
                    pos = j;
                }
            }
        }

        if (pos != -1) {
            alloc[i] = pos;
            used[pos] = 1;
            frag += part[pos] - proc[i];
        }
    }

    cout << type << "\nAllocation: ";
    for (int i = 0; i < m; i++) {
        cout << "P" << i + 1 << "->";
        if (alloc[i] == -1) cout << "Not Allocated";
        else cout << alloc[i] + 1;
        if (i < m - 1) cout << " ";
    }
    cout << "\nTotal Internal Fragmentation: " << frag << "\n";
}

int main() {
    int n, m;
    int part[100], proc[100];

    cin >> n;
    for (int i = 0; i < n; i++) cin >> part[i];
    cin >> m;
    for (int i = 0; i < m; i++) cin >> proc[i];

    allocate(part, n, proc, m, "First Fit");
    allocate(part, n, proc, m, "Best Fit");
    allocate(part, n, proc, m, "Worst Fit");

    return 0;
}
