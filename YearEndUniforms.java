package br.com.digitalinnovationone.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class YearEndUniforms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Tshirt> uniform = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            String owner = scanner.nextLine();
            String uniformDetails = scanner.nextLine();
            String[] colorAndSize = uniformDetails.split(" ");
            Tshirt details = new Tshirt(colorAndSize[0], colorAndSize[1], owner);
            uniform.add(details);
        }
        scanner.close();
        Collections.sort(uniform, new Comparator<Tshirt>() {
            @Override
            public int compare(Tshirt uniform1, Tshirt uniform2) {

                int answer = uniform1.getColor().compareTo(uniform2.getColor());
                if(answer == 0){

                    answer = uniform1.getSize().compareTo(uniform2.getSize());
                    if(answer == 0)
                    {
                        answer = uniform1.getOwner().compareTo(uniform2.getOwner());
                    } else {
                        answer = -answer;
                    }
                }
                return answer;
            }
        });
        uniform.forEach((it)-> System.out.println(it.getColor()+" "+it.getSize()+" "+it.getOwner()));
    }
}

class Tshirt{

    private String size;
    private String color;
    private String owner;

    public Tshirt(String color, String size, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}