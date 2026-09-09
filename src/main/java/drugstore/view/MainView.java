package drugstore.view;

import com.vaadin.flow.component.card.Card;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("")
@PageTitle("Home Page")

public class MainView extends VerticalLayout {

    public MainView() {
        add("DRUGSTORE \n Sistema de gestion");

        Card card = new Card();
        card.setTitle("Titulo de la card");

        Paragraph p1 = new Paragraph(
            """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                    """
        );

        card.add(p1);
        add(card);

    }
}
