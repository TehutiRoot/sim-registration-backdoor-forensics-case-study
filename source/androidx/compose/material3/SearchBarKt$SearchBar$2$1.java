package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SearchBarKt$SearchBar$2$1 extends Lambda implements Function1<WindowInsets, Unit> {
    final /* synthetic */ EG0 $unconsumedInsets;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$2$1(EG0 eg0, WindowInsets windowInsets) {
        super(1);
        this.$unconsumedInsets = eg0;
        this.$windowInsets = windowInsets;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets) {
        invoke2(windowInsets);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull WindowInsets consumedInsets) {
        Intrinsics.checkNotNullParameter(consumedInsets, "consumedInsets");
        this.$unconsumedInsets.m68514b(WindowInsetsKt.exclude(this.$windowInsets, consumedInsets));
    }
}
