// this is NOT a boilerplate. this is just to make explanations easier for various concepts.

#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node *next;
}


//traversal
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

// to insert in beginning
insertbeg(struct node *head, int info)
{
  struct node *new;
  new = (struct node*) malloc(sizeof(struct node));
  new -> data = info;
  new -> next = head;
  head = new;
  return head;
}

// to insert in the ending
insertend(struct node*head, int info)
{
  struct node *ptr *new;
  new = (struct node*) malloc(sizeof(struct node));
  
  new -> data = info;
  new -> next = head;
  
  ptr = head;
  if(ptr != null)
  {
    while(ptr -> next != null)
      ptr = ptr -> next;
      ptr -> next = new;
  }
  else 
    head = new;
  return head;
}

// to insert after a node
insertafter(struct node*head, int x, int info){
  struct node *ptr *new;
  new = (struct node*) malloc(sizeof(struct node));
  new -> data = info;
  ptr = head;
  
  while(ptr -> data != x && ptr != null)
    {
      ptr = ptr -> next;
    }
  if (ptr -> data == x)
    {
      new -> next = ptr -> next;
      ptr -> next = new;
    }
  return head;
}

int main() {

    struct Node* head = createNode(2);
    head->next = createNode(3);
    head->next->next = createNode(4);
    head->next->next->next = createNode(5);
    head->next->next->next->next = createNode(6);

    printf("Linked List:");
    printList(head);

    return 0;
}
