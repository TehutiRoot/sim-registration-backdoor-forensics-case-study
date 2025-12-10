package th.p047co.dtac.android.dtacone.app_one.presenter;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter$saveBarcode$2 */
/* loaded from: classes7.dex */
public final class OnePrepaidScanBarcodePresenter$saveBarcode$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ String $barcode;
    final /* synthetic */ OnePrepaidScanBarcodePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidScanBarcodePresenter$saveBarcode$2(OnePrepaidScanBarcodePresenter onePrepaidScanBarcodePresenter, String str) {
        super(1);
        this.this$0 = onePrepaidScanBarcodePresenter;
        this.$barcode = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        OnePrepaidScanBarcodePresenter.View view;
        OnePrepaidScanBarcodePresenter.View view2;
        view = this.this$0.f82419f;
        OnePrepaidScanBarcodePresenter.View view3 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
        view2 = this.this$0.f82419f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view2;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.onSaveBarcodeSuccess(it, this.$barcode);
    }
}