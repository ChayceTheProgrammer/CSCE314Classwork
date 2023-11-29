package FinalKeyword;

public class Derived extends Base{
	
		private int subData;
		
		//should make as many constructors as the base class has to include all possibilities 
		public Derived (int b, int d) {
			super(b); //sending b to super class
			subData = d;
		}
		
		public Derived(int a) {
			// TODO Auto-generated constructor stub
			super(a);
			
		}
		
		public void setSubData(int n) {subData = n;}

		public int getSubData() {return subData;}
		
		/*
		//should not compile b/c of the 'final' keyword in 'Base' class
		public String toString() {
			return super.toString() + "\n" + 
				   "subclass's data " + getSubData();
		}
		*/
		
		
		//overriding toString2() method from the base
		public String toString2() {
			return super.toString() +  "\n" +
					"subclass's data " + getSubData();
		}

}
