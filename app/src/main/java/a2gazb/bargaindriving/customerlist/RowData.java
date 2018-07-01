package a2gazb.bargaindriving.customerlist;

public class RowData {

    /**
     * 0ならデータで、1ならばヘッダー
     */
    private int header;
    private String title;
    private String detail;


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHeader() {
        return header;
    }

    public void setHeader(int header) {
        this.header = header;
    }

}
