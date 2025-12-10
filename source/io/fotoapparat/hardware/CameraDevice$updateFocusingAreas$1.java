package io.fotoapparat.hardware;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.fotoapparat.hardware.CameraDevice", m28800f = "CameraDevice.kt", m28799i = {0, 0}, m28798l = {353}, m28797m = "updateFocusingAreas", m28796n = {"focusingAreas", "$this$updateFocusingAreas_u24lambda_u245"}, m28795s = {"L$0", "L$2"})
/* loaded from: classes5.dex */
public final class CameraDevice$updateFocusingAreas$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDevice$updateFocusingAreas$1(CameraDevice cameraDevice, Continuation<? super CameraDevice$updateFocusingAreas$1> continuation) {
        super(continuation);
        this.this$0 = cameraDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m30545l;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m30545l = this.this$0.m30545l(null, null, this);
        return m30545l;
    }
}
