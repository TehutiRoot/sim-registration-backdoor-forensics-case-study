package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

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
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$blackListConsent$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {416, 437}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$blackListConsent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n230#2,5:1170\n230#2,5:1176\n230#2,5:1181\n230#2,5:1186\n230#2,5:1191\n230#2,5:1196\n230#2,5:1201\n1#3:1175\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$blackListConsent$1\n*L\n413#1:1160,5\n423#1:1165,5\n433#1:1170,5\n456#1:1176,5\n466#1:1181,5\n475#1:1186,5\n477#1:1191,5\n480#1:1196,5\n482#1:1201,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$blackListConsent$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$blackListConsent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$blackListConsent$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, Continuation<? super OneConsentAndESignViewModel$blackListConsent$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$blackListConsent$1(this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: Exception -> 0x0018, HttpException -> 0x001b, SocketTimeoutException -> 0x01d2, TryCatch #2 {SocketTimeoutException -> 0x01d2, HttpException -> 0x001b, Exception -> 0x0018, blocks: (B:6:0x0013, B:65:0x0158, B:67:0x0164, B:68:0x016c, B:70:0x0186, B:72:0x0189, B:73:0x018f, B:75:0x019e, B:78:0x01a5, B:14:0x0027, B:24:0x0071, B:26:0x007d, B:27:0x0085, B:29:0x009f, B:31:0x00a2, B:32:0x00a8, B:19:0x0043, B:21:0x0051, B:35:0x00c4, B:38:0x00e9, B:40:0x00ff, B:42:0x0105, B:44:0x010d, B:46:0x0113, B:62:0x0141, B:52:0x011e, B:54:0x012c, B:56:0x0132, B:58:0x0138), top: B:114:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[Catch: Exception -> 0x0018, HttpException -> 0x001b, SocketTimeoutException -> 0x01d2, TryCatch #2 {SocketTimeoutException -> 0x01d2, HttpException -> 0x001b, Exception -> 0x0018, blocks: (B:6:0x0013, B:65:0x0158, B:67:0x0164, B:68:0x016c, B:70:0x0186, B:72:0x0189, B:73:0x018f, B:75:0x019e, B:78:0x01a5, B:14:0x0027, B:24:0x0071, B:26:0x007d, B:27:0x0085, B:29:0x009f, B:31:0x00a2, B:32:0x00a8, B:19:0x0043, B:21:0x0051, B:35:0x00c4, B:38:0x00e9, B:40:0x00ff, B:42:0x0105, B:44:0x010d, B:46:0x0113, B:62:0x0141, B:52:0x011e, B:54:0x012c, B:56:0x0132, B:58:0x0138), top: B:114:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164 A[Catch: Exception -> 0x0018, HttpException -> 0x001b, SocketTimeoutException -> 0x01d2, TryCatch #2 {SocketTimeoutException -> 0x01d2, HttpException -> 0x001b, Exception -> 0x0018, blocks: (B:6:0x0013, B:65:0x0158, B:67:0x0164, B:68:0x016c, B:70:0x0186, B:72:0x0189, B:73:0x018f, B:75:0x019e, B:78:0x01a5, B:14:0x0027, B:24:0x0071, B:26:0x007d, B:27:0x0085, B:29:0x009f, B:31:0x00a2, B:32:0x00a8, B:19:0x0043, B:21:0x0051, B:35:0x00c4, B:38:0x00e9, B:40:0x00ff, B:42:0x0105, B:44:0x010d, B:46:0x0113, B:62:0x0141, B:52:0x011e, B:54:0x012c, B:56:0x0132, B:58:0x0138), top: B:114:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189 A[Catch: Exception -> 0x0018, HttpException -> 0x001b, SocketTimeoutException -> 0x01d2, TryCatch #2 {SocketTimeoutException -> 0x01d2, HttpException -> 0x001b, Exception -> 0x0018, blocks: (B:6:0x0013, B:65:0x0158, B:67:0x0164, B:68:0x016c, B:70:0x0186, B:72:0x0189, B:73:0x018f, B:75:0x019e, B:78:0x01a5, B:14:0x0027, B:24:0x0071, B:26:0x007d, B:27:0x0085, B:29:0x009f, B:31:0x00a2, B:32:0x00a8, B:19:0x0043, B:21:0x0051, B:35:0x00c4, B:38:0x00e9, B:40:0x00ff, B:42:0x0105, B:44:0x010d, B:46:0x0113, B:62:0x0141, B:52:0x011e, B:54:0x012c, B:56:0x0132, B:58:0x0138), top: B:114:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$blackListConsent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$blackListConsent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}