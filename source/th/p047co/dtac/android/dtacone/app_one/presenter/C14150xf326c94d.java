package th.p047co.dtac.android.dtacone.app_one.presenter;

import android.graphics.Bitmap;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter$saveOneImageWatermarkVertical$1 */
/* loaded from: classes7.dex */
public final class C14150xf326c94d extends Lambda implements Function1<Bitmap, Unit> {
    final /* synthetic */ OneSaveBitmapWithWaterMarkPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14150xf326c94d(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter) {
        super(1);
        this.this$0 = oneSaveBitmapWithWaterMarkPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap it) {
        OneSaveBitmapWithWaterMarkPresenter.View view;
        view = this.this$0.f82337d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view.onSaveBitmapSuccess(it);
    }
}
