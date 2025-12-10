package com.github.gcacace.signaturepad.utils;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public class SvgBuilder {

    /* renamed from: a */
    public final StringBuilder f43750a = new StringBuilder();

    /* renamed from: b */
    public SvgPathBuilder f43751b = null;

    /* renamed from: a */
    public final void m49271a() {
        this.f43750a.append(this.f43751b);
    }

    public SvgBuilder append(Bezier bezier, float f) {
        Integer valueOf = Integer.valueOf(Math.round(f));
        PP1 pp1 = new PP1(bezier.startPoint);
        PP1 pp12 = new PP1(bezier.control1);
        PP1 pp13 = new PP1(bezier.control2);
        PP1 pp14 = new PP1(bezier.endPoint);
        if (!m49270b()) {
            m49269c(valueOf, pp1);
        }
        if (!pp1.equals(this.f43751b.getLastPoint()) || !valueOf.equals(this.f43751b.getStrokeWidth())) {
            m49271a();
            m49269c(valueOf, pp1);
        }
        this.f43751b.append(pp12, pp13, pp14);
        return this;
    }

    /* renamed from: b */
    public final boolean m49270b() {
        if (this.f43751b != null) {
            return true;
        }
        return false;
    }

    public String build(int i, int i2) {
        if (m49270b()) {
            m49271a();
        }
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.2\" baseProfile=\"tiny\" height=\"" + i2 + "\" width=\"" + i + "\" viewBox=\"0" + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + 0 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + i + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + i2 + "\"><g stroke-linejoin=\"round\" stroke-linecap=\"round\" fill=\"none\" stroke=\"black\">" + ((CharSequence) this.f43750a) + "</g></svg>";
    }

    /* renamed from: c */
    public final void m49269c(Integer num, PP1 pp1) {
        this.f43751b = new SvgPathBuilder(pp1, num);
    }

    public void clear() {
        this.f43750a.setLength(0);
        this.f43751b = null;
    }
}
