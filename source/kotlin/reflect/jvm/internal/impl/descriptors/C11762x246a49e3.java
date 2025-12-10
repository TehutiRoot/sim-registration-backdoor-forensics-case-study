package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2 */
/* loaded from: classes6.dex */
public final class C11762x246a49e3 extends Lambda implements Function1<DeclarationDescriptor, Boolean> {
    public static final C11762x246a49e3 INSTANCE = new C11762x246a49e3();

    public C11762x246a49e3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DeclarationDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!(it instanceof ConstructorDescriptor));
    }
}
