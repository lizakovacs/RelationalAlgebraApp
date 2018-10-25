package com.example.lizakovacs.relationalalgebra;

public class QuestionLibrary {

    // Normal array created to hold the quiz questions

    public static String mQuestions[] = new String[] {
            "Relational Algebra is a __________ query language.",
            "What are the five basic relational algebra operations?",
            "Which of the following denotes the selection operation in relational algebra?",
            "Which of the following denotes the projection operation in relational algebra?",
            "Which of the following is the symbol for a Natural Join?",
            "What is the purpose of a Union Join and what is its relational algebra symbol?",
            "What is the purpose of a Set Difference and what is its relational algebra symbol?",
            "What is the purpose of an Intersection and what is its relational algebra symbol?",
            "What does: π studentID, lName, fName, WAM (Student) translate to?",
            "What does: π studentID, fName, lName (Student) ᴖ π studentID, fName ,lName (Tutor) translate to?",
            "What does: π studentID, fName, lName (Student)  × (π studentID, volunteerNo , review (Volunteer) translate to?",
            "What does: π studentID, street, city (Student) ⋊ (UniLodge) translate to?",
            "Which of the following denotes this result: a list of names and comments of students that have viewed a dorm room at UniLodge",
            "Which of the following denotes this result: a list of all the lecture rooms where there are scheduled lectures and no scheduled tutorials"
    };

    // Two-dimensional array holding the different choices to each question

    private String mChoices [][] = {

            {"Relational", "Structural", "Fundamental", "Procedural"},
            {"Selection, Projection, Set Difference, Theta Join, Cartesian Product", "Projection, Selection, Set Difference, Union, Cartesian Product", "Distinct, Projection, Set Difference, Natural Join, Cartesian Product", "Intersection, Projection, Set Difference, Theta Join, Cartesian Product"},
            {"Sigma - σ", "Pi - π", "Omega - Ω", "Lambda - λ"},
            {"Sigma - σ", "Pi - π", "Omega - Ω", "Lambda - λ"},
            {"⋉", "⋊", "⋈", "▷"},
            {"A relation containing all the tuples of relations M or E, or both M and E, with duplicated tuples being eliminated - symbol ᴗ", "A relation containing all the tuples of relations M or E with duplicated tuples being eliminated - symbol ᴗ", "A relation containing all the tuples of relations M and E with duplicated tuples being eliminated - symbol ᴖ", "None of the above"},
            {"Defines a relation that consists of the tuples in relation M, but not in E - symbol -", "Defines a relation that consists of the tuples in relation M and E - symbol -", "Defines a relation that consists of the tuples in relation M and E, with duplicate tuples being eliminated - symbol /", "None of the above"},
            {"To define a relation that contains all the tuples from relations M that are not in E - symbol ᴗ", "To define a relation that contains all the tuples from relations M and E - symbol ᴖ", "To define a relation that contains common tuples from relations M and E - symbol ᴖ", "None of the above"},
            {"Produce a list of all students showing their studentID, name, WAM and address", "Produce a list of all students showing all the column values in the Student relation", "Produce a list of all students showing their name and WAM", "None of the above"},
            {"List the names of all the students that are students OR tutor at least one subject", "List the names of all the students that are students AND tutor at least one subject", "List the studentID and name of all the students that are students OR tutor at least one subject", "List the studentID and name of all the students that are students AND tutor at least one subject"},
            {"List the reviews from all the students who have volunteering in a UNSW event", "List all of the names and reviews of the students who have volunteered in a UNSW event", "List all of the student IDs of the students who have volunteered in a UNSW event", "List all of the student IDs and their corresponding volunteering event, of the students who have volunteered in a UNSW event"},
            {"A result set of tuples including all the tuples in UniLodge that don't have matching values in common columns of Student, which are also included in the result set", "A result set of tuples including all the tuples in Student that have matching values in common columns of UniLodge, which are also included in the result set", "A result set of tuples including all the tuples in Student that don't have matching values in common columns of UniLodge, which are also included in the result set", "A result set of tuples including all the tuples in Student that don't have matching values in common columns of UniLodge"},
            {"π studentID, fName, lName (Student) ⋊ π studentID, dormNo, comment (UniLodge)", "π studentID, fName, lName (Student) ⋈ π studentID, dormNo, comment (UniLodge)", "π studentID, fName, lName (Student) ⋈ π dormNo, comment (UniLodge)", "π studentID, fName, lName (Student) ⋈ π studentID, dormNo (UniLodge)"},
            {"π lecture (LectureTheater) - π tutorial (LectureTheater)", "π tutorial (LectureTheater) - π lecture (LectureTheater)", "π lectureTheatreID (Tutorial) - π lectureTheatreID (Lecture)", "π lectureTheatreID (Lecture) - π lectureTheatreID (Tutorial)"},

    };

    // Array holding the answers to the quiz questions

    private String mCorrectAnswers[] = {
            "Procedural",
            "Projection, Selection, Set Difference, Union, Cartesian Product",
            "Sigma - σ",
            "Pi - π",
            "⋈",
            "A relation containing all the tuples of relations M or E, or both M and E, with duplicated tuples being eliminated - symbol ᴗ",
            "Defines a relation that consists of the tuples in relation M, but not in E - symbol -",
            "To define a relation that contains all the tuples from relations M and E - symbol ᴖ",
            "None of the above",
            "List the studentID and name of all the students that are students AND tutor at least one subject",
            "List all of the names and reviews of the students who have volunteered in a UNSW event",
            "A result set of tuples including all the tuples in Student that don't have matching values in common columns of UniLodge, which are also included in the result set",
            "π studentID, fName, lName (Student) ⋈ π studentID, dormNo, comment (UniLodge)",
            "π lectureTheatreID (Lecture) - π lectureTheatreID (Tutorial)"
    };

    // Getter methods created to return either a question, a choice or an answer

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}


