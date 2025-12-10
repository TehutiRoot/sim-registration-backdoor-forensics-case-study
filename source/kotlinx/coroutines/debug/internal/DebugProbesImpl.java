package kotlinx.coroutines.debug.internal;

import _COROUTINE.ArtificialStackFrames;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.AbstractC11719c;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u00019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010$\u001a\u00020\u00042\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 H\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u00042\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 H\u0000¢\u0006\u0004\b%\u0010#J)\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\u0003J;\u00109\u001a\u00020\u0004*\u00020\u00072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000203022\n\u00107\u001a\u000605j\u0002`62\u0006\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\t*\u00020\u0001H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020-*\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b@\u0010\u001bJ%\u0010B\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0002¢\u0006\u0004\bB\u0010CJ5\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010D\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010E2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0002¢\u0006\u0004\bG\u0010HJ?\u0010M\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020I0L2\u0006\u0010J\u001a\u00020I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0002¢\u0006\u0004\bM\u0010NJ3\u0010P\u001a\u00020I2\u0006\u0010O\u001a\u00020I2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0002¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u00042\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u00042\u0006\u0010!\u001a\u00020T2\u0006\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010VJ\u0016\u0010W\u001a\u0004\u0018\u00010T*\u00020TH\u0082\u0010¢\u0006\u0004\bW\u0010XJ/\u0010Z\u001a\u00020\u00042\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030=2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\b\u0012\u0002\b\u0003\u0018\u00010=*\u0006\u0012\u0002\b\u00030 H\u0002¢\u0006\u0004\b\\\u0010]J\u001a\u0010^\u001a\b\u0012\u0002\b\u0003\u0018\u00010=*\u00020TH\u0082\u0010¢\u0006\u0004\b^\u0010_J\u0019\u0010a\u001a\u00020`*\b\u0012\u0004\u0012\u00020\u001c0\u0013H\u0002¢\u0006\u0004\ba\u0010bJ3\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\u0010!\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\bc\u0010dJ\u001b\u0010e\u001a\u00020\u00042\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030=H\u0002¢\u0006\u0004\be\u0010fJ'\u0010i\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013\"\b\b\u0000\u0010'*\u00020g2\u0006\u0010h\u001a\u00028\u0000H\u0002¢\u0006\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010kR\u0014\u0010o\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010pR$\u0010t\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030=\u0012\u0004\u0012\u00020-0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010sR\"\u0010z\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010}\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010u\u001a\u0004\b{\u0010w\"\u0004\b|\u0010yR#\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u0002030r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010sR\u0016\u0010\u0084\u0001\u001a\u00020-8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010wR!\u0010\u0087\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030=0\u0085\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b~\u0010\u0086\u0001R\"\u0010\u008a\u0001\u001a\u00020\t*\u00020\u00078BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0005\b\u0081\u0001\u0010\u000bR\u001b\u0010\u008d\u0001\u001a\u00020-*\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\r\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004R\r\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¨\u0006\u0092\u0001"}, m28850d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "<init>", "()V", "", "install", "uninstall", "Lkotlinx/coroutines/Job;", "job", "", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "info", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "", "dumpCoroutinesInfo", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "Ljava/io/PrintStream;", "out", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "Lkotlin/coroutines/Continuation;", TypedValues.AttributesType.S_FRAME, "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "T", "completion", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "Lkotlin/Function1;", "", "i", "()Lkotlin/jvm/functions/Function1;", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_AND_STROKE, "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "u", "(Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", OperatorName.SET_LINE_JOINSTYLE, "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)Z", OperatorName.CURVE_TO, "frames", OperatorName.ENDPATH, "(Ljava/io/PrintStream;Ljava/util/List;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "Ljava/lang/Thread;", "thread", "d", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "actualTrace", "Lkotlin/Pair;", "e", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", OperatorName.FILL_NON_ZERO, "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", OperatorName.SET_LINE_WIDTH, "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "p", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", Constant.REGISTER_LEVEL_OWNER, "x", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", OperatorName.LINE_TO, "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", OperatorName.MOVE_TO, "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "t", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "o", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)V", "", "throwable", OperatorName.SAVE, "(Ljava/lang/Throwable;)Ljava/util/List;", "Ljava/lang/StackTraceElement;", "ARTIFICIAL_FRAME", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "capturedCoroutinesMap", "Z", "getSanitizeStackTraces", "()Z", "setSanitizeStackTraces", "(Z)V", "sanitizeStackTraces", "getEnableCreationStackTraces", "setEnableCreationStackTraces", "enableCreationStackTraces", OperatorName.NON_STROKING_GRAY, "Lkotlin/jvm/functions/Function1;", "dynamicAttach", OperatorName.CLOSE_PATH, "callerInfoCache", "isInstalled$kotlinx_coroutines_core", "isInstalled", "", "()Ljava/util/Set;", "capturedCoroutines", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", OperatorName.NON_STROKING_CMYK, "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,609:1\n144#1:627\n145#1,4:629\n150#1,5:634\n144#1:639\n145#1,4:641\n150#1,5:646\n1#2:610\n1#2:628\n1#2:640\n766#3:611\n857#3,2:612\n1208#3,2:614\n1238#3,4:616\n1855#3,2:654\n350#3,7:662\n1819#3,8:669\n603#4:620\n603#4:633\n603#4:645\n603#4:651\n1295#4,2:652\n37#5,2:621\n37#5,2:623\n37#5,2:625\n1627#6,6:656\n1735#6,6:677\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n238#1:627\n238#1:629,4\n238#1:634,5\n245#1:639\n245#1:641,4\n245#1:646,5\n238#1:628\n245#1:640\n104#1:611\n104#1:612,2\n105#1:614,2\n105#1:616,4\n299#1:654,2\n408#1:662,7\n496#1:669,8\n148#1:620\n238#1:633\n245#1:645\n279#1:651\n280#1:652,2\n204#1:621,2\n205#1:623,2\n206#1:625,2\n347#1:656,6\n547#1:677,6\n*E\n"})
/* loaded from: classes6.dex */
public final class DebugProbesImpl {
    @NotNull
    public static final DebugProbesImpl INSTANCE;

    /* renamed from: a */
    public static final StackTraceElement f70739a;

    /* renamed from: b */
    public static final SimpleDateFormat f70740b;

    /* renamed from: c */
    public static Thread f70741c;

    /* renamed from: d */
    public static final ConcurrentWeakMap f70742d;

    /* renamed from: e */
    public static boolean f70743e;

    /* renamed from: f */
    public static boolean f70744f;

    /* renamed from: g */
    public static final Function1 f70745g;

    /* renamed from: h */
    public static final ConcurrentWeakMap f70746h;

    /* renamed from: i */
    public static final C12054b f70747i;

    /* renamed from: j */
    public static final C12055c f70748j;

    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$a */
    /* loaded from: classes6.dex */
    public static final class C12053a implements Continuation, CoroutineStackFrame {

        /* renamed from: a */
        public final Continuation f70749a;

        /* renamed from: b */
        public final DebugCoroutineInfoImpl f70750b;

        public C12053a(Continuation continuation, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.f70749a = continuation;
            this.f70750b = debugCoroutineInfoImpl;
        }

        /* renamed from: a */
        public final StackTraceFrame m27077a() {
            return this.f70750b.getCreationStackBottom();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame m27077a = m27077a();
            if (m27077a != null) {
                return m27077a.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f70749a.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame m27077a = m27077a();
            if (m27077a != null) {
                return m27077a.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            DebugProbesImpl.INSTANCE.m27087o(this);
            this.f70749a.resumeWith(obj);
        }

        public String toString() {
            return this.f70749a.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$b */
    /* loaded from: classes6.dex */
    public static final class C12054b {

        /* renamed from: a */
        public static final AtomicIntegerFieldUpdater f70751a = AtomicIntegerFieldUpdater.newUpdater(C12054b.class, "installations");
        @Volatile
        private volatile int installations;

        public C12054b() {
        }

        public /* synthetic */ C12054b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.DebugProbesImpl$c */
    /* loaded from: classes6.dex */
    public static final class C12055c {

        /* renamed from: a */
        public static final AtomicLongFieldUpdater f70752a = AtomicLongFieldUpdater.newUpdater(C12055c.class, "sequenceNumber");
        @Volatile
        private volatile long sequenceNumber;

        public C12055c() {
        }

        public /* synthetic */ C12055c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        f70739a = new ArtificialStackFrames().coroutineCreation();
        f70740b = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f70742d = new ConcurrentWeakMap(false, 1, null);
        f70743e = true;
        f70744f = true;
        f70745g = debugProbesImpl.m27093i();
        f70746h = new ConcurrentWeakMap(true);
        f70747i = new C12054b(null);
        f70748j = new C12055c(null);
    }

    /* renamed from: a */
    public final void m27101a(Job job, Map map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = (DebugCoroutineInfoImpl) map.get(job);
        if (debugCoroutineInfoImpl == null) {
            if (!(job instanceof ScopeCoroutine)) {
                sb.append(str + m27094h(job) + '\n');
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('\t');
                str = sb2.toString();
            }
        } else {
            String state = debugCoroutineInfoImpl.getState();
            sb.append(str + m27094h(job) + ", continuation is " + state + " at line " + ((StackTraceElement) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) debugCoroutineInfoImpl.lastObservedStackTrace())) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        for (Job job2 : job.getChildren()) {
            m27101a(job2, map, sb, str);
        }
    }

    /* renamed from: b */
    public final Continuation m27100b(Continuation continuation, StackTraceFrame stackTraceFrame) {
        if (!isInstalled$kotlinx_coroutines_core()) {
            return continuation;
        }
        C12053a c12053a = new C12053a(continuation, new DebugCoroutineInfoImpl(continuation.getContext(), stackTraceFrame, C12055c.f70752a.incrementAndGet(f70748j)));
        ConcurrentWeakMap concurrentWeakMap = f70742d;
        concurrentWeakMap.put(c12053a, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_core()) {
            concurrentWeakMap.clear();
        }
        return c12053a;
    }

    /* renamed from: c */
    public final void m27099c(PrintStream printStream) {
        String state;
        if (isInstalled$kotlinx_coroutines_core()) {
            printStream.print("Coroutines dump " + f70740b.format(Long.valueOf(System.currentTimeMillis())));
            for (C12053a c12053a : SequencesKt___SequencesKt.sortedWith(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(m27095g()), DebugProbesImpl$dumpCoroutinesSynchronized$2.INSTANCE), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC16857uu.compareValues(Long.valueOf(((DebugProbesImpl.C12053a) t).f70750b.sequenceNumber), Long.valueOf(((DebugProbesImpl.C12053a) t2).f70750b.sequenceNumber));
                }
            })) {
                DebugCoroutineInfoImpl debugCoroutineInfoImpl = c12053a.f70750b;
                List lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace();
                DebugProbesImpl debugProbesImpl = INSTANCE;
                List m27098d = debugProbesImpl.m27098d(debugCoroutineInfoImpl.getState(), debugCoroutineInfoImpl.lastObservedThread, lastObservedStackTrace);
                if (Intrinsics.areEqual(debugCoroutineInfoImpl.getState(), DebugCoroutineInfoImplKt.RUNNING) && m27098d == lastObservedStackTrace) {
                    state = debugCoroutineInfoImpl.getState() + " (Last suspension stacktrace, not an actual stacktrace)";
                } else {
                    state = debugCoroutineInfoImpl.getState();
                }
                printStream.print("\n\nCoroutine " + c12053a.f70749a + ", state: " + state);
                if (lastObservedStackTrace.isEmpty()) {
                    printStream.print("\n\tat " + f70739a);
                    debugProbesImpl.m27088n(printStream, debugCoroutineInfoImpl.getCreationStackTrace());
                } else {
                    debugProbesImpl.m27088n(printStream, m27098d);
                }
            }
            return;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    /* renamed from: d */
    public final List m27098d(String str, Thread thread, List list) {
        Object m74087constructorimpl;
        if (Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) && thread != null) {
            try {
                Result.Companion companion = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(thread.getStackTrace());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m74093isFailureimpl(m74087constructorimpl)) {
                m74087constructorimpl = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m74087constructorimpl;
            if (stackTraceElementArr == null) {
                return list;
            }
            int length = stackTraceElementArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (Intrinsics.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Pair m27097e = m27097e(i, stackTraceElementArr, list);
            int intValue = ((Number) m27097e.component1()).intValue();
            int intValue2 = ((Number) m27097e.component2()).intValue();
            if (intValue == -1) {
                return list;
            }
            ArrayList arrayList = new ArrayList((((list.size() + i) - intValue) - 1) - intValue2);
            int i2 = i - intValue2;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(stackTraceElementArr[i3]);
            }
            int size = list.size();
            for (int i4 = intValue + 1; i4 < size; i4++) {
                arrayList.add(list.get(i4));
            }
            return arrayList;
        }
        return list;
    }

    public final void dumpCoroutines(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            INSTANCE.m27099c(printStream);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_core()) {
            return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.sortedWith(CollectionsKt___CollectionsKt.asSequence(m27095g()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new C12056x49f1cbae()));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    @NotNull
    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String str;
        String str2;
        String name;
        List<DebugCoroutineInfo> dumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = dumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : dumpCoroutinesInfo) {
            CoroutineContext context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.Key);
            Long l = null;
            if (coroutineName != null && (name = coroutineName.getName()) != null) {
                str = m27081u(name);
            } else {
                str = null;
            }
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
            if (coroutineDispatcher != null) {
                str2 = m27081u(coroutineDispatcher);
            } else {
                str2 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(str);
            sb.append(",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.Key);
            if (coroutineId != null) {
                l = Long.valueOf(coroutineId.getId());
            }
            sb.append(l);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(str2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(debugCoroutineInfo.getSequenceNumber());
            sb.append(",\n                    \"state\": \"");
            sb.append(debugCoroutineInfo.getState());
            sb.append("\"\n                } \n                ");
            arrayList3.add(StringsKt__IndentKt.trimIndent(sb.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{AbstractJsonLexerKt.BEGIN_LIST + CollectionsKt___CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST, arrayList.toArray(new Thread[0]), arrayList2.toArray(new CoroutineStackFrame[0]), dumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    @NotNull
    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_core()) {
            return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.sortedWith(CollectionsKt___CollectionsKt.asSequence(m27095g()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new C12057xee7de334()));
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    /* renamed from: e */
    public final Pair m27097e(int i, StackTraceElement[] stackTraceElementArr, List list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int m27096f = INSTANCE.m27096f((i - 1) - i2, stackTraceElementArr, list);
            if (m27096f != -1) {
                return TuplesKt.m28844to(Integer.valueOf(m27096f), Integer.valueOf(i2));
            }
        }
        return TuplesKt.m28844to(-1, 0);
    }

    @NotNull
    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(@NotNull DebugCoroutineInfo debugCoroutineInfo, @NotNull List<StackTraceElement> list) {
        return m27098d(debugCoroutineInfo.getState(), debugCoroutineInfo.getLastObservedThread(), list);
    }

    @NotNull
    public final String enhanceStackTraceWithThreadDumpAsJson(@NotNull DebugCoroutineInfo debugCoroutineInfo) {
        String str;
        List<StackTraceElement> enhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(debugCoroutineInfo, debugCoroutineInfo.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : enhanceStackTraceWithThreadDump) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            if (fileName != null) {
                str = m27081u(fileName);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(StringsKt__IndentKt.trimIndent(sb.toString()));
        }
        return AbstractJsonLexerKt.BEGIN_LIST + CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST;
    }

    /* renamed from: f */
    public final int m27096f(int i, StackTraceElement[] stackTraceElementArr, List list) {
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.getOrNull(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            StackTraceElement stackTraceElement2 = (StackTraceElement) it.next();
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: g */
    public final Set m27095g() {
        return f70742d.keySet();
    }

    public final boolean getEnableCreationStackTraces() {
        return f70744f;
    }

    public final boolean getSanitizeStackTraces() {
        return f70743e;
    }

    /* renamed from: h */
    public final String m27094h(Job job) {
        if (job instanceof JobSupport) {
            return ((JobSupport) job).toDebugString();
        }
        return job.toString();
    }

    @NotNull
    public final String hierarchyToString(@NotNull Job job) {
        if (isInstalled$kotlinx_coroutines_core()) {
            ArrayList<C12053a> arrayList = new ArrayList();
            for (Object obj : m27095g()) {
                if (((C12053a) obj).f70749a.getContext().get(Job.Key) != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11719c.coerceAtLeast(AbstractC18515Tn0.mapCapacity(AbstractC10176es.collectionSizeOrDefault(arrayList, 10)), 16));
            for (C12053a c12053a : arrayList) {
                linkedHashMap.put(JobKt.getJob(c12053a.f70749a.getContext()), c12053a.f70750b);
            }
            StringBuilder sb = new StringBuilder();
            INSTANCE.m27101a(job, linkedHashMap, sb, "");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    /* renamed from: i */
    public final Function1 m27093i() {
        Object m74087constructorimpl;
        Function1 function1 = null;
        try {
            Result.Companion companion = Result.Companion;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            m74087constructorimpl = Result.m74087constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m74093isFailureimpl(m74087constructorimpl)) {
            function1 = m74087constructorimpl;
        }
        return function1;
    }

    public final void install() {
        Function1 function1;
        if (C12054b.f70751a.incrementAndGet(f70747i) > 1) {
            return;
        }
        m27084r();
        if (!AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() && (function1 = f70745g) != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public final boolean isInstalled$kotlinx_coroutines_core() {
        return C12054b.f70751a.get(f70747i) > 0;
    }

    /* renamed from: j */
    public final boolean m27092j(C12053a c12053a) {
        Job job;
        CoroutineContext context = c12053a.f70750b.getContext();
        if (context == null || (job = (Job) context.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        f70742d.remove(c12053a);
        return true;
    }

    /* renamed from: k */
    public final boolean m27091k(StackTraceElement stackTraceElement) {
        return AbstractC20204hN1.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    /* renamed from: l */
    public final C12053a m27090l(Continuation continuation) {
        CoroutineStackFrame coroutineStackFrame;
        if (continuation instanceof CoroutineStackFrame) {
            coroutineStackFrame = (CoroutineStackFrame) continuation;
        } else {
            coroutineStackFrame = null;
        }
        if (coroutineStackFrame == null) {
            return null;
        }
        return m27089m(coroutineStackFrame);
    }

    /* renamed from: m */
    public final C12053a m27089m(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C12053a)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (C12053a) coroutineStackFrame;
    }

    /* renamed from: n */
    public final void m27088n(PrintStream printStream, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* renamed from: o */
    public final void m27087o(C12053a c12053a) {
        CoroutineStackFrame m27086p;
        f70742d.remove(c12053a);
        CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = c12053a.f70750b.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core != null && (m27086p = m27086p(lastObservedFrame$kotlinx_coroutines_core)) != null) {
            f70746h.remove(m27086p);
        }
    }

    /* renamed from: p */
    public final CoroutineStackFrame m27086p(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(@NotNull Continuation<? super T> continuation) {
        StackTraceFrame stackTraceFrame;
        if (!isInstalled$kotlinx_coroutines_core()) {
            return continuation;
        }
        if (m27090l(continuation) != null) {
            return continuation;
        }
        if (f70744f) {
            stackTraceFrame = m27082t(m27085q(new Exception()));
        } else {
            stackTraceFrame = null;
        }
        return m27100b(continuation, stackTraceFrame);
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(@NotNull Continuation<?> continuation) {
        m27079w(continuation, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(@NotNull Continuation<?> continuation) {
        m27079w(continuation, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    /* renamed from: q */
    public final List m27085q(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        int i3 = i + 1;
        if (!f70743e) {
            int i4 = length - i3;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (m27091k(stackTrace[i3])) {
                arrayList2.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && m27091k(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList2.add(stackTrace[i8]);
                }
                arrayList2.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    /* renamed from: r */
    public final void m27084r() {
        f70741c = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, DebugProbesImpl$startWeakRefCleanerThread$1.INSTANCE, 21, null);
    }

    /* renamed from: s */
    public final void m27083s() {
        Thread thread = f70741c;
        if (thread == null) {
            return;
        }
        f70741c = null;
        thread.interrupt();
        thread.join();
    }

    public final void setEnableCreationStackTraces(boolean z) {
        f70744f = z;
    }

    public final void setSanitizeStackTraces(boolean z) {
        f70743e = z;
    }

    /* renamed from: t */
    public final StackTraceFrame m27082t(List list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, (StackTraceElement) listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, f70739a);
    }

    /* renamed from: u */
    public final String m27081u(Object obj) {
        String m27074a;
        m27074a = DebugProbesImplKt.m27074a(obj.toString());
        return m27074a;
    }

    public final void uninstall() {
        Function1 function1;
        if (isInstalled$kotlinx_coroutines_core()) {
            if (C12054b.f70751a.decrementAndGet(f70747i) != 0) {
                return;
            }
            m27083s();
            f70742d.clear();
            f70746h.clear();
            if (!AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() && (function1 = f70745g) != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        throw new IllegalStateException("Agent was not installed".toString());
    }

    /* renamed from: v */
    public final void m27080v(CoroutineStackFrame coroutineStackFrame, String str) {
        CoroutineStackFrame coroutineStackFrame2;
        boolean z;
        if (!isInstalled$kotlinx_coroutines_core()) {
            return;
        }
        ConcurrentWeakMap concurrentWeakMap = f70746h;
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = (DebugCoroutineInfoImpl) concurrentWeakMap.remove(coroutineStackFrame);
        if (debugCoroutineInfoImpl != null) {
            z = false;
        } else {
            C12053a m27089m = m27089m(coroutineStackFrame);
            if (m27089m != null && (debugCoroutineInfoImpl = m27089m.f70750b) != null) {
                CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImpl.getLastObservedFrame$kotlinx_coroutines_core();
                if (lastObservedFrame$kotlinx_coroutines_core != null) {
                    coroutineStackFrame2 = m27086p(lastObservedFrame$kotlinx_coroutines_core);
                } else {
                    coroutineStackFrame2 = null;
                }
                if (coroutineStackFrame2 != null) {
                    concurrentWeakMap.remove(coroutineStackFrame2);
                }
                z = true;
            } else {
                return;
            }
        }
        Intrinsics.checkNotNull(coroutineStackFrame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
        debugCoroutineInfoImpl.updateState$kotlinx_coroutines_core(str, (Continuation) coroutineStackFrame, z);
        CoroutineStackFrame m27086p = m27086p(coroutineStackFrame);
        if (m27086p == null) {
            return;
        }
        concurrentWeakMap.put(m27086p, debugCoroutineInfoImpl);
    }

    /* renamed from: w */
    public final void m27079w(Continuation continuation, String str) {
        CoroutineStackFrame coroutineStackFrame;
        if (!isInstalled$kotlinx_coroutines_core()) {
            return;
        }
        if (Intrinsics.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) && KotlinVersion.CURRENT.isAtLeast(1, 3, 30)) {
            if (continuation instanceof CoroutineStackFrame) {
                coroutineStackFrame = (CoroutineStackFrame) continuation;
            } else {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null) {
                return;
            }
            m27080v(coroutineStackFrame, str);
            return;
        }
        C12053a m27090l = m27090l(continuation);
        if (m27090l == null) {
            return;
        }
        m27078x(m27090l, continuation, str);
    }

    /* renamed from: x */
    public final void m27078x(C12053a c12053a, Continuation continuation, String str) {
        if (!isInstalled$kotlinx_coroutines_core()) {
            return;
        }
        c12053a.f70750b.updateState$kotlinx_coroutines_core(str, continuation, true);
    }
}
