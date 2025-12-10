package th.p047co.dtac.android.dtacone.presenter.prepaid;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.model.prepaid.NationWideCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.presenter.prepaid.PrepaidScanBarcodePresenter;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidActivateSimType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidScanBarcodePresenter$getNationWide$3 */
/* loaded from: classes8.dex */
public final class PrepaidScanBarcodePresenter$getNationWide$3 extends Lambda implements Function1<PrepaidConfig, Unit> {
    final /* synthetic */ PrepaidScanBarcodePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepaidScanBarcodePresenter$getNationWide$3(PrepaidScanBarcodePresenter prepaidScanBarcodePresenter) {
        super(1);
        this.this$0 = prepaidScanBarcodePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PrepaidConfig prepaidConfig) {
        invoke2(prepaidConfig);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PrepaidConfig it) {
        CardReaderService cardReaderService;
        PrepaidScanBarcodePresenter.View view;
        PrepaidScanBarcodePresenter.View view2;
        PrepaidScanBarcodePresenter.View view3;
        PrepaidScanBarcodePresenter.View view4;
        PrepaidScanBarcodePresenter.View view5;
        NationWideCollection nationWide = it.getNationWide();
        PrepaidScanBarcodePresenter.View view6 = null;
        if ((nationWide != null ? nationWide.getAutoAssignNumberMessage() : null) != null) {
            view5 = this.this$0.f86198f;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view5 = null;
            }
            view5.notifyWarningAutoAssign(it.getNationWide().getAutoAssignNumberMessage());
        }
        NationWideCollection nationWide2 = it.getNationWide();
        if (Intrinsics.areEqual(nationWide2 != null ? nationWide2.getSimType() : null, PrepaidActivateSimType.PULL_MODE)) {
            view4 = this.this$0.f86198f;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view4 = null;
            }
            Intrinsics.checkNotNullExpressionValue(it, "it");
            view4.goToNumberSelection(it);
        } else {
            cardReaderService = this.this$0.f86197e;
            boolean isConnected = cardReaderService.isConnected();
            if (isConnected) {
                view2 = this.this$0.f86198f;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view2 = null;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                view2.goToSmartCardMode(it);
            } else if (!isConnected) {
                view = this.this$0.f86198f;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view = null;
                }
                Intrinsics.checkNotNullExpressionValue(it, "it");
                view.goToCameraMode(it);
            }
        }
        view3 = this.this$0.f86198f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view6 = view3;
        }
        NationWideCollection nationWide3 = it.getNationWide();
        view6.onTrackMixpanel((nationWide3 == null || (r6 = nationWide3.getSimType()) == null) ? "" : "");
    }
}