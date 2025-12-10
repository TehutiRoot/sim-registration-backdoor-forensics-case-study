package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "", "it", "Lkotlin/reflect/KClass;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,75:1\n79#2:76\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1\n*L\n27#1:76\n*E\n"})
/* loaded from: classes6.dex */
public final class SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 extends Lambda implements Function1<KClass<?>, KSerializer<Object>> {
    public static final SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 INSTANCE = new SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1();

    public SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final KSerializer<Object> invoke(@NotNull KClass<?> it) {
        KSerializer<Object> nullable;
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(it);
        if (serializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(serializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }
}
