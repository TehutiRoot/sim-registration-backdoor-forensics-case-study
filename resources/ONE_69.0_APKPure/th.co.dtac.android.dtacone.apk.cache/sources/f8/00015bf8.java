package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogImagePreview$state$1$1 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogImagePreview$state$1$1 extends Lambda implements Function3<Float, Offset, Float, Unit> {
    final /* synthetic */ MutableState<IntSize> $imageSize$delegate;
    final /* synthetic */ MutableFloatState $maxScale$delegate;
    final /* synthetic */ MutableFloatState $rotation$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;
    final /* synthetic */ MutableState<Offset> $translation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogImagePreview$state$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableState<Offset> mutableState, MutableFloatState mutableFloatState3, MutableState<IntSize> mutableState2) {
        super(3);
        this.$scale$delegate = mutableFloatState;
        this.$rotation$delegate = mutableFloatState2;
        this.$translation$delegate = mutableState;
        this.$maxScale$delegate = mutableFloatState3;
        this.$imageSize$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Offset offset, Float f2) {
        m75340invoked4ec7I(f.floatValue(), offset.m71696unboximpl(), f2.floatValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m75340invoked4ec7I(float f, long j, float f2) {
        float m1819I;
        float m1817K;
        long m1824D;
        float m1819I2;
        float m1819I3;
        float m1822F;
        float m1819I4;
        long m1824D2;
        long m1825C;
        float m1819I5;
        long m1825C2;
        float m1819I6;
        long m1824D3;
        long m1825C3;
        float m1819I7;
        long m1825C4;
        float m1819I8;
        long Offset;
        float m1822F2;
        MutableFloatState mutableFloatState = this.$scale$delegate;
        m1819I = OneDialogKt.m1819I(mutableFloatState);
        OneDialogKt.m1818J(mutableFloatState, m1819I * f);
        MutableFloatState mutableFloatState2 = this.$rotation$delegate;
        m1817K = OneDialogKt.m1817K(mutableFloatState2);
        OneDialogKt.m1816L(mutableFloatState2, m1817K + f2);
        MutableState<Offset> mutableState = this.$translation$delegate;
        m1824D = OneDialogKt.m1824D(mutableState);
        OneDialogKt.m1823E(mutableState, Offset.m71691plusMKHz9U(m1824D, j));
        m1819I2 = OneDialogKt.m1819I(this.$scale$delegate);
        if (m1819I2 < 1.0f) {
            OneDialogKt.m1818J(this.$scale$delegate, 1.0f);
        }
        m1819I3 = OneDialogKt.m1819I(this.$scale$delegate);
        m1822F = OneDialogKt.m1822F(this.$maxScale$delegate);
        if (m1819I3 > m1822F) {
            MutableFloatState mutableFloatState3 = this.$scale$delegate;
            m1822F2 = OneDialogKt.m1822F(this.$maxScale$delegate);
            OneDialogKt.m1818J(mutableFloatState3, m1822F2);
        }
        MutableState<Offset> mutableState2 = this.$translation$delegate;
        m1819I4 = OneDialogKt.m1819I(this.$scale$delegate);
        if (m1819I4 != 1.0f) {
            m1824D2 = OneDialogKt.m1824D(this.$translation$delegate);
            float m71686getXimpl = Offset.m71686getXimpl(m1824D2);
            m1825C = OneDialogKt.m1825C(this.$imageSize$delegate);
            m1819I5 = OneDialogKt.m1819I(this.$scale$delegate);
            float f3 = (-(IntSize.m74002getWidthimpl(m1825C) / 2.0f)) * (m1819I5 - 1.0f);
            m1825C2 = OneDialogKt.m1825C(this.$imageSize$delegate);
            m1819I6 = OneDialogKt.m1819I(this.$scale$delegate);
            float coerceIn = AbstractC11695c.coerceIn(m71686getXimpl, f3, (IntSize.m74002getWidthimpl(m1825C2) / 2.0f) * (m1819I6 - 1.0f));
            m1824D3 = OneDialogKt.m1824D(this.$translation$delegate);
            float m71687getYimpl = Offset.m71687getYimpl(m1824D3);
            m1825C3 = OneDialogKt.m1825C(this.$imageSize$delegate);
            m1819I7 = OneDialogKt.m1819I(this.$scale$delegate);
            float f4 = (-(IntSize.m74001getHeightimpl(m1825C3) / 2.0f)) * (m1819I7 - 1.0f);
            m1825C4 = OneDialogKt.m1825C(this.$imageSize$delegate);
            m1819I8 = OneDialogKt.m1819I(this.$scale$delegate);
            Offset = OffsetKt.Offset(coerceIn, AbstractC11695c.coerceIn(m71687getYimpl, f4, (IntSize.m74001getHeightimpl(m1825C4) / 2.0f) * (m1819I8 - 1.0f)));
        } else {
            Offset = OffsetKt.Offset(0.0f, 0.0f);
        }
        OneDialogKt.m1823E(mutableState2, Offset);
    }
}