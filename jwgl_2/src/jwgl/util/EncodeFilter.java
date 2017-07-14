package jwgl.util;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class EncodeFilter implements Filter {

private String encoding="";public void destroy() {
   // TODO Auto-generated method stub
}
public void doFilter(ServletRequest request, ServletResponse response,
    FilterChain chain) throws IOException, ServletException {
   // TODO Auto-generated method stub
   request.setCharacterEncoding(encoding);
   chain.doFilter(request, response);
}

public void init(FilterConfig config) throws ServletException {
   // TODO Auto-generated method stub
   encoding=config.getInitParameter("encoding");
}
}
