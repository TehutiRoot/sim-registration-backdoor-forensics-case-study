package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModel$startFetchingCardDataLoop$1", m29092f = "IdCardReaderViewModel.kt", m29091i = {0, 0, 1}, m29090l = {100, WebSocketProtocol.PAYLOAD_SHORT}, m29089m = "invokeSuspend", m29088n = {"cardInfo", "attempt", "attempt"}, m29087s = {"L$0", "J$0", "J$0"})
@SourceDebugExtension({"SMAP\nIdCardReaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdCardReaderViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/IdCardReaderViewModel$startFetchingCardDataLoop$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,163:1\n230#2,5:164\n230#2,5:169\n230#2,5:174\n230#2,5:179\n230#2,5:184\n230#2,5:189\n230#2,5:194\n230#2,5:199\n*S KotlinDebug\n*F\n+ 1 IdCardReaderViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/IdCardReaderViewModel$startFetchingCardDataLoop$1\n*L\n90#1:164,5\n92#1:169,5\n101#1:174,5\n107#1:179,5\n108#1:184,5\n112#1:189,5\n118#1:194,5\n120#1:199,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModel$startFetchingCardDataLoop$1 */
/* loaded from: classes9.dex */
public final class IdCardReaderViewModel$startFetchingCardDataLoop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ IdCardReaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdCardReaderViewModel$startFetchingCardDataLoop$1(IdCardReaderViewModel idCardReaderViewModel, Continuation<? super IdCardReaderViewModel$startFetchingCardDataLoop$1> continuation) {
        super(2, continuation);
        this.this$0 = idCardReaderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new IdCardReaderViewModel$startFetchingCardDataLoop$1(this.this$0, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:75|(2:76|77)|26|(1:27)|29|30|31|54|55|(1:57)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
        r8 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x002c, Exception -> 0x002f, TRY_ENTER, TryCatch #0 {Exception -> 0x002f, blocks: (B:19:0x003e, B:21:0x004a, B:23:0x005c, B:24:0x0062, B:26:0x0071, B:28:0x007d, B:29:0x0083, B:31:0x0092, B:34:0x00e2, B:35:0x00e8, B:41:0x0107, B:42:0x0112, B:44:0x0126, B:45:0x012c, B:10:0x0027), top: B:72:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #2 {all -> 0x002c, blocks: (B:19:0x003e, B:21:0x004a, B:23:0x005c, B:24:0x0062, B:26:0x0071, B:28:0x007d, B:29:0x0083, B:31:0x0092, B:34:0x00e2, B:35:0x00e8, B:37:0x00fd, B:48:0x0146, B:49:0x014c, B:51:0x0160, B:54:0x017a, B:56:0x017e, B:57:0x0184, B:63:0x01b8, B:60:0x019e, B:61:0x01a4, B:41:0x0107, B:42:0x0112, B:44:0x0126, B:45:0x012c, B:10:0x0027), top: B:72:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016c -> B:17:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01cc -> B:17:0x0036). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModel$startFetchingCardDataLoop$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((IdCardReaderViewModel$startFetchingCardDataLoop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}