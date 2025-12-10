package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public final class LiteralConverter<E> extends Converter<E> {

    /* renamed from: b */
    public String f39976b;

    public LiteralConverter(String str) {
        this.f39976b = str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(E e) {
        return this.f39976b;
    }
}
