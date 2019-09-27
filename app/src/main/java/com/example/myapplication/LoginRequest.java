package com.example.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    //서버 url 설정  ... php에 저장한 php파일과 연동
    final static private String URL = "http://giantstar115.dothome.co.kr/html/Login.php";
    private Map<String, String> map;

    public LoginRequest(String id, String password, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("id", id); // String 형태가 들어오게 값을 넣어라...
        map.put("password", password);
    }

    @Override
    protected Map<String, String> getPostParams() throws AuthFailureError {
        return map;
    }
}
