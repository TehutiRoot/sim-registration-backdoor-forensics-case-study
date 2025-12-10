package com.chuckerteam.chucker.internal.p010ui.transaction;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m29142d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "androidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n+ 2 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$onQueryTextChange$1\n*L\n1#1,206:1\n269#2,6:207\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1 */
/* loaded from: classes3.dex */
public final class C5973x4e372e56 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TransactionPayloadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5973x4e372e56(TransactionPayloadFragment transactionPayloadFragment) {
        super(0);
        this.this$0 = transactionPayloadFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList;
        arrayList = this.this$0.f43041i;
        if (!arrayList.isEmpty()) {
            this.this$0.m49848F(0);
        } else {
            this.this$0.f43042j = -1;
        }
        return Unit.INSTANCE;
    }
}