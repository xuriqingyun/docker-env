package zhouxu.site.dockerenv.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long userSid;

    private String userType;

    private String userCode;

    private String account;

    private String password;

    private String password64;

    private String realName;

    private Integer sex;

    private String email;

    private String mobile;

    private String title;

    private Long companyId;

    private Long projectId;

    private Long orgSid;

    private String status;

    private String remark;

    private Integer errorCount;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Integer serviceLimitQuantity;

    private String applyReason;

    private Integer smsMax;

    private String uuid;

    private String skinTheme;

    private String authId;

    private String authType;

    private String createdBy;

    private Date createdDt;

    private String updatedBy;

    private Date updatedDt;

    private Long version;

    private Integer orgCreateQuota;

    private Integer orgJoinQuota;

    private String openId;

    private String avatarUrl;

    private String province;

    private String city;

    private String country;

    private String wechatName;
}