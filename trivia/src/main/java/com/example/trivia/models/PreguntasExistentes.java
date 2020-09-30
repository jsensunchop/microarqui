package com.example.trivia.models;

import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class PreguntasExistentes {
    @Id
    public ObjectId _id;

    public String title;
    public String questionCategory;
    public String questionImage;
    public String question;
    public String optionA;
    public String optionB;
    public String optionC;
    public String optionD;
    public String answer;
    public Date creationDate;
    public Date updateDate;

    public PreguntasExistentes(ObjectId _id, String title, String questionCategory, String questionImage, String question, String optionA, String optionB,
                               String optionC, String optionD, String answer,Date creationDate, Date updateDate) {
        this._id = _id;
        this.title = title;
        this.questionCategory = questionCategory;
        this.questionImage = questionImage;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    // ObjectId needs to be converted to string
    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestionCategory() {
        return questionCategory;
    }

    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

    public String getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(String questionImage) {
        this.questionImage = questionImage;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    //public String getToUserId() {
    //    return toUserId;
    //}

    //public void setToUserId(String toUserId) {
    //    this.toUserId = toUserId;
    //}

    //public String getFromUserId() {
    //    return fromUserId;
    //}

    //public void setFromUserId(String fromUserId) {
    //    this.fromUserId = fromUserId;
    //}


    // Constructors
    public PreguntasExistentes() {
    }


}

