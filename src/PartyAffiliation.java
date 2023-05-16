public class PartyAffiliation {
    public static void main(String[] args) {

        String democrat = "donkey";
        String republican = "elephant";
        String independant = "man";
        String yourParty = "D";

        if (yourParty.equals("D"))
        {
            System.out.println("You are a democratic " + democrat);
        }
        else if (yourParty.equals("R"))
        {
            System.out.println("You are a republican " + republican);
        }
        else if (yourParty.equals("I"))
        {
            System.out.println("You are an independant " + independant);
        }
        else
        {
            System.out.println("Error. Check your spelling.");
        }
    }
}