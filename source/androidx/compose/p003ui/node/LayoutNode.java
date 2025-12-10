package androidx.compose.p003ui.node;

import android.view.View;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.InternalComposeUiApi;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusTargetNode;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.ModifierInfo;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.Remeasurement;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.JvmActuals_jvmKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.pattern.parser.Parser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u0000 \u0096\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\b\u0096\u0003\u0097\u0003\u0098\u0003\u0099\u0003B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\"\u0010\u0010J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\u000eH\u0000¢\u0006\u0004\b(\u0010\u0010J'\u0010.\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u0010-J\u000f\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0004\b/\u0010\u0010J\u0017\u00105\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u0010\u0010J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010>\u001a\u00020\u000eH\u0000¢\u0006\u0004\b=\u0010\u0010J\u001f\u0010B\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0000¢\u0006\u0004\bA\u0010&J\u000f\u0010D\u001a\u00020\u000eH\u0000¢\u0006\u0004\bC\u0010\u0010J\u000f\u0010F\u001a\u00020\u000eH\u0000¢\u0006\u0004\bE\u0010\u0010J\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010JJ9\u0010T\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020\b2\b\b\u0002\u0010Q\u001a\u00020\bH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bR\u0010SJ9\u0010W\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020L2\u0006\u0010U\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020\b2\b\b\u0002\u0010Q\u001a\u00020\bH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bV\u0010SJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u0000H\u0000¢\u0006\u0004\bY\u0010ZJ#\u0010`\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\b2\b\b\u0002\u0010]\u001a\u00020\bH\u0000¢\u0006\u0004\b^\u0010_J#\u0010b\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\b2\b\b\u0002\u0010]\u001a\u00020\bH\u0000¢\u0006\u0004\ba\u0010_J\u000f\u0010d\u001a\u00020\u000eH\u0000¢\u0006\u0004\bc\u0010\u0010J!\u0010h\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0eH\u0080\bø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u0019\u0010k\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\bH\u0000¢\u0006\u0004\bi\u0010jJ\u0019\u0010m\u001a\u00020\u000e2\b\b\u0002\u0010\\\u001a\u00020\bH\u0000¢\u0006\u0004\bl\u0010jJ\u000f\u0010o\u001a\u00020\u000eH\u0000¢\u0006\u0004\bn\u0010\u0010J\u0015\u0010r\u001a\b\u0012\u0004\u0012\u00020q0pH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010u\u001a\u00020\u000eH\u0000¢\u0006\u0004\bt\u0010\u0010J!\u0010z\u001a\u00020\b2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010vH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bx\u0010yJ!\u0010|\u001a\u00020\b2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010vH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b{\u0010yJ\u000f\u0010~\u001a\u00020\u000eH\u0000¢\u0006\u0004\b}\u0010\u0010J\u0010\u0010\u0080\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u007f\u0010\u0010J\u0011\u0010\u0082\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0005\b\u0081\u0001\u0010\u0010J\u001a\u0010\u0084\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u0083\u0001\u001a\u00020\b¢\u0006\u0005\b\u0084\u0001\u0010jJ\u0011\u0010\u0086\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0005\b\u0085\u0001\u0010\u0010J\u0011\u0010\u0087\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0087\u0001\u0010\u0010J\u0011\u0010\u0088\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0088\u0001\u0010\u0010J*\u0010\u008b\u0001\u001a\u00020\u000e2\u0013\u0010\u0013\u001a\u000f\u0012\u0005\u0012\u00030\u0089\u0001\u0012\u0004\u0012\u00020\u000e0\u0012H\u0080\bø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u0010\u0015J*\u0010\u008e\u0001\u001a\u00020\u000e2\u0013\u0010\u0013\u001a\u000f\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020\u000e0\u0012H\u0080\bø\u0001\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u0015J\u0011\u0010\u0090\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0005\b\u008f\u0001\u0010\u0010J\u0011\u0010\u0092\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0005\b\u0091\u0001\u0010\u0010J\u0011\u0010\u0093\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0093\u0001\u0010\u0010J\u0011\u0010\u0094\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0094\u0001\u0010\u0010J\u0011\u0010\u0095\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0095\u0001\u0010\u0010J\u0011\u0010\u0096\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0010J\u0011\u0010\u0097\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0010J\u001a\u0010\u0099\u0001\u001a\u00020\u000e2\u0007\u0010\u0098\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0005\b\u0099\u0001\u0010ZJ\u001d\u0010\u009b\u0001\u001a\u0002082\t\b\u0002\u0010\u009a\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u009d\u0001\u0010\u0010J\u0011\u0010\u009e\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u0010J\u0011\u0010\u009f\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0010J\u0011\u0010 \u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b \u0001\u0010\u0010J\u0011\u0010¡\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b¡\u0001\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R(\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R9\u0010®\u0001\u001a\u00020\n2\u0007\u0010ª\u0001\u001a\u00020\n8W@WX\u0097\u000e¢\u0006\u001f\n\u0006\b¡\u0001\u0010¥\u0001\u0012\u0005\b\u00ad\u0001\u0010\u0010\u001a\u0006\b«\u0001\u0010§\u0001\"\u0006\b¬\u0001\u0010©\u0001R(\u0010²\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010£\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0005\b±\u0001\u0010jR5\u0010¹\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0005\b¸\u0001\u0010ZR\u0019\u0010»\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¥\u0001R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\"\u0010Â\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010Á\u0001R\u0019\u0010Ã\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010£\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010µ\u0001R-\u00102\u001a\u0004\u0018\u0001012\t\u0010ª\u0001\u001a\u0004\u0018\u0001018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R3\u0010Ï\u0001\u001a\f\u0018\u00010È\u0001j\u0005\u0018\u0001`É\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R)\u0010\u009a\u0001\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010¥\u0001\u001a\u0006\bÐ\u0001\u0010§\u0001\"\u0006\bÑ\u0001\u0010©\u0001R\u0018\u0010h\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010£\u0001R\u001c\u0010Ô\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010Ó\u0001R\u001e\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Á\u0001R\u0019\u0010Ø\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010£\u0001R4\u0010á\u0001\u001a\u00030Ù\u00012\b\u0010Ú\u0001\u001a\u00030Ù\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R \u0010ç\u0001\u001a\u00030â\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R4\u0010ï\u0001\u001a\u00030è\u00012\b\u0010Ú\u0001\u001a\u00030è\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R4\u0010÷\u0001\u001a\u00030ð\u00012\b\u0010Ú\u0001\u001a\u00030ð\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R4\u0010ÿ\u0001\u001a\u00030ø\u00012\b\u0010Ú\u0001\u001a\u00030ø\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R4\u0010\u0087\u0002\u001a\u00030\u0080\u00022\b\u0010Ú\u0001\u001a\u00030\u0080\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R)\u0010\u008e\u0002\u001a\u00030\u0088\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b?\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0019\u0010\u008f\u0002\u001a\u00030\u0088\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u0089\u0002R/\u0010\u0094\u0002\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u0090\u0002\u0010£\u0001\u0012\u0005\b\u0093\u0002\u0010\u0010\u001a\u0006\b\u0091\u0002\u0010°\u0001\"\u0005\b\u0092\u0002\u0010jR \u0010\u009a\u0002\u001a\u00030\u0095\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R \u0010 \u0002\u001a\u00030\u009b\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R,\u0010¨\u0002\u001a\u0005\u0018\u00010¡\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R\u001c\u0010«\u0002\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R(\u0010¯\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¬\u0002\u0010£\u0001\u001a\u0006\b\u00ad\u0002\u0010°\u0001\"\u0005\b®\u0002\u0010jR4\u0010·\u0002\u001a\u00030°\u00022\b\u0010Ú\u0001\u001a\u00030°\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b±\u0002\u0010²\u0002\u001a\u0006\b³\u0002\u0010´\u0002\"\u0006\bµ\u0002\u0010¶\u0002R6\u0010½\u0002\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¸\u0002\u0010¹\u0002\u001a\u0006\bº\u0002\u0010»\u0002\"\u0005\b¼\u0002\u0010\u0015R6\u0010Á\u0002\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¾\u0002\u0010¹\u0002\u001a\u0006\b¿\u0002\u0010»\u0002\"\u0005\bÀ\u0002\u0010\u0015R(\u0010Ä\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010£\u0001\u001a\u0006\bÂ\u0002\u0010°\u0001\"\u0005\bÃ\u0002\u0010jR\u0019\u0010Æ\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010£\u0001R\u0016\u0010Ç\u0002\u001a\u0004\u0018\u00010\b8F¢\u0006\b\u001a\u0006\bÇ\u0002\u0010È\u0002R\u001c\u0010Ê\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000p8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0002\u0010sR\u001d\u0010Í\u0002\u001a\t\u0012\u0005\u0012\u00030Ë\u00020p8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0002\u0010sR\u001d\u0010Ï\u0002\u001a\t\u0012\u0005\u0012\u00030Ë\u00020p8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0002\u0010sR\u001e\u0010Ò\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000À\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R\u001c\u0010Ô\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000p8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0002\u0010sR\u0019\u0010Ö\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010·\u0001R\u0017\u0010×\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010°\u0001R\u0018\u0010Û\u0002\u001a\u00030Ø\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0002\u0010Ú\u0002R\u001f\u0010ß\u0002\u001a\n\u0018\u00010Ü\u0002R\u00030\u009b\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u001d\u0010ã\u0002\u001a\b0à\u0002R\u00030\u009b\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bá\u0002\u0010â\u0002R\u001a\u0010æ\u0002\u001a\u0005\u0018\u00010Ò\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010å\u0002R%\u0010é\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000À\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bè\u0002\u0010\u0010\u001a\u0006\bç\u0002\u0010Ñ\u0002R\u0017\u0010ê\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bê\u0002\u0010°\u0001R\u0017\u0010ì\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bë\u0002\u0010°\u0001R\u0017\u0010î\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bí\u0002\u0010§\u0001R\u0017\u0010ð\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0002\u0010§\u0001R\u0017\u0010ò\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bñ\u0002\u0010°\u0001R\u0018\u0010ö\u0002\u001a\u00030ó\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bô\u0002\u0010õ\u0002R\u0017\u0010÷\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b÷\u0002\u0010°\u0001R\u0017\u0010ù\u0002\u001a\u00020\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\bø\u0002\u0010§\u0001R\u0018\u0010û\u0002\u001a\u00030\u0088\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bú\u0002\u0010\u008b\u0002R\u0018\u0010ý\u0002\u001a\u00030\u0088\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0002\u0010\u008b\u0002R\u0018\u0010\u0080\u0003\u001a\u00030\u008c\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ÿ\u0002R\u0018\u0010\u0082\u0003\u001a\u00030\u008c\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0003\u0010ÿ\u0002R\u0018\u0010\u0086\u0003\u001a\u00030\u0083\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0003\u0010\u0085\u0003R\u0017\u0010\u0088\u0003\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0003\u0010°\u0001R\u0017\u0010\u008a\u0003\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0003\u0010°\u0001R\u0017\u0010\u008c\u0003\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0003\u0010°\u0001R\u0017\u0010\u008e\u0003\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0003\u0010°\u0001R\u0019\u0010\u0091\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0003\u0010\u0090\u0003R\u0018\u0010\u0094\u0003\u001a\u00030\u0092\u00038BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010\u0093\u0003R\u001a\u0010\u0095\u0003\u001a\u0005\u0018\u00010\u008c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010ÿ\u0002\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u009a\u0003"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "updateChildrenIfDirty$ui_release", "()V", "updateChildrenIfDirty", "Lkotlin/Function1;", "block", "forEachChild", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEachChildIndexed", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", FirebaseAnalytics.Param.INDEX, "instance", "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "onZSortedChildrenInvalidated$ui_release", "onZSortedChildrenInvalidated", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "removeAll", "from", TypedValues.TransitionType.S_TO, "move$ui_release", "(III)V", "move", "invalidateSemantics$ui_release", "invalidateSemantics", "Landroidx/compose/ui/node/Owner;", Constant.REGISTER_LEVEL_OWNER, "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "", "toString", "()Ljava/lang/String;", "invalidateLayer$ui_release", "invalidateLayer", "invalidateParentData$ui_release", "invalidateParentData", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "place$ui_release", "place", "replace$ui_release", Parser.REPLACE_CONVERTER_WORD, "lookaheadReplace$ui_release", "lookaheadReplace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "hitTestSemantics", "it", "rescheduleRemeasureOrRelayout$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "rescheduleRemeasureOrRelayout", "forceRequest", "scheduleMeasureAndLayout", "requestRemeasure$ui_release", "(ZZ)V", "requestRemeasure", "requestLookaheadRemeasure$ui_release", "requestLookaheadRemeasure", "invalidateMeasurements$ui_release", "invalidateMeasurements", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "ignoreRemeasureRequests", "requestRelayout$ui_release", "(Z)V", "requestRelayout", "requestLookaheadRelayout$ui_release", "requestLookaheadRelayout", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lookaheadRemeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "lookaheadRemeasure", "remeasure-_Sx5XlM$ui_release", "remeasure", "markLayoutPending$ui_release", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "isRootOfInvalidation", "invalidateSubtree", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "forceRemeasure", "onLayoutComplete", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "forEachCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "forEachCoordinatorIncludingInner$ui_release", "forEachCoordinatorIncludingInner", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "resetSubtreeIntrinsicsUsage", "onReuse", "onDeactivate", "onRelease", OperatorName.MOVE_TO, OperatorName.SET_LINE_JOINSTYLE, "child", OperatorName.NON_STROKING_CMYK, "depth", "d", "(I)Ljava/lang/String;", OperatorName.LINE_TO, OperatorName.ENDPATH, OperatorName.CLOSE_PATH, "i", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getSemanticsId", "()I", "setSemanticsId", "(I)V", "<set-?>", "getCompositeKeyHash", "setCompositeKeyHash", "getCompositeKeyHash$annotations", "compositeKeyHash", "isVirtualLookaheadRoot$ui_release", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "e", "Landroidx/compose/ui/node/LayoutNode;", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "o", "lookaheadRoot", OperatorName.FILL_NON_ZERO, "virtualChildrenCount", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "_foldedParent", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "getDepth$ui_release", "setDepth$ui_release", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_collapsedSemantics", "p", "_zSortedChildren", OperatorName.SAVE, "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/unit/Density;", "t", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "u", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "viewConfiguration", "Landroidx/compose/runtime/CompositionLocalMap;", OperatorName.SET_LINE_WIDTH, "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "z", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Landroidx/compose/ui/node/NodeChain;", "A", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "B", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "C", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "subcompositionsState", "D", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", ExifInterface.LONGITUDE_EAST, "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "innerLayerCoordinatorIsDirty", "Landroidx/compose/ui/Modifier;", "F", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", OperatorName.STROKING_COLOR_GRAY, "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "onAttach", "H", "getOnDetach$ui_release", "setOnDetach$ui_release", "onDetach", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "needsOnPositionedDispatch", OperatorName.SET_LINE_CAPSTYLE, "deactivated", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "getFoldedChildren$ui_release", "foldedChildren", "Landroidx/compose/ui/layout/Measurable;", "getChildMeasurables$ui_release", "childMeasurables", "getChildLookaheadMeasurables$ui_release", "childLookaheadMeasurables", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemantics", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "getHasFixedInnerContentConstraints$ui_release", "hasFixedInnerContentConstraints", "getWidth", "width", "getHeight", "height", "getAlignmentLinesRequired$ui_release", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "isPlaced", "getPlaceOrder$ui_release", "placeOrder", "getMeasuredByParent$ui_release", "measuredByParent", "getMeasuredByParentInLookahead$ui_release", "measuredByParentInLookahead", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "getOuterCoordinator$ui_release", "outerCoordinator", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getMeasurePending$ui_release", "measurePending", "getLayoutPending$ui_release", "layoutPending", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "", "()F", "zIndex", "innerLayerCoordinator", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 14 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1461:1\n1242#1,7:1468\n1242#1,7:1540\n1067#1,2:1548\n1069#1,2:1562\n197#1:1565\n1230#1,7:1963\n197#1:2138\n197#1:2150\n197#1:2162\n1242#1,7:2174\n1182#2:1462\n1161#2,2:1463\n1182#2:1465\n1161#2,2:1466\n1182#2:1475\n1161#2,2:1476\n1182#2:1611\n1161#2,2:1612\n1182#2:1675\n1161#2,2:1676\n1182#2:1749\n1161#2,2:1750\n1182#2:1860\n1161#2,2:1861\n1182#2:1924\n1161#2,2:1925\n1182#2:2006\n1161#2,2:2007\n1182#2:2091\n1161#2,2:2092\n48#3:1478\n48#3:1513\n48#3:1528\n48#3:1550\n460#4,7:1479\n146#4:1486\n467#4,4:1487\n460#4,11:1491\n476#4,11:1502\n460#4,11:1514\n460#4,11:1529\n460#4,11:1551\n146#4:1564\n460#4,11:1566\n460#4,11:2045\n460#4,11:2139\n460#4,11:2151\n460#4,11:2163\n76#5:1525\n76#5:1527\n76#5:1547\n78#5:1577\n78#5:1640\n101#5:1714\n88#5:1788\n90#5,3:1804\n94#5:1808\n90#5:1813\n92#5,3:1815\n90#5:1821\n86#5:1888\n86#5:1908\n72#5:1970\n72#5:1990\n84#5:2056\n74#5:2125\n72#5:2126\n72#5:2130\n72#5:2132\n74#5:2133\n1#6:1526\n689#7,8:1578\n712#7,3:1586\n697#7,2:1589\n700#7,2:1634\n715#7,3:1636\n702#7:1639\n689#7,8:1641\n712#7,3:1649\n697#7,2:1652\n690#7:1654\n691#7,11:1698\n715#7,3:1709\n702#7:1712\n692#7:1713\n689#7,8:1715\n712#7,3:1723\n697#7,2:1726\n690#7:1728\n691#7,11:1772\n715#7,3:1783\n702#7:1786\n692#7:1787\n712#7,3:1810\n715#7,3:1818\n728#7,18:1822\n746#7,3:1883\n740#7:1886\n731#7:1887\n689#7,8:1889\n712#7,3:1897\n697#7,2:1900\n690#7:1902\n691#7,11:1947\n715#7,3:1958\n702#7:1961\n692#7:1962\n689#7,8:1971\n712#7,3:1979\n697#7,2:1982\n690#7:1984\n691#7,11:2029\n715#7,3:2040\n702#7:2043\n692#7:2044\n712#7,3:2127\n715#7,3:2135\n383#8,6:1591\n393#8,2:1598\n395#8,8:1603\n403#8,9:1614\n412#8,8:1626\n383#8,6:1655\n393#8,2:1662\n395#8,8:1667\n403#8,9:1678\n412#8,8:1690\n383#8,6:1729\n393#8,2:1736\n395#8,8:1741\n403#8,9:1752\n412#8,8:1764\n383#8,6:1840\n393#8,2:1847\n395#8,8:1852\n403#8,9:1863\n412#8,8:1875\n383#8,5:1903\n388#8:1909\n393#8,2:1911\n395#8,8:1916\n403#8,9:1927\n412#8,8:1939\n383#8,5:1985\n388#8:1991\n393#8,2:1993\n395#8,8:1998\n403#8,9:2009\n412#8,8:2021\n383#8,6:2071\n393#8,2:2078\n395#8,8:2083\n403#8,9:2094\n412#8,8:2106\n261#9:1597\n261#9:1661\n261#9:1735\n261#9:1814\n261#9:1846\n261#9:1910\n261#9:1992\n261#9:2077\n261#9:2131\n261#9:2134\n234#10,3:1600\n237#10,3:1623\n234#10,3:1664\n237#10,3:1687\n234#10,3:1738\n237#10,3:1761\n234#10,3:1849\n237#10,3:1872\n234#10,3:1913\n237#10,3:1936\n234#10,3:1995\n237#10,3:2018\n234#10,3:2080\n237#10,3:2103\n365#11,15:1789\n47#12:1807\n52#13:1809\n107#14:2057\n96#14,13:2058\n109#14:2114\n101#14,10:2115\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1468,7\n490#1:1540,7\n524#1:1548,2\n524#1:1562,2\n593#1:1565\n1110#1:1963,7\n1278#1:2138\n1300#1:2150\n1312#1:2162\n1348#1:2174,7\n128#1:1462\n128#1:1463,2\n539#1:1465\n539#1:1466,2\n140#1:1475\n140#1:1476,2\n656#1:1611\n656#1:1612,2\n678#1:1675\n678#1:1676,2\n690#1:1749\n690#1:1750,2\n1058#1:1860\n1058#1:1861,2\n1094#1:1924\n1094#1:1925,2\n1192#1:2006\n1192#1:2007,2\n1221#1:2091\n1221#1:2092,2\n144#1:1478\n368#1:1513\n480#1:1528\n525#1:1550\n144#1:1479,7\n146#1:1486\n144#1:1487,4\n197#1:1491,11\n199#1:1502,11\n368#1:1514,11\n480#1:1529,11\n525#1:1551,11\n555#1:1564\n593#1:1566,11\n1196#1:2045,11\n1278#1:2139,11\n1300#1:2151,11\n1312#1:2163,11\n416#1:1525\n463#1:1527\n520#1:1547\n656#1:1577\n678#1:1640\n690#1:1714\n846#1:1788\n1048#1:1804,3\n1048#1:1808\n1050#1:1813\n1050#1:1815,3\n1058#1:1821\n1094#1:1888\n1095#1:1908\n1192#1:1970\n1193#1:1990\n1221#1:2056\n1251#1:2125\n1251#1:2126\n1253#1:2130\n1254#1:2132\n1258#1:2133\n656#1:1578,8\n656#1:1586,3\n656#1:1589,2\n656#1:1634,2\n656#1:1636,3\n656#1:1639\n678#1:1641,8\n678#1:1649,3\n678#1:1652,2\n678#1:1654\n678#1:1698,11\n678#1:1709,3\n678#1:1712\n678#1:1713\n690#1:1715,8\n690#1:1723,3\n690#1:1726,2\n690#1:1728\n690#1:1772,11\n690#1:1783,3\n690#1:1786\n690#1:1787\n1049#1:1810,3\n1049#1:1818,3\n1058#1:1822,18\n1058#1:1883,3\n1058#1:1886\n1058#1:1887\n1094#1:1889,8\n1094#1:1897,3\n1094#1:1900,2\n1094#1:1902\n1094#1:1947,11\n1094#1:1958,3\n1094#1:1961\n1094#1:1962\n1192#1:1971,8\n1192#1:1979,3\n1192#1:1982,2\n1192#1:1984\n1192#1:2029,11\n1192#1:2040,3\n1192#1:2043\n1192#1:2044\n1252#1:2127,3\n1252#1:2135,3\n656#1:1591,6\n656#1:1598,2\n656#1:1603,8\n656#1:1614,9\n656#1:1626,8\n678#1:1655,6\n678#1:1662,2\n678#1:1667,8\n678#1:1678,9\n678#1:1690,8\n690#1:1729,6\n690#1:1736,2\n690#1:1741,8\n690#1:1752,9\n690#1:1764,8\n1058#1:1840,6\n1058#1:1847,2\n1058#1:1852,8\n1058#1:1863,9\n1058#1:1875,8\n1094#1:1903,5\n1094#1:1909\n1094#1:1911,2\n1094#1:1916,8\n1094#1:1927,9\n1094#1:1939,8\n1192#1:1985,5\n1192#1:1991\n1192#1:1993,2\n1192#1:1998,8\n1192#1:2009,9\n1192#1:2021,8\n1221#1:2071,6\n1221#1:2078,2\n1221#1:2083,8\n1221#1:2094,9\n1221#1:2106,8\n656#1:1597\n678#1:1661\n690#1:1735\n1050#1:1814\n1058#1:1846\n1094#1:1910\n1192#1:1992\n1221#1:2077\n1253#1:2131\n1258#1:2134\n656#1:1600,3\n656#1:1623,3\n678#1:1664,3\n678#1:1687,3\n690#1:1738,3\n690#1:1761,3\n1058#1:1849,3\n1058#1:1872,3\n1094#1:1913,3\n1094#1:1936,3\n1192#1:1995,3\n1192#1:2018,3\n1221#1:2080,3\n1221#1:2103,3\n891#1:1789,15\n1048#1:1807\n1048#1:1809\n1221#1:2057\n1221#1:2058,13\n1221#1:2114\n1221#1:2115,10\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNode */
/* loaded from: classes2.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: K */
    public static final NoIntrinsicsMeasurePolicy f30243K = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo69194measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) mo69194measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        @NotNull
        /* renamed from: measure-3p2s80s */
        public Void mo69194measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    /* renamed from: L */
    public static final Function0 f30244L = LayoutNode$Companion$Constructor$1.INSTANCE;

    /* renamed from: M */
    public static final ViewConfiguration f30245M = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ  reason: not valid java name */
        public long mo72913getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m73766getZeroMYxV2XQ();
        }

        @Override // androidx.compose.p003ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    /* renamed from: N */
    public static final Comparator f30246N = new Comparator() { // from class: ji0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.m59490a((LayoutNode) obj, (LayoutNode) obj2);
        }
    };
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    /* renamed from: A */
    public final NodeChain f30247A;

    /* renamed from: B */
    public final LayoutNodeLayoutDelegate f30248B;

    /* renamed from: C */
    public LayoutNodeSubcompositionsState f30249C;

    /* renamed from: D */
    public NodeCoordinator f30250D;

    /* renamed from: E */
    public boolean f30251E;

    /* renamed from: F */
    public Modifier f30252F;

    /* renamed from: G */
    public Function1 f30253G;

    /* renamed from: H */
    public Function1 f30254H;

    /* renamed from: I */
    public boolean f30255I;

    /* renamed from: J */
    public boolean f30256J;

    /* renamed from: a */
    public final boolean f30257a;

    /* renamed from: b */
    public int f30258b;

    /* renamed from: c */
    public int f30259c;

    /* renamed from: d */
    public boolean f30260d;

    /* renamed from: e */
    public LayoutNode f30261e;

    /* renamed from: f */
    public int f30262f;

    /* renamed from: g */
    public final MutableVectorWithMutationTracking f30263g;

    /* renamed from: h */
    public MutableVector f30264h;

    /* renamed from: i */
    public boolean f30265i;

    /* renamed from: j */
    public LayoutNode f30266j;

    /* renamed from: k */
    public Owner f30267k;

    /* renamed from: l */
    public AndroidViewHolder f30268l;

    /* renamed from: m */
    public int f30269m;

    /* renamed from: n */
    public boolean f30270n;

    /* renamed from: o */
    public SemanticsConfiguration f30271o;

    /* renamed from: p */
    public final MutableVector f30272p;

    /* renamed from: q */
    public boolean f30273q;

    /* renamed from: r */
    public MeasurePolicy f30274r;

    /* renamed from: s */
    public final IntrinsicsPolicy f30275s;

    /* renamed from: t */
    public Density f30276t;

    /* renamed from: u */
    public LayoutDirection f30277u;

    /* renamed from: v */
    public ViewConfiguration f30278v;

    /* renamed from: w */
    public CompositionLocalMap f30279w;

    /* renamed from: x */
    public UsageByParent f30280x;

    /* renamed from: y */
    public UsageByParent f30281y;

    /* renamed from: z */
    public boolean f30282z;

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.f30244L;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.f30245M;
        }

        @NotNull
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.f30246N;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$LayoutState */
    /* loaded from: classes2.dex */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)Ljava/lang/Void;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.LayoutNode$NoIntrinsicsMeasurePolicy */
    /* loaded from: classes2.dex */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        /* renamed from: a */
        public final String f30283a;

        public NoIntrinsicsMeasurePolicy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f30283a = error;
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        @NotNull
        public Void maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f30283a.toString());
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        @NotNull
        public Void maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f30283a.toString());
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        @NotNull
        public Void minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f30283a.toString());
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        @NotNull
        public Void minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f30283a.toString());
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$UsageByParent */
    /* loaded from: classes2.dex */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    /* renamed from: a */
    public static /* synthetic */ int m59490a(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return m59489b(layoutNode, layoutNode2);
    }

    public static final /* synthetic */ void access$setIgnoreRemeasureRequests$p(LayoutNode layoutNode, boolean z) {
        layoutNode.f30270n = z;
    }

    /* renamed from: b */
    public static final int m59489b(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode.m59484g() == layoutNode2.m59484g()) {
            return Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release());
        }
        return Float.compare(layoutNode.m59484g(), layoutNode2.m59484g());
    }

    /* renamed from: e */
    public static /* synthetic */ String m59486e(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.m59487d(i);
    }

    /* renamed from: g */
    private final float m59484g() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m72905hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        layoutNode.m72909hitTestM_7yMNQ$ui_release(j, hitTestResult, z3, z4);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m72906hitTestSemanticsM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        layoutNode.m72910hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, z3, z4);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m72907lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.f30248B.m72919getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m72911lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m72908remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.f30248B.m72918getLastConstraintsDWUhwKw();
        }
        return layoutNode.m72912remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z, z2);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.requestRemeasure$ui_release(z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attach$ui_release(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    /* renamed from: c */
    public final void m59488c() {
        this.f30281y = this.f30280x;
        this.f30280x = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.f30280x == UsageByParent.InLayoutBlock) {
                    layoutNode.m59488c();
                }
                i++;
            } while (i < size);
        }
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.f30281y = this.f30280x;
        this.f30280x = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.f30280x != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m59487d(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r8) goto L11
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            androidx.compose.runtime.collection.MutableVector r2 = r7.get_children$ui_release()
            int r3 = r2.getSize()
            if (r3 <= 0) goto L42
            java.lang.Object[] r2 = r2.getContent()
            r4 = 0
        L31:
            r5 = r2[r4]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p003ui.node.LayoutNode) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.m59487d(r6)
            r0.append(r5)
            int r4 = r4 + 1
            if (r4 < r3) goto L31
        L42:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "tree.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            if (r8 != 0) goto L5c
            int r8 = r0.length()
            int r8 = r8 + (-1)
            java.lang.String r0 = r0.substring(r1, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r8)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.node.LayoutNode.m59487d(int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void detach$ui_release() {
        /*
            r8 = this;
            androidx.compose.ui.node.Owner r0 = r8.f30267k
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Cannot detach node that is already detached!  Tree: "
            r0.append(r4)
            androidx.compose.ui.node.LayoutNode r4 = r8.getParent$ui_release()
            if (r4 == 0) goto L1b
            java.lang.String r2 = m59486e(r4, r3, r1, r2)
        L1b:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L2c:
            r8.m59482i()
            androidx.compose.ui.node.LayoutNode r4 = r8.getParent$ui_release()
            if (r4 == 0) goto L4d
            r4.invalidateLayer$ui_release()
            r4.invalidateMeasurements$ui_release()
            androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate r4 = r8.getMeasurePassDelegate$ui_release()
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = androidx.compose.p003ui.node.LayoutNode.UsageByParent.NotUsed
            r4.setMeasuredByParent$ui_release(r5)
            androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate r4 = r8.getLookaheadPassDelegate$ui_release()
            if (r4 == 0) goto L4d
            r4.setMeasuredByParent$ui_release(r5)
        L4d:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r4 = r8.f30248B
            r4.resetAlignmentLines()
            kotlin.jvm.functions.Function1 r4 = r8.f30254H
            if (r4 == 0) goto L59
            r4.invoke(r0)
        L59:
            androidx.compose.ui.node.NodeChain r4 = r8.f30247A
            r5 = 8
            int r5 = androidx.compose.p003ui.node.NodeKind.m72961constructorimpl(r5)
            boolean r4 = r4.m72934hasH91voCI$ui_release(r5)
            if (r4 == 0) goto L6a
            r8.invalidateSemantics$ui_release()
        L6a:
            androidx.compose.ui.node.NodeChain r4 = r8.f30247A
            r4.runDetachLifecycle$ui_release()
            access$setIgnoreRemeasureRequests$p(r8, r1)
            androidx.compose.ui.node.MutableVectorWithMutationTracking r4 = r8.f30263g
            androidx.compose.runtime.collection.MutableVector r4 = r4.getVector()
            int r5 = r4.getSize()
            if (r5 <= 0) goto L8d
            java.lang.Object[] r4 = r4.getContent()
            r6 = 0
        L83:
            r7 = r4[r6]
            androidx.compose.ui.node.LayoutNode r7 = (androidx.compose.p003ui.node.LayoutNode) r7
            r7.detach$ui_release()
            int r6 = r6 + r1
            if (r6 < r5) goto L83
        L8d:
            access$setIgnoreRemeasureRequests$p(r8, r3)
            androidx.compose.ui.node.NodeChain r1 = r8.f30247A
            r1.markAsDetached$ui_release()
            r0.onDetach(r8)
            r8.f30267k = r2
            r8.m59476o(r2)
            r8.f30269m = r3
            androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate r0 = r8.getMeasurePassDelegate$ui_release()
            r0.onNodeDetached()
            androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate r0 = r8.getLookaheadPassDelegate$ui_release()
            if (r0 == 0) goto Laf
            r0.onNodeDetached()
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.node.LayoutNode.detach$ui_release():void");
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.f30247A;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(256);
        if ((nodeChain.m59429c() & m72961constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) node;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m72894requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m72961constructorimpl(256)));
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.m59509b(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterCoordinator$ui_release().draw(canvas);
    }

    /* renamed from: f */
    public final NodeCoordinator m59485f() {
        OwnedLayer ownedLayer;
        if (this.f30251E) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this.f30250D = null;
            while (true) {
                if (Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if (innerCoordinator$ui_release != null) {
                    ownedLayer = innerCoordinator$ui_release.getLayer();
                } else {
                    ownedLayer = null;
                }
                if (ownedLayer != null) {
                    this.f30250D = innerCoordinator$ui_release;
                    break;
                } else if (innerCoordinator$ui_release != null) {
                    innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
                } else {
                    innerCoordinator$ui_release = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator = this.f30250D;
        if (nodeCoordinator != null && nodeCoordinator.getLayer() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return nodeCoordinator;
    }

    public final void forEachChild(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachChildIndexed(@NotNull Function2<? super Integer, ? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                block.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachCoordinator$ui_release(@NotNull Function1<? super LayoutModifierNodeCoordinator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            block.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@NotNull Function1<? super NodeCoordinator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            block.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.p003ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.f30261e != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 1, null);
        }
        Constraints m72918getLastConstraintsDWUhwKw = this.f30248B.m72918getLastConstraintsDWUhwKw();
        if (m72918getLastConstraintsDWUhwKw != null) {
            Owner owner = this.f30267k;
            if (owner != null) {
                owner.mo73016measureAndLayout0kLqBqw(this, m72918getLastConstraintsDWUhwKw.m73632unboximpl());
                return;
            }
            return;
        }
        Owner owner2 = this.f30267k;
        if (owner2 != null) {
            AbstractC18176Og1.m67004f(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f30248B;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
            return true;
        }
        return false;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.f30282z;
    }

    @NotNull
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    @NotNull
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.semantics.SemanticsConfiguration, T] */
    @Nullable
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (this.f30247A.m72934hasH91voCI$ui_release(NodeKind.m72961constructorimpl(8)) && this.f30271o == null) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new SemanticsConfiguration();
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new LayoutNode$collapsedSemantics$1(this, objectRef));
            Object obj = objectRef.element;
            this.f30271o = (SemanticsConfiguration) obj;
            return (SemanticsConfiguration) obj;
        }
        return this.f30271o;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.f30259c;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public CompositionLocalMap getCompositionLocalMap() {
        return this.f30279w;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo, androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.f30276t;
    }

    public final int getDepth$ui_release() {
        return this.f30269m;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this.f30263g.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long m72946getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m72946getLastMeasurementConstraintsmsEJaDk$ui_release();
        if (Constraints.m73624getHasFixedWidthimpl(m72946getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m73623getHasFixedHeightimpl(m72946getLastMeasurementConstraintsmsEJaDk$ui_release)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public int getHeight() {
        return this.f30248B.getHeight$ui_release();
    }

    @NotNull
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.f30247A.getInnerCoordinator$ui_release();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.f30251E;
    }

    @Override // androidx.compose.p003ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @Nullable
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.f30268l;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @Nullable
    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.f30268l;
    }

    @NotNull
    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.f30275s;
    }

    @NotNull
    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.f30280x;
    }

    @NotNull
    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.f30248B;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo, androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f30277u;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.f30248B.getLayoutPending$ui_release();
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.f30248B.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.f30248B.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.f30248B.getLookaheadMeasurePending$ui_release();
    }

    @Nullable
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.f30248B.getLookaheadPassDelegate$ui_release();
    }

    @Nullable
    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.f30261e;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @NotNull
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.f30248B.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.f30248B.getMeasurePending$ui_release();
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.f30274r;
    }

    @NotNull
    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    @NotNull
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) {
            return UsageByParent.NotUsed;
        }
        return measuredByParent$ui_release;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.f30252F;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        return this.f30247A.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.f30255I;
    }

    @NotNull
    public final NodeChain getNodes$ui_release() {
        return this.f30247A;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.f30253G;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.f30254H;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.f30247A.getOuterCoordinator$ui_release();
    }

    @Nullable
    public final Owner getOwner$ui_release() {
        return this.f30267k;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this.f30266j;
        while (layoutNode != null && layoutNode.f30257a) {
            layoutNode = layoutNode.f30266j;
        }
        return layoutNode;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.f30258b;
    }

    @Nullable
    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.f30249C;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo, androidx.compose.p003ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.f30278v;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public int getWidth() {
        return this.f30248B.getWidth$ui_release();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.f30273q) {
            this.f30272p.clear();
            MutableVector mutableVector = this.f30272p;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this.f30272p.sortWith(f30246N);
            this.f30273q = false;
        }
        return this.f30272p;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.f30262f == 0) {
            return this.f30263g.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this.f30264h;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    /* renamed from: h */
    public final void m59483h() {
        boolean z;
        boolean z2;
        if (this.f30247A.has$ui_release(NodeKind.m72961constructorimpl(1024) | NodeKind.m72961constructorimpl(2048) | NodeKind.m72961constructorimpl(4096))) {
            for (Modifier.Node head$ui_release = this.f30247A.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                boolean z3 = false;
                if ((NodeKind.m72961constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((NodeKind.m72961constructorimpl(2048) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if ((NodeKind.m72961constructorimpl(4096) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z3 = true;
                }
                if (z4 | z3) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release */
    public final void m72909hitTestM_7yMNQ$ui_release(long j, @NotNull HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterCoordinator$ui_release().m72949hitTestYqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), getOuterCoordinator$ui_release().m72945fromParentPositionMKHz9U(j), hitTestResult, z, z2);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release */
    public final void m72910hitTestSemanticsM_7yMNQ$ui_release(long j, @NotNull HitTestResult hitSemanticsEntities, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        getOuterCoordinator$ui_release().m72949hitTestYqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), getOuterCoordinator$ui_release().m72945fromParentPositionMKHz9U(j), hitSemanticsEntities, true, z2);
    }

    /* renamed from: i */
    public final void m59482i() {
        NodeChain nodeChain = this.f30247A;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(1024);
        if ((nodeChain.m59429c() & m72961constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodeChain.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                            if (focusTargetNode.getFocusState().isFocused()) {
                                LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                                focusTargetNode.scheduleInvalidationForFocusEvents$ui_release();
                            }
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.m59509b(mutableVector);
                    }
                }
            }
        }
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f30270n = true;
        block.invoke();
        this.f30270n = false;
    }

    public final void insertAt$ui_release(int i, @NotNull LayoutNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        String str = null;
        if (instance.f30266j == null) {
            if (instance.f30267k == null) {
                instance.f30266j = this;
                this.f30263g.add(i, instance);
                onZSortedChildrenInvalidated$ui_release();
                if (instance.f30257a) {
                    this.f30262f++;
                }
                m59481j();
                Owner owner = this.f30267k;
                if (owner != null) {
                    instance.attach$ui_release(owner);
                }
                if (instance.f30248B.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f30248B;
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + m59486e(this, 0, 1, null) + " Other tree: " + m59486e(instance, 0, 1, null)).toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(instance);
        sb.append(" because it already has a parent. This tree: ");
        sb.append(m59486e(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode = instance.f30266j;
        if (layoutNode != null) {
            str = m59486e(layoutNode, 0, 1, null);
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator m59485f = m59485f();
        if (m59485f != null) {
            m59485f.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.f30261e != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 3, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 3, null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.f30248B.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this.f30271o = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    public final void invalidateSubtree(boolean z) {
        LayoutNode parent$ui_release;
        if (z && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, 3, null);
        NodeChain nodeChain = this.f30247A;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(2);
        if ((nodeChain.m59429c() & m72961constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m72894requireCoordinator64DMado((LayoutModifierNode) node, NodeKind.m72961constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.m59509b(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i2 = 0;
            do {
                content[i2].invalidateSubtree(false);
                i2++;
            } while (i2 < size);
        }
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public boolean isAttached() {
        if (this.f30267k != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    @Nullable
    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    @Override // androidx.compose.p003ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.f30260d;
    }

    /* renamed from: j */
    public final void m59481j() {
        LayoutNode layoutNode;
        if (this.f30262f > 0) {
            this.f30265i = true;
        }
        if (this.f30257a && (layoutNode = this.f30266j) != null) {
            layoutNode.m59481j();
        }
    }

    /* renamed from: k */
    public final void m59480k(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        if (layoutNode.f30248B.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.f30248B.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.f30267k != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode.f30266j = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.f30257a) {
            this.f30262f--;
            MutableVector vector = layoutNode.f30263g.getVector();
            int size = vector.getSize();
            if (size > 0) {
                Object[] content = vector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i++;
                } while (i < size);
            }
        }
        m59481j();
        onZSortedChildrenInvalidated$ui_release();
    }

    /* renamed from: l */
    public final void m59479l() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release */
    public final boolean m72911lookaheadRemeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints != null && this.f30261e != null) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
            return lookaheadPassDelegate$ui_release.m72922remeasureBRTryo0(constraints.m73632unboximpl());
        }
        return false;
    }

    public final void lookaheadReplace$ui_release() {
        if (this.f30280x == UsageByParent.NotUsed) {
            m59488c();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    /* renamed from: m */
    public final void m59478m() {
        if (this.f30265i) {
            int i = 0;
            this.f30265i = false;
            MutableVector mutableVector = this.f30264h;
            if (mutableVector == null) {
                mutableVector = new MutableVector(new LayoutNode[16], 0);
                this.f30264h = mutableVector;
            }
            mutableVector.clear();
            MutableVector vector = this.f30263g.getVector();
            int size = vector.getSize();
            if (size > 0) {
                Object[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    if (layoutNode.f30257a) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
                this.f30248B.markChildrenDirty();
            }
            this.f30248B.markChildrenDirty();
        }
    }

    public final void markLayoutPending$ui_release() {
        this.f30248B.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.f30248B.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.f30248B.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.f30248B.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int i, int i2, int i3) {
        int i4;
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (i > i2) {
                i4 = i + i5;
            } else {
                i4 = i;
            }
            this.f30263g.add(i > i2 ? i2 + i5 : (i2 + i3) - 2, (LayoutNode) this.f30263g.removeAt(i4));
        }
        onZSortedChildrenInvalidated$ui_release();
        m59481j();
        invalidateMeasurements$ui_release();
    }

    /* renamed from: n */
    public final void m59477n() {
        this.f30247A.resetState$ui_release();
    }

    /* renamed from: o */
    public final void m59476o(LayoutNode layoutNode) {
        if (!Intrinsics.areEqual(layoutNode, this.f30261e)) {
            this.f30261e = layoutNode;
            if (layoutNode != null) {
                this.f30248B.ensureLookaheadDelegateCreated$ui_release();
                NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
                for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                    outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
                }
            }
            invalidateMeasurements$ui_release();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.f30268l;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        this.f30256J = true;
        m59477n();
    }

    @Override // androidx.compose.p003ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int m72961constructorimpl = NodeKind.m72961constructorimpl(128);
        boolean m72970getIncludeSelfInTraversalH91voCI = NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(m72961constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (m72970getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node m59406h = innerCoordinator$ui_release.m59406h(m72970getIncludeSelfInTraversalH91voCI); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0; m59406h = m59406h.getChild$ui_release()) {
                if ((m59406h.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = m59406h;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) node).onPlaced(getInnerCoordinator$ui_release());
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.m59509b(mutableVector);
                    }
                }
                if (m59406h == tail) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.f30268l;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (isAttached()) {
            AndroidViewHolder androidViewHolder = this.f30268l;
            if (androidViewHolder != null) {
                androidViewHolder.onReuse();
            }
            if (this.f30256J) {
                this.f30256J = false;
            } else {
                m59477n();
            }
            setSemanticsId(SemanticsModifierKt.generateSemanticsId());
            this.f30247A.markAsAttached();
            this.f30247A.runAttachLifecycle();
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.f30257a) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.f30273q = true;
    }

    public final void place$ui_release(int i, int i2) {
        NodeCoordinator nodeCoordinator;
        if (this.f30280x == UsageByParent.NotUsed) {
            m59488c();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            nodeCoordinator = parent$ui_release.getInnerCoordinator$ui_release();
        } else {
            nodeCoordinator = null;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f30153c;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f30154d;
        Placeable.PlacementScope.f30152b = measuredWidth;
        Placeable.PlacementScope.f30151a = layoutDirection;
        boolean m59522a = companion.m59522a(nodeCoordinator2);
        Placeable.PlacementScope.placeRelative$default(companion, measurePassDelegate$ui_release, i, i2, 0.0f, 4, null);
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.setPlacingForAlignment$ui_release(m59522a);
        }
        Placeable.PlacementScope.f30152b = parentWidth;
        Placeable.PlacementScope.f30151a = parentLayoutDirection;
        Placeable.PlacementScope.f30153c = layoutCoordinates;
        Placeable.PlacementScope.f30154d = layoutNodeLayoutDelegate;
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release */
    public final boolean m72912remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints != null) {
            if (this.f30280x == UsageByParent.NotUsed) {
                clearSubtreeIntrinsicsUsage$ui_release();
            }
            return getMeasurePassDelegate$ui_release().m72924remeasureBRTryo0(constraints.m73632unboximpl());
        }
        return false;
    }

    public final void removeAll$ui_release() {
        int size = this.f30263g.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                m59480k((LayoutNode) this.f30263g.get(size));
            } else {
                this.f30263g.clear();
                return;
            }
        }
    }

    public final void removeAt$ui_release(int i, int i2) {
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i > i3) {
                return;
            }
            while (true) {
                m59480k((LayoutNode) this.f30263g.removeAt(i3));
                if (i3 != i) {
                    i3--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    public final void replace$ui_release() {
        if (this.f30280x == UsageByParent.NotUsed) {
            m59488c();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean z) {
        Owner owner;
        if (!this.f30257a && (owner = this.f30267k) != null) {
            owner.onRequestRelayout(this, true, z);
        }
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z, boolean z2) {
        if (this.f30261e != null) {
            Owner owner = this.f30267k;
            if (owner != null && !this.f30270n && !this.f30257a) {
                owner.onRequestMeasure(this, true, z, z2);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    public final void requestRelayout$ui_release(boolean z) {
        Owner owner;
        if (!this.f30257a && (owner = this.f30267k) != null) {
            AbstractC18176Og1.m67002h(owner, this, false, z, 2, null);
        }
    }

    public final void requestRemeasure$ui_release(boolean z, boolean z2) {
        Owner owner;
        if (this.f30270n || this.f30257a || (owner = this.f30267k) == null) {
            return;
        }
        AbstractC18176Og1.m67003g(owner, this, false, z, z2, 2, null);
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@NotNull LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] == 1) {
            if (it.getMeasurePending$ui_release()) {
                requestRemeasure$ui_release$default(it, true, false, 2, null);
                return;
            } else if (it.getLayoutPending$ui_release()) {
                it.requestRelayout$ui_release(true);
                return;
            } else if (it.getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release$default(it, true, false, 2, null);
                return;
            } else if (it.getLookaheadLayoutPending$ui_release()) {
                it.requestLookaheadRelayout$ui_release(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                UsageByParent usageByParent = layoutNode.f30281y;
                layoutNode.f30280x = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.f30282z = z;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int i) {
        this.f30259c = i;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setCompositionLocalMap(@NotNull CompositionLocalMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30279w = value;
        setDensity((Density) value.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) value.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) value.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.f30247A;
        int m72961constructorimpl = NodeKind.m72961constructorimpl(32768);
        if ((nodeChain.m59429c() & m72961constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = head$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node2 = ((CompositionLocalConsumerModifierNode) node).getNode();
                            if (node2.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node2);
                            } else {
                                node2.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.add(node);
                                            node = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = DelegatableNodeKt.m59509b(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f30276t, value)) {
            this.f30276t = value;
            m59479l();
            NodeChain nodeChain = this.f30247A;
            int m72961constructorimpl = NodeKind.m72961constructorimpl(16);
            if ((nodeChain.m59429c() & m72961constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                        Modifier.Node node = head$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) node).onDensityChange();
                            } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.m59509b(mutableVector);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void setDepth$ui_release(int i) {
        this.f30269m = i;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.f30251E = z;
    }

    public final void setInteropViewFactoryHolder$ui_release(@Nullable AndroidViewHolder androidViewHolder) {
        this.f30268l = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.f30280x = usageByParent;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f30277u != value) {
            this.f30277u = value;
            m59479l();
        }
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f30274r, value)) {
            this.f30274r = value;
            this.f30275s.updateFrom(getMeasurePolicy());
            invalidateMeasurements$ui_release();
        }
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f30257a && getModifier() != Modifier.Companion) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.f30252F = value;
        this.f30247A.updateFrom$ui_release(value);
        this.f30248B.updateParentData();
        if (this.f30247A.m72934hasH91voCI$ui_release(NodeKind.m72961constructorimpl(512)) && this.f30261e == null) {
            m59476o(this);
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.f30255I = z;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.f30253G = function1;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.f30254H = function1;
    }

    public void setSemanticsId(int i) {
        this.f30258b = i;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.f30249C = layoutNodeSubcompositionsState;
    }

    @Override // androidx.compose.p003ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f30278v, value)) {
            this.f30278v = value;
            NodeChain nodeChain = this.f30247A;
            int m72961constructorimpl = NodeKind.m72961constructorimpl(16);
            if ((nodeChain.m59429c() & m72961constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                        Modifier.Node node = head$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) node).onViewConfigurationChange();
                            } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DelegatableNodeKt.m59509b(mutableVector);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & m72961constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z) {
        this.f30260d = z;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.f30262f > 0) {
            m59478m();
        }
    }

    public LayoutNode(boolean z, int i) {
        Density density;
        this.f30257a = z;
        this.f30258b = i;
        this.f30263g = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this.f30272p = new MutableVector(new LayoutNode[16], 0);
        this.f30273q = true;
        this.f30274r = f30243K;
        this.f30275s = new IntrinsicsPolicy(this);
        density = LayoutNodeKt.f30286a;
        this.f30276t = density;
        this.f30277u = LayoutDirection.Ltr;
        this.f30278v = f30245M;
        this.f30279w = CompositionLocalMap.Companion.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f30280x = usageByParent;
        this.f30281y = usageByParent;
        this.f30247A = new NodeChain(this);
        this.f30248B = new LayoutNodeLayoutDelegate(this);
        this.f30251E = true;
        this.f30252F = Modifier.Companion;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i);
    }
}
