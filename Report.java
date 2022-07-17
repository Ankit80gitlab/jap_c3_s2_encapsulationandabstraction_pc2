public class Report {

    int[] list;
    String[] studentNames;

    public Report(int[] list, String[] studentNames) {
        this.list = list;
        this.studentNames = studentNames;
    }

    public String topScorer(int[] list, String[] studentNames) {
        int big = 0;
        String top = null;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > big) {
                big = list[i];
                top = studentNames[i];
            }
        }
        return top;
    }

    public String[] passedStudents(int[] mathMarks, int scienceMarks[], int[] socialMarks, int[] languageMarks, int[] englishMarks, String[] studentNames) {

        String passFailStatus[] = new String[20];
        int k = 35;
        int j = 0;

        for (int i = 0; i < mathMarks.length; i++) {
            if (mathMarks[i] >= k) {
                if (scienceMarks[i] >= k) {
                    if (englishMarks[i] >= k) {
                        if (languageMarks[i] >= k) {
                            if (socialMarks[i] >= k) {
                                passFailStatus[j] = studentNames[i];
                                j++;
                            } else {

                            }
                        }
                    }
                }
            }
        }
        return passFailStatus;
    }

    public String[] failedStudents(int [] list, String [] studentnames) {

        String[] failed = new String[list.length];
        int j = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] < 175) {
                failed[j] = studentNames[i];
                j++;
            }
        }
        return failed;
    }
}
