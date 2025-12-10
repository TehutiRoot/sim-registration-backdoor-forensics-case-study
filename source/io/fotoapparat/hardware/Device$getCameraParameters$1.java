package io.fotoapparat.hardware;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.fotoapparat.hardware.Device", m28800f = "Device.kt", m28799i = {}, m28798l = {148}, m28797m = "getCameraParameters$suspendImpl", m28796n = {}, m28795s = {})
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
        return Device.m30536b(this.this$0, null, this);
    }
}
