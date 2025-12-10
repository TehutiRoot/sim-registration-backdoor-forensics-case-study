package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, m29141k = 3, m29140mv = {1, 9, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n*L\n1#1,206:1\n*E\n"})
/* loaded from: classes6.dex */
public final class ClassValueReferences$getOrSet$2 extends Lambda implements Function0<Object> {
    final /* synthetic */ Function0<Object> $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassValueReferences$getOrSet$2(Function0<Object> function0) {
        super(0);
        this.$factory = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.$factory.invoke();
    }
}