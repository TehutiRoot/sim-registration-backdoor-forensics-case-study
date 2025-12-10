package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

@DoNotMock("Use Optional.of(value) or Optional.absent()")
@GwtCompatible(serializable = true)
/* loaded from: classes4.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$a */
    /* loaded from: classes4.dex */
    public class C7433a implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ Iterable f52765a;

        /* renamed from: com.google.common.base.Optional$a$a */
        /* loaded from: classes4.dex */
        public class C7434a extends AbstractIterator {

            /* renamed from: c */
            public final Iterator f52766c;

            public C7434a() {
                C7433a.this = r1;
                this.f52766c = (Iterator) Preconditions.checkNotNull(r1.f52765a.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            /* renamed from: a */
            public Object mo41283a() {
                while (this.f52766c.hasNext()) {
                    Optional optional = (Optional) this.f52766c.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return m41351b();
            }
        }

        public C7433a(Iterable iterable) {
            this.f52765a = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C7434a();
        }
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(@CheckForNull T t) {
        if (t == null) {
            return absent();
        }
        return new Present(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m41313of(T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new C7433a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo41300or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo41299or(Supplier<? extends T> supplier);

    /* renamed from: or */
    public abstract T mo41298or(T t);

    @CheckForNull
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
