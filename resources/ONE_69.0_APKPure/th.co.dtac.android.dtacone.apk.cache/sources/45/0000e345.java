package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class WrappedValues {

    /* renamed from: a */
    public static final Object f70439a = new C12000a();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    /* loaded from: classes6.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th2) {
            super("Rethrow stored exception", th2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    /* loaded from: classes6.dex */
    public static class C12000a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    /* loaded from: classes6.dex */
    public static final class C12001b {

        /* renamed from: a */
        public final Throwable f70440a;

        public /* synthetic */ C12001b(Throwable th2, C12000a c12000a) {
            this(th2);
        }

        /* renamed from: a */
        public static /* synthetic */ void m27775a(int i) {
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
        public Throwable m27774b() {
            Throwable th2 = this.f70440a;
            if (th2 == null) {
                m27775a(1);
            }
            return th2;
        }

        public String toString() {
            return this.f70440a.toString();
        }

        public C12001b(Throwable th2) {
            if (th2 == null) {
                m27775a(0);
            }
            this.f70440a = th2;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m27776a(int i) {
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
        if (v == null && (v = (V) f70439a) == null) {
            m27776a(1);
        }
        return v;
    }

    @NotNull
    public static Object escapeThrowable(@NotNull Throwable th2) {
        if (th2 == null) {
            m27776a(3);
        }
        return new C12001b(th2, null);
    }

    @Nullable
    public static <V> V unescapeExceptionOrNull(@NotNull Object obj) {
        if (obj == null) {
            m27776a(4);
        }
        return (V) unescapeNull(unescapeThrowable(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> V unescapeNull(@NotNull Object obj) {
        if (obj == 0) {
            m27776a(0);
        }
        if (obj == f70439a) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <V> V unescapeThrowable(@Nullable Object obj) {
        if (obj instanceof C12001b) {
            Throwable m27774b = ((C12001b) obj).m27774b();
            if (throwWrappedProcessCanceledException && ExceptionUtilsKt.isProcessCanceledException(m27774b)) {
                throw new WrappedProcessCanceledException(m27774b);
            }
            throw ExceptionUtilsKt.rethrow(m27774b);
        }
        return obj;
    }
}