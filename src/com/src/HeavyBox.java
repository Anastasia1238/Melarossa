public class HeavyBox {
    private int weding;
    private String boxContent;


    public HeavyBox(int weding, String boxContent) {
        this.boxContent = boxContent;
        this.weding = weding;
    }

    public int getWeding() {
        return weding;
    }

    public void setWeding(int weding) {
        this.weding = weding;
    }

    public String getBoxContent() {
        return boxContent;
    }

    public void setBoxContent(String boxContent) {
        this.boxContent = boxContent;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weding=" + weding +
                ", boxContent='" + boxContent + '\'' +
                '}';
    }


}


