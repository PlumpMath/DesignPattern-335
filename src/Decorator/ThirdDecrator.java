package Decorator;

public class ThirdDecrator extends OtherDecorator {
	public ThirdDecrator(ComponentInter d){
		super(d);
	}
	
	@Override
	public void mPrint() {
		component.mPrint();
		System.out.println("\t      �����۳��Ų��˿�");
		System.out.println("\t�����������������ⶪ��");
	}

}

/*
�����۳��Ų��˿�
�����������������ⶪ��

*/