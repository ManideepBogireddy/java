package com.corejava.operators;

import java.util.Scanner;

public class NaukriJobPortal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String jobSeekerEmail = "manideepbogireddy@gmail.com";
        String jobSeekerPassword = "Mani@1409";

        String recruiterEmail = "hr@tcs.com";
        String recruiterPassword = "admin";

        String javaJob = "Java Developer - TCS";
        String pythonJob = "Python Developer - Infosys";
        String testingJob = "QA Tester - Wipro";

        boolean applied = false;

        while (true) {

            System.out.println("\n=================================");
            System.out.println("       NAUKRI JOB PORTAL");
            System.out.println("=================================");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Email : ");
                String email = sc.nextLine();

                System.out.print("Enter Password : ");
                String password = sc.nextLine();

                // ---------------- JOB SEEKER ----------------

                if (email.equals(jobSeekerEmail)) {

                    if (password.equals(jobSeekerPassword)) {

                        System.out.println("\nLogin Successful");
                        System.out.println("Welcome Job Seeker");

                        while (true) {

                            System.out.println("\n----------- Job Seeker Menu -----------");
                            System.out.println("1. View Profile");
                            System.out.println("2. Search Jobs");
                            System.out.println("3. Apply Job");
                            System.out.println("4. Logout");
                            System.out.print("Enter Choice : ");

                            int seekerChoice = sc.nextInt();
                            sc.nextLine();

                            if (seekerChoice == 1) {

                                System.out.println("\n------ Profile ------");
                                System.out.println("Name          : Manideep");
                                System.out.println("Qualification : B.Tech");
                                System.out.println("Skills        : Java, SQL");
                                System.out.println("Experience    : Fresher");

                            } else if (seekerChoice == 2) {

                                System.out.println("\nSelect Technology");
                                System.out.println("1. Java");
                                System.out.println("2. Python");
                                System.out.println("3. Testing");
                                System.out.print("Enter Choice : ");

                                int tech = sc.nextInt();
                                sc.nextLine();

                                if (tech == 1) {

                                    System.out.print("Enter Experience (Years): ");
                                    int exp = sc.nextInt();
                                    sc.nextLine();

                                    if (exp >= 1) {

                                        System.out.println("\nAvailable Job:");
                                        System.out.println("101 - " + javaJob);

                                    } else {

                                        System.out.println("\nAvailable Job:");
                                        System.out.println("102 - Java Fresher - Capgemini");
                                    }

                                } else if (tech == 2) {

                                    System.out.println("\nAvailable Job:");
                                    System.out.println("201 - " + pythonJob);

                                } else if (tech == 3) {

                                    System.out.println("\nAvailable Job:");
                                    System.out.println("301 - " + testingJob);

                                } else {

                                    System.out.println("Invalid Technology");
                                }

                            } else if (seekerChoice == 3) {

                                System.out.print("Enter Job ID : ");
                                int jobId = sc.nextInt();
                                sc.nextLine();

                                if (jobId == 101 || jobId == 102 || jobId == 201 || jobId == 301) {

                                    if (!applied) {

                                        System.out.print("Do you have a Resume? (yes/no): ");
                                        String resume = sc.nextLine();

                                        if (resume.equalsIgnoreCase("yes")) {

                                            applied = true;
                                            System.out.println("Application Submitted Successfully.");

                                        } else {

                                            System.out.println("Please Upload Resume First.");
                                        }

                                    } else {

                                        System.out.println("You have already applied.");
                                    }

                                } else {

                                    System.out.println("Invalid Job ID");
                                }

                            } else if (seekerChoice == 4) {

                                System.out.println("Logged Out Successfully.");
                                break;

                            } else {

                                System.out.println("Invalid Choice");
                            }

                        }

                    } else {

                        System.out.println("Incorrect Password");
                    }

                }

                // ---------------- RECRUITER ----------------

                else if (email.equals(recruiterEmail)) {

                    if (password.equals(recruiterPassword)) {

                        System.out.println("\nLogin Successful");
                        System.out.println("Welcome Recruiter");

                        while (true) {

                            System.out.println("\n--------- Recruiter Menu ---------");
                            System.out.println("1. View Posted Jobs");
                            System.out.println("2. Logout");
                            System.out.print("Enter Choice : ");

                            int recruiterChoice = sc.nextInt();
                            sc.nextLine();

                            if (recruiterChoice == 1) {

                                System.out.println("\nPosted Jobs");
                                System.out.println("101 - " + javaJob);
                                System.out.println("201 - " + pythonJob);
                                System.out.println("301 - " + testingJob);

                            } else if (recruiterChoice == 2) {

                                System.out.println("Logged Out Successfully.");
                                break;

                            } else {

                                System.out.println("Invalid Choice");
                            }

                        }

                    } else {

                        System.out.println("Incorrect Password");
                    }

                }

                else {

                    System.out.println("Email Not Registered");
                }

            }

            else if (choice == 2) {

                System.out.println("Thank You for Using Naukri Job Portal.");
                break;

            }

            else {

                System.out.println("Invalid Choice");
            }

        }

        sc.close();
    }

}