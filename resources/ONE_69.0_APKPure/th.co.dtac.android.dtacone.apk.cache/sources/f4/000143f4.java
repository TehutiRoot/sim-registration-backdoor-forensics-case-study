package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.paymentSummary.PaymentSummaryScreenKt$DeviceRow$2 */
/* loaded from: classes10.dex */
public final class PaymentSummaryScreenKt$DeviceRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $amount;
    final /* synthetic */ String $subTitle;
    final /* synthetic */ String $title;
    final /* synthetic */ boolean $useUnderLine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSummaryScreenKt$DeviceRow$2(String str, String str2, String str3, boolean z, int i, int i2) {
        super(2);
        this.$title = str;
        this.$subTitle = str2;
        this.$amount = str3;
        this.$useUnderLine = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        PaymentSummaryScreenKt.DeviceRow(this.$title, this.$subTitle, this.$amount, this.$useUnderLine, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}