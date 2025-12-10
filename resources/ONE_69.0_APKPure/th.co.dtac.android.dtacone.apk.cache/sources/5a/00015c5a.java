package th.p047co.dtac.android.dtacone.widget.compose.signature;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.widget.compose.signature.viewModel.SignaturePadViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$ComposeSignatureCustom$2$1$signatureBitmap$1$1$1 */
/* loaded from: classes9.dex */
public final class C16764xa8bb9200 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SignaturePadViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16764xa8bb9200(SignaturePadViewModel signaturePadViewModel) {
        super(0);
        this.$viewModel = signaturePadViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.setHaveSignature();
    }
}