package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandByTest {
	@Test
	public void getInstanceReturnIdenticalInstance() {
		StandBy standby1 = StandBy.getInstance();
		StandBy standby2 = StandBy.getInstance();
		assertSame(standby1, standby2);
	}
		
	@Test
	public void startButtonPushedTest() {
	Escalator e = Escalator.getInstance();
	StandBy standby = StandBy.getInstance();
	e.changeState(standby);
	standby.startButtonPushed();
	assertSame(Operating.getInstance(), e.getState());
	}

	@Test
	public void stopButtonPushedTest() {
		Escalator e = Escalator.getInstance();
		StandBy standby = StandBy.getInstance();
		standby.stopButtonPushed();
		assertSame( Stopped.getInstance() , e.getState());
	}

	@Test
	public void motionDetectedTest() {
		Escalator e = Escalator.getInstance();
		e.motionDetected();
		assertSame(e.getState(), Operating.getInstance());
	}

	@Test
	public void motionNotDetectedTest() {
		Escalator e = Escalator.getInstance();
		StandBy standby = StandBy.getInstance();
		e.changeState(standby);
		e.motionNotDetected();
		assertSame(e.getState(), StandBy.getInstance());
	}

}
