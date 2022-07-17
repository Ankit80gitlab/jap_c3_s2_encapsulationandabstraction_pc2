public class Oakbridge {

    public static void main(String[] args) {
        String[] studentNames = new String[]{"Abe", "Gary", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm", "Navya", "Nathan", "Noel", "Oliver", "Pamela", "Randall"};
        int[] rollNo = new int[]{101, 104, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
        int[] mathMarks = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
        int[] scienceMarks = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
        int[] englishMarks = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
        int[] languageMarks = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
        int[] socialMarks = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};

        Evaluation obj1 = new Evaluation(mathMarks, scienceMarks, englishMarks, languageMarks, socialMarks);

        int [] list=obj1.totalMarksOfStudent(mathMarks, scienceMarks, englishMarks, languageMarks, socialMarks);
        obj1.totalClassAverage(list);
        System.out.println();

        System.out.println("Total marks of each students are -");
        for(int i=0; i< mathMarks.length; i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        System.out.println();
        //int average=obj1.totalClassAverage(list);
        //System.out.println("Total average marks of student is "+average);

        int [] averageOfStudent=obj1.averageMarksOfEachStudent(list);
        //System.out.println("The average marks of each student are -");
        //for(int i=0; i< mathMarks.length; i++)
        //{
        //    System.out.print(averageOfStudent[i]+" ");
       // }
        //System.out.println();

        Report obj2 = new Report(list, studentNames);

        String topper=obj2.topScorer(list,studentNames);
        System.out.println("The topper of the class is "+topper);
        System.out.println();

        String [] pass =obj2.passedStudents(mathMarks,scienceMarks,englishMarks,languageMarks,socialMarks,studentNames);
        System.out.println("Student who passed the exams are -");
        for(int i=0; i< 17; i++)
        {
            System.out.print(pass[i]+" ");
        }
        System.out.println();
        System.out.println();

        String [] fail =obj2.failedStudents(list,studentNames);
        System.out.println("Student who failed the exams are -");
        for(int i=0; i< 2; i++)
        {
            System.out.print(fail[i]+" ");
        }
        System.out.println();
        System.out.println();

        Survey obj3 =new Survey(rollNo, list, averageOfStudent);
        char [] grades=obj3.generateGrades(averageOfStudent);
        System.out.println("The grades of the student appeared in exam -");
        for(int i=0; i<averageOfStudent.length; i++)
        {
            System.out.print(grades[i]+" ");
        }
        System.out.println();
        System.out.println();

        int [] marksWiseRollNo=obj3.rollNoByMarks(list,rollNo);
        System.out.println("Roll no as per the marks obtained (in ascending order) -");
        for(int i=0; i<averageOfStudent.length; i++)
        {
            System.out.print(marksWiseRollNo[i]+" ");
        }
        System.out.println();
        System.out.println();

    }

}
