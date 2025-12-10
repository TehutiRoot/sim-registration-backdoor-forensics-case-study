package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 */
/* loaded from: classes6.dex */
public final class C11960x131ab843 extends Lambda implements Function1<ProtoBuf.Type, Integer> {
    public static final C11960x131ab843 INSTANCE = new C11960x131ab843();

    public C11960x131ab843() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getArgumentCount());
    }
}
