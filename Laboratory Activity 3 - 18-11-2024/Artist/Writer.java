enum WritingStyle {
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA
}

public class Writer extends Artist {
    private WritingStyle writingStyle;

    public Writer(String name, String nationality, int age, String specialty, WritingStyle writingStyle) {
        super(name, nationality, age, specialty);
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer Info: ");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}