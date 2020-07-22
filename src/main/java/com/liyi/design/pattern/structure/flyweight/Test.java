package com.liyi.design.pattern.structure.flyweight;

public class Test {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite news = webSiteFactory.getWebSite("新闻");
        news.use(new User("张三"));

        WebSite blog = webSiteFactory.getWebSite("博客");
        blog.use(new User("李四"));

        WebSite blog1 = webSiteFactory.getWebSite("博客");
        blog.use(new User("王五"));

        System.out.println(webSiteFactory.getCount());
    }
}
