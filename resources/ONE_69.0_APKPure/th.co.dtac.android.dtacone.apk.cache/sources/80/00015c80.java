package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PreviewPDFLayout$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PreviewPDFLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $base64Sting;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onPreview;
    final /* synthetic */ boolean $previewPdf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PreviewPDFLayout$1(Modifier modifier, String str, Function0<Unit> function0, boolean z, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$base64Sting = str;
        this.$onPreview = function0;
        this.$previewPdf = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SignaturePageScreenKt.PreviewPDFLayout(this.$modifier, this.$base64Sting, this.$onPreview, this.$previewPdf, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}