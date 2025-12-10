package androidx.compose.p003ui.semantics;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.node.DelegatableNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.Owner;
import androidx.compose.p003ui.node.RootForTest;
import androidx.compose.p003ui.node.SemanticsModifierNodeKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r*\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010$\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0002\b\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0015\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010,J\u0011\u00100\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00103\u001a\u00020\u0000H\u0000¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010?R\"\u0010D\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00107\u001a\u0004\bA\u00109\"\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010ER\u0017\u0010K\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00109R\u0014\u0010N\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u00109R\u0011\u0010R\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010V\u001a\u0004\u0018\u00010S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010^\u001a\u00020[8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010`\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\b_\u0010YR\u001a\u0010c\u001a\u00020a8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bb\u0010]R\u0011\u0010e\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bd\u0010YR\u001a\u0010g\u001a\u00020a8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bf\u0010]R\u0014\u0010i\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u00109R\u0011\u0010k\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bj\u0010?R\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010mR\u0011\u0010q\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bq\u00109R\u0013\u0010s\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\br\u00102\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006t"}, m28850d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/Modifier$Node;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "mergedConfig", "", OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "", CollectionUtils.LIST_TYPE, OperatorName.CURVE_TO, "(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;)V", "includeReplacedSemantics", "includeFakeNodes", "", OperatorName.FILL_NON_ZERO, "(ZZ)Ljava/util/List;", "d", "(Ljava/util/List;)Ljava/util/List;", "unmergedChildren", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "properties", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "unmergedChildren$ui_release", "(Z)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds", "copyWithMergingEnabled$ui_release", "()Landroidx/compose/ui/semantics/SemanticsNode;", "copyWithMergingEnabled", "Landroidx/compose/ui/Modifier$Node;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "e", "isFake$ui_release", "setFake$ui_release", "(Z)V", "isFake", "Landroidx/compose/ui/semantics/SemanticsNode;", "fakeNodeParent", OperatorName.NON_STROKING_GRAY, "I", "getId", "()I", "id", "isMergingSemanticsOfDescendants", "isUnmergedLeafNode$ui_release", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "root", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "isTransparent$ui_release", "isTransparent", "getConfig", "config", "getChildren", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "isRoot", "getParent", "parent", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,457:1\n1#2:458\n33#3,6:459\n33#3,6:477\n460#4,7:465\n467#4,4:473\n76#5:472\n76#5:483\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n215#1:459,6\n343#1:477,6\n250#1:465,7\n250#1:473,4\n251#1:472\n364#1:483\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsNode */
/* loaded from: classes2.dex */
public final class SemanticsNode {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Modifier.Node f30913a;

    /* renamed from: b */
    public final boolean f30914b;

    /* renamed from: c */
    public final LayoutNode f30915c;

    /* renamed from: d */
    public final SemanticsConfiguration f30916d;

    /* renamed from: e */
    public boolean f30917e;

    /* renamed from: f */
    public SemanticsNode f30918f;

    /* renamed from: g */
    public final int f30919g;

    public SemanticsNode(@NotNull Modifier.Node outerSemanticsNode, boolean z, @NotNull LayoutNode layoutNode, @NotNull SemanticsConfiguration unmergedConfig) {
        Intrinsics.checkNotNullParameter(outerSemanticsNode, "outerSemanticsNode");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(unmergedConfig, "unmergedConfig");
        this.f30913a = outerSemanticsNode;
        this.f30914b = z;
        this.f30915c = layoutNode;
        this.f30916d = unmergedConfig;
        this.f30919g = layoutNode.getSemanticsId();
    }

    /* renamed from: e */
    public static /* synthetic */ List m59140e(SemanticsNode semanticsNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.m59141d(list);
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z);
    }

    /* renamed from: a */
    public final void m59144a(List list) {
        Role m59135b;
        String str;
        m59135b = SemanticsNodeKt.m59135b(this);
        if (m59135b != null && this.f30916d.isMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m59143b(m59135b, new SemanticsNode$emitFakeNodes$fakeNode$1(m59135b)));
        }
        SemanticsConfiguration semanticsConfiguration = this.f30916d;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.f30916d.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.f30916d, semanticsProperties.getContentDescription());
            if (list2 != null) {
                str = (String) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list2);
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m59143b(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: b */
    public final SemanticsNode m59143b(Role role, Function1 function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        function1.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new LayoutNode(true, role != null ? SemanticsNodeKt.m59134c(this) : SemanticsNodeKt.m59136a(this)), semanticsConfiguration);
        semanticsNode.f30917e = true;
        semanticsNode.f30918f = this;
        return semanticsNode;
    }

    /* renamed from: c */
    public final void m59142c(LayoutNode layoutNode, List list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            LayoutNode[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                if (layoutNode2.getNodes$ui_release().m72934hasH91voCI$ui_release(NodeKind.m72961constructorimpl(8))) {
                    list.add(SemanticsNodeKt.SemanticsNode(layoutNode2, this.f30914b));
                } else {
                    m59142c(layoutNode2, list);
                }
                i++;
            } while (i < size);
        }
    }

    @NotNull
    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.f30913a, true, this.f30915c, this.f30916d);
    }

    /* renamed from: d */
    public final List m59141d(List list) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (semanticsNode.m59138g()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.f30916d.isClearingSemantics()) {
                semanticsNode.m59141d(list);
            }
        }
        return list;
    }

    /* renamed from: f */
    public final List m59139f(boolean z, boolean z2) {
        if (!z && this.f30916d.isClearingSemantics()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (m59138g()) {
            return m59140e(this, null, 1, null);
        }
        return unmergedChildren$ui_release(z2);
    }

    @Nullable
    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.f30917e) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        DelegatableNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.f30915c);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.f30913a;
        }
        return DelegatableNodeKt.m72894requireCoordinator64DMado(outerMergingSemantics, NodeKind.m72961constructorimpl(8));
    }

    /* renamed from: g */
    public final boolean m59138g() {
        if (this.f30914b && this.f30916d.isMergingSemanticsOfDescendants()) {
            return true;
        }
        return false;
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        Rect boundsInRoot;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInRoot = LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        Rect boundsInWindow;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInWindow = LayoutCoordinatesKt.boundsInWindow(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInWindow;
            }
        }
        return Rect.Companion.getZero();
    }

    @NotNull
    public final List<SemanticsNode> getChildren() {
        return m59139f(!this.f30914b, false);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        if (m59138g()) {
            SemanticsConfiguration copy = this.f30916d.copy();
            m59137h(copy);
            return copy;
        }
        return this.f30916d;
    }

    public final int getId() {
        return this.f30919g;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.f30915c;
    }

    @NotNull
    public final LayoutNode getLayoutNode$ui_release() {
        return this.f30915c;
    }

    public final boolean getMergingEnabled() {
        return this.f30914b;
    }

    @NotNull
    public final Modifier.Node getOuterSemanticsNode$ui_release() {
        return this.f30913a;
    }

    @Nullable
    public final SemanticsNode getParent() {
        LayoutNode layoutNode;
        SemanticsNode semanticsNode = this.f30918f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.f30914b) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.f30915c, SemanticsNode$parent$1.INSTANCE);
        } else {
            layoutNode = null;
        }
        if (layoutNode == null) {
            layoutNode = SemanticsNodeKt.findClosestParentNode(this.f30915c, SemanticsNode$parent$2.INSTANCE);
        }
        if (layoutNode == null) {
            return null;
        }
        return SemanticsNodeKt.SemanticsNode(layoutNode, this.f30914b);
    }

    /* renamed from: getPositionInRoot-F1C5BW0  reason: not valid java name */
    public final long m73076getPositionInRootF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }

    /* renamed from: getPositionInWindow-F1C5BW0  reason: not valid java name */
    public final long m73077getPositionInWindowF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }

    @NotNull
    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return m59139f(false, true);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner$ui_release = this.f30915c.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m73078getSizeYbymL2g() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.mo72816getSizeYbymL2g();
        }
        return IntSize.Companion.m73823getZeroYbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        DelegatableNode delegatableNode;
        if (this.f30916d.isMergingSemanticsOfDescendants()) {
            delegatableNode = SemanticsNodeKt.getOuterMergingSemantics(this.f30915c);
            if (delegatableNode == null) {
                delegatableNode = this.f30913a;
            }
        } else {
            delegatableNode = this.f30913a;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(delegatableNode.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.f30916d));
    }

    @NotNull
    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.f30916d;
    }

    /* renamed from: h */
    public final void m59137h(SemanticsConfiguration semanticsConfiguration) {
        if (!this.f30916d.isClearingSemantics()) {
            List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
            int size = unmergedChildren$ui_release$default.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
                if (!semanticsNode.m59138g()) {
                    semanticsConfiguration.mergeChild$ui_release(semanticsNode.f30916d);
                    semanticsNode.m59137h(semanticsConfiguration);
                }
            }
        }
    }

    public final boolean isFake$ui_release() {
        return this.f30917e;
    }

    public final boolean isRoot() {
        if (getParent() == null) {
            return true;
        }
        return false;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        if (!this.f30917e && getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.f30915c, SemanticsNode$isUnmergedLeafNode$1.INSTANCE) == null) {
            return true;
        }
        return false;
    }

    public final void setFake$ui_release(boolean z) {
        this.f30917e = z;
    }

    @NotNull
    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z) {
        if (this.f30917e) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        m59142c(this.f30915c, arrayList);
        if (z) {
            m59144a(arrayList);
        }
        return arrayList;
    }
}
