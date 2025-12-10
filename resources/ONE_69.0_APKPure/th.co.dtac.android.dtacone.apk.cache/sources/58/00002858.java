package androidx.compose.foundation.relocation;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode$bringIntoView$2 extends Lambda implements Function0<Rect> {
    final /* synthetic */ Rect $rect;
    final /* synthetic */ BringIntoViewRequesterNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterNode$bringIntoView$2(Rect rect, BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        super(0);
        this.$rect = rect;
        this.this$0 = bringIntoViewRequesterNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Rect invoke() {
        Rect rect = this.$rect;
        if (rect == null) {
            LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
            if (layoutCoordinates != null) {
                return SizeKt.m71776toRectuvyYCjk(IntSizeKt.m74012toSizeozmzZPI(layoutCoordinates.mo73000getSizeYbymL2g()));
            }
            return null;
        }
        return rect;
    }
}