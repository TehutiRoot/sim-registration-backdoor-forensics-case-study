package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* renamed from: a */
    public final TypeEnhancementInfo f69228a;

    /* renamed from: b */
    public final List f69229b;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, 3, null);
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.f69229b;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.f69228a;
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> parametersInfo) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f69228a = typeEnhancementInfo;
        this.f69229b = parametersInfo;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeEnhancementInfo, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
