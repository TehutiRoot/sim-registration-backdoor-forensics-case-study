package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultBringIntoViewParent", "(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/Rect;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BringIntoViewResponder_androidKt {

    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt$a */
    /* loaded from: classes.dex */
    public static final class C2971a implements BringIntoViewParent {

        /* renamed from: a */
        public final /* synthetic */ CompositionLocalConsumerModifierNode f13942a;

        public C2971a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
            this.f13942a = compositionLocalConsumerModifierNode;
        }

        @Override // androidx.compose.foundation.relocation.BringIntoViewParent
        public final Object bringChildIntoView(LayoutCoordinates layoutCoordinates, Function0 function0, Continuation continuation) {
            Rect rect;
            View view = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.f13942a, AndroidCompositionLocals_androidKt.getLocalView());
            long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            Rect rect2 = (Rect) function0.invoke();
            if (rect2 != null) {
                rect = rect2.m71539translatek4lQ0M(positionInRoot);
            } else {
                rect = null;
            }
            if (rect != null) {
                view.requestRectangleOnScreen(BringIntoViewResponder_androidKt.m61084a(rect), false);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final android.graphics.Rect m61084a(Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    @NotNull
    public static final BringIntoViewParent defaultBringIntoViewParent(@NotNull CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        Intrinsics.checkNotNullParameter(compositionLocalConsumerModifierNode, "<this>");
        return new C2971a(compositionLocalConsumerModifierNode);
    }
}
