package kotlin.reflect.jvm.internal.impl.util;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class TypeRegistry$getId$1 extends Lambda implements Function1<String, Integer> {
    final /* synthetic */ TypeRegistry<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeRegistry$getId$1(TypeRegistry<K, V> typeRegistry) {
        super(1);
        this.this$0 = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull String it) {
        AtomicInteger atomicInteger;
        Intrinsics.checkNotNullParameter(it, "it");
        atomicInteger = this.this$0.f70411b;
        return Integer.valueOf(atomicInteger.getAndIncrement());
    }
}