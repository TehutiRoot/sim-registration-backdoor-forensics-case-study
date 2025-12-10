package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.geometry.RoundRectKt;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$LanguageSection$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1296:1\n1#2:1297\n154#3:1298\n154#3:1299\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$LanguageSection$1$1$1\n*L\n543#1:1298\n544#1:1299\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$LanguageSection$1$1$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$LanguageSection$1$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $bgPosition$delegate;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ Density $density;
    final /* synthetic */ float $eachWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$LanguageSection$1$1$1(Density density, float f, float f2, State<Float> state) {
        super(1);
        this.$density = density;
        this.$eachWidth = f;
        this.$borderWidth = f2;
        this.$bgPosition$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope drawBehind) {
        float m9498w;
        float m9498w2;
        float m9498w3;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float mo69622toPx0680j_4 = this.$density.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(3));
        float mo69622toPx0680j_42 = this.$density.mo69622toPx0680j_4(C3623Dp.m73842constructorimpl(48));
        long CornerRadius = CornerRadiusKt.CornerRadius(mo69622toPx0680j_4, mo69622toPx0680j_4);
        Path Path = AndroidPath_androidKt.Path();
        float f = this.$borderWidth;
        float f2 = this.$eachWidth;
        m9498w = InputInfoScreenKt.m9498w(this.$bgPosition$delegate);
        Path.addRoundRect(RoundRectKt.m71738RoundRectZAM2FJo(RectKt.m71726Recttz77jQw(OffsetKt.Offset(m9498w + f, f), SizeKt.Size(f2, mo69622toPx0680j_42 - (f * 2.0f))), CornerRadius, CornerRadius, CornerRadius, CornerRadius));
        Brush.Companion companion = Brush.Companion;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m71909boximpl(ColorKt.Color(4278197588L)), Color.m71909boximpl(ColorKt.Color(4278605549L))});
        m9498w2 = InputInfoScreenKt.m9498w(this.$bgPosition$delegate);
        long Offset = OffsetKt.Offset(m9498w2, mo69622toPx0680j_42);
        m9498w3 = InputInfoScreenKt.m9498w(this.$bgPosition$delegate);
        AbstractC12264mK.m26710F(drawBehind, Path, Brush.Companion.m71876linearGradientmHitzGk$default(companion, listOf, Offset, OffsetKt.Offset(m9498w3 + this.$eachWidth, 0.0f), 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
    }
}