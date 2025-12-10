package androidx.compose.p003ui.window;

import androidx.compose.p003ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 */
/* loaded from: classes2.dex */
public final class PopupLayout$canCalculatePosition$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ PopupLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        LayoutCoordinates parentLayoutCoordinates;
        parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
        return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m73900getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
