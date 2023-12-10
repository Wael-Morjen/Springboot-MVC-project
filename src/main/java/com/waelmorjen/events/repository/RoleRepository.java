package com.waelmorjen.events.repository;

import com.waelmorjen.events.models.Role;

public interface RoleRepository {
    Role findByName(String name);
}
