package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class DeserializedMemberScope$classNames$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ Function0<Collection<Name>> $classNames;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeserializedMemberScope$classNames$2(Function0<? extends Collection<Name>> function0) {
        super(0);
        this.$classNames = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Set<? extends Name> invoke() {
        return CollectionsKt___CollectionsKt.toSet(this.$classNames.invoke());
    }
}