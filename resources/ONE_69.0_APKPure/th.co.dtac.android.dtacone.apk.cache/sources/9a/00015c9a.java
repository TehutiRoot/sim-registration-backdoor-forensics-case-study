package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignaturePageScreen$4$2$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignaturePageScreen$4$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $base64String;
    final /* synthetic */ MutableState<Boolean> $previewPdf;
    final /* synthetic */ MutableState<Boolean> $showBottomSheet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$SignaturePageScreen$4$2$1(MutableState<Boolean> mutableState, String str, MutableState<Boolean> mutableState2) {
        super(0);
        this.$showBottomSheet = mutableState;
        this.$base64String = str;
        this.$previewPdf = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$showBottomSheet.getValue().booleanValue() || !StringExtKt.isNotEmpty(this.$base64String)) {
            return;
        }
        this.$previewPdf.setValue(Boolean.TRUE);
    }
}