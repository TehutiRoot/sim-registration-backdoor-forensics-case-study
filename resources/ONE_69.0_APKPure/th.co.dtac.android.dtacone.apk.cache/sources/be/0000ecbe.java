package p000;

import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: of0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C21509of0 implements InterfaceC1451UY {

    /* renamed from: a */
    public final Pattern f72839a;

    public C21509of0(FileNamePattern fileNamePattern) {
        this.f72839a = Pattern.compile(C11637kX.m29192h(fileNamePattern.toRegex(false, true)));
    }

    /* renamed from: b */
    private String m26092b(String str) {
        Matcher matcher = this.f72839a.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return matcher.group(1);
        }
        return "";
    }

    @Override // p000.InterfaceC1451UY
    /* renamed from: c */
    public Integer mo26093a(String str) {
        int i = -1;
        try {
            return Integer.valueOf(Integer.parseInt(m26092b(str), 10));
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}