package androidx.compose.material3;

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

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1508:1\n10843#2:1509\n11093#2,3:1510\n11096#2,3:1520\n361#3,7:1513\n215#4:1523\n216#4:1528\n1549#5:1524\n1620#5,3:1525\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n*L\n1055#1:1509\n1055#1:1510,3\n1055#1:1520,3\n1055#1:1513,7\n1058#1:1523\n1058#1:1528\n1060#1:1524\n1060#1:1525,3\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderDefaults$Track$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
        super(1);
        this.$inactiveTrackColor = state;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = state2;
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
        long Offset = OffsetKt.Offset(0.0f, Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m71571getWidthimpl(Canvas.mo72144getSizeNHjbRc()), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0()));
        long j = z ? Offset2 : Offset;
        long j2 = z ? Offset : Offset2;
        float mo69438toPx0680j_4 = Canvas.mo69438toPx0680j_4(SliderKt.access$getTickSize$p());
        float mo69438toPx0680j_42 = Canvas.mo69438toPx0680j_4(SliderKt.getTrackHeight());
        long m71745unboximpl = this.$inactiveTrackColor.getValue().m71745unboximpl();
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j3 = j2;
        long j4 = j;
        AbstractC12212lK.m26524C(Canvas, m71745unboximpl, j, j2, mo69438toPx0680j_42, companion.m72044getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        AbstractC12212lK.m26524C(Canvas, this.$activeTrackColor.getValue().m71745unboximpl(), OffsetKt.Offset(Offset.m71502getXimpl(j4) + ((Offset.m71502getXimpl(j3) - Offset.m71502getXimpl(j4)) * this.$sliderPositions.getActiveRange().getStart().floatValue()), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0())), OffsetKt.Offset(Offset.m71502getXimpl(j4) + ((Offset.m71502getXimpl(j3) - Offset.m71502getXimpl(j4)) * this.$sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0())), mo69438toPx0680j_42, companion.m72044getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i = 0; i < length; i++) {
            float f = tickFractions[i];
            Boolean valueOf = Boolean.valueOf(f > sliderPositions.getActiveRange().getEndInclusive().floatValue() || f < sliderPositions.getActiveRange().getStart().floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f));
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List<Number> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
            for (Number number : list) {
                arrayList.add(Offset.m71491boximpl(OffsetKt.Offset(Offset.m71502getXimpl(OffsetKt.m71525lerpWko1d7g(j4, j3, number.floatValue())), Offset.m71503getYimpl(Canvas.mo72143getCenterF1C5BW0()))));
            }
            long j5 = j4;
            long j6 = j3;
            AbstractC12212lK.m26519H(Canvas, arrayList, PointMode.Companion.m71998getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m71745unboximpl(), mo69438toPx0680j_4, StrokeCap.Companion.m72044getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j3 = j6;
            j4 = j5;
        }
    }
}
