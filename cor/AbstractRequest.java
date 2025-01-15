package behaviour_design_pattern.cor;

public abstract class AbstractRequest {
    private int requestCode;

    public AbstractRequest(int requestCode){
        this.requestCode=requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
