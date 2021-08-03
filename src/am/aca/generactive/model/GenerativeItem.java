package am.aca.generactive.model;

public class GenerativeItem extends Item {

    private double complexity = 1;

    public GenerativeItem(int id, int basePrice, String name) {
        super(id, basePrice, name);
    }

    public double getComplexity() {
        return complexity;
    }

    public void setComplexity(double complexity) {
        this.complexity = complexity;
    }

    @Override
    public int calculatePrice(Configuration configuration) {
        return (int)(getBasePrice() * complexity * configuration.getResolution().getCoefficient());
    }
}
