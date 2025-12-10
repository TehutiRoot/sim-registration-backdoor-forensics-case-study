package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$FlowOptionsSection$5 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$FlowOptionsSection$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allowManualKYC;
    final /* synthetic */ boolean $allowManualKYC2ndLine;
    final /* synthetic */ int $maxAttempt;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
    final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$FlowOptionsSection$5(boolean z, int i, boolean z2, Function1<? super Boolean, Unit> function1, Function1<? super Integer, Unit> function12, Function1<? super Boolean, Unit> function13, int i2, int i3) {
        super(2);
        this.$allowManualKYC = z;
        this.$maxAttempt = i;
        this.$allowManualKYC2ndLine = z2;
        this.$onAllowManualKYCChange = function1;
        this.$onMaxAttemptChange = function12;
        this.$onAllowManualKYC2ndLineChange = function13;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectOptionsScreenKt.m3415a(this.$allowManualKYC, this.$maxAttempt, this.$allowManualKYC2ndLine, this.$onAllowManualKYCChange, this.$onMaxAttemptChange, this.$onAllowManualKYC2ndLineChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}