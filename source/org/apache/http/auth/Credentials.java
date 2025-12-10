package org.apache.http.auth;

import java.security.Principal;

/* loaded from: classes6.dex */
public interface Credentials {
    String getPassword();

    Principal getUserPrincipal();
}
