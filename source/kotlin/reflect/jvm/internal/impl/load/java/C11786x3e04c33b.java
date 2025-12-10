package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1 */
/* loaded from: classes6.dex */
public final class C11786x3e04c33b extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final C11786x3e04c33b INSTANCE = new C11786x3e04c33b();

    public C11786x3e04c33b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
        boolean m28428a;
        Intrinsics.checkNotNullParameter(it, "it");
        m28428a = BuiltinMethodsWithSpecialGenericSignature.INSTANCE.m28428a(it);
        return Boolean.valueOf(m28428a);
    }
}
