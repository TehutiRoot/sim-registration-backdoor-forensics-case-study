package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class WrappedValues {

    /* renamed from: a */
    public static final Object f70405a = new C12024a();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    /* loaded from: classes6.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    /* loaded from: classes6.dex */
    public static class C12024a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    /* loaded from: classes6.dex */
    public static final class C12025b {

        /* renamed from: a */
        public final Throwable f70406a;

        public /* synthetic */ C12025b(Throwable th2, C12024a c12024a) {
            this(th2);
        }

        /* renamed from: a */
        public static /* synthetic */ void m27483a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: b */
        public Throwable m27482b() {
            Throwable th2 = this.f70406a;
            if (th2 == null) {
                m27483a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f70406a.toString();
        }

        public C12025b(Throwable th2) {
            if (th2 == null) {
                m27483a(0);
            }
            this.f70406a = th2;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m27484a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static <V> Object escapeNull(@Nullable V v) {
        if (v == null && (v = (V) f70405a) == null) {
            m27484a(1);
        }
        return v;
    }

    @NotNull
    public static Object escapeThrowable(@NotNull Throwable th2) {
        if (th2 == null) {
            m27484a(3);
        }
        return new C12025b(th2, null);
    }

    @Nullable
    public static <V> V unescapeExceptionOrNull(@NotNull Object obj) {
        if (obj == null) {
            m27484a(4);
        }
        return (V) unescapeNull(unescapeThrowable(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> V unescapeNull(@NotNull Object obj) {
        if (obj == 0) {
            m27484a(0);
        }
        if (obj == f70405a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> V unescapeThrowable(@Nullable Object obj) {
        if (obj instanceof C12025b) {
            Throwable m27482b = ((C12025b) obj).m27482b();
            if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(m27482b)) {
                throw new WrappedProcessCanceledException(m27482b);
            }
            throw ExceptionUtilsKt.rethrow(m27482b);
        }
        return obj;
    }
}
