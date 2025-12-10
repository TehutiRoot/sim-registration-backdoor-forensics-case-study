package com.chuckerteam.chucker.internal.p010ui;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Sharable;
import java.util.List;
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
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1", m29092f = "MainActivity.kt", m29091i = {}, m29090l = {206, 212, 213}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1 */
/* loaded from: classes3.dex */
public final class MainActivity$exportTransactions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ Function2<List<HttpTransaction>, Continuation<? super Sharable>, Object> $block;
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity$exportTransactions$1(MainActivity mainActivity, Context context, Function2<? super List<HttpTransaction>, ? super Continuation<? super Sharable>, ? extends Object> function2, String str, Continuation<? super MainActivity$exportTransactions$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
        this.$applicationContext = context;
        this.$block = function2;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainActivity$exportTransactions$1(this.this$0, this.$applicationContext, this.$block, this.$fileName, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 != r3) goto L17
            kotlin.ResultKt.throwOnFailure(r10)
            goto L79
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L61
        L23:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L39
        L27:
            kotlin.ResultKt.throwOnFailure(r10)
            com.chuckerteam.chucker.internal.ui.MainActivity r10 = r9.this$0
            com.chuckerteam.chucker.internal.ui.MainViewModel r10 = com.chuckerteam.chucker.internal.p010ui.MainActivity.access$getViewModel(r10)
            r9.label = r4
            java.lang.Object r10 = r10.getAllTransactions(r9)
            if (r10 != r0) goto L39
            return r0
        L39:
            java.util.List r10 = (java.util.List) r10
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L56
            com.chuckerteam.chucker.internal.ui.MainActivity r10 = r9.this$0
            android.content.Context r0 = r9.$applicationContext
            int r1 = com.chuckerteam.chucker.R.string.chucker_export_empty_text
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "applicationContext.getSt…hucker_export_empty_text)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity.showToast$default(r10, r0, r2, r6, r5)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L56:
            kotlin.jvm.functions.Function2<java.util.List<com.chuckerteam.chucker.internal.data.entity.HttpTransaction>, kotlin.coroutines.Continuation<? super com.chuckerteam.chucker.internal.support.Sharable>, java.lang.Object> r1 = r9.$block
            r9.label = r6
            java.lang.Object r10 = r1.invoke(r10, r9)
            if (r10 != r0) goto L61
            return r0
        L61:
            com.chuckerteam.chucker.internal.support.Sharable r10 = (com.chuckerteam.chucker.internal.support.Sharable) r10
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1$shareIntent$1 r4 = new com.chuckerteam.chucker.internal.ui.MainActivity$exportTransactions$1$shareIntent$1
            com.chuckerteam.chucker.internal.ui.MainActivity r7 = r9.this$0
            java.lang.String r8 = r9.$fileName
            r4.<init>(r10, r7, r8, r5)
            r9.label = r3
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r9)
            if (r10 != r0) goto L79
            return r0
        L79:
            android.content.Intent r10 = (android.content.Intent) r10
            if (r10 == 0) goto L83
            com.chuckerteam.chucker.internal.ui.MainActivity r0 = r9.this$0
            r0.startActivity(r10)
            goto L95
        L83:
            com.chuckerteam.chucker.internal.ui.MainActivity r10 = r9.this$0
            android.content.Context r0 = r9.$applicationContext
            int r1 = com.chuckerteam.chucker.R.string.chucker_export_no_file
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "applicationContext.getSt…g.chucker_export_no_file)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.chuckerteam.chucker.internal.p010ui.BaseChuckerActivity.showToast$default(r10, r0, r2, r6, r5)
        L95:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.p010ui.MainActivity$exportTransactions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MainActivity$exportTransactions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}