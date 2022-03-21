package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import edu.umb.cs680.hw05.Escalator;
import edu.umb.cs680.hw05.Operating;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.Stopped;

import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw05.Escalator;
import edu.umb.cs680.hw05.Operating;
import edu.umb.cs680.hw05.StandBy;
import edu.umb.cs680.hw05.Stopped;

class OperatingTest {

	@Test
	public void getInstanceReturnIdenticalInstance() {
		Operating operating1 = Operating.getInstance();
		Operating operating2 = Operating.getInstance();
		assertSame(operating1, operating2);
	}
		
	@Test
	public void startButtonPushedTest() {
	Escalator e = Escalator.getInstance();
	Operating operating = Operating.getInstance();
	e.changeState(operating);
	operating.startButtonPushed();
	assertSame(Operating.getInstance(), e.getState());
	}

	@Test
	public void stopButtonPushedTest() {
		Escalator e = Escalator.getInstance();
		Operating operating = Operating.getInstance();
		operating.stopButtonPushed();
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
		Operating operating = Operating.getInstance();
		e.changeState(operating);
		e.motionNotDetected();
		assertSame(e.getState(), StandBy.getInstance());
	}
}
