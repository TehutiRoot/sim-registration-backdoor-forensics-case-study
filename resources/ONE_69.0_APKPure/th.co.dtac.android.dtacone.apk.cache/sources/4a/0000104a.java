package p000;

import com.google.common.base.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: R9 */
/* loaded from: classes4.dex */
public final class C1202R9 {

    /* renamed from: a */
    public final String f5413a;

    /* renamed from: b */
    public final String f5414b;

    public C1202R9(String str) {
        this.f5413a = (String) Preconditions.checkNotNull(str);
        this.f5414b = str;
    }

    /* renamed from: a */
    public static C1202R9 m66695a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new C1202R9(simpleDateFormat.format(new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z").parse(str)), str);
    }

    /* renamed from: b */
    public static C1202R9 m66694b(String str) {
        new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'").parse(str);
        return new C1202R9(str);
    }

    /* renamed from: c */
    public static C1202R9 m66693c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new C1202R9(simpleDateFormat.format(new Date(System.currentTimeMillis())));
    }

    /* renamed from: d */
    public String m66692d() {
        return this.f5413a.substring(0, 8);
    }

    /* renamed from: e */
    public String m66691e() {
        return this.f5414b;
    }

    /* renamed from: f */
    public String m66690f() {
        return this.f5413a;
    }

    public C1202R9(String str, String str2) {
        this.f5413a = (String) Preconditions.checkNotNull(str);
        this.f5414b = (String) Preconditions.checkNotNull(str2);
    }
}