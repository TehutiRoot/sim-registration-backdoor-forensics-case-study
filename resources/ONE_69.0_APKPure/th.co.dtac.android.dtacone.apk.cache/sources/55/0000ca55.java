package io.fotoapparat.hardware;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.fotoapparat.hardware.CameraDevice", m29092f = "CameraDevice.kt", m29091i = {0, 0}, m29090l = {255, 256}, m29089m = "setFocalPoint$suspendImpl", m29088n = {"$this", "focalRequest"}, m29087s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class CameraDevice$setFocalPoint$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDevice$setFocalPoint$1(CameraDevice cameraDevice, Continuation<? super CameraDevice$setFocalPoint$1> continuation) {
        super(continuation);
        this.this$0 = cameraDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CameraDevice.m30889h(this.this$0, null, this);
    }
}