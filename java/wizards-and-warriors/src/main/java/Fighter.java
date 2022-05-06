abstract class Fighter {

    boolean isVulnerable() {
	    return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
	    return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
	    if (wizard.isVulnerable()) return 10;
	    else return 6;
    }
}

class Wizard extends Fighter {
	boolean pSpell = false;

    @Override
    boolean isVulnerable() {
	    if (pSpell == true) return false;
	    else return true;
    }

    @Override
    int damagePoints(Fighter warrior) {
	    if (pSpell) return 12;
	    else return 3;
    }

    void prepareSpell() {
	    pSpell = true;
    }

}
