package com.eventcontrol.util;

import javax.servlet.http.HttpSession;

public class AuthHelper 
{
    private HttpSession session;

    public AuthHelper(HttpSession session) {
        this.session = session;
    }
    
    public boolean isUserLoggedIn()
    {
        return this.session.getAttribute("USER") != null;
    }
    
    public boolean isAdminLoggedIn()
    {
        return this.session.getAttribute("ADMIN") != null;
    }
}
