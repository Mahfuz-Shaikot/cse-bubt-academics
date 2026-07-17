import java.util.Set;
import java.util.TreeSet;

class libary implements Comparable<libary>{
    String b_title;
    String b_auth;
    Integer b_id;
    libary(String b, String c, int d){
        b_title=b;
        b_auth=c;
        b_id=d;
    }
    @Override
    public String toString() {
        return "\nBook Id no.: "+b_id+"\nBook Title: "+b_title+"\nBook Author: "+b_auth+"\n";
    }
    @Override
    public int compareTo(libary a) {
        return this.b_title.compareTo(a.b_title);
    }
}

public class BookTreeSet {
    public static void main(String[] args) {
        Set<libary> a = new TreeSet<libary>();
        a.add(new libary("ANTS","Beru",101));
        a.add(new libary("Drop in Sea","Kally Rickard",111));
        a.add(new libary("Wild Wonders","MR Keton Kolent",156));
        a.add(new libary("Knocking Glass","Jason Miller",121));
        a.add(new libary("Only I Level up Alone","Sung jin-Woo",221));
        for (libary i: a){
            System.out.println(i);
        }
    }
}