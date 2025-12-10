package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.layout.ContentScale */
/* loaded from: classes2.dex */
public interface ContentScale {
    @NotNull
    public static final Companion Companion = Companion.f30138a;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\bR \u0010!\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006&"}, m29142d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/ContentScale;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/layout/ContentScale;", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "Crop", OperatorName.CURVE_TO, "getFit", "getFit$annotations", "Fit", "d", "getFillHeight", "getFillHeight$annotations", "FillHeight", "e", "getFillWidth", "getFillWidth$annotations", "FillWidth", OperatorName.FILL_NON_ZERO, "getInside", "getInside$annotations", "Inside", "Landroidx/compose/ui/layout/FixedScale;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/layout/FixedScale;", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "None", OperatorName.CLOSE_PATH, "getFillBounds", "getFillBounds$annotations", "FillBounds", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.layout.ContentScale$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f30138a = new Companion();

        /* renamed from: b */
        public static final ContentScale f30139b = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo72990computeScaleFactorH7hwNQA(long j, long j2) {
                float m72992access$computeFillMaxDimensioniLBOSCw = ContentScaleKt.m72992access$computeFillMaxDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m72992access$computeFillMaxDimensioniLBOSCw, m72992access$computeFillMaxDimensioniLBOSCw);
            }
        };

        /* renamed from: c */
        public static final ContentScale f30140c = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo72990computeScaleFactorH7hwNQA(long j, long j2) {
                float m72993access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m72993access$computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m72993access$computeFillMinDimensioniLBOSCw, m72993access$computeFillMinDimensioniLBOSCw);
            }
        };

        /* renamed from: d */
        public static final ContentScale f30141d = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo72990computeScaleFactorH7hwNQA(long j, long j2) {
                float m72991access$computeFillHeightiLBOSCw = ContentScaleKt.m72991access$computeFillHeightiLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m72991access$computeFillHeightiLBOSCw, m72991access$computeFillHeightiLBOSCw);
            }
        };

        /* renamed from: e */
        public static final ContentScale f30142e = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo72990computeScaleFactorH7hwNQA(long j, long j2) {
                float m72994access$computeFillWidthiLBOSCw = ContentScaleKt.m72994access$computeFillWidthiLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m72994access$computeFillWidthiLBOSCw, m72994access$computeFillWidthiLBOSCw);
            }
        };

        /* renamed from: f */
        public static final ContentScale f30143f = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo72990computeScaleFactorH7hwNQA(long j, long j2) {
                if (Size.m71755getWidthimpl(j) <= Size.m71755getWidthimpl(j2) && Size.m71752getHeightimpl(j) <= Size.m71752getHeightimpl(j2)) {
                    return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                }
                float m72993access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m72993access$computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m72993access$computeFillMinDimensioniLBOSCw, m72993access$computeFillMinDimensioniLBOSCw);
            }
        };

        /* renamed from: g */
        public static final FixedScale f30144g = new FixedScale(1.0f);

        /* renamed from: h */
        public static final ContentScale f30145h = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo72990computeScaleFactorH7hwNQA(long j, long j2) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m72994access$computeFillWidthiLBOSCw(j, j2), ContentScaleKt.m72991access$computeFillHeightiLBOSCw(j, j2));
            }
        };

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @NotNull
        public final ContentScale getCrop() {
            return f30139b;
        }

        @NotNull
        public final ContentScale getFillBounds() {
            return f30145h;
        }

        @NotNull
        public final ContentScale getFillHeight() {
            return f30141d;
        }

        @NotNull
        public final ContentScale getFillWidth() {
            return f30142e;
        }

        @NotNull
        public final ContentScale getFit() {
            return f30140c;
        }

        @NotNull
        public final ContentScale getInside() {
            return f30143f;
        }

        @NotNull
        public final FixedScale getNone() {
            return f30144g;
        }
    }

    /* renamed from: computeScaleFactor-H7hwNQA  reason: not valid java name */
    long mo72990computeScaleFactorH7hwNQA(long j, long j2);
}