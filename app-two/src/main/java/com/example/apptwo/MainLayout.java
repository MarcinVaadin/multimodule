package com.example.apptwo;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout {

    public MainLayout() {
        DrawerToggle toggle = new DrawerToggle();
        H1 title = new H1("App Two");
        title.getStyle().set("font-size", "var(--lumo-font-size-l)").set("margin", "0");

        VerticalLayout navigation = new VerticalLayout();
        navigation.add(new RouterLink("Home", com.example.apptwo.views.HomeView.class));

        addToDrawer(navigation);
        addToNavbar(toggle, title);
    }
}
