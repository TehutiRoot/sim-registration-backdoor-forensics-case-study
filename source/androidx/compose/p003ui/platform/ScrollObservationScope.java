package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.node.OwnerScope;
import androidx.compose.p003ui.semantics.ScrollAxisRange;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010)\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006+"}, m28850d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/ScrollAxisRange;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getSemanticsNodeId", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", OperatorName.CURVE_TO, "Ljava/lang/Float;", "getOldXValue", "()Ljava/lang/Float;", "setOldXValue", "(Ljava/lang/Float;)V", "d", "getOldYValue", "setOldYValue", "e", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "()Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/ScrollAxisRange;)V", OperatorName.FILL_NON_ZERO, "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "", "isValidOwnerScope", "()Z", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ScrollObservationScope */
/* loaded from: classes2.dex */
public final class ScrollObservationScope implements OwnerScope {

    /* renamed from: a */
    public final int f30759a;

    /* renamed from: b */
    public final List f30760b;

    /* renamed from: c */
    public Float f30761c;

    /* renamed from: d */
    public Float f30762d;

    /* renamed from: e */
    public ScrollAxisRange f30763e;

    /* renamed from: f */
    public ScrollAxisRange f30764f;

    public ScrollObservationScope(int i, @NotNull List<ScrollObservationScope> allScopes, @Nullable Float f, @Nullable Float f2, @Nullable ScrollAxisRange scrollAxisRange, @Nullable ScrollAxisRange scrollAxisRange2) {
        Intrinsics.checkNotNullParameter(allScopes, "allScopes");
        this.f30759a = i;
        this.f30760b = allScopes;
        this.f30761c = f;
        this.f30762d = f2;
        this.f30763e = scrollAxisRange;
        this.f30764f = scrollAxisRange2;
    }

    @NotNull
    public final List<ScrollObservationScope> getAllScopes() {
        return this.f30760b;
    }

    @Nullable
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.f30763e;
    }

    @Nullable
    public final Float getOldXValue() {
        return this.f30761c;
    }

    @Nullable
    public final Float getOldYValue() {
        return this.f30762d;
    }

    public final int getSemanticsNodeId() {
        return this.f30759a;
    }

    @Nullable
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.f30764f;
    }

    @Override // androidx.compose.p003ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.f30760b.contains(this);
    }

    public final void setHorizontalScrollAxisRange(@Nullable ScrollAxisRange scrollAxisRange) {
        this.f30763e = scrollAxisRange;
    }

    public final void setOldXValue(@Nullable Float f) {
        this.f30761c = f;
    }

    public final void setOldYValue(@Nullable Float f) {
        this.f30762d = f;
    }

    public final void setVerticalScrollAxisRange(@Nullable ScrollAxisRange scrollAxisRange) {
        this.f30764f = scrollAxisRange;
    }
}
