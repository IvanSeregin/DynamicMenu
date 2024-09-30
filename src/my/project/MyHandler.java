package my.project;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

public class MyHandler extends AbstractHandler {

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return super.isHandled();
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MessageBox box = new MessageBox(Display.getCurrent().getActiveShell(), SWT.CANCEL | SWT.OK);
		box.setText("Title");
		box.setMessage("This will be the message");
		box.open();
		return null;
	}

}
