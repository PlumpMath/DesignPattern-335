package Decorator;

public class SecondDecorator extends OtherDecorator {
	public SecondDecorator(ComponentInter d){
		super(d);
	}
	
	
	@Override
	public void mPrint() {
		component.mPrint();
		System.out.println("**********************************");
		System.out.println("\t14�칺�ﱣ֤�������ʵ");
		System.out.println("\t�����е绰83688888");
		System.out.println("**********************************");
	}

}
/*
**********************
14�칺�ﱣ֤�������ʵ
�����е绰83688888
**********************

*/