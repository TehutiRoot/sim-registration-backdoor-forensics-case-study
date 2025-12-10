package androidx.compose.foundation.text.modifiers;

import androidx.compose.p003ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class SelectionController$modifier$1 extends Lambda implements Function0<LayoutCoordinates> {
    final /* synthetic */ SelectionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionController$modifier$1(SelectionController selectionController) {
        super(0);
        this.this$0 = selectionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final LayoutCoordinates invoke() {
        StaticTextSelectionParams staticTextSelectionParams;
        staticTextSelectionParams = this.this$0.f14236c;
        return staticTextSelectionParams.getLayoutCoordinates();
    }
}