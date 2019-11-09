package StringBuilder1;

public class SB1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        StringBuilder sb1 = new StringBuilder("DevX School");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Name: ");
        sb3.append("John \tDoe");
        System.out.println(sb3);
        sb3.append("\nGrade ").append("\"A\" ").append(" \tGPA ");
        sb3.append(4.0 +7+8);
        System.out.println(sb3);


        StringBuilder sb4 = new StringBuilder("DevX School");
        sb4.insert(4, "<>");
        System.out.println(sb4);
        sb4.insert(13,"!!!");
        System.out.println(sb4);

        sb4.delete(4,5);
        sb4.deleteCharAt(4);
        System.out.println(sb4);

        StringBuilder sb6 = new StringBuilder("Senior SDET");
       // sb6.deleteCharAt(sb6.indexOf("e"), sb6.indexOf("r"));

        StringBuilder sb9 = new StringBuilder("Googggle Chome");
        sb9.deleteCharAt(4);
        sb9.deleteCharAt(4).deleteCharAt(3);

        String str = "Chicago 2019";
        StringBuilder sb10 = new StringBuilder(str);
        System.out.println(sb10.append("DevX School"));
        sb10.reverse();
        System.out.println(sb10);
        str = sb10.toString();
        System.out.println(str);

    }
}
