# logistics



### 项目介绍

- logistics是基于Spring Boot、Spring Cloud、Vue、Element实现的Java快速开发平台。

- 目标是搭建出一套简洁易用的快速解决方案，可以帮助用户有效降低项目开发难度和成本。

- 个人博客提供本项目开发过程同步系列教程文章，手把手的教你如何开发同类系统。

### 功能列表

- ✔ 系统登录：系统用户登录，系统登录认证（token方式）
- ✔ 用户管理：新建用户，修改用户，删除用户，查询用户
- ✔ 机构管理：新建机构，修改机构，删除机构，查询机构
- ✔ 角色管理：新建角色，修改角色，删除角色，查询角色
- ✔ 菜单管理：新建菜单，修改菜单，删除菜单，查询菜单
- ✔ 字典管理：新建字典，修改字典，删除字典，查询字典
- ✔ 系统日志：记录用户操作日志，查看系统执行日志记录
- ✔ 数据监控：定制Druid信息，提供简洁有效的SQL监控
- ✔ 聚合文档：定制在线文档，提供简洁美观的API文档
- ✔ 主题切换：支持主题切换，自定主题颜色，一键换肤
- ✔ 服务治理：集成Consul注册中心，实现服务注册和发现
- ✔ 服务监控：集成Spring Boot Admin，实现服务监控
- ✘ 服务消费：集成Ribbon、Feign，服务调用和负载均衡

- ...



### 软件架构

#### 后端架构

##### 开发环境

- IDE : eclipse 4.x
- JDK : JDK1.8.x
- Maven : Maven 3.5.x
- MySQL: MySQL 5.7.x

##### 技术选型

- 核心框架：Spring Boot 2.x
- 服务治理：Spring Cloud Finchley
- 安全框架：Spring Security 5.x
- 视图框架：Spring MVC 5.x
- 持久层框架：MyBatis 3.x
- 数据库连接池：Druid 1.x
- 日志管理：SLF4J、Log4j

##### 项目结构

- logistics-common： 公共代码模块，主要放置一些工具类
- logistics-core： 核心代码模块，主要封装公共业务模块
- logistics-admin： 后台管理模块，包含用户、角色、菜单管理等
- logistics-monitor： 系统监控服务端，监控Spring Boot服务模块

- logistics-consumer： 服务消费者示例，方便在此基础上搭建模块   feign调用示例



#### 前端架构

##### 开发环境

- IDE : VS Code 1.27
- NODE: Node 8.9.x
- NPM : NPM 6.4.x

##### 技术选型

- 前端框架：Vue 2.x
- 页面组件：Element 2.x
- 状态管理：Vuex 2.x
- 后台交互：axios 0.18.x
- 图标使用：Font Awesome 4.x

##### 项目结构

logistics-ui
- assets： 图标、字体、国际化信息等静态信息
- components： 组件库，对常用组件进行封装
- http： 后台交互模块，统一后台接口请求API
- i18n： 国际化模块，使用Vue i18n进行国际化
- mock： Mock模块，模拟接口调用并返回定制数据
- permission： 权限控制模块，处理权限认证逻辑
- router： 路由管理模块，负责页面各种路由配置
- store： 状态管理模块，提供组件间状态共享
- utils： 工具模块，提供一些通用的工具方法
- views： 页面模块，主要放置各种页面视图组件

### 安装教程

#### 后端安装



1. 启动系统

    基础必需模块（注册中心：logistics-consul，服务监控：logistics-monitor）
    
    找到 logistics-consul 工程，根据安装说明安装注册中心，完成后执行 consul agent -dev 启动。

    找到 logistics-monitor 工程下的 MonitorApplication， 启动项目，开启服务监控。

    权限管理模块（权限管理：logistics-admin）

    找到 logistics-admin 工程下的 AdminApplication， 启动项目，开启权限管理系统服务。



   
    

#### 前端安装


1. 编译代码

    进入项目根目录，执行 npm install, 下载和安装项目相关依赖包。

2. 启动系统

    执行 npm run dev 命令，启动项目，通过 http://localhost:8090 访问。

3. 项目打包

    执行 npm run build 命令，启动打包，完成之后会生成 dist 目录。

4. Mock 开关

    通过修改src/mock/index.js中的openMock变量，可以一键开启或关闭Mock功能。

5. 修改配置

    如果想自定义端口（默认是8090），可以修改 config/index.js 下的 port 属性。

    后台接口和备份服务器地址配置在 src/utils/global.js，如有修改请做相应变更。


