public class ManzanaPocha extends Maza {

    private String pocha;

    public ManzanaPocha(String pocha) {
        this.pocha = pocha;
    }

    @Override
    public final void comer() {
        super.comer();

        System.out.println("No");
    }

}
