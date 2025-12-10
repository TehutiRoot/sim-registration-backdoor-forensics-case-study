package com.google.auth.oauth2;

import com.google.common.base.Preconditions;

/* loaded from: classes4.dex */
class PluggableAuthException extends OAuthException {
    public PluggableAuthException(String str, String str2) {
        super(str, (String) Preconditions.checkNotNull(str2), null);
    }

    @Override // com.google.auth.oauth2.OAuthException, java.lang.Throwable
    public String getMessage() {
        return "Error code " + getErrorCode() + ": " + getErrorDescription();
    }
}
