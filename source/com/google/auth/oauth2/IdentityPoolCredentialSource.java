package com.google.auth.oauth2;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.auth.oauth2.ExternalAccountCredentials;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes4.dex */
public class IdentityPoolCredentialSource extends ExternalAccountCredentials.CredentialSource {
    private static final long serialVersionUID = -745855247050085694L;
    CredentialFormatType credentialFormatType;
    String credentialLocation;
    IdentityPoolCredentialSourceType credentialSourceType;
    @Nullable
    Map<String, String> headers;
    @Nullable
    String subjectTokenFieldName;

    /* loaded from: classes4.dex */
    public enum CredentialFormatType {
        TEXT,
        JSON
    }

    /* loaded from: classes4.dex */
    public enum IdentityPoolCredentialSourceType {
        FILE,
        URL
    }

    public IdentityPoolCredentialSource(Map<String, Object> map) {
        super(map);
        if (map.containsKey("file") && map.containsKey(ImagesContract.URL)) {
            throw new IllegalArgumentException("Only one credential source type can be set, either file or url.");
        }
        if (map.containsKey("file")) {
            this.credentialLocation = (String) map.get("file");
            this.credentialSourceType = IdentityPoolCredentialSourceType.FILE;
        } else if (map.containsKey(ImagesContract.URL)) {
            this.credentialLocation = (String) map.get(ImagesContract.URL);
            this.credentialSourceType = IdentityPoolCredentialSourceType.URL;
        } else {
            throw new IllegalArgumentException("Missing credential source file location or URL. At least one must be specified.");
        }
        Map map2 = (Map) map.get("headers");
        if (map2 != null && !map2.isEmpty()) {
            HashMap hashMap = new HashMap();
            this.headers = hashMap;
            hashMap.putAll(map2);
        }
        CredentialFormatType credentialFormatType = CredentialFormatType.TEXT;
        this.credentialFormatType = credentialFormatType;
        Map map3 = (Map) map.get("format");
        if (map3 != null && map3.containsKey("type")) {
            String str = (String) map3.get("type");
            if (str != null && "json".equals(str.toLowerCase(Locale.US))) {
                if (map3.containsKey("subject_token_field_name")) {
                    this.credentialFormatType = CredentialFormatType.JSON;
                    this.subjectTokenFieldName = (String) map3.get("subject_token_field_name");
                    return;
                }
                throw new IllegalArgumentException("When specifying a JSON credential type, the subject_token_field_name must be set.");
            } else if (str != null && TextBundle.TEXT_ENTRY.equals(str.toLowerCase(Locale.US))) {
                this.credentialFormatType = credentialFormatType;
            } else {
                throw new IllegalArgumentException(String.format("Invalid credential source format type: %s.", str));
            }
        }
    }

    public boolean hasHeaders() {
        Map<String, String> map = this.headers;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }
}
