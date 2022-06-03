package DigitalOperation;

public class CalculatorMoney {

    private int banknote;
    private static final int BANKNOTES_PER_PACK = 100;
    private static final int PACKS_IN_KASSETTE = 20;

//    public MoneyCalculator(int banknote) {
//        this.banknote = banknote;
//    }

    public void calculateCassetteCount(int banknoteCount) {
        int packsCount = banknoteCount / BANKNOTES_PER_PACK + (banknoteCount % BANKNOTES_PER_PACK == 0 ? 0 : 1);
        int cassetteCount = packsCount / PACKS_IN_KASSETTE + (packsCount % PACKS_IN_KASSETTE == 0 ? 0 : 1);
        int remainderOfBanknote = BANKNOTES_PER_PACK * PACKS_IN_KASSETTE * cassetteCount - banknoteCount;
//        int cassetteCount = banknoteCount / BANKNOTES_PER_PACK / PACKS_IN_KASSETTE;
//        int remainderOfCount = banknoteCount - cassetteCount * BANKNOTES_PER_PACK * PACKS_IN_KASSETTE;
//        if (banknoteCount < BANKNOTES_PER_PACK * PACKS_IN_KASSETTE) {
//            System.out.println("Требуется одна кассета, и в ней не будет хвать " + (BANKNOTES_PER_PACK * PACKS_IN_KASSETTE - banknoteCount) + " купюр");
//        } else {
//            System.out.println("В банкомат необходимо загрузить: " + cassetteCount + " кассет-(ты,ту)\nИ одну неполную кассету с " + remainderOfCount + " купюрами");
//        }
        System.out.println("Всего: " + banknoteCount + ".");
        System.out.println("В банкомат требуется загрузить " + cassetteCount + " кассет или " + packsCount + " пачек. В последней кассете еще есть место для " + remainderOfBanknote + " купюр");

    }
}
