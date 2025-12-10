package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$3 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$3 extends Lambda implements Function1<Integer, Integer> {
    public static final TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$3 INSTANCE = new TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$3();

    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$2$3() {
        super(1);
    }

    @NotNull
    public final Integer invoke(int i) {
        return Integer.valueOf(-i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}