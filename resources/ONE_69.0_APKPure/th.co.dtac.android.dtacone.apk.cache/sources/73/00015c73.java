package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$2$state$1$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfPreview$2$state$1$1 extends Lambda implements Function3<Float, Offset, Float, Unit> {
    final /* synthetic */ MutableState<Offset> $offset$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;
    final /* synthetic */ BoxWithConstraintsScope $this_BoxWithConstraints;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfPreview$2$state$1$1(BoxWithConstraintsScope boxWithConstraintsScope, MutableFloatState mutableFloatState, MutableState<Offset> mutableState) {
        super(3);
        this.$this_BoxWithConstraints = boxWithConstraintsScope;
        this.$scale$delegate = mutableFloatState;
        this.$offset$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Offset offset, Float f2) {
        m75358invoked4ec7I(f.floatValue(), offset.m71696unboximpl(), f2.floatValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m75358invoked4ec7I(float f, long j, float f2) {
        float floatValue;
        float floatValue2;
        float floatValue3;
        long invoke$lambda$3;
        float floatValue4;
        long invoke$lambda$32;
        float floatValue5;
        MutableFloatState mutableFloatState = this.$scale$delegate;
        floatValue = mutableFloatState.getFloatValue();
        mutableFloatState.setFloatValue(AbstractC11695c.coerceIn(floatValue * f, 1.0f, 5.0f));
        floatValue2 = this.$scale$delegate.getFloatValue();
        float f3 = 1;
        float m73810getMaxWidthimpl = (floatValue2 - f3) * Constraints.m73810getMaxWidthimpl(this.$this_BoxWithConstraints.mo69677getConstraintsmsEJaDk());
        floatValue3 = this.$scale$delegate.getFloatValue();
        float m73809getMaxHeightimpl = (floatValue3 - f3) * Constraints.m73809getMaxHeightimpl(this.$this_BoxWithConstraints.mo69677getConstraintsmsEJaDk());
        float f4 = 2;
        float f5 = m73810getMaxWidthimpl / f4;
        float f6 = m73809getMaxHeightimpl / f4;
        MutableState<Offset> mutableState = this.$offset$delegate;
        invoke$lambda$3 = SignaturePageScreenKt$PdfPreview$2.invoke$lambda$3(mutableState);
        float m71686getXimpl = Offset.m71686getXimpl(invoke$lambda$3);
        floatValue4 = this.$scale$delegate.getFloatValue();
        float coerceIn = AbstractC11695c.coerceIn(m71686getXimpl + (floatValue4 * Offset.m71686getXimpl(j)), -f5, f5);
        invoke$lambda$32 = SignaturePageScreenKt$PdfPreview$2.invoke$lambda$3(this.$offset$delegate);
        float m71687getYimpl = Offset.m71687getYimpl(invoke$lambda$32);
        floatValue5 = this.$scale$delegate.getFloatValue();
        SignaturePageScreenKt$PdfPreview$2.invoke$lambda$4(mutableState, OffsetKt.Offset(coerceIn, AbstractC11695c.coerceIn(m71687getYimpl + (floatValue5 * Offset.m71687getYimpl(j)), -f6, f6)));
    }
}