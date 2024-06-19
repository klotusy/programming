import java.util.Scanner;

//메인 클래스
public class Gamelevel2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [] str={"가위","바위","보"};
    
    while(true)
    {
      try
      {
        System.out.println("<가위바위보 하나빼기 게임을 진행하겠습니다>");
        for(int i=0; i<str.length;i++)
            System.out.print(i+"."+str[i]+" / ");
        System.out.println("3. 종료하기");
        
        System.out.println("첫번째로 낼 것을 선택해주세요"); // 첫번째 낼것 input1 에 저장. 
        int input1=sc.nextInt();
        
        if(input1==3)
        {
          System.out.println("게임이 종료되었습니다"); 
          break;
        }
                
        System.out.println("두번째로 낼 것을 선택해주세요"); // 두번째 낼것 input2에 저장 
        int input2=sc.nextInt();
        
        if(input2==3)
        {
          System.out.println("게임이 종료되었습니다"); 
          break;
        }    
        
        int com1=(int)(Math.random()*3);
        int com2=(int)(Math.random()*3);
        
        System.out.println("사용자 : 1번["+str[input1]+"],2번["+str[input2]+"]");
        System.out.println("컴퓨터 : 1번["+str[com1]+"],2번["+str[com2]+"]");
        System.out.println("둘 중에 어떤것을 내시겠습니까?");
        int input3=sc.nextInt();
        
        int input4=input1;
        if(input3==2)   // 둘 중 하나 고른것 input4 에 저장. 
          input4=input2;
        
        int com4=com1;
        if(Math.random()>5) // 랜덤함수를 사용해서 컴퓨터가 2개 낸것 중 하나 고르도록. 
          com4=com2;
        
        String res="졌습니다.";
        
        if(input4==com4)
          res="무승부입니다.";
        else if(input4==0 && com4==2)
          res="이겼습니다.";
        else if(input4==1 && com4==0)
          res="이겼습니다.";
        else if(input4==2 && com4==1)
          res="이겼습니다.";
        
        System.out.println("게임 결과를 알려드리겠습니다");
        System.out.println("사용자 : "+str[input4]);
        System.out.println("컴퓨터 : "+str[com4]);
        System.out.println("결과 : "+res);
        System.out.println("");      
      }
      catch(Exception e)
      { 
    	  sc.close(); } //종료 
    }//while문 종료
  }
}