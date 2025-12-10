package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;

/* loaded from: classes.dex */
public class FormattingNode extends Node {

    /* renamed from: d */
    public FormatInfo f39984d;

    public FormattingNode(int i, Object obj) {
        super(i, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof FormattingNode)) {
            FormatInfo formatInfo = this.f39984d;
            FormatInfo formatInfo2 = ((FormattingNode) obj).f39984d;
            return formatInfo != null ? formatInfo.equals(formatInfo2) : formatInfo2 == null;
        }
        return false;
    }

    public FormatInfo getFormatInfo() {
        return this.f39984d;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        FormatInfo formatInfo = this.f39984d;
        return hashCode + (formatInfo != null ? formatInfo.hashCode() : 0);
    }

    public void setFormatInfo(FormatInfo formatInfo) {
        this.f39984d = formatInfo;
    }
}