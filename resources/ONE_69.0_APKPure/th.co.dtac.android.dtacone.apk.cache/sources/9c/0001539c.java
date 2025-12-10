package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$FlowOptionsSection$4 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$FlowOptionsSection$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $allowManualKYC;
    final /* synthetic */ boolean $allowManualKYC2ndLine;
    final /* synthetic */ int $maxAttempt;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYC2ndLineChange;
    final /* synthetic */ Function1<Boolean, Unit> $onAllowManualKYCChange;
    final /* synthetic */ Function1<Integer, Unit> $onMaxAttemptChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$FlowOptionsSection$4(boolean z, Function1<? super Boolean, Unit> function1, int i, int i2, Function1<? super Integer, Unit> function12, boolean z2, Function1<? super Boolean, Unit> function13) {
        super(2);
        this.$allowManualKYC = z;
        this.$onAllowManualKYCChange = function1;
        this.$$dirty = i;
        this.$maxAttempt = i2;
        this.$onMaxAttemptChange = function12;
        this.$allowManualKYC2ndLine = z2;
        this.$onAllowManualKYC2ndLineChange = function13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(372380293, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.FlowOptionsSection.<anonymous> (SelectOptionsScreen.kt:323)");
        }
        boolean z = this.$allowManualKYC;
        Function1<Boolean, Unit> function1 = this.$onAllowManualKYCChange;
        int i2 = this.$$dirty;
        SelectOptionsScreenKt.m3414b("Allow Manual KYC", z, function1, null, composer, ((i2 << 3) & 112) | 6 | ((i2 >> 3) & 896), 8);
        int i3 = this.$maxAttempt;
        Function1<Integer, Unit> function12 = this.$onMaxAttemptChange;
        int i4 = this.$$dirty;
        SelectOptionsScreenKt.m3412d("Max Attempt", i3, function12, 0, 0, composer, (i4 & 112) | 6 | ((i4 >> 6) & 896), 24);
        boolean z2 = this.$allowManualKYC2ndLine;
        Function1<Boolean, Unit> function13 = this.$onAllowManualKYC2ndLineChange;
        int i5 = this.$$dirty;
        SelectOptionsScreenKt.m3414b("Allow Manual KYC 2nd Line", z2, function13, null, composer, ((i5 >> 3) & 112) | 6 | ((i5 >> 9) & 896), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}