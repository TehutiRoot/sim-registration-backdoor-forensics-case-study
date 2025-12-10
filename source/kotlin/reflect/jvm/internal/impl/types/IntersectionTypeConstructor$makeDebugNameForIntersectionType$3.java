package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$3 extends Lambda implements Function1<KotlinType, CharSequence> {
    final /* synthetic */ Function1<KotlinType, Object> $getProperTypeRelatedToStringify;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(Function1<? super KotlinType, ? extends Object> function1) {
        super(1);
        this.$getProperTypeRelatedToStringify = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(KotlinType it) {
        Function1<KotlinType, Object> function1 = this.$getProperTypeRelatedToStringify;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return function1.invoke(it).toString();
    }
}
