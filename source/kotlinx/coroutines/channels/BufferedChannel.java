package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.primitives.Longs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bV\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002m~B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJì\u0001\u0010&\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182<\u0010 \u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00028\u00010\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00182h\b\u0002\u0010%\u001ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b($\u0012\u0004\u0012\u00028\u00010\"H\u0084\b¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u0012H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0014¢\u0006\u0004\b-\u0010,J\u0013\u0010.\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\"\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b0\u0010/J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020#H\u0004¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00062\u0006\u00108\u001a\u00020#H\u0000¢\u0006\u0004\b9\u00107J%\u0010=\u001a\u00020\u00062\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b=\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0014¢\u0006\u0004\bB\u0010,J\u0019\u0010E\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bG\u0010FJ\r\u0010G\u001a\u00020\u0006¢\u0006\u0004\bG\u0010,J\u001d\u0010G\u001a\u00020\u00062\u000e\u0010D\u001a\n\u0018\u00010Hj\u0004\u0018\u0001`I¢\u0006\u0004\bG\u0010JJ\u0019\u0010L\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010CH\u0010¢\u0006\u0004\bK\u0010FJ!\u0010M\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010G\u001a\u00020\u0012H\u0014¢\u0006\u0004\bM\u0010NJ4\u0010P\u001a\u00020\u00062#\u0010O\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010C¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(D\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020\u0012H\u0000¢\u0006\u0004\bR\u0010)J\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020TH\u0000¢\u0006\u0004\bW\u0010VJ\r\u0010Y\u001a\u00020\u0006¢\u0006\u0004\bY\u0010,J\u001b\u0010Z\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\bZ\u0010\rJ9\u0010]\u001a\u00020\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0004\b]\u0010^J)\u0010`\u001a\u00020\u0006*\u00020_2\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u0003H\u0002¢\u0006\u0004\b`\u0010aJ%\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060bH\u0002¢\u0006\u0004\b\u0001\u0010dJG\u0010f\u001a\u00020\u00032\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010e\u001a\u00020\u0012H\u0002¢\u0006\u0004\bf\u0010gJG\u0010h\u001a\u00020\u00032\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010e\u001a\u00020\u0012H\u0002¢\u0006\u0004\bh\u0010gJ\u0017\u0010j\u001a\u00020\u00122\u0006\u0010i\u001a\u00020#H\u0003¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00122\u0006\u0010l\u001a\u00020#H\u0002¢\u0006\u0004\bm\u0010kJ\u001b\u0010n\u001a\u00020\u0012*\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\bn\u0010oJ1\u0010q\u001a\u00028\u00002\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010p\u001a\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ)\u0010s\u001a\u00020\u0006*\u00020_2\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u0003H\u0002¢\u0006\u0004\bs\u0010aJ\u001d\u0010t\u001a\u00020\u00062\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000bH\u0002¢\u0006\u0004\bt\u0010uJ@\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010p\u001a\u00020#H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bv\u0010rJ&\u0010w\u001a\u00020\u00062\u0012\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0bH\u0002ø\u0001\u0000¢\u0006\u0004\bw\u0010uJ9\u0010x\u001a\u0004\u0018\u00010\u00162\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010p\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bx\u0010yJ9\u0010z\u001a\u0004\u0018\u00010\u00162\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010p\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bz\u0010yJ)\u0010{\u001a\u00020\u0012*\u00020\u00162\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u0003H\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020\u0006H\u0002¢\u0006\u0004\b}\u0010,J.\u0010\u007f\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010~\u001a\u00020#H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J0\u0010\u0081\u0001\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010~\u001a\u00020#H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u001c\u0010\u0083\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0082\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b\u0083\u0001\u00107J&\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J*\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00062\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0005\b\u008a\u0001\u0010>J\u001e\u0010\u008b\u0001\u001a\u00020\u00062\n\u0010<\u001a\u0006\u0012\u0002\b\u00030;H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J*\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u0089\u0001J*\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u0089\u0001J*\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0089\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0090\u0001\u0010,J\u0011\u0010\u0091\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0091\u0001\u0010,J\u0011\u0010\u0092\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0092\u0001\u0010,J\u0011\u0010\u0093\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0093\u0001\u0010,J\u0011\u0010\u0094\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0094\u0001\u0010,J!\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0007\u0010\u0095\u0001\u001a\u00020#H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u00062\u0007\u0010\u0095\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b\u0098\u0001\u00107J\u0018\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J!\u0010\u009c\u0001\u001a\u00020#2\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J!\u0010\u009e\u0001\u001a\u00020\u00062\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J(\u0010~\u001a\u00020\u00062\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0007\u0010 \u0001\u001a\u00020#H\u0002¢\u0006\u0005\b~\u0010¡\u0001J\u0014\u0010\u0015\u001a\u00020\u0006*\u00020_H\u0002¢\u0006\u0005\b\u0015\u0010¢\u0001J\u0016\u0010£\u0001\u001a\u00020\u0006*\u00020_H\u0002¢\u0006\u0006\b£\u0001\u0010¢\u0001J\u001f\u0010¥\u0001\u001a\u00020\u0006*\u00020_2\u0007\u0010¤\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J$\u0010©\u0001\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020#2\u0007\u0010¨\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J0\u0010«\u0001\u001a\u00020\u00122\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\\\u001a\u00020\u00032\u0006\u00108\u001a\u00020#H\u0002¢\u0006\u0006\b«\u0001\u0010\u0080\u0001J2\u0010®\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b2\u0007\u0010¬\u0001\u001a\u00020#2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J0\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b2\u0007\u0010¬\u0001\u001a\u00020#2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0005\b\u001f\u0010¯\u0001J;\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b2\u0007\u0010¬\u0001\u001a\u00020#2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0007\u0010°\u0001\u001a\u00020#H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J*\u0010³\u0001\u001a\u00020\u00062\u0007\u0010¬\u0001\u001a\u00020#2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001a\u0010¶\u0001\u001a\u00020\u00062\u0007\u0010µ\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b¶\u0001\u00107J\u001a\u0010·\u0001\u001a\u00020\u00062\u0007\u0010µ\u0001\u001a\u00020#H\u0002¢\u0006\u0005\b·\u0001\u00107R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010\u008f\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\b\u0010¸\u0001R\u0082\u0001\u0010¿\u0001\u001ag\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030;¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(<\u0012\u0016\u0012\u0014\u0018\u00010\u0016¢\u0006\r\b\u001c\u0012\t\b\u001d\u0012\u0005\b\b(º\u0001\u0012\u0016\u0012\u0014\u0018\u00010\u0016¢\u0006\r\b\u001c\u0012\t\b\u001d\u0012\u0005\b\b(»\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010¹\u0001j\u0005\u0018\u0001`¼\u00018\u0002X\u0082\u0004¢\u0006\u000e\n\u0005\b~\u0010½\u0001\u0012\u0005\b¾\u0001\u0010,R\u0017\u0010 \u0001\u001a\u00020#8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0017\u0010Ã\u0001\u001a\u00020#8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Á\u0001R1\u0010È\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000Ä\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÇ\u0001\u0010,\u001a\u0006\bÅ\u0001\u0010Æ\u0001R%\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000É\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÌ\u0001\u0010,\u001a\u0006\bÊ\u0001\u0010Ë\u0001R.\u0010Ð\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0É\u00018VX\u0096\u0004ø\u0001\u0000¢\u0006\u000f\u0012\u0005\bÏ\u0001\u0010,\u001a\u0006\bÎ\u0001\u0010Ë\u0001R'\u0010Ó\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000É\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÒ\u0001\u0010,\u001a\u0006\bÑ\u0001\u0010Ë\u0001R\u0019\u0010Ö\u0001\u001a\u0004\u0018\u00010C8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0017\u0010Ø\u0001\u001a\u00020C8DX\u0084\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Õ\u0001R\u0016\u0010Ù\u0001\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010)R\u001d\u0010Ú\u0001\u001a\u00020\u00128VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÛ\u0001\u0010,\u001a\u0005\bÚ\u0001\u0010)R\u001d\u0010¨\u0001\u001a\u00020\u00128VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÜ\u0001\u0010,\u001a\u0005\b¨\u0001\u0010)R\u001d\u0010Ý\u0001\u001a\u00020\u00128VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÞ\u0001\u0010,\u001a\u0005\bÝ\u0001\u0010)R\u0017\u0010à\u0001\u001a\u00020#8BX\u0082\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010Á\u0001R\u0016\u0010â\u0001\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010)R\u0017\u0010ä\u0001\u001a\u00020C8BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010Õ\u0001R\u0019\u0010å\u0001\u001a\u00020\u0012*\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010kR\u0019\u0010æ\u0001\u001a\u00020\u0012*\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010kR\u0015\u0010è\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160ç\u00018\u0002X\u0082\u0004R\r\u0010ê\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004R\u0019\u0010ë\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0ç\u00018\u0002X\u0082\u0004R\u0015\u0010ì\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160ç\u00018\u0002X\u0082\u0004R\r\u0010í\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004R\u0019\u0010î\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0ç\u00018\u0002X\u0082\u0004R\r\u0010ï\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004R\u0019\u0010ð\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0ç\u00018\u0002X\u0082\u0004R\r\u0010ñ\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ò\u0001"}, m28850d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/Channel;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "R", "", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ChannelSegment;", "Lkotlin/ParameterName;", "name", "segm", "i", "onSuspend", "onClosed", "Lkotlin/Function4;", "", OperatorName.CLOSE_AND_STROKE, "onNoWaiterSuspend", "sendImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "shouldSendSuspend", "onReceiveEnqueued", "()V", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "globalCellIndex", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "(J)V", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "waitExpandBufferCompletion", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "onClosedIdempotent", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl$kotlinx_coroutines_core", "cancelImpl", "closeOrCancelImpl", "(Ljava/lang/Throwable;Z)Z", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "hasElements$kotlinx_coroutines_core", "hasElements", "", "toString", "()Ljava/lang/String;", "toStringDebug$kotlinx_coroutines_core", "toStringDebug", "checkSegmentStructureInvariants", "D", "segment", FirebaseAnalytics.Param.INDEX, "W", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Waiter;", OperatorName.STROKING_COLOR_GRAY, "(Lkotlinx/coroutines/Waiter;Lkotlinx/coroutines/channels/ChannelSegment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "closed", "e0", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "f0", "curSendersAndCloseStatus", "X", "(J)Z", "curSenders", PDPageLabelRange.STYLE_LETTERS_LOWER, "Y", "(Ljava/lang/Object;Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_ROMAN_LOWER, PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "A", "(Lkotlinx/coroutines/CancellableContinuation;)V", "N", "z", "c0", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLjava/lang/Object;)Ljava/lang/Object;", OperatorName.TYPE3_D0, "Z", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ChannelSegment;I)Z", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "a0", "(Lkotlinx/coroutines/channels/ChannelSegment;IJ)Z", "b0", "nAttempts", OperatorName.MOVE_TO, "C", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "ignoredParam", "selectResult", "K", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "P", "B", "(Lkotlinx/coroutines/selects/SelectInstance;)V", "H", OperatorName.SET_LINE_CAPSTYLE, "I", "o", "x", OperatorName.SET_LINE_WIDTH, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.FILL_NON_ZERO, "sendersCur", "e", "(J)Lkotlinx/coroutines/channels/ChannelSegment;", "d", OperatorName.CURVE_TO, "()Lkotlinx/coroutines/channels/ChannelSegment;", "lastSegment", "u", "(Lkotlinx/coroutines/channels/ChannelSegment;)J", OperatorName.RESTORE, "(Lkotlinx/coroutines/channels/ChannelSegment;)V", "sendersCounter", "(Lkotlinx/coroutines/channels/ChannelSegment;J)V", "(Lkotlinx/coroutines/Waiter;)V", "S", "receiver", "T", "(Lkotlinx/coroutines/Waiter;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", OperatorName.SAVE, "(JZ)Z", "p", "id", "startFrom", OperatorName.SET_LINE_JOINSTYLE, "(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", "currentBufferEndCounter", OperatorName.CLOSE_PATH, "(JLkotlinx/coroutines/channels/ChannelSegment;J)Lkotlinx/coroutines/channels/ChannelSegment;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(JLkotlinx/coroutines/channels/ChannelSegment;)V", "value", "h0", "g0", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lkotlin/jvm/functions/Function3;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "getSendersCounter$kotlinx_coroutines_core", "()J", "getReceiversCounter$kotlinx_coroutines_core", "receiversCounter", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "onSend", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "onReceive", "getOnReceiveCatching", "getOnReceiveCatching$annotations", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "getCloseCause", "()Ljava/lang/Throwable;", "closeCause", "getSendException", "sendException", "isConflatedDropOldest", "isClosedForSend", "isClosedForSend$annotations", "isClosedForReceive$annotations", "isEmpty", "isEmpty$annotations", OperatorName.NON_STROKING_CMYK, "bufferEndCounter", "t", "isRendezvousOrUnlimited", OperatorName.LINE_TO, "receiveException", "isClosedForSend0", "isClosedForReceive0", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n218#5:3142\n219#5:3145\n218#5:3146\n219#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* loaded from: classes6.dex */
public class BufferedChannel<E> implements Channel<E> {

    /* renamed from: c */
    public static final AtomicLongFieldUpdater f70657c = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus");

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f70658d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers");

    /* renamed from: e */
    public static final AtomicLongFieldUpdater f70659e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd");

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f70660f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f70661g = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment");

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f70662h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment");

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f70663i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment");

    /* renamed from: j */
    public static final AtomicReferenceFieldUpdater f70664j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause");

    /* renamed from: k */
    public static final AtomicReferenceFieldUpdater f70665k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler");
    @Volatile
    @Nullable
    private volatile Object _closeCause;

    /* renamed from: a */
    public final int f70666a;

    /* renamed from: b */
    public final Function3 f70667b;
    @Volatile
    private volatile long bufferEnd;
    @Volatile
    @Nullable
    private volatile Object bufferEndSegment;
    @Volatile
    @Nullable
    private volatile Object closeHandler;
    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    @JvmField
    @Nullable
    public final Function1<E, Unit> onUndeliveredElement;
    @Volatile
    @Nullable
    private volatile Object receiveSegment;
    @Volatile
    private volatile long receivers;
    @Volatile
    @Nullable
    private volatile Object sendSegment;
    @Volatile
    private volatile long sendersAndCloseStatus;

    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    /* loaded from: classes6.dex */
    public final class C12043a implements ChannelIterator, Waiter {

        /* renamed from: a */
        public Object f70668a;

        /* renamed from: b */
        public CancellableContinuationImpl f70669b;

        public C12043a() {
            Symbol symbol;
            symbol = BufferedChannelKt.f70686n;
            this.f70668a = symbol;
        }

        /* renamed from: d */
        public final Object m27217d(ChannelSegment channelSegment, int i, long j, Continuation continuation) {
            Symbol symbol;
            Symbol symbol2;
            Boolean boxBoolean;
            Symbol symbol3;
            Symbol symbol4;
            Symbol symbol5;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
            try {
                this.f70669b = orCreateCancellableContinuation;
                Object m27249c0 = bufferedChannel.m27249c0(channelSegment, i, j, this);
                symbol = BufferedChannelKt.f70683k;
                if (m27249c0 == symbol) {
                    bufferedChannel.m27275F(this, channelSegment, i);
                } else {
                    symbol2 = BufferedChannelKt.f70685m;
                    Function1<Throwable, Unit> function1 = null;
                    if (m27249c0 == symbol2) {
                        if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.f70662h.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                m27215f();
                                break;
                            }
                            long andIncrement = BufferedChannel.f70658d.getAndIncrement(bufferedChannel);
                            int i2 = BufferedChannelKt.SEGMENT_SIZE;
                            long j2 = andIncrement / i2;
                            int i3 = (int) (andIncrement % i2);
                            if (channelSegment2.f71019id != j2) {
                                ChannelSegment m27238i = bufferedChannel.m27238i(j2, channelSegment2);
                                if (m27238i != null) {
                                    channelSegment2 = m27238i;
                                }
                            }
                            Object m27249c02 = bufferedChannel.m27249c0(channelSegment2, i3, andIncrement, this);
                            symbol3 = BufferedChannelKt.f70683k;
                            if (m27249c02 == symbol3) {
                                bufferedChannel.m27275F(this, channelSegment2, i3);
                                break;
                            }
                            symbol4 = BufferedChannelKt.f70685m;
                            if (m27249c02 != symbol4) {
                                symbol5 = BufferedChannelKt.f70684l;
                                if (m27249c02 != symbol5) {
                                    channelSegment2.cleanPrev();
                                    this.f70668a = m27249c02;
                                    this.f70669b = null;
                                    boxBoolean = Boxing.boxBoolean(true);
                                    Function1<E, Unit> function12 = bufferedChannel.onUndeliveredElement;
                                    if (function12 != null) {
                                        function1 = OnUndeliveredElementKt.bindCancellationFun(function12, m27249c02, orCreateCancellableContinuation.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.f70668a = m27249c0;
                        this.f70669b = null;
                        boxBoolean = Boxing.boxBoolean(true);
                        Function1<E, Unit> function13 = bufferedChannel.onUndeliveredElement;
                        if (function13 != null) {
                            function1 = OnUndeliveredElementKt.bindCancellationFun(function13, m27249c0, orCreateCancellableContinuation.getContext());
                        }
                    }
                    orCreateCancellableContinuation.resume(boxBoolean, function1);
                }
                Object result = orCreateCancellableContinuation.getResult();
                if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Throwable th2) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th2;
            }
        }

        /* renamed from: e */
        public final boolean m27216e() {
            this.f70668a = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* renamed from: f */
        public final void m27215f() {
            CancellableContinuationImpl cancellableContinuationImpl = this.f70669b;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.f70669b = null;
            this.f70668a = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Boolean.FALSE));
                return;
            }
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(closeCause)));
        }

        /* renamed from: g */
        public final boolean m27214g(Object obj) {
            boolean m27207e;
            CancellableContinuationImpl cancellableContinuationImpl = this.f70669b;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            Function1<Throwable, Unit> function1 = null;
            this.f70669b = null;
            this.f70668a = obj;
            Boolean bool = Boolean.TRUE;
            Function1<E, Unit> function12 = BufferedChannel.this.onUndeliveredElement;
            if (function12 != null) {
                function1 = OnUndeliveredElementKt.bindCancellationFun(function12, obj, cancellableContinuationImpl.getContext());
            }
            m27207e = BufferedChannelKt.m27207e(cancellableContinuationImpl, bool, function1);
            return m27207e;
        }

        /* renamed from: h */
        public final void m27213h() {
            CancellableContinuationImpl cancellableContinuationImpl = this.f70669b;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.f70669b = null;
            this.f70668a = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Boolean.FALSE));
                return;
            }
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(closeCause)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation continuation) {
            ChannelSegment channelSegment;
            Symbol symbol;
            Symbol symbol2;
            Symbol symbol3;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.f70662h.get(bufferedChannel);
            while (!bufferedChannel.isClosedForReceive()) {
                long andIncrement = BufferedChannel.f70658d.getAndIncrement(bufferedChannel);
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j = andIncrement / i;
                int i2 = (int) (andIncrement % i);
                if (channelSegment2.f71019id != j) {
                    ChannelSegment m27238i = bufferedChannel.m27238i(j, channelSegment2);
                    if (m27238i == null) {
                        continue;
                    } else {
                        channelSegment = m27238i;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object m27249c0 = bufferedChannel.m27249c0(channelSegment, i2, andIncrement, null);
                symbol = BufferedChannelKt.f70683k;
                if (m27249c0 != symbol) {
                    symbol2 = BufferedChannelKt.f70685m;
                    if (m27249c0 != symbol2) {
                        symbol3 = BufferedChannelKt.f70684l;
                        if (m27249c0 == symbol3) {
                            return m27217d(channelSegment, i2, andIncrement, continuation);
                        }
                        channelSegment.cleanPrev();
                        this.f70668a = m27249c0;
                        return Boxing.boxBoolean(true);
                    }
                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return Boxing.boxBoolean(m27216e());
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment segment, int i) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f70669b;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public /* synthetic */ Object next(Continuation continuation) {
            return ChannelIterator.DefaultImpls.next(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object next() {
            Symbol symbol;
            Symbol symbol2;
            Object obj = this.f70668a;
            symbol = BufferedChannelKt.f70686n;
            if (obj != symbol) {
                symbol2 = BufferedChannelKt.f70686n;
                this.f70668a = symbol2;
                if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
                    return obj;
                }
                throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.m27235l());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$b */
    /* loaded from: classes6.dex */
    public static final class C12044b implements Waiter {

        /* renamed from: a */
        public final CancellableContinuation f70671a;

        /* renamed from: b */
        public final /* synthetic */ CancellableContinuationImpl f70672b;

        public C12044b(CancellableContinuation cancellableContinuation) {
            this.f70671a = cancellableContinuation;
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f70672b = (CancellableContinuationImpl) cancellableContinuation;
        }

        /* renamed from: a */
        public final CancellableContinuation m27212a() {
            return this.f70671a;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment segment, int i) {
            this.f70672b.invokeOnCancellation(segment, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, @Nullable Function1<? super E, Unit> function1) {
        long m27208d;
        Symbol symbol;
        this.f70666a = i;
        this.onUndeliveredElement = function1;
        if (i >= 0) {
            m27208d = BufferedChannelKt.m27208d(i);
            this.bufferEnd = m27208d;
            this.completedExpandBuffersAndPauseFlag = m27236k();
            ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
            this.sendSegment = channelSegment;
            this.receiveSegment = channelSegment;
            if (m27227t()) {
                channelSegment = BufferedChannelKt.f70673a;
                Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = channelSegment;
            this.f70667b = function1 != 0 ? new C12045xffb418de(this) : null;
            symbol = BufferedChannelKt.f70689q;
            this._closeCause = symbol;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    /* renamed from: L */
    public static /* synthetic */ Object m27269L(BufferedChannel bufferedChannel, Continuation continuation) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment = (ChannelSegment) f70662h.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = f70658d.getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (channelSegment.f71019id != j) {
                ChannelSegment m27238i = bufferedChannel.m27238i(j, channelSegment);
                if (m27238i == null) {
                    continue;
                } else {
                    channelSegment = m27238i;
                }
            }
            Object m27249c0 = bufferedChannel.m27249c0(channelSegment, i2, andIncrement, null);
            symbol = BufferedChannelKt.f70683k;
            if (m27249c0 != symbol) {
                symbol2 = BufferedChannelKt.f70685m;
                if (m27249c0 != symbol2) {
                    symbol3 = BufferedChannelKt.f70684l;
                    if (m27249c0 == symbol3) {
                        return bufferedChannel.m27266O(channelSegment, i2, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return m27249c0;
                } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.m27235l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m27268M(kotlinx.coroutines.channels.BufferedChannel r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            kotlin.ResultKt.throwOnFailure(r14)
            kotlinx.coroutines.channels.ChannelResult r14 = (kotlinx.coroutines.channels.ChannelResult) r14
            java.lang.Object r13 = r14.m74686unboximpl()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = access$getReceiveSegment$FU$p()
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
        L47:
            boolean r1 = r13.isClosedForReceive()
            if (r1 == 0) goto L58
            kotlinx.coroutines.channels.ChannelResult$Companion r14 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r13 = r13.getCloseCause()
            java.lang.Object r13 = r14.m74687closedJP2dKIU(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getReceivers$FU$p()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f71019id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentReceive(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = access$updateCellReceive(r7, r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r1 == r7) goto Lb3
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r1 != r7) goto L98
            long r7 = r13.getSendersCounter$kotlinx_coroutines_core()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.cleanPrev()
            goto L47
        L98:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r1 != r7) goto La9
            r6.label = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.m27267N(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r13 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r13 = r13.m74689successJP2dKIU(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m27268M(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: U */
    public static /* synthetic */ Object m27260U(BufferedChannel bufferedChannel, Object obj, Continuation continuation) {
        ChannelSegment channelSegment = (ChannelSegment) f70661g.get(bufferedChannel);
        while (true) {
            long andIncrement = f70657c.getAndIncrement(bufferedChannel);
            long j = 1152921504606846975L & andIncrement;
            boolean m27228s = bufferedChannel.m27228s(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment.f71019id != j2) {
                ChannelSegment m27237j = bufferedChannel.m27237j(j2, channelSegment);
                if (m27237j == null) {
                    if (m27228s) {
                        Object m27277D = bufferedChannel.m27277D(obj, continuation);
                        if (m27277D == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                            return m27277D;
                        }
                    }
                } else {
                    channelSegment = m27237j;
                }
            }
            int m27245e0 = bufferedChannel.m27245e0(channelSegment, i2, obj, j, null, m27228s);
            if (m27245e0 != 0) {
                if (m27245e0 == 1) {
                    break;
                } else if (m27245e0 != 2) {
                    if (m27245e0 != 3) {
                        if (m27245e0 != 4) {
                            if (m27245e0 == 5) {
                                channelSegment.cleanPrev();
                            }
                        } else {
                            if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            Object m27277D2 = bufferedChannel.m27277D(obj, continuation);
                            if (m27277D2 == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                                return m27277D2;
                            }
                        }
                    } else {
                        Object m27258W = bufferedChannel.m27258W(channelSegment, i2, obj, j, continuation);
                        if (m27258W == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                            return m27258W;
                        }
                    }
                } else if (m27228s) {
                    channelSegment.onSlotCleaned();
                    Object m27277D3 = bufferedChannel.m27277D(obj, continuation);
                    if (m27277D3 == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                        return m27277D3;
                    }
                }
            } else {
                channelSegment.cleanPrev();
                break;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r0 = kotlin.Result.Companion;
        r9.resumeWith(kotlin.Result.m74087constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m27259V(kotlinx.coroutines.channels.BufferedChannel r18, java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r8 = r18
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.intercepted(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.initCancellability()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r8.onUndeliveredElement
            if (r0 != 0) goto Lcc
            kotlinx.coroutines.channels.BufferedChannel$b r11 = new kotlinx.coroutines.channels.BufferedChannel$b
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L22:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            boolean r14 = access$isClosedForSend0(r8, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r12 / r2
            long r4 = (long) r1
            long r4 = r12 % r4
            int r15 = (int) r4
            long r4 = r0.f71019id
            r16 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5f
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r8, r2, r0)
            if (r1 != 0) goto L5d
            if (r14 == 0) goto L22
        L4e:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r16)
            java.lang.Object r0 = kotlin.Result.m74087constructorimpl(r0)
            r9.resumeWith(r0)
            goto Lbe
        L5d:
            r7 = r1
            goto L60
        L5f:
            r7 = r0
        L60:
            r0 = r18
            r1 = r7
            r2 = r15
            r3 = r19
            r4 = r12
            r6 = r11
            r17 = r7
            r7 = r14
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            if (r0 == r10) goto Laa
            r1 = 2
            if (r0 == r1) goto L9e
            r1 = 3
            if (r0 == r1) goto L92
            r1 = 4
            if (r0 == r1) goto L86
            r1 = 5
            if (r0 == r1) goto L80
            goto L83
        L80:
            r17.cleanPrev()
        L83:
            r0 = r17
            goto L22
        L86:
            long r0 = r18.getReceiversCounter$kotlinx_coroutines_core()
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4e
            r17.cleanPrev()
            goto L4e
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9e:
            if (r14 == 0) goto La4
            r17.onSlotCleaned()
            goto L4e
        La4:
            r0 = r17
            access$prepareSenderForSuspension(r8, r11, r0, r15)
            goto Lbe
        Laa:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            java.lang.Object r0 = kotlin.Result.m74087constructorimpl(r0)
            r9.resumeWith(r0)
            goto Lbe
        Lb8:
            r0 = r17
            r0.cleanPrev()
            goto Laa
        Lbe:
            java.lang.Object r0 = r9.getResult()
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lcb
            kotlin.coroutines.jvm.internal.DebugProbes.probeCoroutineSuspended(r20)
        Lcb:
            return r0
        Lcc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m27259V(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isEmpty$annotations() {
    }

    /* renamed from: n */
    public static /* synthetic */ void m27233n(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 1;
            }
            bufferedChannel.m27234m(j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, Function0 function0, Function2 function2, Function0 function02, Function4 function4, int i, Object obj3) {
        BufferedChannel$sendImpl$1 bufferedChannel$sendImpl$1;
        ChannelSegment channelSegment;
        Waiter waiter;
        if (obj3 == null) {
            if ((i & 32) != 0) {
                bufferedChannel$sendImpl$1 = BufferedChannel$sendImpl$1.INSTANCE;
            } else {
                bufferedChannel$sendImpl$1 = function4;
            }
            ChannelSegment channelSegment2 = (ChannelSegment) f70661g.get(bufferedChannel);
            while (true) {
                long andIncrement = f70657c.getAndIncrement(bufferedChannel);
                long j = andIncrement & 1152921504606846975L;
                boolean m27228s = bufferedChannel.m27228s(andIncrement);
                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                long j2 = j / i2;
                int i3 = (int) (j % i2);
                if (channelSegment2.f71019id != j2) {
                    ChannelSegment m27237j = bufferedChannel.m27237j(j2, channelSegment2);
                    if (m27237j == null) {
                        if (m27228s) {
                            return function02.invoke();
                        }
                    } else {
                        channelSegment = m27237j;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                int m27245e0 = bufferedChannel.m27245e0(channelSegment, i3, obj, j, obj2, m27228s);
                if (m27245e0 != 0) {
                    if (m27245e0 != 1) {
                        if (m27245e0 != 2) {
                            if (m27245e0 != 3) {
                                if (m27245e0 != 4) {
                                    if (m27245e0 == 5) {
                                        channelSegment.cleanPrev();
                                    }
                                    channelSegment2 = channelSegment;
                                } else {
                                    if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                                        channelSegment.cleanPrev();
                                    }
                                    return function02.invoke();
                                }
                            } else {
                                return bufferedChannel$sendImpl$1.invoke(channelSegment, Integer.valueOf(i3), obj, Long.valueOf(j));
                            }
                        } else if (m27228s) {
                            channelSegment.onSlotCleaned();
                            return function02.invoke();
                        } else {
                            if (obj2 instanceof Waiter) {
                                waiter = (Waiter) obj2;
                            } else {
                                waiter = null;
                            }
                            if (waiter != null) {
                                bufferedChannel.m27274G(waiter, channelSegment, i3);
                            }
                            return function2.invoke(channelSegment, Integer.valueOf(i3));
                        }
                    } else {
                        return function0.invoke();
                    }
                } else {
                    channelSegment.cleanPrev();
                    return function0.invoke();
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
    }

    /* renamed from: A */
    public final void m27280A(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(m27235l())));
    }

    /* renamed from: B */
    public final void m27279B(SelectInstance selectInstance) {
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* renamed from: C */
    public final void m27278C(Object obj, SelectInstance selectInstance) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, obj, selectInstance.getContext());
        }
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* renamed from: D */
    public final Object m27277D(Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
            AbstractC5370bT.addSuppressed(callUndeliveredElementCatchingException$default, getSendException());
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(callUndeliveredElementCatchingException$default)));
        } else {
            Throwable sendException = getSendException();
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(sendException)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: E */
    public final void m27276E(Object obj, CancellableContinuation cancellableContinuation) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, obj, cancellableContinuation.getContext());
        }
        Throwable sendException = getSendException();
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(sendException)));
    }

    /* renamed from: F */
    public final void m27275F(Waiter waiter, ChannelSegment channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* renamed from: G */
    public final void m27274G(Waiter waiter, ChannelSegment channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* renamed from: H */
    public final Object m27273H(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw m27235l();
    }

    /* renamed from: I */
    public final Object m27272I(Object obj, Object obj2) {
        Object m74689successJP2dKIU;
        if (obj2 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            m74689successJP2dKIU = ChannelResult.Companion.m74687closedJP2dKIU(getCloseCause());
        } else {
            m74689successJP2dKIU = ChannelResult.Companion.m74689successJP2dKIU(obj2);
        }
        return ChannelResult.m74674boximpl(m74689successJP2dKIU);
    }

    /* renamed from: J */
    public final Object m27271J(Object obj, Object obj2) {
        if (obj2 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            if (getCloseCause() == null) {
                return null;
            }
            throw m27235l();
        }
        return obj2;
    }

    /* renamed from: K */
    public final Object m27270K(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m27267N(kotlinx.coroutines.channels.ChannelSegment r11, int r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m27267N(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: O */
    public final Object m27266O(ChannelSegment channelSegment, int i, long j, Continuation continuation) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        try {
            Object m27249c0 = m27249c0(channelSegment, i, j, orCreateCancellableContinuation);
            symbol = BufferedChannelKt.f70683k;
            if (m27249c0 == symbol) {
                m27275F(orCreateCancellableContinuation, channelSegment, i);
            } else {
                symbol2 = BufferedChannelKt.f70685m;
                Function1<Throwable, Unit> function1 = null;
                function1 = null;
                CancellableContinuationImpl cancellableContinuationImpl = null;
                if (m27249c0 == symbol2) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment2 = (ChannelSegment) f70662h.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            m27280A(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = f70658d.getAndIncrement(this);
                        int i2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j2 = andIncrement / i2;
                        int i3 = (int) (andIncrement % i2);
                        if (channelSegment2.f71019id != j2) {
                            ChannelSegment m27238i = m27238i(j2, channelSegment2);
                            if (m27238i != null) {
                                channelSegment2 = m27238i;
                            }
                        }
                        m27249c0 = m27249c0(channelSegment2, i3, andIncrement, orCreateCancellableContinuation);
                        symbol3 = BufferedChannelKt.f70683k;
                        if (m27249c0 != symbol3) {
                            symbol4 = BufferedChannelKt.f70685m;
                            if (m27249c0 != symbol4) {
                                symbol5 = BufferedChannelKt.f70684l;
                                if (m27249c0 != symbol5) {
                                    channelSegment2.cleanPrev();
                                    Function1<E, Unit> function12 = this.onUndeliveredElement;
                                    if (function12 != null) {
                                        function1 = OnUndeliveredElementKt.bindCancellationFun(function12, m27249c0, orCreateCancellableContinuation.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        } else {
                            if (orCreateCancellableContinuation instanceof Waiter) {
                                cancellableContinuationImpl = orCreateCancellableContinuation;
                            }
                            if (cancellableContinuationImpl != null) {
                                m27275F(cancellableContinuationImpl, channelSegment2, i3);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function13 = this.onUndeliveredElement;
                    if (function13 != null) {
                        function1 = OnUndeliveredElementKt.bindCancellationFun(function13, m27249c0, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(m27249c0, function1);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* renamed from: P */
    public final void m27265P(SelectInstance selectInstance, Object obj) {
        Symbol symbol;
        Waiter waiter;
        Symbol symbol2;
        Symbol symbol3;
        ChannelSegment channelSegment = (ChannelSegment) f70662h.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = f70658d.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (channelSegment.f71019id != j) {
                ChannelSegment m27238i = m27238i(j, channelSegment);
                if (m27238i == null) {
                    continue;
                } else {
                    channelSegment = m27238i;
                }
            }
            Object m27249c0 = m27249c0(channelSegment, i2, andIncrement, selectInstance);
            symbol = BufferedChannelKt.f70683k;
            if (m27249c0 != symbol) {
                symbol2 = BufferedChannelKt.f70685m;
                if (m27249c0 != symbol2) {
                    symbol3 = BufferedChannelKt.f70684l;
                    if (m27249c0 != symbol3) {
                        channelSegment.cleanPrev();
                        selectInstance.selectInRegistrationPhase(m27249c0);
                        return;
                    }
                    throw new IllegalStateException("unexpected".toString());
                } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else {
                if (selectInstance instanceof Waiter) {
                    waiter = (Waiter) selectInstance;
                } else {
                    waiter = null;
                }
                if (waiter != null) {
                    m27275F(waiter, channelSegment, i2);
                    return;
                }
                return;
            }
        }
        m27279B(selectInstance);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
        r13 = (kotlinx.coroutines.channels.ChannelSegment) r13.getPrev();
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27264Q(kotlinx.coroutines.channels.ChannelSegment r13) {
        /*
            r12 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r12.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m74702constructorimpl$default(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.f71019id
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.getState$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r8 == r9) goto Lbc
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r8 != r9) goto L49
            long r9 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r13.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L41:
            r13.cleanElement$kotlinx_coroutines_core(r4)
            r13.onSlotCleaned()
            goto Lb0
        L49:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof kotlinx.coroutines.Waiter
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof p000.J32
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto Lbc
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof p000.J32
            if (r9 == 0) goto L81
            r9 = r8
            J32 r9 = (p000.J32) r9
            kotlinx.coroutines.Waiter r9 = r9.f2684a
            goto L84
        L81:
            r9 = r8
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
        L84:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r13.casState$kotlinx_coroutines_core(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L98:
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m74707plusFjFbRPM(r3, r9)
            r13.cleanElement$kotlinx_coroutines_core(r4)
            r13.onSlotCleaned()
            goto Lb0
        La3:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r13.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.onSlotCleaned()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r13 = r13.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r13 = (kotlinx.coroutines.channels.ChannelSegment) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r12.m27262S(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r12.m27262S(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m27264Q(kotlinx.coroutines.channels.ChannelSegment):void");
    }

    /* renamed from: R */
    public final void m27263R(Waiter waiter) {
        m27261T(waiter, true);
    }

    /* renamed from: S */
    public final void m27262S(Waiter waiter) {
        m27261T(waiter, false);
    }

    /* renamed from: T */
    public final void m27261T(Waiter waiter, boolean z) {
        Throwable sendException;
        if (waiter instanceof C12044b) {
            CancellableContinuation m27212a = ((C12044b) waiter).m27212a();
            Result.Companion companion = Result.Companion;
            m27212a.resumeWith(Result.m74087constructorimpl(Boolean.FALSE));
        } else if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion2 = Result.Companion;
            if (z) {
                sendException = m27235l();
            } else {
                sendException = getSendException();
            }
            continuation.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(sendException)));
        } else if (waiter instanceof C22348ts1) {
            CancellableContinuationImpl cancellableContinuationImpl = ((C22348ts1) waiter).f107229a;
            Result.Companion companion3 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(ChannelResult.m74674boximpl(ChannelResult.Companion.m74687closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof C12043a) {
            ((C12043a) waiter).m27213h();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m27258W(kotlinx.coroutines.channels.ChannelSegment r21, int r22, java.lang.Object r23, long r24, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m27258W(kotlinx.coroutines.channels.ChannelSegment, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: X */
    public final boolean m27257X(long j) {
        if (m27228s(j)) {
            return false;
        }
        return !m27254a(j & 1152921504606846975L);
    }

    /* renamed from: Y */
    public final boolean m27256Y(Object obj, Object obj2) {
        boolean m27207e;
        boolean m27207e2;
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, obj2);
        }
        Function1<Throwable, Unit> function1 = null;
        if (obj instanceof C22348ts1) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C22348ts1 c22348ts1 = (C22348ts1) obj;
            CancellableContinuationImpl cancellableContinuationImpl = c22348ts1.f107229a;
            ChannelResult m74674boximpl = ChannelResult.m74674boximpl(ChannelResult.Companion.m74689successJP2dKIU(obj2));
            Function1<E, Unit> function12 = this.onUndeliveredElement;
            if (function12 != null) {
                function1 = OnUndeliveredElementKt.bindCancellationFun(function12, obj2, c22348ts1.f107229a.getContext());
            }
            m27207e2 = BufferedChannelKt.m27207e(cancellableContinuationImpl, m74674boximpl, function1);
            return m27207e2;
        } else if (obj instanceof C12043a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C12043a) obj).m27214g(obj2);
        } else if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1<E, Unit> function13 = this.onUndeliveredElement;
            if (function13 != null) {
                function1 = OnUndeliveredElementKt.bindCancellationFun(function13, obj2, cancellableContinuation.getContext());
            }
            m27207e = BufferedChannelKt.m27207e(cancellableContinuation, obj2, function1);
            return m27207e;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    /* renamed from: Z */
    public final boolean m27255Z(Object obj, ChannelSegment channelSegment, int i) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.m27206f((CancellableContinuation) obj, Unit.INSTANCE, null, 2, null);
        } else if (obj instanceof SelectInstance) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, Unit.INSTANCE);
            if (trySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            if (trySelectDetailed == TrySelectDetailedResult.SUCCESSFUL) {
                return true;
            }
            return false;
        } else if (obj instanceof C12044b) {
            return BufferedChannelKt.m27206f(((C12044b) obj).m27212a(), Boolean.TRUE, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    /* renamed from: a */
    public final boolean m27254a(long j) {
        if (j >= m27236k() && j >= getReceiversCounter$kotlinx_coroutines_core() + this.f70666a) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public final boolean m27253a0(ChannelSegment channelSegment, int i, long j) {
        Symbol symbol;
        Symbol symbol2;
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if ((state$kotlinx_coroutines_core instanceof Waiter) && j >= f70658d.get(this)) {
            symbol = BufferedChannelKt.f70677e;
            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                if (!m27255Z(state$kotlinx_coroutines_core, channelSegment, i)) {
                    symbol2 = BufferedChannelKt.f70680h;
                    channelSegment.setState$kotlinx_coroutines_core(i, symbol2);
                    channelSegment.onCancelledRequest(i, false);
                    return false;
                }
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                return true;
            }
        }
        return m27251b0(channelSegment, i, j);
    }

    /* renamed from: b */
    public final void m27252b(ChannelSegment channelSegment, long j) {
        Symbol symbol;
        Object m74702constructorimpl$default = InlineList.m74702constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((channelSegment.f71019id * BufferedChannelKt.SEGMENT_SIZE) + i < j) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = BufferedChannelKt.f70675c;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (state$kotlinx_coroutines_core instanceof J32) {
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m74702constructorimpl$default = InlineList.m74707plusFjFbRPM(m74702constructorimpl$default, ((J32) state$kotlinx_coroutines_core).f2684a);
                                    channelSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            } else if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                m74702constructorimpl$default = InlineList.m74707plusFjFbRPM(m74702constructorimpl$default, state$kotlinx_coroutines_core);
                                channelSegment.onCancelledRequest(i, true);
                                break;
                            }
                        }
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        channelSegment.onSlotCleaned();
                        break;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (m74702constructorimpl$default != null) {
            if (!(m74702constructorimpl$default instanceof ArrayList)) {
                m27263R((Waiter) m74702constructorimpl$default);
                return;
            }
            Intrinsics.checkNotNull(m74702constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) m74702constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m27263R((Waiter) arrayList.get(size));
            }
        }
    }

    /* renamed from: b0 */
    public final boolean m27251b0(ChannelSegment channelSegment, int i, long j) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                symbol3 = BufferedChannelKt.f70680h;
                if (state$kotlinx_coroutines_core == symbol3) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    symbol4 = BufferedChannelKt.f70675c;
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol4)) {
                        return true;
                    }
                } else if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                    symbol5 = BufferedChannelKt.f70678f;
                    if (state$kotlinx_coroutines_core == symbol5) {
                        break;
                    }
                    symbol6 = BufferedChannelKt.f70679g;
                    if (state$kotlinx_coroutines_core == symbol6) {
                        break;
                    }
                    symbol7 = BufferedChannelKt.f70681i;
                    if (state$kotlinx_coroutines_core != symbol7 && state$kotlinx_coroutines_core != BufferedChannelKt.getCHANNEL_CLOSED()) {
                        symbol8 = BufferedChannelKt.f70676d;
                        if (state$kotlinx_coroutines_core != symbol8) {
                            throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else if (j >= f70658d.get(this)) {
                symbol = BufferedChannelKt.f70677e;
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                    if (!m27255Z(state$kotlinx_coroutines_core, channelSegment, i)) {
                        symbol2 = BufferedChannelKt.f70680h;
                        channelSegment.setState$kotlinx_coroutines_core(i, symbol2);
                        channelSegment.onCancelledRequest(i, false);
                        return false;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                    return true;
                }
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, new J32((Waiter) state$kotlinx_coroutines_core))) {
                return true;
            }
        }
    }

    /* renamed from: c */
    public final ChannelSegment m27250c() {
        ChannelSegment channelSegment = f70663i.get(this);
        ChannelSegment channelSegment2 = (ChannelSegment) f70661g.get(this);
        if (channelSegment2.f71019id > ((ChannelSegment) channelSegment).f71019id) {
            channelSegment = channelSegment2;
        }
        ChannelSegment channelSegment3 = (ChannelSegment) f70662h.get(this);
        if (channelSegment3.f71019id > ((ChannelSegment) channelSegment).f71019id) {
            channelSegment = channelSegment3;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) channelSegment);
    }

    /* renamed from: c0 */
    public final Object m27249c0(ChannelSegment channelSegment, int i, long j, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (f70657c.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    symbol3 = BufferedChannelKt.f70684l;
                    return symbol3;
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    m27242g();
                    symbol2 = BufferedChannelKt.f70683k;
                    return symbol2;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
            symbol = BufferedChannelKt.f70679g;
            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                m27242g();
                return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
            }
        }
        return m27247d0(channelSegment, i, j, obj);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(@Nullable Throwable th2) {
        return cancelImpl$kotlinx_coroutines_core(th2);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(@Nullable Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1 A[LOOP:2: B:30:0x00c1->B:93:0x01e4, LOOP_START, PHI: r1 
      PHI: (r1v15 kotlinx.coroutines.channels.ChannelSegment) = (r1v12 kotlinx.coroutines.channels.ChannelSegment), (r1v17 kotlinx.coroutines.channels.ChannelSegment) binds: [B:29:0x00bf, B:93:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void checkSegmentStructureInvariants() {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.checkSegmentStructureInvariants():void");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable th2) {
        return closeOrCancelImpl(th2, false);
    }

    public boolean closeOrCancelImpl(@Nullable Throwable th2, boolean z) {
        Symbol symbol;
        if (z) {
            m27225v();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70664j;
        symbol = BufferedChannelKt.f70689q;
        boolean m23740a = AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, symbol, th2);
        if (z) {
            m27224w();
        } else {
            m27223x();
        }
        m27244f();
        onClosedIdempotent();
        if (m23740a) {
            m27232o();
        }
        return m23740a;
    }

    /* renamed from: d */
    public final void m27248d(long j) {
        m27264Q(m27246e(j));
    }

    /* renamed from: d0 */
    public final Object m27247d0(ChannelSegment channelSegment, int i, long j, Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        Symbol symbol8;
        Symbol symbol9;
        Symbol symbol10;
        Symbol symbol11;
        Symbol symbol12;
        Symbol symbol13;
        Symbol symbol14;
        Symbol symbol15;
        Symbol symbol16;
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol5 = BufferedChannelKt.f70675c;
                if (state$kotlinx_coroutines_core != symbol5) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        symbol6 = BufferedChannelKt.f70679g;
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol6)) {
                            m27242g();
                            return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                        }
                    } else {
                        symbol7 = BufferedChannelKt.f70680h;
                        if (state$kotlinx_coroutines_core == symbol7) {
                            symbol8 = BufferedChannelKt.f70685m;
                            return symbol8;
                        }
                        symbol9 = BufferedChannelKt.f70678f;
                        if (state$kotlinx_coroutines_core == symbol9) {
                            symbol10 = BufferedChannelKt.f70685m;
                            return symbol10;
                        } else if (state$kotlinx_coroutines_core != BufferedChannelKt.getCHANNEL_CLOSED()) {
                            symbol12 = BufferedChannelKt.f70677e;
                            if (state$kotlinx_coroutines_core != symbol12) {
                                symbol13 = BufferedChannelKt.f70676d;
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol13)) {
                                    boolean z = state$kotlinx_coroutines_core instanceof J32;
                                    if (z) {
                                        state$kotlinx_coroutines_core = ((J32) state$kotlinx_coroutines_core).f2684a;
                                    }
                                    if (m27255Z(state$kotlinx_coroutines_core, channelSegment, i)) {
                                        symbol16 = BufferedChannelKt.f70679g;
                                        channelSegment.setState$kotlinx_coroutines_core(i, symbol16);
                                        m27242g();
                                        return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                                    }
                                    symbol14 = BufferedChannelKt.f70680h;
                                    channelSegment.setState$kotlinx_coroutines_core(i, symbol14);
                                    channelSegment.onCancelledRequest(i, false);
                                    if (z) {
                                        m27242g();
                                    }
                                    symbol15 = BufferedChannelKt.f70685m;
                                    return symbol15;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            m27242g();
                            symbol11 = BufferedChannelKt.f70685m;
                            return symbol11;
                        }
                    }
                }
            }
            if (j < (f70657c.get(this) & 1152921504606846975L)) {
                symbol = BufferedChannelKt.f70678f;
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol)) {
                    m27242g();
                    symbol2 = BufferedChannelKt.f70685m;
                    return symbol2;
                }
            } else if (obj == null) {
                symbol3 = BufferedChannelKt.f70684l;
                return symbol3;
            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                m27242g();
                symbol4 = BufferedChannelKt.f70683k;
                return symbol4;
            }
        }
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j) {
        Symbol symbol;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        ChannelSegment channelSegment = (ChannelSegment) f70662h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f70658d;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f70666a + j2, m27236k())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = j2 / i;
                int i2 = (int) (j2 % i);
                if (channelSegment.f71019id != j3) {
                    ChannelSegment m27238i = m27238i(j3, channelSegment);
                    if (m27238i == null) {
                        continue;
                    } else {
                        channelSegment = m27238i;
                    }
                }
                Object m27249c0 = m27249c0(channelSegment, i2, j2, null);
                symbol = BufferedChannelKt.f70685m;
                if (m27249c0 == symbol) {
                    if (j2 < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, m27249c0, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final ChannelSegment m27246e(long j) {
        ChannelSegment m27250c = m27250c();
        if (isConflatedDropOldest()) {
            long m27226u = m27226u(m27250c);
            if (m27226u != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(m27226u);
            }
        }
        m27252b(m27250c, j);
        return m27250c;
    }

    /* renamed from: e0 */
    public final int m27245e0(ChannelSegment channelSegment, int i, Object obj, long j, Object obj2, boolean z) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        channelSegment.storeElement$kotlinx_coroutines_core(i, obj);
        if (z) {
            return m27243f0(channelSegment, i, obj, j, obj2, z);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (m27254a(j)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i);
            if (m27256Y(state$kotlinx_coroutines_core, obj)) {
                symbol3 = BufferedChannelKt.f70679g;
                channelSegment.setState$kotlinx_coroutines_core(i, symbol3);
                onReceiveDequeued();
                return 0;
            }
            symbol = BufferedChannelKt.f70681i;
            Object andSetState$kotlinx_coroutines_core = channelSegment.getAndSetState$kotlinx_coroutines_core(i, symbol);
            symbol2 = BufferedChannelKt.f70681i;
            if (andSetState$kotlinx_coroutines_core != symbol2) {
                channelSegment.onCancelledRequest(i, true);
            }
            return 5;
        }
        return m27243f0(channelSegment, i, obj, j, obj2, z);
    }

    /* renamed from: f */
    public final void m27244f() {
        isClosedForSend();
    }

    /* renamed from: f0 */
    public final int m27243f0(ChannelSegment channelSegment, int i, Object obj, long j, Object obj2, boolean z) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = BufferedChannelKt.f70675c;
                if (state$kotlinx_coroutines_core != symbol2) {
                    symbol3 = BufferedChannelKt.f70681i;
                    if (state$kotlinx_coroutines_core != symbol3) {
                        symbol4 = BufferedChannelKt.f70678f;
                        if (state$kotlinx_coroutines_core == symbol4) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            return 5;
                        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            m27244f();
                            return 4;
                        } else {
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            if (state$kotlinx_coroutines_core instanceof J32) {
                                state$kotlinx_coroutines_core = ((J32) state$kotlinx_coroutines_core).f2684a;
                            }
                            if (m27256Y(state$kotlinx_coroutines_core, obj)) {
                                symbol7 = BufferedChannelKt.f70679g;
                                channelSegment.setState$kotlinx_coroutines_core(i, symbol7);
                                onReceiveDequeued();
                                return 0;
                            }
                            symbol5 = BufferedChannelKt.f70681i;
                            Object andSetState$kotlinx_coroutines_core = channelSegment.getAndSetState$kotlinx_coroutines_core(i, symbol5);
                            symbol6 = BufferedChannelKt.f70681i;
                            if (andSetState$kotlinx_coroutines_core != symbol6) {
                                channelSegment.onCancelledRequest(i, true);
                            }
                            return 5;
                        }
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                    return 5;
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (m27254a(j) && !z) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (z) {
                symbol = BufferedChannelKt.f70680h;
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, symbol)) {
                    channelSegment.onCancelledRequest(i, false);
                    return 4;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                    return 2;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m27242g() {
        if (m27227t()) {
            return;
        }
        ChannelSegment channelSegment = (ChannelSegment) f70663i.get(this);
        while (true) {
            long andIncrement = f70659e.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.f71019id < j && channelSegment.getNext() != null) {
                    m27222y(j, channelSegment);
                }
                m27233n(this, 0L, 1, null);
                return;
            }
            if (channelSegment.f71019id != j) {
                ChannelSegment m27240h = m27240h(j, channelSegment, andIncrement);
                if (m27240h == null) {
                    continue;
                } else {
                    channelSegment = m27240h;
                }
            }
            if (m27253a0(channelSegment, (int) (andIncrement % i), andIncrement)) {
                m27233n(this, 0L, 1, null);
                return;
            }
            m27233n(this, 0L, 1, null);
        }
    }

    /* renamed from: g0 */
    public final void m27241g0(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f70658d;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!f70658d.compareAndSet(this, j2, j));
    }

    @Nullable
    public final Throwable getCloseCause() {
        return (Throwable) f70664j.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.f70667b);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.f70667b);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3), (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.f70667b);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return f70658d.get(this);
    }

    @NotNull
    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        if (closeCause == null) {
            return new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
        return closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return f70657c.get(this) & 1152921504606846975L;
    }

    /* renamed from: h */
    public final ChannelSegment m27240h(long j, ChannelSegment channelSegment, long j2) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70663i;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (!SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
                Segment m74714getSegmentimpl = SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71019id >= m74714getSegmentimpl.f71019id) {
                        break loop0;
                    } else if (!m74714getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    } else if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, segment, m74714getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m74714getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m74714getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
            m27244f();
            m27222y(j, channelSegment);
            m27233n(this, 0L, 1, null);
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
        long j3 = channelSegment2.f71019id;
        if (j3 > j) {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            if (f70659e.compareAndSet(this, j2 + 1, i * j3)) {
                m27234m((channelSegment2.f71019id * i) - j2);
                return null;
            }
            m27233n(this, 0L, 1, null);
            return null;
        }
        return channelSegment2;
    }

    /* renamed from: h0 */
    public final void m27239h0(long j) {
        long j2;
        long m27210b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f70657c;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            long j3 = 1152921504606846975L & j2;
            if (j3 < j) {
                m27210b = BufferedChannelKt.m27210b(j3, (int) (j2 >> 60));
            } else {
                return;
            }
        } while (!f70657c.compareAndSet(this, j2, m27210b));
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70662h;
            ChannelSegment channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = receiversCounter$kotlinx_coroutines_core / i;
            if (channelSegment.f71019id != j && (channelSegment = m27238i(j, channelSegment)) == null) {
                if (((ChannelSegment) atomicReferenceFieldUpdater.get(this)).f71019id < j) {
                    return false;
                }
            } else {
                channelSegment.cleanPrev();
                if (m27231p(channelSegment, (int) (receiversCounter$kotlinx_coroutines_core % i), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                f70658d.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            }
        }
    }

    /* renamed from: i */
    public final ChannelSegment m27238i(long j, ChannelSegment channelSegment) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70662h;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (!SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
                Segment m74714getSegmentimpl = SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71019id >= m74714getSegmentimpl.f71019id) {
                        break loop0;
                    } else if (!m74714getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    } else if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, segment, m74714getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m74714getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m74714getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
            m27244f();
            if (channelSegment.f71019id * BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
        if (!m27227t() && j <= m27236k() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f70663i;
            while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.f71019id >= channelSegment2.f71019id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                } else if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater2, this, segment2, channelSegment2)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                    channelSegment2.remove();
                }
            }
        }
        long j2 = channelSegment2.f71019id;
        if (j2 > j) {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            m27241g0(j2 * i);
            if (channelSegment2.f71019id * i >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment2.cleanPrev();
            return null;
        }
        return channelSegment2;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(@NotNull Function1<? super Throwable, Unit> function1) {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f70665k;
        if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater2, this, null, function1)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            symbol = BufferedChannelKt.f70687o;
            if (obj != symbol) {
                symbol2 = BufferedChannelKt.f70688p;
                if (obj == symbol2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f70665k;
            symbol3 = BufferedChannelKt.f70687o;
            symbol4 = BufferedChannelKt.f70688p;
        } while (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, symbol3, symbol4));
        function1.invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return m27229r(f70657c.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return m27228s(f70657c.get(this));
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator<E> iterator() {
        return new C12043a();
    }

    /* renamed from: j */
    public final ChannelSegment m27237j(long j, ChannelSegment channelSegment) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70661g;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, function2);
            if (!SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
                Segment m74714getSegmentimpl = SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.f71019id >= m74714getSegmentimpl.f71019id) {
                        break loop0;
                    } else if (!m74714getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    } else if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, segment, m74714getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m74714getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m74714getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (SegmentOrClosed.m74716isClosedimpl(findSegmentInternal)) {
            m27244f();
            if (channelSegment.f71019id * BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) SegmentOrClosed.m74714getSegmentimpl(findSegmentInternal);
        long j2 = channelSegment2.f71019id;
        if (j2 > j) {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            m27239h0(j2 * i);
            if (channelSegment2.f71019id * i >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment2.cleanPrev();
            return null;
        }
        return channelSegment2;
    }

    /* renamed from: k */
    public final long m27236k() {
        return f70659e.get(this);
    }

    /* renamed from: l */
    public final Throwable m27235l() {
        Throwable closeCause = getCloseCause();
        if (closeCause == null) {
            return new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
        }
        return closeCause;
    }

    /* renamed from: m */
    public final void m27234m(long j) {
        if ((f70660f.addAndGet(this, j) & Longs.MAX_POWER_OF_TWO) != 0) {
            do {
            } while ((f70660f.get(this) & Longs.MAX_POWER_OF_TWO) != 0);
        }
    }

    /* renamed from: o */
    public final void m27232o() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70665k;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f70687o : BufferedChannelKt.f70688p));
        if (obj == null) {
            return;
        }
        Function1 function1 = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1);
        ((Function1) obj).invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return Channel.DefaultImpls.offer(this, e);
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }

    /* renamed from: p */
    public final boolean m27231p(ChannelSegment channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Symbol symbol7;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = BufferedChannelKt.f70675c;
                if (state$kotlinx_coroutines_core != symbol2) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        symbol3 = BufferedChannelKt.f70680h;
                        if (state$kotlinx_coroutines_core != symbol3 && state$kotlinx_coroutines_core != BufferedChannelKt.getCHANNEL_CLOSED()) {
                            symbol4 = BufferedChannelKt.f70679g;
                            if (state$kotlinx_coroutines_core != symbol4) {
                                symbol5 = BufferedChannelKt.f70678f;
                                if (state$kotlinx_coroutines_core != symbol5) {
                                    symbol6 = BufferedChannelKt.f70677e;
                                    if (state$kotlinx_coroutines_core != symbol6) {
                                        symbol7 = BufferedChannelKt.f70676d;
                                        if (state$kotlinx_coroutines_core == symbol7 || j != getReceiversCounter$kotlinx_coroutines_core()) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            symbol = BufferedChannelKt.f70678f;
        } while (!channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, symbol));
        m27242g();
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    /* renamed from: q */
    public final boolean m27230q(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 3) {
                m27248d(j & 1152921504606846975L);
            } else {
                throw new IllegalStateException(("unexpected close status: " + i).toString());
            }
        } else {
            m27246e(j & 1152921504606846975L);
            if (z && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m27229r(long j) {
        return m27230q(j, true);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object receive(@NotNull Continuation<? super E> continuation) {
        return m27269L(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    /* renamed from: receiveCatching-JP2dKIU  reason: not valid java name */
    public Object mo74668receiveCatchingJP2dKIU(@NotNull Continuation<? super ChannelResult<? extends E>> continuation) {
        return m27268M(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object receiveOrNull(@NotNull Continuation<? super E> continuation) {
        return Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        r14.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void registerSelectForSend(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<?> r14, @org.jetbrains.annotations.Nullable java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = access$isClosedForSend0(r13, r1)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.f71019id
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L39
            kotlinx.coroutines.channels.ChannelSegment r5 = access$findSegmentSend(r13, r5, r0)
            if (r5 != 0) goto L38
            if (r1 == 0) goto La
        L33:
            r13.m27278C(r15, r14)
            goto L90
        L38:
            r0 = r5
        L39:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = access$updateCellSend(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L8c
            r6 = 1
            if (r5 == r6) goto L86
            r6 = 2
            if (r5 == r6) goto L72
            r1 = 3
            if (r5 == r1) goto L66
            r1 = 4
            if (r5 == r1) goto L5a
            r1 = 5
            if (r5 == r1) goto L56
            goto La
        L56:
            r0.cleanPrev()
            goto La
        L5a:
            long r1 = r13.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L33
            r0.cleanPrev()
            goto L33
        L66:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L72:
            if (r1 == 0) goto L78
            r0.onSlotCleaned()
            goto L33
        L78:
            boolean r15 = r14 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto L7f
            kotlinx.coroutines.Waiter r14 = (kotlinx.coroutines.Waiter) r14
            goto L80
        L7f:
            r14 = 0
        L80:
            if (r14 == 0) goto L90
            access$prepareSenderForSuspension(r13, r14, r0, r2)
            goto L90
        L86:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            r14.selectInRegistrationPhase(r15)
            goto L90
        L8c:
            r0.cleanPrev()
            goto L86
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.registerSelectForSend(kotlinx.coroutines.selects.SelectInstance, java.lang.Object):void");
    }

    /* renamed from: s */
    public final boolean m27228s(long j) {
        return m27230q(j, false);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(E e, @NotNull Continuation<? super Unit> continuation) {
        return m27260U(this, e, continuation);
    }

    @Nullable
    public Object sendBroadcast$kotlinx_coroutines_core(E e, @NotNull Continuation<? super Boolean> continuation) {
        return m27259V(this, e, continuation);
    }

    public final <R> R sendImpl(E e, @Nullable Object obj, @NotNull Function0<? extends R> function0, @NotNull Function2<? super ChannelSegment<E>, ? super Integer, ? extends R> function2, @NotNull Function0<? extends R> function02, @NotNull Function4<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> function4) {
        ChannelSegment channelSegment;
        Waiter waiter;
        ChannelSegment channelSegment2 = (ChannelSegment) f70661g.get(this);
        while (true) {
            long andIncrement = f70657c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean m27228s = m27228s(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment2.f71019id != j2) {
                ChannelSegment m27237j = m27237j(j2, channelSegment2);
                if (m27237j == null) {
                    if (m27228s) {
                        return function02.invoke();
                    }
                } else {
                    channelSegment = m27237j;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int m27245e0 = m27245e0(channelSegment, i2, e, j, obj, m27228s);
            if (m27245e0 != 0) {
                if (m27245e0 != 1) {
                    if (m27245e0 != 2) {
                        if (m27245e0 != 3) {
                            if (m27245e0 != 4) {
                                if (m27245e0 == 5) {
                                    channelSegment.cleanPrev();
                                }
                                channelSegment2 = channelSegment;
                            } else {
                                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                return function02.invoke();
                            }
                        } else {
                            return function4.invoke(channelSegment, Integer.valueOf(i2), e, Long.valueOf(j));
                        }
                    } else if (m27228s) {
                        channelSegment.onSlotCleaned();
                        return function02.invoke();
                    } else {
                        if (obj instanceof Waiter) {
                            waiter = (Waiter) obj;
                        } else {
                            waiter = null;
                        }
                        if (waiter != null) {
                            m27274G(waiter, channelSegment, i2);
                        }
                        return function2.invoke(channelSegment, Integer.valueOf(i2));
                    }
                } else {
                    return function0.invoke();
                }
            } else {
                channelSegment.cleanPrev();
                return function0.invoke();
            }
        }
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return m27257X(f70657c.get(this));
    }

    /* renamed from: t */
    public final boolean m27227t() {
        long m27236k = m27236k();
        if (m27236k != 0 && m27236k != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01dd, code lost:
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
        if (r3 != null) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01dd A[EDGE_INSN: B:109:0x01dd->B:91:0x01dd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ec  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toStringDebug$kotlinx_coroutines_core() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toStringDebug$kotlinx_coroutines_core():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: tryReceive-PtdJZtk  reason: not valid java name */
    public Object mo74669tryReceivePtdJZtk() {
        Symbol symbol;
        ChannelSegment channelSegment;
        Symbol symbol2;
        Waiter waiter;
        Symbol symbol3;
        Symbol symbol4;
        long j = f70658d.get(this);
        long j2 = f70657c.get(this);
        if (m27229r(j2)) {
            return ChannelResult.Companion.m74687closedJP2dKIU(getCloseCause());
        }
        if (j < (j2 & 1152921504606846975L)) {
            symbol = BufferedChannelKt.f70681i;
            ChannelSegment channelSegment2 = (ChannelSegment) f70662h.get(this);
            while (!isClosedForReceive()) {
                long andIncrement = f70658d.getAndIncrement(this);
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / i;
                int i2 = (int) (andIncrement % i);
                if (channelSegment2.f71019id != j3) {
                    ChannelSegment m27238i = m27238i(j3, channelSegment2);
                    if (m27238i == null) {
                        continue;
                    } else {
                        channelSegment = m27238i;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object m27249c0 = m27249c0(channelSegment, i2, andIncrement, symbol);
                symbol2 = BufferedChannelKt.f70683k;
                if (m27249c0 != symbol2) {
                    symbol3 = BufferedChannelKt.f70685m;
                    if (m27249c0 != symbol3) {
                        symbol4 = BufferedChannelKt.f70684l;
                        if (m27249c0 != symbol4) {
                            channelSegment.cleanPrev();
                            return ChannelResult.Companion.m74689successJP2dKIU(m27249c0);
                        }
                        throw new IllegalStateException("unexpected".toString());
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    if (symbol instanceof Waiter) {
                        waiter = (Waiter) symbol;
                    } else {
                        waiter = null;
                    }
                    if (waiter != null) {
                        m27275F(waiter, channelSegment, i2);
                    }
                    waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m74688failurePtdJZtk();
                }
            }
            return ChannelResult.Companion.m74687closedJP2dKIU(getCloseCause());
        }
        return ChannelResult.Companion.m74688failurePtdJZtk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return kotlinx.coroutines.channels.ChannelResult.Companion.m74689successJP2dKIU(kotlin.Unit.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    @org.jetbrains.annotations.NotNull
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo74066trySendJP2dKIU(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.f70657c
            long r0 = r0.get(r14)
            boolean r0 = r14.m27257X(r0)
            if (r0 == 0) goto L13
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r15 = r15.m74688failurePtdJZtk()
            return r15
        L13:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = access$isClosedForSend0(r14, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f71019id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r0 = r14.getSendException()
            java.lang.Object r15 = r15.m74687closedJP2dKIU(r0)
            goto Lbe
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lba
            r1 = 1
            if (r0 == r1) goto Lb1
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.cleanPrev()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.getReceiversCounter$kotlinx_coroutines_core()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.cleanPrev()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L94:
            if (r11 == 0) goto L9a
            r13.onSlotCleaned()
            goto L4b
        L9a:
            boolean r15 = r8 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto La1
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            access$prepareSenderForSuspension(r14, r8, r13, r12)
        La7:
            r13.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r15 = r15.m74688failurePtdJZtk()
            goto Lbe
        Lb1:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r15 = r15.m74689successJP2dKIU(r0)
            goto Lbe
        Lba:
            r13.cleanPrev()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo74066trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    /* renamed from: u */
    public final long m27226u(ChannelSegment channelSegment) {
        Symbol symbol;
        do {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (channelSegment.f71019id * BufferedChannelKt.SEGMENT_SIZE) + i;
                    if (j >= getReceiversCounter$kotlinx_coroutines_core()) {
                        while (true) {
                            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                            if (state$kotlinx_coroutines_core != null) {
                                symbol = BufferedChannelKt.f70675c;
                                if (state$kotlinx_coroutines_core != symbol) {
                                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                                        return j;
                                    }
                                }
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                } else {
                    channelSegment = (ChannelSegment) channelSegment.getPrev();
                }
            }
        } while (channelSegment != null);
        return -1L;
    }

    /* renamed from: v */
    public final void m27225v() {
        long j;
        long m27210b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f70657c;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) == 0) {
                m27210b = BufferedChannelKt.m27210b(1152921504606846975L & j, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, m27210b));
    }

    /* renamed from: w */
    public final void m27224w() {
        long j;
        long m27210b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f70657c;
        do {
            j = atomicLongFieldUpdater.get(this);
            m27210b = BufferedChannelKt.m27210b(1152921504606846975L & j, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, m27210b));
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        int i;
        long j2;
        long m27211a;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        long m27211a2;
        long j3;
        long m27211a3;
        if (m27227t()) {
            return;
        }
        do {
        } while (m27236k() <= j);
        i = BufferedChannelKt.f70674b;
        for (int i2 = 0; i2 < i; i2++) {
            long m27236k = m27236k();
            if (m27236k == (f70660f.get(this) & DurationKt.MAX_MILLIS) && m27236k == m27236k()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f70660f;
        do {
            j2 = atomicLongFieldUpdater2.get(this);
            m27211a = BufferedChannelKt.m27211a(j2 & DurationKt.MAX_MILLIS, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, m27211a));
        while (true) {
            long m27236k2 = m27236k();
            atomicLongFieldUpdater = f70660f;
            long j4 = atomicLongFieldUpdater.get(this);
            long j5 = j4 & DurationKt.MAX_MILLIS;
            if ((Longs.MAX_POWER_OF_TWO & j4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (m27236k2 == j5 && m27236k2 == m27236k()) {
                break;
            } else if (!z) {
                m27211a2 = BufferedChannelKt.m27211a(j5, true);
                atomicLongFieldUpdater.compareAndSet(this, j4, m27211a2);
            }
        }
        do {
            j3 = atomicLongFieldUpdater.get(this);
            m27211a3 = BufferedChannelKt.m27211a(j3 & DurationKt.MAX_MILLIS, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, m27211a3));
    }

    /* renamed from: x */
    public final void m27223x() {
        long j;
        long m27210b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f70657c;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                m27210b = BufferedChannelKt.m27210b(j & 1152921504606846975L, 2);
            } else if (i == 1) {
                m27210b = BufferedChannelKt.m27210b(j & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, m27210b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
        continue;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27222y(long r6, kotlinx.coroutines.channels.ChannelSegment r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f71019id
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r8.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.isRemoved()
            if (r6 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = r8.getNext()
            kotlinx.coroutines.channels.ChannelSegment r6 = (kotlinx.coroutines.channels.ChannelSegment) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.f70663i
        L24:
            java.lang.Object r7 = r6.get(r5)
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            long r0 = r7.f71019id
            long r2 = r8.f71019id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = p000.AbstractC13055p0.m23740a(r6, r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.decPointers$kotlinx_coroutines_core()
            if (r6 == 0) goto L49
            r7.remove()
        L49:
            return
        L4a:
            boolean r7 = r8.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto L24
            r8.remove()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m27222y(long, kotlinx.coroutines.channels.ChannelSegment):void");
    }

    /* renamed from: z */
    public final void m27221z(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.Companion;
        cancellableContinuation.resumeWith(Result.m74087constructorimpl(ChannelResult.m74674boximpl(ChannelResult.Companion.m74687closedJP2dKIU(getCloseCause()))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(@Nullable CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    public /* synthetic */ BufferedChannel(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : function1);
    }
}
