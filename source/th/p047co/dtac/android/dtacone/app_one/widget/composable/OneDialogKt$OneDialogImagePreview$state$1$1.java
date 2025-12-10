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
import kotlin.ranges.AbstractC11719c;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        m74946invoked4ec7I(f.floatValue(), offset.m71512unboximpl(), f2.floatValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m74946invoked4ec7I(float f, long j, float f2) {
        float m19830o;
        float m19828q;
        long m19835j;
        float m19830o2;
        float m19830o3;
        float m19833l;
        float m19830o4;
        long m19835j2;
        long m19836i;
        float m19830o5;
        long m19836i2;
        float m19830o6;
        long m19835j3;
        long m19836i3;
        float m19830o7;
        long m19836i4;
        float m19830o8;
        long Offset;
        float m19833l2;
        MutableFloatState mutableFloatState = this.$scale$delegate;
        m19830o = OneDialogKt.m19830o(mutableFloatState);
        OneDialogKt.m19829p(mutableFloatState, m19830o * f);
        MutableFloatState mutableFloatState2 = this.$rotation$delegate;
        m19828q = OneDialogKt.m19828q(mutableFloatState2);
        OneDialogKt.m19827r(mutableFloatState2, m19828q + f2);
        MutableState<Offset> mutableState = this.$translation$delegate;
        m19835j = OneDialogKt.m19835j(mutableState);
        OneDialogKt.m19834k(mutableState, Offset.m71507plusMKHz9U(m19835j, j));
        m19830o2 = OneDialogKt.m19830o(this.$scale$delegate);
        if (m19830o2 < 1.0f) {
            OneDialogKt.m19829p(this.$scale$delegate, 1.0f);
        }
        m19830o3 = OneDialogKt.m19830o(this.$scale$delegate);
        m19833l = OneDialogKt.m19833l(this.$maxScale$delegate);
        if (m19830o3 > m19833l) {
            MutableFloatState mutableFloatState3 = this.$scale$delegate;
            m19833l2 = OneDialogKt.m19833l(this.$maxScale$delegate);
            OneDialogKt.m19829p(mutableFloatState3, m19833l2);
        }
        MutableState<Offset> mutableState2 = this.$translation$delegate;
        m19830o4 = OneDialogKt.m19830o(this.$scale$delegate);
        if (m19830o4 != 1.0f) {
            m19835j2 = OneDialogKt.m19835j(this.$translation$delegate);
            float m71502getXimpl = Offset.m71502getXimpl(m19835j2);
            m19836i = OneDialogKt.m19836i(this.$imageSize$delegate);
            m19830o5 = OneDialogKt.m19830o(this.$scale$delegate);
            float f3 = (-(IntSize.m73818getWidthimpl(m19836i) / 2.0f)) * (m19830o5 - 1.0f);
            m19836i2 = OneDialogKt.m19836i(this.$imageSize$delegate);
            m19830o6 = OneDialogKt.m19830o(this.$scale$delegate);
            float coerceIn = AbstractC11719c.coerceIn(m71502getXimpl, f3, (IntSize.m73818getWidthimpl(m19836i2) / 2.0f) * (m19830o6 - 1.0f));
            m19835j3 = OneDialogKt.m19835j(this.$translation$delegate);
            float m71503getYimpl = Offset.m71503getYimpl(m19835j3);
            m19836i3 = OneDialogKt.m19836i(this.$imageSize$delegate);
            m19830o7 = OneDialogKt.m19830o(this.$scale$delegate);
            float f4 = (-(IntSize.m73817getHeightimpl(m19836i3) / 2.0f)) * (m19830o7 - 1.0f);
            m19836i4 = OneDialogKt.m19836i(this.$imageSize$delegate);
            m19830o8 = OneDialogKt.m19830o(this.$scale$delegate);
            Offset = OffsetKt.Offset(coerceIn, AbstractC11719c.coerceIn(m71503getYimpl, f4, (IntSize.m73817getHeightimpl(m19836i4) / 2.0f) * (m19830o8 - 1.0f)));
        } else {
            Offset = OffsetKt.Offset(0.0f, 0.0f);
        }
        OneDialogKt.m19834k(mutableState2, Offset);
    }
}
