package androidx.compose.p003ui.node;

import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.MeasureAndLayoutDelegate;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m29142d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "", "assertConsistent", "()V", "node", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/node/LayoutNode;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "e", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", OperatorName.CURVE_TO, "()Ljava/lang/String;", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "Ljava/util/List;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,142:1\n33#2,6:143\n116#2,2:149\n33#2,6:151\n118#2:157\n116#2,2:158\n33#2,6:160\n118#2:166\n33#2,6:167\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:143,6\n59#1:149,2\n59#1:151,6\n59#1:157\n83#1:158,2\n83#1:160,6\n83#1:166\n135#1:167,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutTreeConsistencyChecker */
/* loaded from: classes2.dex */
public final class LayoutTreeConsistencyChecker {

    /* renamed from: a */
    public final LayoutNode f30428a;

    /* renamed from: b */
    public final DepthSortedSetsForDifferentPasses f30429b;

    /* renamed from: c */
    public final List f30430c;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode root, @NotNull DepthSortedSetsForDifferentPasses relayoutNodes, @NotNull List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.f30428a = root;
        this.f30429b = relayoutNodes;
        this.f30430c = postponedMeasureRequests;
    }

    /* renamed from: d */
    public static final void m59403d(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        String m59402e = layoutTreeConsistencyChecker.m59402e(layoutNode);
        if (m59402e.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            }
            sb.append(m59402e);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            m59403d(layoutTreeConsistencyChecker, sb, children$ui_release.get(i3), i);
        }
    }

    /* renamed from: a */
    public final boolean m59406a(LayoutNode layoutNode) {
        LayoutNode.LayoutState layoutState;
        Object obj;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        Object obj2 = null;
        if (parent$ui_release != null) {
            layoutState = parent$ui_release.getLayoutState$ui_release();
        } else {
            layoutState = null;
        }
        if (layoutNode.isPlaced() || (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.isPlaced())) {
            if (layoutNode.getMeasurePending$ui_release()) {
                List list = this.f30430c;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = list.get(i);
                        MeasureAndLayoutDelegate.PostponedRequest postponedRequest = (MeasureAndLayoutDelegate.PostponedRequest) obj;
                        if (Intrinsics.areEqual(postponedRequest.getNode(), layoutNode) && !postponedRequest.isLookahead()) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    return true;
                }
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                if (!this.f30429b.contains(layoutNode) && ((parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState != LayoutNode.LayoutState.Measuring))) {
                    return false;
                }
                return true;
            } else if (layoutNode.getLayoutPending$ui_release()) {
                if (!this.f30429b.contains(layoutNode) && parent$ui_release != null && !parent$ui_release.getMeasurePending$ui_release() && !parent$ui_release.getLayoutPending$ui_release() && layoutState != LayoutNode.LayoutState.Measuring && layoutState != LayoutNode.LayoutState.LayingOut) {
                    return false;
                }
                return true;
            }
        }
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                List list2 = this.f30430c;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj3 = list2.get(i2);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = (MeasureAndLayoutDelegate.PostponedRequest) obj3;
                    if (Intrinsics.areEqual(postponedRequest2.getNode(), layoutNode) && postponedRequest2.isLookahead()) {
                        obj2 = obj3;
                        break;
                    }
                    i2++;
                }
                if (obj2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                if (!this.f30429b.contains(layoutNode, true) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release() || !Intrinsics.areEqual(layoutNode.getLookaheadRoot$ui_release(), layoutNode)))) {
                    return false;
                }
                return true;
            } else if (layoutNode.getLookaheadLayoutPending$ui_release() && !this.f30429b.contains(layoutNode, true) && parent$ui_release != null && !parent$ui_release.getLookaheadMeasurePending$ui_release() && !parent$ui_release.getLookaheadLayoutPending$ui_release() && layoutState != LayoutNode.LayoutState.LookaheadMeasuring && layoutState != LayoutNode.LayoutState.LookaheadLayingOut && (!parent$ui_release.getLayoutPending$ui_release() || !Intrinsics.areEqual(layoutNode.getLookaheadRoot$ui_release(), layoutNode))) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void assertConsistent() {
        if (!(!m59405b(this.f30428a))) {
            return;
        }
        System.out.println((Object) m59404c());
        throw new IllegalStateException("Inconsistency found!");
    }

    /* renamed from: b */
    public final boolean m59405b(LayoutNode layoutNode) {
        if (!m59406a(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            if (!m59405b(children$ui_release.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final String m59404c() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        m59403d(this, sb, this.f30428a, 0);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: e */
    public final String m59402e(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!m59406a(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }
}