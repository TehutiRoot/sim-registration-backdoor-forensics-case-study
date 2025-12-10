package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.AbstractC11687a;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public interface NullabilityAnnotationStates<T> {
    @NotNull
    public static final Companion Companion = Companion.f68998a;

    /* loaded from: classes6.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f68998a = new Companion();

        /* renamed from: b */
        public static final NullabilityAnnotationStates f68999b = new NullabilityAnnotationStatesImpl(AbstractC11687a.emptyMap());

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return f68999b;
        }
    }

    @Nullable
    T get(@NotNull FqName fqName);
}
