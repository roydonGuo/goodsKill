package com.goodskill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author heng
 * @since 2019-09-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Permission extends BaseColEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "permission_id", type = IdType.AUTO)
    private Integer permissionId;

    private String permissionName;

    private String permissionMenu;

    private Integer parentPermissionId;

    private String isDir;

    private Integer orderNo;


}
