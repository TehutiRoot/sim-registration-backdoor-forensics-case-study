package io.fotoapparat.routine.zoom;

import io.fotoapparat.hardware.Device;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.fotoapparat.routine.zoom.UpdateZoomLevelRoutineKt$updateZoomLevel$1", m29092f = "UpdateZoomLevelRoutine.kt", m29091i = {1}, m29090l = {18, 20}, m29089m = "invokeSuspend", m29088n = {"cameraDevice"}, m29087s = {"L$0"})
/* loaded from: classes5.dex */
public final class UpdateZoomLevelRoutineKt$updateZoomLevel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Device $this_updateZoomLevel;
    final /* synthetic */ float $zoomLevel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateZoomLevelRoutineKt$updateZoomLevel$1(float f, Device device2, Continuation<? super UpdateZoomLevelRoutineKt$updateZoomLevel$1> continuation) {
        super(2, continuation);
        this.$zoomLevel = f;
        this.$this_updateZoomLevel = device2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpdateZoomLevelRoutineKt$updateZoomLevel$1(this.$zoomLevel, this.$this_updateZoomLevel, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r4.L$0
            io.fotoapparat.hardware.CameraDevice r0 = (io.fotoapparat.hardware.CameraDevice) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L44
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L35
        L22:
            kotlin.ResultKt.throwOnFailure(r5)
            float r5 = r4.$zoomLevel
            io.fotoapparat.routine.zoom.UpdateZoomLevelRoutineKt.access$ensureInBounds(r5)
            io.fotoapparat.hardware.Device r5 = r4.$this_updateZoomLevel
            r4.label = r3
            java.lang.Object r5 = r5.awaitSelectedCamera(r4)
            if (r5 != r0) goto L35
            return r0
        L35:
            io.fotoapparat.hardware.CameraDevice r5 = (io.fotoapparat.hardware.CameraDevice) r5
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r5.getCapabilities(r4)
            if (r1 != r0) goto L42
            return r0
        L42:
            r0 = r5
            r5 = r1
        L44:
            io.fotoapparat.capability.Capabilities r5 = (io.fotoapparat.capability.Capabilities) r5
            io.fotoapparat.parameter.Zoom r5 = r5.getZoom()
            boolean r5 = r5 instanceof io.fotoapparat.parameter.Zoom.VariableZoom
            if (r5 == 0) goto L53
            float r5 = r4.$zoomLevel
            r0.setZoom(r5)
        L53:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fotoapparat.routine.zoom.UpdateZoomLevelRoutineKt$updateZoomLevel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpdateZoomLevelRoutineKt$updateZoomLevel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}