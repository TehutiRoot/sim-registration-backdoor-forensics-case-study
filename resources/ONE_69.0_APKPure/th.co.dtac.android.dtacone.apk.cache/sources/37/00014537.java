package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel$startConnectMonitoring$1", m29092f = "OneRegisterTrueOnlineIdCardReaderViewModel.kt", m29091i = {}, m29090l = {57}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineIdCardReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineIdCardReaderViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineIdCardReaderViewModel$startConnectMonitoring$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,231:1\n230#2,5:232\n230#2,5:237\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineIdCardReaderViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineIdCardReaderViewModel$startConnectMonitoring$1\n*L\n52#1:232,5\n55#1:237,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel$startConnectMonitoring$1 */
/* loaded from: classes10.dex */
public final class C15621xe4f1e255 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineIdCardReaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15621xe4f1e255(OneRegisterTrueOnlineIdCardReaderViewModel oneRegisterTrueOnlineIdCardReaderViewModel, Continuation<? super C15621xe4f1e255> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineIdCardReaderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C15621xe4f1e255(this.this$0, continuation);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x001d */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L14:
            kotlin.ResultKt.throwOnFailure(r6)
        L17:
            th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel r6 = r5.this$0
            boolean r6 = th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel.access$isConnectLooping$p(r6)
            if (r6 == 0) goto L6a
            th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel r6 = r5.this$0     // Catch: java.lang.Exception -> L44
            kotlinx.coroutines.flow.MutableStateFlow r6 = th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel.access$get_isConnected$p(r6)     // Catch: java.lang.Exception -> L44
            th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel r1 = r5.this$0     // Catch: java.lang.Exception -> L44
        L27:
            java.lang.Object r3 = r6.getValue()     // Catch: java.lang.Exception -> L44
            r4 = r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L44
            r4.booleanValue()     // Catch: java.lang.Exception -> L44
            th.co.dtac.android.dtacone.manager.cardreader.CardReaderService r4 = th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel.access$getCardReaderService$p(r1)     // Catch: java.lang.Exception -> L44
            boolean r4 = r4.isConnected()     // Catch: java.lang.Exception -> L44
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch: java.lang.Exception -> L44
            boolean r3 = r6.compareAndSet(r3, r4)     // Catch: java.lang.Exception -> L44
            if (r3 == 0) goto L27
            goto L5f
        L44:
            th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel r6 = r5.this$0
            kotlinx.coroutines.flow.MutableStateFlow r6 = th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel.access$get_isConnected$p(r6)
        L4a:
            java.lang.Object r1 = r6.getValue()
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r3 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            boolean r1 = r6.compareAndSet(r1, r3)
            if (r1 == 0) goto L4a
        L5f:
            r5.label = r2
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L17
            return r0
        L6a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.C15621xe4f1e255.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((C15621xe4f1e255) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}