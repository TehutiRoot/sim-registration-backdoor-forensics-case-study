package th.p047co.dtac.android.dtacone.presenter.change_pro_happy;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.change_pro_happy.submit.response.p049D.Data;
import th.p047co.dtac.android.dtacone.model.change_pro_happy.submit.response.p049D.OneSubmitChangeProHappyDResponse;
import th.p047co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter;
import th.p047co.dtac.android.dtacone.util.constant.Status;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_pro_happy/submit/response/D/OneSubmitChangeProHappyDResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter$submitChangeProHappyPack$2 */
/* loaded from: classes8.dex */
public final class ChangeProHappyPresenter$submitChangeProHappyPack$2 extends Lambda implements Function1<OneSubmitChangeProHappyDResponse, Unit> {
    final /* synthetic */ Integer $redirectFlow;
    final /* synthetic */ ChangeProHappyPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeProHappyPresenter$submitChangeProHappyPack$2(Integer num, ChangeProHappyPresenter changeProHappyPresenter) {
        super(1);
        this.$redirectFlow = num;
        this.this$0 = changeProHappyPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneSubmitChangeProHappyDResponse oneSubmitChangeProHappyDResponse) {
        invoke2(oneSubmitChangeProHappyDResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneSubmitChangeProHappyDResponse oneSubmitChangeProHappyDResponse) {
        ChangeProHappyPresenter.View view;
        ChangeProHappyPresenter.View view2;
        ChangeProHappyPresenter.View view3;
        Data data = oneSubmitChangeProHappyDResponse.getData();
        ChangeProHappyPresenter.View view4 = null;
        if (Intrinsics.areEqual(data != null ? data.getStatus() : null, Status.getSUCCESS())) {
            Integer num = this.$redirectFlow;
            if (num != null && num.intValue() == 0) {
                view3 = this.this$0.f85624e;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view3;
                }
                view4.onSubmitSuccessNoRedirect();
                return;
            } else if (num != null && num.intValue() == 1) {
                view2 = this.this$0.f85624e;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view2;
                }
                view4.onSubmitSuccessRedirectToTopup();
                return;
            } else if (num != null && num.intValue() == 2) {
                view = this.this$0.f85624e;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view;
                }
                view4.onSubmitSuccessRedirectToProserm();
                return;
            } else {
                this.this$0.getErrorService().handleException(new Throwable(), new OneErrorService.ExceptionHandler[0]);
                return;
            }
        }
        this.this$0.getErrorService().handleException(new Throwable(), new OneErrorService.ExceptionHandler[0]);
    }
}