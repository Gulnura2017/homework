package logicOperation;

public class boolean1 {
    public static void main(String[] args) {

        boolean isOld = true;
        boolean isOld2 = false;

        boolean oldResult = isOld || isOld2;

        System.out.println("Is Old Result " + oldResult);

        boolean isHusbuntMillioner = true;
        boolean isWifeMillioner = false;
        boolean isChildMillioner = isHusbuntMillioner || isWifeMillioner;
        System.out.println("Is Child a millioner" + isChildMillioner);

        boolean isSunny = true;
        boolean isRainy = true;
        boolean isRaibow = isSunny && isRainy;
        System.out.println("is it Rainbow? " + isRaibow);

        boolean negating = !false;

        System.out.println("The value of negating1 is " + negating);

        boolean negating2 = !true;
        System.out.println("The value negating2 is " + negating2);
    }
}
