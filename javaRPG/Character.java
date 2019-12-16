public class Character {

    private String professionName;
    private int hitPoints;
    private int manaPoints;
    private int attackDamage;
    private double healthRegen;

    public Character (String className, int hp, int mp, int ad, double hpRegen) {
        professionName = className;
        hitPoints = hp;
        manaPoints = mp;
        attackDamage = ad;
        healthRegen = hpRegen;
    }

    public String getProfessionName() {
        return professionName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public double getHealthRegen() {
        return healthRegen;
    }


}