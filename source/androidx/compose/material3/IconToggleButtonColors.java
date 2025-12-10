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
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001d\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001d\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f25819a;

    /* renamed from: b */
    public final long f25820b;

    /* renamed from: c */
    public final long f25821c;

    /* renamed from: d */
    public final long f25822d;

    /* renamed from: e */
    public final long f25823e;

    /* renamed from: f */
    public final long f25824f;

    public /* synthetic */ IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1175394478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:884)");
        }
        if (!z) {
            j = this.f25821c;
        } else if (!z2) {
            j = this.f25819a;
        } else {
            j = this.f25823e;
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
    public final State<Color> contentColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1340854054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:900)");
        }
        if (!z) {
            j = this.f25822d;
        } else if (!z2) {
            j = this.f25820b;
        } else {
            j = this.f25824f;
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
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        if (Color.m71736equalsimpl0(this.f25819a, iconToggleButtonColors.f25819a) && Color.m71736equalsimpl0(this.f25820b, iconToggleButtonColors.f25820b) && Color.m71736equalsimpl0(this.f25821c, iconToggleButtonColors.f25821c) && Color.m71736equalsimpl0(this.f25822d, iconToggleButtonColors.f25822d) && Color.m71736equalsimpl0(this.f25823e, iconToggleButtonColors.f25823e) && Color.m71736equalsimpl0(this.f25824f, iconToggleButtonColors.f25824f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m71742hashCodeimpl(this.f25819a) * 31) + Color.m71742hashCodeimpl(this.f25820b)) * 31) + Color.m71742hashCodeimpl(this.f25821c)) * 31) + Color.m71742hashCodeimpl(this.f25822d)) * 31) + Color.m71742hashCodeimpl(this.f25823e)) * 31) + Color.m71742hashCodeimpl(this.f25824f);
    }

    public IconToggleButtonColors(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f25819a = j;
        this.f25820b = j2;
        this.f25821c = j3;
        this.f25822d = j4;
        this.f25823e = j5;
        this.f25824f = j6;
    }
}
