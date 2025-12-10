package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/material3/DismissState;", "it", "Landroidx/compose/material3/DismissValue;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DismissState$Companion$Saver$2 extends Lambda implements Function1<DismissValue, DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmValueChange;
    final /* synthetic */ Function2<Density, Float, Float> $positionalThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DismissState$Companion$Saver$2(Function1<? super DismissValue, Boolean> function1, Function2<? super Density, ? super Float, Float> function2) {
        super(1);
        this.$confirmValueChange = function1;
        this.$positionalThreshold = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final DismissState invoke(@NotNull DismissValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DismissState(it, this.$confirmValueChange, this.$positionalThreshold);
    }
}
