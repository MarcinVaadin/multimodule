package com.example.appone.views;

import com.vaadin.flow.component.textfield.TextField;

import com.vaadin.flow.component.button.Button;

import com.example.appone.MainLayout;
import com.example.shared.SharedUtil;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Home | App One")
public class HomeView extends VerticalLayout {

    public HomeView() {
        add(
            new H2("Welcome to App One"),
            new Paragraph(SharedUtil.getGreeting("App One"))
        );
Button button = new Button("Button");
add(button);
Button button2 = new Button("Button");
button2.setThemeName("primary");
add(button2);
TextField textField = new TextField("Text field");
add(textField);
    }
}
