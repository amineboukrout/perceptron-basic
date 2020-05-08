import java.util.Random;

public class perceptron {
    public double[] weights;

    public static int perceptron(double[] weight, double[] input){
        final int no_of_weights = weight.length;
        int final_output;

        double sum = 0;
        for (int i = 0; i < no_of_weights; i++)
            sum += weight[i] * input[i];

        // obtain final output
        final_output = (sum>0) ? 1 : 0;
        return final_output;
    }

    public static void main(String[] args){
        System.out.println("helllllllllo java");
    }
}
