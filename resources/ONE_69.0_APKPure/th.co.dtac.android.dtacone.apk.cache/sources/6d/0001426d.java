package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpOffer;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineFixedLinePlusPackageState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpPackageScreenKt$OneRegisterTrueOnlineFlpPackageScreen$2 */
/* loaded from: classes10.dex */
public final class C15395x98350097 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ OneRegisterTrueOnlineFixedLinePlusPackageState $flpCampaignState;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isMultiHomePhoneNumber;
    final /* synthetic */ FlpOffer $marketingInfo;
    final /* synthetic */ Function1<String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15395x98350097(int i, OneRegisterTrueOnlineFixedLinePlusPackageState oneRegisterTrueOnlineFixedLinePlusPackageState, FlpOffer flpOffer, boolean z, Function1<? super String, Unit> function1, int i2, int i3) {
        super(2);
        this.$index = i;
        this.$flpCampaignState = oneRegisterTrueOnlineFixedLinePlusPackageState;
        this.$marketingInfo = flpOffer;
        this.$isMultiHomePhoneNumber = z;
        this.$onSelect = function1;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRegisterTrueOnlineFlpPackageScreenKt.OneRegisterTrueOnlineFlpPackageScreen(this.$index, this.$flpCampaignState, this.$marketingInfo, this.$isMultiHomePhoneNumber, this.$onSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}