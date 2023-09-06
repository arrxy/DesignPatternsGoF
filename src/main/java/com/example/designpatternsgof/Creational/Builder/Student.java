package com.example.designpatternsgof.Creational.Builder;

public class Student {
        private String name;
        private String phoneNumber;
        private String email;
        private Integer age;
        private String enrollmentId;
        private Integer passingYear;
        private String grade;
        private String board;

        private Student() {}
        private Student(Student student) {
            this.board = student.board;
            this.grade = student.grade;
            this.passingYear = student.passingYear;
            this.enrollmentId = student.enrollmentId;
            this.age = student.age;
            this.email = student.email;
            this.phoneNumber = student.phoneNumber;
            this.name = student.name;
        }
        public static Builder builder() {
            return new Builder();
        }
        public static class Builder {
            Student studentBuilder = new Student();
            public Builder setName(String name) {
                studentBuilder.name = name;
                return this;
            }
            public Builder setPhoneNumber(String phoneNumber) {
                studentBuilder.phoneNumber = phoneNumber;
                return this;
            }

            public Builder setEmail(String email) {
                studentBuilder.email = email;
                return this;
            }
            public Builder setAge(Integer age) {
                studentBuilder.age = age;
                return this;
            }
            public Builder setEnrollmentId(String enrollmentId) {
                studentBuilder.enrollmentId = enrollmentId;
                return this;
            }
            public Builder setPassingYear(Integer passingYear) {
                studentBuilder.passingYear = passingYear;
                return this;
            }
            public Builder setGrade(String grade) {
                studentBuilder.grade = grade;
                return this;
            }
            public Builder setBoard(String board) {
                studentBuilder.board = board;
                return this;
            }
            public Student build() {
                return new Student(studentBuilder);
            }
        }

}
