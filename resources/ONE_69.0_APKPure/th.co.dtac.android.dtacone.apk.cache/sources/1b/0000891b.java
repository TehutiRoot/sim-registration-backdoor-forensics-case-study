package com.github.gcacace.signaturepad.utils;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public class SvgBuilder {

    /* renamed from: a */
    public final StringBuilder f43762a = new StringBuilder();

    /* renamed from: b */
    public SvgPathBuilder f43763b = null;

    /* renamed from: a */
    public final void m49268a() {
        this.f43762a.append(this.f43763b);
    }

    public SvgBuilder append(Bezier bezier, float f) {
        Integer valueOf = Integer.valueOf(Math.round(f));
        MQ1 mq1 = new MQ1(bezier.startPoint);
        MQ1 mq12 = new MQ1(bezier.control1);
        MQ1 mq13 = new MQ1(bezier.control2);
        MQ1 mq14 = new MQ1(bezier.endPoint);
        if (!m49267b()) {
            m49266c(valueOf, mq1);
        }
        if (!mq1.equals(this.f43763b.getLastPoint()) || !valueOf.equals(this.f43763b.getStrokeWidth())) {
            m49268a();
            m49266c(valueOf, mq1);
        }
        this.f43763b.append(mq12, mq13, mq14);
        return this;
    }

    /* renamed from: b */
    public final boolean m49267b() {
        if (this.f43763b != null) {
            return true;
        }
        return false;
    }

    public String build(int i, int i2) {
        if (m49267b()) {
            m49268a();
        }
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.2\" baseProfile=\"tiny\" height=\"" + i2 + "\" width=\"" + i + "\" viewBox=\"0" + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + 0 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + i + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + i2 + "\"><g stroke-linejoin=\"round\" stroke-linecap=\"round\" fill=\"none\" stroke=\"black\">" + ((CharSequence) this.f43762a) + "</g></svg>";
    }

    /* renamed from: c */
    public final void m49266c(Integer num, MQ1 mq1) {
        this.f43763b = new SvgPathBuilder(mq1, num);
    }

    public void clear() {
        this.f43762a.setLength(0);
        this.f43763b = null;
    }
}