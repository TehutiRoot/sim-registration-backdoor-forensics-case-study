package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.compose.common.AutoResizeTextKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSelectOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$ThemeButton$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,620:1\n1726#2,3:621\n154#3:624\n154#3:626\n154#3:627\n154#3:628\n154#3:629\n76#4:625\n*S KotlinDebug\n*F\n+ 1 SelectOptionsScreen.kt\nth/co/dtac/android/dtacone/view/fragment/upPass/compose/SelectOptionsScreenKt$ThemeButton$1\n*L\n357#1:621,3\n358#1:624\n366#1:626\n369#1:627\n371#1:628\n381#1:629\n359#1:625\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$ThemeButton$1 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$ThemeButton$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<Color> $colors;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectOptionsScreenKt$ThemeButton$1(String str, int i, List<Color> list) {
        super(2);
        this.$title = str;
        this.$$dirty = i;
        this.$colors = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        boolean z;
        Modifier background$default;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1383966499, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.compose.ThemeButton.<anonymous> (SelectOptionsScreen.kt:349)");
        }
        AutoResizeTextKt.m75305AutoResizeTextww6aTOc(this.$title, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), composer, (this.$$dirty >> 3) & 14, 2);
        List<Color> list = this.$colors;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (ColorKt.m71970luminance8_81llA(((Color) it.next()).m71929unboximpl()) <= 0.5d) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(32);
        float mo69622toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo69622toPx0680j_4(m73842constructorimpl);
        composer.startReplaceableGroup(-937009844);
        if (z) {
            float f = 8;
            background$default = BorderKt.m69512borderxT4_qwU(BackgroundKt.background$default(Modifier.Companion, Brush.Companion.m71874horizontalGradient8A3gB4$default(Brush.Companion, this.$colors, 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f)), 0.0f, 4, null), C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f)));
        } else {
            background$default = BackgroundKt.background$default(Modifier.Companion, Brush.Companion.m71876linearGradientmHitzGk$default(Brush.Companion, this.$colors, OffsetKt.Offset(0.0f, 0.0f), OffsetKt.Offset(mo69622toPx0680j_4, mo69622toPx0680j_4), 0, 8, (Object) null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8)), 0.0f, 4, null);
        }
        composer.endReplaceableGroup();
        BoxKt.Box(SizeKt.m69748size3ABfNKs(background$default, m73842constructorimpl), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}