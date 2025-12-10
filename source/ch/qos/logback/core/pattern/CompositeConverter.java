package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class CompositeConverter<E> extends DynamicConverter<E> {

    /* renamed from: e */
    public Converter f39967e;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e) {
        StringBuilder sb = new StringBuilder();
        for (Converter converter = this.f39967e; converter != null; converter = converter.f39968a) {
            converter.write(sb, e);
        }
        return transform(e, sb.toString());
    }

    public Converter<E> getChildConverter() {
        return this.f39967e;
    }

    public void setChildConverter(Converter<E> converter) {
        this.f39967e = converter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompositeConverter<");
        FormatInfo formatInfo = this.f39975b;
        if (formatInfo != null) {
            sb.append(formatInfo);
        }
        if (this.f39967e != null) {
            sb.append(", children: ");
            sb.append(this.f39967e);
        }
        sb.append(">");
        return sb.toString();
    }

    public abstract String transform(E e, String str);
}
