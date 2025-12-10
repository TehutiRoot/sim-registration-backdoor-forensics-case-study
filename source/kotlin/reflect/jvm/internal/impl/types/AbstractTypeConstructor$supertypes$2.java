package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class AbstractTypeConstructor$supertypes$2 extends Lambda implements Function1<Boolean, AbstractTypeConstructor.C11992a> {
    public static final AbstractTypeConstructor$supertypes$2 INSTANCE = new AbstractTypeConstructor$supertypes$2();

    public AbstractTypeConstructor$supertypes$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AbstractTypeConstructor.C11992a invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    @NotNull
    public final AbstractTypeConstructor.C11992a invoke(boolean z) {
        return new AbstractTypeConstructor.C11992a(AbstractC10108ds.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
    }
}
