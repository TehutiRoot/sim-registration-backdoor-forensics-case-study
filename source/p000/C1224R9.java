package p000;

import com.google.common.base.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: R9 */
/* loaded from: classes4.dex */
public final class C1224R9 {

    /* renamed from: a */
    public final String f5280a;

    /* renamed from: b */
    public final String f5281b;

    public C1224R9(String str) {
        this.f5280a = (String) Preconditions.checkNotNull(str);
        this.f5281b = str;
    }

    /* renamed from: a */
    public static C1224R9 m66500a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new C1224R9(simpleDateFormat.format(new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z").parse(str)), str);
    }

    /* renamed from: b */
    public static C1224R9 m66499b(String str) {
        new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'").parse(str);
        return new C1224R9(str);
    }

    /* renamed from: c */
    public static C1224R9 m66498c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new C1224R9(simpleDateFormat.format(new Date(System.currentTimeMillis())));
    }

    /* renamed from: d */
    public String m66497d() {
        return this.f5280a.substring(0, 8);
    }

    /* renamed from: e */
    public String m66496e() {
        return this.f5281b;
    }

    /* renamed from: f */
    public String m66495f() {
        return this.f5280a;
    }

    public C1224R9(String str, String str2) {
        this.f5280a = (String) Preconditions.checkNotNull(str);
        this.f5281b = (String) Preconditions.checkNotNull(str2);
    }
}
