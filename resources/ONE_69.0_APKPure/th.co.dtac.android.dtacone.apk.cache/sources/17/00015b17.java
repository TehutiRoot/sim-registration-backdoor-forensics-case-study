package th.p047co.dtac.android.dtacone.viewmodel.upPass;

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
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$kyc2GetStatus$1", m29092f = "UpPassViewModel.kt", m29091i = {}, m29090l = {490}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$kyc2GetStatus$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$kyc2GetStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$kyc2GetStatus$1(UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$kyc2GetStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassViewModel$kyc2GetStatus$1(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if ((r5.getValue() instanceof th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState.Cancelled) != false) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> Lf
            goto L2c
        Lf:
            goto L93
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.ResultKt.throwOnFailure(r5)
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r5 = r4.this$0     // Catch: java.lang.Exception -> Lf
            th.co.dtac.android.dtacone.repository.upPass.UpPassRepository r5 = th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$getUpPassRepository$p(r5)     // Catch: java.lang.Exception -> Lf
            r4.label = r2     // Catch: java.lang.Exception -> Lf
            java.lang.Object r5 = r5.getKyc2Status(r4)     // Catch: java.lang.Exception -> Lf
            if (r5 != r0) goto L2c
            return r0
        L2c:
            th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusResponse r5 = (th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusResponse) r5     // Catch: java.lang.Exception -> Lf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf
            r0.<init>()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = "kyc2GetStatus: response: "
            r0.append(r1)     // Catch: java.lang.Exception -> Lf
            r0.append(r5)     // Catch: java.lang.Exception -> Lf
            th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusData r0 = r5.getData()     // Catch: java.lang.Exception -> Lf
            java.lang.String r0 = r0.getVerifyStatus()     // Catch: java.lang.Exception -> Lf
            th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusData r1 = r5.getData()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = r1.getVerifyResult()     // Catch: java.lang.Exception -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf
            r2.<init>()     // Catch: java.lang.Exception -> Lf
            java.lang.String r3 = "kyc2GetStatus: current status: "
            r2.append(r3)     // Catch: java.lang.Exception -> Lf
            r2.append(r0)     // Catch: java.lang.Exception -> Lf
            java.lang.String r0 = ", result: "
            r2.append(r0)     // Catch: java.lang.Exception -> Lf
            r2.append(r1)     // Catch: java.lang.Exception -> Lf
            java.lang.String r0 = r5.getCodeType()     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = "S"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L93
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r0 = r4.this$0     // Catch: java.lang.Exception -> Lf
            kotlinx.coroutines.flow.MutableStateFlow r0 = th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$get_kyc2StatusState$p(r0)     // Catch: java.lang.Exception -> Lf
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r1 = r4.this$0     // Catch: java.lang.Exception -> Lf
            th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusData r2 = r5.getData()     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = r2.getVerifyStatus()     // Catch: java.lang.Exception -> Lf
            if (r2 != 0) goto L80
            java.lang.String r2 = "Open"
        L80:
            th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusData r5 = r5.getData()     // Catch: java.lang.Exception -> Lf
            java.lang.String r5 = r5.getVerifyResult()     // Catch: java.lang.Exception -> Lf
            if (r5 != 0) goto L8c
            java.lang.String r5 = ""
        L8c:
            th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState r5 = th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$kyc2StatusOf(r1, r2, r5)     // Catch: java.lang.Exception -> Lf
            r0.setValue(r5)     // Catch: java.lang.Exception -> Lf
        L93:
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r5 = r4.this$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$get_kyc2StatusState$p(r5)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = r5 instanceof th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState.Verified
            if (r5 != 0) goto Laf
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r5 = r4.this$0
            kotlinx.coroutines.flow.MutableStateFlow r5 = th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$get_kyc2StatusState$p(r5)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = r5 instanceof th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState.Cancelled
            if (r5 == 0) goto Lc0
        Laf:
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r5 = r4.this$0
            android.os.CountDownTimer r5 = th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$getCountDownTimer$p(r5)
            if (r5 == 0) goto Lba
            r5.cancel()
        Lba:
            th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel r5 = r4.this$0
            r0 = 0
            th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel.access$setCountDownTimer$p(r5, r0)
        Lc0:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$kyc2GetStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassViewModel$kyc2GetStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}