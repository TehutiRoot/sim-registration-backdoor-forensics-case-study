package androidx.compose.material;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.PointMode;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1190:1\n1477#2:1191\n1502#2,3:1192\n1505#2,3:1202\n1549#2:1206\n1620#2,3:1207\n361#3,7:1195\n215#4:1205\n216#4:1210\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n*L\n775#1:1191\n775#1:1192,3\n775#1:1202,3\n778#1:1206\n778#1:1207,3\n775#1:1195,7\n776#1:1205\n776#1:1210\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$Track$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f, State<Color> state, float f2, float f3, float f4, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
        super(1);
        this.$thumbPx = f;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f2;
        this.$positionFractionEnd = f3;
        this.$positionFractionStart = f4;
        this.$activeTrackColor = state2;
        this.$tickFractions = list;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        boolean z = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbPx, Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m71571getWidthimpl(Canvas.mo72144getSizeNHjbRc()) - this.$thumbPx, Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        long m71745unboximpl = this.$inactiveTrackColor.getValue().m71745unboximpl();
        float f = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j3 = j2;
        long j4 = j;
        AbstractC12212lK.m26524C(Canvas, m71745unboximpl, j, j2, f, companion.m72044getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        AbstractC12212lK.m26524C(Canvas, this.$activeTrackColor.getValue().m71745unboximpl(), OffsetKt.Offset(Offset.m71502getXimpl(j4) + ((Offset.m71502getXimpl(j3) - Offset.m71502getXimpl(j4)) * this.$positionFractionStart), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0())), OffsetKt.Offset(Offset.m71502getXimpl(j4) + ((Offset.m71502getXimpl(j3) - Offset.m71502getXimpl(j4)) * this.$positionFractionEnd), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m72044getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float f2 = this.$positionFractionEnd;
        float f3 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : this.$tickFractions) {
            float floatValue = ((Number) obj).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f2 || floatValue < f3);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        float f4 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List<Number> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
            for (Number number : list) {
                arrayList.add(Offset.m71491boximpl(OffsetKt.Offset(Offset.m71502getXimpl(OffsetKt.m71525lerpWko1d7g(j4, j3, number.floatValue())), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0()))));
            }
            long j5 = j4;
            long j6 = j3;
            AbstractC12212lK.m26519H(Canvas, arrayList, PointMode.Companion.m71998getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m71745unboximpl(), f4, StrokeCap.Companion.m72044getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            f4 = f4;
            j4 = j5;
            j3 = j6;
        }
    }
}
