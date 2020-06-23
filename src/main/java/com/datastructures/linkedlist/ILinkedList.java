package com.datastructures.linkedlist;

public class ILinkedList {
	private ILinkedList next;
	private String data;
	private int count;
	private ILinkedList head;
	
	public ILinkedList() {
		count = 0;
		next = null;
	}
	
	
	public int size() {
		return count;
	}
	
	private ILinkedList createNode(String data) {
		ILinkedList node = new ILinkedList();
		node.data = data;
		return node;
	}
	
	private ILinkedList getTailNode() {
		if(this.head == null) {
			return this.head;
		}
		ILinkedList tNode = this.head;
		while(tNode.next != null) {
			tNode = tNode.next;
		}
		return tNode;
	}
	
	public void insertAtBegin(String data) {
			count++;
			ILinkedList node = createNode(data);
			node.data = data;
			node.next = head;
			head = node;
	}
	public void insertAtEnd(String data) {
		ILinkedList node = createNode(data);
		if(count > 0) {
			getTailNode().next =  node;
		}else {
			this.head = node;
		}
		
		count++;
		
	}
	
	public void insert(String data, int position) {
		if(position > count || position < 0) {
			System.out.println("invalid position");
		}else {
			count++;
			if(position == 0) {
				insertAtBegin(data);
			}else {
				ILinkedList node = createNode(data);
				ILinkedList cNode = this.head;
				ILinkedList nNode = this.head.next;
				int index = 0;
				while(cNode !=null) {
					index++;
					if(index == position) {
						cNode.next = node;
						node.next = nNode;
						break;
					}
					cNode = cNode.next;
					nNode = cNode.next;
				}
			}
		}
		
	}
	
	
	public void removeMatched(String data) {
		if(count > 0) {
			ILinkedList cNode = this.head;
			ILinkedList pNode = null;
			while(cNode !=null) {
				if(cNode.data == data && pNode == null) {
					this.head = cNode.next;
					cNode = cNode.next;
					count--;
				}else if(cNode.data == data) {
					pNode.next = cNode.next;
					cNode = cNode.next;
					count--;
				}else {
					pNode = cNode;
					cNode = cNode.next;
				}
				
				
			}
		}else {
			System.out.println("List is empty");
		}
	}
	
	public void remove(int position) {
		if(count > 0) {
			ILinkedList cNode = this.head;
			ILinkedList pNode = null;
			int index = 0;
			while(cNode != null) {
				if(index == position && pNode == null) {
					this.head = cNode.next;
					count--;
					break;
				}else if(index == position) {
					pNode.next = cNode.next;
					count--;
					break;
				}else {
					pNode = cNode;
					cNode = cNode.next;
					index++;
				}
			}
		}else {
			System.out.println("List is empty");
		}
		
	}
	
	public void remove(String data) {
		ILinkedList cNode = this.head;
		ILinkedList pNode = null;
		if(count > 0) {
			while(cNode !=null) {
				if(cNode.data == data && pNode == null) {
					this.head = cNode.next;
					count--;
					break;
				}
				if(cNode.data == data) {
					pNode.next = cNode.next;
					count--;
					break;
				}
				pNode = cNode;
				cNode = cNode.next;
			}
		}else {
			System.out.println("List is empty");
		}
		
	}
	
	public void removeFirst() {
		if(count > 0) {
			this.head = this.head.next;
			count--;
		}else {
			System.out.println("List is empty");
		}
	}
	public void removeLast() {
		if(count > 0) {
			ILinkedList cNode = this.head;
			ILinkedList pNode = null;
			while(cNode!=null && cNode.next != null) {
				pNode = cNode;
				cNode = cNode.next;
			}
			pNode.next = null;
			count--;
		}else {
			System.out.println("No elements to remove");
		}
	}
	
	public int getPosition(String data) {
		int index = 0;
		if(count > 0) {
			ILinkedList cNode = this.head;
			while(cNode !=null) {
				if(cNode.data.equals(data)) {
					break;
				}
				index++;
			}
			return index;
		}else {
			System.out.println("List is empty");
		}
		
		return -1;
		
	}
	
	public void clearList() {
		count = 0;
		this.head = null;
	}
	
	public String toString() {
		ILinkedList cNode = this.head;
		String str = "[ ";
		while(cNode !=null) {
			str = str+cNode.data;
			cNode = cNode.next;
			if(cNode!=null) {
				str = str+" , ";
			}
		}
		return str+" ]";
	}
	
	public static void main(String ...a) {
		ILinkedList linkedList = new ILinkedList();
		
		linkedList.insert("11", 5);
		linkedList.remove(6);
		linkedList.remove("3");
		linkedList.insertAtEnd("4");
		linkedList.insertAtEnd("41");
		linkedList.insertAtBegin("34");
		linkedList.insert("320", 2);
		linkedList.insert("20", 0);
		System.out.println(linkedList.toString());
	}
	
	
}
