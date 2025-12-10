package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.MutableRect;
import androidx.compose.p003ui.geometry.MutableRectKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.pattern.parser.Parser;
import com.tom_roush.fontbox.ttf.HeaderTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b \u0018\u0000 °\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004°\u0002±\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#JC\u0010,\u001a\u00020\u0007*\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\u00020\u0007*\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0017H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100JK\u00101\u001a\u00020\u0007*\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0017H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00100J\u0013\u00102\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J%\u00107\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00108J%\u0010;\u001a\u00020&2\u0006\u00104\u001a\u00020\u00002\u0006\u0010:\u001a\u00020&H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020=2\u0006\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ7\u0010J\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0002¢\u0006\u0004\bJ\u0010KJC\u0010J\u001a\u00020\u0007\"\u0006\b\u0000\u0010L\u0018\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ!\u0010Q\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020\f¢\u0006\u0004\bR\u0010SJ\u000f\u0010V\u001a\u00020\u0007H\u0010¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020\u0007H&¢\u0006\u0004\bW\u0010UJ\u001f\u0010Z\u001a\u00020\u00072\u0006\u0010X\u001a\u00020G2\u0006\u0010Y\u001a\u00020GH\u0014¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\\\u0010UJ1\u0010d\u001a\u00020a2\u0006\u0010_\u001a\u00020^2\u000e\b\u0004\u0010I\u001a\b\u0012\u0004\u0012\u00020a0`H\u0084\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\r\u0010e\u001a\u00020\u0007¢\u0006\u0004\be\u0010UJ@\u0010g\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u001aH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010\u001dJ>\u0010i\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010\u001dJ\u0015\u0010j\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\bj\u0010 J\u0017\u0010k\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\bk\u0010 J\r\u0010l\u001a\u00020\u0007¢\u0006\u0004\bl\u0010UJ\u0018\u0010m\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\bm\u0010 J2\u0010o\u001a\u00020\u00072\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u001a2\b\b\u0002\u0010n\u001a\u00020\f¢\u0006\u0004\bo\u0010pJ;\u0010s\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010rJ=\u0010u\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010rJ\r\u0010w\u001a\u00020v¢\u0006\u0004\bw\u0010xJ\u001d\u0010{\u001a\u00020&2\u0006\u0010y\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010FJ\u001d\u0010~\u001a\u00020&2\u0006\u0010|\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b}\u0010FJ)\u0010\u0083\u0001\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020\u00032\u0007\u0010\u0080\u0001\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J(\u0010\u0086\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u00032\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\"\u0010\u0087\u0001\u001a\u00020v2\u0006\u0010\u007f\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001f\u0010\u008a\u0001\u001a\u00020&2\u0006\u0010|\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u0089\u0001\u0010FJ2\u0010\u008b\u0001\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00062\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001f\u0010\u008e\u0001\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008d\u0001\u0010FJ\u001f\u0010\u0090\u0001\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u008f\u0001\u0010FJ$\u0010\u0093\u0001\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0004¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u000f\u0010\u0095\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0095\u0001\u0010UJ\u000f\u0010\u0096\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0096\u0001\u0010UJ-\u0010\u009a\u0001\u001a\u00020\u00072\u0006\u0010B\u001a\u00020=2\u0006\u0010?\u001a\u00020\f2\t\b\u0002\u0010\u0097\u0001\u001a\u00020\fH\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J \u0010\u009d\u0001\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J \u0010\u009f\u0001\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009c\u0001J\u0011\u0010 \u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b \u0001\u0010UJ\u001e\u0010¡\u0001\u001a\u00020\u00072\u0006\u0010>\u001a\u00020vH\u0096@ø\u0001\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b£\u0001\u0010UJ\u001b\u0010§\u0001\u001a\u00020\u00002\u0007\u0010¤\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u000f\u0010¨\u0001\u001a\u00020\f¢\u0006\u0005\b¨\u0001\u0010SJ\"\u0010¬\u0001\u001a\u00030©\u00012\b\u0010ª\u0001\u001a\u00030©\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b«\u0001\u0010FJ*\u0010¯\u0001\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&2\b\u0010ª\u0001\u001a\u00030©\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001R\u001d\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u000f\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R*\u0010¸\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b,\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010»\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b/\u0010³\u0001\u001a\u0006\b¹\u0001\u0010µ\u0001\"\u0006\bº\u0001\u0010·\u0001R\u0018\u0010½\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bE\u0010¼\u0001R\u0018\u0010¾\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010¼\u0001RO\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u001a2\u001a\u0010¿\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\u001a8\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Æ\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010Å\u0001R\u0019\u0010É\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010È\u0001R\u0018\u0010Ë\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010Ê\u0001R\u001b\u0010Î\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010Í\u0001R(\u0010Ò\u0001\u001a\u0012\u0012\u0005\u0012\u00030Ð\u0001\u0012\u0004\u0012\u00020G\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010Ñ\u0001R:\u0010\u0016\u001a\u00020\u00152\u0007\u0010¿\u0001\u001a\u00020\u00158\u0016@TX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R1\u0010\u0018\u001a\u00020\u00172\u0007\u0010¿\u0001\u001a\u00020\u00178\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ê\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u001b\u0010à\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001d\u0010ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R)\u0010ê\u0001\u001a\u00020\f2\u0007\u0010¿\u0001\u001a\u00020\f8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bè\u0001\u0010¼\u0001\u001a\u0005\bé\u0001\u0010SR0\u0010ð\u0001\u001a\u0005\u0018\u00010ë\u00012\n\u0010¿\u0001\u001a\u0005\u0018\u00010ë\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R\u0018\u0010ô\u0001\u001a\u00030ñ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0017\u0010÷\u0001\u001a\u00020\u000e8&X¦\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010ö\u0001R\u0018\u0010ú\u0001\u001a\u00030Ç\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u0017\u0010ü\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010Û\u0001R\u0017\u0010þ\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010Û\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u0017\u0010\u0084\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001e\u0010\u0087\u0002\u001a\u00030\u0085\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010Ö\u0001R\u0018\u0010\u008b\u0002\u001a\u00030\u0088\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0019\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u0080\u0002R\u0016\u0010\u008f\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0002\u0010SR\u0016\u0010\u0090\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0002\u0010SR,\u0010\u0096\u0002\u001a\u00030Ì\u00012\b\u0010\u0091\u0002\u001a\u00030Ì\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R0\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0097\u00022\n\u0010¿\u0001\u001a\u0005\u0018\u00010\u0097\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002\"\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001f\u0010 \u0002\u001a\n\u0012\u0005\u0012\u00030Ð\u00010\u009d\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001a\u0010¤\u0002\u001a\u0005\u0018\u00010¡\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002R\u0016\u0010¦\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b¥\u0002\u0010\u0083\u0002R\u0016\u0010¨\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b§\u0002\u0010\u0083\u0002R\u0017\u0010«\u0002\u001a\u00020=8DX\u0084\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0002R \u0010\u00ad\u0002\u001a\u00020^8@X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b¬\u0002\u0010Ö\u0001R\u0016\u0010®\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0002\u0010SR\u001e\u0010ª\u0001\u001a\u00030©\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0003¢\u0006\b\u001a\u0006\b¯\u0002\u0010Ö\u0001\u0082\u0002\u0016\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0002\b!¨\u0006²\u0002"}, m28850d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "includeTail", "Landroidx/compose/ui/Modifier$Node;", OperatorName.CLOSE_PATH, "(Z)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/NodeKind;", "type", OperatorName.NON_STROKING_GRAY, "(I)Z", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", OperatorName.LINE_TO, "(JFLkotlin/jvm/functions/Function1;)V", "canvas", "d", "(Landroidx/compose/ui/graphics/Canvas;)V", "invokeOnLayoutChange", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Z)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "i", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "distanceFromEdge", OperatorName.SET_LINE_JOINSTYLE, "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", OperatorName.ENDPATH, "o", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "Landroidx/compose/ui/graphics/Matrix;", "matrix", OperatorName.SAVE, "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "p", TypedValues.CycleType.S_WAVE_OFFSET, OperatorName.CURVE_TO, "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "clipBounds", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V", "bounds", "e", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", OperatorName.NON_STROKING_CMYK, "(J)J", "", "mask", "block", "visitNodes", "(IZLkotlin/jvm/functions/Function1;)V", "T", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", HeaderTable.TAG, "isTransparent", "()Z", "replace$ui_release", "()V", Parser.REPLACE_CONVERTER_WORD, "ensureLookaheadDelegateCreated", "width", "height", "onMeasureResultChanged", "(II)V", "onCoordinatesUsed$ui_release", "onCoordinatesUsed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "onMeasured", "placeAt-f8xVGno", "placeAt", "placeSelfApparentToRealOffset-f8xVGno", "placeSelfApparentToRealOffset", "draw", "performDraw", "onPlaced", "invoke", "forceUpdateLayerParameters", "updateLayerBlock", "(Lkotlin/jvm/functions/Function1;Z)V", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitTestChild-YqVAtuI", "hitTestChild", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "localToRoot-MK-Hz9U", "localToRoot", "withPositionTranslation", "(Landroidx/compose/ui/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "toParentPosition-MK-Hz9U", "toParentPosition", "fromParentPosition-MK-Hz9U", "fromParentPosition", "Landroidx/compose/ui/graphics/Paint;", "paint", "drawBorder", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "onLayoutNodeAttach", "onRelease", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "rectInParent", "withinLayerBounds-k-4lQ0M", "(J)Z", "withinLayerBounds", "isPointerInBounds-k-4lQ0M", "isPointerInBounds", "invalidateLayer", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutModifierNodeChanged", "other", "findCommonAncestor$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "findCommonAncestor", "shouldSharePointerInputWithSiblings", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "calculateMinimumTouchTargetPadding-E7KxVPU", "calculateMinimumTouchTargetPadding", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "distanceInMinimumTouchTarget", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/NodeCoordinator;", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "wrappedBy", "Z", "released", "isClipping", "<set-?>", OperatorName.MOVE_TO, "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "F", "lastLayerAlpha", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "", "Landroidx/compose/ui/layout/AlignmentLine;", "Ljava/util/Map;", "oldAlignmentLines", OperatorName.CLOSE_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "t", "getZIndex", "()F", "setZIndex", "(F)V", "u", "Landroidx/compose/ui/geometry/MutableRect;", "_rectCache", "Lci0;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lci0;", "layerPositionalProperties", OperatorName.SET_LINE_WIDTH, "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "x", "getLastLayerDrawingWasSkipped$ui_release", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/OwnedLayer;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Landroidx/compose/ui/node/OwnedLayer;", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "layer", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", OperatorName.FILL_NON_ZERO, "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "getFontScale", "fontScale", "getParent", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getChild", "child", "getHasMeasureResult", "hasMeasureResult", "isAttached", "value", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "", "getParentData", "()Ljava/lang/Object;", "parentData", "getParentLayoutCoordinates", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "getLastMeasurementConstraints-msEJaDk$ui_release", "lastMeasurementConstraints", "isValidOwnerScope", "getMinimumTouchTargetSize-NH-jbRc", "Companion", "HitTestSource", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 11 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1351:1\n96#1,5:1352\n101#1,4:1400\n96#1,9:1404\n107#1:1415\n96#1,13:1416\n109#1:1472\n101#1,10:1473\n107#1:1545\n96#1,13:1546\n109#1:1602\n101#1,10:1603\n107#1:1618\n96#1,13:1619\n109#1:1675\n101#1,10:1676\n383#2,6:1357\n393#2,2:1364\n395#2,8:1369\n403#2,9:1380\n412#2,8:1392\n383#2,6:1429\n393#2,2:1436\n395#2,8:1441\n403#2,9:1452\n412#2,8:1464\n383#2,6:1490\n393#2,2:1497\n395#2,8:1502\n403#2,9:1513\n412#2,8:1525\n383#2,6:1559\n393#2,2:1566\n395#2,8:1571\n403#2,9:1582\n412#2,8:1594\n383#2,6:1632\n393#2,2:1639\n395#2,8:1644\n403#2,9:1655\n412#2,8:1667\n206#2:1688\n207#2,8:1690\n219#2:1700\n190#2:1701\n191#2,6:1703\n220#2:1709\n383#2,6:1710\n393#2,2:1717\n395#2,8:1722\n403#2,9:1733\n412#2,8:1745\n221#2:1753\n198#2,3:1754\n261#3:1363\n261#3:1435\n261#3:1488\n261#3:1496\n261#3:1565\n261#3:1638\n261#3:1716\n234#4,3:1366\n237#4,3:1389\n234#4,3:1438\n237#4,3:1461\n234#4,3:1499\n237#4,3:1522\n234#4,3:1568\n237#4,3:1591\n234#4,3:1641\n237#4,3:1664\n234#4,3:1719\n237#4,3:1742\n1182#5:1377\n1161#5,2:1378\n1182#5:1449\n1161#5,2:1450\n1182#5:1510\n1161#5,2:1511\n1182#5:1579\n1161#5,2:1580\n1182#5:1652\n1161#5,2:1653\n1182#5:1730\n1161#5,2:1731\n1#6:1413\n1#6:1689\n1#6:1702\n74#7:1414\n82#7:1483\n82#7:1487\n82#7:1489\n84#7:1536\n84#7:1544\n74#7:1616\n84#7:1617\n72#7:1686\n72#7:1687\n78#7:1698\n78#7:1699\n743#8,3:1484\n746#8,3:1533\n495#9,4:1537\n500#9:1614\n129#10,3:1541\n133#10:1613\n86#11:1615\n66#12,5:1757\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n107#1:1352,5\n107#1:1400,4\n117#1:1404,9\n215#1:1415\n215#1:1416,13\n215#1:1472\n215#1:1473,10\n294#1:1545\n294#1:1546,13\n294#1:1602\n294#1:1603,10\n374#1:1618\n374#1:1619,13\n374#1:1675\n374#1:1676,10\n108#1:1357,6\n108#1:1364,2\n108#1:1369,8\n108#1:1380,9\n108#1:1392,8\n215#1:1429,6\n215#1:1436,2\n215#1:1441,8\n215#1:1452,9\n215#1:1464,8\n239#1:1490,6\n239#1:1497,2\n239#1:1502,8\n239#1:1513,9\n239#1:1525,8\n294#1:1559,6\n294#1:1566,2\n294#1:1571,8\n294#1:1582,9\n294#1:1594,8\n374#1:1632,6\n374#1:1639,2\n374#1:1644,8\n374#1:1655,9\n374#1:1667,8\n1067#1:1688\n1067#1:1690,8\n1100#1:1700\n1100#1:1701\n1100#1:1703,6\n1100#1:1709\n1100#1:1710,6\n1100#1:1717,2\n1100#1:1722,8\n1100#1:1733,9\n1100#1:1745,8\n1100#1:1753\n1100#1:1754,3\n108#1:1363\n215#1:1435\n238#1:1488\n239#1:1496\n294#1:1565\n374#1:1638\n1100#1:1716\n108#1:1366,3\n108#1:1389,3\n215#1:1438,3\n215#1:1461,3\n239#1:1499,3\n239#1:1522,3\n294#1:1568,3\n294#1:1591,3\n374#1:1641,3\n374#1:1664,3\n1100#1:1719,3\n1100#1:1742,3\n108#1:1377\n108#1:1378,2\n215#1:1449\n215#1:1450,2\n239#1:1510\n239#1:1511,2\n294#1:1579\n294#1:1580,2\n374#1:1652\n374#1:1653,2\n1100#1:1730\n1100#1:1731,2\n1067#1:1689\n1100#1:1702\n215#1:1414\n231#1:1483\n238#1:1487\n239#1:1489\n292#1:1536\n294#1:1544\n360#1:1616\n374#1:1617\n667#1:1686\n1067#1:1687\n1099#1:1698\n1100#1:1699\n237#1:1484,3\n237#1:1533,3\n293#1:1537,4\n293#1:1614\n293#1:1541,3\n293#1:1613\n340#1:1615\n1142#1:1757,5\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeCoordinator */
/* loaded from: classes2.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {
    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";

    /* renamed from: h */
    public final LayoutNode f30395h;

    /* renamed from: i */
    public NodeCoordinator f30396i;

    /* renamed from: j */
    public NodeCoordinator f30397j;

    /* renamed from: k */
    public boolean f30398k;

    /* renamed from: l */
    public boolean f30399l;

    /* renamed from: m */
    public Function1 f30400m;

    /* renamed from: n */
    public Density f30401n;

    /* renamed from: o */
    public LayoutDirection f30402o;

    /* renamed from: p */
    public float f30403p;

    /* renamed from: q */
    public MeasureResult f30404q;

    /* renamed from: r */
    public Map f30405r;

    /* renamed from: s */
    public long f30406s;

    /* renamed from: t */
    public float f30407t;

    /* renamed from: u */
    public MutableRect f30408u;

    /* renamed from: v */
    public C19393ci0 f30409v;

    /* renamed from: w */
    public final Function0 f30410w;

    /* renamed from: x */
    public boolean f30411x;

    /* renamed from: y */
    public OwnedLayer f30412y;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: z */
    public static final Function1 f30394z = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;

    /* renamed from: A */
    public static final Function1 f30388A = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;

    /* renamed from: B */
    public static final ReusableGraphicsLayerScope f30389B = new ReusableGraphicsLayerScope();

    /* renamed from: C */
    public static final C19393ci0 f30390C = new C19393ci0();

    /* renamed from: D */
    public static final float[] f30391D = Matrix.m71927constructorimpl$default(null, 1, null);

    /* renamed from: E */
    public static final HitTestSource f30392E = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI  reason: not valid java name */
        public void mo72957childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long j, @NotNull HitTestResult hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m72909hitTestM_7yMNQ$ui_release(j, hitTestResult, z, z2);
        }

        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw  reason: not valid java name */
        public int mo72958entityTypeOLwlOKw() {
            return NodeKind.m72961constructorimpl(16);
        }

        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            int m72961constructorimpl = NodeKind.m72961constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != null) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
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
            return false;
        }

        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }
    };

    /* renamed from: F */
    public static final HitTestSource f30393F = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo72957childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long j, @NotNull HitTestResult hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m72910hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, z, z2);
        }

        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo72958entityTypeOLwlOKw() {
            return NodeKind.m72961constructorimpl(8);
        }

        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }

        @Override // androidx.compose.p003ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsConfiguration collapsedSemantics$ui_release = parentLayoutNode.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    };

    @Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m28850d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Lci0;", "tmpLayerPositionalProperties", "Lci0;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.f30392E;
        }

        @NotNull
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.f30393F;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H&ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$HitTestSource */
    /* loaded from: classes2.dex */
    public interface HitTestSource {
        /* renamed from: childHitTest-YqVAtuI */
        void mo72957childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long j, @NotNull HitTestResult hitTestResult, boolean z, boolean z2);

        /* renamed from: entityType-OLwlOKw */
        int mo72958entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node);

        boolean shouldHitTestChildren(@NotNull LayoutNode layoutNode);
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30395h = layoutNode;
        this.f30401n = getLayoutNode().getDensity();
        this.f30402o = getLayoutNode().getLayoutDirection();
        this.f30403p = 0.8f;
        this.f30406s = IntOffset.Companion.m73786getZeronOccac();
        this.f30410w = new NodeCoordinator$invalidateParentLayer$1(this);
    }

    /* renamed from: f */
    private final OwnerSnapshotObserver m59408f() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: m */
    public static /* synthetic */ Object m59401m(NodeCoordinator nodeCoordinator, Rect rect, Continuation continuation) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f30397j;
        if (nodeCoordinator2 == null) {
            return Unit.INSTANCE;
        }
        Object propagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m71539translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m71537getTopLeftF1C5BW0()), continuation);
        if (propagateRelocationRequest == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return propagateRelocationRequest;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* renamed from: s */
    public static /* synthetic */ void m59395s(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            nodeCoordinator.m59396r(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            nodeCoordinator.updateLayerBlock(function1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    /* renamed from: b */
    public final void m59412b(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f30397j;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.m59412b(nodeCoordinator, mutableRect, z);
        }
        m59409e(mutableRect, z);
    }

    /* renamed from: c */
    public final long m59411c(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.f30397j;
        if (nodeCoordinator2 != null && !Intrinsics.areEqual(nodeCoordinator, nodeCoordinator2)) {
            return m72945fromParentPositionMKHz9U(nodeCoordinator2.m59411c(nodeCoordinator, j));
        }
        return m72945fromParentPositionMKHz9U(j);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU */
    public final long m72943calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        return SizeKt.Size(Math.max(0.0f, (Size.m71571getWidthimpl(j) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m71568getHeightimpl(j) - getMeasuredHeight()) / 2.0f));
    }

    /* renamed from: d */
    public final void m59410d(Canvas canvas) {
        Modifier.Node m72948headH91voCI = m72948headH91voCI(NodeKind.m72961constructorimpl(4));
        if (m72948headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m72914drawx_KDEd0$ui_release(canvas, IntSizeKt.m73828toSizeozmzZPI(mo72816getSizeYbymL2g()), this, m72948headH91voCI);
        }
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw */
    public final float m72944distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (getMeasuredWidth() >= Size.m71571getWidthimpl(j2) && getMeasuredHeight() >= Size.m71568getHeightimpl(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long m72943calculateMinimumTouchTargetPaddingE7KxVPU = m72943calculateMinimumTouchTargetPaddingE7KxVPU(j2);
        float m71571getWidthimpl = Size.m71571getWidthimpl(m72943calculateMinimumTouchTargetPaddingE7KxVPU);
        float m71568getHeightimpl = Size.m71568getHeightimpl(m72943calculateMinimumTouchTargetPaddingE7KxVPU);
        long m59403k = m59403k(j);
        if ((m71571getWidthimpl <= 0.0f && m71568getHeightimpl <= 0.0f) || Offset.m71502getXimpl(m59403k) > m71571getWidthimpl || Offset.m71503getYimpl(m59403k) > m71568getHeightimpl) {
            return Float.POSITIVE_INFINITY;
        }
        return Offset.m71501getDistanceSquaredimpl(m59403k);
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m73776getXimpl = IntOffset.m73776getXimpl(mo72925getPositionnOccac());
        float m73777getYimpl = IntOffset.m73777getYimpl(mo72925getPositionnOccac());
        canvas.translate(m73776getXimpl, m73777getYimpl);
        m59410d(canvas);
        canvas.translate(-m73776getXimpl, -m73777getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m73818getWidthimpl(m72846getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m73817getHeightimpl(m72846getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    /* renamed from: e */
    public final void m59409e(MutableRect mutableRect, boolean z) {
        float m73776getXimpl = IntOffset.m73776getXimpl(mo72925getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m73776getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m73776getXimpl);
        float m73777getYimpl = IntOffset.m73777getYimpl(mo72925getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m73777getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m73777getYimpl);
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.f30399l && z) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m73818getWidthimpl(mo72816getSizeYbymL2g()), IntSize.m73817getHeightimpl(mo72816getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    public abstract void ensureLookaheadDelegateCreated();

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui_release(@NotNull NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int m72961constructorimpl = NodeKind.m72961constructorimpl(2);
            if (tail2.getNode().isAttached()) {
                for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                    if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0 && parent$ui_release == tail) {
                        return other;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (layoutNode2 == getLayoutNode()) {
            return this;
        }
        if (layoutNode != other.getLayoutNode()) {
            return layoutNode.getInnerCoordinator$ui_release();
        }
        return other;
    }

    /* renamed from: fromParentPosition-MK-Hz9U */
    public long m72945fromParentPositionMKHz9U(long j) {
        long m73788minusNvtHpc = IntOffsetKt.m73788minusNvtHpc(j, mo72925getPositionnOccac());
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            return ownedLayer.mo73008mapOffset8S9VItk(m73788minusNvtHpc, true);
        }
        return m73788minusNvtHpc;
    }

    /* renamed from: g */
    public final boolean m59407g(int i) {
        Modifier.Node m59406h = m59406h(NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(i));
        if (m59406h == null || !DelegatableNodeKt.m72892has64DMado(m59406h, i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        return this.f30396i;
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        if (this.f30404q != null) {
            return true;
        }
        return false;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.f30411x;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release */
    public final long m72946getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m72847getMeasurementConstraintsmsEJaDk();
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.f30412y;
    }

    @Nullable
    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.f30400m;
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable, androidx.compose.p003ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.f30395h;
    }

    @Nullable
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this.f30404q;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc */
    public final long m72947getMinimumTouchTargetSizeNHjbRc() {
        return this.f30401n.mo69439toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo72913getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        return this.f30397j;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            return this.f30397j;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui_release().m72934hasH91voCI$ui_release(NodeKind.m72961constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((NodeKind.m72961constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                int m72961constructorimpl = NodeKind.m72961constructorimpl(64);
                MutableVector mutableVector = null;
                Modifier.Node node = tail$ui_release;
                while (node != null) {
                    if (node instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) node).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
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
        return objectRef.element;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            return getLayoutNode().getOuterCoordinator$ui_release().f30397j;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo72925getPositionnOccac() {
        return this.f30406s;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Map<AlignmentLine, Integer> map;
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f30396i) {
            MeasureResult measureResult = nodeCoordinator.f30404q;
            if (measureResult != null) {
                map = measureResult.getAlignmentLines();
            } else {
                map = null;
            }
            if (map != null && (!map.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(map.keySet());
            }
        }
        if (linkedHashSet == null) {
            return DG1.emptySet();
        }
        return linkedHashSet;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this.f30408u;
        if (mutableRect == null) {
            MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this.f30408u = mutableRect2;
            return mutableRect2;
        }
        return mutableRect;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo72816getSizeYbymL2g() {
        return m72846getMeasuredSizeYbymL2g();
    }

    @NotNull
    public abstract Modifier.Node getTail();

    @Nullable
    public final NodeCoordinator getWrapped$ui_release() {
        return this.f30396i;
    }

    @Nullable
    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.f30397j;
    }

    public final float getZIndex() {
        return this.f30407t;
    }

    /* renamed from: h */
    public final Modifier.Node m59406h(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.f30397j;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild$ui_release();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.f30397j;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: head-H91voCI */
    public final Modifier.Node m72948headH91voCI(int i) {
        boolean m72970getIncludeSelfInTraversalH91voCI = NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (m72970getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node m59406h = m59406h(m72970getIncludeSelfInTraversalH91voCI); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & i) != 0; m59406h = m59406h.getChild$ui_release()) {
                if ((m59406h.getKindSet$ui_release() & i) != 0) {
                    return m59406h;
                }
                if (m59406h == tail) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: hitTest-YqVAtuI */
    public final void m72949hitTestYqVAtuI(@NotNull HitTestSource hitTestSource, long j, @NotNull HitTestResult hitTestResult, boolean z, boolean z2) {
        float m72944distanceInMinimumTouchTargettz77jQw;
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        Modifier.Node m72948headH91voCI = m72948headH91voCI(hitTestSource.mo72958entityTypeOLwlOKw());
        if (!m72956withinLayerBoundsk4lQ0M(j)) {
            if (z) {
                float m72944distanceInMinimumTouchTargettz77jQw2 = m72944distanceInMinimumTouchTargettz77jQw(j, m72947getMinimumTouchTargetSizeNHjbRc());
                if (!Float.isInfinite(m72944distanceInMinimumTouchTargettz77jQw2) && !Float.isNaN(m72944distanceInMinimumTouchTargettz77jQw2) && hitTestResult.isHitInMinimumTouchTargetBetter(m72944distanceInMinimumTouchTargettz77jQw2, false)) {
                    m59404j(m72948headH91voCI, hitTestSource, j, hitTestResult, z, false, m72944distanceInMinimumTouchTargettz77jQw2);
                }
            }
        } else if (m72948headH91voCI == null) {
            mo72904hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (m72950isPointerInBoundsk4lQ0M(j)) {
            m59405i(m72948headH91voCI, hitTestSource, j, hitTestResult, z, z2);
        } else {
            if (!z) {
                m72944distanceInMinimumTouchTargettz77jQw = Float.POSITIVE_INFINITY;
            } else {
                m72944distanceInMinimumTouchTargettz77jQw = m72944distanceInMinimumTouchTargettz77jQw(j, m72947getMinimumTouchTargetSizeNHjbRc());
            }
            if (!Float.isInfinite(m72944distanceInMinimumTouchTargettz77jQw) && !Float.isNaN(m72944distanceInMinimumTouchTargettz77jQw)) {
                if (hitTestResult.isHitInMinimumTouchTargetBetter(m72944distanceInMinimumTouchTargettz77jQw, z2)) {
                    m59404j(m72948headH91voCI, hitTestSource, j, hitTestResult, z, z2, m72944distanceInMinimumTouchTargettz77jQw);
                    return;
                }
            }
            m59400n(m72948headH91voCI, hitTestSource, j, hitTestResult, z, z2, m72944distanceInMinimumTouchTargettz77jQw);
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo72904hitTestChildYqVAtuI(@NotNull HitTestSource hitTestSource, long j, @NotNull HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.f30396i;
        if (nodeCoordinator != null) {
            nodeCoordinator.m72949hitTestYqVAtuI(hitTestSource, nodeCoordinator.m72945fromParentPositionMKHz9U(j), hitTestResult, z, z2);
        }
    }

    /* renamed from: i */
    public final void m59405i(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        if (node == null) {
            mo72904hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(node, z2, new NodeCoordinator$hit$1(this, node, hitTestSource, j, hitTestResult, z, z2));
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f30397j;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    public boolean isAttached() {
        if (!this.f30398k && getLayoutNode().isAttached()) {
            return true;
        }
        return false;
    }

    /* renamed from: isPointerInBounds-k-4lQ0M */
    public final boolean m72950isPointerInBoundsk4lQ0M(long j) {
        float m71502getXimpl = Offset.m71502getXimpl(j);
        float m71503getYimpl = Offset.m71503getYimpl(j);
        if (m71502getXimpl >= 0.0f && m71503getYimpl >= 0.0f && m71502getXimpl < getMeasuredWidth() && m71503getYimpl < getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    public final boolean isTransparent() {
        if (this.f30412y != null && this.f30403p <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f30397j;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        if (this.f30412y != null && isAttached()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m59404j(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2, float f) {
        if (node == null) {
            mo72904hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f, z2, new NodeCoordinator$hitNear$1(this, node, hitTestSource, j, hitTestResult, z, z2, f));
        }
    }

    /* renamed from: k */
    public final long m59403k(long j) {
        float measuredWidth;
        float measuredHeight;
        float m71502getXimpl = Offset.m71502getXimpl(j);
        if (m71502getXimpl < 0.0f) {
            measuredWidth = -m71502getXimpl;
        } else {
            measuredWidth = m71502getXimpl - getMeasuredWidth();
        }
        float max = Math.max(0.0f, measuredWidth);
        float m71503getYimpl = Offset.m71503getYimpl(j);
        if (m71503getYimpl < 0.0f) {
            measuredHeight = -m71503getYimpl;
        } else {
            measuredHeight = m71503getYimpl - getMeasuredHeight();
        }
        return OffsetKt.Offset(max, Math.max(0.0f, measuredHeight));
    }

    /* renamed from: l */
    public final void m59402l(long j, float f, Function1 function1) {
        updateLayerBlock$default(this, function1, false, 2, null);
        if (!IntOffset.m73775equalsimpl0(mo72925getPositionnOccac(), j)) {
            m72953setPositiongyyYBs(j);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.f30412y;
            if (ownedLayer != null) {
                ownedLayer.mo73009movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.f30397j;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.f30407t = f;
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (isAttached()) {
            if (sourceCoordinates.isAttached()) {
                NodeCoordinator m59399o = m59399o(sourceCoordinates);
                m59399o.onCoordinatesUsed$ui_release();
                NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(m59399o);
                MutableRect rectCache = getRectCache();
                rectCache.setLeft(0.0f);
                rectCache.setTop(0.0f);
                rectCache.setRight(IntSize.m73818getWidthimpl(sourceCoordinates.mo72816getSizeYbymL2g()));
                rectCache.setBottom(IntSize.m73817getHeightimpl(sourceCoordinates.mo72816getSizeYbymL2g()));
                while (m59399o != findCommonAncestor$ui_release) {
                    rectInParent$ui_release$default(m59399o, rectCache, z, false, 4, null);
                    if (rectCache.isEmpty()) {
                        return Rect.Companion.getZero();
                    }
                    m59399o = m59399o.f30397j;
                    Intrinsics.checkNotNull(m59399o);
                }
                m59412b(findCommonAncestor$ui_release, rectCache, z);
                return MutableRectKt.toRect(rectCache);
            }
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo72817localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long j) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (sourceCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            return Offset.m71511unaryMinusF1C5BW0(sourceCoordinates.mo72817localPositionOfR5De75A(this, Offset.m71511unaryMinusF1C5BW0(j)));
        }
        NodeCoordinator m59399o = m59399o(sourceCoordinates);
        m59399o.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(m59399o);
        while (m59399o != findCommonAncestor$ui_release) {
            j = m59399o.m72954toParentPositionMKHz9U(j);
            m59399o = m59399o.f30397j;
            Intrinsics.checkNotNull(m59399o);
        }
        return m59411c(findCommonAncestor$ui_release, j);
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo72818localToRootMKHz9U(long j) {
        if (isAttached()) {
            onCoordinatesUsed$ui_release();
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f30397j) {
                j = nodeCoordinator.m72954toParentPositionMKHz9U(j);
            }
            return j;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo72819localToWindowMKHz9U(long j) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo73014calculatePositionInWindowMKHz9U(mo72818localToRootMKHz9U(j));
    }

    /* renamed from: n */
    public final void m59400n(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, boolean z, boolean z2, float f) {
        Modifier.Node m59394a;
        if (node == null) {
            mo72904hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (!hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            m59394a = NodeCoordinatorKt.m59394a(node, hitTestSource.mo72958entityTypeOLwlOKw(), NodeKind.m72961constructorimpl(2));
            m59400n(m59394a, hitTestSource, j, hitTestResult, z, z2, f);
        } else {
            hitTestResult.speculativeHit(node, f, z2, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j, hitTestResult, z, z2, f));
        }
    }

    /* renamed from: o */
    public final NodeCoordinator m59399o(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl;
        NodeCoordinator coordinator;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            lookaheadLayoutCoordinatesImpl = (LookaheadLayoutCoordinatesImpl) layoutCoordinates;
        } else {
            lookaheadLayoutCoordinatesImpl = null;
        }
        if (lookaheadLayoutCoordinatesImpl == null || (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) == null) {
            Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (NodeCoordinator) layoutCoordinates;
        }
        return coordinator;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.f30400m, true);
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public void onMeasureResultChanged(int i, int i2) {
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.mo73010resizeozmzZPI(IntSizeKt.IntSize(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.f30397j;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m72848setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        m59396r(false);
        int m72961constructorimpl = NodeKind.m72961constructorimpl(4);
        boolean m72970getIncludeSelfInTraversalH91voCI = NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(m72961constructorimpl);
        Modifier.Node tail = getTail();
        if (m72970getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node m59406h = m59406h(m72970getIncludeSelfInTraversalH91voCI); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0; m59406h = m59406h.getChild$ui_release()) {
                if ((m59406h.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = m59406h;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof DrawModifierNode) {
                            ((DrawModifierNode) node).onMeasureResultChanged();
                        } else if ((node.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                    i3++;
                                    if (i3 == 1) {
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
                            if (i3 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.m59509b(mutableVector);
                    }
                }
                if (m59406h == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m59407g(NodeKind.m72961constructorimpl(128))) {
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                int m72961constructorimpl = NodeKind.m72961constructorimpl(128);
                boolean m72970getIncludeSelfInTraversalH91voCI = NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(m72961constructorimpl);
                if (m72970getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail();
                } else {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release == null) {
                        Unit unit = Unit.INSTANCE;
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                for (Modifier.Node m59406h = m59406h(m72970getIncludeSelfInTraversalH91voCI); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0; m59406h = m59406h.getChild$ui_release()) {
                    if ((m59406h.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                        Modifier.Node node = m59406h;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) node).mo69362onRemeasuredozmzZPI(m72846getMeasuredSizeYbymL2g());
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
                    if (m59406h == parent$ui_release) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    public final void onPlaced() {
        int m72961constructorimpl = NodeKind.m72961constructorimpl(128);
        boolean m72970getIncludeSelfInTraversalH91voCI = NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(m72961constructorimpl);
        Modifier.Node tail = getTail();
        if (m72970getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node m59406h = m59406h(m72970getIncludeSelfInTraversalH91voCI); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0; m59406h = m59406h.getChild$ui_release()) {
                if ((m59406h.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                    Modifier.Node node = m59406h;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) node).onPlaced(this);
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

    public final void onRelease() {
        this.f30398k = true;
        if (this.f30412y != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    /* renamed from: p */
    public final void m59398p(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (!Intrinsics.areEqual(nodeCoordinator, this)) {
            NodeCoordinator nodeCoordinator2 = this.f30397j;
            Intrinsics.checkNotNull(nodeCoordinator2);
            nodeCoordinator2.m59398p(nodeCoordinator, fArr);
            if (!IntOffset.m73775equalsimpl0(mo72925getPositionnOccac(), IntOffset.Companion.m73786getZeronOccac())) {
                float[] fArr2 = f30391D;
                Matrix.m71936resetimpl(fArr2);
                Matrix.m71947translateimpl$default(fArr2, -IntOffset.m73776getXimpl(mo72925getPositionnOccac()), -IntOffset.m73777getYimpl(mo72925getPositionnOccac()), 0.0f, 4, null);
                Matrix.m71944timesAssign58bKbWc(fArr, fArr2);
            }
            OwnedLayer ownedLayer = this.f30412y;
            if (ownedLayer != null) {
                ownedLayer.mo73006inverseTransform58bKbWc(fArr);
            }
        }
    }

    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.f30396i;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    @NotNull
    /* renamed from: performingMeasure-K40F9xA */
    public final Placeable m72951performingMeasureK40F9xA(long j, @NotNull Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m72849setMeasurementConstraintsBRTryo0(j);
        return block.invoke();
    }

    @Override // androidx.compose.p003ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo69179placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        m59402l(j, f, function1);
    }

    /* renamed from: placeSelfApparentToRealOffset-f8xVGno */
    public final void m72952placeSelfApparentToRealOffsetf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        long m72845getApparentToRealOffsetnOccac = m72845getApparentToRealOffsetnOccac();
        m59402l(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(m72845getApparentToRealOffsetnOccac), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(m72845getApparentToRealOffsetnOccac)), f, function1);
    }

    @Nullable
    public Object propagateRelocationRequest(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
        return m59401m(this, rect, continuation);
    }

    /* renamed from: q */
    public final void m59397q(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!Intrinsics.areEqual(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.f30412y;
            if (ownedLayer != null) {
                ownedLayer.mo73011transform58bKbWc(fArr);
            }
            long mo72925getPositionnOccac = nodeCoordinator2.mo72925getPositionnOccac();
            if (!IntOffset.m73775equalsimpl0(mo72925getPositionnOccac, IntOffset.Companion.m73786getZeronOccac())) {
                float[] fArr2 = f30391D;
                Matrix.m71936resetimpl(fArr2);
                Matrix.m71947translateimpl$default(fArr2, IntOffset.m73776getXimpl(mo72925getPositionnOccac), IntOffset.m73777getYimpl(mo72925getPositionnOccac), 0.0f, 4, null);
                Matrix.m71944timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.f30397j;
            Intrinsics.checkNotNull(nodeCoordinator2);
        }
    }

    /* renamed from: r */
    public final void m59396r(boolean z) {
        Owner owner$ui_release;
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            Function1 function1 = this.f30400m;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = f30389B;
                reusableGraphicsLayerScope.reset();
                reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
                reusableGraphicsLayerScope.m72002setSizeuvyYCjk(IntSizeKt.m73828toSizeozmzZPI(mo72816getSizeYbymL2g()));
                m59408f().observeReads$ui_release(this, f30394z, new NodeCoordinator$updateLayerParameters$1(function1));
                C19393ci0 c19393ci0 = this.f30409v;
                if (c19393ci0 == null) {
                    c19393ci0 = new C19393ci0();
                    this.f30409v = c19393ci0;
                }
                c19393ci0.m51311b(reusableGraphicsLayerScope);
                ownedLayer.mo73012updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.mo71887getTransformOriginSzJe1aQ(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.mo71883getAmbientShadowColor0d7_KjU(), reusableGraphicsLayerScope.mo71886getSpotShadowColor0d7_KjU(), reusableGraphicsLayerScope.mo71884getCompositingStrategyNrFUSI(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
                this.f30399l = reusableGraphicsLayerScope.getClip();
                this.f30403p = reusableGraphicsLayerScope.getAlpha();
                if (z && (owner$ui_release = getLayoutNode().getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(getLayoutNode());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (this.f30400m == null) {
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            if (this.f30399l) {
                if (z2) {
                    long m72947getMinimumTouchTargetSizeNHjbRc = m72947getMinimumTouchTargetSizeNHjbRc();
                    float m71571getWidthimpl = Size.m71571getWidthimpl(m72947getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m71568getHeightimpl = Size.m71568getHeightimpl(m72947getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-m71571getWidthimpl, -m71568getHeightimpl, IntSize.m73818getWidthimpl(mo72816getSizeYbymL2g()) + m71571getWidthimpl, IntSize.m73817getHeightimpl(mo72816getSizeYbymL2g()) + m71568getHeightimpl);
                } else if (z) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m73818getWidthimpl(mo72816getSizeYbymL2g()), IntSize.m73817getHeightimpl(mo72816getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float m73776getXimpl = IntOffset.m73776getXimpl(mo72925getPositionnOccac());
        bounds.setLeft(bounds.getLeft() + m73776getXimpl);
        bounds.setRight(bounds.getRight() + m73776getXimpl);
        float m73777getYimpl = IntOffset.m73777getYimpl(mo72925getPositionnOccac());
        bounds.setTop(bounds.getTop() + m73777getYimpl);
        bounds.setBottom(bounds.getBottom() + m73777getYimpl);
    }

    @Override // androidx.compose.p003ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo69179placeAtf8xVGno(mo72925getPositionnOccac(), this.f30407t, this.f30400m);
    }

    public abstract void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui_release(@NotNull MeasureResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this.f30404q;
        if (value != measureResult) {
            this.f30404q = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map map = this.f30405r;
            if (((map != null && !map.isEmpty()) || (!value.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(value.getAlignmentLines(), this.f30405r)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map map2 = this.f30405r;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f30405r = map2;
                }
                map2.clear();
                map2.putAll(value.getAlignmentLines());
            }
        }
    }

    /* renamed from: setPosition--gyyYBs */
    public void m72953setPositiongyyYBs(long j) {
        this.f30406s = j;
    }

    public final void setWrapped$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.f30396i = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.f30397j = nodeCoordinator;
    }

    public final void setZIndex(float f) {
        this.f30407t = f;
    }

    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node m59406h = m59406h(NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(NodeKind.m72961constructorimpl(16)));
        if (m59406h == null) {
            return false;
        }
        int m72961constructorimpl = NodeKind.m72961constructorimpl(16);
        if (m59406h.getNode().isAttached()) {
            Modifier.Node node = m59406h.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & m72961constructorimpl) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                        Modifier.Node node2 = child$ui_release;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) node2).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((node2.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node2 = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.m59509b(mutableVector);
                        }
                        continue;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    /* renamed from: toParentPosition-MK-Hz9U */
    public long m72954toParentPositionMKHz9U(long j) {
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            j = ownedLayer.mo73008mapOffset8S9VItk(j, false);
        }
        return IntOffsetKt.m73790plusNvtHpc(j, mo72925getPositionnOccac());
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long m72943calculateMinimumTouchTargetPaddingE7KxVPU = m72943calculateMinimumTouchTargetPaddingE7KxVPU(m72947getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m71571getWidthimpl(m72943calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m71568getHeightimpl(m72943calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + Size.m71571getWidthimpl(m72943calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + Size.m71568getHeightimpl(m72943calculateMinimumTouchTargetPaddingE7KxVPU));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.f30397j;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo72820transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        NodeCoordinator m59399o = m59399o(sourceCoordinates);
        m59399o.onCoordinatesUsed$ui_release();
        NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(m59399o);
        Matrix.m71936resetimpl(matrix);
        m59399o.m59397q(findCommonAncestor$ui_release, matrix);
        m59398p(findCommonAncestor$ui_release, matrix);
    }

    public final void updateLayerBlock(@Nullable Function1<? super GraphicsLayerScope, Unit> function1, boolean z) {
        boolean z2;
        Owner owner$ui_release;
        LayoutNode layoutNode = getLayoutNode();
        if (!z && this.f30400m == function1 && Intrinsics.areEqual(this.f30401n, layoutNode.getDensity()) && this.f30402o == layoutNode.getLayoutDirection()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f30400m = function1;
        this.f30401n = layoutNode.getDensity();
        this.f30402o = layoutNode.getLayoutDirection();
        if (isAttached() && function1 != null) {
            if (this.f30412y == null) {
                OwnedLayer createLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this, this.f30410w);
                createLayer.mo73010resizeozmzZPI(m72846getMeasuredSizeYbymL2g());
                createLayer.mo73009movegyyYBs(mo72925getPositionnOccac());
                this.f30412y = createLayer;
                m59395s(this, false, 1, null);
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.f30410w.invoke();
                return;
            } else if (z2) {
                m59395s(this, false, 1, null);
                return;
            } else {
                return;
            }
        }
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.f30410w.invoke();
            if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                owner$ui_release.onLayoutChange(layoutNode);
            }
        }
        this.f30412y = null;
        this.f30411x = false;
    }

    public final void visitNodes(int i, boolean z, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node tail = getTail();
        if (z || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node m59406h = m59406h(z); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & i) != 0; m59406h = m59406h.getChild$ui_release()) {
                if ((m59406h.getKindSet$ui_release() & i) != 0) {
                    block.invoke(m59406h);
                }
                if (m59406h == tail) {
                    return;
                }
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ */
    public final /* synthetic */ <T> void m72955visitNodesaLcG6gQ(int i, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean m72970getIncludeSelfInTraversalH91voCI = NodeKindKt.m72970getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (m72970getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node m59406h = m59406h(m72970getIncludeSelfInTraversalH91voCI); m59406h != null && (m59406h.getAggregateChildKindSet$ui_release() & i) != 0; m59406h = m59406h.getChild$ui_release()) {
                if ((m59406h.getKindSet$ui_release() & i) != 0) {
                    for (Modifier.Node node = m59406h; node != null; node = DelegatableNodeKt.m59509b(null)) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        block.invoke(node);
                    }
                }
                if (m59406h == tail) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.p003ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo72821windowToLocalMKHz9U(long j) {
        if (isAttached()) {
            LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
            return mo72817localPositionOfR5De75A(findRootCoordinates, Offset.m71506minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo73013calculateLocalPositionMKHz9U(j), LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float m73776getXimpl = IntOffset.m73776getXimpl(mo72925getPositionnOccac());
        float m73777getYimpl = IntOffset.m73777getYimpl(mo72925getPositionnOccac());
        canvas.translate(m73776getXimpl, m73777getYimpl);
        block.invoke(canvas);
        canvas.translate(-m73776getXimpl, -m73777getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M */
    public final boolean m72956withinLayerBoundsk4lQ0M(long j) {
        if (!OffsetKt.m71519isFinitek4lQ0M(j)) {
            return false;
        }
        OwnedLayer ownedLayer = this.f30412y;
        if (ownedLayer != null && this.f30399l && !ownedLayer.mo73007isInLayerk4lQ0M(j)) {
            return false;
        }
        return true;
    }

    /* renamed from: invoke */
    public void invoke2(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getLayoutNode().isPlaced()) {
            m59408f().observeReads$ui_release(this, f30388A, new NodeCoordinator$invoke$1(this, canvas));
            this.f30411x = false;
            return;
        }
        this.f30411x = true;
    }
}
