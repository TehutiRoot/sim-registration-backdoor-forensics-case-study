package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$getConsent$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {588, TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$getConsent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n230#2,5:1170\n230#2,5:1175\n230#2,5:1180\n230#2,5:1185\n230#2,5:1190\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$getConsent$1\n*L\n585#1:1160,5\n589#1:1165,5\n605#1:1170,5\n620#1:1175,5\n622#1:1180,5\n625#1:1185,5\n627#1:1190,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$getConsent$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$getConsent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $documentType;
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$getConsent$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, String str, Continuation<? super OneConsentAndESignViewModel$getConsent$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
        this.$documentType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$getConsent$1(this.this$0, this.$documentType, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106 A[Catch: Exception -> 0x0019, HttpException -> 0x001c, SocketTimeoutException -> 0x0154, TryCatch #2 {SocketTimeoutException -> 0x0154, HttpException -> 0x001c, Exception -> 0x0019, blocks: (B:6:0x0014, B:58:0x00f1, B:59:0x00f9, B:61:0x0106, B:63:0x0112, B:66:0x0119, B:69:0x012a, B:67:0x011f, B:68:0x0125, B:51:0x00cf, B:55:0x00e8, B:54:0x00e6), top: B:105:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[Catch: Exception -> 0x0019, HttpException -> 0x001c, SocketTimeoutException -> 0x0154, TryCatch #2 {SocketTimeoutException -> 0x0154, HttpException -> 0x001c, Exception -> 0x0019, blocks: (B:6:0x0014, B:58:0x00f1, B:59:0x00f9, B:61:0x0106, B:63:0x0112, B:66:0x0119, B:69:0x012a, B:67:0x011f, B:68:0x0125, B:51:0x00cf, B:55:0x00e8, B:54:0x00e6), top: B:105:0x000e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$getConsent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$getConsent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}