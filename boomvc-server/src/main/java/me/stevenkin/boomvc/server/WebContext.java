package me.stevenkin.boomvc.server;

import me.stevenkin.boomvc.ioc.Environment;
import me.stevenkin.boomvc.ioc.Ioc;
import me.stevenkin.boomvc.server.session.SessionManager;

public class WebContext {

    private static String contextPath;

    private static Boom boom;

    public static void init(Boom boom, String contextPath){
        WebContext.contextPath = contextPath;
        WebContext.boom = boom;
    }

    public static String contextPath(){
        return WebContext.contextPath;
    }

    public static SessionManager sessionManager(){
        return boom.sessionManager();
    }

    public static Ioc ioc(){
        return boom.ioc();
    }

    public static Environment environment(){
        return boom.environment();
    }


}
