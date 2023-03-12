package com.example.whowanttobemillionaire;

public class question {
    //list contain questions
    public String questions[] = {
            "Which is a Programming Language?",
            "In COMAL language program, after name of procedure parameters must be in?",
            "Programming language COBOL works best for use in?",
            "Which of the following is NOT a programming language?",
            "Which of the following data structures uses Last-In-First-Out (LIFO) ordering?",
            "Which of the following is NOT a type of database?",
            "Which of the following is a security vulnerability that allows attackers to execute code remotely?",
            "Which of the following is a cloud computing service provided by Amazon Web Services (AWS)?",
            "Which of the following is NOT a fundamental component of object-oriented programming (OOP)?",
            "Which of the following is a popular version control system used in software development?",
            "Which of the following is a popular version control system used in software development?"

    };

    public String choices[][] = {
            //list contain choices
            {"HTML", "CSS", "Vala", "PHP"},
            {"Punction Marks", "Back-Slash", "Brackets", "Semi Colon"},
            {"Siemens Applications", "Student Applications", "Social Applications", "Commercial Applications"},
            {"Python","HTML","CSS","JPEG"},
            {"Queue","Stack","Linked List","Tree"},
            {"Relational Database","NoSQL Database","Hierarchical Database","Email Database"},
            {"SQL Injection","Cross-Site Scripting","Remote Code Execution","Denial-of-Service"},
            {"GOOGLE Cloud Platform","Microsoft Azure","Amazon Elastic Compute Cloud","Oracle Cloud Infrastructure"},
            {"Inheritance","Encapsulation","Polymorphism","Linear Regression"},
            {"Microsoft Excel","Apache Kafka","Git","Adobe Photoshop"},
            {"Microsoft Excel","Apache Kafka","Git","Adobe Photoshop"}
    };

    public String correctAnswer[] = {
            //list contain answer
            "PHP",
            "Brackets",
            "Commercial Applications",
            "JPEG",
            "Stack",
            "Email Database",
            "Remote Code Execution",
            "Amazon Elastic Compute Cloud",
            "Linear Regression",
            "Git",
            "Git"
    };

    public String money[] = {
            //list contain answer
            "0",
            "100",
            "500",
            "1000",
            "5000",
            "10000",
            "50000",
            "100000",
            "250000",
            "500000",
            "1000000"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

    public String getMoney(int a){
        String moneys = money[a];
        return moneys;
    }

}
