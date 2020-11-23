package kr.ac.jbnu.awp.spring.P1;

import org.springframework.stereotype.*;

@Component
public class MessageServiceImp implements IMessageService{
   
   public String getMessage() {
      return "My name is Bokyung";
   }
   
   public int getMessage2() {
	      return 3;
   }
}

