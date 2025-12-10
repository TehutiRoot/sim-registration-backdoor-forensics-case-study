package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$InvoiceInfoSection$2 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$InvoiceInfoSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CustomerInformation $customerInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewScreenKt$InvoiceInfoSection$2(CustomerInformation customerInformation, int i) {
        super(2);
        this.$customerInfo = customerInformation;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ReviewScreenKt.m9440i(this.$customerInfo, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}