package th.p047co.dtac.android.dtacone.presenter.changeMainPack;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.changeMainPack.packageList.response.GetMainPackageResponse;
import th.p047co.dtac.android.dtacone.model.changeMainPack.packageList.response.MainPackage;
import th.p047co.dtac.android.dtacone.presenter.changeMainPack.ChangeMainPackPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/GetMainPackageResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.changeMainPack.ChangeMainPackPresenter$getMainPack$2 */
/* loaded from: classes8.dex */
public final class ChangeMainPackPresenter$getMainPack$2 extends Lambda implements Function1<GetMainPackageResponse, Unit> {
    final /* synthetic */ ChangeMainPackPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeMainPackPresenter$getMainPack$2(ChangeMainPackPresenter changeMainPackPresenter) {
        super(1);
        this.this$0 = changeMainPackPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetMainPackageResponse getMainPackageResponse) {
        invoke2(getMainPackageResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetMainPackageResponse getMainPackageResponse) {
        ChangeMainPackPresenter.View view;
        ChangeMainPackPresenter.View view2;
        ChangeMainPackPresenter.View view3;
        ChangeMainPackPresenter.View view4;
        ChangeMainPackPresenter.View view5 = null;
        if (getMainPackageResponse.getDefaultPackage() != null) {
            view4 = this.this$0.f85605d;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view4 = null;
            }
            view4.onSetPackageDefault(getMainPackageResponse.getDefaultPackage());
        } else {
            List<MainPackage> packages = getMainPackageResponse.getPackages();
            if (packages != null && !packages.isEmpty()) {
                view = this.this$0.f85605d;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view = null;
                }
                view.onSetPackageDefault(getMainPackageResponse.getPackages().get(0));
            }
        }
        List<MainPackage> packages2 = getMainPackageResponse.getPackages();
        if (packages2 == null || packages2.isEmpty()) {
            view2 = this.this$0.f85605d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view5 = view2;
            }
            view5.onGetEmptyMainPack();
            return;
        }
        view3 = this.this$0.f85605d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view5 = view3;
        }
        view5.onSetMainPackageListDialog(getMainPackageResponse.getPackages());
    }
}