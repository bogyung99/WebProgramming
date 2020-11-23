package kr.ac.jbnu.awp.spring.P2;

import org.springframework.stereotype.Component;

@Component("nikeBall") // nikeBall이란 이름을 가진 Bean으로 등록
public class NikeSoccerBall implements SoccerBall {
  public String touchBall() {
      return "나이키 축구공이 굴러간다!";
  }
}

