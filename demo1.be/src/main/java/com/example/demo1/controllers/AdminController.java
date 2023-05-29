package com.example.demo1.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('Admin')")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasAuthority('admin:read')")
    public String get() { return "get admin method"; }

    @PostMapping
    @PreAuthorize("hasAuthority('admin:create')")
    public String post() { return "post admin method"; }

    @PutMapping
    @PreAuthorize("hasAuthority('admin:update')")
    public String put() { return "get admin method"; }

    @DeleteMapping
    @PreAuthorize("hasAuthority('admin:delete')")
    public String delete() { return "get admin method"; }


}
