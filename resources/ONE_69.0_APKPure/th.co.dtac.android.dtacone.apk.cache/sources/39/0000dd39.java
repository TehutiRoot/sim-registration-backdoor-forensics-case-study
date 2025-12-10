package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2 */
/* loaded from: classes6.dex */
public final class C11733x24bfe127 extends Lambda implements Function1<ClassId, Integer> {
    public static final C11733x24bfe127 INSTANCE = new C11733x24bfe127();

    public C11733x24bfe127() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull ClassId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }
}