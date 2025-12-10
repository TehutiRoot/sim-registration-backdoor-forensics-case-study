package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.regex.Pattern;

/* renamed from: xU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22970xU1 {

    /* renamed from: d */
    public static final Pattern f108385d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f108386a;

    /* renamed from: b */
    public final String f108387b;

    /* renamed from: c */
    public final String f108388c;

    public C22970xU1(String str, String str2) {
        this.f108386a = m504d(str2, str);
        this.f108387b = str;
        this.f108388c = str + "!" + str2;
    }

    /* renamed from: a */
    public static C22970xU1 m507a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C22970xU1(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m504d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f108385d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: f */
    public static C22970xU1 m502f(String str) {
        return new C22970xU1("S", str);
    }

    /* renamed from: g */
    public static C22970xU1 m501g(String str) {
        return new C22970xU1(PDBorderStyleDictionary.STYLE_UNDERLINE, str);
    }

    /* renamed from: b */
    public String m506b() {
        return this.f108387b;
    }

    /* renamed from: c */
    public String m505c() {
        return this.f108386a;
    }

    /* renamed from: e */
    public String m503e() {
        return this.f108388c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22970xU1)) {
            return false;
        }
        C22970xU1 c22970xU1 = (C22970xU1) obj;
        if (!this.f108386a.equals(c22970xU1.f108386a) || !this.f108387b.equals(c22970xU1.f108387b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f108387b, this.f108386a);
    }
}
