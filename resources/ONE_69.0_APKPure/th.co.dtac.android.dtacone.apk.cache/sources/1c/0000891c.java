package com.github.gcacace.signaturepad.utils;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public class SvgPathBuilder {

    /* renamed from: a */
    public final StringBuilder f43764a;

    /* renamed from: b */
    public final Integer f43765b;

    /* renamed from: c */
    public final MQ1 f43766c;

    /* renamed from: d */
    public MQ1 f43767d;
    public static final Character SVG_RELATIVE_CUBIC_BEZIER_CURVE = 'c';
    public static final Character SVG_MOVE = 'M';

    public SvgPathBuilder(MQ1 mq1, Integer num) {
        this.f43765b = num;
        this.f43766c = mq1;
        this.f43767d = mq1;
        StringBuilder sb = new StringBuilder();
        this.f43764a = sb;
        sb.append(SVG_RELATIVE_CUBIC_BEZIER_CURVE);
    }

    /* renamed from: a */
    public final String m49265a(MQ1 mq1, MQ1 mq12, MQ1 mq13) {
        String str = mq1.m67368b(this.f43767d) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + mq12.m67368b(this.f43767d) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + mq13.m67368b(this.f43767d) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        if ("c0 0 0 0 0 0".equals(str)) {
            return "";
        }
        return str;
    }

    public SvgPathBuilder append(MQ1 mq1, MQ1 mq12, MQ1 mq13) {
        this.f43764a.append(m49265a(mq1, mq12, mq13));
        this.f43767d = mq13;
        return this;
    }

    public final MQ1 getLastPoint() {
        return this.f43767d;
    }

    public final Integer getStrokeWidth() {
        return this.f43765b;
    }

    public String toString() {
        return "<path stroke-width=\"" + this.f43765b + "\" d=\"" + SVG_MOVE + this.f43766c + ((CharSequence) this.f43764a) + "\"/>";
    }
}