package System;

import java.util.ArrayList;
import org.junit.Test;

public class SystemTest {
	Member member1 = new Member();
	Member member2 = new Member();
	Member member3 = new Member();
	Book book1 = new Book("01", "ISBN-1", "��Хɽׯ");
	Book book2 = new Book("02", "ISBN-2", "��������");
	Book book3 = new Book("03", "ISBN-3", "��");
	Book book4 = new Book("04", "ISBN-4", "����ʥĸԺ");
	Member loanmember = member1;
	Book loanbook = book1;
	ArrayList<Loan> Loans = new ArrayList<Loan>();

	public SystemTest() {
		/*
		 * 
		 * 
		 * 
		 * ������*/
		member1.setId("1");
		member1.setName("����");
			
		/*
		 * 
		 * 
		 * ��¼*/
		Loan loan2 = new Loan();
		loan2.setMember(loanmember);
		loan2.setBook(book2);
		Loans.add(loan2);				
		loanmember.setLoans(Loans);
	}

	   @Test
	    /* 
	     * 
	     * 
	     * ����  */
	public void Loan() {
		 Loan loan=loanmember.Loan(loanbook);
		 if(!(loan==null)){
		 System.out.println("��ϲ���˴ν���ɹ���");
		 System.out.println("���Ľ���ʱ��: " +
		 loan.getLoanDate()+
		 " ������: " + loanmember.getName()+
		 " ���Ľ����鼮: " + loanbook.getTitle()+
		 " ����ʱ��: " + loan.getDateForReuturn());
		 }
		 else{
		 System.out.println("��Ǹ���˴ν���ʧ�ܣ�");
		 }

	}
	
	    @Test
	       /* 
	        * 
	        * 
	        *   ���� */
	public void rule(){
	LoanOnlyOneSpecification one = new LoanOnlyOneSpecification(loanbook);
	System.out.println(one.IsSatisfiedBy(loanmember));		
	}


}
