import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;



public class launcherMidlet extends MIDlet {

	public launcherMidlet() {
	}

	protected void destroyApp(boolean unconditional)
			throws MIDletStateChangeException {

	}

	protected void pauseApp() {

	}

	protected void startApp() throws MIDletStateChangeException {
		 Displayable current = Display.getDisplay(this).getCurrent();
	        if (current == null) {
	        	initialForm form = new initialForm(this, "Title");
	        	
//	        	form.append(item);
	        	Display.getDisplay(this).setCurrent(form);
	        }

	}

}
