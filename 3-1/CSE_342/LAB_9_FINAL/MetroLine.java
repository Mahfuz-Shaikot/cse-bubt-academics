
import java.util.Set;
import java.util.TreeSet;

public class MetroLine implements Comparable<MetroLine> {

    private final int lineNumber;
    private final String lineName;

    public MetroLine(int lineNumber, String lineName) {
        this.lineNumber = lineNumber;
        this.lineName = lineName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public int compareTo(MetroLine other) {
        return Integer.compare(this.lineNumber, other.lineNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetroLine other = (MetroLine) obj;
        return this.lineNumber == other.lineNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(lineNumber);
    }

    @Override
    public String toString() {
        return "Line " + lineNumber + ": " + lineName;
    }
}

class MainMetro {

    public static void main(String[] args) {
        Set<MetroLine> metroLines = new TreeSet<>();

        metroLines.add(new MetroLine(1, "Uttara North - Agargaon"));
        metroLines.add(new MetroLine(2, "Gabtoli - Kamalapur"));
        metroLines.add(new MetroLine(3, "Purbachal - Notun Bazar"));
        metroLines.add(new MetroLine(4, "Mirpur - Farmgate"));
        metroLines.add(new MetroLine(5, "Mohammadpur - Motijheel"));
        metroLines.add(new MetroLine(2, "Duplicate Line Test"));

        System.out.println("Available Metro Lines (Sorted):");
        for (MetroLine line : metroLines) {
            System.out.println(line);
        }
    }
}
