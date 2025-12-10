package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.bitmap.filter.GrayScaleFilter;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidUploadImagePresenter$uploadImageSubject$bitmapObs$2 */
/* loaded from: classes8.dex */
public final class PrepaidUploadImagePresenter$uploadImageSubject$bitmapObs$2 extends Lambda implements Function1<Bitmap, Bitmap> {
    final /* synthetic */ boolean $grayScale;
    final /* synthetic */ PrepaidUploadImagePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepaidUploadImagePresenter$uploadImageSubject$bitmapObs$2(boolean z, PrepaidUploadImagePresenter prepaidUploadImagePresenter) {
        super(1);
        this.$grayScale = z;
        this.this$0 = prepaidUploadImagePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bitmap invoke(Bitmap it) {
        GrayScaleFilter grayScaleFilter;
        if (this.$grayScale) {
            grayScaleFilter = this.this$0.f86229e;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return grayScaleFilter.apply(it);
        }
        return it;
    }
}