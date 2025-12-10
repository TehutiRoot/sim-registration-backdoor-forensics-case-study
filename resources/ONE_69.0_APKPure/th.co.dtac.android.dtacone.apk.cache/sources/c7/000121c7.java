package th.p047co.dtac.android.dtacone.presenter.bitmap;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter$saveBitmapFromSmartCard$7 */
/* loaded from: classes8.dex */
public final class SaveBitmapPresenter$saveBitmapFromSmartCard$7 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ SaveBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveBitmapPresenter$saveBitmapFromSmartCard$7(SaveBitmapPresenter saveBitmapPresenter) {
        super(1);
        this.this$0 = saveBitmapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        SaveBitmapPresenter.View view;
        view = this.this$0.f85318d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onSaveBitmapSuccess();
    }
}