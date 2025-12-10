package androidx.compose.foundation.text.selection;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/selection/Selectable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "invoke", "(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl$sort$1 extends Lambda implements Function2<Selectable, Selectable, Integer> {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Integer invoke(@NotNull Selectable a, @NotNull Selectable b) {
        long m71518getZeroF1C5BW0;
        long m71518getZeroF1C5BW02;
        int compareValues;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        LayoutCoordinates layoutCoordinates = a.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = b.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m71518getZeroF1C5BW0 = this.$containerLayoutCoordinates.mo72817localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m71518getZeroF1C5BW0());
        } else {
            m71518getZeroF1C5BW0 = Offset.Companion.m71518getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m71518getZeroF1C5BW02 = this.$containerLayoutCoordinates.mo72817localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m71518getZeroF1C5BW0());
        } else {
            m71518getZeroF1C5BW02 = Offset.Companion.m71518getZeroF1C5BW0();
        }
        if (Offset.m71503getYimpl(m71518getZeroF1C5BW0) == Offset.m71503getYimpl(m71518getZeroF1C5BW02)) {
            compareValues = AbstractC16857uu.compareValues(Float.valueOf(Offset.m71502getXimpl(m71518getZeroF1C5BW0)), Float.valueOf(Offset.m71502getXimpl(m71518getZeroF1C5BW02)));
        } else {
            compareValues = AbstractC16857uu.compareValues(Float.valueOf(Offset.m71503getYimpl(m71518getZeroF1C5BW0)), Float.valueOf(Offset.m71503getYimpl(m71518getZeroF1C5BW02)));
        }
        return Integer.valueOf(compareValues);
    }
}
