package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.unit.C3623Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInstallAppointmentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallAppointmentScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallAppointmentScreenKt$InstallTimeButton$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,576:1\n154#2:577\n154#2:578\n154#2:579\n154#2:580\n*S KotlinDebug\n*F\n+ 1 InstallAppointmentScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallAppointmentScreenKt$InstallTimeButton$1$1\n*L\n448#1:577\n449#1:578\n450#1:579\n451#1:580\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallTimeButton$1$1 */
/* loaded from: classes10.dex */
public final class InstallAppointmentScreenKt$InstallTimeButton$1$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ long $borderColor;
    final /* synthetic */ int $enumIndex;
    final /* synthetic */ int $enumSize;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallTimeButton$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C154991 extends Lambda implements Function1<ContentDrawScope, Unit> {
        final /* synthetic */ long $borderColor;
        final /* synthetic */ float $borderStroke;
        final /* synthetic */ float $bottomPosition;
        final /* synthetic */ float $cornerSize;
        final /* synthetic */ int $enumIndex;
        final /* synthetic */ int $enumSize;
        final /* synthetic */ float $leftPosition;
        final /* synthetic */ float $rightPosition;
        final /* synthetic */ float $topPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154991(int i, float f, int i2, long j, float f2, float f3, float f4, float f5, float f6) {
            super(1);
            this.$enumIndex = i;
            this.$cornerSize = f;
            this.$enumSize = i2;
            this.$borderColor = j;
            this.$topPosition = f2;
            this.$borderStroke = f3;
            this.$bottomPosition = f4;
            this.$leftPosition = f5;
            this.$rightPosition = f6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.drawContent();
            float f = this.$enumIndex == 0 ? this.$cornerSize : 0.0f;
            float m71755getWidthimpl = Size.m71755getWidthimpl(onDrawWithContent.mo72328getSizeNHjbRc()) - (this.$enumIndex == this.$enumSize + (-1) ? this.$cornerSize : 0.0f);
            AbstractC12264mK.m26713C(onDrawWithContent, this.$borderColor, OffsetKt.Offset(f, this.$topPosition), OffsetKt.Offset(m71755getWidthimpl, this.$topPosition), this.$borderStroke, 0, null, 0.0f, null, 0, 496, null);
            AbstractC12264mK.m26713C(onDrawWithContent, this.$borderColor, OffsetKt.Offset(f, this.$bottomPosition), OffsetKt.Offset(m71755getWidthimpl, this.$bottomPosition), this.$borderStroke, 0, null, 0.0f, null, 0, 496, null);
            if (this.$enumIndex == 0) {
                AbstractC12264mK.m26713C(onDrawWithContent, this.$borderColor, OffsetKt.Offset(this.$leftPosition, this.$topPosition + this.$cornerSize), OffsetKt.Offset(this.$leftPosition, this.$bottomPosition - this.$cornerSize), this.$borderStroke, 0, null, 0.0f, null, 0, 496, null);
                long j = this.$borderColor;
                long Offset = OffsetKt.Offset(this.$leftPosition, this.$topPosition);
                float f2 = this.$cornerSize;
                AbstractC12264mK.m26681v(onDrawWithContent, j, -180.0f, 90.0f, false, Offset, SizeKt.Size(f2 * 2.0f, f2 * 2.0f), 0.0f, new Stroke(this.$borderStroke, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
                long j2 = this.$borderColor;
                long Offset2 = OffsetKt.Offset(this.$leftPosition, this.$bottomPosition - (this.$cornerSize * 2.0f));
                float f3 = this.$cornerSize;
                AbstractC12264mK.m26681v(onDrawWithContent, j2, 90.0f, 90.0f, false, Offset2, SizeKt.Size(f3 * 2.0f, f3 * 2.0f), 0.0f, new Stroke(this.$borderStroke, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            }
            if (this.$enumIndex == this.$enumSize - 1) {
                AbstractC12264mK.m26713C(onDrawWithContent, this.$borderColor, OffsetKt.Offset(this.$rightPosition, this.$topPosition + this.$cornerSize), OffsetKt.Offset(this.$rightPosition, this.$bottomPosition - this.$cornerSize), this.$borderStroke, 0, null, 0.0f, null, 0, 496, null);
                long j3 = this.$borderColor;
                long Offset3 = OffsetKt.Offset(this.$rightPosition - (this.$cornerSize * 2.0f), this.$topPosition);
                float f4 = this.$cornerSize;
                AbstractC12264mK.m26681v(onDrawWithContent, j3, -90.0f, 90.0f, false, Offset3, SizeKt.Size(f4 * 2.0f, f4 * 2.0f), 0.0f, new Stroke(this.$borderStroke, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
                long j4 = this.$borderColor;
                float f5 = this.$rightPosition;
                float f6 = this.$cornerSize;
                long Offset4 = OffsetKt.Offset(f5 - (f6 * 2.0f), this.$bottomPosition - (f6 * 2.0f));
                float f7 = this.$cornerSize;
                AbstractC12264mK.m26681v(onDrawWithContent, j4, 0.0f, 90.0f, false, Offset4, SizeKt.Size(f7 * 2.0f, f7 * 2.0f), 0.0f, new Stroke(this.$borderStroke, 0.0f, 0, 0, null, 30, null), null, 0, 832, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallAppointmentScreenKt$InstallTimeButton$1$1(int i, int i2, long j) {
        super(1);
        this.$enumIndex = i;
        this.$enumSize = i2;
        this.$borderColor = j;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float mo69622toPx0680j_4 = drawWithCache.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(1));
        float f = mo69622toPx0680j_4 / 2.0f;
        return drawWithCache.onDrawWithContent(new C154991(this.$enumIndex, drawWithCache.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(6)), this.$enumSize, this.$borderColor, drawWithCache.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(3)) + f, mo69622toPx0680j_4, (Size.m71752getHeightimpl(drawWithCache.m71607getSizeNHjbRc()) - drawWithCache.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(4))) - f, mo69622toPx0680j_4, Size.m71755getWidthimpl(drawWithCache.m71607getSizeNHjbRc()) - (1.5f * mo69622toPx0680j_4)));
    }
}