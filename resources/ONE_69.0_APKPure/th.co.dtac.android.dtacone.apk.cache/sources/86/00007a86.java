package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class Converter<E> {

    /* renamed from: a */
    public Converter f39966a;

    public abstract String convert(E e);

    public final Converter<E> getNext() {
        return this.f39966a;
    }

    public final void setNext(Converter<E> converter) {
        if (this.f39966a != null) {
            throw new IllegalStateException("Next converter has been already set");
        }
        this.f39966a = converter;
    }

    public void write(StringBuilder sb, E e) {
        sb.append(convert(e));
    }
}