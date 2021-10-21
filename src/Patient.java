public class Patient {
    String patientName;
    double height;
    double weight;
    Patient(String patientName,double height,double weight)
    {
        this.patientName=patientName;
        this.height=height;
        this.weight=weight;
    }
    void BMI()
    {
        System.out.println(patientName);
        double BMI=weight/(height*height);
        System.out.println("result= " +BMI);
    }

    public static void main(String[] args) {
        Patient p=new Patient("anjali",12,13);
        p.BMI();
    }


}
