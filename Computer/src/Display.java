public class Display {
    //Экран:
    //диагональ,
    //тип (IPS, TN, VA),
    //вес.

    public final int diagonal;
    public final String typeMatrix;
    public final int weight;

    public Display(int diagonal, String typeMatrix, int weight){
        this.diagonal = diagonal;
        this.typeMatrix = typeMatrix;
        this.weight = weight;
    }
    public int getDiagonal() {
        return diagonal;
    }
    public String getTypeMatrix() {
        return typeMatrix;
    }
    public int getWeight() {
        return weight;
    }

    public String toString(){
        return "Диагональ: " + diagonal + " " +
                "Тип: " + typeMatrix + " " +
                "Вес: " + weight;
    }


}
