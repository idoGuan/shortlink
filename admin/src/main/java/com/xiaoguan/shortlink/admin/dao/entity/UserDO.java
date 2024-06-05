package com.xiaoguan.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoguan.shortlink.admin.common.database.BaseDO;
import lombok.Data;

/**
 * ClassName: UserDO
 * Package: com.xiaoguan.shortlink.admin.dao.entity
 * Description:
 *
 * @Author 小管不要跑
 * @Create 2024/6/4 16:27
 * @Version 1.0
 */
@Data
@TableName("t_user")
public class UserDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;

}
