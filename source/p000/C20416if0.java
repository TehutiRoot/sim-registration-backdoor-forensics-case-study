package p000;

import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: if0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20416if0 implements InterfaceC1185QY {

    /* renamed from: a */
    public final Pattern f62853a;

    public C20416if0(FileNamePattern fileNamePattern) {
        this.f62853a = Pattern.compile(C10309gX.m31098h(fileNamePattern.toRegex(false, true)));
    }

    /* renamed from: b */
    private String m30617b(String str) {
        Matcher matcher = this.f62853a.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return matcher.group(1);
        }
        return "";
    }

    @Override // p000.InterfaceC1185QY
    /* renamed from: c */
    public Integer mo30618a(String str) {
        int i = -1;
        try {
            return Integer.valueOf(Integer.parseInt(m30617b(str), 10));
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
