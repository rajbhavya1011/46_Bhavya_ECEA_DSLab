#include <stdio.h>

int binary(int e, int arr[e], int s, int x) {
    if (s <= e) {
        int m = (s + e) / 2;
        if (arr[m] == x)
            return 1; // Element found
        else if (arr[m] < x)
            return binary(e, arr, m + 1, x);
        else
            return binary(m - 1, arr, s, x);
    }
    return -1; // Element not found
}

int main() {
    int n, s;
    printf("Size of array to be entered: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the array: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j + 1] < arr[j]) {
                int t = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = t;
            }
        }
    }

    printf("Enter the number to be searched: ");
    scanf("%d", &s);
    int result = binary(n - 1, arr, 0, s);
    if (result == 1)
        printf("Number found.\n");
    else
        printf("Number not found.\n");

    return 0;
}