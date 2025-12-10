package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class CCTDestination implements EncodedDestination {
    public static final CCTDestination INSTANCE;
    public static final CCTDestination LEGACY_INSTANCE;

    /* renamed from: c */
    public static final String f43875c;

    /* renamed from: d */
    public static final String f43876d;

    /* renamed from: e */
    public static final String f43877e;

    /* renamed from: f */
    public static final Set f43878f;

    /* renamed from: a */
    public final String f43879a;

    /* renamed from: b */
    public final String f43880b;

    static {
        String m49168a = StringMerger.m49168a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f43875c = m49168a;
        String m49168a2 = StringMerger.m49168a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f43876d = m49168a2;
        String m49168a3 = StringMerger.m49168a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f43877e = m49168a3;
        f43878f = Collections.unmodifiableSet(new HashSet(Arrays.asList(Encoding.m49169of("proto"), Encoding.m49169of("json"))));
        INSTANCE = new CCTDestination(m49168a, null);
        LEGACY_INSTANCE = new CCTDestination(m49168a2, m49168a3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f43879a = str;
        this.f43880b = str2;
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Nullable
    public byte[] asByteArray() {
        String str = this.f43880b;
        if (str == null && this.f43879a == null) {
            return null;
        }
        String str2 = this.f43879a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String getAPIKey() {
        return this.f43880b;
    }

    @NonNull
    public String getEndPoint() {
        return this.f43879a;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @Nullable
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @NonNull
    public String getName() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
        return f43878f;
    }
}
