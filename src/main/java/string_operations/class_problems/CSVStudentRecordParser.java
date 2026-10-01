package string_operations.class_problems;

public class CSVStudentRecordParser {

    public void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",", -1);

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Name: " + fields[0]
                    + " | Roll No: " + fields[1]
                    + " | Dept: " + fields[2]);
        }
    }

    public static void main(String[] args) {
        CSVStudentRecordParser obj = new CSVStudentRecordParser();

        obj.parseStudentRecord(
                "Ananya Verma,RA2211003010123,CSE");

        obj.parseStudentRecord("Ananya Verma,CSE");
    }
}
