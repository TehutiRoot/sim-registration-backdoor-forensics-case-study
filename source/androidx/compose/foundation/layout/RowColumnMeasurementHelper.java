package androidx.compose.foundation.layout;

import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001Bt\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0005*\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u000e\u001a\u00020\u0005*\u00020\u0015¢\u0006\u0004\b\u000e\u0010\u001aJ3\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100J9\u00106\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00152\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b9\u0010:R;\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b/\u0010;\u001a\u0004\b<\u0010=R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28850d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "<init>", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "mainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/unit/Constraints;", "constraints", "startIndex", "endIndex", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeableScope", "measureResult", "crossAxisOffset", "layoutDirection", "placeHelper", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;ILandroidx/compose/ui/unit/LayoutDirection;)V", "mainAxisLayoutSize", "childrenMainAxisSize", "mainAxisPositions", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)[I", "placeable", "Landroidx/compose/foundation/layout/RowColumnParentData;", "parentData", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I", "Landroidx/compose/foundation/layout/LayoutOrientation;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "Lkotlin/jvm/functions/Function5;", "getArrangement", "()Lkotlin/jvm/functions/Function5;", OperatorName.CURVE_TO, "F", "getArrangementSpacing-D9Ej5fM", "()F", "d", "Landroidx/compose/foundation/layout/SizeMode;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "e", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getMeasurables", "()Ljava/util/List;", OperatorName.NON_STROKING_GRAY, "[Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", OperatorName.CLOSE_PATH, "[Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n321#2:326\n321#2:327\n321#2:328\n320#2:329\n323#2:331\n321#2:332\n320#2:333\n323#2:334\n323#2:335\n322#2:336\n1#3:330\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:326\n142#1:327\n143#1:328\n145#1:329\n179#1:331\n189#1:332\n225#1:333\n226#1:334\n229#1:335\n234#1:336\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {

    /* renamed from: a */
    public final LayoutOrientation f13229a;

    /* renamed from: b */
    public final Function5 f13230b;

    /* renamed from: c */
    public final float f13231c;

    /* renamed from: d */
    public final SizeMode f13232d;

    /* renamed from: e */
    public final CrossAxisAlignment f13233e;

    /* renamed from: f */
    public final List f13234f;

    /* renamed from: g */
    public final Placeable[] f13235g;

    /* renamed from: h */
    public final RowColumnParentData[] f13236h;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Function5 function5, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, function5, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    /* renamed from: a */
    public final int m61338a(Placeable placeable, RowColumnParentData rowColumnParentData, int i, LayoutDirection layoutDirection, int i2) {
        CrossAxisAlignment crossAxisAlignment;
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.f13233e;
        }
        int crossAxisSize = i - crossAxisSize(placeable);
        if (this.f13229a == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(crossAxisSize, layoutDirection, placeable, i2);
    }

    /* renamed from: b */
    public final int[] m61337b(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.f13230b.invoke(Integer.valueOf(i), iArr, measureScope.getLayoutDirection(), measureScope, iArr2);
        return iArr2;
    }

    public final int crossAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        if (this.f13229a == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    @NotNull
    public final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> getArrangement() {
        return this.f13230b;
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM  reason: not valid java name */
    public final float m69543getArrangementSpacingD9Ej5fM() {
        return this.f13231c;
    }

    @NotNull
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.f13233e;
    }

    @NotNull
    public final SizeMode getCrossAxisSize() {
        return this.f13232d;
    }

    @NotNull
    public final List<Measurable> getMeasurables() {
        return this.f13234f;
    }

    @NotNull
    public final LayoutOrientation getOrientation() {
        return this.f13229a;
    }

    @NotNull
    public final Placeable[] getPlaceables() {
        return this.f13235g;
    }

    public final int mainAxisSize(@NotNull Placeable placeable) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        if (this.f13229a == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    @NotNull
    /* renamed from: measureWithoutPlacing-_EkL_-Y  reason: not valid java name */
    public final RowColumnMeasureHelperResult m69544measureWithoutPlacing_EkL_Y(@NotNull MeasureScope measureScope, long j, int i, int i2) {
        int i3;
        int m73628getMinWidthimpl;
        float f;
        int i4;
        int coerceAtMost;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int max;
        Integer num;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        long m69506constructorimpl = OrientationIndependentConstraints.m69506constructorimpl(j, this.f13229a);
        int mo69432roundToPx0680j_4 = measureScope.mo69432roundToPx0680j_4(this.f13231c);
        int i13 = i2 - i;
        float f2 = 0.0f;
        int i14 = i;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        float f3 = 0.0f;
        int i18 = 0;
        boolean z3 = false;
        while (true) {
            i3 = Integer.MAX_VALUE;
            if (i14 >= i2) {
                break;
            }
            Measurable measurable = (Measurable) this.f13234f.get(i14);
            RowColumnParentData rowColumnParentData = this.f13236h[i14];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > f2) {
                f3 += weight;
                i17++;
                i11 = i14;
            } else {
                int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(m69506constructorimpl);
                Placeable placeable = this.f13235g[i14];
                if (placeable == null) {
                    if (m73626getMaxWidthimpl == Integer.MAX_VALUE) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i12 = m73626getMaxWidthimpl - i18;
                    }
                    i9 = m73626getMaxWidthimpl;
                    int i19 = i12;
                    i10 = i16;
                    i11 = i14;
                    placeable = measurable.mo72811measureBRTryo0(OrientationIndependentConstraints.m69519toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m69508copyyUG9Ft0$default(m69506constructorimpl, 0, i19, 0, 0, 8, null), this.f13229a));
                } else {
                    i9 = m73626getMaxWidthimpl;
                    i10 = i16;
                    i11 = i14;
                }
                int min = Math.min(mo69432roundToPx0680j_4, (i9 - i18) - mainAxisSize(placeable));
                i18 += mainAxisSize(placeable) + min;
                int max2 = Math.max(i10, crossAxisSize(placeable));
                if (!z3 && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f13235g[i11] = placeable;
                i15 = min;
                i16 = max2;
                z3 = z2;
            }
            i14 = i11 + 1;
            f2 = 0.0f;
        }
        int i20 = i16;
        if (i17 == 0) {
            i18 -= i15;
            i4 = i20;
            coerceAtMost = 0;
        } else {
            int i21 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            if (i21 > 0 && Constraints.m73626getMaxWidthimpl(m69506constructorimpl) != Integer.MAX_VALUE) {
                m73628getMinWidthimpl = Constraints.m73626getMaxWidthimpl(m69506constructorimpl);
            } else {
                m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(m69506constructorimpl);
            }
            int i22 = mo69432roundToPx0680j_4 * (i17 - 1);
            int i23 = (m73628getMinWidthimpl - i18) - i22;
            if (i21 > 0) {
                f = i23 / f3;
            } else {
                f = 0.0f;
            }
            Iterator<Integer> it = AbstractC11719c.until(i, i2).iterator();
            int i24 = 0;
            while (it.hasNext()) {
                i24 += AbstractC21140mr0.roundToInt(RowColumnImplKt.getWeight(this.f13236h[((IntIterator) it).nextInt()]) * f);
            }
            int i25 = i23 - i24;
            int i26 = i;
            i4 = i20;
            int i27 = 0;
            while (i26 < i2) {
                if (this.f13235g[i26] == null) {
                    Measurable measurable2 = (Measurable) this.f13234f.get(i26);
                    RowColumnParentData rowColumnParentData2 = this.f13236h[i26];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight2 > 0.0f) {
                        int sign = AbstractC21140mr0.getSign(i25);
                        int i28 = i25 - sign;
                        int max3 = Math.max(0, AbstractC21140mr0.roundToInt(weight2 * f) + sign);
                        if (RowColumnImplKt.getFill(rowColumnParentData2) && max3 != i3) {
                            i5 = i28;
                            i6 = max3;
                        } else {
                            i5 = i28;
                            i6 = 0;
                        }
                        Placeable mo72811measureBRTryo0 = measurable2.mo72811measureBRTryo0(OrientationIndependentConstraints.m69519toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m69505constructorimpl(i6, max3, 0, Constraints.m73625getMaxHeightimpl(m69506constructorimpl)), this.f13229a));
                        i27 += mainAxisSize(mo72811measureBRTryo0);
                        int max4 = Math.max(i4, crossAxisSize(mo72811measureBRTryo0));
                        if (!z3 && !RowColumnImplKt.isRelative(rowColumnParentData2)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.f13235g[i26] = mo72811measureBRTryo0;
                        i25 = i5;
                        i4 = max4;
                        z3 = z;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                }
                i26++;
                i3 = Integer.MAX_VALUE;
            }
            coerceAtMost = AbstractC11719c.coerceAtMost(i27 + i22, Constraints.m73626getMaxWidthimpl(m69506constructorimpl) - i18);
        }
        if (z3) {
            int i29 = 0;
            int i30 = 0;
            for (int i31 = i; i31 < i2; i31++) {
                Placeable placeable2 = this.f13235g[i31];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.f13236h[i31]);
                if (crossAxisAlignment != null) {
                    num = crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i29 = Math.max(i29, intValue);
                    int crossAxisSize = crossAxisSize(placeable2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize(placeable2);
                    }
                    i30 = Math.max(i30, crossAxisSize - intValue2);
                }
            }
            int i32 = i30;
            i8 = i29;
            i7 = i32;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int max5 = Math.max(i18 + coerceAtMost, Constraints.m73628getMinWidthimpl(m69506constructorimpl));
        if (Constraints.m73625getMaxHeightimpl(m69506constructorimpl) != Integer.MAX_VALUE && this.f13232d == SizeMode.Expand) {
            max = Constraints.m73625getMaxHeightimpl(m69506constructorimpl);
        } else {
            max = Math.max(i4, Math.max(Constraints.m73627getMinHeightimpl(m69506constructorimpl), i7 + i8));
        }
        int[] iArr = new int[i13];
        for (int i33 = 0; i33 < i13; i33++) {
            iArr[i33] = 0;
        }
        int[] iArr2 = new int[i13];
        for (int i34 = 0; i34 < i13; i34++) {
            Placeable placeable3 = this.f13235g[i34 + i];
            Intrinsics.checkNotNull(placeable3);
            iArr2[i34] = mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(max, max5, i, i2, i8, m61337b(max5, iArr2, iArr, measureScope));
    }

    public final void placeHelper(@NotNull Placeable.PlacementScope placeableScope, @NotNull RowColumnMeasureHelperResult measureResult, int i, @NotNull LayoutDirection layoutDirection) {
        RowColumnParentData rowColumnParentData;
        Intrinsics.checkNotNullParameter(placeableScope, "placeableScope");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int endIndex = measureResult.getEndIndex();
        for (int startIndex = measureResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.f13235g[startIndex];
            Intrinsics.checkNotNull(placeable);
            int[] mainAxisPositions = measureResult.getMainAxisPositions();
            Object parentData = ((Measurable) this.f13234f.get(startIndex)).getParentData();
            if (parentData instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) parentData;
            } else {
                rowColumnParentData = null;
            }
            int m61338a = m61338a(placeable, rowColumnParentData, measureResult.getCrossAxisSize(), layoutDirection, measureResult.getBeforeCrossAxisAlignmentLine()) + i;
            if (this.f13229a == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placeableScope, placeable, mainAxisPositions[startIndex - measureResult.getStartIndex()], m61338a, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placeableScope, placeable, m61338a, mainAxisPositions[startIndex - measureResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    public RowColumnMeasurementHelper(LayoutOrientation orientation, Function5 arrangement, float f, SizeMode crossAxisSize, CrossAxisAlignment crossAxisAlignment, List measurables, Placeable[] placeables) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.f13229a = orientation;
        this.f13230b = arrangement;
        this.f13231c = f;
        this.f13232d = crossAxisSize;
        this.f13233e = crossAxisAlignment;
        this.f13234f = measurables;
        this.f13235g = placeables;
        int size = measurables.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData((IntrinsicMeasurable) this.f13234f.get(i));
        }
        this.f13236h = rowColumnParentDataArr;
    }
}
