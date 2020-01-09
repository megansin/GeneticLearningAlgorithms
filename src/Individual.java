public class Individual {
    // genes string

    // calculate score

    private String gene;
    private int score;
    private String goal;

    //random individual
    public Individual(String goal){
        gene = "";
        char a = 'a';
        int low = (int)a;
        int high = low + 26;
        while(gene.length()< goal.length()){
            int rand = (int)(Math.random()*(26)) + low;
            gene += (char)rand;
        }
        score = 0;
        calculate();
    }

    public void calculate(){
        int sum = 0;
        for (int i = 0; i < gene.length(); i++) {

            char a = gene.charAt(i);
            char b = goal.charAt(i);
            int diff = Math.abs((int)a + (int)b);
            sum += diff;
        }
        score = sum;
    }

    public void mutate(double rateOfMutation){
        //should we have 100% of 1 mutation??

        while(Math.random() < rateOfMutation){
            int randIndex = (int)Math.random()*gene.length();
            char car = gene.charAt(randIndex);
            int diff = (int)(Math.random()*5) + 1; //1-5
            if(Math.random() < 0.5){
                //add
                int newCode = (int)car + diff;
                    if(newCode > (int)'z'){
                     newCode = (int)'z';
                        newCode = newCode > (int)'z' ?  (int)'z' : newCode;
                }

            }
            else{
                //subtract
            }

        }
    }

}
