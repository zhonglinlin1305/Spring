package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.utils;

/**
 * Created by zhong on 2016/3/20.
 */
public class RespObject {
    /**请求成功*/
    public static final int SUCCESS = 200;
    public static final String SUCCESS_MSG = "请求成功！";

    private Integer respCode;
    private String respMsg;
    private Object respData;

    public RespObject() {
    }

    public RespObject(Integer respCode, String respMsg, Object respData) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.respData = respData;
    }

    public Integer getRespCode() {
        return respCode;
    }

    public void setRespCode(Integer respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public Object getRespData() {
        return respData;
    }

    public void setRespData(Object respData) {
        this.respData = respData;
    }
}
