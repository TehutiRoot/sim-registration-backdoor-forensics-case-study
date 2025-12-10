package org.bson.internal;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract class Optional {

    /* renamed from: a */
    public static final Optional f75932a = new C12931a();

    /* loaded from: classes6.dex */
    public static class Some<T> extends Optional {

        /* renamed from: b */
        public final Object f75933b;

        public Some(Object obj) {
            this.f75933b = obj;
        }

        @Override // org.bson.internal.Optional
        public T get() {
            return (T) this.f75933b;
        }

        @Override // org.bson.internal.Optional
        public /* bridge */ /* synthetic */ boolean isDefined() {
            return super.isDefined();
        }

        @Override // org.bson.internal.Optional
        public boolean isEmpty() {
            return false;
        }

        @Override // org.bson.internal.Optional
        public String toString() {
            return String.format("Some(%s)", this.f75933b);
        }
    }

    /* renamed from: org.bson.internal.Optional$a */
    /* loaded from: classes6.dex */
    public class C12931a extends Optional {
        @Override // org.bson.internal.Optional
        public Object get() {
            throw new NoSuchElementException(".get call on None!");
        }

        @Override // org.bson.internal.Optional
        public boolean isEmpty() {
            return true;
        }
    }

    public static <T> Optional empty() {
        return f75932a;
    }

    /* renamed from: of */
    public static <T> Optional m24194of(T t) {
        if (t == null) {
            return f75932a;
        }
        return new Some(t);
    }

    public abstract Object get();

    public boolean isDefined() {
        return !isEmpty();
    }

    public abstract boolean isEmpty();

    public String toString() {
        return "None";
    }
}
