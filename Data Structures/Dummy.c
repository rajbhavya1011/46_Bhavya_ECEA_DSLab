#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n;
    printf("Size of array to be entered\n");
    scanf("%d", &n);
    int* a = (int*) malloc(n * sizeof(int));
    printf("enter the array");
     for (int i = 0; i < n; i++)
     {
         scanf("%d",&a[i]);
     }
    printf("Sorted Array");
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
      printf("%d ",a[i]);
    }
//     // Resize the array
//     a = realloc(a, (n+1) * sizeof(int));
//     if(a == NULL)
//     {
//         printf("Memory allocation failed\n");
//         return 1;
//     }
//     int c=0;
//     for(int i = 0; i <= n; i++)
//     {
//         if(a[i]==NULL)
//         break;
//         c++;
//     }
//     printf("%d",c);

       free(a);
//     return 0;
    }

