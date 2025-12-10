package th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.Fotoapparat;
import io.fotoapparat.preview.Frame;
import io.fotoapparat.result.BitmapPhoto;
import io.fotoapparat.result.transformer.ResolutionTransformersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FotoapparatWrapper;", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraHandler;", "Lio/fotoapparat/Fotoapparat;", "fotoapparat", "Lkotlin/Function1;", "Lio/fotoapparat/preview/Frame;", "", "frameProcess", "<init>", "(Lio/fotoapparat/Fotoapparat;Lkotlin/jvm/functions/Function1;)V", "start", "()V", "stop", "Lio/fotoapparat/result/BitmapPhoto;", "handle", "takePicture", "(Lkotlin/jvm/functions/Function1;)V", TypedValues.AttributesType.S_FRAME, "interceptionFrameProcess", "(Lio/fotoapparat/preview/Frame;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/Fotoapparat;", "getFotoapparat", "()Lio/fotoapparat/Fotoapparat;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getFrameProcess", "()Lkotlin/jvm/functions/Function1;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.camera.FotoapparatWrapper */
/* loaded from: classes9.dex */
public class FotoapparatWrapper implements CameraHandler {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Fotoapparat f104939a;

    /* renamed from: b */
    public final Function1 f104940b;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/preview/Frame;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.camera.FotoapparatWrapper$1 */
    /* loaded from: classes9.dex */
    public static final class C164631 extends Lambda implements Function1<Frame, Unit> {
        public static final C164631 INSTANCE = new C164631();

        public C164631() {
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

    public FotoapparatWrapper(@NotNull Fotoapparat fotoapparat, @NotNull Function1<? super Frame, Unit> frameProcess) {
        Intrinsics.checkNotNullParameter(fotoapparat, "fotoapparat");
        Intrinsics.checkNotNullParameter(frameProcess, "frameProcess");
        this.f104939a = fotoapparat;
        this.f104940b = frameProcess;
    }

    @NotNull
    public final Fotoapparat getFotoapparat() {
        return this.f104939a;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler
    @NotNull
    public Function1<Frame, Unit> getFrameProcess() {
        return this.f104940b;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler
    public void interceptionFrameProcess(@NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        getFrameProcess().invoke(frame);
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler
    public void start() {
        this.f104939a.start();
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler
    public void stop() {
        this.f104939a.stop();
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraHandler
    public void takePicture(@NotNull Function1<? super BitmapPhoto, Unit> handle) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f104939a.takePicture().toBitmap(ResolutionTransformersKt.scaled(0.25f)).whenAvailable(new FotoapparatWrapper$takePicture$1(handle));
    }

    public /* synthetic */ FotoapparatWrapper(Fotoapparat fotoapparat, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fotoapparat, (i & 2) != 0 ? C164631.INSTANCE : function1);
    }
}