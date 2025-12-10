package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$CustomerSection$5 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$CustomerSection$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ boolean $isSmartCard;
    final /* synthetic */ Function0<Unit> $onBirthdayClick;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$CustomerSection$5(CustomerInformation customerInformation, boolean z, Function1<? super CustomerInformation, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$customerInfo = customerInformation;
        this.$isSmartCard = z;
        this.$onCustomerInfoChange = function1;
        this.$onBirthdayClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputInfoScreenKt.m9514g(this.$customerInfo, this.$isSmartCard, this.$onCustomerInfoChange, this.$onBirthdayClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}