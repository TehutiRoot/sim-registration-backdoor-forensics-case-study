package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import _COROUTINE.CoroutineDebuggingKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000^\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0007\u001a-\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0006\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u00150\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u00152\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010\u0004\u001a!\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b \u0010\u0004\u001a%\u0010!\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e2\n\u0010\u0006\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020#*\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b$\u0010%\u001a%\u0010)\u001a\u00020(*\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010+\u001a\u00020#*\u00060\u000fj\u0002`\u00102\n\u0010)\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010-\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b-\u0010.\"\u0014\u00100\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010/\"\u001c\u00103\u001a\n 1*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102\"\u001c\u00104\u001a\n 1*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00102*\f\b\u0000\u00105\"\u00020\b2\u00020\b*\f\b\u0000\u00106\"\u00020\u000f2\u00020\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m28850d2 = {"", ExifInterface.LONGITUDE_EAST, "exception", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "continuation", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", OperatorName.NON_STROKING_GRAY, "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lkotlin/Pair;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Throwable;)Lkotlin/Pair;", "recoveredStacktrace", "", OperatorName.FILL_NON_ZERO, "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "recoverAndThrow", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", OperatorName.CURVE_TO, "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/util/ArrayDeque;", "", "isArtificial", "(Ljava/lang/StackTraceElement;)Z", "", "methodName", "", "e", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "d", "(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z", "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1735#2,6:215\n12744#2,2:223\n1627#2,6:227\n12744#2,2:233\n1627#2,6:236\n37#3,2:221\n26#4:225\n26#4:226\n1#5:235\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:215,6\n131#1:223,2\n141#1:227,6\n171#1:233,2\n192#1:236,6\n106#1:221,2\n133#1:225\n135#1:226\n*E\n"})
/* loaded from: classes6.dex */
public final class StackTraceRecoveryKt {

    /* renamed from: a */
    public static final StackTraceElement f71021a = new ArtificialStackFrames().coroutineBoundary();

    /* renamed from: b */
    public static final String f71022b;

    /* renamed from: c */
    public static final String f71023c;

    static {
        Object m74087constructorimpl;
        Object m74087constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m74090exceptionOrNullimpl(m74087constructorimpl) != null) {
            m74087constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f71022b = (String) m74087constructorimpl;
        try {
            m74087constructorimpl2 = Result.m74087constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.Companion;
            m74087constructorimpl2 = Result.m74087constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m74090exceptionOrNullimpl(m74087constructorimpl2) != null) {
            m74087constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f71023c = (String) m74087constructorimpl2;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    /* renamed from: a */
    public static final Pair m26829a(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause != null && Intrinsics.areEqual(cause.getClass(), th2.getClass())) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (isArtificial(stackTraceElement)) {
                    return TuplesKt.m28844to(cause, stackTrace);
                }
            }
            return TuplesKt.m28844to(th2, new StackTraceElement[0]);
        }
        return TuplesKt.m28844to(th2, new StackTraceElement[0]);
    }

    /* renamed from: b */
    public static final Throwable m26828b(Throwable th2, Throwable th3, ArrayDeque arrayDeque) {
        arrayDeque.addFirst(f71021a);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int m26825e = m26825e(stackTrace, f71022b);
        int i = 0;
        if (m26825e == -1) {
            th3.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return th3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + m26825e];
        for (int i2 = 0; i2 < m26825e; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i3 = i + 1;
            stackTraceElementArr[i + m26825e] = (StackTraceElement) it.next();
            i = i3;
        }
        th3.setStackTrace(stackTraceElementArr);
        return th3;
    }

    /* renamed from: c */
    public static final ArrayDeque m26827c(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: d */
    public static final boolean m26826d(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final int m26825e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static final void m26824f(StackTraceElement[] stackTraceElementArr, ArrayDeque arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (isArtificial(stackTraceElementArr[i])) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (m26826d(stackTraceElementArr[length2], (StackTraceElement) arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 != i2) {
                length2--;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public static final Throwable m26823g(Throwable th2, CoroutineStackFrame coroutineStackFrame) {
        Pair m26829a = m26829a(th2);
        Throwable th3 = (Throwable) m26829a.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m26829a.component2();
        Throwable tryCopyException = ExceptionsConstructorKt.tryCopyException(th3);
        if (tryCopyException == null) {
            return th2;
        }
        ArrayDeque m26827c = m26827c(coroutineStackFrame);
        if (m26827c.isEmpty()) {
            return th2;
        }
        if (th3 != th2) {
            m26824f(stackTraceElementArr, m26827c);
        }
        return m26828b(th3, tryCopyException, m26827c);
    }

    public static final void initCause(@NotNull Throwable th2, @NotNull Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean isArtificial(@NotNull StackTraceElement stackTraceElement) {
        return AbstractC20204hN1.startsWith$default(stackTraceElement.getClassName(), CoroutineDebuggingKt.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, null);
    }

    @NotNull
    public static final <E extends Throwable> E recoverStackTrace(@NotNull E e) {
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E unwrap(@NotNull E e) {
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E unwrapImpl(@NotNull E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && Intrinsics.areEqual(e2.getClass(), e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    @NotNull
    public static final <E extends Throwable> E recoverStackTrace(@NotNull E e, @NotNull Continuation<?> continuation) {
        return e;
    }

    @Nullable
    public static final Object recoverAndThrow(@NotNull Throwable th2, @NotNull Continuation<?> continuation) {
        throw th2;
    }
}
