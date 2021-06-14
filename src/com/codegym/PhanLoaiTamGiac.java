package com.codegym;

public class PhanLoaiTamGiac {
    public static String tamGiac(double side1, double side2, double side3) {
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            if (side1 * side1 == side2 * side2 + side3 * side3 ||
                    side2 * side2 == side1 * side1 + side3 * side3 ||
                    side3 * side3 == side2 * side2 + side1 * side1) {
                System.out.println("Tam giác vuông!");
            } else if (side1 == side2 && side2 == side3) {
                System.out.println("tam giác đều!");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Tam giac can!");
            } else {
                System.out.println("tam giac thuong!");
            }
        } else {
            System.out.println("Ba canh side khong phai la ba canh cua mot tam giac!");
        }

        return "tam giac vuong";
    }

}
