package com.fkp.principles.demeter;

public class AgentTest {
    public static void main(String[] args) {
        Star star = new Star("许嵩");
        Fans fans = new Fans("张三");
        Company company = new Company("xxx娱乐公司");
        Agent agent = new Agent();
        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);

        agent.meeting();
        agent.business();
        /*
         * 明星和粉丝见面以及和公司洽谈都通过经纪人进行，也就是明星的朋友是经纪人，陌生人为公司和粉丝，也就是两个软件实体无需直接通信，那么就不应该发生直接的相互调用，可以通过第三方转发该调用，其目的是降低类之间的耦合度，提高模块的相对独立性。
         * 此种方式符合该条件即遵守了迪米特法则
         */
    }
}
