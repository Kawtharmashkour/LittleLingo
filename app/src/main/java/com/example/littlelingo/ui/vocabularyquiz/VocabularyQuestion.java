package com.example.littlelingo.ui.vocabularyquiz;

public class VocabularyQuestion {
    public int id;
    public String image;
    public String optionOne;
    public String optionTwo;
    public String getOptionThree;
    public String optionFour;
    public String correctAnswer;

    public VocabularyQuestion(int id, String image, String optionOne, String optionTwo, String getOptionThree, String optionFour, String correctAnswer) {
        this.id = id;
        this.image = image;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.getOptionThree = getOptionThree;
        this.optionFour = optionFour;
        this.correctAnswer = correctAnswer;
    }

    public VocabularyQuestion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getGetOptionThree() {
        return getOptionThree;
    }

    public void setGetOptionThree(String getOptionThree) {
        this.getOptionThree = getOptionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
