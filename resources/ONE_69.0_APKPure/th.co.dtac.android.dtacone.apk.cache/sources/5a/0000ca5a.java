package io.fotoapparat.hardware;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.fotoapparat.hardware.Device", m29092f = "Device.kt", m29091i = {}, m29090l = {148}, m29089m = "getCameraParameters$suspendImpl", m29088n = {}, m29087s = {})
/* loaded from: classes5.dex */
public final class Device$getCameraParameters$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Device this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Device$getCameraParameters$1(Device device2, Continuation<? super Device$getCameraParameters$1> continuation) {
        super(continuation);
        this.this$0 = device2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Device.m30876b(this.this$0, null, this);
    }
}