package GetServerTime;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        long startTime = System.currentTimeMillis();
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();

        System.out.println("本次请求使用的时间为" + new Long(endTime - startTime) + "ms");
        request.setAttribute("hanglinguTime", endTime - startTime);

    }
}
