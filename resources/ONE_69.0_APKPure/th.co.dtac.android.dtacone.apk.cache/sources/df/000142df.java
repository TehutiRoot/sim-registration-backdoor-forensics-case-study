package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$pagerState$1$1 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdForms$pagerState$1$1 extends Lambda implements Function0<Integer> {
    final /* synthetic */ boolean $hasOtherId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputIdCardScreenKt$InputIdForms$pagerState$1$1(boolean z) {
        super(0);
        this.$hasOtherId = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Integer invoke() {
        return Integer.valueOf(this.$hasOtherId ? 3 : 2);
    }
}