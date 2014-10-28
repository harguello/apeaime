package com.example.test;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("valo")
public class TestUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = TestUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		
		layout.setMargin(true);
		setContent(layout);
		String mycommand;
		MenuBar menu = new MenuBar();
		layout.addComponent(menu);
		
		MenuItem item1 = menu.addItem("Rutas",null ,null);
		item1.addItem("Nuevo", null, null);
		MenuItem item2 = menu.addItem("Nuevo", null,null);
		
		MenuItem snacks = menu.addItem("Snacks", null, null);
		snacks.addItem("Weisswurst", null, null);
		snacks.addItem("Bratwurst",  null, null);
		snacks.addItem("Currywurst", null, null);
		snacks.addItem("Currywurstii", null, null);
		
		//probando nuevo commit
		

		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(button);
	}

}