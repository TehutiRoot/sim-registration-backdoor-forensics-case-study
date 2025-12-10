package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class DeserializedMemberScope$classifierNamesLazy$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Set<? extends Name> invoke() {
        DeserializedMemberScope.InterfaceC11968a interfaceC11968a;
        Set<Name> nonDeclaredClassifierNames = this.this$0.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        Set<Name> classNames$deserialization = this.this$0.getClassNames$deserialization();
        interfaceC11968a = this.this$0.f70126b;
        return EG1.plus(EG1.plus((Set) classNames$deserialization, (Iterable) interfaceC11968a.mo27633c()), (Iterable) nonDeclaredClassifierNames);
    }
}
