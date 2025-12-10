package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity;

import androidx.fragment.app.Fragment;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.view.compose.upPass.model.UpPassScreen;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$handelBackButtonForCommon$1", m29092f = "OnePrepaidRegistrationActivity.kt", m29091i = {}, m29090l = {181}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$handelBackButtonForCommon$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidRegistrationActivity$handelBackButtonForCommon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OnePrepaidRegistrationActivity this$0;

    /* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$handelBackButtonForCommon$1$a */
    /* loaded from: classes10.dex */
    public static final class C15080a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ OnePrepaidRegistrationActivity f95650a;

        public C15080a(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
            this.f95650a = onePrepaidRegistrationActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(UpPassScreen upPassScreen, Continuation continuation) {
            boolean z;
            boolean z2;
            Fragment findFragmentById = this.f95650a.getSupportFragmentManager().findFragmentById(R.id.contentOnePrepaid);
            boolean z3 = true;
            if (upPassScreen instanceof UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.FaceCompareKyc2ndLine) {
                z = true;
            } else {
                z = upPassScreen instanceof UpPassScreen.UpPassForms.IdDocumentOcrFaceCompareLivenessFlow.FaceCompareKyc2ndLineResult;
            }
            if (z) {
                z2 = true;
            } else {
                z2 = upPassScreen instanceof UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompareKyc2ndLine;
            }
            if (!z2) {
                z3 = upPassScreen instanceof UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompareKyc2ndLineResult;
            }
            if (z3) {
                if (findFragmentById instanceof UpPassFormFragment) {
                    this.f95650a.closeToolbarBackButton();
                }
            } else if (findFragmentById instanceof UpPassFormFragment) {
                this.f95650a.openToolbarBackButton();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidRegistrationActivity$handelBackButtonForCommon$1(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity, Continuation<? super OnePrepaidRegistrationActivity$handelBackButtonForCommon$1> continuation) {
        super(2, continuation);
        this.this$0 = onePrepaidRegistrationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OnePrepaidRegistrationActivity$handelBackButtonForCommon$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            StateFlow<UpPassScreen> navigationState = this.this$0.getUpPassViewModel().getNavigationState();
            C15080a c15080a = new C15080a(this.this$0);
            this.label = 1;
            if (navigationState.collect(c15080a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OnePrepaidRegistrationActivity$handelBackButtonForCommon$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}