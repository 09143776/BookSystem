package System;

import java.util.ArrayList;
import org.junit.Test;

public class SystemTest {
	Member member1 = new Member();
	Member member2 = new Member();
	Member member3 = new Member();
	Book book1 = new Book("01", "ISBN-1", "呼啸山庄");
	Book book2 = new Book("02", "ISBN-2", "悲伤世界");
	Book book3 = new Book("03", "ISBN-3", "简爱");
	Book book4 = new Book("04", "ISBN-4", "巴黎圣母院");
	Member loanmember = member1;
	Book loanbook = book1;
	ArrayList<Loan> Loans = new ArrayList<Loan>();

	public SystemTest() {
		/*
		 * 
		 * 
		 * 
		 * 借书人*/
		member1.setId("1");
		member1.setName("保罗");
			
		/*
		 * 
		 * 
		 * 记录*/
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
	     * 借书  */
	public void Loan() {
		 Loan loan=loanmember.Loan(loanbook);
		 if(!(loan==null)){
		 System.out.println("恭喜，此次借书成功！");
		 System.out.println("您的借书时间: " +
		 loan.getLoanDate()+
		 " 借书人: " + loanmember.getName()+
		 " 您的借阅书籍: " + loanbook.getTitle()+
		 " 到期时间: " + loan.getDateForReuturn());
		 }
		 else{
		 System.out.println("抱歉，此次借书失败！");
		 }

	}
	
	    @Test
	       /* 
	        * 
	        * 
	        *   测试 */
	public void rule(){
	LoanOnlyOneSpecification one = new LoanOnlyOneSpecification(loanbook);
	System.out.println(one.IsSatisfiedBy(loanmember));		
	}


}
