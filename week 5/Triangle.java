public class Triangle {

    private int side1;
    private int side2;
    private int side3;

    void setSides(int tiangleSide1, int tiangleSide2, int tiangleSide3) {
        side1 = tiangleSide1;
        side2 = tiangleSide2;
        side3 = tiangleSide3;
    }

    boolean isScalene() {
        if (side1 != side2 && side1 != side3 && side3 != side2) {
            return true;
        }

        return false;
    }

    boolean isIsosceles() {

        if ((side1 == side2 && side1 != side3) || (side2 == side3 && side1 != side3)
                || (side3 == side1 && side1 != side2)) {
            return true;
        }

        return false;
    }

    boolean isEquilateral() {

        if (side1 == side2 && side3 == side2) {
            return true;
        }
        return false;
    }

    int calculatePerimeter() {
        return (side1 + side2 + side3);
    }

}