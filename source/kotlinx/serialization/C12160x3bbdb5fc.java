package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* renamed from: kotlinx.serialization.SerializersKt__SerializersKt$serializerByKTypeImpl$contextualSerializer$1 */
/* loaded from: classes6.dex */
public final class C12160x3bbdb5fc extends Lambda implements Function0<KClassifier> {
    final /* synthetic */ List<KType> $typeArguments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12160x3bbdb5fc(List<? extends KType> list) {
        super(0);
        this.$typeArguments = list;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final KClassifier invoke() {
        return this.$typeArguments.get(0).getClassifier();
    }
}
