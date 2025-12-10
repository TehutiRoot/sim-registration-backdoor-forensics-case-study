package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$rememberIsKeyboardOpen$1", m29092f = "KeyboardHelper.kt", m29091i = {}, m29090l = {37}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$rememberIsKeyboardOpen$1 */
/* loaded from: classes7.dex */
public final class KeyboardHelperKt$rememberIsKeyboardOpen$1 extends SuspendLambda implements Function2<ProduceStateScope<Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt$rememberIsKeyboardOpen$1$1 */
    /* loaded from: classes7.dex */
    public static final class C141731 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener $listener;
        final /* synthetic */ ViewTreeObserver $viewTreeObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141731(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            super(0);
            this.$viewTreeObserver = viewTreeObserver;
            this.$listener = onGlobalLayoutListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewTreeObserver.removeOnGlobalLayoutListener(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardHelperKt$rememberIsKeyboardOpen$1(View view, Continuation<? super KeyboardHelperKt$rememberIsKeyboardOpen$1> continuation) {
        super(2, continuation);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProduceStateScope produceStateScope, View view) {
        produceStateScope.setValue(Boolean.valueOf(KeyboardHelperKt.isKeyboardOpen(view)));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        KeyboardHelperKt$rememberIsKeyboardOpen$1 keyboardHelperKt$rememberIsKeyboardOpen$1 = new KeyboardHelperKt$rememberIsKeyboardOpen$1(this.$view, continuation);
        keyboardHelperKt$rememberIsKeyboardOpen$1.L$0 = obj;
        return keyboardHelperKt$rememberIsKeyboardOpen$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProduceStateScope<Boolean> produceStateScope, @Nullable Continuation<? super Unit> continuation) {
        return ((KeyboardHelperKt$rememberIsKeyboardOpen$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            ViewTreeObserver viewTreeObserver = this.$view.getViewTreeObserver();
            final View view = this.$view;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.composable.helper.a
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    KeyboardHelperKt$rememberIsKeyboardOpen$1.invokeSuspend$lambda$0(ProduceStateScope.this, view);
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C141731 c141731 = new C141731(viewTreeObserver, onGlobalLayoutListener);
            this.label = 1;
            if (produceStateScope.awaitDispose(c141731, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}