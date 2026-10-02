package string_operations.assignment_problems;

public class LibraryISBNNormalizerValidator {

    public String normalizeCode(String raw) {
        String code = raw.trim();

        if (code.length() < 3) {
            return code;
        }

        return code.substring(0, 3).toUpperCase()
                + code.substring(3);
    }

    public String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("[")
                .append(code.substring(0, 3))
                .append("] YEAR: 20")
                .append(code.substring(5, 7))
                .append(" | CATALOG: ")
                .append(code.substring(7, 13));

        return result.toString();
    }

    public static void main(String[] args) {
        LibraryISBNNormalizerValidator obj =
                new LibraryISBNNormalizerValidator();

        String code = obj.normalizeCode(" pen2026004251 ");
        System.out.println(obj.validateAndFormat(code));

        String invalid = obj.normalizeCode("12N2026004251");
        System.out.println(obj.validateAndFormat(invalid));
    }
}