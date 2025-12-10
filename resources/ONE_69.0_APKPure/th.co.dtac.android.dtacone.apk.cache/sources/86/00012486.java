package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidImage;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidImage;", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidUploadImagePresenter$uploadImageSubject$bitmapObs$3 */
/* loaded from: classes8.dex */
public final class PrepaidUploadImagePresenter$uploadImageSubject$bitmapObs$3 extends Lambda implements Function1<Bitmap, PrepaidImage> {
    final /* synthetic */ PrepaidImage $prepaidImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepaidUploadImagePresenter$uploadImageSubject$bitmapObs$3(PrepaidImage prepaidImage) {
        super(1);
        this.$prepaidImage = prepaidImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PrepaidImage invoke(Bitmap it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return new PrepaidImage(BitmapExtKt.toBase64(it), this.$prepaidImage.getSubscriberNumber(), this.$prepaidImage.getSimCardNumber());
    }
}