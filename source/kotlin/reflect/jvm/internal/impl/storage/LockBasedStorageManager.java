package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class LockBasedStorageManager implements StorageManager {

    /* renamed from: a */
    public final ExceptionHandlingStrategy f70185a;

    /* renamed from: b */
    public final String f70186b;
    protected final SimpleLock lock;

    /* renamed from: c */
    public static final String f70184c = StringsKt__StringsKt.substringBeforeLast(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final StorageManager NO_LOCKS = new C11977a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);

    /* loaded from: classes6.dex */
    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new C11976a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$a */
        /* loaded from: classes6.dex */
        public static class C11976a implements ExceptionHandlingStrategy {
            /* renamed from: a */
            public static /* synthetic */ void m27627a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            public RuntimeException handleException(Throwable th2) {
                if (th2 == null) {
                    m27627a(0);
                }
                throw ExceptionUtilsKt.rethrow(th2);
            }
        }

        @NotNull
        RuntimeException handleException(@NotNull Throwable th2);
    }

    /* loaded from: classes6.dex */
    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a */
    /* loaded from: classes6.dex */
    public static class C11977a extends LockBasedStorageManager {
        public C11977a(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
            super(str, exceptionHandlingStrategy, simpleLock, null);
        }

        /* renamed from: a */
        public static /* synthetic */ void m27626a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        public C11990m recursionDetectedDefault(String str, Object obj) {
            if (str == null) {
                m27626a(0);
            }
            C11990m m27608a = C11990m.m27608a();
            if (m27608a == null) {
                m27626a(1);
            }
            return m27608a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b */
    /* loaded from: classes6.dex */
    public class C11978b extends C11986i {

        /* renamed from: d */
        public final /* synthetic */ Object f70187d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11978b(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj) {
            super(lockBasedStorageManager, function0);
            this.f70187d = obj;
        }

        /* renamed from: a */
        private static /* synthetic */ void m27625a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11984g
        /* renamed from: c */
        public C11990m mo27618c(boolean z) {
            C11990m m27605d = C11990m.m27605d(this.f70187d);
            if (m27605d == null) {
                m27625a(0);
            }
            return m27605d;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$c */
    /* loaded from: classes6.dex */
    public class C11979c extends AbstractC11987j {

        /* renamed from: e */
        public final /* synthetic */ Function1 f70189e;

        /* renamed from: f */
        public final /* synthetic */ Function1 f70190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11979c(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function12) {
            super(lockBasedStorageManager, function0);
            this.f70189e = function1;
            this.f70190f = function12;
        }

        /* renamed from: a */
        private static /* synthetic */ void m27624a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11984g
        /* renamed from: c */
        public C11990m mo27618c(boolean z) {
            Function1 function1 = this.f70189e;
            if (function1 == null) {
                C11990m mo27618c = super.mo27618c(z);
                if (mo27618c == null) {
                    m27624a(0);
                }
                return mo27618c;
            }
            C11990m m27605d = C11990m.m27605d(function1.invoke(Boolean.valueOf(z)));
            if (m27605d == null) {
                m27624a(1);
            }
            return m27605d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC11985h
        /* renamed from: d */
        public void mo27615d(Object obj) {
            if (obj == null) {
                m27624a(2);
            }
            this.f70190f.invoke(obj);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$d */
    /* loaded from: classes6.dex */
    public static class C11980d extends C11981e implements CacheWithNotNullValues {
        public /* synthetic */ C11980d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C11977a c11977a) {
            this(lockBasedStorageManager, concurrentMap);
        }

        /* renamed from: a */
        private static /* synthetic */ void m27623a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11981e, kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public Object computeIfAbsent(Object obj, Function0 function0) {
            if (function0 == null) {
                m27623a(2);
            }
            Object computeIfAbsent = super.computeIfAbsent(obj, function0);
            if (computeIfAbsent == null) {
                m27623a(3);
            }
            return computeIfAbsent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11980d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                m27623a(0);
            }
            if (concurrentMap == null) {
                m27623a(1);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e */
    /* loaded from: classes6.dex */
    public static class C11981e extends C11988k implements CacheWithNullableValues {

        /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$e$a */
        /* loaded from: classes6.dex */
        public class C11982a implements Function1 {
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public Object invoke(C11983f c11983f) {
                return c11983f.f70193b.invoke();
            }
        }

        public /* synthetic */ C11981e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, C11977a c11977a) {
            this(lockBasedStorageManager, concurrentMap);
        }

        /* renamed from: a */
        private static /* synthetic */ void m27622a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object computeIfAbsent(Object obj, Function0 function0) {
            if (function0 == null) {
                m27622a(2);
            }
            return invoke(new C11983f(obj, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11981e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new C11982a());
            if (lockBasedStorageManager == null) {
                m27622a(0);
            }
            if (concurrentMap == null) {
                m27622a(1);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f */
    /* loaded from: classes6.dex */
    public static class C11983f {

        /* renamed from: a */
        public final Object f70192a;

        /* renamed from: b */
        public final Function0 f70193b;

        public C11983f(Object obj, Function0 function0) {
            this.f70192a = obj;
            this.f70193b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.f70192a.equals(((C11983f) obj).f70192a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f70192a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$g */
    /* loaded from: classes6.dex */
    public static class C11984g implements NullableLazyValue {

        /* renamed from: a */
        public final LockBasedStorageManager f70194a;

        /* renamed from: b */
        public final Function0 f70195b;

        /* renamed from: c */
        public volatile Object f70196c;

        public C11984g(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            if (lockBasedStorageManager == null) {
                m27619a(0);
            }
            if (function0 == null) {
                m27619a(1);
            }
            this.f70196c = NotValue.NOT_COMPUTED;
            this.f70194a = lockBasedStorageManager;
            this.f70195b = function0;
        }

        /* renamed from: a */
        private static /* synthetic */ void m27619a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: b */
        public void mo27616b(Object obj) {
        }

        /* renamed from: c */
        public C11990m mo27618c(boolean z) {
            C11990m recursionDetectedDefault = this.f70194a.recursionDetectedDefault("in a lazy value", null);
            if (recursionDetectedDefault == null) {
                m27619a(2);
            }
            return recursionDetectedDefault;
        }

        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke;
            Object obj = this.f70196c;
            if (!(obj instanceof NotValue)) {
                return WrappedValues.unescapeThrowable(obj);
            }
            this.f70194a.lock.lock();
            try {
                Object obj2 = this.f70196c;
                if (!(obj2 instanceof NotValue)) {
                    invoke = WrappedValues.unescapeThrowable(obj2);
                } else {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.f70196c = NotValue.RECURSION_WAS_DETECTED;
                        C11990m mo27618c = mo27618c(true);
                        if (!mo27618c.m27606c()) {
                            invoke = mo27618c.m27607b();
                        }
                    }
                    if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        C11990m mo27618c2 = mo27618c(false);
                        if (!mo27618c2.m27606c()) {
                            invoke = mo27618c2.m27607b();
                        }
                    }
                    this.f70196c = notValue;
                    invoke = this.f70195b.invoke();
                    mo27616b(invoke);
                    this.f70196c = invoke;
                }
                return invoke;
            } finally {
                this.f70194a.lock.unlock();
            }
        }

        public boolean isComputed() {
            if (this.f70196c != NotValue.NOT_COMPUTED && this.f70196c != NotValue.COMPUTING) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC11985h extends C11984g {

        /* renamed from: d */
        public volatile GJ1 f70197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC11985h(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m27617a(0);
            }
            if (function0 == null) {
                m27617a(1);
            }
            this.f70197d = null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m27617a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11984g
        /* renamed from: b */
        public final void mo27616b(Object obj) {
            this.f70197d = new GJ1(obj);
            try {
                mo27615d(obj);
            } finally {
                this.f70197d = null;
            }
        }

        /* renamed from: d */
        public abstract void mo27615d(Object obj);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11984g, kotlin.jvm.functions.Function0
        public Object invoke() {
            GJ1 gj1 = this.f70197d;
            if (gj1 != null && gj1.m68274b()) {
                return gj1.m68275a();
            }
            return super.invoke();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$i */
    /* loaded from: classes6.dex */
    public static class C11986i extends C11984g implements NotNullLazyValue {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11986i(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m27614a(0);
            }
            if (function0 == null) {
                m27614a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m27614a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11984g, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                m27614a(2);
            }
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$j */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC11987j extends AbstractC11985h implements NotNullLazyValue {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC11987j(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                m27613a(0);
            }
            if (function0 == null) {
                m27613a(1);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m27613a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.AbstractC11985h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11984g, kotlin.jvm.functions.Function0
        public Object invoke() {
            Object invoke = super.invoke();
            if (invoke == null) {
                m27613a(2);
            }
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$k */
    /* loaded from: classes6.dex */
    public static class C11988k implements MemoizedFunctionToNullable {

        /* renamed from: a */
        public final LockBasedStorageManager f70198a;

        /* renamed from: b */
        public final ConcurrentMap f70199b;

        /* renamed from: c */
        public final Function1 f70200c;

        public C11988k(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, Function1 function1) {
            if (lockBasedStorageManager == null) {
                m27612a(0);
            }
            if (concurrentMap == null) {
                m27612a(1);
            }
            if (function1 == null) {
                m27612a(2);
            }
            this.f70198a = lockBasedStorageManager;
            this.f70199b = concurrentMap;
            this.f70200c = function1;
        }

        /* renamed from: a */
        private static /* synthetic */ void m27612a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: b */
        public final AssertionError m27611b(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.m27628e(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f70198a));
            if (assertionError == null) {
                m27612a(4);
            }
            return assertionError;
        }

        /* renamed from: c */
        public C11990m m27610c(Object obj, boolean z) {
            C11990m recursionDetectedDefault = this.f70198a.recursionDetectedDefault("", obj);
            if (recursionDetectedDefault == null) {
                m27612a(3);
            }
            return recursionDetectedDefault;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            Object unescapeExceptionOrNull;
            Object obj2 = this.f70199b.get(obj);
            if (obj2 != null && obj2 != NotValue.COMPUTING) {
                return WrappedValues.unescapeExceptionOrNull(obj2);
            }
            this.f70198a.lock.lock();
            try {
                Object obj3 = this.f70199b.get(obj);
                NotValue notValue = NotValue.COMPUTING;
                if (obj3 == notValue) {
                    obj3 = NotValue.RECURSION_WAS_DETECTED;
                    C11990m m27610c = m27610c(obj, true);
                    if (!m27610c.m27606c()) {
                        unescapeExceptionOrNull = m27610c.m27607b();
                        return unescapeExceptionOrNull;
                    }
                }
                if (obj3 == NotValue.RECURSION_WAS_DETECTED) {
                    C11990m m27610c2 = m27610c(obj, false);
                    if (!m27610c2.m27606c()) {
                        unescapeExceptionOrNull = m27610c2.m27607b();
                        return unescapeExceptionOrNull;
                    }
                }
                if (obj3 != null) {
                    unescapeExceptionOrNull = WrappedValues.unescapeExceptionOrNull(obj3);
                    return unescapeExceptionOrNull;
                }
                this.f70199b.put(obj, notValue);
                Object invoke = this.f70200c.invoke(obj);
                Object put = this.f70199b.put(obj, WrappedValues.escapeNull(invoke));
                if (put == notValue) {
                    return invoke;
                }
                throw m27611b(obj, put);
            } finally {
                this.f70198a.lock.unlock();
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(Object obj) {
            Object obj2 = this.f70199b.get(obj);
            if (obj2 != null && obj2 != NotValue.COMPUTING) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$l */
    /* loaded from: classes6.dex */
    public static class C11989l extends C11988k implements MemoizedFunctionToNotNull {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11989l(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, Function1 function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                m27609a(0);
            }
            if (concurrentMap == null) {
                m27609a(1);
            }
            if (function1 == null) {
                m27609a(2);
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m27609a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C11988k, kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            Object invoke = super.invoke(obj);
            if (invoke == null) {
                m27609a(3);
            }
            return invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$m */
    /* loaded from: classes6.dex */
    public static class C11990m {

        /* renamed from: a */
        public final Object f70201a;

        /* renamed from: b */
        public final boolean f70202b;

        public C11990m(Object obj, boolean z) {
            this.f70201a = obj;
            this.f70202b = z;
        }

        /* renamed from: a */
        public static C11990m m27608a() {
            return new C11990m(null, true);
        }

        /* renamed from: d */
        public static C11990m m27605d(Object obj) {
            return new C11990m(obj, false);
        }

        /* renamed from: b */
        public Object m27607b() {
            return this.f70201a;
        }

        /* renamed from: c */
        public boolean m27606c() {
            return this.f70202b;
        }

        public String toString() {
            if (m27606c()) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f70201a);
        }
    }

    public /* synthetic */ LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock, C11977a c11977a) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m27632a(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.m27632a(int):void");
    }

    /* renamed from: b */
    public static /* synthetic */ ExceptionHandlingStrategy m27631b(LockBasedStorageManager lockBasedStorageManager) {
        return lockBasedStorageManager.f70185a;
    }

    /* renamed from: d */
    public static ConcurrentMap m27629d() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* renamed from: e */
    public static Throwable m27628e(Throwable th2) {
        if (th2 == null) {
            m27632a(36);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!stackTrace[i].getClassName().startsWith(f70184c)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        th2.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return th2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m27632a(34);
        }
        this.lock.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new C11980d(this, m27629d(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new C11981e(this, m27629d(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m27632a(23);
        }
        return new C11986i(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function12) {
        if (function0 == null) {
            m27632a(28);
        }
        if (function12 == null) {
            m27632a(29);
        }
        return new C11979c(this, function0, function1, function12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m27632a(9);
        }
        MemoizedFunctionToNotNull<K, V> createMemoizedFunction = createMemoizedFunction(function1, m27629d());
        if (createMemoizedFunction == null) {
            m27632a(10);
        }
        return createMemoizedFunction;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m27632a(19);
        }
        MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, m27629d());
        if (createMemoizedFunctionWithNullableValues == null) {
            m27632a(20);
        }
        return createMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            m27632a(30);
        }
        return new C11984g(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull T t) {
        if (function0 == null) {
            m27632a(26);
        }
        if (t == null) {
            m27632a(27);
        }
        return new C11978b(this, function0, t);
    }

    @NotNull
    public <K, V> C11990m recursionDetectedDefault(@NotNull String str, K k) {
        String str2;
        if (str == null) {
            m27632a(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m27628e(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f70186b + ")";
    }

    public LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
        if (str == null) {
            m27632a(4);
        }
        if (exceptionHandlingStrategy == null) {
            m27632a(5);
        }
        if (simpleLock == null) {
            m27632a(6);
        }
        this.lock = simpleLock;
        this.f70185a = exceptionHandlingStrategy;
        this.f70186b = str;
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m27632a(14);
        }
        if (concurrentMap == null) {
            m27632a(15);
        }
        return new C11989l(this, concurrentMap, function1);
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m27632a(21);
        }
        if (concurrentMap == null) {
            m27632a(22);
        }
        return new C11988k(this, concurrentMap, function1);
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }
}
