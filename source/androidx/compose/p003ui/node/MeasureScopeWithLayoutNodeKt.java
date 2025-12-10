package androidx.compose.p003ui.node;

import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.node.LayoutNode;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", Action.SCOPE_ATTRIBUTE, "", "Landroidx/compose/ui/layout/Measurable;", "getChildrenOfVirtualChildren", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNode;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/node/LayoutNode;)Z", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
/* renamed from: androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt */
/* loaded from: classes2.dex */
public final class MeasureScopeWithLayoutNodeKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m59440a(LayoutNode layoutNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    return m59440a(parent$ui_release);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    @NotNull
    public static final List<List<Measurable>> getChildrenOfVirtualChildren(@NotNull IntrinsicMeasureScope scope) {
        List<Measurable> childMeasurables$ui_release;
        Intrinsics.checkNotNullParameter(scope, "scope");
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) scope).getLayoutNode();
        boolean m59440a = m59440a(layoutNode);
        List<LayoutNode> foldedChildren$ui_release = layoutNode.getFoldedChildren$ui_release();
        ArrayList arrayList = new ArrayList(foldedChildren$ui_release.size());
        int size = foldedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = foldedChildren$ui_release.get(i);
            if (m59440a) {
                childMeasurables$ui_release = layoutNode2.getChildLookaheadMeasurables$ui_release();
            } else {
                childMeasurables$ui_release = layoutNode2.getChildMeasurables$ui_release();
            }
            arrayList.add(childMeasurables$ui_release);
        }
        return arrayList;
    }
}
