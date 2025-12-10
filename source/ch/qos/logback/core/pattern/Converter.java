package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class Converter<E> {

    /* renamed from: a */
    public Converter f39968a;

    public abstract String convert(E e);

    public final Converter<E> getNext() {
        return this.f39968a;
    }

    public final void setNext(Converter<E> converter) {
        if (this.f39968a != null) {
            throw new IllegalStateException("Next converter has been already set");
        }
        this.f39968a = converter;
    }

    public void write(StringBuilder sb, E e) {
        sb.append(convert(e));
    }
}
