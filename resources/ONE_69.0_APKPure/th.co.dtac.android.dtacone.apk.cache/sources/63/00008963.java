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
    public static final String f43887c;

    /* renamed from: d */
    public static final String f43888d;

    /* renamed from: e */
    public static final String f43889e;

    /* renamed from: f */
    public static final Set f43890f;

    /* renamed from: a */
    public final String f43891a;

    /* renamed from: b */
    public final String f43892b;

    static {
        String m49165a = StringMerger.m49165a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f43887c = m49165a;
        String m49165a2 = StringMerger.m49165a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f43888d = m49165a2;
        String m49165a3 = StringMerger.m49165a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f43889e = m49165a3;
        f43890f = Collections.unmodifiableSet(new HashSet(Arrays.asList(Encoding.m49166of("proto"), Encoding.m49166of("json"))));
        INSTANCE = new CCTDestination(m49165a, null);
        LEGACY_INSTANCE = new CCTDestination(m49165a2, m49165a3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f43891a = str;
        this.f43892b = str2;
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
        String str = this.f43892b;
        if (str == null && this.f43891a == null) {
            return null;
        }
        String str2 = this.f43891a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String getAPIKey() {
        return this.f43892b;
    }

    @NonNull
    public String getEndPoint() {
        return this.f43891a;
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
        return f43890f;
    }
}