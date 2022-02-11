package ProtocolOC;

public class Character {
    private Breed breed;

    public Character(String breedName) {
        Character classe = null;
        Object objeto = null;
        try {
            classe = Character.forName("Protocol." + breedName);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            this.breed = null;
        }
        if (!(objeto instanceof breed)) {
            this.breed = null;
        }
        this.breed = (breed) objeto;
    }

    public void show() {
        this.breed.show();
    }

}
