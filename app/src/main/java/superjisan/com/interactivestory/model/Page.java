package superjisan.com.interactivestory.model;

/**
 * Created by jisan on 3/4/15.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private Boolean mIsFinal = false;


    public Page(int imageid, String text, Choice choice1, Choice choice2){
        mImageId = imageid;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Boolean getIsFinal() {
        return mIsFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageid, String text){
        mImageId = imageid;
        mText = text;
        mChoice2 = null;
        mChoice1 = null;
        mIsFinal = true;

    }

    public int getImageId(){
        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setImageId(int id) {
        mImageId = id;

    }

}
