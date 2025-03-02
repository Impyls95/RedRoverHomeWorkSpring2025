package hw09.task3;

public class Grade {
    private final String stringGrade;

    public Grade(int grade) {
        if (grade < 1 || grade > 5) {
            throw new IllegalArgumentException("Цифровой эквивалент оценки должен быть от 1 до 5 включительно");
        }
        this.stringGrade = getGradeFromInt(grade);
    }

    public Grade(char grade) {
        if (grade != 'A' && grade != 'B' && grade != 'C' && grade != 'F') {
            throw new IllegalArgumentException("Буквенный эквивалент может быть только: F, C, B, A");
        }
        this.stringGrade = getGradeFromAmericanSystem(grade);
    }

    private String getGradeFromInt(int intGrade) {
        String stringGrade = "";
        switch (intGrade) {
            case 1:
                stringGrade = "плохо";
                break;
            case 2:
                stringGrade = "неудовлетворительно";
                break;
            case 3:
                stringGrade = "удовлетворительно";
                break;
            case 4:
                stringGrade = "хорошо";
                break;
            case 5:
                stringGrade = "отлично";
                break;
            default:
                throw new IllegalArgumentException("Цифровой эквивалент оценки должен быть от 1 до 5 включительно");
        }
        return stringGrade;
    }

    private String getGradeFromAmericanSystem(char letter) {
        String stringGrade = switch (letter) {
            case 'F' -> "неудовлетворительно";
            case 'C' -> "удовлетворительно";
            case 'B' -> "хорошо";
            case 'A' -> "отлично";
            default -> throw new IllegalStateException("Unexpected value: " + letter);
        };
        return stringGrade;
    }

    public String getStringGrade() {
        return stringGrade;
    }
}
