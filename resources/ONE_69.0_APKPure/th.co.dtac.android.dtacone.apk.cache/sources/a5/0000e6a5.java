package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class ClassValueCtorCache extends CtorCache {

    /* renamed from: a */
    public static final ClassValueCtorCache f71015a = new ClassValueCtorCache();

    /* renamed from: b */
    public static final ClassValueCtorCache$cache$1 f71016b = new ClassValue<Function1<? super Throwable, ? extends Throwable>>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
            return m74883computeValue((Class<?>) cls);
        }

        @NotNull
        /* renamed from: computeValue  reason: collision with other method in class */
        public Function1<Throwable, Throwable> m74883computeValue(@Nullable Class<?> cls) {
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return ExceptionsConstructorKt.access$createConstructor(cls);
        }
    };

    @Override // kotlinx.coroutines.internal.CtorCache
    public Function1 get(Class cls) {
        Object obj;
        obj = f71016b.get(cls);
        return (Function1) obj;
    }
}