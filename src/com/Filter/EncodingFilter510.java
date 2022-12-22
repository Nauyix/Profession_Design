package com.Filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebFilter(filterName = "EncodingFilter",urlPatterns="/*")
public class EncodingFilter510 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        CharacterRequest characterRequest = new CharacterRequest(req);
        chain.doFilter(request, response);
    }
}
class CharacterRequest extends HttpServletRequestWrapper {
    private HttpServletRequest request;
    public CharacterRequest(HttpServletRequest request){
        super(request);
        this.request = request;
    }
    public String getParameter(String name){
        String value=super.getParameter(name);
        if(value==null) return null;
        String method=super.getMethod();
        if("get".equalsIgnoreCase(method)){
            try{
                value=new String(value.getBytes("iso-8859-1"),"utf-8");
            }catch (UnsupportedEncodingException e) {
                throw new RuntimeException();
            }
        }
        return value;
    }
}
