package th.p047co.dtac.android.dtacone.presenter.inactive_user;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.history.OneHistoryListResponse;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerTransactionCollection;
import th.p047co.dtac.android.dtacone.presenter.inactive_user.OwnerDetailPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/history/OneHistoryListResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.inactive_user.OwnerDetailPresenter$getOneOwnerDetail$2 */
/* loaded from: classes8.dex */
public final class OwnerDetailPresenter$getOneOwnerDetail$2 extends Lambda implements Function1<OneHistoryListResponse, Unit> {
    final /* synthetic */ OwnerDetailPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerDetailPresenter$getOneOwnerDetail$2(OwnerDetailPresenter ownerDetailPresenter) {
        super(1);
        this.this$0 = ownerDetailPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneHistoryListResponse oneHistoryListResponse) {
        invoke2(oneHistoryListResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneHistoryListResponse oneHistoryListResponse) {
        OwnerDetailPresenter.View view;
        OwnerDetailPresenter.View view2;
        OwnerTransactionCollection data = oneHistoryListResponse.getData();
        if (data != null) {
            OwnerDetailPresenter ownerDetailPresenter = this.this$0;
            OwnerDetailPresenter.View view3 = null;
            if (data.getLastTransactions().size() > 0) {
                view2 = ownerDetailPresenter.f85886g;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view3 = view2;
                }
                view3.onOwnerDetailSuccess(data);
                return;
            }
            view = ownerDetailPresenter.f85886g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view;
            }
            view3.onShowEmptyView(data);
        }
    }
}