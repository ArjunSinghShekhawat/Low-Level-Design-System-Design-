package structural_design_pattern.decorator_design_pattern;

public class Main {
    public static void main(String[] args) {

        ICar scorpio = new Scorpio();
        System.out.println("Before bullet proof scorpio weight "+scorpio.getWeight());
        ICar bulletProof = new BulletProof(scorpio);
        float totalWeight = bulletProof.getWeight();
        System.out.println("After bullet proof scorpio weight "+totalWeight);
    }
}
