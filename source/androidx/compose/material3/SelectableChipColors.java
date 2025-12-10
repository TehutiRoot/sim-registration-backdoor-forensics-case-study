package androidx.compose.material3;

import androidx.compose.p003ui.graphics.Color;
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
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bt\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010$R\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010$R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010$R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010$R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b)\u0010$R\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b*\u0010$R\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010$R\u001d\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b,\u0010$R\u001d\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010$R\u001d\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b.\u0010$R\u001d\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010$R\u001d\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m28850d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor$material3_release", "leadingIconContentColor$material3_release", "leadingIconContentColor", "trailingIconContentColor$material3_release", "trailingIconContentColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, OperatorName.MOVE_TO, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f26015a;

    /* renamed from: b */
    public final long f26016b;

    /* renamed from: c */
    public final long f26017c;

    /* renamed from: d */
    public final long f26018d;

    /* renamed from: e */
    public final long f26019e;

    /* renamed from: f */
    public final long f26020f;

    /* renamed from: g */
    public final long f26021g;

    /* renamed from: h */
    public final long f26022h;

    /* renamed from: i */
    public final long f26023i;

    /* renamed from: j */
    public final long f26024j;

    /* renamed from: k */
    public final long f26025k;

    /* renamed from: l */
    public final long f26026l;

    /* renamed from: m */
    public final long f26027m;

    public /* synthetic */ SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:1875)");
        }
        if (!z) {
            if (z2) {
                j = this.f26024j;
            } else {
                j = this.f26019e;
            }
        } else if (!z2) {
            j = this.f26015a;
        } else {
            j = this.f26023i;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
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
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        if (Color.m71736equalsimpl0(this.f26015a, selectableChipColors.f26015a) && Color.m71736equalsimpl0(this.f26016b, selectableChipColors.f26016b) && Color.m71736equalsimpl0(this.f26017c, selectableChipColors.f26017c) && Color.m71736equalsimpl0(this.f26018d, selectableChipColors.f26018d) && Color.m71736equalsimpl0(this.f26019e, selectableChipColors.f26019e) && Color.m71736equalsimpl0(this.f26020f, selectableChipColors.f26020f) && Color.m71736equalsimpl0(this.f26021g, selectableChipColors.f26021g) && Color.m71736equalsimpl0(this.f26022h, selectableChipColors.f26022h) && Color.m71736equalsimpl0(this.f26023i, selectableChipColors.f26023i) && Color.m71736equalsimpl0(this.f26024j, selectableChipColors.f26024j) && Color.m71736equalsimpl0(this.f26025k, selectableChipColors.f26025k) && Color.m71736equalsimpl0(this.f26026l, selectableChipColors.f26026l) && Color.m71736equalsimpl0(this.f26027m, selectableChipColors.f26027m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m71742hashCodeimpl(this.f26015a) * 31) + Color.m71742hashCodeimpl(this.f26016b)) * 31) + Color.m71742hashCodeimpl(this.f26017c)) * 31) + Color.m71742hashCodeimpl(this.f26018d)) * 31) + Color.m71742hashCodeimpl(this.f26019e)) * 31) + Color.m71742hashCodeimpl(this.f26020f)) * 31) + Color.m71742hashCodeimpl(this.f26021g)) * 31) + Color.m71742hashCodeimpl(this.f26022h)) * 31) + Color.m71742hashCodeimpl(this.f26023i)) * 31) + Color.m71742hashCodeimpl(this.f26024j)) * 31) + Color.m71742hashCodeimpl(this.f26025k)) * 31) + Color.m71742hashCodeimpl(this.f26026l)) * 31) + Color.m71742hashCodeimpl(this.f26027m);
    }

    @Composable
    @NotNull
    public final State<Color> labelColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-829231549);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-829231549, i, -1, "androidx.compose.material3.SelectableChipColors.labelColor (Chip.kt:1891)");
        }
        if (!z) {
            j = this.f26020f;
        } else if (!z2) {
            j = this.f26016b;
        } else {
            j = this.f26025k;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconContentColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-1112029563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112029563, i, -1, "androidx.compose.material3.SelectableChipColors.leadingIconContentColor (Chip.kt:1907)");
        }
        if (!z) {
            j = this.f26021g;
        } else if (!z2) {
            j = this.f26017c;
        } else {
            j = this.f26026l;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconContentColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(963620819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(963620819, i, -1, "androidx.compose.material3.SelectableChipColors.trailingIconContentColor (Chip.kt:1923)");
        }
        if (!z) {
            j = this.f26022h;
        } else if (!z2) {
            j = this.f26018d;
        } else {
            j = this.f26027m;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public SelectableChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f26015a = j;
        this.f26016b = j2;
        this.f26017c = j3;
        this.f26018d = j4;
        this.f26019e = j5;
        this.f26020f = j6;
        this.f26021g = j7;
        this.f26022h = j8;
        this.f26023i = j9;
        this.f26024j = j10;
        this.f26025k = j11;
        this.f26026l = j12;
        this.f26027m = j13;
    }
}
