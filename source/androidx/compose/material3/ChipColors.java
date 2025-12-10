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
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BL\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u001d\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m28850d2 = {"Landroidx/compose/material3/ChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor$material3_release", "leadingIconContentColor$material3_release", "trailingIconContentColor$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ChipColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f25630a;

    /* renamed from: b */
    public final long f25631b;

    /* renamed from: c */
    public final long f25632c;

    /* renamed from: d */
    public final long f25633d;

    /* renamed from: e */
    public final long f25634e;

    /* renamed from: f */
    public final long f25635f;

    /* renamed from: g */
    public final long f25636g;

    /* renamed from: h */
    public final long f25637h;

    public /* synthetic */ ChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(-136683658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-136683658, i, -1, "androidx.compose.material3.ChipColors.containerColor (Chip.kt:1776)");
        }
        if (z) {
            j = this.f25630a;
        } else {
            j = this.f25634e;
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
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        if (Color.m71736equalsimpl0(this.f25630a, chipColors.f25630a) && Color.m71736equalsimpl0(this.f25631b, chipColors.f25631b) && Color.m71736equalsimpl0(this.f25632c, chipColors.f25632c) && Color.m71736equalsimpl0(this.f25633d, chipColors.f25633d) && Color.m71736equalsimpl0(this.f25634e, chipColors.f25634e) && Color.m71736equalsimpl0(this.f25635f, chipColors.f25635f) && Color.m71736equalsimpl0(this.f25636g, chipColors.f25636g) && Color.m71736equalsimpl0(this.f25637h, chipColors.f25637h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m71742hashCodeimpl(this.f25630a) * 31) + Color.m71742hashCodeimpl(this.f25631b)) * 31) + Color.m71742hashCodeimpl(this.f25632c)) * 31) + Color.m71742hashCodeimpl(this.f25633d)) * 31) + Color.m71742hashCodeimpl(this.f25634e)) * 31) + Color.m71742hashCodeimpl(this.f25635f)) * 31) + Color.m71742hashCodeimpl(this.f25636g)) * 31) + Color.m71742hashCodeimpl(this.f25637h);
    }

    @Composable
    @NotNull
    public final State<Color> labelColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(559848681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(559848681, i, -1, "androidx.compose.material3.ChipColors.labelColor (Chip.kt:1786)");
        }
        if (z) {
            j = this.f25631b;
        } else {
            j = this.f25635f;
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
    public final State<Color> leadingIconContentColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(5136811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5136811, i, -1, "androidx.compose.material3.ChipColors.leadingIconContentColor (Chip.kt:1796)");
        }
        if (z) {
            j = this.f25632c;
        } else {
            j = this.f25636g;
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
    public final State<Color> trailingIconContentColor$material3_release(boolean z, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(96182905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96182905, i, -1, "androidx.compose.material3.ChipColors.trailingIconContentColor (Chip.kt:1808)");
        }
        if (z) {
            j = this.f25633d;
        } else {
            j = this.f25637h;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m71725boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public ChipColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f25630a = j;
        this.f25631b = j2;
        this.f25632c = j3;
        this.f25633d = j4;
        this.f25634e = j5;
        this.f25635f = j6;
        this.f25636g = j7;
        this.f25637h = j8;
    }
}
