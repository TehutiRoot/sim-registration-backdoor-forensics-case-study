package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m28850d2 = {"Landroidx/compose/material3/SelectableChipBorder;", "", "Landroidx/compose/ui/graphics/Color;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "selectedBorderWidth", "<init>", "(JJJJFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "borderStroke$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderStroke", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", "F", OperatorName.FILL_NON_ZERO, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SelectableChipBorder {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26009a;

    /* renamed from: b */
    public final long f26010b;

    /* renamed from: c */
    public final long f26011c;

    /* renamed from: d */
    public final long f26012d;

    /* renamed from: e */
    public final float f26013e;

    /* renamed from: f */
    public final float f26014f;

    public /* synthetic */ SelectableChipBorder(long j, long j2, long j3, long j4, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, f, f2);
    }

    @Composable
    @NotNull
    public final State<BorderStroke> borderStroke$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        float f;
        composer.startReplaceableGroup(670222826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(670222826, i, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:1993)");
        }
        if (z) {
            if (z2) {
                j = this.f26010b;
            } else {
                j = this.f26009a;
            }
        } else if (z2) {
            j = this.f26012d;
        } else {
            j = this.f26011c;
        }
        if (z2) {
            f = this.f26014f;
        } else {
            f = this.f26013e;
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m69339BorderStrokecXLIe8U(f, j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipBorder)) {
            return false;
        }
        SelectableChipBorder selectableChipBorder = (SelectableChipBorder) obj;
        if (Color.m71736equalsimpl0(this.f26009a, selectableChipBorder.f26009a) && Color.m71736equalsimpl0(this.f26010b, selectableChipBorder.f26010b) && Color.m71736equalsimpl0(this.f26011c, selectableChipBorder.f26011c) && Color.m71736equalsimpl0(this.f26012d, selectableChipBorder.f26012d) && C3641Dp.m73663equalsimpl0(this.f26013e, selectableChipBorder.f26013e) && C3641Dp.m73663equalsimpl0(this.f26014f, selectableChipBorder.f26014f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m71742hashCodeimpl(this.f26009a) * 31) + Color.m71742hashCodeimpl(this.f26010b)) * 31) + Color.m71742hashCodeimpl(this.f26011c)) * 31) + Color.m71742hashCodeimpl(this.f26012d)) * 31) + C3641Dp.m73664hashCodeimpl(this.f26013e)) * 31) + C3641Dp.m73664hashCodeimpl(this.f26014f);
    }

    public SelectableChipBorder(long j, long j2, long j3, long j4, float f, float f2) {
        this.f26009a = j;
        this.f26010b = j2;
        this.f26011c = j3;
        this.f26012d = j4;
        this.f26013e = f;
        this.f26014f = f2;
    }
}
