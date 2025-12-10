package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SwipeToDismissKt$rememberDismissState$2$1 extends Lambda implements Function0<DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmValueChange;
    final /* synthetic */ DismissValue $initialValue;
    final /* synthetic */ Function2<Density, Float, Float> $positionalThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$rememberDismissState$2$1(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1, Function2<? super Density, ? super Float, Float> function2) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmValueChange = function1;
        this.$positionalThreshold = function2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DismissState invoke() {
        return new DismissState(this.$initialValue, this.$confirmValueChange, this.$positionalThreshold);
    }
}