## yisoso简易数据搜索中台

### 需求分析(搜索图片、文章、用户)
1、支持单一搜索（例如只搜索图片或者文章等）

2、支持聚合搜索、允许用户在同一页面集中搜索不同来源，不同类型的数据

3、图片链接从网络中爬取，用户和文章建立数据库表从本地查询（不用登陆注册等）

### 技术选型

1、springboot框架、 maven依赖

2、ES（待学）

3、hutool工具类爬虫相关

### 数据库设计

--用户表

```sql
id 用户id
userAccount 用户账号
userPassword 用户密码
userName 用户昵称
userAvatar 用户头像
phone 用户电话
email 用户邮箱
userStatus 用户状态 0-正常 1-禁用 默认0
userRole 用户角色 0-普通用户 1-管理员 默认0
createTime 创建时间
updateTime 更新时间
isDelete 是否删除 0-存在 1-删除 默认0
```

--文章表
```sql
id 文章id
title 文章标题
content 文章内容
category 文章类别
userId 创建文章用户id
createTime 创建时间
updateTime 更新时间
isDelete 是否删除 0-存在 1-删除 默认0
```

### 功能设计

1、用户搜索

2、文章搜索

3、图片搜索


### 详细设计