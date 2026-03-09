package com.example.apptwo.views;

import com.vaadin.flow.component.textfield.EmailField;

import com.vaadin.flow.component.button.Button;

import com.example.apptwo.MainLayout;
import com.example.shared.SharedUtil;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Home | App Two")
public class HomeView extends VerticalLayout {

    public HomeView() {
        add(
            new H2("Welcome to App Two"),
            new Paragraph(SharedUtil.getGreeting("App Two"))
        );
Button button = new Button("Button");
add(button);
Button button2 = new Button("Button");
add(button2);
EmailField email = new EmailField("Email");
add(email);
    }
}
