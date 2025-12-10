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
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel$startFetchingCardDataLoop$1", m29092f = "OneRegisterTrueOnlineIdCardReaderViewModel.kt", m29091i = {0, 0, 1}, m29090l = {84, 109}, m29089m = "invokeSuspend", m29088n = {"cardInfo", "attempt", "attempt"}, m29087s = {"L$0", "J$0", "J$0"})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineIdCardReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineIdCardReaderViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineIdCardReaderViewModel$startFetchingCardDataLoop$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,231:1\n230#2,5:232\n230#2,5:237\n230#2,5:242\n230#2,5:247\n230#2,5:252\n230#2,5:257\n230#2,5:262\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineIdCardReaderViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineIdCardReaderViewModel$startFetchingCardDataLoop$1\n*L\n78#1:232,5\n80#1:237,5\n86#1:242,5\n91#1:247,5\n95#1:252,5\n101#1:257,5\n103#1:262,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel$startFetchingCardDataLoop$1 */
/* loaded from: classes10.dex */
public final class C15622xa64757d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineIdCardReaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15622xa64757d(OneRegisterTrueOnlineIdCardReaderViewModel oneRegisterTrueOnlineIdCardReaderViewModel, Continuation<? super C15622xa64757d> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineIdCardReaderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C15622xa64757d(this.this$0, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:69|70|71|24|(1:25)|27|28|29|52|53|(1:55)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
        r8 = r8 + 1;
        r14 = r13.this$0;
        r14 = r14.f98099b;
        r14.closeByeStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
        if ((r14 instanceof th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:
        r1 = r13.this$0.f98103f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:
        r10 = r1.getValue();
        r11 = (th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0167, code lost:
        if (r1.compareAndSet(r10, new th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState.ErrorRes(((th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException) r14).getResId())) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016a, code lost:
        r14 = r13.this$0.f98103f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0170, code lost:
        r1 = r14.getValue();
        r10 = (th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0182, code lost:
        if (r14.compareAndSet(r1, new th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.IdCardReaderState.ErrorRes(th.p047co.dtac.android.dtacone.R.string.mnp_card_reader_read_error)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
        r13.this$0.f98110m = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x002c, Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:19:0x003e, B:21:0x004a, B:22:0x0050, B:24:0x005f, B:26:0x006b, B:27:0x0071, B:29:0x0080, B:32:0x00c4, B:33:0x00d3, B:39:0x00f2, B:40:0x00f8, B:10:0x0027), top: B:69:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #2 {all -> 0x002c, blocks: (B:19:0x003e, B:21:0x004a, B:22:0x0050, B:24:0x005f, B:26:0x006b, B:27:0x0071, B:29:0x0080, B:32:0x00c4, B:33:0x00d3, B:35:0x00e8, B:43:0x0112, B:44:0x0118, B:46:0x012c, B:49:0x0146, B:51:0x014a, B:52:0x0150, B:58:0x0184, B:55:0x016a, B:56:0x0170, B:39:0x00f2, B:40:0x00f8, B:10:0x0027), top: B:69:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0138 -> B:17:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0198 -> B:17:0x0036). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.C15622xa64757d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((C15622xa64757d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}