package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import android.os.CountDownTimer;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2QueryStatusResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2ServiceTimeData;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineServiceTimeState;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$kyc2CheckFinalState$1", m29092f = "UpPassViewModel.kt", m29091i = {}, m29090l = {FrameMetricsAggregator.EVERY_DURATION, 523, 535}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$kyc2CheckFinalState$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$kyc2CheckFinalState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$kyc2CheckFinalState$1(UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$kyc2CheckFinalState$1> continuation) {
        super(2, continuation);
        this.this$0 = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassViewModel$kyc2CheckFinalState$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Object m1856b;
        Kyc2ndLineServiceTimeState.Success success;
        int i;
        int i2;
        int i3;
        int i4;
        CountDownTimer countDownTimer;
        Object m1856b2;
        Kyc2ServiceTimeData data;
        MutableStateFlow mutableStateFlow4;
        Kyc2ndLineStatusState m1853e;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2 && i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            UpPassRepository upPassRepository = this.this$0.f107133b;
            this.label = 1;
            obj = upPassRepository.queryKyc2Status(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Kyc2QueryStatusResponse kyc2QueryStatusResponse = (Kyc2QueryStatusResponse) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("kyc2CheckFinalState: response: ");
        sb.append(kyc2QueryStatusResponse);
        String verifyStatus = kyc2QueryStatusResponse.getData().getVerifyStatus();
        String verifyResult = kyc2QueryStatusResponse.getData().getVerifyResult();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("kyc2CheckFinalState: current status: ");
        sb2.append(verifyStatus);
        sb2.append(", result: ");
        sb2.append(verifyResult);
        if (Intrinsics.areEqual(kyc2QueryStatusResponse.getCodeType(), "S")) {
            mutableStateFlow4 = this.this$0.f107148q;
            m1853e = this.this$0.m1853e(kyc2QueryStatusResponse.getData().getVerifyStatus(), kyc2QueryStatusResponse.getData().getVerifyResult());
            mutableStateFlow4.setValue(m1853e);
        }
        mutableStateFlow = this.this$0.f107148q;
        if (!(mutableStateFlow.getValue() instanceof Kyc2ndLineStatusState.Pending)) {
            mutableStateFlow2 = this.this$0.f107148q;
            if (!(mutableStateFlow2.getValue() instanceof Kyc2ndLineStatusState.Cancelled)) {
                mutableStateFlow3 = this.this$0.f107148q;
                if (!(mutableStateFlow3.getValue() instanceof Kyc2ndLineStatusState.Verified)) {
                    UpPassViewModel upPassViewModel = this.this$0;
                    this.label = 3;
                    m1856b = upPassViewModel.m1856b(this);
                    if (m1856b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            Object value = this.this$0.f107142k.getValue();
            if (value instanceof Kyc2ndLineServiceTimeState.Success) {
                success = (Kyc2ndLineServiceTimeState.Success) value;
            } else {
                success = null;
            }
            if (success != null && (data = success.getData()) != null) {
                i = data.getExtendTimes();
            } else {
                i = 0;
            }
            i2 = this.this$0.f107153v;
            if (i2 >= i) {
                UpPassViewModel upPassViewModel2 = this.this$0;
                this.label = 2;
                m1856b2 = upPassViewModel2.m1856b(this);
                if (m1856b2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UpPassViewModel upPassViewModel3 = this.this$0;
                i3 = upPassViewModel3.f107153v;
                upPassViewModel3.f107153v = i3 + 1;
                i4 = this.this$0.f107153v;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("kyc2CheckFinalState: Status is pending, extend time round ");
                sb3.append(i4);
                sb3.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb3.append(i);
                sb3.append(".");
                countDownTimer = this.this$0.f107151t;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                this.this$0.f107151t = null;
                this.this$0.f107150s = false;
                this.this$0.kyc2StartTimer();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassViewModel$kyc2CheckFinalState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}