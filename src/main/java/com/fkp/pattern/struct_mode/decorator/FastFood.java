package com.fkp.pattern.struct_mode.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 抽象构件角色，快餐店
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class FastFood {

    private float price;
    private String desc;

    public abstract float cost();


}
