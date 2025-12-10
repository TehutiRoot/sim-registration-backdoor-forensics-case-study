package th.p047co.dtac.android.dtacone.presenter.change_pro_happy;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.change_pro_happy.packageList.response.Data;
import th.p047co.dtac.android.dtacone.model.change_pro_happy.packageList.response.OneChangeProHappyResponse;
import th.p047co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/change_pro_happy/packageList/response/OneChangeProHappyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nChangeProHappyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeProHappyPresenter.kt\nth/co/dtac/android/dtacone/presenter/change_pro_happy/ChangeProHappyPresenter$getChangeProHappyPackage$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n1#2:235\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.change_pro_happy.ChangeProHappyPresenter$getChangeProHappyPackage$2 */
/* loaded from: classes8.dex */
public final class ChangeProHappyPresenter$getChangeProHappyPackage$2 extends Lambda implements Function1<OneChangeProHappyResponse, Unit> {
    final /* synthetic */ ChangeProHappyPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeProHappyPresenter$getChangeProHappyPackage$2(ChangeProHappyPresenter changeProHappyPresenter) {
        super(1);
        this.this$0 = changeProHappyPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneChangeProHappyResponse oneChangeProHappyResponse) {
        invoke2(oneChangeProHappyResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneChangeProHappyResponse oneChangeProHappyResponse) {
        ChangeProHappyPresenter.View view;
        if (oneChangeProHappyResponse != null) {
            Data data = oneChangeProHappyResponse.getData();
            if (data != null) {
                view = this.this$0.f85624e;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view = null;
                }
                view.getChangeProHappyPackSuccess(data.getPackages(), data.getJsonMemberDefault());
                return;
            }
            return;
        }
        this.this$0.getErrorService().handleException((Throwable) oneChangeProHappyResponse, new OneErrorService.ExceptionHandler[0]);
    }
}