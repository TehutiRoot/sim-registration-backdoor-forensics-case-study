package androidx.compose.p003ui.node;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import ch.qos.logback.core.pattern.parser.Parser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002lmB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u0010J\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u0010J\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u0010J\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR$\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R$\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R$\u0010,\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010&R$\u00101\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R$\u00104\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010&R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R*\u0010B\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010&\u001a\u0004\b?\u0010(\"\u0004\b@\u0010AR*\u0010F\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(\"\u0004\bE\u0010AR*\u0010L\u001a\u0002072\u0006\u0010=\u001a\u0002078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010R\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR0\u0010X\u001a\b\u0018\u00010SR\u00020\u00002\f\u0010!\u001a\b\u0018\u00010SR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0011\u0010\\\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010_\u001a\u0004\u0018\u00010\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001c\u0010a\u001a\u0004\u0018\u00010\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0014\u0010c\u001a\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010IR\u0014\u0010e\u001a\u0002078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010IR\u0014\u0010i\u001a\u00020f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0016\u0010k\u001a\u0004\u0018\u00010f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010h\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006n"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", OperatorName.CURVE_TO, "(J)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "markLayoutPending$ui_release", "()V", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "onCoordinatesUsed", "ensureLookaheadDelegateCreated$ui_release", "ensureLookaheadDelegateCreated", "updateParentData", "invalidateParentData", "resetAlignmentLines", "markChildrenDirty", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "<set-?>", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Z", "getMeasurePending$ui_release", "()Z", "measurePending", "d", "getLayoutPending$ui_release", "layoutPending", "e", "layoutPendingForAlignment", OperatorName.FILL_NON_ZERO, "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", OperatorName.NON_STROKING_GRAY, "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", OperatorName.CLOSE_PATH, "lookaheadLayoutPendingForAlignment", "", "i", "I", "nextChildLookaheadPlaceOrder", OperatorName.SET_LINE_JOINSTYLE, "nextChildPlaceOrder", "value", OperatorName.NON_STROKING_CMYK, "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", OperatorName.LINE_TO, "getCoordinatesAccessedDuringModifierPlacement", "setCoordinatesAccessedDuringModifierPlacement", "coordinatesAccessedDuringModifierPlacement", OperatorName.MOVE_TO, "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", OperatorName.ENDPATH, "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "o", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getLastLookaheadConstraints-DWUhwKw", "lastLookaheadConstraints", "getHeight$ui_release", "height", "getWidth$ui_release", "width", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadAlignmentLinesOwner", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1652:1\n1#2:1653\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate */
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegate {

    /* renamed from: a */
    public final LayoutNode f30287a;

    /* renamed from: b */
    public LayoutNode.LayoutState f30288b;

    /* renamed from: c */
    public boolean f30289c;

    /* renamed from: d */
    public boolean f30290d;

    /* renamed from: e */
    public boolean f30291e;

    /* renamed from: f */
    public boolean f30292f;

    /* renamed from: g */
    public boolean f30293g;

    /* renamed from: h */
    public boolean f30294h;

    /* renamed from: i */
    public int f30295i;

    /* renamed from: j */
    public int f30296j;

    /* renamed from: k */
    public boolean f30297k;

    /* renamed from: l */
    public boolean f30298l;

    /* renamed from: m */
    public int f30299m;

    /* renamed from: n */
    public final MeasurePassDelegate f30300n;

    /* renamed from: o */
    public LookaheadPassDelegate f30301o;

    @Metadata(m28851d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\u001d\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010'\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0002\b#H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010-J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010-J\u0015\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u001a¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\bJ\r\u00106\u001a\u00020\u001a¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u0010\bJ\r\u0010:\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\bJ\r\u0010;\u001a\u00020\u0006¢\u0006\u0004\b;\u0010\bJ\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\bJ\u000f\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010\bJ\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bB\u0010\bJ\u000f\u0010C\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010\bJ\u000f\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bD\u0010\bJ\u000f\u0010E\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010\bR\u0016\u0010G\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010J\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010IR\"\u0010O\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010I\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010F\u001a\u0004\bY\u00107\"\u0004\bZ\u00104R\u0016\u0010]\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010FR\u0016\u0010_\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010FR!\u0010b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b`\u0010aR-\u0010g\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001e8\u0000@BX\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR$\u0010l\u001a\u00020 2\u0006\u0010H\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kRJ\u0010q\u001a\u0015\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0002\b#2\u0019\u0010H\u001a\u0015\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\u0002\b#8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\"\u0010s\u001a\u00020\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010F\u001a\u0004\bs\u00107\"\u0004\bt\u00104R\u001a\u0010z\u001a\u00020u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001e\u0010\u007f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010F\u001a\u0005\b\u0081\u0001\u00107\"\u0005\b\u0082\u0001\u00104R'\u0010\u0086\u0001\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010F\u001a\u0005\b\u0085\u0001\u00107R\u0018\u0010\u0088\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010FR/\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010H\u001a\u0005\u0018\u00010\u0089\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u00070\u008f\u0001R\u00020|8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00158Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\"\u0010\u009d\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020|0\u009a\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010 \u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010¢\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010LR\u0016\u0010¤\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010L\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006¥\u0001"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "layoutChildren", "()V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "alignmentLine", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "forceRequest", "invalidateIntrinsicsParent", "(Z)V", "invalidateParentData", "updateParentData", "()Z", "onNodePlaced$ui_release", "onNodePlaced", Parser.REPLACE_CONVERTER_WORD, "onNodeDetached", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "e", "Landroidx/compose/ui/node/LayoutNode;", "node", OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/node/LayoutNode;)V", OperatorName.NON_STROKING_GRAY, OperatorName.CURVE_TO, "d", OperatorName.FILL_NON_ZERO, "Z", "relayoutWithoutParentInProgress", "<set-?>", "I", "previousPlaceOrder", "getPlaceOrder$ui_release", "()I", "setPlaceOrder$ui_release", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "i", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", OperatorName.SET_LINE_JOINSTYLE, "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", OperatorName.NON_STROKING_CMYK, "placedOnce", OperatorName.LINE_TO, "measuredOnce", OperatorName.MOVE_TO, "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", OperatorName.ENDPATH, OperatorName.SET_LINE_CAPSTYLE, "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "o", "F", "getLastZIndex$ui_release", "()F", "lastZIndex", "p", "Lkotlin/jvm/functions/Function1;", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "lastLayerBlock", OperatorName.SAVE, "isPlaced", "setPlaced", "Landroidx/compose/ui/node/AlignmentLines;", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/runtime/collection/MutableVector;", "_childDelegates", "t", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "childDelegatesDirty", "u", "getLayingOutChildren", "layingOutChildren", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "parentDataDirty", "", OperatorName.SET_LINE_WIDTH, "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1652:1\n1002#1:1691\n1003#1,2:1700\n1002#1:1706\n1003#1,2:1715\n1002#1:1745\n1003#1,2:1754\n1161#2,2:1653\n1570#3:1655\n1571#3,6:1664\n1577#3,5:1674\n199#4:1656\n197#4:1679\n197#4:1692\n197#4:1707\n197#4:1721\n197#4:1733\n197#4:1746\n197#4:1760\n197#4:1772\n476#5,7:1657\n483#5,4:1670\n460#5,11:1680\n460#5,7:1693\n467#5,4:1702\n460#5,7:1708\n467#5,4:1717\n460#5,11:1722\n460#5,11:1734\n460#5,7:1747\n467#5,4:1756\n460#5,11:1761\n460#5,11:1773\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1054#1:1691\n1054#1:1700,2\n1069#1:1706\n1069#1:1715,2\n1392#1:1745\n1392#1:1754,2\n982#1:1653,2\n991#1:1655\n991#1:1664,6\n991#1:1674,5\n991#1:1656\n1002#1:1679\n1054#1:1692\n1069#1:1707\n1096#1:1721\n1122#1:1733\n1392#1:1746\n1414#1:1760\n1447#1:1772\n991#1:1657,7\n991#1:1670,4\n1002#1:1680,11\n1054#1:1693,7\n1054#1:1702,4\n1069#1:1708,7\n1069#1:1717,4\n1096#1:1722,11\n1122#1:1734,11\n1392#1:1747,7\n1392#1:1756,4\n1414#1:1761,11\n1447#1:1773,11\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate */
    /* loaded from: classes2.dex */
    public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {

        /* renamed from: f */
        public boolean f30302f;

        /* renamed from: j */
        public boolean f30306j;

        /* renamed from: k */
        public boolean f30307k;

        /* renamed from: l */
        public boolean f30308l;

        /* renamed from: m */
        public Constraints f30309m;

        /* renamed from: o */
        public float f30311o;

        /* renamed from: p */
        public Function1 f30312p;

        /* renamed from: q */
        public boolean f30313q;

        /* renamed from: u */
        public boolean f30317u;

        /* renamed from: g */
        public int f30303g = Integer.MAX_VALUE;

        /* renamed from: h */
        public int f30304h = Integer.MAX_VALUE;

        /* renamed from: i */
        public LayoutNode.UsageByParent f30305i = LayoutNode.UsageByParent.NotUsed;

        /* renamed from: n */
        public long f30310n = IntOffset.Companion.m73786getZeronOccac();

        /* renamed from: r */
        public final AlignmentLines f30314r = new LookaheadAlignmentLines(this);

        /* renamed from: s */
        public final MutableVector f30315s = new MutableVector(new LookaheadPassDelegate[16], 0);

        /* renamed from: t */
        public boolean f30316t = true;

        /* renamed from: v */
        public boolean f30318v = true;

        /* renamed from: w */
        public Object f30319w = getMeasurePassDelegate$ui_release().getParentData();

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        /* renamed from: b */
        public final void m59471b() {
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    int i2 = lookaheadPassDelegate$ui_release.f30303g;
                    int i3 = lookaheadPassDelegate$ui_release.f30304h;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate$ui_release.m59468e();
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: c */
        public final void m59470c() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.f30295i = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                    Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.f30303g = lookaheadPassDelegate$ui_release.f30304h;
                    lookaheadPassDelegate$ui_release.f30304h = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate$ui_release.f30305i == LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate$ui_release.f30305i = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.f30306j) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        /* renamed from: d */
        public final void m59469d() {
            boolean isPlaced = isPlaced();
            setPlaced(true);
            int i = 0;
            if (!isPlaced && LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, true, false, 2, null);
            }
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.m59469d();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: e */
        public final void m59468e() {
            if (isPlaced()) {
                int i = 0;
                setPlaced(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.m59468e();
                        i++;
                    } while (i < size);
                }
            }
        }

        /* renamed from: f */
        public final void m59467f() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        Constraints m72920getLastConstraintsDWUhwKw = m72920getLastConstraintsDWUhwKw();
                        Intrinsics.checkNotNull(m72920getLastConstraintsDWUhwKw);
                        if (lookaheadPassDelegate$ui_release.m72922remeasureBRTryo0(m72920getLastConstraintsDWUhwKw.m73632unboximpl())) {
                            LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.f30287a, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1<? super AlignmentLinesOwner, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i].getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
                    Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    block.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: g */
        public final void m59466g() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.f30287a.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.f30306j = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            int i = lookaheadDelegate.get(alignmentLine);
            this.f30306j = false;
            return i;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.f30314r;
        }

        @NotNull
        public final List<LookaheadPassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.f30287a.getChildren$ui_release();
            if (this.f30316t) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
                MutableVector mutableVector = this.f30315s;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (mutableVector.getSize() <= i) {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                            mutableVector.add(lookaheadPassDelegate$ui_release);
                        } else {
                            LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = layoutNode2.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
                            Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release2);
                            mutableVector.set(i, lookaheadPassDelegate$ui_release2);
                        }
                        i++;
                    } while (i < size);
                    mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                    this.f30316t = false;
                    return this.f30315s.asMutableList();
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.f30316t = false;
                return this.f30315s.asMutableList();
            }
            return this.f30315s.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.f30316t;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.f30306j;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.f30287a.getInnerCoordinator$ui_release();
        }

        @Nullable
        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m72920getLastConstraintsDWUhwKw() {
            return this.f30309m;
        }

        @Nullable
        public final Function1<GraphicsLayerScope, Unit> getLastLayerBlock$ui_release() {
            return this.f30312p;
        }

        /* renamed from: getLastPosition-nOcc-ac$ui_release  reason: not valid java name */
        public final long m72921getLastPositionnOccac$ui_release() {
            return this.f30310n;
        }

        public final float getLastZIndex$ui_release() {
            return this.f30311o;
        }

        public final boolean getLayingOutChildren() {
            return this.f30317u;
        }

        @NotNull
        public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return LayoutNodeLayoutDelegate.this.getMeasurePassDelegate$ui_release();
        }

        @NotNull
        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.f30305i;
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredHeight() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredWidth() {
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            if (parent$ui_release != null && (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) != null) {
                return layoutDelegate$ui_release.getLookaheadAlignmentLinesOwner$ui_release();
            }
            return null;
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.f30319w;
        }

        public final int getPlaceOrder$ui_release() {
            return this.f30304h;
        }

        /* renamed from: h */
        public final void m59465h(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.f30305i != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                    usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                this.f30305i = usageByParent;
                return;
            }
            this.f30305i = LayoutNode.UsageByParent.NotUsed;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                            parent$ui_release2.requestLookaheadRelayout$ui_release(z);
                            return;
                        } else {
                            parent$ui_release2.requestRelayout$ui_release(z);
                            return;
                        }
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                } else if (parent$ui_release2.getLookaheadRoot$ui_release() != null) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
                } else {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
                }
            }
        }

        public final void invalidateParentData() {
            this.f30318v = true;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.f30313q;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.f30317u = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release()) {
                m59467f();
            }
            LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (LayoutNodeLayoutDelegate.this.f30294h || (!this.f30306j && !lookaheadDelegate.isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.f30293g = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.f30288b = LayoutNode.LayoutState.LookaheadLayingOut;
                Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.f30287a);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.f30287a, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, lookaheadDelegate), 2, null);
                LayoutNodeLayoutDelegate.this.f30288b = layoutState$ui_release;
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.isPlacingForAlignment$ui_release()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.f30294h = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.f30317u = false;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            m59466g();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            m59466g();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        @NotNull
        /* renamed from: measure-BRTryo0 */
        public Placeable mo72811measureBRTryo0(long j) {
            m59465h(LayoutNodeLayoutDelegate.this.f30287a);
            if (LayoutNodeLayoutDelegate.this.f30287a.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNodeLayoutDelegate.this.f30287a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            m72922remeasureBRTryo0(j);
            return this;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            m59466g();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            m59466g();
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(i);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0 && (size = (mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode = content[i];
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutDelegate$ui_release.getLookaheadPassDelegate$ui_release();
                    if (lookaheadPassDelegate$ui_release != null) {
                        lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void onNodeDetached() {
            this.f30304h = Integer.MAX_VALUE;
            this.f30303g = Integer.MAX_VALUE;
            setPlaced(false);
        }

        public final void onNodePlaced$ui_release() {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            if (!isPlaced()) {
                m59469d();
            }
            if (parent$ui_release != null) {
                if (!this.f30302f && (parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (this.f30304h == Integer.MAX_VALUE) {
                        this.f30304h = parent$ui_release.getLayoutDelegate$ui_release().f30295i;
                        parent$ui_release.getLayoutDelegate$ui_release().f30295i++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.f30304h = 0;
            }
            layoutChildren();
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo69179placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            LayoutNodeLayoutDelegate.this.f30288b = LayoutNode.LayoutState.LookaheadLayingOut;
            this.f30307k = true;
            if (!IntOffset.m73775equalsimpl0(j, this.f30310n)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.f30293g = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.f30287a);
            if (!LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending$ui_release() && isPlaced()) {
                onNodePlaced$ui_release();
            } else {
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(requireOwner.getSnapshotObserver(), LayoutNodeLayoutDelegate.this.f30287a, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(LayoutNodeLayoutDelegate.this, j), 2, null);
            }
            this.f30310n = j;
            this.f30311o = f;
            this.f30312p = function1;
            LayoutNodeLayoutDelegate.this.f30288b = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m72922remeasureBRTryo0(long j) {
            boolean z;
            boolean z2;
            boolean m73620equalsimpl0;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            if (!LayoutNodeLayoutDelegate.this.f30287a.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
                z = false;
            } else {
                z = true;
            }
            layoutNode.setCanMultiMeasure$ui_release(z);
            if (!LayoutNodeLayoutDelegate.this.f30287a.getLookaheadMeasurePending$ui_release()) {
                Constraints constraints = this.f30309m;
                if (constraints == null) {
                    m73620equalsimpl0 = false;
                } else {
                    m73620equalsimpl0 = Constraints.m73620equalsimpl0(constraints.m73632unboximpl(), j);
                }
                if (m73620equalsimpl0) {
                    Owner owner$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getOwner$ui_release();
                    if (owner$ui_release != null) {
                        owner$ui_release.forceMeasureTheSubtree(LayoutNodeLayoutDelegate.this.f30287a, true);
                    }
                    LayoutNodeLayoutDelegate.this.f30287a.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
            }
            this.f30309m = Constraints.m73615boximpl(j);
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.INSTANCE);
            this.f30308l = true;
            LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long IntSize = IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight());
                LayoutNodeLayoutDelegate.this.m59473b(j);
                m72848setMeasuredSizeozmzZPI(IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
                if (IntSize.m73818getWidthimpl(IntSize) != lookaheadDelegate.getWidth() || IntSize.m73817getHeightimpl(IntSize) != lookaheadDelegate.getHeight()) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        public final void replace() {
            try {
                this.f30302f = true;
                if (this.f30307k) {
                    mo69179placeAtf8xVGno(this.f30310n, 0.0f, null);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } finally {
                this.f30302f = false;
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestLookaheadRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, false, 1, null);
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestLookaheadRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.f30316t = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.f30306j = z;
        }

        public final void setMeasuredByParent$ui_release(@NotNull LayoutNode.UsageByParent usageByParent) {
            Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
            this.f30305i = usageByParent;
        }

        public final void setPlaceOrder$ui_release(int i) {
            this.f30304h = i;
        }

        public void setPlaced(boolean z) {
            this.f30313q = z;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                LookaheadDelegate lookaheadDelegate = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.f30318v) {
                return false;
            }
            this.f30318v = false;
            LookaheadDelegate lookaheadDelegate2 = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate2);
            this.f30319w = lookaheadDelegate2.getParentData();
            return true;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J@\u0010#\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010 \u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d¢\u0006\u0002\b\u001fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010'J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\bJ\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00160/H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u001dH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\bJ\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b7\u0010\bJ\u0015\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0010¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0006¢\u0006\u0004\b;\u0010\bJ\r\u0010<\u001a\u00020\u0006¢\u0006\u0004\b<\u0010\bJ\r\u0010=\u001a\u00020\u0006¢\u0006\u0004\b=\u0010\bJ\u000f\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010\bJ\u000f\u0010?\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\bJ\u000f\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\bJ\u0017\u0010D\u001a\u00020\u00062\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ@\u0010F\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010 \u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d¢\u0006\u0002\b\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010\"J\u000f\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010\bJ\u000f\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\bR\u0016\u0010J\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010O\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010L\u001a\u0004\bM\u0010NR$\u0010Q\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010L\u001a\u0004\bP\u0010NR\u0016\u0010R\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010IR\u0016\u0010T\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010IR\"\u0010\\\u001a\u00020U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010`\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010I\u001a\u0004\b^\u0010.\"\u0004\b_\u0010:R\u001f\u0010c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\ba\u0010bR)\u0010f\u001a\u0015\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d¢\u0006\u0002\b\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010IR(\u0010q\u001a\u0004\u0018\u00010l2\b\u0010K\u001a\u0004\u0018\u00010l8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR*\u0010s\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u00108\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010I\u001a\u0004\bs\u0010.\"\u0004\bt\u0010:R\u001a\u0010z\u001a\u00020u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001e\u0010\u007f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010I\u001a\u0005\b\u0081\u0001\u0010.\"\u0005\b\u0082\u0001\u0010:R'\u0010\u0086\u0001\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010I\u001a\u0005\b\u0085\u0001\u0010.R'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010h\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\"\u0010\u0094\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020|0\u0091\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0096\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010NR\u0016\u0010\u0098\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010NR\u0019\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u009c\u0001"}, m28850d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "layoutChildren", "()V", "onNodePlaced$ui_release", "onNodePlaced", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", Parser.REPLACE_CONVERTER_WORD, "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "invalidateParentData", "updateParentData", "()Z", "", "calculateAlignmentLines", "()Ljava/util/Map;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "forceRequest", "invalidateIntrinsicsParent", "(Z)V", "onNodeDetached", "measureBasedOnLookahead", "placeBasedOnLookahead", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "e", "d", OperatorName.CURVE_TO, "Landroidx/compose/ui/node/LayoutNode;", "node", "i", "(Landroidx/compose/ui/node/LayoutNode;)V", OperatorName.CLOSE_PATH, OperatorName.NON_STROKING_GRAY, OperatorName.FILL_NON_ZERO, "Z", "relayoutWithoutParentInProgress", "<set-?>", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "getPlaceOrder$ui_release", "placeOrder", "measuredOnce", OperatorName.SET_LINE_JOINSTYLE, "placedOnce", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", OperatorName.LINE_TO, "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", OperatorName.MOVE_TO, OperatorName.SET_LINE_CAPSTYLE, "lastPosition", OperatorName.ENDPATH, "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "o", "F", "lastZIndex", "p", "parentDataDirty", "", OperatorName.SAVE, "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "parentData", PDPageLabelRange.STYLE_ROMAN_LOWER, "isPlaced", "setPlaced$ui_release", "Landroidx/compose/ui/node/AlignmentLines;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "t", "Landroidx/compose/runtime/collection/MutableVector;", "_childDelegates", "u", "getChildDelegatesDirty$ui_release", "setChildDelegatesDirty$ui_release", "childDelegatesDirty", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getLayingOutChildren", "layingOutChildren", OperatorName.SET_LINE_WIDTH, "getZIndex$ui_release", "()F", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegates", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1652:1\n512#1:1691\n513#1,2:1700\n515#1:1706\n512#1:1733\n513#1,2:1742\n515#1:1748\n1161#2,2:1653\n1570#3:1655\n1571#3,6:1664\n1577#3,5:1674\n199#4:1656\n197#4:1679\n197#4:1692\n1242#4,7:1707\n197#4:1714\n1230#4,7:1726\n197#4:1734\n197#4:1749\n197#4:1761\n197#4:1773\n197#4:1785\n476#5,7:1657\n483#5,4:1670\n460#5,11:1680\n460#5,7:1693\n467#5,4:1702\n460#5,11:1715\n460#5,7:1735\n467#5,4:1744\n460#5,11:1750\n460#5,11:1762\n460#5,11:1774\n460#5,11:1786\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n412#1:1691\n412#1:1700,2\n412#1:1706\n499#1:1733\n499#1:1742,2\n499#1:1748\n318#1:1653,2\n328#1:1655\n328#1:1664,6\n328#1:1674,5\n328#1:1656\n394#1:1679\n412#1:1692\n431#1:1707,7\n436#1:1714\n458#1:1726,7\n499#1:1734\n512#1:1749\n789#1:1761\n815#1:1773\n851#1:1785\n328#1:1657,7\n328#1:1670,4\n394#1:1680,11\n412#1:1693,7\n412#1:1702,4\n436#1:1715,11\n499#1:1735,7\n499#1:1744,4\n512#1:1750,11\n789#1:1762,11\n815#1:1774,11\n851#1:1786,11\n*E\n"})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate */
    /* loaded from: classes2.dex */
    public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner {

        /* renamed from: f */
        public boolean f30321f;

        /* renamed from: i */
        public boolean f30324i;

        /* renamed from: j */
        public boolean f30325j;

        /* renamed from: l */
        public boolean f30327l;

        /* renamed from: n */
        public Function1 f30329n;

        /* renamed from: o */
        public float f30330o;

        /* renamed from: q */
        public Object f30332q;

        /* renamed from: r */
        public boolean f30333r;

        /* renamed from: v */
        public boolean f30337v;

        /* renamed from: w */
        public float f30338w;

        /* renamed from: g */
        public int f30322g = Integer.MAX_VALUE;

        /* renamed from: h */
        public int f30323h = Integer.MAX_VALUE;

        /* renamed from: k */
        public LayoutNode.UsageByParent f30326k = LayoutNode.UsageByParent.NotUsed;

        /* renamed from: m */
        public long f30328m = IntOffset.Companion.m73786getZeronOccac();

        /* renamed from: p */
        public boolean f30331p = true;

        /* renamed from: s */
        public final AlignmentLines f30334s = new LayoutNodeAlignmentLines(this);

        /* renamed from: t */
        public final MutableVector f30335t = new MutableVector(new MeasurePassDelegate[16], 0);

        /* renamed from: u */
        public boolean f30336u = true;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$WhenMappings */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m59464b() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().f30322g != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().m59461e();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final void m59463c() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.f30296j = 0;
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    MeasurePassDelegate measurePassDelegate$ui_release = content[i].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.f30322g = measurePassDelegate$ui_release.f30323h;
                    measurePassDelegate$ui_release.f30323h = Integer.MAX_VALUE;
                    if (measurePassDelegate$ui_release.f30326k == LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.f30326k = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: d */
        private final void m59462d() {
            boolean isPlaced = isPlaced();
            setPlaced$ui_release(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            int i = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().m59462d();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: e */
        private final void m59461e() {
            if (isPlaced()) {
                int i = 0;
                setPlaced$ui_release(false);
                MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i].getMeasurePassDelegate$ui_release().m59461e();
                        i++;
                    } while (i < size);
                }
            }
        }

        /* renamed from: f */
        private final void m59460f() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m72908remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.f30287a, false, false, 3, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: g */
        private final void m59459g() {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, false, false, 3, null);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            if (parent$ui_release != null && LayoutNodeLayoutDelegate.this.f30287a.getIntrinsicsUsageByParent$ui_release() == LayoutNode.UsageByParent.NotUsed) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        usageByParent = parent$ui_release.getIntrinsicsUsageByParent$ui_release();
                    } else {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public Map<AlignmentLine, Integer> calculateAlignmentLines() {
            if (!this.f30327l) {
                if (LayoutNodeLayoutDelegate.this.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty$ui_release()) {
                        LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(@NotNull Function1<? super AlignmentLinesOwner, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableVector<LayoutNode> mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    block.invoke(content[i].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(@NotNull AlignmentLine alignmentLine) {
            LayoutNode.LayoutState layoutState;
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            LayoutNode.LayoutState layoutState2 = null;
            if (parent$ui_release != null) {
                layoutState = parent$ui_release.getLayoutState$ui_release();
            } else {
                layoutState = null;
            }
            if (layoutState == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            } else {
                LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutState2 = parent$ui_release2.getLayoutState$ui_release();
                }
                if (layoutState2 == LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            }
            this.f30327l = true;
            int i = LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.f30327l = false;
            return i;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public AlignmentLines getAlignmentLines() {
            return this.f30334s;
        }

        @NotNull
        public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
            LayoutNodeLayoutDelegate.this.f30287a.updateChildrenIfDirty$ui_release();
            if (this.f30336u) {
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
                MutableVector mutableVector = this.f30335t;
                MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
                int size = mutableVector2.getSize();
                if (size > 0) {
                    LayoutNode[] content = mutableVector2.getContent();
                    int i = 0;
                    do {
                        LayoutNode layoutNode2 = content[i];
                        if (mutableVector.getSize() <= i) {
                            mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        } else {
                            mutableVector.set(i, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
                        }
                        i++;
                    } while (i < size);
                    mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                    this.f30336u = false;
                    return this.f30335t.asMutableList();
                }
                mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
                this.f30336u = false;
                return this.f30335t.asMutableList();
            }
            return this.f30335t.asMutableList();
        }

        public final boolean getChildDelegatesDirty$ui_release() {
            return this.f30336u;
        }

        public final boolean getDuringAlignmentLinesQuery$ui_release() {
            return this.f30327l;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @NotNull
        public NodeCoordinator getInnerCoordinator() {
            return LayoutNodeLayoutDelegate.this.f30287a.getInnerCoordinator$ui_release();
        }

        @Nullable
        /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
        public final Constraints m72923getLastConstraintsDWUhwKw() {
            if (this.f30324i) {
                return Constraints.m73615boximpl(m72847getMeasurementConstraintsmsEJaDk());
            }
            return null;
        }

        public final boolean getLayingOutChildren() {
            return this.f30337v;
        }

        @NotNull
        public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
            return this.f30326k;
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredHeight() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured
        public int getMeasuredWidth() {
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        @Nullable
        public AlignmentLinesOwner getParentAlignmentLinesOwner() {
            LayoutNodeLayoutDelegate layoutDelegate$ui_release;
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            if (parent$ui_release != null && (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) != null) {
                return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
            }
            return null;
        }

        @Override // androidx.compose.p003ui.layout.Placeable, androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
        @Nullable
        public Object getParentData() {
            return this.f30332q;
        }

        public final int getPlaceOrder$ui_release() {
            return this.f30323h;
        }

        public final int getPreviousPlaceOrder$ui_release() {
            return this.f30322g;
        }

        public final float getZIndex$ui_release() {
            return this.f30338w;
        }

        /* renamed from: h */
        public final void m59458h(long j, float f, Function1 function1) {
            LayoutNodeLayoutDelegate.this.f30288b = LayoutNode.LayoutState.LayingOut;
            this.f30328m = j;
            this.f30330o = f;
            this.f30329n = function1;
            this.f30325j = true;
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.f30287a);
            if (!LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release() && isPlaced()) {
                LayoutNodeLayoutDelegate.this.getOuterCoordinator().m72952placeSelfApparentToRealOffsetf8xVGno(j, f, function1);
                onNodePlaced$ui_release();
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(LayoutNodeLayoutDelegate.this.f30287a, false, new C3520x14fd4410(function1, LayoutNodeLayoutDelegate.this, j, f));
            }
            LayoutNodeLayoutDelegate.this.f30288b = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: i */
        public final void m59457i(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.f30326k != LayoutNode.UsageByParent.NotUsed && !layoutNode.getCanMultiMeasure$ui_release()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                    }
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                this.f30326k = usageByParent;
                return;
            }
            this.f30326k = LayoutNode.UsageByParent.NotUsed;
        }

        public final void invalidateIntrinsicsParent(boolean z) {
            LayoutNode parent$ui_release;
            LayoutNode parent$ui_release2 = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getIntrinsicsUsageByParent$ui_release();
            if (parent$ui_release2 != null && intrinsicsUsageByParent$ui_release != LayoutNode.UsageByParent.NotUsed) {
                while (parent$ui_release2.getIntrinsicsUsageByParent$ui_release() == intrinsicsUsageByParent$ui_release && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                    parent$ui_release2 = parent$ui_release;
                }
                int i = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        parent$ui_release2.requestRelayout$ui_release(z);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, z, false, 2, null);
            }
        }

        public final void invalidateParentData() {
            this.f30331p = true;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public boolean isPlaced() {
            return this.f30333r;
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.f30337v = true;
            getAlignmentLines().recalculateQueryOwner();
            if (LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release()) {
                m59460f();
            }
            if (LayoutNodeLayoutDelegate.this.f30291e || (!this.f30327l && !getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getLayoutPending$ui_release())) {
                LayoutNodeLayoutDelegate.this.f30290d = false;
                LayoutNode.LayoutState layoutState$ui_release = LayoutNodeLayoutDelegate.this.getLayoutState$ui_release();
                LayoutNodeLayoutDelegate.this.f30288b = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
                LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(this, layoutNode));
                LayoutNodeLayoutDelegate.this.f30288b = layoutState$ui_release;
                if (getInnerCoordinator().isPlacingForAlignment$ui_release() && LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.f30291e = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.f30337v = false;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            m59459g();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            m59459g();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        @NotNull
        /* renamed from: measure-BRTryo0 */
        public Placeable mo72811measureBRTryo0(long j) {
            LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getIntrinsicsUsageByParent$ui_release();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (intrinsicsUsageByParent$ui_release == usageByParent) {
                LayoutNodeLayoutDelegate.this.f30287a.clearSubtreeIntrinsicsUsage$ui_release();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.m59474a(layoutNodeLayoutDelegate.f30287a)) {
                this.f30324i = true;
                m72849setMeasurementConstraintsBRTryo0(j);
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
                lookaheadPassDelegate$ui_release.mo72811measureBRTryo0(j);
            }
            m59457i(LayoutNodeLayoutDelegate.this.f30287a);
            m72924remeasureBRTryo0(j);
            return this;
        }

        public final void measureBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            Intrinsics.checkNotNull(parent$ui_release);
            if (lookaheadPassDelegate$ui_release != null) {
                if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                    Constraints m72920getLastConstraintsDWUhwKw = lookaheadPassDelegate$ui_release.m72920getLastConstraintsDWUhwKw();
                    Intrinsics.checkNotNull(m72920getLastConstraintsDWUhwKw);
                    mo72811measureBRTryo0(m72920getLastConstraintsDWUhwKw.m73632unboximpl());
                    return;
                } else if (lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    Constraints m72920getLastConstraintsDWUhwKw2 = lookaheadPassDelegate$ui_release.m72920getLastConstraintsDWUhwKw();
                    Intrinsics.checkNotNull(m72920getLastConstraintsDWUhwKw2);
                    mo72811measureBRTryo0(m72920getLastConstraintsDWUhwKw2.m73632unboximpl());
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            m59459g();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            m59459g();
            return LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(i);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            MutableVector<LayoutNode> mutableVector;
            int size;
            if (LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() > 0 && (size = (mutableVector = LayoutNodeLayoutDelegate.this.f30287a.get_children$ui_release()).getSize()) > 0) {
                LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    LayoutNode layoutNode = content[i];
                    LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                    if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                    i++;
                } while (i < size);
            }
        }

        public final void onNodeDetached() {
            this.f30323h = Integer.MAX_VALUE;
            this.f30322g = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void onNodePlaced$ui_release() {
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
            }
            if (zIndex != this.f30338w) {
                this.f30338w = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!isPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                m59462d();
            }
            if (parent$ui_release != null) {
                if (!this.f30321f && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    if (this.f30323h == Integer.MAX_VALUE) {
                        this.f30323h = parent$ui_release.getLayoutDelegate$ui_release().f30296j;
                        parent$ui_release.getLayoutDelegate$ui_release().f30296j++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.f30323h = 0;
            }
            layoutChildren();
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo69179placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            if (!IntOffset.m73775equalsimpl0(j, this.f30328m)) {
                if (LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNodeLayoutDelegate.this.f30290d = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.m59474a(layoutNodeLayoutDelegate.f30287a)) {
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeLayoutDelegate2.getLookaheadPassDelegate$ui_release();
                Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                LayoutNode parent$ui_release = layoutNodeLayoutDelegate2.f30287a.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate$ui_release().f30295i = 0;
                }
                lookaheadPassDelegate$ui_release.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                Placeable.PlacementScope.place$default(companion, lookaheadPassDelegate$ui_release, IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(j), 0.0f, 4, null);
            }
            m59458h(j, f, function1);
        }

        public final void placeBasedOnLookahead() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                mo69179placeAtf8xVGno(lookaheadPassDelegate$ui_release.m72921getLastPositionnOccac$ui_release(), lookaheadPassDelegate$ui_release.getLastZIndex$ui_release(), lookaheadPassDelegate$ui_release.getLastLayerBlock$ui_release());
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: remeasure-BRTryo0  reason: not valid java name */
        public final boolean m72924remeasureBRTryo0(long j) {
            boolean z;
            Owner requireOwner = LayoutNodeKt.requireOwner(LayoutNodeLayoutDelegate.this.f30287a);
            LayoutNode parent$ui_release = LayoutNodeLayoutDelegate.this.f30287a.getParent$ui_release();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f30287a;
            boolean z2 = true;
            if (!LayoutNodeLayoutDelegate.this.f30287a.getCanMultiMeasure$ui_release() && (parent$ui_release == null || !parent$ui_release.getCanMultiMeasure$ui_release())) {
                z = false;
            } else {
                z = true;
            }
            layoutNode.setCanMultiMeasure$ui_release(z);
            if (!LayoutNodeLayoutDelegate.this.f30287a.getMeasurePending$ui_release() && Constraints.m73620equalsimpl0(m72847getMeasurementConstraintsmsEJaDk(), j)) {
                AbstractC18176Og1.m67009a(requireOwner, LayoutNodeLayoutDelegate.this.f30287a, false, 2, null);
                LayoutNodeLayoutDelegate.this.f30287a.resetSubtreeIntrinsicsUsage$ui_release();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
            forEachChildAlignmentLinesOwner(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.INSTANCE);
            this.f30324i = true;
            long mo72816getSizeYbymL2g = LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo72816getSizeYbymL2g();
            m72849setMeasurementConstraintsBRTryo0(j);
            LayoutNodeLayoutDelegate.this.m59472c(j);
            if (IntSize.m73816equalsimpl0(LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo72816getSizeYbymL2g(), mo72816getSizeYbymL2g) && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                z2 = false;
            }
            m72848setMeasuredSizeozmzZPI(IntSizeKt.IntSize(LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
            return z2;
        }

        public final void replace() {
            try {
                this.f30321f = true;
                if (this.f30325j) {
                    m59458h(this.f30328m, this.f30330o, this.f30329n);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } finally {
                this.f30321f = false;
            }
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestLayout() {
            LayoutNode.requestRelayout$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, false, 1, null);
        }

        @Override // androidx.compose.p003ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            LayoutNode.requestRemeasure$ui_release$default(LayoutNodeLayoutDelegate.this.f30287a, false, false, 3, null);
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.f30336u = z;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.f30327l = z;
        }

        public final void setMeasuredByParent$ui_release(@NotNull LayoutNode.UsageByParent usageByParent) {
            Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
            this.f30326k = usageByParent;
        }

        public void setPlaced$ui_release(boolean z) {
            this.f30333r = z;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) || !this.f30331p) {
                return false;
            }
            this.f30331p = false;
            this.f30332q = LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return true;
        }
    }

    public LayoutNodeLayoutDelegate(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30287a = layoutNode;
        this.f30288b = LayoutNode.LayoutState.Idle;
        this.f30300n = new MeasurePassDelegate();
    }

    /* renamed from: a */
    public final boolean m59474a(LayoutNode layoutNode) {
        LayoutNode layoutNode2;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNode2 = parent$ui_release.getLookaheadRoot$ui_release();
            } else {
                layoutNode2 = null;
            }
            if (layoutNode2 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m59473b(long j) {
        this.f30288b = LayoutNode.LayoutState.LookaheadMeasuring;
        this.f30292f = false;
        OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(LayoutNodeKt.requireOwner(this.f30287a).getSnapshotObserver(), this.f30287a, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j), 2, null);
        markLookaheadLayoutPending$ui_release();
        if (m59474a(this.f30287a)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.f30288b = LayoutNode.LayoutState.Idle;
    }

    /* renamed from: c */
    public final void m59472c(long j) {
        LayoutNode.LayoutState layoutState = this.f30288b;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState == layoutState2) {
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            this.f30288b = layoutState3;
            this.f30289c = false;
            LayoutNodeKt.requireOwner(this.f30287a).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.f30287a, false, new LayoutNodeLayoutDelegate$performMeasure$2(this, j));
            if (this.f30288b == layoutState3) {
                markLayoutPending$ui_release();
                this.f30288b = layoutState2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.f30301o == null) {
            this.f30301o = new LookaheadPassDelegate();
        }
    }

    @NotNull
    public final AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.f30300n;
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.f30299m;
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.f30298l;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.f30297k;
    }

    public final int getHeight$ui_release() {
        return this.f30300n.getHeight();
    }

    @Nullable
    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m72918getLastConstraintsDWUhwKw() {
        return this.f30300n.m72923getLastConstraintsDWUhwKw();
    }

    @Nullable
    /* renamed from: getLastLookaheadConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m72919getLastLookaheadConstraintsDWUhwKw() {
        LookaheadPassDelegate lookaheadPassDelegate = this.f30301o;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.m72920getLastConstraintsDWUhwKw();
        }
        return null;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.f30290d;
    }

    @NotNull
    public final LayoutNode.LayoutState getLayoutState$ui_release() {
        return this.f30288b;
    }

    @Nullable
    public final AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
        return this.f30301o;
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.f30293g;
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.f30292f;
    }

    @Nullable
    public final LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.f30301o;
    }

    @NotNull
    public final MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.f30300n;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.f30289c;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator() {
        return this.f30287a.getNodes$ui_release().getOuterCoordinator$ui_release();
    }

    public final int getWidth$ui_release() {
        return this.f30300n.getWidth();
    }

    public final void invalidateParentData() {
        this.f30300n.invalidateParentData();
        LookaheadPassDelegate lookaheadPassDelegate = this.f30301o;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void markChildrenDirty() {
        this.f30300n.setChildDelegatesDirty$ui_release(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.f30301o;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }

    public final void markLayoutPending$ui_release() {
        this.f30290d = true;
        this.f30291e = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.f30293g = true;
        this.f30294h = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.f30292f = true;
    }

    public final void markMeasurePending$ui_release() {
        this.f30289c = true;
    }

    public final void onCoordinatesUsed() {
        LayoutNode.LayoutState layoutState$ui_release = this.f30287a.getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.f30300n.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.f30301o;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    public final void resetAlignmentLines() {
        AlignmentLines alignmentLines;
        this.f30300n.getAlignmentLines().reset$ui_release();
        LookaheadPassDelegate lookaheadPassDelegate = this.f30301o;
        if (lookaheadPassDelegate != null && (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) != null) {
            alignmentLines.reset$ui_release();
        }
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        boolean z;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        int i2 = this.f30299m;
        this.f30299m = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            LayoutNode parent$ui_release = this.f30287a.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNodeLayoutDelegate = parent$ui_release.getLayoutDelegate$ui_release();
            } else {
                layoutNodeLayoutDelegate = null;
            }
            if (layoutNodeLayoutDelegate != null) {
                if (i == 0) {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.f30299m - 1);
                } else {
                    layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.f30299m + 1);
                }
            }
        }
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.f30298l != z) {
            this.f30298l = z;
            if (z && !this.f30297k) {
                setChildrenAccessingCoordinatesDuringPlacement(this.f30299m + 1);
            } else if (!z && !this.f30297k) {
                setChildrenAccessingCoordinatesDuringPlacement(this.f30299m - 1);
            }
        }
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.f30297k != z) {
            this.f30297k = z;
            if (z && !this.f30298l) {
                setChildrenAccessingCoordinatesDuringPlacement(this.f30299m + 1);
            } else if (!z && !this.f30298l) {
                setChildrenAccessingCoordinatesDuringPlacement(this.f30299m - 1);
            }
        }
    }

    public final void updateParentData() {
        LayoutNode parent$ui_release;
        if (this.f30300n.updateParentData() && (parent$ui_release = this.f30287a.getParent$ui_release()) != null) {
            LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f30301o;
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.updateParentData()) {
            if (m59474a(this.f30287a)) {
                LayoutNode parent$ui_release2 = this.f30287a.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                    return;
                }
                return;
            }
            LayoutNode parent$ui_release3 = this.f30287a.getParent$ui_release();
            if (parent$ui_release3 != null) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
            }
        }
    }
}
