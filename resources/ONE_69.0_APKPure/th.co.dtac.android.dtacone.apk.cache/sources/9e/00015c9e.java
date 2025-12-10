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
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignaturePageScreen$7 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignaturePageScreen$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $base64String;
    final /* synthetic */ CompanyThemes $isTrueThemes;
    final /* synthetic */ int $messageSignError;
    final /* synthetic */ int $messageSignTwoError;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onNext;
    final /* synthetic */ MutableState<Boolean> $previewPdf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignaturePageScreenKt$SignaturePageScreen$7(String str, Function1<? super ImageBitmap, Unit> function1, Function0<Unit> function0, MutableState<Boolean> mutableState, CompanyThemes companyThemes, int i, int i2, int i3, int i4) {
        super(2);
        this.$base64String = str;
        this.$onNext = function1;
        this.$onBack = function0;
        this.$previewPdf = mutableState;
        this.$isTrueThemes = companyThemes;
        this.$messageSignError = i;
        this.$messageSignTwoError = i2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SignaturePageScreenKt.SignaturePageScreen(this.$base64String, this.$onNext, this.$onBack, this.$previewPdf, this.$isTrueThemes, this.$messageSignError, this.$messageSignTwoError, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}