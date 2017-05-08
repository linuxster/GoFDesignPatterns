package visitor;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Hangar implements StarshipPart {

    @Override
    public void accept(StarshipPartVisitor starshipPartVisitor) {
        starshipPartVisitor.visit(this);
    }
}
