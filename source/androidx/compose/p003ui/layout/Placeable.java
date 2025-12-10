package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p003ui.node.LookaheadCapablePlaceable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000bH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0003R$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R3\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R3\u0010'\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020#8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R-\u0010*\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0004@BX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0014\u0010.\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "<set-?>", "I", "getWidth", "()I", "width", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getHeight", "height", "Landroidx/compose/ui/unit/IntSize;", "value", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "measuredSize", "Landroidx/compose/ui/unit/Constraints;", "d", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "measurementConstraints", "e", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "PlacementScope", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.Placeable */
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;

    /* renamed from: a */
    public int f30146a;

    /* renamed from: b */
    public int f30147b;

    /* renamed from: c */
    public long f30148c = IntSizeKt.IntSize(0, 0);

    /* renamed from: d */
    public long f30149d = PlaceableKt.access$getDefaultConstraints$p();

    /* renamed from: e */
    public long f30150e = IntOffset.Companion.m73786getZeronOccac();

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JJ\u0010\u001a\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JJ\u0010!\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J)\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0017J$\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JD\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010 J?\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eJD\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010 J?\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006*"}, m28850d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,426:1\n320#1,2:427\n337#1:429\n338#1:431\n323#1,2:432\n337#1,2:434\n329#1:436\n320#1,2:437\n337#1:439\n338#1:441\n323#1,2:442\n337#1,2:444\n329#1:446\n337#1:447\n338#1:449\n337#1:450\n338#1:452\n320#1,2:453\n337#1:455\n338#1:457\n323#1,2:458\n337#1,2:460\n329#1:462\n320#1,2:463\n337#1:465\n338#1:467\n323#1,2:468\n337#1,2:470\n329#1:472\n337#1:473\n338#1:475\n337#1:476\n338#1:478\n337#1:479\n338#1:481\n337#1:482\n338#1:484\n86#2:430\n86#2:440\n86#2:448\n86#2:451\n86#2:456\n86#2:466\n86#2:474\n86#2:477\n86#2:480\n86#2:483\n86#2:485\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n186#1:427,2\n186#1:429\n186#1:431\n186#1:432,2\n186#1:434,2\n186#1:436\n202#1:437,2\n202#1:439\n202#1:441\n202#1:442,2\n202#1:444,2\n202#1:446\n214#1:447\n214#1:449\n226#1:450\n226#1:452\n249#1:453,2\n249#1:455\n249#1:457\n249#1:458,2\n249#1:460,2\n249#1:462\n273#1:463,2\n273#1:465\n273#1:467\n273#1:468,2\n273#1:470,2\n273#1:472\n293#1:473\n293#1:475\n312#1:476\n312#1:478\n321#1:479\n321#1:481\n323#1:482\n323#1:484\n186#1:430\n202#1:440\n214#1:448\n226#1:451\n249#1:456\n273#1:466\n293#1:474\n312#1:477\n321#1:480\n323#1:483\n337#1:485\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.Placeable$PlacementScope */
    /* loaded from: classes2.dex */
    public static abstract class PlacementScope {
        public static final int $stable = 0;
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public static LayoutDirection f30151a = LayoutDirection.Ltr;

        /* renamed from: b */
        public static int f30152b;

        /* renamed from: c */
        public static LayoutCoordinates f30153c;

        /* renamed from: d */
        public static LayoutNodeLayoutDelegate f30154d;

        @Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0019\b\u0004\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "<init>", "()V", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "lookaheadCapablePlaceable", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "executeWithRtlMirroringValues", "(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/node/LookaheadCapablePlaceable;Lkotlin/jvm/functions/Function1;)V", Action.SCOPE_ATTRIBUTE, "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)Z", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "I", "getParentWidth", "()I", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "_coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.layout.Placeable$PlacementScope$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final /* synthetic */ boolean access$configureForPlacingForAlignment(Companion companion, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
                return companion.m59522a(lookaheadCapablePlaceable);
            }

            public static final /* synthetic */ LayoutDirection access$getParentLayoutDirection(Companion companion) {
                return companion.getParentLayoutDirection();
            }

            public static final /* synthetic */ int access$getParentWidth(Companion companion) {
                return companion.getParentWidth();
            }

            /* renamed from: a */
            public final boolean m59522a(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
                if (lookaheadCapablePlaceable == null) {
                    PlacementScope.f30153c = null;
                    PlacementScope.f30154d = null;
                    return false;
                }
                boolean isPlacingForAlignment$ui_release = lookaheadCapablePlaceable.isPlacingForAlignment$ui_release();
                LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
                if (parent != null && parent.isPlacingForAlignment$ui_release()) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
                }
                PlacementScope.f30154d = lookaheadCapablePlaceable.getLayoutNode().getLayoutDelegate$ui_release();
                if (lookaheadCapablePlaceable.isPlacingForAlignment$ui_release() || lookaheadCapablePlaceable.isShallowPlacing$ui_release()) {
                    PlacementScope.f30153c = null;
                } else {
                    PlacementScope.f30153c = lookaheadCapablePlaceable.getCoordinates();
                }
                return isPlacingForAlignment$ui_release;
            }

            public final void executeWithRtlMirroringValues(int i, @NotNull LayoutDirection parentLayoutDirection, @Nullable LookaheadCapablePlaceable lookaheadCapablePlaceable, @NotNull Function1<? super PlacementScope, Unit> block) {
                Intrinsics.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(block, "block");
                LayoutCoordinates layoutCoordinates = PlacementScope.f30153c;
                Companion companion = PlacementScope.Companion;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.f30154d;
                PlacementScope.f30152b = i;
                PlacementScope.f30151a = parentLayoutDirection;
                boolean m59522a = m59522a(lookaheadCapablePlaceable);
                block.invoke(this);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(m59522a);
                }
                PlacementScope.f30152b = parentWidth;
                PlacementScope.f30151a = parentLayoutDirection2;
                PlacementScope.f30153c = layoutCoordinates;
                PlacementScope.f30154d = layoutNodeLayoutDelegate;
            }

            @Override // androidx.compose.p003ui.layout.Placeable.PlacementScope
            @Nullable
            public LayoutCoordinates getCoordinates() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
                if (PlacementScope.f30153c == null && (layoutNodeLayoutDelegate = PlacementScope.f30154d) != null) {
                    layoutNodeLayoutDelegate.onCoordinatesUsed();
                }
                return PlacementScope.f30153c;
            }

            @Override // androidx.compose.p003ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.f30151a;
            }

            @Override // androidx.compose.p003ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.f30152b;
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ LayoutNodeLayoutDelegate access$getLayoutDelegate$cp() {
            return f30154d;
        }

        public static final /* synthetic */ LayoutCoordinates access$get_coordinates$cp() {
            return f30153c;
        }

        public static final /* synthetic */ void access$setLayoutDelegate$cp(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
            f30154d = layoutNodeLayoutDelegate;
        }

        public static final /* synthetic */ void access$setParentLayoutDirection$cp(LayoutDirection layoutDirection) {
            f30151a = layoutDirection;
        }

        public static final /* synthetic */ void access$setParentWidth$cp(int i) {
            f30152b = i;
        }

        public static final /* synthetic */ void access$set_coordinates$cp(LayoutCoordinates layoutCoordinates) {
            f30153c = layoutCoordinates;
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.place(placeable, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: place-70tqf50$default */
        public static /* synthetic */ void m72850place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m72854place70tqf50(placeable, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.placeRelative(placeable, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: placeRelative-70tqf50$default */
        public static /* synthetic */ void m72851placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m72857placeRelative70tqf50(placeable, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            float f2;
            Function1 function12;
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                Function1 function13 = function1;
                if ((i3 & 8) != 0) {
                    function12 = PlaceableKt.f30155a;
                    function13 = function12;
                }
                placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m72852placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            float f2;
            Function1 function12;
            if (obj == null) {
                if ((i & 2) != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                Function1 function13 = function1;
                if ((i & 4) != 0) {
                    function12 = PlaceableKt.f30155a;
                    function13 = function12;
                }
                placementScope.m72858placeRelativeWithLayeraW9wM(placeable, j, f2, function13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            float f2;
            Function1 function12;
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                Function1 function13 = function1;
                if ((i3 & 8) != 0) {
                    function12 = PlaceableKt.f30155a;
                    function13 = function12;
                }
                placementScope.placeWithLayer(placeable, i, i2, f2, function13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: placeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m72853placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            float f2;
            Function1 function12;
            if (obj == null) {
                if ((i & 2) != 0) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                Function1 function13 = function1;
                if ((i & 4) != 0) {
                    function12 = PlaceableKt.f30155a;
                    function13 = function12;
                }
                placementScope.m72859placeWithLayeraW9wM(placeable, j, f2, function13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long j = placeable.f30150e;
            placeable.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j)), f, null);
        }

        /* renamed from: place-70tqf50 */
        public final void m72854place70tqf50(@NotNull Placeable place, long j, float f) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long j2 = place.f30150e;
            place.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(j2)), f, null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release */
        public final void m72855placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeApparentToRealOffset, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long j2 = placeApparentToRealOffset.f30150e;
            placeApparentToRealOffset.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(j2)), f, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release */
        public final void m72856placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeAutoMirrored, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeAutoMirrored, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeAutoMirrored.f30150e;
                placeAutoMirrored.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(j2)), f, function1);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeAutoMirrored.getWidth()) - IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(j));
            long j3 = placeAutoMirrored.f30150e;
            placeAutoMirrored.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j3), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j3)), f, function1);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.f30150e;
                placeable.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j)), f, null);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m73776getXimpl(IntOffset), IntOffset.m73777getYimpl(IntOffset));
            long j2 = placeable.f30150e;
            placeable.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset2) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(IntOffset2) + IntOffset.m73777getYimpl(j2)), f, null);
        }

        /* renamed from: placeRelative-70tqf50 */
        public final void m72857placeRelative70tqf50(@NotNull Placeable placeRelative, long j, float f) {
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeRelative.f30150e;
                placeRelative.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(j2)), f, null);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelative.getWidth()) - IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(j));
            long j3 = placeRelative.f30150e;
            placeRelative.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j3), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j3)), f, null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.f30150e;
                placeable.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j)), f, layerBlock);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m73776getXimpl(IntOffset), IntOffset.m73777getYimpl(IntOffset));
            long j2 = placeable.f30150e;
            placeable.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset2) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(IntOffset2) + IntOffset.m73777getYimpl(j2)), f, layerBlock);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM */
        public final void m72858placeRelativeWithLayeraW9wM(@NotNull Placeable placeRelativeWithLayer, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeRelativeWithLayer.f30150e;
                placeRelativeWithLayer.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(j2)), f, layerBlock);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelativeWithLayer.getWidth()) - IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(j));
            long j3 = placeRelativeWithLayer.f30150e;
            placeRelativeWithLayer.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j3), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j3)), f, layerBlock);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long j = placeable.f30150e;
            placeable.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(IntOffset) + IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(IntOffset) + IntOffset.m73777getYimpl(j)), f, layerBlock);
        }

        /* renamed from: placeWithLayer-aW-9-wM */
        public final void m72859placeWithLayeraW9wM(@NotNull Placeable placeWithLayer, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long j2 = placeWithLayer.f30150e;
            placeWithLayer.mo69179placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(j) + IntOffset.m73776getXimpl(j2), IntOffset.m73777getYimpl(j) + IntOffset.m73777getYimpl(j2)), f, layerBlock);
        }
    }

    /* renamed from: a */
    public final void m59523a() {
        this.f30146a = AbstractC11719c.coerceIn(IntSize.m73818getWidthimpl(this.f30148c), Constraints.m73628getMinWidthimpl(this.f30149d), Constraints.m73626getMaxWidthimpl(this.f30149d));
        this.f30147b = AbstractC11719c.coerceIn(IntSize.m73817getHeightimpl(this.f30148c), Constraints.m73627getMinHeightimpl(this.f30149d), Constraints.m73625getMaxHeightimpl(this.f30149d));
        this.f30150e = IntOffsetKt.IntOffset((this.f30146a - IntSize.m73818getWidthimpl(this.f30148c)) / 2, (this.f30147b - IntSize.m73817getHeightimpl(this.f30148c)) / 2);
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac */
    public final long m72845getApparentToRealOffsetnOccac() {
        return this.f30150e;
    }

    public final int getHeight() {
        return this.f30147b;
    }

    @Override // androidx.compose.p003ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m73817getHeightimpl(this.f30148c);
    }

    /* renamed from: getMeasuredSize-YbymL2g */
    public final long m72846getMeasuredSizeYbymL2g() {
        return this.f30148c;
    }

    @Override // androidx.compose.p003ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m73818getWidthimpl(this.f30148c);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk */
    public final long m72847getMeasurementConstraintsmsEJaDk() {
        return this.f30149d;
    }

    @Override // androidx.compose.p003ui.layout.Measured, androidx.compose.p003ui.layout.IntrinsicMeasurable
    public /* synthetic */ Object getParentData() {
        return AbstractC22516ur0.m1179a(this);
    }

    public final int getWidth() {
        return this.f30146a;
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo69179placeAtf8xVGno(long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1);

    /* renamed from: setMeasuredSize-ozmzZPI */
    public final void m72848setMeasuredSizeozmzZPI(long j) {
        if (!IntSize.m73816equalsimpl0(this.f30148c, j)) {
            this.f30148c = j;
            m59523a();
        }
    }

    /* renamed from: setMeasurementConstraints-BRTryo0 */
    public final void m72849setMeasurementConstraintsBRTryo0(long j) {
        if (!Constraints.m73620equalsimpl0(this.f30149d, j)) {
            this.f30149d = j;
            m59523a();
        }
    }
}
