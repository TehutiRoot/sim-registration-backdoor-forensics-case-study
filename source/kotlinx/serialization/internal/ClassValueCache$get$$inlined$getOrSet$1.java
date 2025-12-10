package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(m28851d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28850d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "kotlinx/serialization/internal/ClassValueReferences$getOrSet$2"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,206:1\n52#2:207\n*E\n"})
/* loaded from: classes6.dex */
public final class ClassValueCache$get$$inlined$getOrSet$1 extends Lambda implements Function0<Object> {
    final /* synthetic */ KClass $key$inlined;
    final /* synthetic */ ClassValueCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassValueCache$get$$inlined$getOrSet$1(ClassValueCache classValueCache, KClass kClass) {
        super(0);
        this.this$0 = classValueCache;
        this.$key$inlined = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new C12236lg((KSerializer) this.this$0.m26716a().invoke(this.$key$inlined));
    }
}
