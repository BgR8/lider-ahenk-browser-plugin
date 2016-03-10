package tr.org.liderahenk.browser.plugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tr.org.liderahenk.liderconsole.core.ui.GenericEditorInput;
import tr.org.liderahenk.browser.plugin.i18n.Messages;

public class SampleProfileHandler extends AbstractHandler {

	private Logger logger = LoggerFactory.getLogger(SampleProfileHandler.class);

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        IWorkbenchPage page = window.getActivePage();
        
        try {
			page.openEditor(new GenericEditorInput("", Messages.getString("PROFILE_EDITOR")), "tr.org.liderahenk.browser.plugin.editors.SampleProfileEditor");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
        
        return null;
	}

}