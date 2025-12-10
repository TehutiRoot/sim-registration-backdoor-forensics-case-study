package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.core.content.ContextCompat;
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
import th.p047co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$ScanQrCodeScreen$1", m29092f = "ScanQrCodeScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.ScanQrCodeScreenKt$ScanQrCodeScreen$1 */
/* loaded from: classes10.dex */
public final class ScanQrCodeScreenKt$ScanQrCodeScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneConsentEsignActivity $context;
    final /* synthetic */ MutableState<Boolean> $hasCameraPermission$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $launcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanQrCodeScreenKt$ScanQrCodeScreen$1(OneConsentEsignActivity oneConsentEsignActivity, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, MutableState<Boolean> mutableState, Continuation<? super ScanQrCodeScreenKt$ScanQrCodeScreen$1> continuation) {
        super(2, continuation);
        this.$context = oneConsentEsignActivity;
        this.$launcher = managedActivityResultLauncher;
        this.$hasCameraPermission$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ScanQrCodeScreenKt$ScanQrCodeScreen$1(this.$context, this.$launcher, this.$hasCameraPermission$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (ContextCompat.checkSelfPermission(this.$context, "android.permission.CAMERA") == 0) {
                ScanQrCodeScreenKt.m14327h(this.$hasCameraPermission$delegate, true);
            } else {
                this.$launcher.launch("android.permission.CAMERA");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ScanQrCodeScreenKt$ScanQrCodeScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}