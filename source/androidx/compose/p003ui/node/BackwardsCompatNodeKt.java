package androidx.compose.p003ui.node;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocal;
import androidx.compose.p003ui.modifier.ModifierLocalReadScope;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/node/BackwardsCompatNode;)Z", "androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "onDrawCacheReadsChanged", OperatorName.CURVE_TO, "updateModifierLocalConsumer", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNodeKt */
/* loaded from: classes2.dex */
public final class BackwardsCompatNodeKt {

    /* renamed from: a */
    public static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 f30199a = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.p003ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(@NotNull ModifierLocal<T> modifierLocal) {
            Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };

    /* renamed from: b */
    public static final Function1 f30200b = BackwardsCompatNodeKt$onDrawCacheReadsChanged$1.INSTANCE;

    /* renamed from: c */
    public static final Function1 f30201c = BackwardsCompatNodeKt$updateModifierLocalConsumer$1.INSTANCE;

    /* renamed from: a */
    public static final boolean m59511a(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui_release().getTail$ui_release();
        Intrinsics.checkNotNull(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
