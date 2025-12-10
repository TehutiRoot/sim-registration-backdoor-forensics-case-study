package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"RF1", "kotlinx/serialization/SerializersKt__SerializersKt"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class SerializersKt {
    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull String str) {
        return SerializersKt__SerializersKt.m26735c(str);
    }

    @Nullable
    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(@NotNull KClass<Object> kClass, @NotNull List<? extends KSerializer<Object>> list, @NotNull Function0<? extends KClassifier> function0) {
        return SerializersKt__SerializersKt.m26731g(kClass, list, function0);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (KSerializer<T>) serializer((KType) null);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull Type type) {
        return RF1.m66480h(type);
    }

    @Nullable
    public static final List<KSerializer<Object>> serializersForParameters(@NotNull SerializersModule serializersModule, @NotNull List<? extends KType> list, boolean z) {
        return SerializersKt__SerializersKt.m26720r(serializersModule, list, z);
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule serializersModule, @NotNull KClass<?> kClass) {
        return SerializersKt__SerializersKt.m26734d(serializersModule, kClass);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull Type type) {
        return RF1.m66484d(type);
    }

    @InternalSerializationApi
    @Nullable
    public static final <T> KSerializer<T> serializerOrNull(@NotNull KClass<T> kClass) {
        return SerializersKt__SerializersKt.m26723o(kClass);
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule serializersModule, @NotNull KClass<?> kClass, @NotNull KSerializer<?>[] kSerializerArr) {
        return SerializersKt__SerializersKt.m26733e(serializersModule, kClass, kSerializerArr);
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> KSerializer<T> serializer(@NotNull KClass<T> kClass) {
        return SerializersKt__SerializersKt.m26730h(kClass);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull KType kType) {
        return SerializersKt__SerializersKt.m26722p(kType);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> list, boolean z) {
        return SerializersKt__SerializersKt.m26729i(kClass, list, z);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule serializersModule, @NotNull Type type) {
        return RF1.m66479i(serializersModule, type);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KType kType) {
        return SerializersKt__SerializersKt.m26728j(kType);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule serializersModule, @NotNull KType kType) {
        return SerializersKt__SerializersKt.m26721q(serializersModule, kType);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (KSerializer<T>) serializer(serializersModule, (KType) null);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule serializersModule, @NotNull Type type) {
        return RF1.m66483e(serializersModule, type);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule serializersModule, @NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> list, boolean z) {
        return SerializersKt__SerializersKt.m26727k(serializersModule, kClass, list, z);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule serializersModule, @NotNull KType kType) {
        return SerializersKt__SerializersKt.m26726l(serializersModule, kType);
    }
}
