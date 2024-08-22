#include <stdio.h>
#include <stdlib.h>

struct node {
  int data;
  struct node *next;
}

// deletion from beginning
delfirst(struct node *head)
{
  struct node *ptr;
  if(head == null){
    printf("list is already empty");
  }
  else {
    ptr = head;
    head = head -> next;
    free(ptr);
  }
  return head;
}

//deletion from end
del_last(struct node *head){
  struct node *ptr, *prep
  if(head == null)
    printf("list is empty");
  
  elseif(head -> next == null)
  {
    free(head);
    head = null;
  }

  else {
    ptr = head;
    while(ptr -> next != null){
      prep = ptr;
      ptr = ptr -> next;
    }
    prep -> next = null;
    free(ptr);
  }

  return head;

}

//deletion after a node
delete_after(struct node *head, int key){
  struct node = *ptr1, *ptr2;
  ptr1 = head;
  
while(ptr1 -> next != null){
  if(ptr1 -> data == key)
  {
    ptr2 = ptr1 -> next;
    ptr1 -> next = ptr2 -> next;
    free(ptr2);
    break;
  }
  ptr1 = ptr1 -> next;
}

return head;

}

//driver code
int main(){

  struct node* head = createNode(2);
  head -> next = createNode(3);
  head -> next -> next = createNode(4);
  head -> next -> next -> next = createNode(5);
  head -> next -> next -> next -> next = createNode(6);

  printList(head);
}
