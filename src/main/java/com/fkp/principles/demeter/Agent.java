package com.fkp.principles.demeter;

public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void meeting(){
        System.out.println("明星" + star.getName() + "和粉丝" + fans.getName() + "见面...");
    }

    public void business(){
        System.out.println("明星" + star.getName() + "和" + company.getName() + "进行洽谈...");
    }


    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
