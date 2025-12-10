package androidx.compose.foundation.layout;

import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class OffsetKt$offset$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: $x */
    final /* synthetic */ float f13185$x;

    /* renamed from: $y */
    final /* synthetic */ float f13186$y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetKt$offset$1(float f, float f2) {
        super(1);
        this.f13185$x = f;
        this.f13186$y = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        $receiver.setName(TypedValues.CycleType.S_WAVE_OFFSET);
        $receiver.getProperties().set("x", C3641Dp.m73656boximpl(this.f13185$x));
        $receiver.getProperties().set(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, C3641Dp.m73656boximpl(this.f13186$y));
    }
}
