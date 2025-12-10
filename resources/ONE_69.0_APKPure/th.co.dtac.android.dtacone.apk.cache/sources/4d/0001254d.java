package th.p047co.dtac.android.dtacone.presenter.simActivation;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.presenter.simActivation.SimActivationConfirmTransactionPresenter;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.simActivation.SimActivationConfirmTransactionPresenter$activate$2 */
/* loaded from: classes8.dex */
public final class SimActivationConfirmTransactionPresenter$activate$2 extends Lambda implements Function1<StatusResponse, Unit> {
    final /* synthetic */ String $clickFlow;
    final /* synthetic */ SimActivationConfirmTransactionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimActivationConfirmTransactionPresenter$activate$2(String str, SimActivationConfirmTransactionPresenter simActivationConfirmTransactionPresenter) {
        super(1);
        this.$clickFlow = str;
        this.this$0 = simActivationConfirmTransactionPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StatusResponse statusResponse) {
        invoke2(statusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StatusResponse statusResponse) {
        SimActivationConfirmTransactionPresenter.View view;
        SimActivationConfirmTransactionPresenter.View view2;
        SimActivationConfirmTransactionPresenter.View view3;
        SimActivationConfirmTransactionPresenter.View view4;
        String str = this.$clickFlow;
        int hashCode = str.hashCode();
        SimActivationConfirmTransactionPresenter.View view5 = null;
        if (hashCode != -1876882402) {
            if (hashCode != 74023715) {
                if (hashCode == 1966832676 && str.equals(PermissionConstant.M_CHNG_PRE_PACK)) {
                    view4 = this.this$0.f86509e;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    } else {
                        view5 = view4;
                    }
                    view5.gotoChangeMainPack();
                    return;
                }
            } else if (str.equals(PermissionConstant.M_STV)) {
                view3 = this.this$0.f86509e;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view5 = view3;
                }
                view5.gotoStv();
                return;
            }
        } else if (str.equals(PermissionConstant.M_TOP_UP)) {
            view = this.this$0.f86509e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view5 = view;
            }
            view5.gotoTopup();
            return;
        }
        view2 = this.this$0.f86509e;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view2 = null;
        }
        view2.onActivateFailed(null);
    }
}