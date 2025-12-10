package com.github.gcacace.signaturepad.utils;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public class SvgPathBuilder {

    /* renamed from: a */
    public final StringBuilder f43752a;

    /* renamed from: b */
    public final Integer f43753b;

    /* renamed from: c */
    public final PP1 f43754c;

    /* renamed from: d */
    public PP1 f43755d;
    public static final Character SVG_RELATIVE_CUBIC_BEZIER_CURVE = 'c';
    public static final Character SVG_MOVE = 'M';

    public SvgPathBuilder(PP1 pp1, Integer num) {
        this.f43753b = num;
        this.f43754c = pp1;
        this.f43755d = pp1;
        StringBuilder sb = new StringBuilder();
        this.f43752a = sb;
        sb.append(SVG_RELATIVE_CUBIC_BEZIER_CURVE);
    }

    /* renamed from: a */
    public final String m49268a(PP1 pp1, PP1 pp12, PP1 pp13) {
        String str = pp1.m66798b(this.f43755d) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + pp12.m66798b(this.f43755d) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + pp13.m66798b(this.f43755d) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        if ("c0 0 0 0 0 0".equals(str)) {
            return "";
        }
        return str;
    }

    public SvgPathBuilder append(PP1 pp1, PP1 pp12, PP1 pp13) {
        this.f43752a.append(m49268a(pp1, pp12, pp13));
        this.f43755d = pp13;
        return this;
    }

    public final PP1 getLastPoint() {
        return this.f43755d;
    }

    public final Integer getStrokeWidth() {
        return this.f43753b;
    }

    public String toString() {
        return "<path stroke-width=\"" + this.f43753b + "\" d=\"" + SVG_MOVE + this.f43754c + ((CharSequence) this.f43752a) + "\"/>";
    }
}
