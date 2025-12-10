package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.unit.Density;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "", "position", "", "Landroidx/compose/ui/unit/Density;", "layoutSize", "itemSize", "itemIndex", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public interface SnapPositionInLayout {
    @NotNull
    public static final Companion Companion = Companion.f13044a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28850d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getCenterToCenter", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "CenterToCenter", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f13044a = new Companion();

        /* renamed from: b */
        public static final SnapPositionInLayout f13045b = C2833a.f13046a;

        /* renamed from: androidx.compose.foundation.gestures.snapping.SnapPositionInLayout$Companion$a */
        /* loaded from: classes.dex */
        public static final class C2833a implements SnapPositionInLayout {

            /* renamed from: a */
            public static final C2833a f13046a = new C2833a();

            @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
            public final int position(Density SnapPositionInLayout, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(SnapPositionInLayout, "$this$SnapPositionInLayout");
                return (i / 2) - (i2 / 2);
            }
        }

        @NotNull
        public final SnapPositionInLayout getCenterToCenter() {
            return f13045b;
        }
    }

    int position(@NotNull Density density, int i, int i2, int i3);
}
