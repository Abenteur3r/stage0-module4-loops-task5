package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int i=0;i<height;i++){
            for(int j=0;j<height;j++){
                if (i <= j && i + j <= height - 1 && i < height / 2) {
                    System.out.print("8");
                } else if (i >= j && i + j >= height - 1 && i >= height / 2) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
