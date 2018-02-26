package HomeWork.ColegeStudentBuilder;

public class CollegeStudent extends Student {
    private String collegeName;
    private CollegeStudent(String name) {
        super(name);
    }
    public String getCollegeName(){
        return collegeName;
    }
    private void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public static class CollegeStudentBuilder {
        private int age;
        private String gender;
        private String collegeName;
        private String name;

        public CollegeStudentBuilder(String name) {
            this.name=name;
        }

        public CollegeStudentBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public CollegeStudentBuilder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public CollegeStudentBuilder withCollegeName(String collegeName) {
            this.collegeName = collegeName;
            return this;
        }

        public CollegeStudent build() {
            CollegeStudent cs = new CollegeStudent(this.name);
            cs.setAge(this.age);
            cs.setGender(this.gender);
            cs.setCollegeName(this.collegeName);
            return cs;
        }
    }
}
// сделеть colegestudent билдер и url билдер
// нужно загуглить патерн билдер
// build возвращяет обьект коледж студент
// методы with Age аналог сетеров
