package by.academy.it.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static by.academy.it.constants.Constants.PAGE_LOGIN;

public class AuthentificationFilter implements Filter {
    private FilterConfig filterConfig;

    public void init(FilterConfig filterConfig){
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

        HttpSession session = httpRequest.getSession();
        // Получаем путь до страницы типа /index.jsp или /loginUser.jsp
        String uriPath = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
        String val = (String)session.getAttribute("userLastName");
        if (session == null || session.getAttribute("userLastName") == null || session.getAttribute("userLastName") == ""){
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            if(PAGE_LOGIN.equals(uriPath)){
                filterChain.doFilter(servletRequest, servletResponse);
            }
            httpResponse.sendRedirect(PAGE_LOGIN + "?destination=" + uriPath);
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
