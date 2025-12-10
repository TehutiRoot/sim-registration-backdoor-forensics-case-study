package th.p047co.dtac.android.dtacone.widget.compose.signature;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfViewFirstPage$2$1$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfViewFirstPage$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onPreview;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfViewFirstPage$2$1$1(Function0<Unit> function0) {
        super(0);
        this.$onPreview = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onPreview.invoke();
    }
}