//Accept N numbers from users and accept nrange , display all elements from that range.
//Input   N    :   6 
// start         :   60
// End          :   90
//Elements  :  85   66   3   76   93    88

  #include<stdio.h>
  #include<stdlib.h>
   int main()
{
   int iSize = 0, iValue = 0;
   int *p = NULL;

   printf("Enter N numbers of elements : ");
   scanf("%d",&iSize);

   p = (int *)malloc(sizeof(iSize));
   if(p==NULL)
  {
    printf("Unable to allocate the number : \n");
    return -1;
  }
  else
  {
     printf("Memory allocated successfully \n");
  }

   Range(p,iSize,iValue);

  return 0;
}