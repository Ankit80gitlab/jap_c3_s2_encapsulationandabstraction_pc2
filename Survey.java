public class Survey {
    int [] rollNo;
    int [] list;
    int [] averageOfStudent;

    public Survey(int [] rollNo, int [] list, int [] averageOfStudent) {
        this.rollNo=rollNo;
        this.list=list;
        this.averageOfStudent=averageOfStudent;
    }

    public char [] generateGrades(int [] averageOfStudent) {

        char [] grades=new char [20];

        for (int i=0; i<averageOfStudent.length; i++)
        {
            if (averageOfStudent[i] >=90)
            {
                grades[i]='A';
            }
            else if (averageOfStudent[i] >=80 && averageOfStudent[i]<90)
            {
                grades[i]='B';
            }
            else if (averageOfStudent[i] >=70 && averageOfStudent[i]<80)
            {
                grades[i]='C';
            }
            else if (averageOfStudent[i] >=60 && averageOfStudent[i]<69)
            {
                grades[i]='D';
            }
            else if (averageOfStudent[i] >=50 && averageOfStudent[i]<60)
            {
                grades[i]='E';
            }
            else
            {
                grades[i]='F';
            }
        }
        return grades;
    }


    public int[] rollNoByMarks(int[] list,int [] rollNo)
    {

        int temp=0;
        int temp2=0;

        for (int i=0; i< list.length; i++)
        {
            for (int j=0; j< list.length-1; j++)
            {
                if (list[j]>list[j+1])
                {
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                    temp2=rollNo[j];
                    rollNo[j]=rollNo[j+1];
                    rollNo[j+1]=temp2;
                }
            }
        }
        return rollNo;
    }
}

