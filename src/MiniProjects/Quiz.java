package MiniProjects;

import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        String[] questions = {"Which of the following is not a Java primitive data type?",
                "What will be the output of the following code?\n" +
                        "int a = 5, b = 2; \n" +
                        "System.out.println(a / b); ",
                "Which loop is guaranteed to execute at least once in Java?",
                "The javac command is used for - ",
                "Which Git command is used to check the current status of files in a repository?",
                "In Git, the command to upload local commits to a remote repository is -",
                "Which shell/cmd command is used to list all files in the current directory?",
                "Which of the following is true about GitHub?",
                "Which keyword is used to define a class in Java?",
                "Which operator is used for string concatenation in Java?"};

        String[] options = {"int,float,String,char", "2.5,2,3,Error", "for-loop,while-loop,do-while-loop,none",
                "Running Java program,Compiling Java source code,Debugging Java code,Creating a JAR file",
                "git log,git init,git status,git diff", "git clone,git push,git pull,git add", "pwd,cd,dir,rm",
                "It is only used for hosting websites,It is a cloud-based Git repository hosting service,It is a programming language,It replaces Git",
                "function,object,class,struct", "+,&,.,concat"};
        String[] correctOpt = {"String", "2", "do-while-loop", "Compiling Java source code", "git status", "git push", "dir",
                "It is a cloud-based Git repository hosting service", "class", "+"};
        Scanner sc = new Scanner(System.in);
        String opt;
        int choose;
        int score = 0;
        for (int i = 0; i < questions.length; i++){
            System.out.println( "Q-" + (i+1)+"." + " " + questions[i]);
           // System.out.println(options[0]);
            opt = options[i];
           String[] newOpt = opt.split(",");
            //System.out.println(newOpt[0]);
            for (int j = 0; j < newOpt.length; j++) {
                System.out.println(j+1+ " " + newOpt[j]);
                if(j==newOpt.length-1){
                    System.out.print(" Choose One Option : ");
                    choose = sc.nextInt();
                    for (int a = 0; a < correctOpt.length-1; a++){
                            if (newOpt[choose-1].contentEquals(correctOpt[a])){
                                System.out.println(" Correct Answer ✅ ");
                                score++;
                                System.out.println();
                                break;
                        }else {
                                if (i==a){
                                    System.out.println(" Wrong Answer! ❌");
                                    System.out.println(" Correct Answer = " + correctOpt[a]);
                                    System.out.println();

                                }


                            }
                    }
                }
            }
        }
        System.out.println(" Your Score = " + score + "/10");

        }
    }

