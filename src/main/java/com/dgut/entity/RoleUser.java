package com.dgut.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("roleUser")
@Data
public class RoleUser {
    private Integer id;
    private Integer roleId;
    private Integer userId;
}
