package shelter;

public class VirtualPet {
    /*
     * Things this class knows:
     */
    private int hunger;
    private int thirst;
    private int boredom;
    private String name;
    private String description;

    //constructor goes here.


    /*
     * 1. What does this method do?  Query method that returns data or command method that does something?
     *   - Query methods return values.  Have to have a return type.
     *   - Command methods don't return anything.  Should have 'void' as the return type.
     * 2. What does this method need to know?  Pass this information as a parameter in the signature.
     *   - Does not need to have parameters, but can have multiple parameters if needed.
     *   - Add parameters inside paran's ("()", I don't spell for a living :( )
     * 3. Add access modifier.
     *   - public if you want it to be called outside of the class.
     *   - private if don't want anything else calling it.
     */
    public void changeName(String newName) {
        name = newName;
    } //-> name

    public void eat() {
        hunger -= 5;
    } //-> hunger

    public void drink() {
        thirst -= 5;
    } //-> thirst

    public void play() {
        boredom -= 5;
    } //-> boredom

    public void tick() {
      hunger++;
      thirst++;
      boredom++;
    }//-> hunger, thirst, & boredom


    // getters go here
}
