package th.p047co.dtac.android.dtacone.app_one.widget.composable;

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
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogImagePreview$state$1$1 */
/* loaded from: classes7.dex */
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
        m75130invoked4ec7I(f.floatValue(), offset.m71696unboximpl(), f2.floatValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m75130invoked4ec7I(float f, long j, float f2) {
        float m20005o;
        float m20003q;
        long m20010j;
        float m20005o2;
        float m20005o3;
        float m20008l;
        float m20005o4;
        long m20010j2;
        long m20011i;
        float m20005o5;
        long m20011i2;
        float m20005o6;
        long m20010j3;
        long m20011i3;
        float m20005o7;
        long m20011i4;
        float m20005o8;
        long Offset;
        float m20008l2;
        MutableFloatState mutableFloatState = this.$scale$delegate;
        m20005o = OneDialogKt.m20005o(mutableFloatState);
        OneDialogKt.m20004p(mutableFloatState, m20005o * f);
        MutableFloatState mutableFloatState2 = this.$rotation$delegate;
        m20003q = OneDialogKt.m20003q(mutableFloatState2);
        OneDialogKt.m20002r(mutableFloatState2, m20003q + f2);
        MutableState<Offset> mutableState = this.$translation$delegate;
        m20010j = OneDialogKt.m20010j(mutableState);
        OneDialogKt.m20009k(mutableState, Offset.m71691plusMKHz9U(m20010j, j));
        m20005o2 = OneDialogKt.m20005o(this.$scale$delegate);
        if (m20005o2 < 1.0f) {
            OneDialogKt.m20004p(this.$scale$delegate, 1.0f);
        }
        m20005o3 = OneDialogKt.m20005o(this.$scale$delegate);
        m20008l = OneDialogKt.m20008l(this.$maxScale$delegate);
        if (m20005o3 > m20008l) {
            MutableFloatState mutableFloatState3 = this.$scale$delegate;
            m20008l2 = OneDialogKt.m20008l(this.$maxScale$delegate);
            OneDialogKt.m20004p(mutableFloatState3, m20008l2);
        }
        MutableState<Offset> mutableState2 = this.$translation$delegate;
        m20005o4 = OneDialogKt.m20005o(this.$scale$delegate);
        if (m20005o4 != 1.0f) {
            m20010j2 = OneDialogKt.m20010j(this.$translation$delegate);
            float m71686getXimpl = Offset.m71686getXimpl(m20010j2);
            m20011i = OneDialogKt.m20011i(this.$imageSize$delegate);
            m20005o5 = OneDialogKt.m20005o(this.$scale$delegate);
            float f3 = (-(IntSize.m74002getWidthimpl(m20011i) / 2.0f)) * (m20005o5 - 1.0f);
            m20011i2 = OneDialogKt.m20011i(this.$imageSize$delegate);
            m20005o6 = OneDialogKt.m20005o(this.$scale$delegate);
            float coerceIn = AbstractC11695c.coerceIn(m71686getXimpl, f3, (IntSize.m74002getWidthimpl(m20011i2) / 2.0f) * (m20005o6 - 1.0f));
            m20010j3 = OneDialogKt.m20010j(this.$translation$delegate);
            float m71687getYimpl = Offset.m71687getYimpl(m20010j3);
            m20011i3 = OneDialogKt.m20011i(this.$imageSize$delegate);
            m20005o7 = OneDialogKt.m20005o(this.$scale$delegate);
            float f4 = (-(IntSize.m74001getHeightimpl(m20011i3) / 2.0f)) * (m20005o7 - 1.0f);
            m20011i4 = OneDialogKt.m20011i(this.$imageSize$delegate);
            m20005o8 = OneDialogKt.m20005o(this.$scale$delegate);
            Offset = OffsetKt.Offset(coerceIn, AbstractC11695c.coerceIn(m71687getYimpl, f4, (IntSize.m74001getHeightimpl(m20011i4) / 2.0f) * (m20005o8 - 1.0f)));
        } else {
            Offset = OffsetKt.Offset(0.0f, 0.0f);
        }
        OneDialogKt.m20009k(mutableState2, Offset);
    }
}