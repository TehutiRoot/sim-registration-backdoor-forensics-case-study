package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010 \u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b(\u0010)J8\u0010.\u001a\u00020\r2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r0*2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u001c2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0011\u00104\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b4\u0010\u0019J\u000f\u00106\u001a\u00020\rH\u0000¢\u0006\u0004\b5\u0010\u000fJ \u00109\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J<\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00028\u00002#\u0010-\u001a\u001f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0016¢\u0006\u0004\b<\u0010=J#\u0010A\u001a\u00020\r2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>2\u0006\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ8\u0010A\u001a\u00020\r2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r0*j\u0002`CH\u0016¢\u0006\u0004\bA\u0010DJ\u000f\u0010F\u001a\u00020\rH\u0000¢\u0006\u0004\bE\u0010\u000fJ#\u0010H\u001a\u0004\u0018\u00010\u00172\u0006\u0010;\u001a\u00028\u00002\b\u0010G\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\bH\u0010IJH\u0010H\u001a\u0004\u0018\u00010\u00172\u0006\u0010;\u001a\u00028\u00002\b\u0010G\u001a\u0004\u0018\u00010\u00172#\u0010-\u001a\u001f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0016¢\u0006\u0004\bH\u0010JJ\u0019\u0010L\u001a\u0004\u0018\u00010\u00172\u0006\u0010K\u001a\u00020\u001cH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u0017H\u0016¢\u0006\u0004\bO\u0010:J\u001b\u0010Q\u001a\u00020\r*\u00020P2\u0006\u0010;\u001a\u00028\u0000H\u0016¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\r*\u00020P2\u0006\u0010K\u001a\u00020\u001cH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010X\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010U\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0004\bV\u0010WJ\u001b\u0010[\u001a\u0004\u0018\u00010\u001c2\b\u0010U\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0004\bY\u0010ZJ\u000f\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\\H\u0014¢\u0006\u0004\b_\u0010^J\u000f\u0010`\u001a\u00020\u0010H\u0002¢\u0006\u0004\b`\u0010\u0012J\u0017\u0010a\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\ba\u0010\"J%\u0010b\u001a\u00020\r2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0010H\u0002¢\u0006\u0004\bd\u0010\u0012J\u000f\u0010e\u001a\u00020\u0010H\u0002¢\u0006\u0004\be\u0010\u0012J\u0011\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\bi\u0010:J!\u0010j\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00172\b\u0010U\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bj\u0010kJ8\u0010l\u001a\u00020&2'\u0010'\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r0*j\u0002`CH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010n\u001a\u00020\tH\u0002¢\u0006\u0004\bo\u0010pJZ\u0010s\u001a\u0004\u0018\u00010\u00172\u0006\u0010U\u001a\u00020q2\b\u0010r\u001a\u0004\u0018\u00010\u00172\u0006\u0010\n\u001a\u00020\t2#\u0010-\u001a\u001f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010*2\b\u0010G\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bs\u0010tJH\u0010u\u001a\u00020\r2\b\u0010r\u001a\u0004\u0018\u00010\u00172\u0006\u0010\n\u001a\u00020\t2%\b\u0002\u0010-\u001a\u001f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0002¢\u0006\u0004\bu\u0010vJJ\u0010x\u001a\u0004\u0018\u00010w2\b\u0010r\u001a\u0004\u0018\u00010\u00172\b\u0010G\u001a\u0004\u0018\u00010\u00172#\u0010-\u001a\u001f\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0002¢\u0006\u0004\bx\u0010yJ\u0019\u0010{\u001a\u00020z2\b\u0010r\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020\rH\u0002¢\u0006\u0004\b}\u0010\u000fR!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\r\n\u0004\b{\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bb\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010U\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0019R\u0016\u0010\u0087\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0012R\u0016\u0010\u0088\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0012R\u0016\u0010\u0089\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u0012R\u001f\u0010\u008c\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u0004\u0018\u00010f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010hR\u0016\u0010\u0090\u0001\u001a\u00020\\8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010^R\r\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004R\u0015\u0010\u0094\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010f0\u0093\u00018\u0002X\u0082\u0004R\u0015\u0010\u0095\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0093\u00018\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0096\u0001"}, m28850d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "initCancellability", "()V", "", "resetStateReusable", "()Z", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancel", "(Ljava/lang/Throwable;)Z", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "Lkotlinx/coroutines/CancelHandler;", "handler", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "callOnCancellation", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "getResult", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", FirebaseAnalytics.Param.INDEX, "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;)V", "detachChild$kotlinx_coroutines_core", "detachChild", "idempotent", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "", "toString", "()Ljava/lang/String;", "nameString", "isReusable", OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/coroutines/internal/Segment;Ljava/lang/Throwable;)V", OperatorName.CLOSE_AND_STROKE, OperatorName.SAVE, "Lkotlinx/coroutines/DisposableHandle;", OperatorName.SET_LINE_JOINSTYLE, "()Lkotlinx/coroutines/DisposableHandle;", OperatorName.NON_STROKING_CMYK, OperatorName.MOVE_TO, "(Ljava/lang/Object;Ljava/lang/Object;)V", OperatorName.LINE_TO, "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "mode", OperatorName.FILL_NON_ZERO, "(I)V", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "p", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", OperatorName.ENDPATH, "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/Symbol;", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;)Ljava/lang/Void;", "d", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", OperatorName.NON_STROKING_GRAY, "parentHandle", "i", "stateDebugRepresentation", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
/* loaded from: classes6.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f70577c = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex");

    /* renamed from: d */
    public static final AtomicReferenceFieldUpdater f70578d = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f70579e = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle");
    @Volatile
    private volatile int _decisionAndIndex;
    @Volatile
    @Nullable
    private volatile Object _parentHandle;
    @Volatile
    @Nullable
    private volatile Object _state;

    /* renamed from: a */
    public final Continuation f70580a;

    /* renamed from: b */
    public final CoroutineContext f70581b;

    public CancellableContinuationImpl(@NotNull Continuation<? super T> continuation, int i) {
        super(i);
        this.f70580a = continuation;
        this.f70581b = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0712K1.f3087a;
    }

    private final boolean isReusable() {
        if (DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            Continuation continuation = this.f70580a;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((DispatchedContinuation) continuation).isReusable()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static /* synthetic */ void m27395o(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            cancellableContinuationImpl.m27396n(obj, i, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: a */
    public final Void m27407a(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: b */
    public final void m27406b(Segment segment, Throwable th2) {
        int i = f70577c.get(this) & 536870911;
        if (i != 536870911) {
            try {
                segment.onCancellation(i, th2, getContext());
                return;
            } catch (Throwable th3) {
                CoroutineContext context = getContext();
                CoroutineExceptionHandlerKt.handleCoroutineException(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    /* renamed from: c */
    public final boolean m27405c(Throwable th2) {
        if (!isReusable()) {
            return false;
        }
        Continuation continuation = this.f70580a;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((DispatchedContinuation) continuation).postponeCancellation(th2);
    }

    public final void callCancelHandler(@NotNull CancelHandler cancelHandler, @Nullable Throwable th2) {
        try {
            cancelHandler.invoke(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            CoroutineExceptionHandlerKt.handleCoroutineException(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void callOnCancellation(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th2) {
        try {
            function1.invoke(th2);
        } catch (Throwable th3) {
            CoroutineContext context = getContext();
            CoroutineExceptionHandlerKt.handleCoroutineException(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(@Nullable Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70578d;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            boolean z = false;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
        } while (!AbstractC13055p0.m23740a(f70578d, this, obj, new CancelledContinuation(this, th2, ((obj instanceof CancelHandler) || (obj instanceof Segment)) ? true : true)));
        NotCompleted notCompleted = (NotCompleted) obj;
        if (notCompleted instanceof CancelHandler) {
            callCancelHandler((CancelHandler) obj, th2);
        } else if (notCompleted instanceof Segment) {
            m27406b((Segment) obj, th2);
        }
        m27404d();
        m27403f(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(@Nullable Object obj, @NotNull Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70578d;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CompletedExceptionally) {
                    return;
                }
                if (obj2 instanceof C0630Iu) {
                    C0630Iu c0630Iu = (C0630Iu) obj2;
                    if (!c0630Iu.m67846c()) {
                        if (AbstractC13055p0.m23740a(f70578d, this, obj2, C0630Iu.m67847b(c0630Iu, null, null, null, null, th2, 15, null))) {
                            c0630Iu.m67845d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (AbstractC13055p0.m23740a(f70578d, this, obj2, new C0630Iu(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(@NotNull Object obj) {
        m27403f(this.resumeMode);
    }

    /* renamed from: d */
    public final void m27404d() {
        if (!isReusable()) {
            detachChild$kotlinx_coroutines_core();
        }
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle m27402g = m27402g();
        if (m27402g == null) {
            return;
        }
        m27402g.dispose();
        f70579e.set(this, NonDisposableHandle.INSTANCE);
    }

    /* renamed from: f */
    public final void m27403f(int i) {
        if (m27393q()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, i);
    }

    /* renamed from: g */
    public final DisposableHandle m27402g() {
        return (DisposableHandle) f70579e.get(this);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f70580a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f70581b;
    }

    @NotNull
    public Throwable getContinuationCancellationCause(@NotNull Job job) {
        return job.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @NotNull
    public final Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.f70580a;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Throwable getExceptionalResult$kotlinx_coroutines_core(@Nullable Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core == null) {
            return null;
        }
        return exceptionalResult$kotlinx_coroutines_core;
    }

    @PublishedApi
    @Nullable
    public final Object getResult() {
        Job job;
        boolean isReusable = isReusable();
        if (m27391s()) {
            if (m27402g() == null) {
                m27400j();
            }
            if (isReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        }
        if (isReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
            if (DispatchedTaskKt.isCancellableMode(this.resumeMode) && (job = (Job) getContext().get(Job.Key)) != null && !job.isActive()) {
                CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
                throw cancellationException;
            }
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Nullable
    public final Object getState$kotlinx_coroutines_core() {
        return f70578d.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(@Nullable Object obj) {
        if (obj instanceof C0630Iu) {
            return (T) ((C0630Iu) obj).f2634a;
        }
        return obj;
    }

    /* renamed from: i */
    public final String m27401i() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof NotCompleted) {
            return "Active";
        }
        if (state$kotlinx_coroutines_core instanceof CancelledContinuation) {
            return "Cancelled";
        }
        return "Completed";
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle m27400j = m27400j();
        if (m27400j != null && isCompleted()) {
            m27400j.dispose();
            f70579e.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(@NotNull Segment<?> segment, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70577c;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m27399k(segment);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    /* renamed from: j */
    public final DisposableHandle m27400j() {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null) {
            return null;
        }
        DisposableHandle invokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new ChildContinuation(this), 2, null);
        AbstractC13055p0.m23740a(f70579e, this, null, invokeOnCompletion$default);
        return invokeOnCompletion$default;
    }

    /* renamed from: k */
    public final void m27399k(Object obj) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70578d;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0712K1) {
                if (AbstractC13055p0.m23740a(f70578d, this, obj2, obj)) {
                    return;
                }
            } else {
                if (obj2 instanceof CancelHandler) {
                    z = true;
                } else {
                    z = obj2 instanceof Segment;
                }
                if (z) {
                    m27397m(obj, obj2);
                } else if (obj2 instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                    if (!completedExceptionally.makeHandled()) {
                        m27397m(obj, obj2);
                    }
                    if (obj2 instanceof CancelledContinuation) {
                        Throwable th2 = null;
                        if (!(obj2 instanceof CompletedExceptionally)) {
                            completedExceptionally = null;
                        }
                        if (completedExceptionally != null) {
                            th2 = completedExceptionally.cause;
                        }
                        if (obj instanceof CancelHandler) {
                            callCancelHandler((CancelHandler) obj, th2);
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m27406b((Segment) obj, th2);
                        return;
                    }
                    return;
                } else if (obj2 instanceof C0630Iu) {
                    C0630Iu c0630Iu = (C0630Iu) obj2;
                    if (c0630Iu.f2635b != null) {
                        m27397m(obj, obj2);
                    }
                    if (obj instanceof Segment) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    CancelHandler cancelHandler = (CancelHandler) obj;
                    if (c0630Iu.m67846c()) {
                        callCancelHandler(cancelHandler, c0630Iu.f2638e);
                        return;
                    }
                    if (AbstractC13055p0.m23740a(f70578d, this, obj2, C0630Iu.m67847b(c0630Iu, null, cancelHandler, null, null, null, 29, null))) {
                        return;
                    }
                } else if (obj instanceof Segment) {
                    return;
                } else {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractC13055p0.m23740a(f70578d, this, obj2, new C0630Iu(obj2, (CancelHandler) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final CancelHandler m27398l(Function1 function1) {
        if (function1 instanceof CancelHandler) {
            return (CancelHandler) function1;
        }
        return new C21279ng0(function1);
    }

    /* renamed from: m */
    public final void m27397m(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: n */
    public final void m27396n(Object obj, int i, Function1 function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70578d;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
            } else {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    if (cancelledContinuation.makeResumed()) {
                        if (function1 != null) {
                            callOnCancellation(function1, cancelledContinuation.cause);
                            return;
                        }
                        return;
                    }
                }
                m27407a(obj);
                throw new KotlinNothingValueException();
            }
        } while (!AbstractC13055p0.m23740a(f70578d, this, obj2, m27394p((NotCompleted) obj2, obj, i, function1, null)));
        m27404d();
        m27403f(i);
    }

    @NotNull
    public String nameString() {
        return "CancellableContinuation";
    }

    /* renamed from: p */
    public final Object m27394p(NotCompleted notCompleted, Object obj, int i, Function1 function1, Object obj2) {
        CancelHandler cancelHandler;
        if (!(obj instanceof CompletedExceptionally)) {
            if (DispatchedTaskKt.isCancellableMode(i) || obj2 != null) {
                if (function1 != null || (notCompleted instanceof CancelHandler) || obj2 != null) {
                    if (notCompleted instanceof CancelHandler) {
                        cancelHandler = (CancelHandler) notCompleted;
                    } else {
                        cancelHandler = null;
                    }
                    return new C0630Iu(obj, cancelHandler, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    public final void parentCancelled$kotlinx_coroutines_core(@NotNull Throwable th2) {
        if (m27405c(th2)) {
            return;
        }
        cancel(th2);
        m27404d();
    }

    /* renamed from: q */
    public final boolean m27393q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70577c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f70577c.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    /* renamed from: r */
    public final Symbol m27392r(Object obj, Object obj2, Function1 function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70578d;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof NotCompleted) {
            } else if (!(obj3 instanceof C0630Iu) || obj2 == null || ((C0630Iu) obj3).f2637d != obj2) {
                return null;
            } else {
                return CancellableContinuationImplKt.RESUME_TOKEN;
            }
        } while (!AbstractC13055p0.m23740a(f70578d, this, obj3, m27394p((NotCompleted) obj3, obj, this.resumeMode, function1, obj2)));
        m27404d();
        return CancellableContinuationImplKt.RESUME_TOKEN;
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        DispatchedContinuation dispatchedContinuation;
        Throwable tryReleaseClaimedContinuation;
        Continuation continuation = this.f70580a;
        if (continuation instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) continuation;
        } else {
            dispatchedContinuation = null;
        }
        if (dispatchedContinuation != null && (tryReleaseClaimedContinuation = dispatchedContinuation.tryReleaseClaimedContinuation(this)) != null) {
            detachChild$kotlinx_coroutines_core();
            cancel(tryReleaseClaimedContinuation);
        }
    }

    @JvmName(name = "resetStateReusable")
    public final boolean resetStateReusable() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70578d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C0630Iu) && ((C0630Iu) obj).f2637d != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        f70577c.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C0712K1.f3087a);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T t, @Nullable Function1<? super Throwable, Unit> function1) {
        m27396n(t, this.resumeMode, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(@NotNull CoroutineDispatcher coroutineDispatcher, T t) {
        DispatchedContinuation dispatchedContinuation;
        int i;
        Continuation continuation = this.f70580a;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (continuation instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) continuation;
        } else {
            dispatchedContinuation = null;
        }
        if (dispatchedContinuation != null) {
            coroutineDispatcher2 = dispatchedContinuation.dispatcher;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.resumeMode;
        }
        m27395o(this, t, i, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Throwable th2) {
        DispatchedContinuation dispatchedContinuation;
        int i;
        Continuation continuation = this.f70580a;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (continuation instanceof DispatchedContinuation) {
            dispatchedContinuation = (DispatchedContinuation) continuation;
        } else {
            dispatchedContinuation = null;
        }
        CompletedExceptionally completedExceptionally = new CompletedExceptionally(th2, false, 2, null);
        if (dispatchedContinuation != null) {
            coroutineDispatcher2 = dispatchedContinuation.dispatcher;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.resumeMode;
        }
        m27395o(this, completedExceptionally, i, null, 4, null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        m27395o(this, CompletionStateKt.toState(obj, this), this.resumeMode, null, 4, null);
    }

    /* renamed from: s */
    public final boolean m27391s() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f70577c;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f70577c.compareAndSet(this, i, PKIFailureInfo.duplicateCertReq + (536870911 & i)));
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @NotNull
    public String toString() {
        return nameString() + CoreConstants.LEFT_PARENTHESIS_CHAR + DebugStringsKt.toDebugString(this.f70580a) + "){" + m27401i() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResume(T t, @Nullable Object obj) {
        return m27392r(t, obj, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResumeWithException(@NotNull Throwable th2) {
        return m27392r(new CompletedExceptionally(th2, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResume(T t, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        return m27392r(t, obj, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(@NotNull Function1<? super Throwable, Unit> function1) {
        m27399k(m27398l(function1));
    }
}
