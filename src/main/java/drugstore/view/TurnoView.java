package drugstore.view;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route("turno/")
@PageTitle ("Abrir Turno")

public class TurnoView extends VerticalLayout {
    
    public TurnoView() {
        add(new H1 ("Abrir Turno"));
    }
}
