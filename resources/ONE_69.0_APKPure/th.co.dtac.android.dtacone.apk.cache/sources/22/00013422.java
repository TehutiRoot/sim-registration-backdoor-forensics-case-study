package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment;

import android.text.Editable;
import android.view.Window;
import android.widget.EditText;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1", m29092f = "OneNadOutboundSearchFragment.kt", m29091i = {}, m29090l = {SyslogConstants.LOG_LOCAL2}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneNadOutboundSearchFragment this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1$1", m29092f = "OneNadOutboundSearchFragment.kt", m29091i = {}, m29090l = {145}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1$1 */
    /* loaded from: classes10.dex */
    public static final class C148011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ OneNadOutboundSearchFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C148011(OneNadOutboundSearchFragment oneNadOutboundSearchFragment, Continuation<? super C148011> continuation) {
            super(2, continuation);
            this.this$0 = oneNadOutboundSearchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C148011(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EditText editText;
            EditText editText2;
            EditText editText3;
            EditText editText4;
            int i;
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(50L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            editText = this.this$0.f92296i;
            EditText editText5 = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
                editText = null;
            }
            editText.setFocusableInTouchMode(true);
            editText2 = this.this$0.f92296i;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
                editText2 = null;
            }
            editText2.requestFocus();
            editText3 = this.this$0.f92296i;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
                editText3 = null;
            }
            editText4 = this.this$0.f92296i;
            if (editText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
            } else {
                editText5 = editText4;
            }
            Editable text = editText5.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            editText3.setSelection(i);
            Window window = this.this$0.requireActivity().getWindow();
            new WindowInsetsControllerCompat(window, window.getDecorView()).show(WindowInsetsCompat.Type.ime());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C148011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1(OneNadOutboundSearchFragment oneNadOutboundSearchFragment, Continuation<? super OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1> continuation) {
        super(2, continuation);
        this.this$0 = oneNadOutboundSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1(this.this$0, continuation);
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
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C148011 c148011 = new C148011(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c148011, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneNadOutboundSearchFragment$setShowKeyboardAndFocus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}