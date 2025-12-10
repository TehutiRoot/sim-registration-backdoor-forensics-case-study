package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidPreviewOptionalImagePresenter$loadImage$1 */
/* loaded from: classes8.dex */
public final class PrepaidPreviewOptionalImagePresenter$loadImage$1 extends Lambda implements Function1<Bitmap, byte[]> {
    public static final PrepaidPreviewOptionalImagePresenter$loadImage$1 INSTANCE = new PrepaidPreviewOptionalImagePresenter$loadImage$1();

    public PrepaidPreviewOptionalImagePresenter$loadImage$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final byte[] invoke(Bitmap it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return BitmapExtKt.toByteArray(it);
    }
}