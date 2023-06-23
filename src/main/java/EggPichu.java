public class EggPichu extends Evolution {
    private int timeToHatch;
    private boolean hatch;

    public EggPichu(int timeToHatch, boolean hatch) {
        this.timeToHatch = timeToHatch;
        this.hatch = hatch;
    }

    @Override
    public void evolution(Pokemon p) {
        // if timeToHatch == 0, evolve to Pichu
    }
}
