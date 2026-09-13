package drugstore.view;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.time.LocalDateTime;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinSession;

@Route("turno")
@PageTitle ("Abrir Turno")

public class TurnoView extends VerticalLayout {

    private Turno turnoActual;
    
    public TurnoView() {
        add(new H1 ("Abrir Turno"));

        ComboBox<String> comboBox = new ComboBox<>("Empleado");
        comboBox.setItems("Franco", "Ceci", "Marce", "Mati");

        add(comboBox);
        add(new Button("Abrir turno", event -> {
            if(comboBox.getValue() != null){
                if(turnoActual == null){

                    turnoActual = new Turno(
                        comboBox.getValue(), 
                        LocalDateTime.now()
                    );

                    VaadinSession.getCurrent().setAttribute("turnoActual", turnoActual);

                    Notification.show("Turno creado para: "+comboBox.getValue());
                    UI.getCurrentOrThrow().navigate(TurnoActivoView.class);
                }
                else{
                    Notification.show("Ya existe un turno abierto, cierralo antes de abrir uno nuevo");
                }
            }
            else{
                Notification.show("Porfavor, selecciona un empleado");
            }
        }));    
    }
}
