public class CurrencyExchange {

    static final double DOLLARS_TO_CREDITS = 53.4;
    static final double BLEGHTHERS_TO_CREDITS = 2.7;
    static final double SMORGOS_TO_CREDITS = 1276.32;

    public static void main(String[] args)
    {
        Currency dollars,bleghthers,smorgos;
        dollars = new Currency("Dollar", DOLLARS_TO_CREDITS, 27);
        bleghthers = new Currency("Bleghther", BLEGHTHERS_TO_CREDITS, 2931);
        smorgos = new Currency("Smorgo", SMORGOS_TO_CREDITS, 3);

        System.out.printf("[*] %.2f %ss are worth %f credits\n",smorgos.getAmount(),smorgos.getName(),smorgos.getCreditValue());
        System.out.printf("[*] %s\n",bleghthers.getName());
        System.out.printf("[*] With %.2f %ss, you can buy %.4f %ss\n",dollars.getAmount(),dollars.getName(),dollars.checkExchange(smorgos),smorgos.getName());
        System.out.printf("[*] With %.2f %ss, you can buy %.2f %ss\n",bleghthers.getAmount(),bleghthers.getName(),bleghthers.checkExchange(dollars),dollars.getName());
        System.out.printf("[*] %.2f %ss, %.2f %ss, and %.4f %ss are worth: %f Credits\n",dollars.getAmount(),dollars.getName(),bleghthers.getAmount(),bleghthers.getName(),smorgos.getAmount(),smorgos.getName(),dollars.getCreditValue()+bleghthers.getCreditValue()+smorgos.getCreditValue());
        System.out.printf("[*] If we converted everything to dollars, we would have %.2f %ss\n",bleghthers.checkExchange(dollars)+smorgos.checkExchange(dollars)+dollars.getAmount(),dollars.getName());
    }
}
