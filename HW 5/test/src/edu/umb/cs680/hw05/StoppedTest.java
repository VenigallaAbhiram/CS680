package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StoppedTest {
	@Test
	public void getInstanceReturnIdenticalInstance() {
		Stopped stopped1 = Stopped.getInstance();
		Stopped stopped2 = Stopped.getInstance();
		assertSame(stopped1, stopped2);
	}
		
	@Test
	public void startButtonPushedTest() {
	Escalator e = Escalator.getInstance();
	Stopped stopped = Stopped.getInstance();
	e.changeState(stopped);
	stopped.startButtonPushed();
	assertSame(StandBy.getInstance(), e.getState());
	}
	
	@Test
	public void stopButtonPushedTest() {
		Escalator e = Escalator.getInstance();
		Stopped stopped = Stopped.getInstance();
		e.stopButtonPushed();
		assertSame( stopped , e.getState());
	}
	
	@Test
	public void motionDetectedTest() {
		Escalator e = Escalator.getInstance();
		e.motionDetected();
		assertSame(e.getState(), Stopped.getInstance());
	}
	
	@Test
	public void motionNotDetectedTest() {
		Escalator e = Escalator.getInstance();
		Stopped stopped = Stopped.getInstance();
		e.changeState(stopped);
		stopped.motionNotDetected();
		assertSame(e.getState(), Stopped.getInstance());
	}


}
