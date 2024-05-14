package new1;

class Grand_Parent {

	static void add() {
		System.out.println("Grand parent Addition method");

	}
}
	class Parent extends Grand_Parent {
		void mul() {
			System.out.println("Parent Multiplication method");

		}
	}

	public class MultilevelInheritance extends Parent {

		public static void main(String[] args) {

			MultilevelInheritance m1 = new MultilevelInheritance();
			m1.mul();
			add();
		}
	}




