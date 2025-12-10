package kotlinx.coroutines.selects;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\b2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"c\u0010\u001d\u001aQ\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016j\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f\"\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001f\"\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001f\"\u001a\u0010*\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010)*Â\u0001\b\u0007\u0010.\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030+¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u00162[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030+¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u0016B\u0002\b-*¦\u0001\b\u0007\u0010/\"M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016B\u0002\b-*¦\u0001\b\u0007\u00100\"M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030+¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030\u00162M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030+¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030\u0016B\u0002\b-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m28850d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "select", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlin/ParameterName;", "name", "cause", "onCancellation", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/coroutines/CancellableContinuation;Lkotlin/jvm/functions/Function1;)Z", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "Lkotlin/Function3;", "", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Lkotlin/jvm/functions/Function3;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlinx/coroutines/internal/Symbol;", "STATE_REG", OperatorName.CURVE_TO, "STATE_COMPLETED", "d", "STATE_CANCELLED", "e", "NO_RESULT", OperatorName.FILL_NON_ZERO, "getPARAM_CLAUSE_0", "()Lkotlinx/coroutines/internal/Symbol;", "PARAM_CLAUSE_0", "Lkotlinx/coroutines/selects/SelectInstance;", "internalResult", "Lkotlinx/coroutines/InternalCoroutinesApi;", "OnCancellationConstructor", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SelectKt {

    /* renamed from: a */
    public static final Function3 f71085a = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.INSTANCE;

    /* renamed from: b */
    public static final Symbol f71086b = new Symbol("STATE_REG");

    /* renamed from: c */
    public static final Symbol f71087c = new Symbol("STATE_COMPLETED");

    /* renamed from: d */
    public static final Symbol f71088d = new Symbol("STATE_CANCELLED");

    /* renamed from: e */
    public static final Symbol f71089e = new Symbol("NO_RESULT");

    /* renamed from: f */
    public static final Symbol f71090f = new Symbol("PARAM_CLAUSE_0");

    @InternalCoroutinesApi
    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void RegistrationFunction$annotations() {
    }

    /* renamed from: a */
    public static final TrySelectDetailedResult m26764a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return TrySelectDetailedResult.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i).toString());
                }
                return TrySelectDetailedResult.CANCELLED;
            }
            return TrySelectDetailedResult.REREGISTER;
        }
        return TrySelectDetailedResult.SUCCESSFUL;
    }

    public static final /* synthetic */ TrySelectDetailedResult access$TrySelectDetailedResult(int i) {
        return m26764a(i);
    }

    public static final /* synthetic */ Symbol access$getNO_RESULT$p() {
        return f71089e;
    }

    public static final /* synthetic */ Symbol access$getSTATE_CANCELLED$p() {
        return f71088d;
    }

    public static final /* synthetic */ Symbol access$getSTATE_COMPLETED$p() {
        return f71087c;
    }

    public static final /* synthetic */ Symbol access$getSTATE_REG$p() {
        return f71086b;
    }

    public static final /* synthetic */ boolean access$tryResume(CancellableContinuation cancellableContinuation, Function1 function1) {
        return m26763b(cancellableContinuation, function1);
    }

    /* renamed from: b */
    public static final boolean m26763b(CancellableContinuation cancellableContinuation, Function1 function1) {
        Object tryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, function1);
        if (tryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(tryResume);
        return true;
    }

    @NotNull
    public static final Symbol getPARAM_CLAUSE_0() {
        return f71090f;
    }

    @Nullable
    public static final <R> Object select(@NotNull Function1<? super SelectBuilder<? super R>, Unit> function1, @NotNull Continuation<? super R> continuation) {
        SelectImplementation selectImplementation = new SelectImplementation(continuation.getContext());
        function1.invoke(selectImplementation);
        return selectImplementation.doSelect(continuation);
    }
}
