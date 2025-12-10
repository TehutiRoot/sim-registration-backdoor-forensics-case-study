package androidx.compose.p003ui.platform;

import android.graphics.Rect;
import androidx.compose.p003ui.semantics.SemanticsNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Rect;", "getAdjustedBounds", "()Landroid/graphics/Rect;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds */
/* loaded from: classes2.dex */
public final class SemanticsNodeWithAdjustedBounds {

    /* renamed from: a */
    public final SemanticsNode f30765a;

    /* renamed from: b */
    public final Rect f30766b;

    public SemanticsNodeWithAdjustedBounds(@NotNull SemanticsNode semanticsNode, @NotNull Rect adjustedBounds) {
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        Intrinsics.checkNotNullParameter(adjustedBounds, "adjustedBounds");
        this.f30765a = semanticsNode;
        this.f30766b = adjustedBounds;
    }

    @NotNull
    public final Rect getAdjustedBounds() {
        return this.f30766b;
    }

    @NotNull
    public final SemanticsNode getSemanticsNode() {
        return this.f30765a;
    }
}
