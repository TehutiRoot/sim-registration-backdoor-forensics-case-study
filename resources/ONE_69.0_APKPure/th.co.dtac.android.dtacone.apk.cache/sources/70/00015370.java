package th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera;

import io.fotoapparat.preview.Frame;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/preview/Frame;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraFactory$set$1 */
/* loaded from: classes9.dex */
public final class CameraFactory$set$1 extends Lambda implements Function1<Frame, Unit> {
    public static final CameraFactory$set$1 INSTANCE = new CameraFactory$set$1();

    public CameraFactory$set$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Frame it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Frame frame) {
        invoke2(frame);
        return Unit.INSTANCE;
    }
}