package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhong on 2016/3/20.
 */
public class HttpServletUtils {

    /**
     * 返回前台正确的数据 返回的json格式为:
     *
     * <pre>
     * <code>{respCode:200,
     * respMsg:"request aceess",
     * respData:object}</code>
     * </pre>
     *
     * @param response
     * @param object
     */
    public static void responseAccessData(HttpServletResponse response,
                                          Object object) {

        RespObject respObject = new RespObject(RespObject.SUCCESS,
                RespObject.SUCCESS_MSG, object);
        Gson gson = new GsonBuilder().create();
        responseJson(response, gson.toJson(respObject));
    }

    /**
     * 返回前台错误的信息，
     * @param response
     * @param respCode	错误码
     * @param respMsg	错误信息的提示
     */
    public static void responseErrorData(HttpServletResponse response,int respCode,String respMsg){

        RespObject respObject = new RespObject(respCode,
                respMsg, null);
        Gson gson = new GsonBuilder().create();
        responseJson(response, gson.toJson(respObject));
    }

    /**
     * 返回自定义的的字符串
     *
     * @param response
     * @param json
     */
    private static void responseJson(HttpServletResponse response, String json) {

        try {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(json);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
