package io.fotoapparat.routine.camera;

import io.fotoapparat.concurrent.CameraExecutor;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.metering.FocalRequest;
import io.fotoapparat.result.FocusResult;
import io.fotoapparat.routine.focus.FocusOnPointRoutineKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "focalRequest", "Lio/fotoapparat/hardware/metering/FocalRequest;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class StartRoutineKt$start$2 extends Lambda implements Function1<FocalRequest, Unit> {
    final /* synthetic */ Device $this_start;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lio/fotoapparat/result/FocusResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: io.fotoapparat.routine.camera.StartRoutineKt$start$2$1 */
    /* loaded from: classes5.dex */
    public static final class C104841 extends Lambda implements Function0<FocusResult> {
        final /* synthetic */ FocalRequest $focalRequest;
        final /* synthetic */ Device $this_start;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104841(Device device2, FocalRequest focalRequest) {
            super(0);
            this.$this_start = device2;
            this.$focalRequest = focalRequest;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final FocusResult invoke() {
            return FocusOnPointRoutineKt.focusOnPoint(this.$this_start, this.$focalRequest);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartRoutineKt$start$2(Device device2) {
        super(1);
        this.$this_start = device2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocalRequest focalRequest) {
        invoke2(focalRequest);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FocalRequest focalRequest) {
        Intrinsics.checkNotNullParameter(focalRequest, "focalRequest");
        this.$this_start.getExecutor$fotoapparat_release().execute(new CameraExecutor.Operation(true, new C104841(this.$this_start, focalRequest)));
    }
}