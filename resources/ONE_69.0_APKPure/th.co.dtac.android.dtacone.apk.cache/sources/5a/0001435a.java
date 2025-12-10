package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$9 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$9 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SheetState $addressSheetState;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showAddressSelectSheet$delegate;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$9$1", m29092f = "InputInfoScreen.kt", m29091i = {}, m29090l = {233}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$9$1 */
    /* loaded from: classes10.dex */
    public static final class C154901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SheetState $addressSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154901(SheetState sheetState, Continuation<? super C154901> continuation) {
            super(2, continuation);
            this.$addressSheetState = sheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C154901(this.$addressSheetState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                SheetState sheetState = this.$addressSheetState;
                this.label = 1;
                if (sheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C154901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$9$2 */
    /* loaded from: classes10.dex */
    public static final class C154912 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ MutableState<Boolean> $showAddressSelectSheet$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154912(MutableState<Boolean> mutableState) {
            super(1);
            this.$showAddressSelectSheet$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            InputInfoScreenKt.m9505p(this.$showAddressSelectSheet$delegate, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$InputInfoScreen$9(CoroutineScope coroutineScope, SheetState sheetState, MutableState<Boolean> mutableState) {
        super(0);
        this.$scope = coroutineScope;
        this.$addressSheetState = sheetState;
        this.$showAddressSelectSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Job m65885e;
        m65885e = AbstractC1539Vc.m65885e(this.$scope, null, null, new C154901(this.$addressSheetState, null), 3, null);
        m65885e.invokeOnCompletion(new C154912(this.$showAddressSelectSheet$delegate));
    }
}