package th.p047co.dtac.android.dtacone.view.fragment.take_photo;

import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.selector.AspectRatioSelectorsKt;
import io.fotoapparat.selector.FlashSelectorsKt;
import io.fotoapparat.selector.FocusModeSelectorsKt;
import io.fotoapparat.selector.PreviewFpsRangeSelectorsKt;
import io.fotoapparat.selector.ResolutionSelectorsKt;
import io.fotoapparat.selector.SelectorsKt;
import io.fotoapparat.selector.SensorSensitivitySelectorsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lio/fotoapparat/configuration/CameraConfiguration;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.QRCameraFragmentBase$cameraConfiguration$2 */
/* loaded from: classes9.dex */
public final class QRCameraFragmentBase$cameraConfiguration$2 extends Lambda implements Function0<CameraConfiguration> {
    final /* synthetic */ QRCameraFragmentBase this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "", "Lkotlin/ranges/IntRange;", "invoke", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.QRCameraFragmentBase$cameraConfiguration$2$1 */
    /* loaded from: classes9.dex */
    public static final class C164471 extends Lambda implements Function1<IntRange, Integer> {
        public static final C164471 INSTANCE = new C164471();

        public C164471() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Integer invoke(@NotNull IntRange $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return 60;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCameraFragmentBase$cameraConfiguration$2(QRCameraFragmentBase qRCameraFragmentBase) {
        super(0);
        this.this$0 = qRCameraFragmentBase;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CameraConfiguration invoke() {
        Function1 m3536n;
        Function1 firstAvailable = SelectorsKt.firstAvailable(AspectRatioSelectorsKt.aspectRatio$default(1.0f, ResolutionSelectorsKt.highestResolution(), 0.0d, 4, null), AspectRatioSelectorsKt.standardRatio$default(ResolutionSelectorsKt.highestResolution(), 0.0d, 2, null), AspectRatioSelectorsKt.wideRatio$default(ResolutionSelectorsKt.highestResolution(), 0.0d, 2, null));
        Function1 firstAvailable2 = SelectorsKt.firstAvailable(PreviewFpsRangeSelectorsKt.lowestFixedFps(), PreviewFpsRangeSelectorsKt.lowestFps(), PreviewFpsRangeSelectorsKt.highestFps());
        Function1 firstAvailable3 = SelectorsKt.firstAvailable(AspectRatioSelectorsKt.aspectRatio$default(1.0f, ResolutionSelectorsKt.highestResolution(), 0.0d, 4, null), AspectRatioSelectorsKt.standardRatio$default(ResolutionSelectorsKt.highestResolution(), 0.0d, 2, null), AspectRatioSelectorsKt.wideRatio$default(ResolutionSelectorsKt.highestResolution(), 0.0d, 2, null));
        Function1<Iterable<? extends Flash>, Flash> off = FlashSelectorsKt.off();
        Function1 firstAvailable4 = SelectorsKt.firstAvailable(FocusModeSelectorsKt.continuousFocusPicture(), FocusModeSelectorsKt.autoFocus(), FocusModeSelectorsKt.fixed());
        Function1<Iterable<Integer>, Integer> lowestSensorSensitivity = SensorSensitivitySelectorsKt.lowestSensorSensitivity();
        m3536n = this.this$0.m3536n();
        return new CameraConfiguration(off, firstAvailable4, C164471.INSTANCE, null, m3536n, firstAvailable2, null, lowestSensorSensitivity, firstAvailable3, firstAvailable, 72, null);
    }
}