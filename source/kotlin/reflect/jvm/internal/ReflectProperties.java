package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class ReflectProperties {

    /* loaded from: classes6.dex */
    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* renamed from: b */
        public final Function0 f68473b;

        /* renamed from: c */
        public volatile SoftReference f68474c;

        public LazySoftVal(@Nullable T t, @NotNull Function0<T> function0) {
            if (function0 == null) {
                m28664a(0);
            }
            this.f68474c = null;
            this.f68473b = function0;
            if (t != null) {
                this.f68474c = new SoftReference(escape(t));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m28664a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj;
            SoftReference softReference = this.f68474c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T t = (T) this.f68473b.invoke();
            this.f68474c = new SoftReference(escape(t));
            return t;
        }
    }

    /* loaded from: classes6.dex */
    public static class LazyVal<T> extends Val<T> {

        /* renamed from: b */
        public final Function0 f68475b;

        /* renamed from: c */
        public volatile Object f68476c;

        public LazyVal(@NotNull Function0<T> function0) {
            if (function0 == null) {
                m28663a(0);
            }
            this.f68476c = null;
            this.f68475b = function0;
        }

        /* renamed from: a */
        private static /* synthetic */ void m28663a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val, kotlin.jvm.functions.Function0
        public T invoke() {
            Object obj = this.f68476c;
            if (obj != null) {
                return unescape(obj);
            }
            T t = (T) this.f68475b.invoke();
            this.f68476c = escape(t);
            return t;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Val<T> {

        /* renamed from: a */
        public static final Object f68477a = new C11728a();

        /* renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$a */
        /* loaded from: classes6.dex */
        public static class C11728a {
        }

        public Object escape(T t) {
            if (t == null) {
                return f68477a;
            }
            return t;
        }

        public final T getValue(Object obj, Object obj2) {
            return invoke();
        }

        public abstract T invoke();

        /* JADX WARN: Multi-variable type inference failed */
        public T unescape(Object obj) {
            if (obj == f68477a) {
                return null;
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m28665a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @NotNull
    public static <T> LazyVal<T> lazy(@NotNull Function0<T> function0) {
        if (function0 == null) {
            m28665a(0);
        }
        return new LazyVal<>(function0);
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@Nullable T t, @NotNull Function0<T> function0) {
        if (function0 == null) {
            m28665a(1);
        }
        return new LazySoftVal<>(t, function0);
    }

    @NotNull
    public static <T> LazySoftVal<T> lazySoft(@NotNull Function0<T> function0) {
        if (function0 == null) {
            m28665a(2);
        }
        return lazySoft(null, function0);
    }
}
