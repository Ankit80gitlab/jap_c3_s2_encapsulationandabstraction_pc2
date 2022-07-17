public class Evaluation {

    public int [] mathMarks;
    public int [] scienceMarks;
    public int [] englishMarks;
    public int [] languageMarks;
    public int [] socialMarks;

    public Evaluation(int [] mathMarks, int[] scienceMarks, int[] englishMarks, int[] languageMarks, int[] socialMarks) {

        this.mathMarks=mathMarks;
        this.scienceMarks=scienceMarks;
        this.englishMarks=englishMarks;
        this.languageMarks=languageMarks;
        this.socialMarks=socialMarks;
    }

    public int[] totalMarksOfStudent(int [] mathMarks, int[] scienceMarks, int[] englishMarks, int[] languageMarks, int[] socialMarks) {

        int [] arrayTotal= new int [mathMarks.length];

        for (int i=0; i< arrayTotal.length; i++)
        {
            arrayTotal[i]=mathMarks[i]+scienceMarks[i]+englishMarks[i]+languageMarks[i]+socialMarks[i];
        }
        return arrayTotal;
    }

    public int totalClassAverage(int[] list) {

        int sum=0;

        for (int i=0; i< list.length; i++)
        {
            sum=sum+list[i];
        }
        return sum/ list.length;
    }

    public int[] averageMarksOfEachStudent(int []list) {

        int [] temp=new int[list.length];

        for (int i=0; i< list.length; i++)
        {
            temp[i] = list[i]/5;
        }
        return temp;
    }

}
