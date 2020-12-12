package com.employees.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 
 * </p>
 *
 * @author 人事系统：employees
 * @since 2020-12-11
 */
//@Data
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
//@TableName("users")

@Entity
@TableName("users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private String login;

    private String name;

    private String salay;

    @TableField("startDate")
    private LocalDateTime startDate;


}
