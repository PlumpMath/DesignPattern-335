package Decorator;

public class FirstDecorator extends OtherDecorator {

	public FirstDecorator(ComponentInter d) {
		super(d);
	}

	@Override
	public void mPrint() {
		System.out.println("\t           ������ѧ����");
		System.out.println("----------------------------------");
		component.mPrint();
	}

}
