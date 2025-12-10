package com.chuckerteam.chucker.internal.support;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.support.SharableKt", m29092f = "Sharable.kt", m29091i = {0, 0, 0}, m29090l = {30}, m29089m = "shareAsUtf8Text", m29088n = {"activity", "intentTitle", "intentSubject"}, m29087s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class SharableKt$shareAsUtf8Text$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public SharableKt$shareAsUtf8Text$1(Continuation<? super SharableKt$shareAsUtf8Text$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SharableKt.shareAsUtf8Text(null, null, null, null, this);
    }
}