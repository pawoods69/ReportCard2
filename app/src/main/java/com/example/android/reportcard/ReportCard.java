package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by princ on 5/4/2017. This project is only a Java class for the ReportCard project. This
 * will contain variables to track information only to a report card. Will have one constructor.
 * Private variables with getter and setter methods. With String methods.
 */

public class ReportCard {

    /**
     * ArrayList for the school subjects
     */
    private ArrayList<String> Subjects = new ArrayList<String>();

    /**
     * ArrayList for the values of the grades
     */
    private ArrayList<Double> Grade = new ArrayList<Double>();

    /**
     * String for value of grades
     */
    private String totalGrades;

    /**
     * Final value of grades
     */
    private double FinalGrade;


    /**
     * ReportCard object
     *
     * @param englishGrade  value for English
     * @param scienceGrade  value for Science
     * @param languageGrade value for Language
     * @param historyGrade  value for History
     * @param bandGrade     value for Band
     */


    public ReportCard(double englishGrade, double scienceGrade, double languageGrade, double historyGrade, double bandGrade) {

        Subjects.add(0, "English");
        Subjects.add(1, "Science");
        Subjects.add(2, "Language");
        Subjects.add(3, "History");
        Subjects.add(4, "Band");

        Grade.add(0, englishGrade);
        Grade.add(1, scienceGrade);
        Grade.add(2, languageGrade);
        Grade.add(3, historyGrade);
        Grade.add(4, bandGrade);
    }


/** setters and getters */


    /**
     * setter-getter for English Grade
     */
    public class English {
        private String name;
        private String grade;

        public English(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        /**
         * setter-getter for Science Grade
         */
        public class Science {
            private String name;
            private String grade;

            public Science(String name, String grade) {
                this.name = name;
                this.grade = grade;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGrade() {
                return grade;
            }

            public void setGrade(String grade) {
                this.grade = grade;
            }

            /**
             * setter-getter for Language Grade
             */
            public class Language {
                private String name;
                private String grade;

                public Language(String name, String grade) {
                    this.name = name;
                    this.grade = grade;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getGrade() {
                    return grade;
                }

                public void setGrade(String grade) {
                    this.grade = grade;
                }

                /**
                 * setter-getter for History Grade
                 */
                public class History {
                    private String name;
                    private String grade;

                    public History(String name, String grade) {
                        this.name = name;
                        this.grade = grade;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getGrade() {
                        return grade;
                    }

                    public void setGrade(String grade) {
                        this.grade = grade;
                    }

                    /**
                     * setter-getter for Band Grade
                     */
                    public class Band {
                        private String name;
                        private String grade;

                        public Band(String name, String grade) {
                            this.name = name;
                            this.grade = grade;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getGrade() {
                            return grade;
                        }

                        public void setGrade(String grade) {
                            this.grade = grade;
                        }

                        /**
                         * toString method which returns the contents of the class and name of the student
                         */

                        @Override
                        public String toString() {
                            return "name: " + "" + "grade: " + grade;

                        }


                        /**
                         * final grade calculation of all subjects
                         */
                        public double getFinalGrade() {
                            FinalGrade = 0.0;
                            for (int i = 0; i < Grade.size(); i++) {
                                double grade = Grade.get(i);
                                FinalGrade = FinalGrade + grade;
                            }
                            FinalGrade = FinalGrade / Grade.size();
                            return FinalGrade;
                        }


                    }
                }
            }
        }
    }
}
