package com.chuckerteam.chucker.internal.support;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.support.HarUtils", m29092f = "HarUtils.kt", m29091i = {}, m29090l = {16}, m29089m = "harStringFromTransactions", m29088n = {}, m29087s = {})
/* loaded from: classes3.dex */
public final class HarUtils$harStringFromTransactions$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HarUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarUtils$harStringFromTransactions$1(HarUtils harUtils, Continuation<? super HarUtils$harStringFromTransactions$1> continuation) {
        super(continuation);
        this.this$0 = harUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.harStringFromTransactions(null, null, null, this);
    }
}