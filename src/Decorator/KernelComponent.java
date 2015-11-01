package Decorator;

public class KernelComponent implements ComponentInter {
	private Client client;
	
	public KernelComponent(Client client){
		this.client = client;
	}
	
	@Override
	public void mPrint() {
		for (Product p: client){
			System.out.println("\t" + p.getName() + " " + p.getSize() + "     \t" + p.getMomey());
		}
		System.out.println("");
		System.out.println("\t�ϼ�(�����)    \t" + client.getSum());
		
	}

}

/**
 ������ѧ����
----------------------------------
����330ml     2.5
��� 230g      4

�ϼ�(�����)    6.5

*/