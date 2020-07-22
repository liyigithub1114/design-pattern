package com.liyi.design.pattern.structure.adapter.springmvc;

import java.util.Arrays;
import java.util.List;

public class DispatchServlet {

    private static List<HandlerAdapter> handlerAdapters = Arrays.asList(
            new SimpleControllerAdapter(),
            new HttpControllerAdapter(),
            new AnnotationControllerAdapter()
    );

    public void doDispatch(){

        HttpController controller = new HttpController();
        //AnnotationController controller = new AnnotationController();

        HandlerAdapter handler = getHandler(controller);

        handler.handler(controller);

    }

    public static HandlerAdapter getHandler(Object controller){
        if(!handlerAdapters.isEmpty()){
            for(HandlerAdapter handlerAdapter : handlerAdapters){
                if(handlerAdapter.support(controller)){
                    return handlerAdapter;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }
}
