class ReferencesToField  {
	
	int i;

	public void method1(){
		i = 2;
	}

}

private class ReferencesToFieldExtendingClass extends ReferencesToField {

	public void method2(){
		i = 2;
	}

}

