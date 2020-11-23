package kr.ac.jbnu.awp.spring.P2;

import org.springframework.stereotype.Component;

@Component("adidasBall") // adidasBall이란 이름을 가진 Bean으로 등록
public class AdidasSoccerBall implements SoccerBall {
  public String touchBall() {
      return "아디다스 축구공이 굴러간다!";
  }
}
