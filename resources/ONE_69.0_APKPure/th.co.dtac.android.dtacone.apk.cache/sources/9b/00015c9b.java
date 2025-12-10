package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignaturePageScreen$4$3$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignaturePageScreen$4$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onNext;
    final /* synthetic */ MutableState<Boolean> $showNotSignature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignaturePageScreenKt$SignaturePageScreen$4$3$1(MutableState<Boolean> mutableState, Function1<? super ImageBitmap, Unit> function1, MutableState<ImageBitmap> mutableState2) {
        super(0);
        this.$showNotSignature = mutableState;
        this.$onNext = function1;
        this.$imageBitmap$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ImageBitmap m1752w;
        ImageBitmap m1752w2;
        m1752w = SignaturePageScreenKt.m1752w(this.$imageBitmap$delegate);
        if (m1752w == null) {
            this.$showNotSignature.setValue(Boolean.TRUE);
            return;
        }
        Function1<ImageBitmap, Unit> function1 = this.$onNext;
        m1752w2 = SignaturePageScreenKt.m1752w(this.$imageBitmap$delegate);
        function1.invoke(m1752w2);
    }
}