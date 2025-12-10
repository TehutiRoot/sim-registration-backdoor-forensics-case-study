package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage.OneRegisterTrueOnlineSignaturePageScreenKt$OneRegisterTrueOnlineSignaturePageScreen$4 */
/* loaded from: classes10.dex */
public final class C15532xa89d22eb extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onNext;
    final /* synthetic */ Function0<Unit> $onPreview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15532xa89d22eb(Function0<Unit> function0, Function1<? super ImageBitmap, Unit> function1, int i, int i2) {
        super(2);
        this.$onPreview = function0;
        this.$onNext = function1;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRegisterTrueOnlineSignaturePageScreenKt.OneRegisterTrueOnlineSignaturePageScreen(this.$onPreview, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}