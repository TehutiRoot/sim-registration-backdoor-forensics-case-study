package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

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
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$validateConsent$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {1}, m29090l = {1868, 1869, 1883}, m29089m = "invokeSuspend", m29088n = {"response"}, m29087s = {"L$0"})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$validateConsent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,5:2378\n230#2,5:2383\n230#2,5:2388\n230#2,5:2393\n230#2,5:2398\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$validateConsent$1\n*L\n1866#1:2373,5\n1870#1:2378,5\n1882#1:2383,5\n1885#1:2388,5\n1888#1:2393,5\n1890#1:2398,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$validateConsent$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$validateConsent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$validateConsent$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$validateConsent$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$validateConsent$1(this.this$0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: Exception -> 0x0026, HttpException -> 0x0028, SocketTimeoutException -> 0x00b7, TryCatch #2 {SocketTimeoutException -> 0x00b7, HttpException -> 0x0028, Exception -> 0x0026, blocks: (B:11:0x0022, B:27:0x006b, B:28:0x0071, B:30:0x007e, B:32:0x008d, B:31:0x0088, B:16:0x002c, B:24:0x0057, B:21:0x0048), top: B:70:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: Exception -> 0x0026, HttpException -> 0x0028, SocketTimeoutException -> 0x00b7, TryCatch #2 {SocketTimeoutException -> 0x00b7, HttpException -> 0x0028, Exception -> 0x0026, blocks: (B:11:0x0022, B:27:0x006b, B:28:0x0071, B:30:0x007e, B:32:0x008d, B:31:0x0088, B:16:0x002c, B:24:0x0057, B:21:0x0048), top: B:70:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$validateConsent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$validateConsent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}