package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignatureModalBottomSheet$4 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignatureModalBottomSheet$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isTrueThemes;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ boolean $showBottomSheet;
    final /* synthetic */ MutableState<Boolean> $showNotFoundSignature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignaturePageScreenKt$SignatureModalBottomSheet$4(boolean z, Function0<Unit> function0, Function1<? super ImageBitmap, Unit> function1, MutableState<Boolean> mutableState, boolean z2, int i, int i2) {
        super(2);
        this.$showBottomSheet = z;
        this.$onDismiss = function0;
        this.$onComplete = function1;
        this.$showNotFoundSignature = mutableState;
        this.$isTrueThemes = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SignaturePageScreenKt.SignatureModalBottomSheet(this.$showBottomSheet, this.$onDismiss, this.$onComplete, this.$showNotFoundSignature, this.$isTrueThemes, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}