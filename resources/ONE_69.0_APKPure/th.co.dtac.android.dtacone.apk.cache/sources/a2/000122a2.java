package th.p047co.dtac.android.dtacone.presenter.changeMainPack;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.presenter.changeMainPack.ChangeMainPackPresenter;
import th.p047co.dtac.android.dtacone.util.constant.Status;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.changeMainPack.ChangeMainPackPresenter$submitChangeMainPack$2 */
/* loaded from: classes8.dex */
public final class ChangeMainPackPresenter$submitChangeMainPack$2 extends Lambda implements Function1<StatusResponse, Unit> {
    final /* synthetic */ int $redirectFlow;
    final /* synthetic */ ChangeMainPackPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeMainPackPresenter$submitChangeMainPack$2(int i, ChangeMainPackPresenter changeMainPackPresenter) {
        super(1);
        this.$redirectFlow = i;
        this.this$0 = changeMainPackPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StatusResponse statusResponse) {
        invoke2(statusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(StatusResponse statusResponse) {
        ChangeMainPackPresenter.View view;
        ChangeMainPackPresenter.View view2;
        ChangeMainPackPresenter.View view3;
        if (Intrinsics.areEqual(statusResponse.getStatus(), Status.getSUCCESS())) {
            int i = this.$redirectFlow;
            ChangeMainPackPresenter.View view4 = null;
            if (i == 0) {
                view = this.this$0.f85605d;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view;
                }
                view4.onSubmitSuccessNoRedirect();
                return;
            } else if (i == 1) {
                view2 = this.this$0.f85605d;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view2;
                }
                view4.onSubmitSuccessRedirectToTopup();
                return;
            } else if (i != 2) {
                return;
            } else {
                view3 = this.this$0.f85605d;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view3;
                }
                view4.onSubmitSuccessRedirectToProserm();
                return;
            }
        }
        this.this$0.getErrorService().handleException(new Throwable(), new ServerErrorService.ExceptionHandler[0]);
    }
}