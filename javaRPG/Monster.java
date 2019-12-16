public class Monster {

    private String monsterName;
    private int mHitPoints;
    private int mManaPoints;
    private int mAttackDamage;
    private double mHealthRegen;

    public Monster (String nameOfMonster, int mhp, int mmp, int mad, int mHpRegen) {
        monsterName = nameOfMonster;
        mHitPoints = mhp;
        mManaPoints = mmp;
        mAttackDamage = mad;
        mHealthRegen = mHpRegen;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getmHitPoints() {
        return mHitPoints;
    }

    public int getmManaPoints() {
        return mManaPoints;
    }

    public int getmAttackDamage() {
        return mAttackDamage;
    }

    public double getmHealthRegen() {
        return mHealthRegen;
    }


}
