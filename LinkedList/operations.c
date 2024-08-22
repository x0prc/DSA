// traversal
#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node *next;
}

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

insertbeg(struct node *head, int info)
{
  struct node *new;
  new = (struct node*) malloc(sizeof(struct node));
  new -> data = info;
  new -> next = head;
  head = new;
  return head;
}


