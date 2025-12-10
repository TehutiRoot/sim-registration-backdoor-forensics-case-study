package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 */
/* loaded from: classes6.dex */
public final class C11787xdb572182 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final C11787xdb572182 INSTANCE = new C11787xdb572182();

    public C11787xdb572182() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
        boolean z;
        boolean m28428a;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof FunctionDescriptor) {
            m28428a = BuiltinMethodsWithSpecialGenericSignature.INSTANCE.m28428a(it);
            if (m28428a) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
