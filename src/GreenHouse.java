public class GreenHouse {

    Plant[] plants;

    public GreenHouse() {
        this.plants = new Plant[0];
    }

    // En Java, la taille d'un tableau est immuable donc :

    public void addPlant(Plant plant) {
        Plant[] newPlants = new Plant[this.plants.length + 1]; // On créé un nouveau tableau avec un index en +
        for (int i = 0; i < this.plants.length; i++) {  // On boucle sur l'ancien tableau
            newPlants[i] = this.plants[i]; // On copie ce qu'il y a dans l'ancien pour mettre dans le nouveau
        }
        newPlants[this.plants.length] = plant; // On ajoute la plante au nouveau tableau

        this.plants = newPlants; // L'ancien tableau est égal au nouveau.
    }


    public void waterAll(int amount) {
        for (int i = 0; i < this.plants.length; i++ ){
            if (this.plants[i] != null){
                this.plants[i].addWater(amount);
                System.out.println("J'ai ajouté " + amount + " points d'eau à la " + this.plants[i].name);
            }
        }
    }

    public void passDayForAll(){
        for (int i = 0; i <this.plants.length; i++){
            if (this.plants[i] != null){
                this.plants[i].passDay();
                System.out.println("J'ai fait passé une journée à la " + this.plants[i].name);

            }
        }
    }

    public void getPlantsInDifficulty() {
        for (Plant plant : this.plants) {
            if (plant != null && plant.getWaterLevel() < 2) {
                System.out.println(plant.getSummary());
            }
        }
    }

    public void countByStatus() {
        int seedCount = 0;
        int sproutCount = 0;
        int flowerCount = 0;
        for (Plant plant : this.plants) {
            if (plant != null) {
                String status = plant.getStatus();
                if (status.equals("seed")) {
                    seedCount++;
                } else if (status.equals("sprout")) {
                    sproutCount++;
                } else if (status.equals("flower")) {
                    flowerCount++;
                }
            }
        }
        System.out.println("Seed : " + seedCount);
        System.out.println("Sprout : " + sproutCount);
        System.out.println("Flower : " + flowerCount);
    }

}




