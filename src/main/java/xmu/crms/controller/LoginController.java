package xmu.crms.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/api/signin")
@RequestMapping(value = "/signin")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
	public String login(@RequestParam("state") String state, @RequestParam("code") String code) {
		BufferedReader in=null;
		try {
			String result="";
			
			String appid = "wx5bf7f0bbe2a944c8";
			String secret = "56f5a6cf7753a3853be300c9fd1d5863";
			String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret
					+ "&js_code=" + code + "&grant_type=authorization_code";
			URL realurl = new URL(url);
			// 打开和URL之间的连接
            URLConnection connection = realurl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            JSON
            JSONObject json=new JSONObject(result);
            String unionId=json.getString("unionid");
            String header="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9";
            String id="2745";
            String type="student";
            
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
        finally {
                if (in!= null) {
                    try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            } 
        }
		return "";
	}
}
