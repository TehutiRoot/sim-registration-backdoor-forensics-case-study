package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.regex.Pattern;

/* renamed from: uV1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22523uV1 {

    /* renamed from: d */
    public static final Pattern f107766d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f107767a;

    /* renamed from: b */
    public final String f107768b;

    /* renamed from: c */
    public final String f107769c;

    public C22523uV1(String str, String str2) {
        this.f107767a = m1165d(str2, str);
        this.f107768b = str;
        this.f107769c = str + "!" + str2;
    }

    /* renamed from: a */
    public static C22523uV1 m1168a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C22523uV1(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m1165d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f107766d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: f */
    public static C22523uV1 m1163f(String str) {
        return new C22523uV1("S", str);
    }

    /* renamed from: g */
    public static C22523uV1 m1162g(String str) {
        return new C22523uV1(PDBorderStyleDictionary.STYLE_UNDERLINE, str);
    }

    /* renamed from: b */
    public String m1167b() {
        return this.f107768b;
    }

    /* renamed from: c */
    public String m1166c() {
        return this.f107767a;
    }

    /* renamed from: e */
    public String m1164e() {
        return this.f107769c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22523uV1)) {
            return false;
        }
        C22523uV1 c22523uV1 = (C22523uV1) obj;
        if (!this.f107767a.equals(c22523uV1.f107767a) || !this.f107768b.equals(c22523uV1.f107768b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f107768b, this.f107767a);
    }
}