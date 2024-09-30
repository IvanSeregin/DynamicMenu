package my.project;

import java.util.Collections;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;

public class MyCompoundContributionItem extends CompoundContributionItem {
	private static int counter = 0;
	
	public MyCompoundContributionItem() {
		// TODO Auto-generated constructor stub
	}

	public MyCompoundContributionItem(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IContributionItem[] getContributionItems() {
		return new IContributionItem[] {
				     new CommandContributionItem(PlatformUI.getWorkbench().getActiveWorkbenchWindow(),
				     "my.project.dynamicItem", "my.project.commandId",
				     Collections.emptyMap(), null, null, null,
				     "Dynamic Menu "+ counter++, null, null, SWT.NONE)
				   };
	}

}
