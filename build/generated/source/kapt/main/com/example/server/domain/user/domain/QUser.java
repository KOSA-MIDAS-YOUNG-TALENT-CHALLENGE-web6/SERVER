package com.example.server.domain.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -516455038L;

    public static final QUser user = new QUser("user");

    public final com.example.server.global.entity.QBaseEntity _super = new com.example.server.global.entity.QBaseEntity(this);

    public final StringPath application = createString("application");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdTime = _super.createdTime;

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath position = createString("position");

    public final EnumPath<com.example.server.domain.user.domain.type.Role> role = createEnum("role", com.example.server.domain.user.domain.type.Role.class);

    public final DateTimePath<java.time.LocalDateTime> todayOfficeGoingTime = createDateTime("todayOfficeGoingTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> todayQuittingTime = createDateTime("todayQuittingTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> todayTotalWorkingTime = createDateTime("todayTotalWorkingTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> weekTotalWorkingTime = createDateTime("weekTotalWorkingTime", java.time.LocalDateTime.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

