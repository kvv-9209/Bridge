package chess_project;

public abstract class Figure {
    FigureImpl implementor;

    public Figure(FigureImpl implementor) {
        this.implementor = implementor;
    }
}
