/**
 * Класс "Киборг"
 */
public abstract class clsCyborg {
    /**
     * Поля класса <Киборг>
     */
    private String modelID; 
    private int cyborgCapasity;
    private int initiative;
    
    public String getModelID() {
        return modelID;
    }
    public int getCyborgCapasity() {
        return cyborgCapasity;
    }
    public int getInitiative() {
        return initiative;
    }
    public void setModelID(String modelID) {
        this.modelID = modelID;
    }
    public void setCyborgCapasity(int cyborgCapasity) {
        this.cyborgCapasity = cyborgCapasity;
    }
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    
}
