import java.util.*;
class Array 
{
public static void main(String args[])
{
  int  n , m ,in,val,p;
  Scanner sc =new Scanner(System.in);
     System.out.println("Size of array to be entered");
     n=sc.nextInt();
     int a[] = new int[n];
     System.out.println("enter the array");
     for (int i = 0; i < n; i++)
     {
        a[i]=sc.nextInt();
     }
     System.out.println("\nelements of array \n");
     for (int i = 0; i < n; i++)
     {
        System.out.println(a[i]);
     }
     System.out.println("\nEnter 1. for searching\n 2. for array reversal\n 3. to update elements\n 4. to insert element at specific position\n 5. To delete an element from a specified position\n 6. Sorting an array");
    val=sc.nextInt(); 
    while(val!=0)
    {    
    switch(val)
    {
      // traverse and search element in an aray //
      case 1:
      System.out.println("\nEnter no. to be searched\n");
      m = sc.nextInt();
     for (int i = 0; i < n; i++)
     {
       if (a[i] == m)
       {
        System.out.println("Number found\n");
        break;
       }
     }
     break;
     case 2:
     //array reversal
     for(int i=0;i<n/2;i++)
     {
      int t=a[i];
      a[i]=a[n-i-1];
      a[n-i-1]=t;
     }
     System.out.println("Reversed Array: \n");
     for (int i = 0; i < n; i++)
     {
        System.out.println(a[i]);
     }
     break;
     case 3:
     //updating element
     for(int i=0;i<n;i++)
     {
      if(a[i]%2==0)
      System.out.println(a[i]*2);
      else 
      System.out.println(a[i]+5);
     }
     break;
     case 4:
     // adding of an element in the array //
     int arr[] = new int[n+1];
     for(int i=0;i<n+1;i++)
     {
      arr[i]=a[i];
     }
     System.out.println("Enter index in which it needs to be entered");
     in=sc.nextInt();
     for (int i = n; i>in ; i--)
     {
          arr[i]=arr[i-1];
     }
     System.out.println("Enter the element to be added");
     arr[in]=sc.nextInt();
    for (int i = 0; i<n+1 ; i++)
    {
     System.out.println(arr[i]);
    }
    break;
     // removing of the element
    case 5:
    System.out.println("Enter the element to be removed");
    p=sc.nextInt();
     for (int i = 0; i < n; i++)
     {
       if(a[i]==p)
       {
        a[i]=a[i+1];
        while(i<n+1)
        {
        a[i]=a[i+1];
        i++;
        }
        break;
       }
     }
    for (int i = 0; i < n; i++)
    {
     System.out.println(a[i]);
    }
    break;
    case 6:
    System.out.println("Sorted Array");
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
        if(a[j+1]<a[j])
        {
        int t = a[j+1];
        a[j+1]=a[j];
        a[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
     System.out.println(a[i]);
    }
    break;
    }
    System.out.println("\nEnter 0.to terminate 1. for searching\n 2. for array reversal\n 3. to update elements\n 4. to insert element at specific position\n 5. To delete an element from a specified position\n 6. Sorting an array");
    val = sc.nextInt();
    }
}}
//write a menu driven program to input an array and perform following operations:
//1. Traversal array-Linear search for an element in array
//2. Array reversal
//3. updating the elements of array (Multiply the element at even indicies by 2 and add 5 to the element at odd indices)
//4. inserting an element at specified position
//5. Deleting an element from a speccified position
//6. Sorting an array 
