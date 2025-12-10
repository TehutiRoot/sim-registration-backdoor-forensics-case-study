package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "T", "", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class SerializersModuleCollector$contextual$1 extends Lambda implements Function1<List<? extends KSerializer<?>>, KSerializer<?>> {
    final /* synthetic */ KSerializer<T> $serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializersModuleCollector$contextual$1(KSerializer<T> kSerializer) {
        super(1);
        this.$serializer = kSerializer;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$serializer;
    }
}
