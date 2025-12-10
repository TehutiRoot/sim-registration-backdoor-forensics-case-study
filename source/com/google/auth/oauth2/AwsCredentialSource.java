package com.google.auth.oauth2;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.auth.oauth2.ExternalAccountCredentials;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class AwsCredentialSource extends ExternalAccountCredentials.CredentialSource {
    static final String IMDSV2_SESSION_TOKEN_URL_FIELD_NAME = "imdsv2_session_token_url";
    static final long serialVersionUID = -4180558200808134436L;
    final String imdsv2SessionTokenUrl;
    final String regionUrl;
    final String regionalCredentialVerificationUrl;
    final String url;

    public AwsCredentialSource(Map<String, Object> map) {
        super(map);
        if (map.containsKey("regional_cred_verification_url")) {
            Matcher matcher = Pattern.compile("(aws)([\\d]+)").matcher((String) map.get("environment_id"));
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(2));
                if (parseInt == 1) {
                    this.regionUrl = (String) map.get("region_url");
                    this.url = (String) map.get(ImagesContract.URL);
                    this.regionalCredentialVerificationUrl = (String) map.get("regional_cred_verification_url");
                    if (map.containsKey(IMDSV2_SESSION_TOKEN_URL_FIELD_NAME)) {
                        this.imdsv2SessionTokenUrl = (String) map.get(IMDSV2_SESSION_TOKEN_URL_FIELD_NAME);
                        return;
                    } else {
                        this.imdsv2SessionTokenUrl = null;
                        return;
                    }
                }
                throw new IllegalArgumentException(String.format("AWS version %s is not supported in the current build.", Integer.valueOf(parseInt)));
            }
            throw new IllegalArgumentException("Invalid AWS environment ID.");
        }
        throw new IllegalArgumentException("A regional_cred_verification_url representing the GetCallerIdentity action URL must be specified.");
    }
}
