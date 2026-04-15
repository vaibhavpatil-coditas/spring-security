package com.coderz.springsecurity.entity;

import java.util.Set;

public enum Role {
    ADMIN(Set.of(Permissions.CREATE,Permissions.FETCH,Permissions.MODIFY,Permissions.DELETE)),
    USER(Set.of(Permissions.FETCH));

    private final Set<Permissions> permissions;

    Role(Set<Permissions> permissions) {
        this.permissions = permissions;
    }

    public Set<Permissions> getPermissions(){
        return permissions;
    }
}
