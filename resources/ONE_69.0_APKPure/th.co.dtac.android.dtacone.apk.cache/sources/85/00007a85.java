package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {

    /* renamed from: e */
    public Converter f39965e;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e) {
        StringBuilder sb = new StringBuilder();
        for (Converter converter = this.f39965e; converter != null; converter = converter.f39966a) {
            converter.write(sb, e);
        }
        return transform(e, sb.toString());
    }

    public Converter<E> getChildConverter() {
        return this.f39965e;
    }

    public void setChildConverter(Converter<E> converter) {
        this.f39965e = converter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompositeConverter<");
        FormatInfo formatInfo = this.f39973b;
        if (formatInfo != null) {
            sb.append(formatInfo);
        }
        if (this.f39965e != null) {
            sb.append(", children: ");
            sb.append(this.f39965e);
        }
        sb.append(">");
        return sb.toString();
    }

    public abstract String transform(E e, String str);
}