package kr.ac.jbnu.awp.spring.P2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 의존성을 주입받는 객체도 Bean으로 등록되어야 한다.
public class SoccerPlayer {
    @Autowired
    private SoccerBall ball;
	
    public String playSoccer() {
        return "축구선수가 공을 찼다! \n" + this.ball.touchBall();
    }
}

