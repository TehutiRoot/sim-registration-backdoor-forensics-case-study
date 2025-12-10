package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneMnpGetFormsState;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSignFragment$onViewCreated$1$1", m29092f = "OneMnpSignFragment.kt", m29091i = {}, m29090l = {SyslogConstants.LOG_NTP}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSignFragment$onViewCreated$1$1 */
/* loaded from: classes10.dex */
public final class OneMnpSignFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpSignFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMnpGetFormsState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSignFragment$onViewCreated$1$1$1", m29092f = "OneMnpSignFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    @SourceDebugExtension({"SMAP\nOneMnpSignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMnpSignFragment.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/fragment/OneMnpSignFragment$onViewCreated$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpSignFragment$onViewCreated$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C147611 extends SuspendLambda implements Function2<OneMnpGetFormsState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpSignFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147611(OneMnpSignFragment oneMnpSignFragment, Continuation<? super C147611> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpSignFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147611 c147611 = new C147611(this.this$0, continuation);
            c147611.L$0 = obj;
            return c147611;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OneMnpViewModel viewModel;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneMnpGetFormsState oneMnpGetFormsState = (OneMnpGetFormsState) this.L$0;
                if (oneMnpGetFormsState instanceof OneMnpGetFormsState.Success) {
                    this.this$0.dismissLoading();
                    viewModel = this.this$0.getViewModel();
                    String value = viewModel.getESignFormPDF().getValue();
                    if (value != null) {
                        this.this$0.m13764C(value);
                    }
                } else if (oneMnpGetFormsState instanceof OneMnpGetFormsState.Loading) {
                    this.this$0.showLoading();
                } else if (oneMnpGetFormsState instanceof OneMnpGetFormsState.Error) {
                    this.this$0.dismissLoading();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneMnpGetFormsState oneMnpGetFormsState, @Nullable Continuation<? super Unit> continuation) {
            return ((C147611) create(oneMnpGetFormsState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpSignFragment$onViewCreated$1$1(OneMnpViewModel oneMnpViewModel, OneMnpSignFragment oneMnpSignFragment, Continuation<? super OneMnpSignFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpSignFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpSignFragment$onViewCreated$1$1(this.$this_apply, this.this$0, continuation);
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
            StateFlow<OneMnpGetFormsState> getFormState = this.$this_apply.getGetFormState();
            C147611 c147611 = new C147611(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(getFormState, c147611, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpSignFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}