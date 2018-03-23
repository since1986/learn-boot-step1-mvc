package com.github.since1986.learn.boot.step1;

public final class AppConstants {

    //MVC
    public static final String[] DISPATCHER_SERVLET_MAPPINGS = {"/"};
    public static final String DEFAULT_CHARACTER_ENCODING = "UTF-8";
    public static final String[] RESOURCE_HANDLER_PATH_PATTERNS = {"/resources/**", "/favicon.ico"};
    public static final String[] RESOURCE_HANDLER_RESOURCE_LOCATIONS = {"/resources/**", "/favicon.ico"};
    public static final boolean ENABLE_MATRIX_VARIABLES = true;

    //DATABASE
    public static final String DATABASE_DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    public static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/learn-boot-step1?useUnicode=true&characterEncoding=UTF-8";
    public static final String DATABASE_USERNAME = "root";
    public static final String DATABASE_PASSWORD = "123456";
}
