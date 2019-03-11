package cn.jpush.reactnativejpush;

public class ExtDatas {

    //{"extdata":"{\"badge\":1,\"data\":{\"id\":50906,\"objectclass\":\"IT_FW\"},\"type\":\"OA\"}","org_content":"您有一份IT发文单，题为：3434534,请尽快办理。","sendTime":"1552290685051"}
    private String extdata;
    private String org_content;
    private String sendTime;

    public String getExtdata() {
        return extdata;
    }

    public void setExtdata(String extdata) {
        this.extdata = extdata;
    }

    public String getOrg_content() {
        return org_content;
    }

    public void setOrg_content(String org_content) {
        this.org_content = org_content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
