package com.google.auth.oauth2;

import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.GenericJson;
import com.google.common.base.Preconditions;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
class OAuthException extends GoogleAuthException {
    private final String errorCode;
    @Nullable
    private final String errorDescription;
    @Nullable
    private final String errorUri;

    public OAuthException(String str, @Nullable String str2, @Nullable String str3) {
        this.errorCode = (String) Preconditions.checkNotNull(str);
        this.errorDescription = str2;
        this.errorUri = str3;
    }

    public static OAuthException createFromHttpResponseException(HttpResponseException httpResponseException) throws IOException {
        String str;
        GenericJson genericJson = (GenericJson) CJ0.f695f.createJsonParser(httpResponseException.getContent()).parseAndClose((Class<Object>) GenericJson.class);
        String str2 = (String) genericJson.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        String str3 = null;
        if (genericJson.containsKey("error_description")) {
            str = (String) genericJson.get("error_description");
        } else {
            str = null;
        }
        if (genericJson.containsKey("error_uri")) {
            str3 = (String) genericJson.get("error_uri");
        }
        return new OAuthException(str2, str, str3);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public String getErrorDescription() {
        return this.errorDescription;
    }

    @Nullable
    public String getErrorUri() {
        return this.errorUri;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder("Error code " + this.errorCode);
        if (this.errorDescription != null) {
            sb.append(": ");
            sb.append(this.errorDescription);
        }
        if (this.errorUri != null) {
            sb.append(" - ");
            sb.append(this.errorUri);
        }
        return sb.toString();
    }
}
