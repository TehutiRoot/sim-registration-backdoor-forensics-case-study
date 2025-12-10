package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\nR$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\f¨\u0006 "}, m28850d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "getHeightOffsetLimit", "()F", "setHeightOffsetLimit", "(F)V", "heightOffsetLimit", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getContentOffset", "setContentOffset", "contentOffset", "Landroidx/compose/runtime/MutableState;", OperatorName.CURVE_TO, "_heightOffset", "newOffset", "getHeightOffset", "setHeightOffset", "heightOffset", "getCollapsedFraction", "collapsedFraction", "getOverlappedFraction", "overlappedFraction", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1664:1\n76#2:1665\n102#2,2:1666\n76#2:1668\n102#2,2:1669\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n833#1:1665\n833#1:1666,2\n860#1:1668\n860#1:1669,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TopAppBarState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final Saver f26503d = ListSaverKt.listSaver(TopAppBarState$Companion$Saver$1.INSTANCE, TopAppBarState$Companion$Saver$2.INSTANCE);

    /* renamed from: a */
    public final MutableState f26504a;

    /* renamed from: b */
    public final MutableState f26505b;

    /* renamed from: c */
    public MutableState f26506c;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/material3/TopAppBarState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TopAppBarState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.f26503d;
        }

        public Companion() {
        }
    }

    public TopAppBarState(float f, float f2, float f3) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        m31891g = AbstractC19508dK1.m31891g(Float.valueOf(f), null, 2, null);
        this.f26504a = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(Float.valueOf(f3), null, 2, null);
        this.f26505b = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(Float.valueOf(f2), null, 2, null);
        this.f26506c = m31891g3;
    }

    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    public final float getContentOffset() {
        return ((Number) this.f26505b.getValue()).floatValue();
    }

    public final float getHeightOffset() {
        return ((Number) this.f26506c.getValue()).floatValue();
    }

    public final float getHeightOffsetLimit() {
        return ((Number) this.f26504a.getValue()).floatValue();
    }

    public final float getOverlappedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1 - (AbstractC11719c.coerceIn(getHeightOffsetLimit() - getContentOffset(), getHeightOffsetLimit(), 0.0f) / getHeightOffsetLimit());
    }

    public final void setContentOffset(float f) {
        this.f26505b.setValue(Float.valueOf(f));
    }

    public final void setHeightOffset(float f) {
        this.f26506c.setValue(Float.valueOf(AbstractC11719c.coerceIn(f, getHeightOffsetLimit(), 0.0f)));
    }

    public final void setHeightOffsetLimit(float f) {
        this.f26504a.setValue(Float.valueOf(f));
    }
}
