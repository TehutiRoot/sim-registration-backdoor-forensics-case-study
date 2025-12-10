package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(m28851d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\t*\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\t*\u00020\u001bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020\u001e*\u00020\u0017H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u001e*\u00020\u001bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0014\u0010&\u001a\u00020%*\u00020$H\u0097\u0001¢\u0006\u0004\b&\u0010'J+\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010(\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u0017*\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u0010#J\u001c\u00101\u001a\u00020\u0017*\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u001c\u00101\u001a\u00020\u0017*\u00020\u001eH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u0010 J\u001c\u00106\u001a\u00020\u001b*\u00020\u001eH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u001c\u00106\u001a\u00020\u001b*\u00020\tH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00107J\u0019\u00106\u001a\u00020\u001b*\u00020\u0017H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00105J\u0019\u0010=\u001a\u00020:*\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u000209*\u00020:H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR<\u0010L\u001a*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0Hj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u001e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u001e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0014\u0010S\u001a\u00020R8WX\u0097\u0005¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Y"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "", "toPx-0680j_4", "(F)F", "toPx", "toPx--R2X_6o", "(J)F", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "toDp-GaN1DYA", "toDp", "toDp-u2uoSUM", "(I)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "placeablesCache", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {

    /* renamed from: a */
    public final LazyLayoutItemContentFactory f13641a;

    /* renamed from: b */
    public final SubcomposeMeasureScope f13642b;

    /* renamed from: c */
    public final LazyLayoutItemProvider f13643c;

    /* renamed from: d */
    public final HashMap f13644d;

    public LazyLayoutMeasureScopeImpl(@NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull SubcomposeMeasureScope subcomposeMeasureScope) {
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f13641a = itemContentFactory;
        this.f13642b = subcomposeMeasureScope;
        this.f13643c = itemContentFactory.getItemProvider().invoke();
        this.f13644d = new HashMap();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f13642b.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f13642b.getFontScale();
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.f13642b.getLayoutDirection();
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasureScope
    @ExperimentalComposeUiApi
    public boolean isLookingAhead() {
        return this.f13642b.isLookingAhead();
    }

    @Override // androidx.compose.p003ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int i, int i2, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return this.f13642b.layout(i, i2, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @NotNull
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo69642measure0kLqBqw(int i, long j) {
        List<Placeable> list = (List) this.f13644d.get(Integer.valueOf(i));
        if (list == null) {
            Object key = this.f13643c.getKey(i);
            List<Measurable> subcompose = this.f13642b.subcompose(key, this.f13641a.getContent(i, key, this.f13643c.getContentType(i)));
            int size = subcompose.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(subcompose.get(i2).mo72811measureBRTryo0(j));
            }
            this.f13644d.put(Integer.valueOf(i), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo69431roundToPxR2X_6o(long j) {
        return this.f13642b.mo69431roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo69432roundToPx0680j_4(float f) {
        return this.f13642b.mo69432roundToPx0680j_4(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public float mo69433toDpGaN1DYA(long j) {
        return this.f13642b.mo69433toDpGaN1DYA(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo69435toDpu2uoSUM(int i) {
        return this.f13642b.mo69435toDpu2uoSUM(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo69436toDpSizekrfVVM(long j) {
        return this.f13642b.mo69436toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo69437toPxR2X_6o(long j) {
        return this.f13642b.mo69437toPxR2X_6o(j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo69438toPx0680j_4(float f) {
        return this.f13642b.mo69438toPx0680j_4(f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.f13642b.toRect(dpRect);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo69439toSizeXkaWNTQ(long j) {
        return this.f13642b.mo69439toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public long mo69440toSp0xMU5do(float f) {
        return this.f13642b.mo69440toSp0xMU5do(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo69441toSpkPz2Gy4(float f) {
        return this.f13642b.mo69441toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo69434toDpu2uoSUM(float f) {
        return this.f13642b.mo69434toDpu2uoSUM(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo69442toSpkPz2Gy4(int i) {
        return this.f13642b.mo69442toSpkPz2Gy4(i);
    }
}
