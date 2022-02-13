package BaiTap;

public class Candidate {
    private int id;
    private String name;
    private String dateOfBirth;
    private double mathPoint;
    private double englishPoint;
    private double literaturePoint;

    public Candidate(int id, String name, String dateOfBirth, double mathPoint, double englishPoint, double literaturePoint) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mathPoint = mathPoint;
        this.englishPoint = englishPoint;
        this.literaturePoint = literaturePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getEnglishPoint() {
        return englishPoint;
    }

    public void setEnglishPoint(double englishPoint) {
        this.englishPoint = englishPoint;
    }

    public double getLiteraturePoint() {
        return literaturePoint;
    }

    public void setLiteraturePoint(double literaturePoint) {
        this.literaturePoint = literaturePoint;
    }

    public double sumPoint() {
        return getMathPoint() + getLiteraturePoint() + getEnglishPoint();
    }

    @Override
    public String toString() {
        return "Candidate {" +
                "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Date of birth = '" + dateOfBirth + '\'' +
                ", Math point = " + mathPoint +
                ", English point = " + englishPoint +
                ", Literature point = " + literaturePoint +
                '}';
    }
}
