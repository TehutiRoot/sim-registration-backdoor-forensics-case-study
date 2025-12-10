package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1 */
/* loaded from: classes6.dex */
public final class C11940xd7e650be extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {

    /* renamed from: $a */
    final /* synthetic */ CallableDescriptor f69865$a;

    /* renamed from: $b */
    final /* synthetic */ CallableDescriptor f69866$b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11940xd7e650be(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        super(2);
        this.f69865$a = callableDescriptor;
        this.f69866$b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
        return Boolean.valueOf(Intrinsics.areEqual(declarationDescriptor, this.f69865$a) && Intrinsics.areEqual(declarationDescriptor2, this.f69866$b));
    }
}
