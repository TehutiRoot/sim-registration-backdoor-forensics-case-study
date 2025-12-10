package androidx.compose.p003ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p003ui.semantics.AccessibilityAction;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsActions;
import androidx.compose.p003ui.semantics.SemanticsConfiguration;
import androidx.compose.p003ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p003ui.semantics.SemanticsNode;
import androidx.compose.p003ui.semantics.SemanticsOwner;
import androidx.compose.p003ui.semantics.SemanticsProperties;
import androidx.compose.p003ui.semantics.SemanticsPropertyKey;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000v\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u0006*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0006*\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0010\u001a!\u0010\u001a\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010%\u001a\u0004\u0018\u00010#*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u001eH\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u0004\u0018\u00010(*\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u001d\u0010-\u001a\u0004\u0018\u00010,*\u00020+2\u0006\u0010$\u001a\u00020\u001eH\u0000¢\u0006\u0004\b-\u0010.\"\u001e\u00102\u001a\u00020\u0006*\u00020\u000e8BX\u0082\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0010\"\u0018\u00104\u001a\u00020\u0006*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0010\"\u0018\u00106\u001a\u00020\u0006*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0010\"\u0018\u00108\u001a\u00020\u0006*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0010\"\u001a\u0010;\u001a\u0004\u0018\u00010\u0006*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u0018\u0010>\u001a\u00020\u0000*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u001a\u0010A\u001a\u0004\u0018\u00010(*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, m28850d2 = {"", "that", "Landroidx/compose/ui/platform/OpenEndRange;", "rangeUntil", "(FF)Landroidx/compose/ui/platform/OpenEndRange;", "it", "", OperatorName.ENDPATH, "(Landroidx/compose/ui/platform/OpenEndRange;Landroidx/compose/ui/platform/OpenEndRange;)Z", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "selector", "d", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsNode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "o", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;)Z", OperatorName.CLOSE_PATH, OperatorName.CURVE_TO, "Landroidx/compose/ui/semantics/AccessibilityAction;", "", "other", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/semantics/AccessibilityAction;Ljava/lang/Object;)Z", "Landroidx/compose/ui/semantics/SemanticsOwner;", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getAllUncoveredSemanticsNodesToMap", "(Landroidx/compose/ui/semantics/SemanticsOwner;)Ljava/util/Map;", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "id", "findById", "(Ljava/util/List;I)Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/semantics/Role;", "", "p", "(I)Ljava/lang/String;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "semanticsIdToView", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;", OperatorName.MOVE_TO, "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "isVisible", "i", "isPassword", OperatorName.NON_STROKING_CMYK, "isTextField", OperatorName.SET_LINE_JOINSTYLE, "isRtl", OperatorName.LINE_TO, "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/Boolean;", "isTraversalGroup", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/semantics/SemanticsNode;)F", "getTraversalIndex", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "infoContentDescriptionOrNull", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3490:1\n288#2,2:3491\n1#3:3493\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n3489#1:3491,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* renamed from: a */
    public static final boolean m59260a(AccessibilityAction accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() == null && accessibilityAction2.getAction() != null) {
            return false;
        }
        if (accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m59259b(SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m59258c(SemanticsNode semanticsNode) {
        boolean z;
        if (m59250k(semanticsNode) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode m59257d = m59257d(semanticsNode.getLayoutNode$ui_release(), C3556x93be146e.INSTANCE);
        if (m59257d != null) {
            SemanticsConfiguration collapsedSemantics$ui_release = m59257d.getCollapsedSemantics$ui_release();
            if (collapsedSemantics$ui_release != null) {
                z = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE);
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final LayoutNode m59257d(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) function1.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final void m59256e(Region region, SemanticsNode semanticsNode, Map map, SemanticsNode semanticsNode2) {
        boolean z;
        int id2;
        Rect rect;
        LayoutInfo layoutInfo;
        if (semanticsNode2.getLayoutNode$ui_release().isPlaced() && semanticsNode2.getLayoutNode$ui_release().isAttached()) {
            z = false;
        } else {
            z = true;
        }
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (z && !semanticsNode2.isFake$ui_release()) {
                return;
            }
            Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
            android.graphics.Rect rect2 = new android.graphics.Rect(AbstractC21140mr0.roundToInt(touchBoundsInRoot.getLeft()), AbstractC21140mr0.roundToInt(touchBoundsInRoot.getTop()), AbstractC21140mr0.roundToInt(touchBoundsInRoot.getRight()), AbstractC21140mr0.roundToInt(touchBoundsInRoot.getBottom()));
            Region region2 = new Region();
            region2.set(rect2);
            if (semanticsNode2.getId() == semanticsNode.getId()) {
                id2 = -1;
            } else {
                id2 = semanticsNode2.getId();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(id2);
                android.graphics.Rect bounds = region2.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                map.put(valueOf, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    m59256e(region, semanticsNode, map, replacedChildren$ui_release.get(size));
                }
                region.op(rect2, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.isFake$ui_release()) {
                SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.isPlaced()) {
                    rect = parent.getBoundsInRoot();
                } else {
                    rect = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
                }
                map.put(Integer.valueOf(id2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(AbstractC21140mr0.roundToInt(rect.getLeft()), AbstractC21140mr0.roundToInt(rect.getTop()), AbstractC21140mr0.roundToInt(rect.getRight()), AbstractC21140mr0.roundToInt(rect.getBottom()))));
            } else if (id2 == -1) {
                Integer valueOf2 = Integer.valueOf(id2);
                android.graphics.Rect bounds2 = region2.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                map.put(valueOf2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds2));
            }
        }
    }

    /* renamed from: f */
    public static final float m59255f(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (config.contains(semanticsProperties.getTraversalIndex())) {
            return ((Number) semanticsNode.getConfig().get(semanticsProperties.getTraversalIndex())).floatValue();
        }
        return 0.0f;
    }

    @Nullable
    public static final ScrollObservationScope findById(@NotNull List<ScrollObservationScope> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final String m59254g(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            return (String) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
        }
        return null;
    }

    @NotNull
    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(@NotNull SemanticsOwner semanticsOwner) {
        Intrinsics.checkNotNullParameter(semanticsOwner, "<this>");
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Region region = new Region();
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            region.set(new android.graphics.Rect(AbstractC21140mr0.roundToInt(boundsInRoot.getLeft()), AbstractC21140mr0.roundToInt(boundsInRoot.getTop()), AbstractC21140mr0.roundToInt(boundsInRoot.getRight()), AbstractC21140mr0.roundToInt(boundsInRoot.getBottom())));
            m59256e(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    public static final boolean m59253h(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    /* renamed from: i */
    public static final boolean m59252i(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    /* renamed from: j */
    public static final boolean m59251j(SemanticsNode semanticsNode) {
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m59250k(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText());
    }

    /* renamed from: l */
    public static final Boolean m59249l(SemanticsNode semanticsNode) {
        return (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsTraversalGroup());
    }

    /* renamed from: m */
    public static final boolean m59248m(SemanticsNode semanticsNode) {
        if (!semanticsNode.isTransparent$ui_release() && !semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final boolean m59247n(OpenEndRange openEndRange, OpenEndRange openEndRange2) {
        if (!openEndRange.isEmpty() && !openEndRange2.isEmpty() && Math.max(((Number) openEndRange.getStart()).floatValue(), ((Number) openEndRange2.getStart()).floatValue()) < Math.min(((Number) openEndRange.getEndExclusive()).floatValue(), ((Number) openEndRange2.getEndExclusive()).floatValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static final boolean m59246o(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNodeCopy.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static final String m59245p(int i) {
        Role.Companion companion = Role.Companion;
        if (Role.m73065equalsimpl0(i, companion.m73069getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m73065equalsimpl0(i, companion.m73070getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m73065equalsimpl0(i, companion.m73073getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m73065equalsimpl0(i, companion.m73072getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m73065equalsimpl0(i, companion.m73071getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    @NotNull
    public static final OpenEndRange<Float> rangeUntil(float f, float f2) {
        return new C18749Xf1(f, f2);
    }

    @Nullable
    public static final View semanticsIdToView(@NotNull AndroidViewsHandler androidViewsHandler, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(androidViewsHandler, "<this>");
        Set<Map.Entry<LayoutNode, AndroidViewHolder>> entrySet = androidViewsHandler.getLayoutNodeToHolder().entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "layoutNodeToHolder.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LayoutNode) ((Map.Entry) obj).getKey()).getSemanticsId() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (AndroidViewHolder) entry.getValue();
    }
}
