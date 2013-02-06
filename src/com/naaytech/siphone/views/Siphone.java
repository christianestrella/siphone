package com.naaytech.siphone.views;

import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.naaytech.siphone.core.lang.L;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

public class Siphone {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Siphone window = new Siphone();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.MIN | SWT.NONE);
		shell.setSize(350, 460);
		shell.setText(L.get("siphone.title", "Siphone"));
		
		final Menu mnuSiphoneMenuBar = new Menu(shell, SWT.BAR);
		shell.setMenuBar(mnuSiphoneMenuBar);
		
		MenuItem mntmSiphoneArchiveSubmenu = new MenuItem(mnuSiphoneMenuBar, SWT.CASCADE);
		mntmSiphoneArchiveSubmenu.setText(L.get("mntmSiphoneArchiveSubmenu.text", "&Archivo"));
		
		Menu mnuSiphoneArchiveMenu = new Menu(mntmSiphoneArchiveSubmenu);
		mntmSiphoneArchiveSubmenu.setMenu(mnuSiphoneArchiveMenu);
		
		MenuItem mntmSiphoneExitItem = new MenuItem(mnuSiphoneArchiveMenu, SWT.NONE);
		mntmSiphoneExitItem.setText(L.get("mntmSiphoneExitItem.text", "&Salir"));
		
		MenuItem mntmSiphoneToolsSubmenu = new MenuItem(mnuSiphoneMenuBar, SWT.CASCADE);
		mntmSiphoneToolsSubmenu.setText("&Herramientas");
		
		Menu mnuSiphoneToolsMenu = new Menu(mntmSiphoneToolsSubmenu);
		mntmSiphoneToolsSubmenu.setMenu(mnuSiphoneToolsMenu);
		
		MenuItem mntmSiphoneOptionsItem = new MenuItem(mnuSiphoneToolsMenu, SWT.NONE);
		mntmSiphoneOptionsItem.setText(L.get("mntmSiphoneOptionsItem.text", "&Opciones"));
		
		MenuItem mntmSiphoneLogsItem = new MenuItem(mnuSiphoneToolsMenu, SWT.NONE);
		mntmSiphoneLogsItem.setText("&Registro");
		
		MenuItem mntmSiphoneHelpSubmenu = new MenuItem(mnuSiphoneMenuBar, SWT.CASCADE);
		mntmSiphoneHelpSubmenu.setText("A&yuda");
		
		Menu mnuSiphoneHelpMenu = new Menu(mntmSiphoneHelpSubmenu);
		mntmSiphoneHelpSubmenu.setMenu(mnuSiphoneHelpMenu);
		
		MenuItem mntmSiphoneAboutItem = new MenuItem(mnuSiphoneHelpMenu, SWT.NONE);
		mntmSiphoneAboutItem.setText("A&cerca de Siphone");
		
		ToolBar tlbSiphoneFooterAccountsBar = new ToolBar(shell, SWT.FLAT | SWT.RIGHT);
		tlbSiphoneFooterAccountsBar.setBounds(0, 394, 346, 23);
		
		final Tree tree = new Tree(shell, SWT.BORDER);
		tree.setBounds(10, 53, 326, 335);
		
		Button cmdSiphoneNewCall = new Button(shell, SWT.NONE);
		cmdSiphoneNewCall.setBounds(10, 5, 39, 40);
		cmdSiphoneNewCall.setImage(SWTResourceManager.getImage(Siphone.class, "/com/naaytech/siphone/core/resources/glyphicons_169_phone.png"));
		cmdSiphoneNewCall.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		
		Button cmdSiphoneAddressBook = new Button(shell, SWT.NONE);
		cmdSiphoneAddressBook.setImage(SWTResourceManager.getImage(Siphone.class, "/com/naaytech/siphone/core/resources/glyphicons_088_adress_book.png"));
		cmdSiphoneAddressBook.setBounds(55, 5, 39, 40);
		cmdSiphoneAddressBook.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		
		Button cmdSiphoneLine3 = new Button(shell, SWT.TOGGLE);
		cmdSiphoneLine3.setBounds(255, 24, 23, 23);
		cmdSiphoneLine3.setText("3");
		cmdSiphoneLine3.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		//cmdSiphoneLine3.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_YELLOW));
		
		Button cmdSiphoneLine4 = new Button(shell, SWT.NONE);
		cmdSiphoneLine4.setText("4");
		cmdSiphoneLine4.setBounds(284, 24, 23, 23);
		cmdSiphoneLine4.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		
		Button cmdSiphoneLine5 = new Button(shell, SWT.TOGGLE);
		cmdSiphoneLine5.setText("5");
		cmdSiphoneLine5.setBounds(313, 24, 23, 23);
		cmdSiphoneLine5.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		
		Button cmdSiphoneLine2 = new Button(shell, SWT.TOGGLE);
		cmdSiphoneLine2.setText("2");
		cmdSiphoneLine2.setBounds(226, 24, 23, 23);
		cmdSiphoneLine2.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		
		Button cmdSiphoneLine1 = new Button(shell, SWT.TOGGLE);
		cmdSiphoneLine1.setText("1");
		cmdSiphoneLine1.setBounds(197, 24, 23, 23);
		cmdSiphoneLine1.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		
		Label lblSiphoneStatusLine1 = new Label(shell, SWT.BORDER);
		lblSiphoneStatusLine1.setBounds(197, 10, 23, 13);
		
		Label lblSiphoneStatusLine2 = new Label(shell, SWT.BORDER);
		lblSiphoneStatusLine2.setBounds(226, 10, 23, 13);
		
		Label lblSiphoneStatusLine3 = new Label(shell, SWT.BORDER);
		lblSiphoneStatusLine3.setBounds(255, 10, 23, 13);
		
		Label lblSiphoneStatusLine4 = new Label(shell, SWT.BORDER);
		lblSiphoneStatusLine4.setBounds(284, 10, 23, 13);
		
		Label lblSiphoneStatusLine5 = new Label(shell, SWT.BORDER);
		lblSiphoneStatusLine5.setBounds(313, 10, 23, 13);
		//cmdSiphoneLine1.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_GREEN));
	}
}
