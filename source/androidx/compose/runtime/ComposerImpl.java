package androidx.compose.runtime;

import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0002Û\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004ª\u0001ë\u0001Bï\u0001\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012Y\u0010\u0015\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140\u000b\u0012Y\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0017¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\"\u0010 J!\u0010%\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0017¢\u0006\u0004\b'\u0010 J\u000f\u0010)\u001a\u00020\u0013H\u0000¢\u0006\u0004\b(\u0010 J\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010 J\u000f\u0010,\u001a\u00020\u0013H\u0000¢\u0006\u0004\b+\u0010 J\u000f\u00100\u001a\u00020-H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u0010 J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u0010 J#\u00106\u001a\u00020\u0013\"\u0004\b\u0000\u001032\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u0010 J\u000f\u00109\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u0010 J!\u0010:\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b:\u0010&J\u000f\u0010;\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u0010 J\u000f\u0010<\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010 J\u000f\u0010=\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u0010 J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u001bH\u0016¢\u0006\u0004\b?\u0010\u001eJB\u0010E\u001a\u00020\u0013\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u001032\u0006\u0010A\u001a\u00028\u00002\u001d\u0010D\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130B¢\u0006\u0002\bCH\u0016¢\u0006\u0004\bE\u0010FJ#\u0010I\u001a\u00020#2\b\u0010G\u001a\u0004\u0018\u00010#2\b\u0010H\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\bI\u0010JJ\u0011\u0010K\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020-2\b\u0010A\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020-2\b\u0010A\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\bO\u0010NJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020PH\u0017¢\u0006\u0004\bM\u0010QJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020RH\u0017¢\u0006\u0004\bM\u0010SJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020TH\u0017¢\u0006\u0004\bM\u0010UJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020-H\u0017¢\u0006\u0004\bM\u0010VJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020WH\u0017¢\u0006\u0004\bM\u0010XJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020YH\u0017¢\u0006\u0004\bM\u0010ZJ\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020[H\u0017¢\u0006\u0004\bM\u0010\\J\u0017\u0010M\u001a\u00020-2\u0006\u0010A\u001a\u00020\u001bH\u0017¢\u0006\u0004\bM\u0010]J/\u0010_\u001a\u00028\u0000\"\u0004\b\u0000\u001032\u0006\u0010^\u001a\u00020-2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u0019\u0010a\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\ba\u0010bJ\u0019\u0010c\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\bc\u0010bJ\u001d\u0010e\u001a\u00020\u00132\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001304H\u0016¢\u0006\u0004\be\u00107J#\u0010i\u001a\u00020\u00132\u0012\u0010h\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030g0fH\u0017¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0013H\u0017¢\u0006\u0004\bk\u0010 J#\u0010m\u001a\u00028\u0000\"\u0004\b\u0000\u001032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000lH\u0017¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u0004H\u0016¢\u0006\u0004\bo\u0010pJ!\u0010v\u001a\u00020-2\u0006\u0010r\u001a\u00020q2\b\u0010s\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\bt\u0010uJ\u000f\u0010y\u001a\u00020\u001bH\u0000¢\u0006\u0004\bw\u0010xJ\u000f\u0010z\u001a\u00020\u0013H\u0017¢\u0006\u0004\bz\u0010 J\u000f\u0010{\u001a\u00020\u0013H\u0017¢\u0006\u0004\b{\u0010 J\u0017\u0010|\u001a\u00020\u00132\u0006\u0010M\u001a\u00020-H\u0017¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b~\u0010\u007fJ\u0015\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J*\u0010\u0085\u0001\u001a\u00020\u00132\u000b\u0010A\u001a\u0007\u0012\u0002\b\u00030\u0083\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J3\u0010\u008b\u0001\u001a\u00020\u00132\u001f\u0010\u008a\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u0089\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0088\u00010\u0087\u0001H\u0017¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u00132\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0017¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J$\u0010\u0090\u0001\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0017¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0011\u0010\u0092\u0001\u001a\u00020\u0013H\u0017¢\u0006\u0005\b\u0092\u0001\u0010 J\u0011\u0010\u0093\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0093\u0001\u0010 JF\u0010\u009b\u0001\u001a\u00020\u00132\u001d\u0010\u0096\u0001\u001a\u0018\u0012\u0004\u0012\u00020q\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020#\u0018\u00010\u0095\u00010\u0094\u00012\u0013\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001304¢\u0006\u0003\b\u0097\u0001H\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009d\u0001\u001a\u00020\u00132\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001304H\u0000¢\u0006\u0005\b\u009c\u0001\u00107J1\u0010 \u0001\u001a\u00020-2\u001d\u0010\u0096\u0001\u001a\u0018\u0012\u0004\u0012\u00020q\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020#\u0018\u00010\u0095\u00010\u0094\u0001H\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0011\u0010¢\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0005\b¡\u0001\u0010 J\u0013\u0010£\u0001\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0005\b£\u0001\u0010LJ\u001b\u0010¤\u0001\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0005\b¤\u0001\u0010bJ\u001b\u0010¦\u0001\u001a\u00020\u00132\u0007\u0010r\u001a\u00030¥\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b¨\u0001\u0010 J\u0011\u0010©\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b©\u0001\u0010 J\u0011\u0010ª\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bª\u0001\u0010 J\u0019\u0010«\u0001\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0005\b«\u0001\u0010\u001eJ#\u0010¬\u0001\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0005\b¬\u0001\u0010&J\u0011\u0010\u00ad\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u00ad\u0001\u0010 J\u0011\u0010®\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b®\u0001\u0010 J\u0013\u0010°\u0001\u001a\u00030¯\u0001H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010³\u0001\u001a\u00030¯\u00012\u0007\u0010²\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J'\u0010·\u0001\u001a\u00030¯\u00012\b\u0010µ\u0001\u001a\u00030¯\u00012\b\u0010¶\u0001\u001a\u00030¯\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0011\u0010¹\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b¹\u0001\u0010 J\u0011\u0010º\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bº\u0001\u0010 J&\u0010½\u0001\u001a\u00020\u00132\u0007\u0010»\u0001\u001a\u00020-2\t\u0010¼\u0001\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J@\u0010Â\u0001\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\t\u0010¿\u0001\u001a\u0004\u0018\u00010#2\b\u0010Á\u0001\u001a\u00030À\u00012\t\u0010¼\u0001\u001a\u0004\u0018\u00010#H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J'\u0010Æ\u0001\u001a\u00020\u00132\u0007\u0010»\u0001\u001a\u00020-2\n\u0010Å\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J$\u0010Ê\u0001\u001a\u00020\u00132\u0007\u0010È\u0001\u001a\u00020\u001b2\u0007\u0010É\u0001\u001a\u00020-H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001a\u0010Ì\u0001\u001a\u00020\u00132\u0007\u0010»\u0001\u001a\u00020-H\u0002¢\u0006\u0005\bÌ\u0001\u0010}J\u0011\u0010Í\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bÍ\u0001\u0010 J\u001b\u0010Ï\u0001\u001a\u00020\u001b2\u0007\u0010Î\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J$\u0010Ò\u0001\u001a\u00020\u00132\u0007\u0010²\u0001\u001a\u00020\u001b2\u0007\u0010Ñ\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J6\u0010×\u0001\u001a\u00020\u001b2\u0007\u0010Ô\u0001\u001a\u00020\u001b2\u0007\u0010²\u0001\u001a\u00020\u001b2\u0007\u0010Õ\u0001\u001a\u00020\u001b2\u0007\u0010Ö\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u001b\u0010Ù\u0001\u001a\u00020\u001b2\u0007\u0010²\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bÙ\u0001\u0010Ð\u0001J$\u0010Û\u0001\u001a\u00020\u00132\u0007\u0010²\u0001\u001a\u00020\u001b2\u0007\u0010Ú\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bÛ\u0001\u0010Ó\u0001J\u0011\u0010Ü\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bÜ\u0001\u0010 J-\u0010à\u0001\u001a\u00020\u00132\u0007\u0010Ý\u0001\u001a\u00020\u001b2\u0007\u0010Þ\u0001\u001a\u00020\u001b2\u0007\u0010ß\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J$\u0010ã\u0001\u001a\u00020\u00132\u0007\u0010²\u0001\u001a\u00020\u001b2\u0007\u0010â\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bã\u0001\u0010Ó\u0001J-\u0010å\u0001\u001a\u00020\u001b2\u0007\u0010²\u0001\u001a\u00020\u001b2\u0007\u0010Õ\u0001\u001a\u00020\u001b2\u0007\u0010ä\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bå\u0001\u0010æ\u0001J \u0010è\u0001\u001a\u00020\u001b*\u00030ç\u00012\u0007\u0010²\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bè\u0001\u0010é\u0001J\u0011\u0010ê\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bê\u0001\u0010 J\u0011\u0010ë\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bë\u0001\u0010 JB\u0010î\u0001\u001a\u00020\u00132\u0010\u0010\u0098\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010#0\u0083\u00012\b\u0010ì\u0001\u001a\u00030¯\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010#2\u0007\u0010í\u0001\u001a\u00020-H\u0002¢\u0006\u0006\bî\u0001\u0010ï\u0001J3\u0010ð\u0001\u001a\u00020\u00132\u001f\u0010\u008a\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u0089\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0088\u00010\u0087\u0001H\u0002¢\u0006\u0006\bð\u0001\u0010\u008c\u0001Jv\u0010õ\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010ñ\u00012\u000b\b\u0002\u0010ò\u0001\u001a\u0004\u0018\u00010\u00172\u000b\b\u0002\u0010ó\u0001\u001a\u0004\u0018\u00010\u00172\u000b\b\u0002\u0010Î\u0001\u001a\u0004\u0018\u00010\u001b2&\b\u0002\u0010ô\u0001\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020q\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020#\u0018\u00010\u0095\u00010\u0088\u00010\u0087\u00012\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0002¢\u0006\u0006\bõ\u0001\u0010ö\u0001JH\u0010÷\u0001\u001a\u00020\u00132\u001d\u0010\u0096\u0001\u001a\u0018\u0012\u0004\u0012\u00020q\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020#\u0018\u00010\u0095\u00010\u0094\u00012\u0015\u0010\u0098\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u000104¢\u0006\u0003\b\u0097\u0001H\u0002¢\u0006\u0006\b÷\u0001\u0010\u009a\u0001J\"\u0010ø\u0001\u001a\u0004\u0018\u00010#*\u00030ç\u00012\u0007\u0010Î\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0006\bø\u0001\u0010ù\u0001J\u0011\u0010ú\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bú\u0001\u0010 J\u0011\u0010û\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\bû\u0001\u0010 Jh\u0010ý\u0001\u001a\u00020\u00132T\u0010ü\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014H\u0002¢\u0006\u0006\bý\u0001\u0010þ\u0001Jh\u0010ÿ\u0001\u001a\u00020\u00132T\u0010ü\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014H\u0002¢\u0006\u0006\bÿ\u0001\u0010þ\u0001Jh\u0010\u0080\u0002\u001a\u00020\u00132T\u0010ü\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014H\u0002¢\u0006\u0006\b\u0080\u0002\u0010þ\u0001Js\u0010\u0082\u0002\u001a\u00020\u00132\t\b\u0002\u0010\u0081\u0002\u001a\u00020-2T\u0010ü\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014H\u0002¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u0011\u0010\u0084\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0084\u0002\u0010 J#\u0010\u0086\u0002\u001a\u00020\u00132\u000f\u0010\u0085\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0fH\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J\u0011\u0010\u0088\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0088\u0002\u0010 J\u001c\u0010\u008a\u0002\u001a\u00020\u00132\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0005\b\u008a\u0002\u0010bJ\u0011\u0010\u008b\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u008b\u0002\u0010 J\u001c\u0010\u008c\u0002\u001a\u00020\u00132\t\b\u0002\u0010\u0081\u0002\u001a\u00020-H\u0002¢\u0006\u0005\b\u008c\u0002\u0010}J\u001c\u0010ñ\u0001\u001a\u00020\u00132\b\u0010\u008e\u0002\u001a\u00030\u008d\u0002H\u0002¢\u0006\u0006\bñ\u0001\u0010\u008f\u0002Jh\u0010\u0090\u0002\u001a\u00020\u00132T\u0010ü\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014H\u0002¢\u0006\u0006\b\u0090\u0002\u0010þ\u0001Jh\u0010\u0091\u0002\u001a\u00020\u00132T\u0010ü\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014H\u0002¢\u0006\u0006\b\u0091\u0002\u0010þ\u0001J\u0011\u0010\u0092\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0092\u0002\u0010 J\u0011\u0010\u0093\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0093\u0002\u0010 J\u001a\u0010\u0095\u0002\u001a\u00020\u00132\u0007\u0010\u0094\u0002\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0095\u0002\u0010\u001eJ$\u0010\u0097\u0002\u001a\u00020\u00132\b\u0010\u0096\u0002\u001a\u00030\u0089\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J\u0011\u0010\u0099\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0099\u0002\u0010 J\u001a\u0010\u009b\u0002\u001a\u00020\u00132\u0007\u0010\u009a\u0002\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u009b\u0002\u0010\u001eJ\u0011\u0010\u009c\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u009c\u0002\u0010 J\u0011\u0010\u009d\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u009d\u0002\u0010 J\u0011\u0010\u009e\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u009e\u0002\u0010 J\u0011\u0010\u009f\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u009f\u0002\u0010 J\u0011\u0010 \u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b \u0002\u0010 J\"\u0010@\u001a\u00020\u00132\u0007\u0010¡\u0002\u001a\u00020\u001b2\u0007\u0010Ú\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b@\u0010Ó\u0001J+\u00103\u001a\u00020\u00132\u0007\u0010ò\u0001\u001a\u00020\u001b2\u0007\u0010ó\u0001\u001a\u00020\u001b2\u0007\u0010Ú\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b3\u0010á\u0001J\u0011\u0010¢\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0005\b¢\u0002\u0010 J0\u0010¤\u0002\u001a\u00020\u00132\u0007\u0010£\u0002\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010#2\t\u0010¼\u0001\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0006\b¤\u0002\u0010¥\u0002J\u001a\u0010§\u0002\u001a\u00020\u00132\u0007\u0010¦\u0002\u001a\u00020\u001bH\u0002¢\u0006\u0005\b§\u0002\u0010\u001eJ0\u0010¨\u0002\u001a\u00020\u00132\u0007\u0010£\u0002\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010#2\t\u0010¼\u0001\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0006\b¨\u0002\u0010¥\u0002J\u001a\u0010©\u0002\u001a\u00020\u00132\u0007\u0010£\u0002\u001a\u00020\u001bH\u0002¢\u0006\u0005\b©\u0002\u0010\u001eR\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010\u00ad\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010®\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010¯\u0002Rk\u0010\u0015\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010°\u0002Rk\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010°\u0002R\u001e\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0002\u001a\u0006\b²\u0002\u0010³\u0002R!\u0010¶\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ä\u00010´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010µ\u0002R\u001c\u0010¸\u0002\u001a\u0005\u0018\u00010Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010·\u0002R\u0019\u0010¡\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010¹\u0002R\u001a\u0010¼\u0002\u001a\u00030º\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010»\u0002R\u0019\u0010½\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¹\u0002R\u001a\u0010¾\u0002\u001a\u00030º\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010»\u0002R\u001c\u0010Á\u0002\u001a\u0005\u0018\u00010¿\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010À\u0002R;\u0010Å\u0002\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010Â\u0002j\u0011\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u0001`Ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ä\u0002R\u0018\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Æ\u0002R\u0019\u0010Ç\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010Æ\u0002R\u0019\u0010É\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010Æ\u0002R\u001e\u0010ô\u0001\u001a\t\u0012\u0005\u0012\u00030Ê\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010°\u0002R\u0018\u0010Ë\u0002\u001a\u00030º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010»\u0002R\u001a\u0010Î\u0002\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u001f\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030¯\u00010Ï\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0002\u0010Ñ\u0002R\u0019\u0010Ô\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010Æ\u0002R\u0018\u0010Õ\u0002\u001a\u00030º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010»\u0002R\u0019\u0010Ö\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010Æ\u0002R\u0019\u0010×\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010¹\u0002R\u0019\u0010Ø\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010¹\u0002R\u0019\u0010Ù\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010¹\u0002R\u0019\u0010Ú\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010Æ\u0002R\u0018\u0010Ý\u0002\u001a\u00030Û\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010Ü\u0002R\u001e\u0010Þ\u0002\u001a\t\u0012\u0004\u0012\u00020q0´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010µ\u0002R)\u0010â\u0002\u001a\u00020-2\u0007\u0010ß\u0002\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bà\u0002\u0010Æ\u0002\u001a\u0005\bá\u0002\u0010/R)\u0010ä\u0002\u001a\u00020-2\u0007\u0010ß\u0002\u001a\u00020-8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0084\u0002\u0010Æ\u0002\u001a\u0005\bã\u0002\u0010/R\u001a\u0010æ\u0002\u001a\u00030ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010å\u0002R)\u0010ë\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¹\u0002\u0010®\u0002\u001a\u0006\bç\u0002\u0010è\u0002\"\u0006\bé\u0002\u0010ê\u0002R\u0019\u0010í\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010ì\u0002R\u0019\u0010î\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010Æ\u0002R\u001c\u0010ï\u0002\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010Í\u0002R~\u0010ó\u0002\u001aW\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u0014\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010°\u0002\u001a\u0006\bð\u0002\u0010ñ\u0002\"\u0006\bò\u0002\u0010\u008c\u0001R\u001a\u0010õ\u0002\u001a\u00030\u008d\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010ô\u0002Rj\u0010ö\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010°\u0002R0\u0010É\u0001\u001a\u00020-2\u0007\u0010ß\u0002\u001a\u00020-8\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\b\u009e\u0002\u0010Æ\u0002\u0012\u0005\bø\u0002\u0010 \u001a\u0005\b÷\u0002\u0010/R0\u0010û\u0002\u001a\u00020\u001b2\u0007\u0010ß\u0002\u001a\u00020\u001b8\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\b\u0090\u0002\u0010¹\u0002\u0012\u0005\bú\u0002\u0010 \u001a\u0005\bù\u0002\u0010xR\u0019\u0010ü\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010¹\u0002R\"\u0010ý\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010#0´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010µ\u0002R\u0018\u0010þ\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010¹\u0002R\u0019\u0010ÿ\u0002\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010Æ\u0002R\u0018\u0010\u0080\u0003\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010Æ\u0002R\u0018\u0010\u0081\u0003\u001a\u00030º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010»\u0002Rk\u0010\u0082\u0003\u001aV\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fj\u0002`\u00140´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010µ\u0002R\u0019\u0010\u0083\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010¹\u0002R\u0019\u0010\u0084\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010¹\u0002R\u0019\u0010\u0085\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010¹\u0002R\u0019\u0010\u0086\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010¹\u0002R\u0016\u0010\u0088\u0003\u001a\u00020-8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0003\u0010/R\u0016\u0010\u008a\u0003\u001a\u00020-8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0003\u0010/R\u0018\u0010\u008e\u0003\u001a\u00030\u008b\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0003\u0010\u008d\u0003R\u001d\u0010\u0091\u0003\u001a\u00020-8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0090\u0003\u0010 \u001a\u0005\b\u008f\u0003\u0010/R\u001d\u0010\u0094\u0003\u001a\u00020-8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0093\u0003\u0010 \u001a\u0005\b\u0092\u0003\u0010/R\u0016\u0010\u0096\u0003\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0003\u0010xR\u0018\u0010\u009a\u0003\u001a\u00030\u0097\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0003\u0010\u0099\u0003R\u0018\u0010\u009e\u0003\u001a\u00030\u009b\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0003\u0010\u009d\u0003R\u0016\u0010 \u0003\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0003\u0010xR\u0019\u0010£\u0003\u001a\u0004\u0018\u00010q8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¡\u0003\u0010¢\u0003R\u0013\u0010¥\u0003\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b¤\u0003\u0010/R\u001a\u0010¨\u0003\u001a\u0005\u0018\u00010¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0003\u0010§\u0003R\u0018\u0010ª\u0003\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0003\u0010LR\u001e\u0010\u0089\u0002\u001a\u0004\u0018\u00010#*\u00030ç\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010«\u0003\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006¬\u0003"}, m28850d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "changes", "lateChanges", "Landroidx/compose/runtime/ControlledComposition;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "", Action.KEY_ATTRIBUTE, "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startDefaults", "endDefaults", "", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "changesApplied$runtime_release", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", "T", "Lkotlin/Function0;", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "nextSlot", "()Ljava/lang/Object;", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(Z)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "(I)Z", "invalid", "cache", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateValue", "(Ljava/lang/Object;)V", "updateCachedValue", "effect", "recordSideEffect", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposeScopeImpl;", Action.SCOPE_ATTRIBUTE, "instance", "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "(Z)V", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "parameter", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "disableSourceInformation", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "content", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "composeContent", "prepareCompose$runtime_release", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)Z", "recompose", "verifyConsistent$runtime_release", "verifyConsistent", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "n0", OperatorName.MOVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "k0", "l0", OperatorName.LINE_TO, "h0", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", OperatorName.NON_STROKING_GRAY, "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "group", OperatorName.CLOSE_PATH, "(I)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentScope", "currentProviders", "u0", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", OperatorName.ENDPATH, OperatorName.FILL_NON_ZERO, "isNode", "data", "m0", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "j0", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/Pending;", "newPending", "o", "(ZLandroidx/compose/runtime/Pending;)V", "expectedNodeCount", "inserting", "p", "(IZ)V", OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_CAPSTYLE, FirebaseAnalytics.Param.INDEX, "x", "(I)I", "newCount", "t0", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "A", "(IIII)I", "v0", "count", "s0", "d", "oldGroup", "newGroup", "commonRoot", "b0", "(III)V", "nearestCommonRoot", OperatorName.SET_LINE_JOINSTYLE, "recomposeKey", "e", "(III)I", "Landroidx/compose/runtime/SlotReader;", OperatorName.CLOSE_AND_STROKE, "(Landroidx/compose/runtime/SlotReader;I)I", "i0", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "locals", "force", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V", "t", "R", "from", TypedValues.TransitionType.S_TO, "invalidations", "H", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "i", "z", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "w0", "x0", "change", "K", "(Lkotlin/jvm/functions/Function3;)V", "L", "X", "forParent", "Y", "(ZLkotlin/jvm/functions/Function3;)V", OperatorName.STROKING_COLOR_GRAY, "nodes", "C", "([Ljava/lang/Object;)V", "B", "node", "N", "a0", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)V", OperatorName.RESTORE, "S", "c0", "M", "groupBeingRemoved", "f0", "reference", OperatorName.TYPE3_D0, "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;)V", "e0", FirebaseAnalytics.Param.LOCATION, PDBorderStyleDictionary.STYLE_UNDERLINE, "W", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "P", OperatorName.SAVE, OperatorName.CURVE_TO, "nodeIndex", "D", "groupKey", "o0", "(ILjava/lang/Object;Ljava/lang/Object;)V", "keyHash", "p0", "q0", "r0", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "Ljava/util/List;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Landroidx/compose/runtime/Pending;", "pending", "I", "Landroidx/compose/runtime/IntStack;", "Landroidx/compose/runtime/IntStack;", "nodeIndexStack", "groupNodeCount", "groupNodeCountStack", "", "[I", "nodeCountOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeCountVirtualOverrides", "Z", "forciblyRecompose", PDPageLabelRange.STYLE_ROMAN_LOWER, "nodeExpected", "Ljg0;", "entersStack", "u", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentProvider", "Landroidx/compose/runtime/collection/IntMap;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/runtime/collection/IntMap;", "providerUpdates", OperatorName.SET_LINE_WIDTH, "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceInformationEnabled", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "derivedStateObserver", "invalidateStack", "<set-?>", "F", "isComposing$runtime_release", "isComposing", "isDisposed$runtime_release", "isDisposed", "Landroidx/compose/runtime/SlotReader;", "reader", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertTable", "Landroidx/compose/runtime/SlotWriter;", "writer", "writerHasAProvider", "providerCache", "getDeferredChanges$runtime_release", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "deferredChanges", "Landroidx/compose/runtime/Anchor;", "insertAnchor", "insertFixups", "getInserting", "getInserting$annotations", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "compoundKeyHash", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "implicitRootStart", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "recomposeScopeIdentity", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 7 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 8 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 9 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 10 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 11 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 14 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,4563:1\n3187#1,4:4602\n3197#1,6:4622\n3187#1,6:4628\n3204#1,2:4634\n3192#1:4640\n3187#1,6:4727\n1#2:4564\n146#3,8:4565\n146#3,8:4610\n146#3,4:4618\n151#3,3:4636\n162#3,8:4707\n162#3,8:4715\n146#3,4:4723\n151#3,3:4733\n46#4,5:4573\n46#4,3:4673\n50#4:4679\n4548#5,5:4578\n4548#5,5:4583\n4548#5,5:4592\n4548#5,5:4597\n4548#5,5:4653\n4548#5,5:4658\n4548#5,5:4663\n4548#5,5:4668\n4548#5,5:4692\n4548#5,5:4697\n4548#5,5:4702\n4548#5,5:4736\n4548#5,5:4741\n4548#5,5:4746\n4548#5,5:4751\n73#6:4588\n4478#7:4589\n4479#7:4590\n26#8:4591\n26#8:4756\n22#8:4757\n33#9,4:4606\n38#9:4639\n33#9,4:4641\n38#9:4652\n82#9,3:4758\n33#9,4:4761\n85#9,2:4765\n38#9:4767\n87#9:4768\n108#10,7:4645\n153#11,3:4676\n157#11:4680\n1002#12,2:4681\n1855#12,2:4769\n377#13,6:4683\n383#13,2:4690\n48#14:4689\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3032#1:4602,4\n3141#1:4622,6\n3147#1:4628,6\n3141#1:4634,2\n3032#1:4640\n3804#1:4727,6\n1292#1:4565,8\n3060#1:4610,8\n3140#1:4618,4\n3140#1:4636,3\n3716#1:4707,8\n3783#1:4715,8\n3802#1:4723,4\n3802#1:4733,3\n1535#1:4573,5\n3314#1:4673,3\n3314#1:4679\n1604#1:4578,5\n1631#1:4583,5\n2753#1:4592,5\n2766#1:4597,5\n3272#1:4653,5\n3277#1:4658,5\n3293#1:4663,5\n3313#1:4668,5\n3372#1:4692,5\n3379#1:4697,5\n3516#1:4702,5\n3851#1:4736,5\n3867#1:4741,5\n3868#1:4746,5\n3896#1:4751,5\n1979#1:4588\n2128#1:4589\n2152#1:4590\n2676#1:4591\n4096#1:4756\n4112#1:4757\n3034#1:4606,4\n3034#1:4639\n3223#1:4641,4\n3223#1:4652\n3616#1:4758,3\n3616#1:4761,4\n3616#1:4765,2\n3616#1:4767\n3616#1:4768\n3225#1:4645,7\n3317#1:4676,3\n3317#1:4680\n3321#1:4681,2\n3652#1:4769,2\n3337#1:4683,6\n3337#1:4690,2\n3337#1:4689\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposerImpl implements Composer {

    /* renamed from: A */
    public int f28201A;

    /* renamed from: B */
    public int f28202B;

    /* renamed from: C */
    public boolean f28203C;

    /* renamed from: D */
    public final ComposerImpl$derivedStateObserver$1 f28204D;

    /* renamed from: E */
    public final Stack f28205E;

    /* renamed from: F */
    public boolean f28206F;

    /* renamed from: G */
    public boolean f28207G;

    /* renamed from: H */
    public SlotReader f28208H;

    /* renamed from: I */
    public SlotTable f28209I;

    /* renamed from: J */
    public SlotWriter f28210J;

    /* renamed from: K */
    public boolean f28211K;

    /* renamed from: L */
    public PersistentCompositionLocalMap f28212L;

    /* renamed from: M */
    public List f28213M;

    /* renamed from: N */
    public Anchor f28214N;

    /* renamed from: O */
    public final List f28215O;

    /* renamed from: P */
    public boolean f28216P;

    /* renamed from: Q */
    public int f28217Q;

    /* renamed from: R */
    public int f28218R;

    /* renamed from: S */
    public Stack f28219S;

    /* renamed from: T */
    public int f28220T;

    /* renamed from: U */
    public boolean f28221U;

    /* renamed from: V */
    public boolean f28222V;

    /* renamed from: W */
    public final IntStack f28223W;

    /* renamed from: X */
    public final Stack f28224X;

    /* renamed from: Y */
    public int f28225Y;

    /* renamed from: Z */
    public int f28226Z;

    /* renamed from: a */
    public final Applier f28227a;

    /* renamed from: a0 */
    public int f28228a0;

    /* renamed from: b */
    public final CompositionContext f28229b;

    /* renamed from: b0 */
    public int f28230b0;

    /* renamed from: c */
    public final SlotTable f28231c;

    /* renamed from: d */
    public final Set f28232d;

    /* renamed from: e */
    public List f28233e;

    /* renamed from: f */
    public List f28234f;

    /* renamed from: g */
    public final ControlledComposition f28235g;

    /* renamed from: h */
    public final Stack f28236h;

    /* renamed from: i */
    public Pending f28237i;

    /* renamed from: j */
    public int f28238j;

    /* renamed from: k */
    public IntStack f28239k;

    /* renamed from: l */
    public int f28240l;

    /* renamed from: m */
    public IntStack f28241m;

    /* renamed from: n */
    public int[] f28242n;

    /* renamed from: o */
    public HashMap f28243o;

    /* renamed from: p */
    public boolean f28244p;

    /* renamed from: q */
    public boolean f28245q;

    /* renamed from: r */
    public boolean f28246r;

    /* renamed from: s */
    public final List f28247s;

    /* renamed from: t */
    public final IntStack f28248t;

    /* renamed from: u */
    public PersistentCompositionLocalMap f28249u;

    /* renamed from: v */
    public final IntMap f28250v;

    /* renamed from: w */
    public boolean f28251w;

    /* renamed from: x */
    public final IntStack f28252x;

    /* renamed from: y */
    public boolean f28253y;

    /* renamed from: z */
    public int f28254z;

    /* renamed from: androidx.compose.runtime.ComposerImpl$a */
    /* loaded from: classes2.dex */
    public static final class C3436a implements RememberObserver {

        /* renamed from: a */
        public final C3437b f28255a;

        public C3436a(C3437b ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.f28255a = ref;
        }

        /* renamed from: a */
        public final C3437b m60318a() {
            return this.f28255a;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.f28255a.m60317a();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.f28255a.m60317a();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    /* renamed from: androidx.compose.runtime.ComposerImpl$b */
    /* loaded from: classes2.dex */
    public final class C3437b extends CompositionContext {

        /* renamed from: a */
        public final int f28256a;

        /* renamed from: b */
        public final boolean f28257b;

        /* renamed from: c */
        public Set f28258c;

        /* renamed from: d */
        public final Set f28259d = new LinkedHashSet();

        /* renamed from: e */
        public final MutableState f28260e;

        public C3437b(int i, boolean z) {
            MutableState m31891g;
            ComposerImpl.this = r1;
            this.f28256a = i;
            this.f28257b = z;
            m31891g = AbstractC19508dK1.m31891g(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), null, 2, null);
            this.f28260e = m31891g;
        }

        /* renamed from: a */
        public final void m60317a() {
            if (!this.f28259d.isEmpty()) {
                Set<Set> set = this.f28258c;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.f28259d) {
                        for (Set set2 : set) {
                            set2.remove(composerImpl.f28231c);
                        }
                    }
                }
                this.f28259d.clear();
            }
        }

        /* renamed from: b */
        public final Set m60316b() {
            return this.f28259d;
        }

        /* renamed from: c */
        public final PersistentCompositionLocalMap m60315c() {
            return (PersistentCompositionLocalMap) this.f28260e.getValue();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition composition, Function2 content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            ComposerImpl.this.f28229b.composeInitial$runtime_release(composition, content);
        }

        /* renamed from: d */
        public final void m60314d(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.f28260e.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.f28229b.deletedMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f28201A--;
        }

        /* renamed from: e */
        public final void m60313e(PersistentCompositionLocalMap scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            m60314d(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.f28257b;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return m60315c();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.f28256a;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.f28229b.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.f28229b.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.f28229b.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.f28229b.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            ComposerImpl.this.f28229b.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(data, "data");
            ComposerImpl.this.f28229b.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return ComposerImpl.this.f28229b.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set table) {
            Intrinsics.checkNotNullParameter(table, "table");
            Set set = this.f28258c;
            if (set == null) {
                set = new HashSet();
                this.f28258c = set;
            }
            set.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.f28259d.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.f28229b.registerComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.f28229b.reportRemovedComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.f28201A++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set> set = this.f28258c;
            if (set != null) {
                for (Set set2 : set) {
                    set2.remove(((ComposerImpl) composer).f28231c);
                }
            }
            TypeIntrinsics.asMutableCollection(this.f28259d).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.f28229b.unregisterComposition$runtime_release(composition);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext parentContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> abandonSet, @NotNull List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes, @NotNull List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges, @NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(lateChanges, "lateChanges");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.f28227a = applier;
        this.f28229b = parentContext;
        this.f28231c = slotTable;
        this.f28232d = abandonSet;
        this.f28233e = changes;
        this.f28234f = lateChanges;
        this.f28235g = composition;
        this.f28236h = new Stack();
        this.f28239k = new IntStack();
        this.f28241m = new IntStack();
        this.f28247s = new ArrayList();
        this.f28248t = new IntStack();
        this.f28249u = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        this.f28250v = new IntMap(0, 1, null);
        this.f28252x = new IntStack();
        this.f28254z = -1;
        this.f28203C = true;
        this.f28204D = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(@NotNull DerivedState<?> derivedState) {
                Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                ComposerImpl composerImpl = ComposerImpl.this;
                ComposerImpl.access$setChildrenComposing$p(composerImpl, ComposerImpl.access$getChildrenComposing$p(composerImpl) - 1);
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(@NotNull DerivedState<?> derivedState) {
                Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                ComposerImpl composerImpl = ComposerImpl.this;
                ComposerImpl.access$setChildrenComposing$p(composerImpl, ComposerImpl.access$getChildrenComposing$p(composerImpl) + 1);
            }
        };
        this.f28205E = new Stack();
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.f28208H = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.f28209I = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.f28210J = openWriter;
        SlotReader openReader2 = this.f28209I.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.f28214N = anchor;
            this.f28215O = new ArrayList();
            this.f28219S = new Stack();
            this.f28222V = true;
            this.f28223W = new IntStack();
            this.f28224X = new Stack();
            this.f28225Y = -1;
            this.f28226Z = -1;
            this.f28228a0 = -1;
        } catch (Throwable th2) {
            openReader2.close();
            throw th2;
        }
    }

    /* renamed from: F */
    public static /* synthetic */ void m60389F(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.m60390E(z);
    }

    /* renamed from: I */
    public static /* synthetic */ Object m60386I(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i, Object obj) {
        ControlledComposition controlledComposition3;
        ControlledComposition controlledComposition4;
        Integer num2;
        if ((i & 1) != 0) {
            controlledComposition3 = null;
        } else {
            controlledComposition3 = controlledComposition;
        }
        if ((i & 2) != 0) {
            controlledComposition4 = null;
        } else {
            controlledComposition4 = controlledComposition2;
        }
        if ((i & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return composerImpl.m60387H(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m60369Z(ComposerImpl composerImpl, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.m60370Y(z, function3);
    }

    public static final /* synthetic */ int access$getChildrenComposing$p(ComposerImpl composerImpl) {
        return composerImpl.f28201A;
    }

    public static final /* synthetic */ void access$setChildrenComposing$p(ComposerImpl composerImpl, int i) {
        composerImpl.f28201A = i;
    }

    /* renamed from: g0 */
    public static final int m60355g0(ComposerImpl composerImpl, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        C3436a c3436a;
        List m60307f;
        int i4 = 1;
        if (composerImpl.f28208H.hasMark(i)) {
            int groupKey = composerImpl.f28208H.groupKey(i);
            Object groupObjectKey = composerImpl.f28208H.groupObjectKey(i);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) groupObjectKey;
                Object groupGet = composerImpl.f28208H.groupGet(i, 0);
                Anchor anchor = composerImpl.f28208H.anchor(i);
                m60307f = ComposerKt.m60307f(composerImpl.f28247s, i, composerImpl.f28208H.groupSize(i) + i);
                ArrayList arrayList = new ArrayList(m60307f.size());
                int size = m60307f.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C20591jg0 c20591jg0 = (C20591jg0) m60307f.get(i5);
                    arrayList.add(TuplesKt.m28844to(c20591jg0.m29154c(), c20591jg0.m29156a()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.f28231c, anchor, arrayList, composerImpl.m60354h(i));
                composerImpl.f28229b.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.m60372W();
                composerImpl.m60384K(new ComposerImpl$reportFreeMovableContent$reportGroup$1(composerImpl, movableContentStateReference));
                if (z) {
                    composerImpl.m60391D();
                    composerImpl.m60388G();
                    composerImpl.m60393B();
                    if (!composerImpl.f28208H.isNode(i)) {
                        i4 = composerImpl.f28208H.nodeCount(i);
                    }
                    if (i4 <= 0) {
                        return 0;
                    }
                    composerImpl.m60373V(i2, i4);
                    return 0;
                }
                return composerImpl.f28208H.nodeCount(i);
            } else if (groupKey == 206 && Intrinsics.areEqual(groupObjectKey, ComposerKt.getReference())) {
                Object groupGet2 = composerImpl.f28208H.groupGet(i, 0);
                if (groupGet2 instanceof C3436a) {
                    c3436a = (C3436a) groupGet2;
                } else {
                    c3436a = null;
                }
                if (c3436a != null) {
                    for (ComposerImpl composerImpl2 : c3436a.m60318a().m60316b()) {
                        composerImpl2.m60359e0();
                        composerImpl.f28229b.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return composerImpl.f28208H.nodeCount(i);
            } else {
                return composerImpl.f28208H.nodeCount(i);
            }
        } else if (composerImpl.f28208H.containsMark(i)) {
            int groupSize = composerImpl.f28208H.groupSize(i) + i;
            int i6 = i + 1;
            int i7 = 0;
            while (i6 < groupSize) {
                boolean isNode = composerImpl.f28208H.isNode(i6);
                if (isNode) {
                    composerImpl.m60391D();
                    composerImpl.m60381N(composerImpl.f28208H.node(i6));
                }
                if (!isNode && !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (isNode) {
                    i3 = 0;
                } else {
                    i3 = i2 + i7;
                }
                i7 += m60355g0(composerImpl, i6, z2, i3);
                if (isNode) {
                    composerImpl.m60391D();
                    composerImpl.m60367a0();
                }
                i6 += composerImpl.f28208H.groupSize(i6);
            }
            return i7;
        } else {
            return composerImpl.f28208H.nodeCount(i);
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    /* renamed from: u */
    public static final int m60328u(SlotWriter slotWriter) {
        int nodeCount;
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                if (slotWriter.isNode(i)) {
                    nodeCount = 1;
                } else {
                    nodeCount = slotWriter.nodeCount(i);
                }
                i2 += nodeCount;
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* renamed from: v */
    public static final int m60326v(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        boolean z;
        int anchorIndex = slotWriter.anchorIndex(anchor);
        boolean z2 = true;
        if (slotWriter.getCurrentGroup() < anchorIndex) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        m60324w(slotWriter, applier, anchorIndex);
        int m60328u = m60328u(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    m60328u = 0;
                }
                slotWriter.startGroup();
            } else {
                m60328u += slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != anchorIndex) {
            z2 = false;
        }
        ComposerKt.runtimeCheck(z2);
        return m60328u;
    }

    /* renamed from: w */
    public static final void m60324w(SlotWriter slotWriter, Applier applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.mo60264up();
            }
            slotWriter.endGroup();
        }
    }

    /* renamed from: A */
    public final int m60394A(int i, int i2, int i3, int i4) {
        int parent = this.f28208H.parent(i2);
        while (parent != i3 && !this.f28208H.isNode(parent)) {
            parent = this.f28208H.parent(parent);
        }
        if (this.f28208H.isNode(parent)) {
            i4 = 0;
        }
        if (parent == i2) {
            return i4;
        }
        int m60325v0 = (m60325v0(parent) - this.f28208H.nodeCount(i2)) + i4;
        loop1: while (i4 < m60325v0 && parent != i) {
            parent++;
            while (parent < i) {
                int groupSize = this.f28208H.groupSize(parent) + parent;
                if (i >= groupSize) {
                    i4 += m60325v0(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return i4;
    }

    /* renamed from: B */
    public final void m60393B() {
        if (this.f28219S.isNotEmpty()) {
            m60392C(this.f28219S.toArray());
            this.f28219S.clear();
        }
    }

    /* renamed from: C */
    public final void m60392C(Object[] objArr) {
        m60384K(new ComposerImpl$realizeDowns$1(objArr));
    }

    /* renamed from: D */
    public final void m60391D() {
        int i = this.f28230b0;
        this.f28230b0 = 0;
        if (i > 0) {
            int i2 = this.f28225Y;
            if (i2 >= 0) {
                this.f28225Y = -1;
                m60383L(new ComposerImpl$realizeMovement$1(i2, i));
                return;
            }
            int i3 = this.f28226Z;
            this.f28226Z = -1;
            int i4 = this.f28228a0;
            this.f28228a0 = -1;
            m60383L(new ComposerImpl$realizeMovement$2(i3, i4, i));
        }
    }

    /* renamed from: E */
    public final void m60390E(boolean z) {
        int currentGroup;
        boolean z2;
        if (z) {
            currentGroup = this.f28208H.getParent();
        } else {
            currentGroup = this.f28208H.getCurrentGroup();
        }
        int i = currentGroup - this.f28220T;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i > 0) {
                m60384K(new ComposerImpl$realizeOperationLocation$2(i));
                this.f28220T = currentGroup;
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Tried to seek backward".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: G */
    public final void m60388G() {
        int i = this.f28218R;
        if (i > 0) {
            this.f28218R = 0;
            m60384K(new ComposerImpl$realizeUps$1(i));
        }
    }

    /* renamed from: H */
    public final Object m60387H(ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0) {
        Object obj;
        int i;
        boolean z = this.f28222V;
        boolean z2 = this.f28206F;
        int i2 = this.f28238j;
        try {
            this.f28222V = false;
            this.f28206F = true;
            this.f28238j = 0;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Pair pair = (Pair) list.get(i3);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.component1();
                IdentityArraySet identityArraySet = (IdentityArraySet) pair.component2();
                if (identityArraySet != null) {
                    Object[] values = identityArraySet.getValues();
                    int size2 = identityArraySet.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj2 = values[i4];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj2);
                    }
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImpl, null);
                }
            }
            if (controlledComposition != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                obj = controlledComposition.delegateInvalidations(controlledComposition2, i, function0);
                if (obj == null) {
                }
                this.f28222V = z;
                this.f28206F = z2;
                this.f28238j = i2;
                return obj;
            }
            obj = function0.invoke();
            this.f28222V = z;
            this.f28206F = z2;
            this.f28238j = i2;
            return obj;
        } catch (Throwable th2) {
            this.f28222V = z;
            this.f28206F = z2;
            this.f28238j = i2;
            throw th2;
        }
    }

    /* renamed from: J */
    public final void m60385J() {
        C20591jg0 m60304i;
        boolean z = this.f28206F;
        this.f28206F = true;
        int parent = this.f28208H.getParent();
        int groupSize = this.f28208H.groupSize(parent) + parent;
        int i = this.f28238j;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.f28240l;
        m60304i = ComposerKt.m60304i(this.f28247s, this.f28208H.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i3 = parent;
        while (m60304i != null) {
            int m29155b = m60304i.m29155b();
            ComposerKt.m60295r(this.f28247s, m29155b);
            if (m60304i.m29153d()) {
                this.f28208H.reposition(m29155b);
                int currentGroup = this.f28208H.getCurrentGroup();
                m60365b0(i3, currentGroup, parent);
                this.f28238j = m60394A(m29155b, currentGroup, parent, i);
                this.f28217Q = m60360e(this.f28208H.parent(currentGroup), parent, compoundKeyHash);
                this.f28212L = null;
                m60304i.m29154c().compose(this);
                this.f28212L = null;
                this.f28208H.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.f28205E.push(m60304i.m29154c());
                m60304i.m29154c().rereadTrackedInstances();
                this.f28205E.pop();
            }
            m60304i = ComposerKt.m60304i(this.f28247s, this.f28208H.getCurrentGroup(), groupSize);
        }
        if (z2) {
            m60365b0(i3, parent, parent);
            this.f28208H.skipToGroupEnd();
            int m60325v0 = m60325v0(parent);
            this.f28238j = i + m60325v0;
            this.f28240l = i2 + m60325v0;
        } else {
            m60351i0();
        }
        this.f28217Q = compoundKeyHash;
        this.f28206F = z;
    }

    /* renamed from: K */
    public final void m60384K(Function3 function3) {
        this.f28233e.add(function3);
    }

    /* renamed from: L */
    public final void m60383L(Function3 function3) {
        m60388G();
        m60393B();
        m60384K(function3);
    }

    /* renamed from: M */
    public final void m60382M() {
        Function3 function3;
        m60357f0(this.f28208H.getCurrentGroup());
        function3 = ComposerKt.f28266b;
        m60371X(function3);
        this.f28220T += this.f28208H.getGroupSize();
    }

    /* renamed from: N */
    public final void m60381N(Object obj) {
        this.f28219S.push(obj);
    }

    /* renamed from: O */
    public final void m60380O() {
        boolean z;
        Function3 function3;
        int parent = this.f28208H.getParent();
        if (this.f28223W.peekOr(-1) <= parent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f28223W.peekOr(-1) == parent) {
                this.f28223W.pop();
                function3 = ComposerKt.f28268d;
                m60369Z(this, false, function3, 1, null);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: P */
    public final void m60379P() {
        Function3 function3;
        if (this.f28221U) {
            function3 = ComposerKt.f28268d;
            m60369Z(this, false, function3, 1, null);
            this.f28221U = false;
        }
    }

    /* renamed from: Q */
    public final void m60378Q(Function3 function3) {
        this.f28215O.add(function3);
    }

    /* renamed from: R */
    public final void m60377R(Anchor anchor) {
        if (this.f28215O.isEmpty()) {
            m60371X(new ComposerImpl$recordInsert$1(this.f28209I, anchor));
            return;
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.f28215O);
        this.f28215O.clear();
        m60388G();
        m60393B();
        m60371X(new ComposerImpl$recordInsert$2(this.f28209I, anchor, mutableList));
    }

    /* renamed from: S */
    public final void m60376S(Function3 function3) {
        this.f28224X.push(function3);
    }

    /* renamed from: T */
    public final void m60375T(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.f28230b0;
            if (i4 > 0 && this.f28226Z == i - i4 && this.f28228a0 == i2 - i4) {
                this.f28230b0 = i4 + i3;
                return;
            }
            m60391D();
            this.f28226Z = i;
            this.f28228a0 = i2;
            this.f28230b0 = i3;
        }
    }

    /* renamed from: U */
    public final void m60374U(int i) {
        this.f28220T = i - (this.f28208H.getCurrentGroup() - this.f28220T);
    }

    /* renamed from: V */
    public final void m60373V(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f28225Y == i) {
                    this.f28230b0 += i2;
                    return;
                }
                m60391D();
                this.f28225Y = i;
                this.f28230b0 = i2;
                return;
            }
            ComposerKt.composeRuntimeError(("Invalid remove index " + i).toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: W */
    public final void m60372W() {
        SlotReader slotReader;
        int parent;
        Function3 function3;
        if (this.f28208H.getSize() > 0 && this.f28223W.peekOr(-2) != (parent = (slotReader = this.f28208H).getParent())) {
            if (!this.f28221U && this.f28222V) {
                function3 = ComposerKt.f28269e;
                m60369Z(this, false, function3, 1, null);
                this.f28221U = true;
            }
            if (parent > 0) {
                Anchor anchor = slotReader.anchor(parent);
                this.f28223W.push(parent);
                m60369Z(this, false, new ComposerImpl$recordSlotEditing$1(anchor), 1, null);
            }
        }
    }

    /* renamed from: X */
    public final void m60371X(Function3 function3) {
        m60389F(this, false, 1, null);
        m60372W();
        m60384K(function3);
    }

    /* renamed from: Y */
    public final void m60370Y(boolean z, Function3 function3) {
        m60390E(z);
        m60384K(function3);
    }

    /* renamed from: a */
    public final void m60368a() {
        m60364c();
        this.f28236h.clear();
        this.f28239k.clear();
        this.f28241m.clear();
        this.f28248t.clear();
        this.f28252x.clear();
        this.f28250v.clear();
        if (!this.f28208H.getClosed()) {
            this.f28208H.close();
        }
        if (!this.f28210J.getClosed()) {
            this.f28210J.close();
        }
        this.f28215O.clear();
        m60358f();
        this.f28217Q = 0;
        this.f28201A = 0;
        this.f28246r = false;
        this.f28216P = false;
        this.f28253y = false;
        this.f28206F = false;
        this.f28245q = false;
        this.f28254z = -1;
    }

    /* renamed from: a0 */
    public final void m60367a0() {
        if (this.f28219S.isNotEmpty()) {
            this.f28219S.pop();
        } else {
            this.f28218R++;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(block, v);
        if (getInserting()) {
            m60378Q(composerImpl$apply$operation$1);
        } else {
            m60383L(composerImpl$apply$operation$1);
        }
    }

    /* renamed from: b */
    public final void m60366b() {
        C20591jg0 m60295r;
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (!getInserting()) {
            m60295r = ComposerKt.m60295r(this.f28247s, this.f28208H.getParent());
            Object next = this.f28208H.next();
            if (Intrinsics.areEqual(next, Composer.Companion.getEmpty())) {
                ControlledComposition composition = getComposition();
                Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition);
                updateValue(recomposeScopeImpl);
            } else {
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (RecomposeScopeImpl) next;
            }
            if (m60295r != null) {
                z = true;
            } else {
                z = false;
            }
            recomposeScopeImpl.setRequiresRecompose(z);
            this.f28205E.push(recomposeScopeImpl);
            recomposeScopeImpl.start(this.f28202B);
            return;
        }
        ControlledComposition composition2 = getComposition();
        Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition2);
        this.f28205E.push(recomposeScopeImpl2);
        updateValue(recomposeScopeImpl2);
        recomposeScopeImpl2.start(this.f28202B);
    }

    /* renamed from: b0 */
    public final void m60365b0(int i, int i2, int i3) {
        int m60299n;
        SlotReader slotReader = this.f28208H;
        m60299n = ComposerKt.m60299n(slotReader, i, i2, i3);
        while (i > 0 && i != m60299n) {
            if (slotReader.isNode(i)) {
                m60367a0();
            }
            i = slotReader.parent(i);
        }
        m60350j(i2, m60299n);
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        m60345l0(206, ComposerKt.getReference());
        C3436a c3436a = null;
        if (getInserting()) {
            SlotWriter.markGroup$default(this.f28210J, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        if (nextSlot instanceof C3436a) {
            c3436a = (C3436a) nextSlot;
        }
        if (c3436a == null) {
            c3436a = new C3436a(new C3437b(getCompoundKeyHash(), this.f28244p));
            updateValue(c3436a);
        }
        c3436a.m60318a().m60313e(m60356g());
        m60346l();
        return c3436a.m60318a();
    }

    /* renamed from: c */
    public final void m60364c() {
        this.f28237i = null;
        this.f28238j = 0;
        this.f28240l = 0;
        this.f28220T = 0;
        this.f28217Q = 0;
        this.f28246r = false;
        this.f28221U = false;
        this.f28223W.clear();
        this.f28205E.clear();
        m60362d();
    }

    /* renamed from: c0 */
    public final void m60363c0() {
        this.f28215O.add(this.f28224X.pop());
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) nextSlot();
        if (t == Composer.Companion.getEmpty() || z) {
            T invoke = block.invoke();
            updateValue(invoke);
            return invoke;
        }
        return t;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object obj) {
        if (Intrinsics.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@Nullable Object obj) {
        if (nextSlot() != obj) {
            updateValue(obj);
            return true;
        }
        return false;
    }

    public final void changesApplied$runtime_release() {
        m60358f();
        this.f28250v.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.f28244p = true;
    }

    public final void composeContent$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.f28233e.isEmpty()) {
            m60352i(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) CompositionLocalMapKt.read(m60356g(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        m60323w0();
        if (getInserting()) {
            int peek = this.f28239k.peek();
            SlotWriter slotWriter = this.f28210J;
            Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.f28240l++;
            m60378Q(new ComposerImpl$createNode$2(factory, anchor, peek));
            m60376S(new ComposerImpl$createNode$3(anchor, peek));
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public final void m60362d() {
        this.f28242n = null;
        this.f28243o = null;
    }

    /* renamed from: d0 */
    public final void m60361d0(final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close();
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                final ControlledComposition composition = getComposition();
                try {
                    companion.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), moveTo, new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerImpl$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        @NotNull
                        public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object obj) {
                            RecomposeScopeOwner recomposeScopeOwner;
                            InvalidationResult invalidationResult;
                            Intrinsics.checkNotNullParameter(scope, "scope");
                            ControlledComposition controlledComposition = ControlledComposition.this;
                            IdentityArraySet identityArraySet = null;
                            if (controlledComposition instanceof RecomposeScopeOwner) {
                                recomposeScopeOwner = (RecomposeScopeOwner) controlledComposition;
                            } else {
                                recomposeScopeOwner = null;
                            }
                            if (recomposeScopeOwner == null || (invalidationResult = recomposeScopeOwner.invalidate(scope, obj)) == null) {
                                invalidationResult = InvalidationResult.IGNORED;
                            }
                            if (invalidationResult == InvalidationResult.IGNORED) {
                                MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                                if (obj != null) {
                                    identityArraySet = new IdentityArraySet();
                                    identityArraySet.add(identityArraySet);
                                }
                                movableContentStateReference2.setInvalidations$runtime_release(CollectionsKt___CollectionsKt.plus((Collection<? extends Pair>) invalidations$runtime_release, TuplesKt.m28844to(scope, identityArraySet)));
                                return InvalidationResult.SCHEDULED;
                            }
                            return invalidationResult;
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
                            Intrinsics.checkNotNullParameter(scope, "scope");
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recordReadOf(@NotNull Object value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                        }
                    });
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            this.f28229b.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z) {
        boolean z2;
        if (this.f28240l == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!getInserting()) {
                if (!z) {
                    m60351i0();
                    return;
                }
                int currentGroup = this.f28208H.getCurrentGroup();
                int currentEnd = this.f28208H.getCurrentEnd();
                for (int i = currentGroup; i < currentEnd; i++) {
                    if (this.f28208H.isNode(i)) {
                        Object node = this.f28208H.node(i);
                        if (node instanceof ComposeNodeLifecycleCallback) {
                            m60384K(new ComposerImpl$deactivateToEndGroup$2(node));
                        }
                    }
                    this.f28208H.forEachData$runtime_release(i, new ComposerImpl$deactivateToEndGroup$3(this, i));
                }
                ComposerKt.m60294s(this.f28247s, currentGroup, currentEnd);
                this.f28208H.reposition(currentGroup);
                this.f28208H.skipToGroupEnd();
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.f28253y = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.f28203C = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.f28229b.unregisterComposer$runtime_release(this);
            this.f28205E.clear();
            this.f28247s.clear();
            this.f28233e.clear();
            this.f28250v.clear();
            getApplier().clear();
            this.f28207G = true;
            Unit unit = Unit.INSTANCE;
            trace.endSection(beginSection);
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection);
            throw th2;
        }
    }

    /* renamed from: e */
    public final int m60360e(int i, int i2, int i3) {
        if (i != i2) {
            int m60332s = m60332s(this.f28208H, i);
            if (m60332s == 126665345) {
                return m60332s;
            }
            return Integer.rotateLeft(m60360e(this.f28208H.parent(i), i2, i3), 3) ^ m60332s;
        }
        return i3;
    }

    /* renamed from: e0 */
    public final void m60359e0() {
        Function3 function3;
        if (this.f28231c.containsMark()) {
            ArrayList arrayList = new ArrayList();
            this.f28213M = arrayList;
            SlotReader openReader = this.f28231c.openReader();
            try {
                this.f28208H = openReader;
                List list = this.f28233e;
                this.f28233e = arrayList;
                m60357f0(0);
                m60388G();
                if (this.f28221U) {
                    function3 = ComposerKt.f28267c;
                    m60384K(function3);
                    m60379P();
                }
                Unit unit = Unit.INSTANCE;
                this.f28233e = list;
            } finally {
                openReader.close();
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        boolean z;
        if (this.f28254z >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f28253y = z;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        m60346l();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getUsed()) {
            currentRecomposeScope$runtime_release.setDefaultsInScope(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        m60346l();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        m60348k(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        boolean m60312a;
        m60346l();
        m60346l();
        m60312a = ComposerKt.m60312a(this.f28252x.pop());
        this.f28251w = m60312a;
        this.f28212L = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        m60346l();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl;
        Anchor anchor;
        Function1<Composition, Unit> end;
        RecomposeScopeImpl recomposeScopeImpl2 = null;
        if (this.f28205E.isNotEmpty()) {
            recomposeScopeImpl = (RecomposeScopeImpl) this.f28205E.pop();
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setRequiresRecompose(false);
        }
        if (recomposeScopeImpl != null && (end = recomposeScopeImpl.end(this.f28202B)) != null) {
            m60384K(new ComposerImpl$endRestartGroup$1$1(end, this));
        }
        if (recomposeScopeImpl != null && !recomposeScopeImpl.getSkipped$runtime_release() && (recomposeScopeImpl.getUsed() || this.f28244p)) {
            if (recomposeScopeImpl.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.f28210J;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.f28208H;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl.setAnchor(anchor);
            }
            recomposeScopeImpl.setDefaultsInvalid(false);
            recomposeScopeImpl2 = recomposeScopeImpl;
        }
        m60348k(false);
        return recomposeScopeImpl2;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.f28253y && this.f28208H.getParent() == this.f28254z) {
            this.f28254z = -1;
            this.f28253y = false;
        }
        m60348k(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotWriter slotWriter = this.f28210J;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent > i2) {
                    m60348k(slotWriter.isNode(parent));
                } else {
                    return;
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.f28210J;
                while (getInserting()) {
                    m60348k(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.f28208H;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 > i) {
                    m60348k(slotReader.isNode(parent2));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m60358f() {
        ComposerKt.runtimeCheck(this.f28210J.getClosed());
        SlotTable slotTable = new SlotTable();
        this.f28209I = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.f28210J = openWriter;
    }

    /* renamed from: f0 */
    public final void m60357f0(int i) {
        m60355g0(this, i, false, 0);
        m60391D();
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (!this.f28244p) {
            this.f28244p = true;
            this.f28245q = true;
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final PersistentCompositionLocalMap m60356g() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.f28212L;
        if (persistentCompositionLocalMap != null) {
            return persistentCompositionLocalMap;
        }
        return m60354h(this.f28208H.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.f28227a;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CoroutineContext getApplyCoroutineContext() {
        return this.f28229b.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        if (this.f28201A > 0) {
            return true;
        }
        return false;
    }

    public final int getChangeCount$runtime_release() {
        return this.f28233e.size();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.f28235g;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.f28231c;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.f28217Q;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return m60356g();
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        if (getInserting()) {
            return -this.f28210J.getParent();
        }
        return this.f28208H.getParent();
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack stack = this.f28205E;
        if (this.f28201A == 0 && stack.isNotEmpty()) {
            return (RecomposeScopeImpl) stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (this.f28251w) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> getDeferredChanges$runtime_release() {
        return this.f28213M;
    }

    public final boolean getHasInvalidations() {
        return !this.f28247s.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.f28233e.isEmpty();
    }

    @NotNull
    public final SlotTable getInsertTable$runtime_release() {
        return this.f28209I;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.f28216P;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (!getInserting() && !this.f28253y && !this.f28251w && (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) != null && !currentRecomposeScope$runtime_release.getRequiresRecompose() && !this.f28245q) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final PersistentCompositionLocalMap m60354h(int i) {
        if (getInserting() && this.f28211K) {
            int parent = this.f28210J.getParent();
            while (parent > 0) {
                if (this.f28210J.groupKey(parent) == 202 && Intrinsics.areEqual(this.f28210J.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.f28210J.groupAux(parent);
                    Intrinsics.checkNotNull(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux;
                    this.f28212L = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                parent = this.f28210J.parent(parent);
            }
        }
        if (this.f28208H.getSize() > 0) {
            while (i > 0) {
                if (this.f28208H.groupKey(i) == 202 && Intrinsics.areEqual(this.f28208H.groupObjectKey(i), ComposerKt.getCompositionLocalMap())) {
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) this.f28250v.get(i);
                    if (persistentCompositionLocalMap2 == null) {
                        Object groupAux2 = this.f28208H.groupAux(i);
                        Intrinsics.checkNotNull(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.f28212L = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                i = this.f28208H.parent(i);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.f28249u;
        this.f28212L = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    /* renamed from: h0 */
    public final void m60353h0() {
        this.f28240l += this.f28208H.skipGroup();
    }

    /* renamed from: i */
    public final void m60352i(IdentityArrayMap identityArrayMap, Function2 function2) {
        if (!this.f28206F) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                this.f28202B = SnapshotKt.currentSnapshot().getId();
                this.f28250v.clear();
                int size = identityArrayMap.getSize();
                for (int i = 0; i < size; i++) {
                    Object obj = identityArrayMap.getKeys()[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues()[i];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    Anchor anchor = recomposeScopeImpl.getAnchor();
                    if (anchor != null) {
                        this.f28247s.add(new C20591jg0(recomposeScopeImpl, anchor.getLocation$runtime_release(), identityArraySet));
                    } else {
                        return;
                    }
                }
                List list = this.f28247s;
                if (list.size() > 1) {
                    AbstractC10334gs.sortWith(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda$38$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return AbstractC16857uu.compareValues(Integer.valueOf(((C20591jg0) t).m29155b()), Integer.valueOf(((C20591jg0) t2).m29155b()));
                        }
                    });
                }
                this.f28238j = 0;
                this.f28206F = true;
                m60341n0();
                Object nextSlot = nextSlot();
                if (nextSlot != function2 && function2 != null) {
                    updateValue(function2);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.f28204D;
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (function2 != null) {
                        m60345l0(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, function2);
                        m60346l();
                    } else if ((this.f28245q || this.f28251w) && nextSlot != null && !Intrinsics.areEqual(nextSlot, Composer.Companion.getEmpty())) {
                        m60345l0(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(nextSlot, 2));
                        m60346l();
                    } else {
                        skipCurrentGroup();
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    m60344m();
                    this.f28206F = false;
                    this.f28247s.clear();
                    Unit unit = Unit.INSTANCE;
                    return;
                } catch (Throwable th2) {
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    throw th2;
                }
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: i0 */
    public final void m60351i0() {
        this.f28240l = this.f28208H.getParentNodes();
        this.f28208H.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@NotNull MovableContent<?> value, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(value, "value");
        m60320y(value, m60356g(), obj, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        try {
            m60330t(references);
            m60364c();
        } catch (Throwable th2) {
            m60368a();
            throw th2;
        }
    }

    public final boolean isComposing$runtime_release() {
        return this.f28206F;
    }

    public final boolean isDisposed$runtime_release() {
        return this.f28207G;
    }

    /* renamed from: j */
    public final void m60350j(int i, int i2) {
        if (i > 0 && i != i2) {
            m60350j(this.f28208H.parent(i), i2);
            if (this.f28208H.isNode(i)) {
                m60381N(m60319z(this.f28208H, i));
            }
        }
    }

    /* renamed from: j0 */
    public final void m60349j0(int i, Object obj, int i2, Object obj2) {
        boolean z;
        boolean z2;
        Object obj3 = obj;
        m60321x0();
        m60339o0(i, obj, obj2);
        GroupKind.Companion companion = GroupKind.f28327a;
        int i3 = 0;
        if (i2 != companion.m71381getGroupULZAiWs()) {
            z = true;
        } else {
            z = false;
        }
        Pending pending = null;
        if (getInserting()) {
            this.f28208H.beginEmpty();
            int currentGroup = this.f28210J.getCurrentGroup();
            if (z) {
                this.f28210J.startNode(i, Composer.Companion.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.f28210J;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i, obj3, obj2);
            } else {
                SlotWriter slotWriter2 = this.f28210J;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i, obj3);
            }
            Pending pending2 = this.f28237i;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i, -1, m60322x(currentGroup), -1, 0);
                pending2.m60255i(keyInfo, this.f28238j - pending2.m60259e());
                pending2.m60256h(keyInfo);
            }
            m60340o(z, null);
            return;
        }
        if (i2 == companion.m71382getNodeULZAiWs() && this.f28253y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f28237i == null) {
            int groupKey = this.f28208H.getGroupKey();
            if (!z2 && groupKey == i && Intrinsics.areEqual(obj, this.f28208H.getGroupObjectKey())) {
                m60343m0(z, obj2);
            } else {
                this.f28237i = new Pending(this.f28208H.extractKeys(), this.f28238j);
            }
        }
        Pending pending3 = this.f28237i;
        if (pending3 != null) {
            KeyInfo m60260d = pending3.m60260d(i, obj);
            if (!z2 && m60260d != null) {
                pending3.m60256h(m60260d);
                int location = m60260d.getLocation();
                this.f28238j = pending3.m60257g(m60260d) + pending3.m60259e();
                int m60251m = pending3.m60251m(m60260d);
                int m60263a = m60251m - pending3.m60263a();
                pending3.m60253k(m60251m, pending3.m60263a());
                m60374U(location);
                this.f28208H.reposition(location);
                if (m60263a > 0) {
                    m60371X(new ComposerImpl$start$2(m60263a));
                }
                m60343m0(z, obj2);
            } else {
                this.f28208H.beginEmpty();
                this.f28216P = true;
                this.f28212L = null;
                m60342n();
                this.f28210J.beginInsert();
                int currentGroup2 = this.f28210J.getCurrentGroup();
                if (z) {
                    this.f28210J.startNode(i, Composer.Companion.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.f28210J;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i, obj3, obj2);
                } else {
                    SlotWriter slotWriter4 = this.f28210J;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i, obj3);
                }
                this.f28214N = this.f28210J.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i, -1, m60322x(currentGroup2), -1, 0);
                pending3.m60255i(keyInfo2, this.f28238j - pending3.m60259e());
                pending3.m60256h(keyInfo2);
                ArrayList arrayList = new ArrayList();
                if (!z) {
                    i3 = this.f28238j;
                }
                pending = new Pending(arrayList, i3);
            }
        }
        m60340o(z, pending);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object obj, @Nullable Object obj2) {
        Object m60302k;
        m60302k = ComposerKt.m60302k(this.f28208H.getGroupObjectKey(), obj, obj2);
        if (m60302k == null) {
            return new JoinedKey(obj, obj2);
        }
        return m60302k;
    }

    /* renamed from: k */
    public final void m60348k(boolean z) {
        List list;
        if (getInserting()) {
            int parent = this.f28210J.getParent();
            m60335q0(this.f28210J.groupKey(parent), this.f28210J.groupObjectKey(parent), this.f28210J.groupAux(parent));
        } else {
            int parent2 = this.f28208H.getParent();
            m60335q0(this.f28208H.groupKey(parent2), this.f28208H.groupObjectKey(parent2), this.f28208H.groupAux(parent2));
        }
        int i = this.f28240l;
        Pending pending = this.f28237i;
        int i2 = 0;
        if (pending != null && pending.m60262b().size() > 0) {
            List m60262b = pending.m60262b();
            List m60258f = pending.m60258f();
            Set fastToSet = ListUtilsKt.fastToSet(m60258f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = m60258f.size();
            int size2 = m60262b.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = (KeyInfo) m60262b.get(i3);
                if (!fastToSet.contains(keyInfo)) {
                    m60373V(pending.m60257g(keyInfo) + pending.m60259e(), keyInfo.getNodes());
                    pending.m60250n(keyInfo.getLocation(), i2);
                    m60374U(keyInfo.getLocation());
                    this.f28208H.reposition(keyInfo.getLocation());
                    m60382M();
                    this.f28208H.skipGroup();
                    ComposerKt.m60294s(this.f28247s, keyInfo.getLocation(), keyInfo.getLocation() + this.f28208H.groupSize(keyInfo.getLocation()));
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i4 < size) {
                        KeyInfo keyInfo2 = (KeyInfo) m60258f.get(i4);
                        if (keyInfo2 != keyInfo) {
                            int m60257g = pending.m60257g(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (m60257g != i5) {
                                int m60249o = pending.m60249o(keyInfo2);
                                list = m60258f;
                                m60375T(pending.m60259e() + m60257g, i5 + pending.m60259e(), m60249o);
                                pending.m60254j(m60257g, i5, m60249o);
                            } else {
                                list = m60258f;
                            }
                        } else {
                            list = m60258f;
                            i3++;
                        }
                        i4++;
                        i5 += pending.m60249o(keyInfo2);
                        m60258f = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            m60391D();
            if (m60262b.size() > 0) {
                m60374U(this.f28208H.getGroupEnd());
                this.f28208H.skipToGroupEnd();
            }
        }
        int i6 = this.f28238j;
        while (!this.f28208H.isGroupEnd()) {
            int currentGroup = this.f28208H.getCurrentGroup();
            m60382M();
            m60373V(i6, this.f28208H.skipGroup());
            ComposerKt.m60294s(this.f28247s, currentGroup, this.f28208H.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z) {
                m60363c0();
                i = 1;
            }
            this.f28208H.endEmpty();
            int parent3 = this.f28210J.getParent();
            this.f28210J.endGroup();
            if (!this.f28208H.getInEmpty()) {
                int m60322x = m60322x(parent3);
                this.f28210J.endInsert();
                this.f28210J.close();
                m60377R(this.f28214N);
                this.f28216P = false;
                if (!this.f28231c.isEmpty()) {
                    m60331s0(m60322x, 0);
                    m60329t0(m60322x, i);
                }
            }
        } else {
            if (z) {
                m60367a0();
            }
            m60380O();
            int parent4 = this.f28208H.getParent();
            if (i != m60325v0(parent4)) {
                m60329t0(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.f28208H.endGroup();
            m60391D();
        }
        m60338p(i, inserting);
    }

    /* renamed from: k0 */
    public final void m60347k0(int i) {
        m60349j0(i, null, GroupKind.f28327a.m71381getGroupULZAiWs(), null);
    }

    /* renamed from: l */
    public final void m60346l() {
        m60348k(false);
    }

    /* renamed from: l0 */
    public final void m60345l0(int i, Object obj) {
        m60349j0(i, obj, GroupKind.f28327a.m71381getGroupULZAiWs(), null);
    }

    /* renamed from: m */
    public final void m60344m() {
        m60346l();
        this.f28229b.doneComposing$runtime_release();
        m60346l();
        m60379P();
        m60336q();
        this.f28208H.close();
        this.f28245q = false;
    }

    /* renamed from: m0 */
    public final void m60343m0(boolean z, Object obj) {
        if (z) {
            this.f28208H.startNode();
            return;
        }
        if (obj != null && this.f28208H.getGroupAux() != obj) {
            m60369Z(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, null);
        }
        this.f28208H.startGroup();
    }

    /* renamed from: n */
    public final void m60342n() {
        if (this.f28210J.getClosed()) {
            SlotWriter openWriter = this.f28209I.openWriter();
            this.f28210J = openWriter;
            openWriter.skipToGroupEnd();
            this.f28211K = false;
            this.f28212L = null;
        }
    }

    /* renamed from: n0 */
    public final void m60341n0() {
        int m60311b;
        this.f28208H = this.f28231c.openReader();
        m60347k0(100);
        this.f28229b.startComposing$runtime_release();
        this.f28249u = this.f28229b.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.f28252x;
        m60311b = ComposerKt.m60311b(this.f28251w);
        intStack.push(m60311b);
        this.f28251w = changed(this.f28249u);
        this.f28212L = null;
        if (!this.f28244p) {
            this.f28244p = this.f28229b.getCollectingParameterInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.f28249u, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.f28231c);
            this.f28229b.recordInspectionTable$runtime_release(set);
        }
        m60347k0(this.f28229b.getCompoundHashKey$runtime_release());
    }

    @PublishedApi
    @Nullable
    public final Object nextSlot() {
        if (getInserting()) {
            m60321x0();
            return Composer.Companion.getEmpty();
        }
        Object next = this.f28208H.next();
        if (this.f28253y) {
            return Composer.Companion.getEmpty();
        }
        return next;
    }

    /* renamed from: o */
    public final void m60340o(boolean z, Pending pending) {
        this.f28236h.push(this.f28237i);
        this.f28237i = pending;
        this.f28239k.push(this.f28238j);
        if (z) {
            this.f28238j = 0;
        }
        this.f28241m.push(this.f28240l);
        this.f28240l = 0;
    }

    /* renamed from: o0 */
    public final void m60339o0(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                m60337p0(obj2.hashCode());
            } else {
                m60337p0(i);
            }
        } else if (obj instanceof Enum) {
            m60337p0(((Enum) obj).ordinal());
        } else {
            m60337p0(obj.hashCode());
        }
    }

    /* renamed from: p */
    public final void m60338p(int i, boolean z) {
        Pending pending = (Pending) this.f28236h.pop();
        if (pending != null && !z) {
            pending.m60252l(pending.m60263a() + 1);
        }
        this.f28237i = pending;
        this.f28238j = this.f28239k.pop() + i;
        this.f28240l = this.f28241m.pop() + i;
    }

    /* renamed from: p0 */
    public final void m60337p0(int i) {
        this.f28217Q = i ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.f28210J;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.f28208H;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!this.f28206F) {
            this.f28206F = true;
            try {
                block.invoke();
                return;
            } finally {
                this.f28206F = false;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: q */
    public final void m60336q() {
        m60388G();
        if (this.f28236h.isEmpty()) {
            if (this.f28223W.isEmpty()) {
                m60364c();
                return;
            } else {
                ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        ComposerKt.composeRuntimeError("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: q0 */
    public final void m60335q0(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                m60333r0(obj2.hashCode());
            } else {
                m60333r0(i);
            }
        } else if (obj instanceof Enum) {
            m60333r0(((Enum) obj).ordinal());
        } else {
            m60333r0(obj.hashCode());
        }
    }

    /* renamed from: r */
    public final Object m60334r(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    /* renamed from: r0 */
    public final void m60333r0(int i) {
        this.f28217Q = Integer.rotateRight(i ^ getCompoundKeyHash(), 3);
    }

    public final boolean recompose$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (this.f28233e.isEmpty()) {
            if (!invalidationsRequested.isNotEmpty() && !(!this.f28247s.isEmpty()) && !this.f28245q) {
                return false;
            }
            m60352i(invalidationsRequested, null);
            return !this.f28233e.isEmpty();
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        m60384K(new ComposerImpl$recordSideEffect$1(effect));
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope instanceof RecomposeScopeImpl) {
            recomposeScopeImpl = (RecomposeScopeImpl) scope;
        } else {
            recomposeScopeImpl = null;
        }
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlot();
    }

    /* renamed from: s */
    public final int m60332s(SlotReader slotReader, int i) {
        Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey != null) {
                if (groupObjectKey instanceof Enum) {
                    return ((Enum) groupObjectKey).ordinal();
                }
                if (groupObjectKey instanceof MovableContent) {
                    return MovableContentKt.movableContentKey;
                }
                return groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i)) != null && !Intrinsics.areEqual(groupAux, Composer.Companion.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    /* renamed from: s0 */
    public final void m60331s0(int i, int i2) {
        if (m60325v0(i) != i2) {
            if (i < 0) {
                HashMap hashMap = this.f28243o;
                if (hashMap == null) {
                    hashMap = new HashMap();
                    this.f28243o = hashMap;
                }
                hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.f28242n;
            if (iArr == null) {
                iArr = new int[this.f28208H.getSize()];
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.f28242n = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void setDeferredChanges$runtime_release(@Nullable List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        this.f28213M = list;
    }

    public final void setInsertTable$runtime_release(@NotNull SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "<set-?>");
        this.f28209I = slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.f28247s.isEmpty()) {
            m60353h0();
            return;
        }
        SlotReader slotReader = this.f28208H;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        m60339o0(groupKey, groupObjectKey, groupAux);
        m60343m0(slotReader.isNode(), null);
        m60385J();
        slotReader.endGroup();
        m60335q0(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        boolean z;
        if (this.f28240l == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.f28247s.isEmpty()) {
                m60351i0();
                return;
            } else {
                m60385J();
                return;
            }
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (getInserting() && this.f28203C) {
            this.f28210J.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (this.f28203C) {
            m60348k(false);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (this.f28203C) {
            m60349j0(i, null, GroupKind.f28327a.m71381getGroupULZAiWs(), sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m60349j0(-127, null, GroupKind.f28327a.m71381getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i, @Nullable Object obj) {
        m60349j0(i, obj, GroupKind.f28327a.m71381getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m60349j0(125, null, GroupKind.f28327a.m71382getNodeULZAiWs(), null);
        this.f28246r = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull ProvidedValue<?>[] values) {
        PersistentCompositionLocalMap m60327u0;
        int m60311b;
        Intrinsics.checkNotNullParameter(values, "values");
        PersistentCompositionLocalMap m60356g = m60356g();
        m60345l0(201, ComposerKt.getProvider());
        m60345l0(203, ComposerKt.getProviderValues());
        PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) ActualJvm_jvmKt.invokeComposableForResult(this, new ComposerImpl$startProviders$currentProviders$1(values, m60356g));
        m60346l();
        boolean z = false;
        if (getInserting()) {
            m60327u0 = m60327u0(m60356g, persistentCompositionLocalMap);
            this.f28211K = true;
        } else {
            Object groupGet = this.f28208H.groupGet(0);
            Intrinsics.checkNotNull(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.f28208H.groupGet(1);
            Intrinsics.checkNotNull(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap3 = (PersistentCompositionLocalMap) groupGet2;
            if (getSkipping() && Intrinsics.areEqual(persistentCompositionLocalMap3, persistentCompositionLocalMap)) {
                m60353h0();
                m60327u0 = persistentCompositionLocalMap2;
            } else {
                m60327u0 = m60327u0(m60356g, persistentCompositionLocalMap);
                z = !Intrinsics.areEqual(m60327u0, persistentCompositionLocalMap2);
            }
        }
        if (z && !getInserting()) {
            this.f28250v.set(this.f28208H.getCurrentGroup(), m60327u0);
        }
        IntStack intStack = this.f28252x;
        m60311b = ComposerKt.m60311b(this.f28251w);
        intStack.push(m60311b);
        this.f28251w = z;
        this.f28212L = m60327u0;
        m60349j0(202, ComposerKt.getCompositionLocalMap(), GroupKind.f28327a.m71381getGroupULZAiWs(), m60327u0);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i) {
        m60349j0(i, null, GroupKind.f28327a.m71381getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int i) {
        m60349j0(i, null, GroupKind.f28327a.m71381getGroupULZAiWs(), null);
        m60366b();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i, @Nullable Object obj) {
        if (this.f28208H.getGroupKey() == i && !Intrinsics.areEqual(this.f28208H.getGroupAux(), obj) && this.f28254z < 0) {
            this.f28254z = this.f28208H.getCurrentGroup();
            this.f28253y = true;
        }
        m60349j0(i, null, GroupKind.f28327a.m71381getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m60349j0(125, null, GroupKind.f28327a.m71383getReusableNodeULZAiWs(), null);
        this.f28246r = true;
    }

    /* renamed from: t */
    public final void m60330t(List list) {
        Function3 function3;
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        List m60310c;
        List list2;
        SlotTable slotTable$runtime_release2;
        Function3 function32;
        List list3 = this.f28234f;
        List list4 = this.f28233e;
        try {
            this.f28233e = list3;
            function3 = ComposerKt.f28270f;
            m60384K(function3);
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Pair pair = (Pair) list.get(i2);
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.component1();
                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component2();
                Anchor anchor$runtime_release2 = movableContentStateReference.getAnchor$runtime_release();
                int anchorIndex = movableContentStateReference.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                Ref.IntRef intRef = new Ref.IntRef();
                m60388G();
                m60384K(new ComposerImpl$insertMovableContentGuarded$1$1$1(intRef, anchor$runtime_release2));
                if (movableContentStateReference2 == null) {
                    if (Intrinsics.areEqual(movableContentStateReference.getSlotTable$runtime_release(), this.f28209I)) {
                        m60358f();
                    }
                    SlotReader openReader = movableContentStateReference.getSlotTable$runtime_release().openReader();
                    openReader.reposition(anchorIndex);
                    this.f28220T = anchorIndex;
                    ArrayList arrayList = new ArrayList();
                    m60386I(this, null, null, null, null, new ComposerImpl$insertMovableContentGuarded$1$1$2$1(this, arrayList, openReader, movableContentStateReference), 15, null);
                    if (!arrayList.isEmpty()) {
                        m60384K(new ComposerImpl$insertMovableContentGuarded$1$1$2$2(intRef, arrayList));
                    }
                    Unit unit = Unit.INSTANCE;
                    openReader.close();
                } else {
                    MovableContentState movableContentStateResolve$runtime_release = this.f28229b.movableContentStateResolve$runtime_release(movableContentStateReference2);
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                        slotTable$runtime_release = movableContentStateReference2.getSlotTable$runtime_release();
                    }
                    if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(i)) == null) {
                        anchor$runtime_release = movableContentStateReference2.getAnchor$runtime_release();
                    }
                    m60310c = ComposerKt.m60310c(slotTable$runtime_release, anchor$runtime_release);
                    if (!m60310c.isEmpty()) {
                        m60384K(new ComposerImpl$insertMovableContentGuarded$1$1$3(intRef, m60310c));
                        if (Intrinsics.areEqual(movableContentStateReference.getSlotTable$runtime_release(), this.f28231c)) {
                            int anchorIndex2 = this.f28231c.anchorIndex(anchor$runtime_release2);
                            m60331s0(anchorIndex2, m60325v0(anchorIndex2) + m60310c.size());
                        }
                    }
                    m60384K(new ComposerImpl$insertMovableContentGuarded$1$1$4(movableContentStateResolve$runtime_release, this, movableContentStateReference2, movableContentStateReference));
                    SlotReader openReader2 = slotTable$runtime_release.openReader();
                    SlotReader slotReader = this.f28208H;
                    int[] iArr = this.f28242n;
                    this.f28242n = null;
                    this.f28208H = openReader2;
                    int anchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                    openReader2.reposition(anchorIndex3);
                    this.f28220T = anchorIndex3;
                    ArrayList arrayList2 = new ArrayList();
                    List list5 = this.f28233e;
                    try {
                        this.f28233e = arrayList2;
                        list2 = list5;
                    } catch (Throwable th2) {
                        th = th2;
                        list2 = list5;
                    }
                    try {
                        m60387H(movableContentStateReference2.getComposition$runtime_release(), movableContentStateReference.getComposition$runtime_release(), Integer.valueOf(openReader2.getCurrentGroup()), movableContentStateReference2.getInvalidations$runtime_release(), new ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(this, movableContentStateReference));
                        Unit unit2 = Unit.INSTANCE;
                        this.f28233e = list2;
                        if (!arrayList2.isEmpty()) {
                            m60384K(new ComposerImpl$insertMovableContentGuarded$1$1$5$1$2(intRef, arrayList2));
                        }
                        this.f28208H = slotReader;
                        this.f28242n = iArr;
                        openReader2.close();
                    } catch (Throwable th3) {
                        th = th3;
                        this.f28233e = list2;
                        throw th;
                    }
                }
                function32 = ComposerKt.f28267c;
                m60384K(function32);
                i2++;
                i = 0;
            }
            m60384K(ComposerImpl$insertMovableContentGuarded$1$2.INSTANCE);
            this.f28220T = 0;
            Unit unit3 = Unit.INSTANCE;
            this.f28233e = list4;
        } catch (Throwable th4) {
            this.f28233e = list4;
            throw th4;
        }
    }

    /* renamed from: t0 */
    public final void m60329t0(int i, int i2) {
        int m60325v0 = m60325v0(i);
        if (m60325v0 != i2) {
            int i3 = i2 - m60325v0;
            int size = this.f28236h.getSize() - 1;
            while (i != -1) {
                int m60325v02 = m60325v0(i) + i3;
                m60331s0(i, m60325v02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        Pending pending = (Pending) this.f28236h.peek(i4);
                        if (pending != null && pending.m60250n(i, m60325v02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f28208H.getParent();
                } else if (!this.f28208H.isNode(i)) {
                    i = this.f28208H.parent(i);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.f28208H.getTable$runtime_release());
        if (this.f28206F && indexFor >= this.f28208H.getCurrentGroup()) {
            ComposerKt.m60301l(this.f28247s, indexFor, scope, obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    /* renamed from: u0 */
    public final PersistentCompositionLocalMap m60327u0(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder = persistentCompositionLocalMap.builder();
        builder.putAll(persistentCompositionLocalMap2);
        ?? build = builder.build();
        m60345l0(204, ComposerKt.getProviderMaps());
        changed((Object) build);
        changed(persistentCompositionLocalMap2);
        m60346l();
        return build;
    }

    @PublishedApi
    public final void updateCachedValue(@Nullable Object obj) {
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object obj) {
        updateValue(obj);
    }

    @PublishedApi
    public final void updateValue(@Nullable Object obj) {
        if (getInserting()) {
            this.f28210J.update(obj);
            if (obj instanceof RememberObserver) {
                m60384K(new ComposerImpl$updateValue$1(obj));
                this.f28232d.add(obj);
                return;
            }
            return;
        }
        int groupSlotIndex = this.f28208H.getGroupSlotIndex() - 1;
        if (obj instanceof RememberObserver) {
            this.f28232d.add(obj);
        }
        m60370Y(true, new ComposerImpl$updateValue$2(obj, groupSlotIndex));
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        m60323w0();
        if (!getInserting()) {
            Object m60334r = m60334r(this.f28208H);
            m60381N(m60334r);
            if (this.f28253y && (m60334r instanceof ComposeNodeLifecycleCallback)) {
                m60383L(ComposerImpl$useNode$2.INSTANCE);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: v0 */
    public final int m60325v0(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap hashMap = this.f28243o;
            if (hashMap != null && (num = (Integer) hashMap.get(Integer.valueOf(i))) != null) {
                return num.intValue();
            }
            return 0;
        }
        int[] iArr = this.f28242n;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.f28208H.nodeCount(i);
    }

    public final void verifyConsistent$runtime_release() {
        this.f28209I.verifyWellFormed();
    }

    /* renamed from: w0 */
    public final void m60323w0() {
        if (this.f28246r) {
            this.f28246r = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: x */
    public final int m60322x(int i) {
        return (-2) - i;
    }

    /* renamed from: x0 */
    public final void m60321x0() {
        if (!this.f28246r) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
        r10.f28250v.set(r10.f28208H.getCurrentGroup(), r12);
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60320y(androidx.compose.runtime.MovableContent r11, androidx.compose.runtime.PersistentCompositionLocalMap r12, java.lang.Object r13, boolean r14) {
        /*
            r10 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r10.startMovableGroup(r0, r11)
            r10.changed(r13)
            int r1 = r10.getCompoundKeyHash()
            r10.f28217Q = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r10.getInserting()     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L21
            androidx.compose.runtime.SlotWriter r0 = r10.f28210J     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotWriter.markGroup$default(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r11 = move-exception
            goto La5
        L21:
            boolean r0 = r10.getInserting()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L28
            goto L35
        L28:
            androidx.compose.runtime.SlotReader r0 = r10.f28208H     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.getGroupAux()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r12)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L35
            r3 = 1
        L35:
            if (r3 == 0) goto L42
            androidx.compose.runtime.collection.IntMap r0 = r10.f28250v     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotReader r5 = r10.f28208H     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.getCurrentGroup()     // Catch: java.lang.Throwable -> L1e
            r0.set(r5, r12)     // Catch: java.lang.Throwable -> L1e
        L42:
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.GroupKind$Companion r5 = androidx.compose.runtime.GroupKind.f28327a     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.m71381getGroupULZAiWs()     // Catch: java.lang.Throwable -> L1e
            r6 = 202(0xca, float:2.83E-43)
            r10.m60349j0(r6, r0, r5, r12)     // Catch: java.lang.Throwable -> L1e
            boolean r12 = r10.getInserting()     // Catch: java.lang.Throwable -> L1e
            if (r12 == 0) goto L87
            if (r14 != 0) goto L87
            r10.f28211K = r4     // Catch: java.lang.Throwable -> L1e
            r10.f28212L = r2     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotWriter r12 = r10.f28210J     // Catch: java.lang.Throwable -> L1e
            int r14 = r12.getParent()     // Catch: java.lang.Throwable -> L1e
            int r14 = r12.parent(r14)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.Anchor r7 = r12.anchor(r14)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.MovableContentStateReference r12 = new androidx.compose.runtime.MovableContentStateReference     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ControlledComposition r5 = r10.getComposition()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.SlotTable r6 = r10.f28209I     // Catch: java.lang.Throwable -> L1e
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.PersistentCompositionLocalMap r9 = r10.m60356g()     // Catch: java.lang.Throwable -> L1e
            r2 = r12
            r3 = r11
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.CompositionContext r11 = r10.f28229b     // Catch: java.lang.Throwable -> L1e
            r11.insertMovableContent$runtime_release(r12)     // Catch: java.lang.Throwable -> L1e
            goto L9c
        L87:
            boolean r12 = r10.f28251w     // Catch: java.lang.Throwable -> L1e
            r10.f28251w = r3     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1 r14 = new androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1     // Catch: java.lang.Throwable -> L1e
            r14.<init>(r11, r13)     // Catch: java.lang.Throwable -> L1e
            r11 = 316014703(0x12d6006f, float:1.3505406E-27)
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r11, r4, r14)     // Catch: java.lang.Throwable -> L1e
            androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(r10, r11)     // Catch: java.lang.Throwable -> L1e
            r10.f28251w = r12     // Catch: java.lang.Throwable -> L1e
        L9c:
            r10.m60346l()
            r10.f28217Q = r1
            r10.endMovableGroup()
            return
        La5:
            r10.m60346l()
            r10.f28217Q = r1
            r10.endMovableGroup()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m60320y(androidx.compose.runtime.MovableContent, androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object, boolean):void");
    }

    /* renamed from: z */
    public final Object m60319z(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && f == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Double) && d == ((Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }
}
