package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClassifier;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1 extends Lambda implements Function0<KClassifier> {
    public static final SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1 INSTANCE = new SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1();

    public SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final KClassifier invoke() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }
}
