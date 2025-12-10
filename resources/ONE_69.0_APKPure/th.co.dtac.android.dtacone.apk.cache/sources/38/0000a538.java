package com.google.api.client.auth.oauth;

import com.google.api.client.util.StringUtils;
import com.google.common.p014io.BaseEncoding;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class OAuthHmacSha256Signer implements OAuthSigner {

    /* renamed from: a */
    public final String f51671a;

    /* renamed from: b */
    public String f51672b;

    public OAuthHmacSha256Signer(String str) {
        this.f51671a = str;
    }

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String computeSignature(String str) throws GeneralSecurityException {
        StringBuilder sb = new StringBuilder();
        String str2 = this.f51671a;
        if (str2 != null) {
            sb.append(OAuthParameters.escape(str2));
        }
        sb.append(Typography.amp);
        String str3 = this.f51672b;
        if (str3 != null) {
            sb.append(OAuthParameters.escape(str3));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(StringUtils.getBytesUtf8(sb.toString()), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return BaseEncoding.base64().encode(mac.doFinal(StringUtils.getBytesUtf8(str)));
    }

    @Override // com.google.api.client.auth.oauth.OAuthSigner
    public String getSignatureMethod() {
        return "HMAC-SHA256";
    }

    public void setTokenSecret(String str) {
        this.f51672b = str;
    }
}