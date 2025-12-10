package com.chuckerteam.chucker.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.api.RetentionManager", m29092f = "RetentionManager.kt", m29091i = {0, 0, 1, 1, 1}, m29090l = {113, EACTags.CARD_SEQUENCE_NUMBER}, m29089m = "doMaintenance$com_github_ChuckerTeam_Chucker_library", m29088n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "now"}, m29087s = {"L$0", "L$1", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
public final class RetentionManager$doMaintenance$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetentionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetentionManager$doMaintenance$1(RetentionManager retentionManager, Continuation<? super RetentionManager$doMaintenance$1> continuation) {
        super(continuation);
        this.this$0 = retentionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doMaintenance$com_github_ChuckerTeam_Chucker_library(this);
    }
}