package drugstore.view;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route("turno")
@PageTitle ("Abrir Turno")

public class TurnoView extends VerticalLayout {
    
    public TurnoView() {
        add(new H1 ("Abrir Turno"));

        ComboBox<String> comboBox = new ComboBox<>("Empleado");
        comboBox.setItems("Franco", "Ceci", "Marce", "Mati");

        add(comboBox);
        add(new Button("Abrir turno", event -> {
            if(comboBox.getValue() != null){
                String seleccionado = comboBox.getValue();
                Notification.show("Turno abierto para: "+seleccionado);
            }
            else{
                Notification.show("Porfavor, selecciona un empleado");
            }
        }));    
    }
}
