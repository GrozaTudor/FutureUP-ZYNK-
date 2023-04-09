package ro.zynk.futureup.controllers.responses;

public class ValueResponse extends BaseResponse {
    private Float value;
    public ValueResponse(Float value) {
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
