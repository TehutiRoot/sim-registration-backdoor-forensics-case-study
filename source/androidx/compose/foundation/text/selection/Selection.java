package androidx.compose.foundation.text.selection;

import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m28850d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "start", "end", "", "handlesCrossed", "<init>", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)V", "other", "merge", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/ui/text/TextRange;", "toTextRange-d9O1mEE", "()J", "toTextRange", "component1", "()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "component2", "component3", "()Z", "copy", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;Z)Landroidx/compose/foundation/text/selection/Selection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getStart", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEnd", OperatorName.CURVE_TO, "Z", "getHandlesCrossed", "AnchorInfo", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Selection {

    /* renamed from: a */
    public final AnchorInfo f14225a;

    /* renamed from: b */
    public final AnchorInfo f14226b;

    /* renamed from: c */
    public final boolean f14227c;

    @Immutable
    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m28850d2 = {"Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "selectableId", "<init>", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V", "component1", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "component2", "()I", "component3", "()J", "copy", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getDirection", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getOffset", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getSelectableId", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class AnchorInfo {

        /* renamed from: a */
        public final ResolvedTextDirection f14228a;

        /* renamed from: b */
        public final int f14229b;

        /* renamed from: c */
        public final long f14230c;

        public AnchorInfo(@NotNull ResolvedTextDirection direction, int i, long j) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f14228a = direction;
            this.f14229b = i;
            this.f14230c = j;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = anchorInfo.f14228a;
            }
            if ((i2 & 2) != 0) {
                i = anchorInfo.f14229b;
            }
            if ((i2 & 4) != 0) {
                j = anchorInfo.f14230c;
            }
            return anchorInfo.copy(resolvedTextDirection, i, j);
        }

        @NotNull
        public final ResolvedTextDirection component1() {
            return this.f14228a;
        }

        public final int component2() {
            return this.f14229b;
        }

        public final long component3() {
            return this.f14230c;
        }

        @NotNull
        public final AnchorInfo copy(@NotNull ResolvedTextDirection direction, int i, long j) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new AnchorInfo(direction, i, j);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnchorInfo) {
                AnchorInfo anchorInfo = (AnchorInfo) obj;
                return this.f14228a == anchorInfo.f14228a && this.f14229b == anchorInfo.f14229b && this.f14230c == anchorInfo.f14230c;
            }
            return false;
        }

        @NotNull
        public final ResolvedTextDirection getDirection() {
            return this.f14228a;
        }

        public final int getOffset() {
            return this.f14229b;
        }

        public final long getSelectableId() {
            return this.f14230c;
        }

        public int hashCode() {
            return (((this.f14228a.hashCode() * 31) + this.f14229b) * 31) + AbstractC17792Ig1.m67882a(this.f14230c);
        }

        @NotNull
        public String toString() {
            return "AnchorInfo(direction=" + this.f14228a + ", offset=" + this.f14229b + ", selectableId=" + this.f14230c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public Selection(@NotNull AnchorInfo start, @NotNull AnchorInfo end, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f14225a = start;
        this.f14226b = end;
        this.f14227c = z;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            anchorInfo = selection.f14225a;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.f14226b;
        }
        if ((i & 4) != 0) {
            z = selection.f14227c;
        }
        return selection.copy(anchorInfo, anchorInfo2, z);
    }

    @NotNull
    public final AnchorInfo component1() {
        return this.f14225a;
    }

    @NotNull
    public final AnchorInfo component2() {
        return this.f14226b;
    }

    public final boolean component3() {
        return this.f14227c;
    }

    @NotNull
    public final Selection copy(@NotNull AnchorInfo start, @NotNull AnchorInfo end, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new Selection(start, end, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Selection) {
            Selection selection = (Selection) obj;
            return Intrinsics.areEqual(this.f14225a, selection.f14225a) && Intrinsics.areEqual(this.f14226b, selection.f14226b) && this.f14227c == selection.f14227c;
        }
        return false;
    }

    @NotNull
    public final AnchorInfo getEnd() {
        return this.f14226b;
    }

    public final boolean getHandlesCrossed() {
        return this.f14227c;
    }

    @NotNull
    public final AnchorInfo getStart() {
        return this.f14225a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f14225a.hashCode() * 31) + this.f14226b.hashCode()) * 31;
        boolean z = this.f14227c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public final Selection merge(@Nullable Selection selection) {
        if (selection == null) {
            return this;
        }
        if (this.f14227c) {
            return copy$default(this, selection.f14225a, null, false, 6, null);
        }
        return copy$default(this, null, selection.f14226b, false, 5, null);
    }

    @NotNull
    public String toString() {
        return "Selection(start=" + this.f14225a + ", end=" + this.f14226b + ", handlesCrossed=" + this.f14227c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: toTextRange-d9O1mEE  reason: not valid java name */
    public final long m69842toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.f14225a.getOffset(), this.f14226b.getOffset());
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(anchorInfo, anchorInfo2, (i & 4) != 0 ? false : z);
    }
}
