package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class FormattingConverter<E> extends Converter<E> {

    /* renamed from: b */
    public FormatInfo f39975b;

    public final FormatInfo getFormattingInfo() {
        return this.f39975b;
    }

    public final void setFormattingInfo(FormatInfo formatInfo) {
        if (this.f39975b != null) {
            throw new IllegalStateException("FormattingInfo has been already set");
        }
        this.f39975b = formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public final void write(StringBuilder sb, E e) {
        String convert = convert(e);
        FormatInfo formatInfo = this.f39975b;
        if (formatInfo == null) {
            sb.append(convert);
            return;
        }
        int min = formatInfo.getMin();
        int max = this.f39975b.getMax();
        if (convert == null) {
            if (min > 0) {
                SpacePadder.spacePad(sb, min);
                return;
            }
            return;
        }
        int length = convert.length();
        if (length > max) {
            convert = this.f39975b.isLeftTruncate() ? convert.substring(length - max) : convert.substring(0, max);
        } else if (length < min) {
            if (this.f39975b.isLeftPad()) {
                SpacePadder.leftPad(sb, convert, min);
                return;
            } else {
                SpacePadder.rightPad(sb, convert, min);
                return;
            }
        }
        sb.append(convert);
    }
}
