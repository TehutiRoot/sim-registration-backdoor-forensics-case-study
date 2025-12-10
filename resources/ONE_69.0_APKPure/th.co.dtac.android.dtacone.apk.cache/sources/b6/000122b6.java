package th.p047co.dtac.android.dtacone.presenter.change_pro_happy;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.change_pro_happy.validateProfile.response.OneChangeProHappyValidateProfileResponse;
import th.p047co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_pro_happy/validateProfile/response/OneChangeProHappyValidateProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter$validateProfileChangeProHappy$2 */
/* loaded from: classes8.dex */
public final class ChangeProHappyPresenter$validateProfileChangeProHappy$2 extends Lambda implements Function1<OneChangeProHappyValidateProfileResponse, Unit> {
    final /* synthetic */ int $redirectFlow;
    final /* synthetic */ ChangeProHappyPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeProHappyPresenter$validateProfileChangeProHappy$2(ChangeProHappyPresenter changeProHappyPresenter, int i) {
        super(1);
        this.this$0 = changeProHappyPresenter;
        this.$redirectFlow = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeProHappyValidateProfileResponse oneChangeProHappyValidateProfileResponse) {
        invoke2(oneChangeProHappyValidateProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeProHappyValidateProfileResponse oneChangeProHappyValidateProfileResponse) {
        ChangeProHappyPresenter.View view;
        ChangeProHappyPresenter.View view2;
        ChangeProHappyPresenter.View view3 = null;
        if (Intrinsics.areEqual(oneChangeProHappyValidateProfileResponse.getCode(), "200")) {
            view2 = this.this$0.f85624e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            view3.callbackSubmitTrue(this.$redirectFlow);
            return;
        }
        view = this.this$0.f85624e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        view3.dismissLoading();
    }
}