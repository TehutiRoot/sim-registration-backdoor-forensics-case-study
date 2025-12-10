package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DatePatternToRegexUtil {

    /* renamed from: a */
    public final String f40161a;

    /* renamed from: b */
    public final int f40162b;

    /* renamed from: c */
    public final C1781Yo f40163c = new C1781Yo();

    public DatePatternToRegexUtil(String str) {
        this.f40161a = str;
        this.f40162b = str.length();
    }

    /* renamed from: a */
    public final List m51325a() {
        ArrayList arrayList = new ArrayList();
        C1704Xo c1704Xo = null;
        for (int i = 0; i < this.f40162b; i++) {
            char charAt = this.f40161a.charAt(i);
            if (c1704Xo == null || c1704Xo.f7583a != charAt) {
                c1704Xo = new C1704Xo(charAt);
                arrayList.add(c1704Xo);
            } else {
                c1704Xo.m65431a();
            }
        }
        return arrayList;
    }

    public String toRegex() {
        List<C1704Xo> m51325a = m51325a();
        StringBuilder sb = new StringBuilder();
        for (C1704Xo c1704Xo : m51325a) {
            sb.append(this.f40163c.m65302i(c1704Xo));
        }
        return sb.toString();
    }
}
