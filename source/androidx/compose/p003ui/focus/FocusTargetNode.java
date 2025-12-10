package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.BeyondBoundsLayout;
import androidx.compose.p003ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p003ui.modifier.ModifierLocal;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.node.NodeChain;
import androidx.compose.p003ui.node.NodeKind;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001/B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR(\u0010*\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010\u0006\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0013\u0010.\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "onObservedReadsChanged", "onReset", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "()Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusRequester;", "block", "fetchCustomEnter-aToIllA$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomEnter", "fetchCustomExit-aToIllA$ui_release", "fetchCustomExit", "invalidateFocus$ui_release", "invalidateFocus", "scheduleInvalidationForFocusEvents$ui_release", "scheduleInvalidationForFocusEvents", "", OperatorName.ENDPATH, "Z", "isProcessingCustomExit", "o", "isProcessingCustomEnter", "Landroidx/compose/ui/focus/FocusStateImpl;", "p", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusState$annotations", "focusState", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,202:1\n92#2:203\n90#2:204\n94#2:276\n94#2:320\n90#2:321\n90#2:341\n94#2:343\n241#3,2:205\n58#3:207\n59#3,8:209\n243#3:217\n244#3,2:219\n383#3,12:221\n395#3,8:236\n403#3,9:247\n412#3,8:259\n247#3:267\n68#3,7:268\n248#3:275\n383#3,6:277\n393#3,2:284\n395#3,8:289\n403#3,9:300\n412#3,8:312\n50#3,9:323\n59#3,8:333\n383#3,6:344\n393#3,2:351\n395#3,8:356\n403#3,9:367\n412#3,8:379\n68#3,7:387\n1#4:208\n1#4:332\n261#5:218\n261#5:283\n261#5:342\n261#5:350\n234#6,3:233\n237#6,3:256\n234#6,3:286\n237#6,3:309\n234#6,3:353\n237#6,3:376\n1182#7:244\n1161#7,2:245\n1182#7:297\n1161#7,2:298\n1182#7:364\n1161#7,2:365\n47#8:322\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n85#1:203\n85#1:204\n167#1:276\n174#1:320\n174#1:321\n175#1:341\n178#1:343\n85#1:205,2\n85#1:207\n85#1:209,8\n85#1:217\n85#1:219,2\n85#1:221,12\n85#1:236,8\n85#1:247,9\n85#1:259,8\n85#1:267\n85#1:268,7\n85#1:275\n167#1:277,6\n167#1:284,2\n167#1:289,8\n167#1:300,9\n167#1:312,8\n174#1:323,9\n174#1:333,8\n178#1:344,6\n178#1:351,2\n178#1:356,8\n178#1:367,9\n178#1:379,8\n174#1:387,7\n85#1:208\n174#1:332\n85#1:218\n167#1:283\n175#1:342\n178#1:350\n85#1:233,3\n85#1:256,3\n167#1:286,3\n167#1:309,3\n178#1:353,3\n178#1:376,3\n85#1:244\n85#1:245,2\n167#1:297\n167#1:298,2\n178#1:364\n178#1:365,2\n174#1:322\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTargetNode */
/* loaded from: classes2.dex */
public final class FocusTargetNode extends Modifier.Node implements FocusTargetModifierNode, ObserverModifierNode, ModifierLocalModifierNode {

    /* renamed from: n */
    public boolean f28938n;

    /* renamed from: o */
    public boolean f28939o;

    /* renamed from: p */
    public FocusStateImpl f28940p = FocusStateImpl.Inactive;

    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\f\u0010\u000e\u001a\u00020\f*\u00020\u000fH\u0016¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement */
    /* loaded from: classes2.dex */
    public static final class FocusTargetElement extends ModifierNodeElement<FocusTargetNode> {
        @NotNull
        public static final FocusTargetElement INSTANCE = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        public void update(@NotNull FocusTargetNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // androidx.compose.p003ui.node.ModifierNodeElement
        @NotNull
        public FocusTargetNode create() {
            return new FocusTargetNode();
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTargetNode$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getFocusState$annotations() {
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release  reason: not valid java name */
    public final void m71457fetchCustomEnteraToIllA$ui_release(int i, @NotNull Function1<? super FocusRequester, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!this.f28939o) {
            this.f28939o = true;
            try {
                FocusRequester invoke = fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m71429boximpl(i));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    block.invoke(invoke);
                }
            } finally {
                InlineMarker.finallyStart(1);
                this.f28939o = false;
                InlineMarker.finallyEnd(1);
            }
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release  reason: not valid java name */
    public final void m71458fetchCustomExitaToIllA$ui_release(int i, @NotNull Function1<? super FocusRequester, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!this.f28938n) {
            this.f28938n = true;
            try {
                FocusRequester invoke = fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m71429boximpl(i));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    block.invoke(invoke);
                }
            } finally {
                InlineMarker.finallyStart(1);
                this.f28938n = false;
                InlineMarker.finallyEnd(1);
            }
        }
    }

    @NotNull
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int m72961constructorimpl = NodeKind.m72961constructorimpl(2048);
        int m72961constructorimpl2 = NodeKind.m72961constructorimpl(1024);
        Modifier.Node node = getNode();
        int i = m72961constructorimpl | m72961constructorimpl2;
        if (getNode().isAttached()) {
            Modifier.Node node2 = getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            loop0: while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i) != 0) {
                    while (node2 != null) {
                        if ((node2.getKindSet$ui_release() & i) != 0) {
                            if (node2 != node && (node2.getKindSet$ui_release() & m72961constructorimpl2) != 0) {
                                break loop0;
                            } else if ((node2.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                Modifier.Node node3 = node2;
                                MutableVector mutableVector = null;
                                while (node3 != null) {
                                    if (node3 instanceof FocusPropertiesModifierNode) {
                                        ((FocusPropertiesModifierNode) node3).applyFocusProperties(focusPropertiesImpl);
                                    } else if ((node3.getKindSet$ui_release() & m72961constructorimpl) != 0 && (node3 instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node3).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                            if ((delegate$ui_release.getKindSet$ui_release() & m72961constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node3 = delegate$ui_release;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node3 != null) {
                                                        mutableVector.add(node3);
                                                        node3 = null;
                                                    }
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    node3 = DelegatableNodeKt.m59509b(mutableVector);
                                }
                            }
                        }
                        node2 = node2.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    node2 = nodes$ui_release.getTail$ui_release();
                } else {
                    node2 = null;
                }
            }
            return focusPropertiesImpl;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    @Nullable
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout) getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode, androidx.compose.p003ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return AbstractC20630jt0.m29033a(this, modifierLocal);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return AbstractC20630jt0.m29032b(this);
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        int i = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ObserverModifierNodeKt.observeReads(this, new FocusTargetNode$invalidateFocus$1(objectRef, this));
            Object obj = objectRef.element;
            if (obj == null) {
                Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) obj;
            }
            if (!focusProperties.getCanFocus()) {
                DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            }
        }
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onReset() {
        int i = WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    scheduleInvalidationForFocusEvents$ui_release();
                    return;
                }
                return;
            }
            scheduleInvalidationForFocusEvents$ui_release();
            setFocusState(FocusStateImpl.Inactive);
            return;
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        AbstractC20630jt0.m29031c(this, modifierLocal, obj);
    }

    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes$ui_release;
        Modifier.Node node = getNode();
        int m72961constructorimpl = NodeKind.m72961constructorimpl(4096);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof FocusEventModifierNode) {
                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
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
        int m72961constructorimpl2 = NodeKind.m72961constructorimpl(4096) | NodeKind.m72961constructorimpl(1024);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m72961constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & m72961constructorimpl2) != 0 && (NodeKind.m72961constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) == 0 && parent$ui_release.isAttached()) {
                            int m72961constructorimpl3 = NodeKind.m72961constructorimpl(4096);
                            MutableVector mutableVector2 = null;
                            Modifier.Node node2 = parent$ui_release;
                            while (node2 != null) {
                                if (node2 instanceof FocusEventModifierNode) {
                                    FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node2);
                                } else if ((node2.getKindSet$ui_release() & m72961constructorimpl3) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & m72961constructorimpl3) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    mutableVector2.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector2.add(delegate$ui_release2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = DelegatableNodeKt.m59509b(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                } else {
                    parent$ui_release = null;
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
    }

    public void setFocusState(@NotNull FocusStateImpl focusStateImpl) {
        Intrinsics.checkNotNullParameter(focusStateImpl, "<set-?>");
        this.f28940p = focusStateImpl;
    }

    @Override // androidx.compose.p003ui.focus.FocusTargetModifierNode
    @NotNull
    public FocusStateImpl getFocusState() {
        return this.f28940p;
    }
}
