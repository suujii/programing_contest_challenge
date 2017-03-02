/**
 * 이진 탐색 트리 구현
 */
package com.programing.contest.challenge.tree;

/**
 * @author SuJi, Lee
 *
 */
public class BinarySearchTree {
	private Node root;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {
			Node parent = root;
			Node current = root;
			boolean insertLeft = true;

			while (current != null) {
				parent = current;

				if (current.data == data) {
					throw new IllegalArgumentException("data is already exists");
				} else if (current.data > data) {
					current = current.left;
					insertLeft = true;
				} else {
					current = current.right;
					insertLeft = false;
				}
			}

			if (insertLeft) {
				parent.left = newNode;
			} else {
				parent.right = newNode;
			}
		}
	}

	public Node find(int data) {
		if (root == null) {
			return root;
		}

		Node current = root;

		while (current != null) {
			if (current.data == data) {
				return current;
			} else if (current.data > data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return current;
	}

	public Node findMin() {
		if (root == null) {
			return root;
		}

		Node parent = root;
		Node current = root;

		while (current != null) {
			parent = current;
			current = current.left;
		}

		return parent;
	}

	public Node findMax() {
		if (root == null) {
			return root;
		}

		Node parent = root;
		Node current = root;

		while (current != null) {
			parent = current;
			current = current.right;
		}
		return parent;
	}

	public Node delete(int data) {
		Node parent = root;
		Node current = root;

		while (current.data != data) {
			parent = current;

			if (current.data > data) {
				current = current.left;
			} else {
				current = current.right;
			}

			if (current == null) { //노드 없을 경우
				return null;
			}
		}

		Node node = current;
		if (current.left == null && current.right == null) {//leafNode 일때

			if (parent.left == current) {
				parent.left = null;
				current = null;
			} else {
				parent.right = null;
				current = null;
			}
		} else if (current.left != null && current.right == null) { //왼쪽자식 1개 있을 때
			if (parent.left == current) {
				parent.left = current.left;
				current = null;
			} else {
				parent.right = current.left;
				current = null;
			}
		} else if (current.left == null && current.right != null) { //오른쪽자식 1개 있을 때
			if (parent.left == current) {
				parent.left = current.right;
				current = null;
			} else {
				parent.right = current.right;
				current = null;
			}
		} else if (current.left != null && current.right != null) { //자식이 두 개 있을 때
			Node maxLeftNode = current.left;
			Node indexNode = current.left;

			while (indexNode != null) { // 왼쪽 자식 중 가장 큰 값 찾기
				maxLeftNode = indexNode;
				indexNode = indexNode.right;
			}

			if (maxLeftNode != null) { //왼쪽 자식이 존재하는 경우
			//				current.data = maxLeftNode.data;
			//				maxLeftNode.right = current.right;
			//				current.left = maxLeftNode.left;
			//				current.right = null;
			}

		}

		return node;
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}

	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}
}
