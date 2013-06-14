import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

import com.nokia.mid.ui.orientation.Orientation;
import com.nokia.mid.ui.orientation.OrientationListener;


public class initialForm extends Form implements CommandListener, OrientationListener  {

	private final launcherMidlet midlet;
	private final Command exitcommand;
	public initialForm(launcherMidlet midlet, String title) {
		super("WebApp Launcher");
		this.midlet = midlet;
        Orientation.addOrientationListener(this);
        exitcommand = new Command("Exit", Command.EXIT, 1);
        addCommand(exitcommand);
        setCommandListener(this);
        
		
		// TODO Auto-generated constructor stub
	}

	public void commandAction(Command c, Displayable d) {
		if(c == exitcommand){
			midlet.notifyDestroyed();
		}
	}

	public void displayOrientationChanged(int newDisplayOrientation) {
		Orientation.setAppOrientation(newDisplayOrientation);
	}

}
