package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("role")
@Data
public class Role {
    private Integer roleId;
    private String name;
    private String description;
}
