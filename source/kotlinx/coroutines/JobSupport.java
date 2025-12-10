package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause0Impl;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(m28851d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\bye\u009f\u0001\u0086\u0001Ð\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00060\u0010j\u0002`\u0011*\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010 \u001a\u00020\u001f2'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\t0\u0019j\u0002`\u001d¢\u0006\u0004\b \u0010!JF\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\t0\u0019j\u0002`\u001d¢\u0006\u0004\b \u0010$J\u0013\u0010%\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010+\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\t2\u000e\u0010\u001c\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0014¢\u0006\u0004\b.\u0010/J\u0019\u0010,\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b,\u00100J\u0017\u00101\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0003¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b6\u00100J\u0017\u00107\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b7\u00100J\u0019\u0010;\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b9\u0010:J(\u0010?\u001a\u00020<2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0080\b¢\u0006\u0004\b=\u0010>J\u0013\u0010@\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b@\u0010\u0013J\u0019\u0010C\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\bB\u0010:J\u001b\u0010F\u001a\u0004\u0018\u0001082\b\u0010A\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\bD\u0010EJ\u0015\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0014H\u0010¢\u0006\u0004\bL\u00102J\u0019\u0010\"\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\"\u00102J\u0017\u0010N\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0014H\u0014¢\u0006\u0004\bN\u00100J\u0019\u0010P\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u000108H\u0014¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u000108H\u0014¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0015H\u0016¢\u0006\u0004\bS\u0010/J\u000f\u0010T\u001a\u00020\u0015H\u0007¢\u0006\u0004\bT\u0010/J\u000f\u0010V\u001a\u00020\u0015H\u0010¢\u0006\u0004\bU\u0010/J\u000f\u0010W\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\bW\u0010XJ\u0011\u0010[\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001a\u0004\u0018\u000108H\u0084@ø\u0001\u0000¢\u0006\u0004\b\\\u0010&J#\u0010^\u001a\u0004\u0018\u0001082\u0006\u0010O\u001a\u00020]2\b\u0010A\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b^\u0010_J'\u0010b\u001a\u0004\u0018\u00010\u00142\u0006\u0010O\u001a\u00020]2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00140`H\u0002¢\u0006\u0004\bb\u0010cJ%\u0010e\u001a\u00020\t2\u0006\u0010d\u001a\u00020\u00142\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00140`H\u0002¢\u0006\u0004\be\u0010fJ!\u0010i\u001a\u00020\u00042\u0006\u0010O\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bi\u0010jJ!\u0010k\u001a\u00020\t2\u0006\u0010O\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bk\u0010lJ\u001f\u0010o\u001a\u00020\t2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\bq\u00100J\u001d\u0010r\u001a\u00020\t*\u00020m2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\br\u0010pJ\u0019\u0010t\u001a\u00020s2\b\u0010O\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bt\u0010uJ@\u0010v\u001a\u00020'2'\u0010\u001e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\t0\u0019j\u0002`\u001d2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\bv\u0010wJ'\u0010y\u001a\u00020\u00042\u0006\u0010x\u001a\u0002082\u0006\u0010n\u001a\u00020m2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020\t2\u0006\u0010O\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\t2\u0006\u0010O\u001a\u00020'H\u0002¢\u0006\u0004\b~\u0010*J\u000f\u0010\u007f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u007f\u0010\rJ\u0015\u0010\u0080\u0001\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010&J+\u0010\u0084\u0001\u001a\u00020\t2\f\u0010\u0082\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001d\u0010\u0086\u0001\u001a\u0004\u0018\u0001082\b\u0010\u001c\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0005\b\u0086\u0001\u0010EJ\u001c\u0010\u0087\u0001\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001d\u0010\u0089\u0001\u001a\u0004\u0018\u0001082\b\u0010\u001c\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0005\b\u0089\u0001\u0010EJ\u001c\u0010\u008a\u0001\u001a\u0004\u0018\u00010m2\u0006\u0010O\u001a\u00020gH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\"\u0010\u008c\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020g2\u0006\u0010d\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J(\u0010\u008e\u0001\u001a\u0004\u0018\u0001082\b\u0010O\u001a\u0004\u0018\u0001082\b\u0010A\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J&\u0010\u0090\u0001\u001a\u0004\u0018\u0001082\u0006\u0010O\u001a\u00020g2\b\u0010A\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001d\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00012\u0006\u0010O\u001a\u00020gH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J.\u0010\u0095\u0001\u001a\u00020\u00042\u0006\u0010O\u001a\u00020]2\u0007\u0010G\u001a\u00030\u0092\u00012\b\u0010A\u001a\u0004\u0018\u000108H\u0082\u0010¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J.\u0010\u0098\u0001\u001a\u00020\t2\u0006\u0010O\u001a\u00020]2\b\u0010\u0097\u0001\u001a\u00030\u0092\u00012\b\u0010A\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0092\u0001*\u00030\u009a\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u00152\b\u0010O\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u000108H\u0082@ø\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010&J+\u0010 \u0001\u001a\u00020\t2\f\u0010\u0082\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b \u0001\u0010\u0085\u0001J*\u0010¢\u0001\u001a\u0004\u0018\u0001082\t\u0010\u0083\u0001\u001a\u0004\u0018\u0001082\t\u0010¡\u0001\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0006\b¢\u0001\u0010\u008f\u0001R\u0019\u0010¦\u0001\u001a\u0007\u0012\u0002\b\u00030£\u00018F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R.\u0010¬\u0001\u001a\u0004\u0018\u00010H2\t\u0010§\u0001\u001a\u0004\u0018\u00010H8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0017\u0010O\u001a\u0004\u0018\u0001088@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010ZR\u0016\u0010°\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010\rR\u0013\u0010±\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010\rR\u0013\u0010²\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\rR\u0018\u0010´\u0001\u001a\u0004\u0018\u00010\u00148DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010XR\u0016\u0010¶\u0001\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010\rR\u001c\u0010»\u0001\u001a\u00030·\u00018F¢\u0006\u000f\u0012\u0005\bº\u0001\u0010\u000f\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010½\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\rR\u001b\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¾\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\rR\u0016\u0010Ä\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010\rR\u0013\u0010Å\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010\rR#\u0010Ê\u0001\u001a\u0007\u0012\u0002\b\u00030Æ\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\bÉ\u0001\u0010\u000f\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u0001088BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010\u0088\u0001R\u0015\u0010Î\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010H0Í\u00018\u0002X\u0082\u0004R\u0015\u0010Ï\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001080Í\u00018\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ñ\u0001"}, m28850d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Z)V", "parent", "", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "start", "()Z", Constant.ServiceAPIName.onStart, "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "", "", "message", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/JobNode;", "node", "removeNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/JobNode;)V", "removeNode", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancellationExceptionMessage", "()Ljava/lang/String;", "(Ljava/lang/Throwable;)Z", "cancelInternal", "(Ljava/lang/Throwable;)V", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "childCancelled", "cancelCoroutine", "", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "getChildJobCancellationCause", "proposedUpdate", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "makeCompletingOnce", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "handleJobException", RemoteConfigConstants.ResponseFieldKey.STATE, "onCompletionInternal", "(Ljava/lang/Object;)V", "afterCompletion", "toString", "toDebugString", "nameString$kotlinx_coroutines_core", "nameString", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "awaitInternal", "Lkotlinx/coroutines/JobSupport$c;", OperatorName.NON_STROKING_CMYK, "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "exceptions", OperatorName.ENDPATH, "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/Incomplete;", "update", "D", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", OperatorName.NON_STROKING_GRAY, "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/NodeList;", CollectionUtils.LIST_TYPE, "u", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", OperatorName.FILL_NON_ZERO, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "B", "(Ljava/lang/Object;)I", OperatorName.CLOSE_AND_STROKE, "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "expect", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "LnR;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(LnR;)V", "z", "p", OperatorName.SAVE, "Lkotlinx/coroutines/selects/SelectInstance;", "select", "ignoredParam", "A", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "d", OperatorName.SET_LINE_JOINSTYLE, "(Ljava/lang/Object;)Ljava/lang/Throwable;", PDPageLabelRange.STYLE_ROMAN_LOWER, "o", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", ExifInterface.LONGITUDE_EAST, "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "F", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", OperatorName.STROKING_COLOR_GRAY, "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/ChildHandleNode;", OperatorName.LINE_TO, "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "H", "(Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "lastChild", "i", "(Lkotlinx/coroutines/JobSupport$c;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "t", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "C", "(Ljava/lang/Object;)Ljava/lang/String;", OperatorName.CURVE_TO, "x", "result", OperatorName.SET_LINE_WIDTH, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", Action.KEY_ATTRIBUTE, "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/Job;", "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "onJoin", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "isScopedCoroutine", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isCompletedExceptionally", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "onAwaitInternal", OperatorName.MOVE_TO, "exceptionOrNull", "Lkotlinx/atomicfu/AtomicRef;", "_parentHandle", "_state", "e", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1451:1\n705#1,2:1458\n366#1,2:1468\n368#1,4:1473\n372#1,4:1479\n376#1,2:1486\n366#1,2:1488\n368#1,4:1493\n372#1,4:1499\n376#1,2:1506\n177#1,2:1515\n706#1:1517\n177#1,2:1518\n177#1,2:1537\n177#1,2:1552\n705#1,2:1554\n705#1,2:1556\n177#1,2:1558\n705#1,2:1560\n177#1,2:1562\n177#1,2:1569\n177#1,2:1571\n1#2:1452\n1#2:1477\n1#2:1497\n28#3,4:1453\n28#3,4:1520\n28#3,4:1564\n28#3,4:1573\n20#4:1457\n20#4:1524\n20#4:1568\n20#4:1577\n288#5,2:1460\n288#5,2:1462\n19#6:1464\n162#7:1465\n162#7:1466\n153#7,4:1580\n75#8:1467\n75#8:1478\n75#8:1498\n75#8:1511\n341#9,3:1470\n344#9,3:1483\n341#9,3:1490\n344#9,3:1503\n341#9,3:1508\n344#9,3:1512\n47#10:1525\n22#11:1526\n22#11:1527\n13#11:1548\n13#11:1551\n13#11:1578\n13#11:1579\n13#11:1584\n13#11:1585\n134#12:1528\n73#12,3:1529\n135#12,5:1532\n314#13,9:1539\n323#13,2:1549\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n249#1:1458,2\n331#1:1468,2\n331#1:1473,4\n331#1:1479,4\n331#1:1486,2\n363#1:1488,2\n363#1:1493,4\n363#1:1499,4\n363#1:1506,2\n380#1:1515,2\n425#1:1517\n460#1:1518,2\n552#1:1537,2\n593#1:1552,2\n620#1:1554,2\n629#1:1556,2\n693#1:1558,2\n722#1:1560,2\n735#1:1562,2\n808#1:1569,2\n830#1:1571,2\n331#1:1477\n363#1:1497\n212#1:1453,4\n477#1:1520,4\n738#1:1564,4\n883#1:1573,4\n212#1:1457\n477#1:1524\n738#1:1568\n883#1:1577\n260#1:1460,2\n264#1:1462,2\n272#1:1464\n278#1:1465\n280#1:1466\n1217#1:1580,4\n283#1:1467\n331#1:1478\n363#1:1498\n371#1:1511\n331#1:1470,3\n331#1:1483,3\n363#1:1490,3\n363#1:1503,3\n367#1:1508,3\n367#1:1512,3\n482#1:1525\n494#1:1526\n504#1:1527\n560#1:1548\n576#1:1551\n923#1:1578\n973#1:1579\n1236#1:1584\n1258#1:1585\n525#1:1528\n525#1:1529,3\n525#1:1532,5\n558#1:1539,9\n558#1:1549,2\n*E\n"})
/* loaded from: classes6.dex */
public class JobSupport implements Job, ChildJob, ParentJob {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f70616a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f70617b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle");
    @Volatile
    @Nullable
    private volatile Object _parentHandle;
    @Volatile
    @Nullable
    private volatile Object _state;

    /* renamed from: kotlinx.coroutines.JobSupport$a */
    /* loaded from: classes6.dex */
    public static final class C12034a extends CancellableContinuationImpl {

        /* renamed from: f */
        public final JobSupport f70618f;

        public C12034a(Continuation continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.f70618f = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public Throwable getContinuationCancellationCause(Job job) {
            Throwable m27331d;
            Object state$kotlinx_coroutines_core = this.f70618f.getState$kotlinx_coroutines_core();
            if ((state$kotlinx_coroutines_core instanceof C12036c) && (m27331d = ((C12036c) state$kotlinx_coroutines_core).m27331d()) != null) {
                return m27331d;
            }
            if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
            }
            return job.getCancellationException();
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public String nameString() {
            return "AwaitContinuation";
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$b */
    /* loaded from: classes6.dex */
    public static final class C12035b extends JobNode {

        /* renamed from: d */
        public final JobSupport f70619d;

        /* renamed from: e */
        public final C12036c f70620e;

        /* renamed from: f */
        public final ChildHandleNode f70621f;

        /* renamed from: g */
        public final Object f70622g;

        public C12035b(JobSupport jobSupport, C12036c c12036c, ChildHandleNode childHandleNode, Object obj) {
            this.f70619d = jobSupport;
            this.f70620e = c12036c;
            this.f70621f = childHandleNode;
            this.f70622g = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th2) {
            this.f70619d.m27352i(this.f70620e, this.f70621f, this.f70622g);
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$c */
    /* loaded from: classes6.dex */
    public static final class C12036c implements Incomplete {

        /* renamed from: b */
        public static final AtomicIntegerFieldUpdater f70623b = AtomicIntegerFieldUpdater.newUpdater(C12036c.class, "_isCompleting");

        /* renamed from: c */
        public static final AtomicReferenceFieldUpdater f70624c = AtomicReferenceFieldUpdater.newUpdater(C12036c.class, Object.class, "_rootCause");

        /* renamed from: d */
        public static final AtomicReferenceFieldUpdater f70625d = AtomicReferenceFieldUpdater.newUpdater(C12036c.class, Object.class, "_exceptionsHolder");
        @Volatile
        @Nullable
        private volatile Object _exceptionsHolder;
        @Volatile
        private volatile int _isCompleting;
        @Volatile
        @Nullable
        private volatile Object _rootCause;

        /* renamed from: a */
        public final NodeList f70626a;

        public C12036c(NodeList nodeList, boolean z, Throwable th2) {
            this.f70626a = nodeList;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th2;
        }

        /* renamed from: a */
        public final void m27334a(Throwable th2) {
            Throwable m27331d = m27331d();
            if (m27331d == null) {
                m27324k(th2);
            } else if (th2 == m27331d) {
            } else {
                Object m27332c = m27332c();
                if (m27332c == null) {
                    m27325j(th2);
                } else if (m27332c instanceof Throwable) {
                    if (th2 == m27332c) {
                        return;
                    }
                    ArrayList m27333b = m27333b();
                    m27333b.add(m27332c);
                    m27333b.add(th2);
                    m27325j(m27333b);
                } else if (m27332c instanceof ArrayList) {
                    ((ArrayList) m27332c).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + m27332c).toString());
                }
            }
        }

        /* renamed from: b */
        public final ArrayList m27333b() {
            return new ArrayList(4);
        }

        /* renamed from: c */
        public final Object m27332c() {
            return f70625d.get(this);
        }

        /* renamed from: d */
        public final Throwable m27331d() {
            return (Throwable) f70624c.get(this);
        }

        /* renamed from: e */
        public final boolean m27330e() {
            if (m27331d() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m27329f() {
            if (f70623b.get(this) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m27328g() {
            Symbol symbol;
            Object m27332c = m27332c();
            symbol = JobSupportKt.f70636d;
            if (m27332c == symbol) {
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.Incomplete
        public NodeList getList() {
            return this.f70626a;
        }

        /* renamed from: h */
        public final List m27327h(Throwable th2) {
            ArrayList arrayList;
            Symbol symbol;
            Object m27332c = m27332c();
            if (m27332c == null) {
                arrayList = m27333b();
            } else if (m27332c instanceof Throwable) {
                ArrayList m27333b = m27333b();
                m27333b.add(m27332c);
                arrayList = m27333b;
            } else if (m27332c instanceof ArrayList) {
                arrayList = (ArrayList) m27332c;
            } else {
                throw new IllegalStateException(("State is " + m27332c).toString());
            }
            Throwable m27331d = m27331d();
            if (m27331d != null) {
                arrayList.add(0, m27331d);
            }
            if (th2 != null && !Intrinsics.areEqual(th2, m27331d)) {
                arrayList.add(th2);
            }
            symbol = JobSupportKt.f70636d;
            m27325j(symbol);
            return arrayList;
        }

        /* renamed from: i */
        public final void m27326i(boolean z) {
            f70623b.set(this, z ? 1 : 0);
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
            if (m27331d() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m27325j(Object obj) {
            f70625d.set(this, obj);
        }

        /* renamed from: k */
        public final void m27324k(Throwable th2) {
            f70624c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + m27330e() + ", completing=" + m27329f() + ", rootCause=" + m27331d() + ", exceptions=" + m27332c() + ", list=" + getList() + AbstractJsonLexerKt.END_LIST;
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$d */
    /* loaded from: classes6.dex */
    public final class C12037d extends JobNode {

        /* renamed from: d */
        public final SelectInstance f70627d;

        public C12037d(SelectInstance selectInstance) {
            this.f70627d = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th2) {
            Object state$kotlinx_coroutines_core = JobSupport.this.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            this.f70627d.trySelect(JobSupport.this, state$kotlinx_coroutines_core);
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$e */
    /* loaded from: classes6.dex */
    public final class C12038e extends JobNode {

        /* renamed from: d */
        public final SelectInstance f70629d;

        public C12038e(SelectInstance selectInstance) {
            this.f70629d = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th2) {
            this.f70629d.trySelect(JobSupport.this, Unit.INSTANCE);
        }
    }

    public JobSupport(boolean z) {
        this._state = z ? JobSupportKt.f70638f : JobSupportKt.f70637e;
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(JobSupport jobSupport, String str, Throwable th2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th2 = null;
            }
            if (str == null) {
                str = jobSupport.cancellationExceptionMessage();
            }
            return new JobCancellationException(str, th2, jobSupport);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    public static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    public static /* synthetic */ CancellationException toCancellationException$default(JobSupport jobSupport, Throwable th2, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return jobSupport.toCancellationException(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: A */
    public final void m27366A(SelectInstance selectInstance, Object obj) {
        if (!m27345p()) {
            selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
        } else {
            selectInstance.disposeOnCompletion(invokeOnCompletion(new C12038e(selectInstance)));
        }
    }

    /* renamed from: B */
    public final int m27365B(Object obj) {
        C12358nR c12358nR;
        if (obj instanceof C12358nR) {
            if (((C12358nR) obj).isActive()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70616a;
            c12358nR = JobSupportKt.f70638f;
            if (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, obj, c12358nR)) {
                return -1;
            }
            onStart();
            return 1;
        } else if (!(obj instanceof InactiveNodeList)) {
            return 0;
        } else {
            if (!AbstractC13055p0.m23740a(f70616a, this, obj, ((InactiveNodeList) obj).getList())) {
                return -1;
            }
            onStart();
            return 1;
        }
    }

    /* renamed from: C */
    public final String m27364C(Object obj) {
        if (obj instanceof C12036c) {
            C12036c c12036c = (C12036c) obj;
            if (c12036c.m27330e()) {
                return "Cancelling";
            }
            if (!c12036c.m27329f()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof Incomplete) {
            if (((Incomplete) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof CompletedExceptionally) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: D */
    public final boolean m27363D(Incomplete incomplete, Object obj) {
        if (!AbstractC13055p0.m23740a(f70616a, this, incomplete, JobSupportKt.boxIncomplete(obj))) {
            return false;
        }
        onCancelling(null);
        onCompletionInternal(obj);
        m27353g(incomplete, obj);
        return true;
    }

    /* renamed from: E */
    public final boolean m27362E(Incomplete incomplete, Throwable th2) {
        NodeList m27346o = m27346o(incomplete);
        if (m27346o == null) {
            return false;
        }
        if (!AbstractC13055p0.m23740a(f70616a, this, incomplete, new C12036c(m27346o, false, th2))) {
            return false;
        }
        m27340u(m27346o, th2);
        return true;
    }

    /* renamed from: F */
    public final Object m27361F(Object obj, Object obj2) {
        Symbol symbol;
        Symbol symbol2;
        if (!(obj instanceof Incomplete)) {
            symbol2 = JobSupportKt.f70633a;
            return symbol2;
        } else if (((obj instanceof C12358nR) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            if (!m27363D((Incomplete) obj, obj2)) {
                symbol = JobSupportKt.f70634b;
                return symbol;
            }
            return obj2;
        } else {
            return m27360G((Incomplete) obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: G */
    public final Object m27360G(Incomplete incomplete, Object obj) {
        C12036c c12036c;
        CompletedExceptionally completedExceptionally;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        NodeList m27346o = m27346o(incomplete);
        if (m27346o == null) {
            symbol3 = JobSupportKt.f70634b;
            return symbol3;
        }
        ?? r2 = 0;
        if (incomplete instanceof C12036c) {
            c12036c = (C12036c) incomplete;
        } else {
            c12036c = null;
        }
        if (c12036c == null) {
            c12036c = new C12036c(m27346o, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (c12036c) {
            if (c12036c.m27329f()) {
                symbol2 = JobSupportKt.f70633a;
                return symbol2;
            }
            c12036c.m27326i(true);
            if (c12036c != incomplete && !AbstractC13055p0.m23740a(f70616a, this, incomplete, c12036c)) {
                symbol = JobSupportKt.f70634b;
                return symbol;
            }
            boolean m27330e = c12036c.m27330e();
            if (obj instanceof CompletedExceptionally) {
                completedExceptionally = (CompletedExceptionally) obj;
            } else {
                completedExceptionally = null;
            }
            if (completedExceptionally != null) {
                c12036c.m27334a(completedExceptionally.cause);
            }
            Throwable m27331d = c12036c.m27331d();
            if (true ^ m27330e) {
                r2 = m27331d;
            }
            objectRef.element = r2;
            Unit unit = Unit.INSTANCE;
            if (r2 != 0) {
                m27340u(m27346o, r2);
            }
            ChildHandleNode m27349l = m27349l(incomplete);
            if (m27349l != null && m27359H(c12036c, m27349l, obj)) {
                return JobSupportKt.COMPLETING_WAITING_CHILDREN;
            }
            return m27350k(c12036c, obj);
        }
    }

    /* renamed from: H */
    public final boolean m27359H(C12036c c12036c, ChildHandleNode childHandleNode, Object obj) {
        while (Job.DefaultImpls.invokeOnCompletion$default(childHandleNode.childJob, false, false, new C12035b(this, c12036c, childHandleNode, obj), 1, null) == NonDisposableHandle.INSTANCE) {
            childHandleNode = m27341t(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m27358a(final Object obj, NodeList nodeList, final JobNode jobNode) {
        int tryCondAddNext;
        LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(jobNode) { // from class: kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            @Nullable
            public Object prepare(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
                if (this.getState$kotlinx_coroutines_core() == obj) {
                    return null;
                }
                return LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
        do {
            tryCondAddNext = nodeList.getPrevNode().tryCondAddNext(jobNode, nodeList, condAddOp);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    public void afterCompletion(@Nullable Object obj) {
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public final ChildHandle attachChild(@NotNull ChildJob childJob) {
        DisposableHandle invokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(this, true, false, new ChildHandleNode(childJob), 2, null);
        Intrinsics.checkNotNull(invokeOnCompletion$default, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (ChildHandle) invokeOnCompletion$default;
    }

    @Nullable
    public final Object awaitInternal(@NotNull Continuation<Object> continuation) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
            }
        } while (m27365B(state$kotlinx_coroutines_core) < 0);
        return m27356c(continuation);
    }

    /* renamed from: b */
    public final void m27357b(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                AbstractC5370bT.addSuppressed(th2, th3);
            }
        }
    }

    /* renamed from: c */
    public final Object m27356c(Continuation continuation) {
        C12034a c12034a = new C12034a(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), this);
        c12034a.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(c12034a, invokeOnCompletion(new C18216Ox1(c12034a)));
        Object result = c12034a.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(@Nullable Throwable th2) {
        return cancelImpl$kotlinx_coroutines_core(th2);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(@Nullable Object obj) {
        Object obj2;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        obj2 = JobSupportKt.f70633a;
        if (!getOnCancelComplete$kotlinx_coroutines_core() || (obj2 = m27355d(obj)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            symbol = JobSupportKt.f70633a;
            if (obj2 == symbol) {
                obj2 = m27343r(obj);
            }
            symbol2 = JobSupportKt.f70633a;
            if (obj2 != symbol2 && obj2 != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                symbol3 = JobSupportKt.f70635c;
                if (obj2 == symbol3) {
                    return false;
                }
                afterCompletion(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    public void cancelInternal(@NotNull Throwable th2) {
        cancelImpl$kotlinx_coroutines_core(th2);
    }

    @NotNull
    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(@NotNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (cancelImpl$kotlinx_coroutines_core(th2) && getHandlesException$kotlinx_coroutines_core()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Object m27355d(Object obj) {
        Symbol symbol;
        Object m27361F;
        Symbol symbol2;
        do {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete) || ((state$kotlinx_coroutines_core instanceof C12036c) && ((C12036c) state$kotlinx_coroutines_core).m27329f())) {
                symbol = JobSupportKt.f70633a;
                return symbol;
            }
            m27361F = m27361F(state$kotlinx_coroutines_core, new CompletedExceptionally(m27351j(obj), false, 2, null));
            symbol2 = JobSupportKt.f70634b;
        } while (m27361F == symbol2);
        return m27361F;
    }

    @NotNull
    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(@Nullable String str, @Nullable Throwable th2) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th2, this);
    }

    /* renamed from: f */
    public final boolean m27354f(Throwable th2) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th2 instanceof CancellationException;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null && parentHandle$kotlinx_coroutines_core != NonDisposableHandle.INSTANCE) {
            if (parentHandle$kotlinx_coroutines_core.childCancelled(th2) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) Job.DefaultImpls.fold(this, r, function2);
    }

    /* renamed from: g */
    public final void m27353g(Incomplete incomplete, Object obj) {
        CompletedExceptionally completedExceptionally;
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
        Throwable th2 = null;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally != null) {
            th2 = completedExceptionally.cause;
        }
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).invoke(th2);
                return;
            } catch (Throwable th3) {
                handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th3));
                return;
            }
        }
        NodeList list = incomplete.getList();
        if (list != null) {
            m27339v(list, th2);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) Job.DefaultImpls.get(this, key);
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public final CancellationException getCancellationException() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof C12036c) {
            Throwable m27331d = ((C12036c) state$kotlinx_coroutines_core).m27331d();
            if (m27331d != null) {
                CancellationException cancellationException = toCancellationException(m27331d, DebugStringsKt.getClassSimpleName(this) + " is cancelling");
                if (cancellationException != null) {
                    return cancellationException;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
            if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                return toCancellationException$default(this, ((CompletedExceptionally) state$kotlinx_coroutines_core).cause, null, 1, null);
            }
            return new JobCancellationException(DebugStringsKt.getClassSimpleName(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    @Override // kotlinx.coroutines.ParentJob
    @NotNull
    public CancellationException getChildJobCancellationCause() {
        Throwable th2;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        CancellationException cancellationException = null;
        if (state$kotlinx_coroutines_core instanceof C12036c) {
            th2 = ((C12036c) state$kotlinx_coroutines_core).m27331d();
        } else if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            th2 = ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        } else if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + m27364C(state$kotlinx_coroutines_core), th2, this);
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public final Sequence<Job> getChildren() {
        return SequencesKt__SequenceBuilderKt.sequence(new JobSupport$children$1(this, null));
    }

    @Nullable
    public final Object getCompletedInternal$kotlinx_coroutines_core() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
            if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                return JobSupportKt.unboxState(state$kotlinx_coroutines_core);
            }
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Nullable
    public final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof C12036c) {
            Throwable m27331d = ((C12036c) state$kotlinx_coroutines_core).m27331d();
            if (m27331d == null) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            return m27331d;
        } else if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
            if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
            }
            return null;
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if ((state$kotlinx_coroutines_core instanceof CompletedExceptionally) && ((CompletedExceptionally) state$kotlinx_coroutines_core).getHandled()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
            return m27348m(state$kotlinx_coroutines_core);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return Job.Key;
    }

    @NotNull
    public final SelectClause1<?> getOnAwaitInternal() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public final SelectClause0 getOnJoin() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        Intrinsics.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause0Impl(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jobSupport$onJoin$1, 3), null, 4, null);
    }

    @Override // kotlinx.coroutines.Job
    @Nullable
    public Job getParent() {
        ChildHandle parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    @Nullable
    public final ChildHandle getParentHandle$kotlinx_coroutines_core() {
        return (ChildHandle) f70617b.get(this);
    }

    @Nullable
    public final Object getState$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f70616a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public boolean handleJobException(@NotNull Throwable th2) {
        return false;
    }

    /* renamed from: i */
    public final void m27352i(C12036c c12036c, ChildHandleNode childHandleNode, Object obj) {
        ChildHandleNode m27341t = m27341t(childHandleNode);
        if (m27341t != null && m27359H(c12036c, m27341t, obj)) {
            return;
        }
        afterCompletion(m27350k(c12036c, obj));
    }

    public final void initParentJob(@Nullable Job job) {
        if (job == null) {
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
            return;
        }
        job.start();
        ChildHandle attachChild = job.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public final DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> function1) {
        return invokeOnCompletion(false, true, function1);
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if ((state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).isActive()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally) && (!(state$kotlinx_coroutines_core instanceof C12036c) || !((C12036c) state$kotlinx_coroutines_core).m27330e())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof Incomplete);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof CompletedExceptionally;
    }

    public boolean isScopedCoroutine() {
        return false;
    }

    /* renamed from: j */
    public final Throwable m27351j(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return th2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).getChildJobCancellationCause();
    }

    @Override // kotlinx.coroutines.Job
    @Nullable
    public final Object join(@NotNull Continuation<? super Unit> continuation) {
        if (!m27345p()) {
            JobKt.ensureActive(continuation.getContext());
            return Unit.INSTANCE;
        }
        Object m27344q = m27344q(continuation);
        if (m27344q == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m27344q;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public final Object m27350k(C12036c c12036c, Object obj) {
        CompletedExceptionally completedExceptionally;
        Throwable th2;
        boolean m27330e;
        Throwable m27347n;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally != null) {
            th2 = completedExceptionally.cause;
        } else {
            th2 = null;
        }
        synchronized (c12036c) {
            m27330e = c12036c.m27330e();
            List m27327h = c12036c.m27327h(th2);
            m27347n = m27347n(c12036c, m27327h);
            if (m27347n != null) {
                m27357b(m27347n, m27327h);
            }
        }
        if (m27347n != null && m27347n != th2) {
            obj = new CompletedExceptionally(m27347n, false, 2, null);
        }
        if (m27347n != null && (m27354f(m27347n) || handleJobException(m27347n))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((CompletedExceptionally) obj).makeHandled();
        }
        if (!m27330e) {
            onCancelling(m27347n);
        }
        onCompletionInternal(obj);
        AbstractC13055p0.m23740a(f70616a, this, c12036c, JobSupportKt.boxIncomplete(obj));
        m27353g(c12036c, obj);
        return obj;
    }

    /* renamed from: l */
    public final ChildHandleNode m27349l(Incomplete incomplete) {
        ChildHandleNode childHandleNode;
        if (incomplete instanceof ChildHandleNode) {
            childHandleNode = (ChildHandleNode) incomplete;
        } else {
            childHandleNode = null;
        }
        if (childHandleNode == null) {
            NodeList list = incomplete.getList();
            if (list == null) {
                return null;
            }
            return m27341t(list);
        }
        return childHandleNode;
    }

    /* renamed from: m */
    public final Throwable m27348m(Object obj) {
        CompletedExceptionally completedExceptionally;
        if (obj instanceof CompletedExceptionally) {
            completedExceptionally = (CompletedExceptionally) obj;
        } else {
            completedExceptionally = null;
        }
        if (completedExceptionally == null) {
            return null;
        }
        return completedExceptionally.cause;
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(@Nullable Object obj) {
        Object m27361F;
        Symbol symbol;
        Symbol symbol2;
        do {
            m27361F = m27361F(getState$kotlinx_coroutines_core(), obj);
            symbol = JobSupportKt.f70633a;
            if (m27361F == symbol) {
                return false;
            }
            if (m27361F != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
                symbol2 = JobSupportKt.f70634b;
            } else {
                return true;
            }
        } while (m27361F == symbol2);
        afterCompletion(m27361F);
        return true;
    }

    @Nullable
    public final Object makeCompletingOnce$kotlinx_coroutines_core(@Nullable Object obj) {
        Object m27361F;
        Symbol symbol;
        Symbol symbol2;
        do {
            m27361F = m27361F(getState$kotlinx_coroutines_core(), obj);
            symbol = JobSupportKt.f70633a;
            if (m27361F != symbol) {
                symbol2 = JobSupportKt.f70634b;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m27348m(obj));
            }
        } while (m27361F == symbol2);
        return m27361F;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return Job.DefaultImpls.minusKey(this, key);
    }

    /* renamed from: n */
    public final Throwable m27347n(C12036c c12036c, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!c12036c.m27330e()) {
                return null;
            }
            return new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @NotNull
    public String nameString$kotlinx_coroutines_core() {
        return DebugStringsKt.getClassSimpleName(this);
    }

    /* renamed from: o */
    public final NodeList m27346o(Incomplete incomplete) {
        NodeList list = incomplete.getList();
        if (list == null) {
            if (incomplete instanceof C12358nR) {
                return new NodeList();
            }
            if (incomplete instanceof JobNode) {
                m27335z((JobNode) incomplete);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + incomplete).toString());
        }
        return list;
    }

    public void onCancelling(@Nullable Throwable th2) {
    }

    public void onCompletionInternal(@Nullable Object obj) {
    }

    public void onStart() {
    }

    /* renamed from: p */
    public final boolean m27345p() {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                return false;
            }
        } while (m27365B(state$kotlinx_coroutines_core) < 0);
        return true;
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(@NotNull ParentJob parentJob) {
        cancelImpl$kotlinx_coroutines_core(parentJob);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return Job.DefaultImpls.plus(this, coroutineContext);
    }

    /* renamed from: q */
    public final Object m27344q(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, invokeOnCompletion(new C18280Px1(cancellableContinuationImpl)));
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public final Object m27343r(Object obj) {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        Symbol symbol6;
        Throwable th2 = null;
        Throwable th3 = null;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof C12036c) {
                synchronized (state$kotlinx_coroutines_core) {
                    if (((C12036c) state$kotlinx_coroutines_core).m27328g()) {
                        symbol2 = JobSupportKt.f70635c;
                        return symbol2;
                    }
                    boolean m27330e = ((C12036c) state$kotlinx_coroutines_core).m27330e();
                    if (obj != null || !m27330e) {
                        if (th3 == null) {
                            th3 = m27351j(obj);
                        }
                        ((C12036c) state$kotlinx_coroutines_core).m27334a(th3);
                    }
                    Throwable m27331d = ((C12036c) state$kotlinx_coroutines_core).m27331d();
                    if (!m27330e) {
                        th2 = m27331d;
                    }
                    if (th2 != null) {
                        m27340u(((C12036c) state$kotlinx_coroutines_core).getList(), th2);
                    }
                    symbol = JobSupportKt.f70633a;
                    return symbol;
                }
            } else if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                symbol3 = JobSupportKt.f70635c;
                return symbol3;
            } else {
                if (th3 == null) {
                    th3 = m27351j(obj);
                }
                Incomplete incomplete = (Incomplete) state$kotlinx_coroutines_core;
                if (incomplete.isActive()) {
                    if (m27362E(incomplete, th3)) {
                        symbol4 = JobSupportKt.f70633a;
                        return symbol4;
                    }
                } else {
                    Object m27361F = m27361F(state$kotlinx_coroutines_core, new CompletedExceptionally(th3, false, 2, null));
                    symbol5 = JobSupportKt.f70633a;
                    if (m27361F != symbol5) {
                        symbol6 = JobSupportKt.f70634b;
                        if (m27361F != symbol6) {
                            return m27361F;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    public final void removeNode$kotlinx_coroutines_core(@NotNull JobNode jobNode) {
        Object state$kotlinx_coroutines_core;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C12358nR c12358nR;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof JobNode) {
                if (state$kotlinx_coroutines_core != jobNode) {
                    return;
                }
                atomicReferenceFieldUpdater = f70616a;
                c12358nR = JobSupportKt.f70638f;
            } else if ((state$kotlinx_coroutines_core instanceof Incomplete) && ((Incomplete) state$kotlinx_coroutines_core).getList() != null) {
                jobNode.remove();
                return;
            } else {
                return;
            }
        } while (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, state$kotlinx_coroutines_core, c12358nR));
    }

    /* renamed from: s */
    public final JobNode m27342s(Function1 function1, boolean z) {
        JobNode jobNode = null;
        if (z) {
            if (function1 instanceof JobCancellingNode) {
                jobNode = (JobCancellingNode) function1;
            }
            if (jobNode == null) {
                jobNode = new C21451og0(function1);
            }
        } else {
            if (function1 instanceof JobNode) {
                jobNode = (JobNode) function1;
            }
            if (jobNode == null) {
                jobNode = new C21623pg0(function1);
            }
        }
        jobNode.setJob(this);
        return jobNode;
    }

    public final void setParentHandle$kotlinx_coroutines_core(@Nullable ChildHandle childHandle) {
        f70617b.set(this, childHandle);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int m27365B;
        do {
            m27365B = m27365B(getState$kotlinx_coroutines_core());
            if (m27365B == 0) {
                return false;
            }
        } while (m27365B != 1);
        return true;
    }

    /* renamed from: t */
    public final ChildHandleNode m27341t(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    @NotNull
    public final CancellationException toCancellationException(@NotNull Throwable th2, @Nullable String str) {
        CancellationException cancellationException;
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            cancellationException = new JobCancellationException(str, th2, this);
        }
        return cancellationException;
    }

    @InternalCoroutinesApi
    @NotNull
    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + m27364C(getState$kotlinx_coroutines_core()) + '}';
    }

    @NotNull
    public String toString() {
        return toDebugString() + '@' + DebugStringsKt.getHexAddress(this);
    }

    /* renamed from: u */
    public final void m27340u(NodeList nodeList, Throwable th2) {
        onCancelling(th2);
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if (lockFreeLinkedListNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNode;
                try {
                    jobNode.invoke(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        AbstractC5370bT.addSuppressed(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        m27354f(th2);
    }

    /* renamed from: v */
    public final void m27339v(NodeList nodeList, Throwable th2) {
        Object next = nodeList.getNext();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !Intrinsics.areEqual(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if (lockFreeLinkedListNode instanceof JobNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNode;
                try {
                    jobNode.invoke(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        AbstractC5370bT.addSuppressed(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
    }

    /* renamed from: w */
    public final Object m27338w(Object obj, Object obj2) {
        if (!(obj2 instanceof CompletedExceptionally)) {
            return obj2;
        }
        throw ((CompletedExceptionally) obj2).cause;
    }

    /* renamed from: x */
    public final void m27337x(SelectInstance selectInstance, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof Incomplete)) {
                if (!(state$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                    state$kotlinx_coroutines_core = JobSupportKt.unboxState(state$kotlinx_coroutines_core);
                }
                selectInstance.selectInRegistrationPhase(state$kotlinx_coroutines_core);
                return;
            }
        } while (m27365B(state$kotlinx_coroutines_core) < 0);
        selectInstance.disposeOnCompletion(invokeOnCompletion(new C12037d(selectInstance)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.InactiveNodeList] */
    /* renamed from: y */
    public final void m27336y(C12358nR c12358nR) {
        NodeList nodeList = new NodeList();
        if (!c12358nR.isActive()) {
            nodeList = new InactiveNodeList(nodeList);
        }
        AbstractC13055p0.m23740a(f70616a, this, c12358nR, nodeList);
    }

    /* renamed from: z */
    public final void m27335z(JobNode jobNode) {
        jobNode.addOneIfEmpty(new NodeList());
        AbstractC13055p0.m23740a(f70616a, this, jobNode, jobNode.getNextNode());
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(Throwable th2) {
        Throwable jobCancellationException;
        if (th2 == null || (jobCancellationException = toCancellationException$default(this, th2, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        JobNode m27342s = m27342s(function1, z);
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof C12358nR) {
                C12358nR c12358nR = (C12358nR) state$kotlinx_coroutines_core;
                if (c12358nR.isActive()) {
                    if (AbstractC13055p0.m23740a(f70616a, this, state$kotlinx_coroutines_core, m27342s)) {
                        return m27342s;
                    }
                } else {
                    m27336y(c12358nR);
                }
            } else {
                if (state$kotlinx_coroutines_core instanceof Incomplete) {
                    NodeList list = ((Incomplete) state$kotlinx_coroutines_core).getList();
                    if (list == null) {
                        Intrinsics.checkNotNull(state$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m27335z((JobNode) state$kotlinx_coroutines_core);
                    } else {
                        DisposableHandle disposableHandle = NonDisposableHandle.INSTANCE;
                        if (z && (state$kotlinx_coroutines_core instanceof C12036c)) {
                            synchronized (state$kotlinx_coroutines_core) {
                                try {
                                    r3 = ((C12036c) state$kotlinx_coroutines_core).m27331d();
                                    if (r3 != null) {
                                        if ((function1 instanceof ChildHandleNode) && !((C12036c) state$kotlinx_coroutines_core).m27329f()) {
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    if (m27358a(state$kotlinx_coroutines_core, list, m27342s)) {
                                        if (r3 == null) {
                                            return m27342s;
                                        }
                                        disposableHandle = m27342s;
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (r3 != null) {
                            if (z2) {
                                function1.invoke(r3);
                            }
                            return disposableHandle;
                        } else if (m27358a(state$kotlinx_coroutines_core, list, m27342s)) {
                            return m27342s;
                        }
                    }
                } else {
                    if (z2) {
                        CompletedExceptionally completedExceptionally = state$kotlinx_coroutines_core instanceof CompletedExceptionally ? (CompletedExceptionally) state$kotlinx_coroutines_core : null;
                        function1.invoke(completedExceptionally != null ? completedExceptionally.cause : null);
                    }
                    return NonDisposableHandle.INSTANCE;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public Job plus(@NotNull Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(@NotNull Throwable th2) {
        throw th2;
    }
}
