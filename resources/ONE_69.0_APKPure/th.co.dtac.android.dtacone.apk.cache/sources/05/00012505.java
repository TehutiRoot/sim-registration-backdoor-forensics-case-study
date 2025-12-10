package th.p047co.dtac.android.dtacone.presenter.self_update;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.self_update.RtrProfileResponse;
import th.p047co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/self_update/RtrProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.self_update.RtrProfilePresenter$getRrtProfile$2 */
/* loaded from: classes8.dex */
public final class RtrProfilePresenter$getRrtProfile$2 extends Lambda implements Function1<RtrProfileResponse, Unit> {
    final /* synthetic */ int $requestId;
    final /* synthetic */ RtrProfilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtrProfilePresenter$getRrtProfile$2(int i, RtrProfilePresenter rtrProfilePresenter) {
        super(1);
        this.$requestId = i;
        this.this$0 = rtrProfilePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RtrProfileResponse rtrProfileResponse) {
        invoke2(rtrProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RtrProfileResponse it) {
        RtrProfilePresenter.View view;
        RtrProfilePresenter.View view2;
        RtrProfilePresenter.View view3;
        int i = this.$requestId;
        RtrProfilePresenter.View view4 = null;
        if (i == 0) {
            view = this.this$0.f86406d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view4.onRtrProfileResultForUpdateProfile(it);
        } else if (i != 1) {
            view3 = this.this$0.f86406d;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view3;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view4.onRtrProfileResult(it);
        } else {
            view2 = this.this$0.f86406d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view2;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view4.onRtrProfileResultForUpdateAddress(it);
        }
    }
}