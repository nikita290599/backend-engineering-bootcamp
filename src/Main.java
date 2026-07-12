//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 String s = "MCMXCIV";
    Map<Character, Integer> romanNumeral = new HashMap<>();

    // Add key-value pairs using put()
    romanNumeral.put('I', 1);
    romanNumeral.put('V', 5);
    romanNumeral.put('X', 10);
    romanNumeral.put('L', 50);
    romanNumeral.put('C', 100);
    romanNumeral.put('D', 500);
    romanNumeral.put('M', 1000);
    // Retrieve a value using get()


    int sum = romanNumeral.get(s.charAt(s.length()-1));
    for (int i = s.length()-1; i>0; i--) {
        int currentKey= romanNumeral.get(s.charAt(i));
        int previouskey = romanNumeral.get(s.charAt(i-1));
        if(currentKey>previouskey){

            sum = sum - previouskey;
        }
        else{
            sum = sum + previouskey;
        }

    }
 System.out.println("sum: "+sum);
}
