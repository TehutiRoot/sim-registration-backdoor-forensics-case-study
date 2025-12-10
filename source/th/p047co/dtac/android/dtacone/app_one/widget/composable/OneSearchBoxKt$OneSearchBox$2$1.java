package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt$OneSearchBox$2$1", m28800f = "OneSearchBox.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt$OneSearchBox$2$1 */
/* loaded from: classes7.dex */
public final class OneSearchBoxKt$OneSearchBox$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ boolean $shouldFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSearchBoxKt$OneSearchBox$2$1(boolean z, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Continuation<? super OneSearchBoxKt$OneSearchBox$2$1> continuation) {
        super(2, continuation);
        this.$shouldFocus = z;
        this.$focusRequester = focusRequester;
        this.$keyboardController = softwareKeyboardController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneSearchBoxKt$OneSearchBox$2$1(this.$shouldFocus, this.$focusRequester, this.$keyboardController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$shouldFocus) {
                this.$focusRequester.requestFocus();
                SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.show();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneSearchBoxKt$OneSearchBox$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
