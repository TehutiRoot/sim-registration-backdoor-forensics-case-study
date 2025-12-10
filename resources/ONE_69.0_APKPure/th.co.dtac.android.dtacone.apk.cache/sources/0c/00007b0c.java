package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DatePatternToRegexUtil {

    /* renamed from: a */
    public final String f40159a;

    /* renamed from: b */
    public final int f40160b;

    /* renamed from: c */
    public final C1761Yo f40161c = new C1761Yo();

    public DatePatternToRegexUtil(String str) {
        this.f40159a = str;
        this.f40160b = str.length();
    }

    /* renamed from: a */
    public final List m51320a() {
        ArrayList arrayList = new ArrayList();
        C1693Xo c1693Xo = null;
        for (int i = 0; i < this.f40160b; i++) {
            char charAt = this.f40159a.charAt(i);
            if (c1693Xo == null || c1693Xo.f7667a != charAt) {
                c1693Xo = new C1693Xo(charAt);
                arrayList.add(c1693Xo);
            } else {
                c1693Xo.m65566a();
            }
        }
        return arrayList;
    }

    public String toRegex() {
        List<C1693Xo> m51320a = m51320a();
        StringBuilder sb = new StringBuilder();
        for (C1693Xo c1693Xo : m51320a) {
            sb.append(this.f40161c.m65353i(c1693Xo));
        }
        return sb.toString();
    }
}