public class Power {

    public static Double pow(Double base, int powValue) {
        if (powValue == 0) {
            return 1.0;
        }

        return powValue > 0 ? (base * pow(base, powValue - 1)) :
                            1.0 / ( base * pow(base,-powValue-1));
    }

}
