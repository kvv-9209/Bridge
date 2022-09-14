package chess_project;

public class BaseFigure extends Figure{
    public BaseFigure(FigureImpl implementor) {
        super(implementor);
    }
    public void getMove() {
        implementor.getMove();
    }
}
