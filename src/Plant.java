public class Plant {

    String name ;
    private int waterLevel = 0;
    private int growthLevel = 0;
    private String status = "seed";

    public Plant (String name){
       this.name = name;
    }
    public int addWater (int amount){
        if (amount > 0){
           this.waterLevel += amount;
        }
        return this.waterLevel;
    }

    public String passDay(){
        if (this.waterLevel >= 2){
            this.waterLevel -= 2;
            this.growthLevel += 1;

        }
        if (this.growthLevel >= 3 && this.growthLevel < 6){
            this.status = "sprout";
        } else if (this.growthLevel >= 6){
            this.status = "flower";
        }
        return this.status;
    }

    public String getSummary(){

        return "La " + this.name + " a " + this.waterLevel + " points d'eau et est au stade de " + this.status;
    }

    public int getWaterLevel() {
        return this.waterLevel;
    }

    public String getStatus() {
        return this.status;
    }


}
