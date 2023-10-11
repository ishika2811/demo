package com.company;
class librarian {
    int age, Id;
    String Name, DOJ, Address;

    void input() {

    }

    void display() {

    }
}
    class college {
        String name, address, coursed;
        int regID;

        void input() {

        }

        void display() {

        }
    }
        class courses {
            String name, Id;
            int courseCode;

            void input() {

            }

            void display() {

            }
        }
            class Student {
                String name, course, address;
                int age, contactNumber;

                void input() {

                }

                void display() {
                }
            }





    public class demo2 {
        public static void main(String[] args) {
            librarian l = new librarian();

            college c =new college();
             courses c1=new courses();
             Student s=new Student();
             l.Name="Ram";
             l.Address="Durg";
             l.age=34;
             l.DOJ="23/12/2007";
             l.Id=8975;
             l.input();
             l.display();
            System.out.println("Librarian");
            System.out.println(l.Address+" "+l.DOJ+" "+l.Name+" "+l.age+" "+l.Id );



        }
    }
