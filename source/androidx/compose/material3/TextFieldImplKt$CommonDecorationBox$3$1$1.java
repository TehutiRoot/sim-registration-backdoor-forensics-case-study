package androidx.compose.material3;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
        m70693invokeuvyYCjk(size.m71576unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m70693invokeuvyYCjk(long j) {
        float m71571getWidthimpl = Size.m71571getWidthimpl(j) * this.$labelProgress;
        float m71568getHeightimpl = Size.m71568getHeightimpl(j) * this.$labelProgress;
        if (Size.m71571getWidthimpl(this.$labelSize.getValue().m71576unboximpl()) != m71571getWidthimpl || Size.m71568getHeightimpl(this.$labelSize.getValue().m71576unboximpl()) != m71568getHeightimpl) {
            this.$labelSize.setValue(Size.m71559boximpl(SizeKt.Size(m71571getWidthimpl, m71568getHeightimpl)));
        }
    }
}
