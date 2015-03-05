package superjisan.com.interactivestory.model;

/**
 * Created by jisan on 3/4/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {

        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}
