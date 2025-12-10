package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000A\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001c\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\n*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\"\u001d\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u001b\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\" \u0010&\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u001a\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m28850d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "(IFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getDefaultPositionThreshold", "()F", "DefaultPositionThreshold", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getEmptyLayoutInfo$annotations", "()V", "EmptyLayoutInfo", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", OperatorName.CURVE_TO, "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "UnitDensity", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "d", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart$annotations", "SnapAlignmentStartToStart", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n67#2,3:685\n66#2:688\n50#2:695\n49#2:696\n1097#3,6:689\n1097#3,6:697\n154#4:703\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n79#1:685,3\n79#1:688\n118#1:695\n118#1:696\n79#1:689,6\n118#1:697,6\n652#1:703\n*E\n"})
/* loaded from: classes.dex */
public final class PagerStateKt {

    /* renamed from: a */
    public static final float f13912a = C3641Dp.m73658constructorimpl(56);

    /* renamed from: b */
    public static final PagerLayoutInfo f13913b = new PagerLayoutInfo() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1

        /* renamed from: b */
        public final PageInfo f13918b;

        /* renamed from: c */
        public final int f13919c;

        /* renamed from: d */
        public final int f13920d;

        /* renamed from: e */
        public final int f13921e;

        /* renamed from: f */
        public final int f13922f;

        /* renamed from: g */
        public final int f13923g;

        /* renamed from: j */
        public final int f13926j;

        /* renamed from: k */
        public final int f13927k;

        /* renamed from: l */
        public final boolean f13928l;

        /* renamed from: a */
        public final List f13917a = CollectionsKt__CollectionsKt.emptyList();

        /* renamed from: h */
        public final long f13924h = IntSize.Companion.m73823getZeroYbymL2g();

        /* renamed from: i */
        public final Orientation f13925i = Orientation.Horizontal;

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getAfterContentPadding() {
            return this.f13923g;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getBeforeContentPadding() {
            return this.f13922f;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        @Nullable
        public PageInfo getClosestPageToSnapPosition() {
            return this.f13918b;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        @NotNull
        public Orientation getOrientation() {
            return this.f13925i;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSize() {
            return this.f13920d;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPageSpacing() {
            return this.f13921e;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getPagesCount() {
            return this.f13919c;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public boolean getReverseLayout() {
            return this.f13928l;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportEndOffset() {
            return this.f13927k;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        /* renamed from: getViewportSize-YbymL2g */
        public long mo69679getViewportSizeYbymL2g() {
            return this.f13924h;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        public int getViewportStartOffset() {
            return this.f13926j;
        }

        @Override // androidx.compose.foundation.pager.PagerLayoutInfo
        @NotNull
        public List<PageInfo> getVisiblePagesInfo() {
            return this.f13917a;
        }
    };

    /* renamed from: c */
    public static final PagerStateKt$UnitDensity$1 f13914c = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1

        /* renamed from: a */
        public final float f13929a = 1.0f;

        /* renamed from: b */
        public final float f13930b = 1.0f;

        @Override // androidx.compose.p003ui.unit.Density
        public float getDensity() {
            return this.f13929a;
        }

        @Override // androidx.compose.p003ui.unit.Density
        public float getFontScale() {
            return this.f13930b;
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo69431roundToPxR2X_6o(long j) {
            return AbstractC11522jG.m29253a(this, j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo69432roundToPx0680j_4(float f) {
            return AbstractC11522jG.m29252b(this, f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo69433toDpGaN1DYA(long j) {
            return AbstractC11522jG.m29251c(this, j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo69434toDpu2uoSUM(float f) {
            return AbstractC11522jG.m29250d(this, f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo69436toDpSizekrfVVM(long j) {
            return AbstractC11522jG.m29248f(this, j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo69437toPxR2X_6o(long j) {
            return AbstractC11522jG.m29247g(this, j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo69438toPx0680j_4(float f) {
            return AbstractC11522jG.m29246h(this, f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return AbstractC11522jG.m29245i(this, dpRect);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo69439toSizeXkaWNTQ(long j) {
            return AbstractC11522jG.m29244j(this, j);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo69440toSp0xMU5do(float f) {
            return AbstractC11522jG.m29243k(this, f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo69441toSpkPz2Gy4(float f) {
            return AbstractC11522jG.m29242l(this, f);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo69435toDpu2uoSUM(int i) {
            return AbstractC11522jG.m29249e(this, i);
        }

        @Override // androidx.compose.p003ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo69442toSpkPz2Gy4(int i) {
            return AbstractC11522jG.m29241m(this, i);
        }
    };

    /* renamed from: d */
    public static final SnapPositionInLayout f13915d = C2966a.f13916a;

    /* renamed from: androidx.compose.foundation.pager.PagerStateKt$a */
    /* loaded from: classes.dex */
    public static final class C2966a implements SnapPositionInLayout {

        /* renamed from: a */
        public static final C2966a f13916a = new C2966a();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
        public final int position(Density SnapPositionInLayout, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(SnapPositionInLayout, "$this$SnapPositionInLayout");
            return 0;
        }
    }

    @Nullable
    public static final Object animateToNextPage(@NotNull PagerState pagerState, @NotNull Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 < pagerState.getPageCount()) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
            if (animateScrollToPage$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateScrollToPage$default;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object animateToPreviousPage(@NotNull PagerState pagerState, @NotNull Continuation<? super Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 >= 0) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
            if (animateScrollToPage$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateScrollToPage$default;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final float getDefaultPositionThreshold() {
        return f13912a;
    }

    @NotNull
    public static final PagerLayoutInfo getEmptyLayoutInfo() {
        return f13913b;
    }

    public static /* synthetic */ void getEmptyLayoutInfo$annotations() {
    }

    @NotNull
    public static final SnapPositionInLayout getSnapAlignmentStartToStart() {
        return f13915d;
    }

    public static /* synthetic */ void getSnapAlignmentStartToStart$annotations() {
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final PagerState rememberPagerState(int i, float f, @NotNull Function0<Integer> pageCount, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(pageCount, "pageCount");
        composer.startReplaceableGroup(-1210768637);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:73)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i);
        Float valueOf2 = Float.valueOf(f);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(pageCount);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$1$1(i, f, pageCount);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m71406rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        pagerStateImpl.getPageCountState().setValue(pageCount);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "Please use the overload where you can provide a source of truth for the pageCount.", replaceWith = @ReplaceWith(expression = "rememberPagerState(\n                initialPage = initialPage,\n                initialPageOffsetFraction = initialPageOffsetFraction\n            ){\n                // provide pageCount\n            }", imports = {}))
    @Composable
    @ExperimentalFoundationApi
    public static final PagerState rememberPagerState(int i, float f, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(144687223);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(144687223, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:113)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        Integer valueOf = Integer.valueOf(i);
        Float valueOf2 = Float.valueOf(f);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$3$1(i, f);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m71406rememberSaveable(objArr, saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }
}
