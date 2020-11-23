package kr.ac.jbnu.awp.spring.P1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
   final private IMessageService service;
   
   @Autowired
   public MessagePrinter(IMessageService service) {
      this.service = service;
   }
   
   public void printMessage() {
      System.out.println("이름은 : " + this.service.getMessage());
      System.out.println("학년은 : " + this.service.getMessage2());
   }
   
}

