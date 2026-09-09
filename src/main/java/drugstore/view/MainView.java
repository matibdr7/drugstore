    package drugstore.view;

    import com.vaadin.flow.component.UI;
    import com.vaadin.flow.component.button.Button;
    import com.vaadin.flow.component.html.H1;
    import com.vaadin.flow.component.html.H2;
    import com.vaadin.flow.component.html.H4;
    import com.vaadin.flow.component.orderedlayout.VerticalLayout;
    import com.vaadin.flow.router.PageTitle;
    import com.vaadin.flow.router.Route;

    @Route("")
    @PageTitle("Arcoiris Drugstore")

    public class MainView extends VerticalLayout {

        public MainView() {

            add(new H1 ("Arcoiris Drugstore"));
            add(new H2 ("Sistema de Gestion"));

            add(new H4 ("Opciones:"));

            add(new Button("Abrir Turno", event -> UI.getCurrentOrThrow().navigate(TurnoView.class)));
            add(new Button("Resumen Diario"));
            add(new Button("Resumen Semanal"));
        }
    }
