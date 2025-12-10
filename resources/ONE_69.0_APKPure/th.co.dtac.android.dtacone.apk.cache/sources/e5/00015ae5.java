package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import android.graphics.Bitmap;
import io.fotoapparat.preview.Frame;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.FrameExtenKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "Lio/fotoapparat/preview/Frame;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$start$1$2 */
/* loaded from: classes9.dex */
public final class QRViewModel$start$1$2 extends Lambda implements Function1<Frame, Bitmap> {
    public static final QRViewModel$start$1$2 INSTANCE = new QRViewModel$start$1$2();

    public QRViewModel$start$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bitmap invoke(@NotNull Frame it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FrameExtenKt.toBitmap(it);
    }
}