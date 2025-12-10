package th.p047co.dtac.android.dtacone.presenter.withDevice;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.CheckInputUssdResponse;
import th.p047co.dtac.android.dtacone.presenter.withDevice.WithDeviceInputUssdPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CheckInputUssdResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.withDevice.WithDeviceInputUssdPresenter$getDiscount$2 */
/* loaded from: classes8.dex */
public final class WithDeviceInputUssdPresenter$getDiscount$2 extends Lambda implements Function1<CheckInputUssdResponse, Unit> {
    final /* synthetic */ WithDeviceInputUssdPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithDeviceInputUssdPresenter$getDiscount$2(WithDeviceInputUssdPresenter withDeviceInputUssdPresenter) {
        super(1);
        this.this$0 = withDeviceInputUssdPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckInputUssdResponse checkInputUssdResponse) {
        invoke2(checkInputUssdResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CheckInputUssdResponse it) {
        WithDeviceInputUssdPresenter.View view;
        view = this.this$0.f86774d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onGetDiscountUssdSuccess(it);
    }
}