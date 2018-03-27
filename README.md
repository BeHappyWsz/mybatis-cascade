# mybatis-cascade
mybatis级联进行模拟查询

1.OneToMany:User-Book

2.ManyToOne:User-Address

3.ManyToMany:User-Role(双向一对多)，使用中间表t_user_role

注意事项：

1.resultMap中association/collection的上下顺序不能变,否则异常

2.多表连接查询相同的字段比如id，最好区分开，在本例中需要使用id查询关联的多的一方。
