package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope */
/* loaded from: classes2.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs */
        public static void m72159drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            AbstractC12212lK.m26513a(contentDrawScope, image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0 */
        public static long m72160getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            long m26512b;
            m26512b = AbstractC12212lK.m26512b(contentDrawScope);
            return m26512b;
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc */
        public static long m72161getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            long m26511c;
            m26511c = AbstractC12212lK.m26511c(contentDrawScope);
            return m26511c;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o */
        public static int m72162roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            int m29253a;
            m29253a = AbstractC11522jG.m29253a(contentDrawScope, j);
            return m29253a;
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4 */
        public static int m72163roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            int m29252b;
            m29252b = AbstractC11522jG.m29252b(contentDrawScope, f);
            return m29252b;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA */
        public static float m72164toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j) {
            float m29251c;
            m29251c = AbstractC11522jG.m29251c(contentDrawScope, j);
            return m29251c;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m72165toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            float m29250d;
            m29250d = AbstractC11522jG.m29250d(contentDrawScope, f);
            return m29250d;
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM */
        public static long m72167toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j) {
            long m29248f;
            m29248f = AbstractC11522jG.m29248f(contentDrawScope, j);
            return m29248f;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o */
        public static float m72168toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            float m29247g;
            m29247g = AbstractC11522jG.m29247g(contentDrawScope, j);
            return m29247g;
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4 */
        public static float m72169toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            float m29246h;
            m29246h = AbstractC11522jG.m29246h(contentDrawScope, f);
            return m29246h;
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect receiver) {
            Rect m29245i;
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            m29245i = AbstractC11522jG.m29245i(contentDrawScope, receiver);
            return m29245i;
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ */
        public static long m72170toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j) {
            long m29244j;
            m29244j = AbstractC11522jG.m29244j(contentDrawScope, j);
            return m29244j;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do */
        public static long m72171toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            long m29243k;
            m29243k = AbstractC11522jG.m29243k(contentDrawScope, f);
            return m29243k;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m72172toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            long m29242l;
            m29242l = AbstractC11522jG.m29242l(contentDrawScope, f);
            return m29242l;
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM */
        public static float m72166toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            float m29249e;
            m29249e = AbstractC11522jG.m29249e(contentDrawScope, i);
            return m29249e;
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4 */
        public static long m72173toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            long m29241m;
            m29241m = AbstractC11522jG.m29241m(contentDrawScope, i);
            return m29241m;
        }
    }

    void drawContent();
}
