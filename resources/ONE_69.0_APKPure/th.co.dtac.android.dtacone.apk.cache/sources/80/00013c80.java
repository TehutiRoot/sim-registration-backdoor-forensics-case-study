package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$navigateNextToCommon$upPassFormOnValidationCallback$1", m29092f = "OnePrepaidNavigateToCommonFragment.kt", m29091i = {}, m29090l = {189}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.fragment.common.OnePrepaidNavigateToCommonFragment$navigateNextToCommon$upPassFormOnValidationCallback$1 */
/* loaded from: classes10.dex */
public final class C15089xa13fc940 extends SuspendLambda implements Function2<UpPassFormResult, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OnePrepaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15089xa13fc940(OnePrepaidNavigateToCommonFragment onePrepaidNavigateToCommonFragment, Continuation<? super C15089xa13fc940> continuation) {
        super(2, continuation);
        this.this$0 = onePrepaidNavigateToCommonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C15089xa13fc940 c15089xa13fc940 = new C15089xa13fc940(this.this$0, continuation);
        c15089xa13fc940.L$0 = obj;
        return c15089xa13fc940;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OnePrepaidValidationViewModel onePrepaidValidationViewModel;
        OnePrepaidValidationViewModel onePrepaidValidationViewModel2;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            UpPassFormResult upPassFormResult = (UpPassFormResult) this.L$0;
            onePrepaidValidationViewModel = this.this$0.f95768i;
            OnePrepaidValidationViewModel onePrepaidValidationViewModel3 = null;
            if (onePrepaidValidationViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
                onePrepaidValidationViewModel = null;
            }
            CompletableDeferred<Boolean> newGate = onePrepaidValidationViewModel.newGate();
            onePrepaidValidationViewModel2 = this.this$0.f95768i;
            if (onePrepaidValidationViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
            } else {
                onePrepaidValidationViewModel3 = onePrepaidValidationViewModel2;
            }
            onePrepaidValidationViewModel3.mapIDDocument(upPassFormResult);
            this.this$0.m10656p();
            this.label = 1;
            obj = newGate.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Boxing.boxBoolean(((Boolean) obj).booleanValue());
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull UpPassFormResult upPassFormResult, @Nullable Continuation<? super Boolean> continuation) {
        return ((C15089xa13fc940) create(upPassFormResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}