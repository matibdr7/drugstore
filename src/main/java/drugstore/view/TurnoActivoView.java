package drugstore.view;

import java.time.LocalDateTime;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinSession;

@Route("turno-activo")
@PageTitle("Turno Activo")

public class TurnoActivoView extends VerticalLayout{


    public TurnoActivoView(){

        Turno turno = (Turno) VaadinSession.getCurrent().getAttribute("turnoActual");

        if(turno!=null){
            add(new H1("Le atiende: " + turno.getNombre()));
            add(new H2("Hora de apertura: "+turno.getApertura()));
            add(new H2("Hora actual: "+LocalDateTime.now()));
        }
        else{
            Notification.show("No hay ningun turno abierto");
        }

        add(new Button("Cerrar turno", event -> {
            turno.setCierre(LocalDateTime.now());
            Notification.show("Turno cerrrado con exito");
            VaadinSession.getCurrent().setAttribute("turnoActual", null);
            UI.getCurrentOrThrow().navigate(TurnoView.class);
        }));

    }
}
