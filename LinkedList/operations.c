// traversal
#include <stdio.h>
//#include <iostream.h>

traverse(struct node* head)
{
  if(head == null)
    printf("linked list empty");

  struct node *ptr;
  ptr = head;

  while(ptr != null)
  {
    printf("%d", ptr -> data);
    ptr = ptr -> next; 
  }
}

