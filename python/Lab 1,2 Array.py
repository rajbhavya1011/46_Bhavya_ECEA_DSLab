def main():
    print("Size of array to be entered")
    n = int(input())
    a = [0]*n
    print("Enter the array")
    for i in range(n):
        a[i] = int(input())
    print("\nElements of array")
    for i in range(n):
        print(a[i], end=" ")
    print("\nEnter 1. for searching\n 2. for array reversal\n 3. to update elements\n 4. to insert element at specific position\n 5. To delete an element from a specified position\n 6. Sorting an array")
    val = int(input())
    while(val != 0):
        if val == 1:
            print("\nEnter no. to be searched")
            m = int(input())
            for i in range(n):
                if a[i] == m:
                    print("Number found")
                    break
        elif val == 2:
            a.reverse()
            print("Reversed Array: ")
            for i in range(n):
                print(a[i], end=" ")
        elif val == 3:
            for i in range(n):
                if a[i] % 2 == 0:
                    print(a[i]*2, end=" ")
                else:
                    print(a[i]+5, end=" ")
        elif val == 4:
            print("Enter index in which it needs to be entered")
            in_ = int(input())
            a.insert(in_, 0)
            print("Enter the element to be added")
            a[in_] = int(input())
            for i in range(n+1):
                print(a[i], end=" ")
        elif val == 5:
            print("Enter the element to be removed")
            p = int(input())
            a.remove(p)
            for i in range(n):
                print(a[i], end=" ")
        elif val == 6:
            a.sort()
            print("Sorted Array")
            for i in range(n):
                print(a[i], end=" ")
        print("\nEnter 0.to terminate 1. for searching\n 2. for array reversal\n 3. to update elements\n 4. to insert element at specific position\n 5. To delete an element from a specified position\n 6. Sorting an array")
        val = int(input())

if __name__ == "__main__":
    main()
