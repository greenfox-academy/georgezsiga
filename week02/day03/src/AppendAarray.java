import java.util.Arrays;

/**
 * Created by georgezsiga on 3/22/17.
 */
// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end

public class AppendAarray {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macs", "cic"};
    for (int i = 0; i <nimals.length; i++) {
      nimals[i] += "a";
    }
    System.out.println(Arrays.toString(nimals));
  }
}
