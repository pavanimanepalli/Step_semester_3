package string_operations.class_problems;

public class FileExtensionValidator {

    public String validateFileExtension(String filename) {
        int dot = filename.lastIndexOf('.');

        if (dot == -1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dot + 1);

        if (extension.equalsIgnoreCase("pdf")
                || extension.equalsIgnoreCase("docx")
                || extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        FileExtensionValidator obj = new FileExtensionValidator();

        System.out.println(obj.validateFileExtension("Assignment1.PDF"));
        System.out.println(obj.validateFileExtension("notes.txt"));
    }
}