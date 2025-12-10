package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassThemeType;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.UpPassDemoScreen;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt$UpPassDemoScreen$6 */
/* loaded from: classes10.dex */
public final class UpPassDemoScreenKt$UpPassDemoScreen$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ CompanyThemes $companyThemeType;
    final /* synthetic */ int $faceCompareSelectedIndex;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ String $route;
    final /* synthetic */ UpPassThemeType $upPassThemeType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoScreenKt$UpPassDemoScreen$6(String str, UpPassThemeType upPassThemeType, CompanyThemes companyThemes, int i, Function0<Unit> function0, int i2, int i3) {
        super(2);
        this.$route = str;
        this.$upPassThemeType = upPassThemeType;
        this.$companyThemeType = companyThemes;
        this.$faceCompareSelectedIndex = i;
        this.$onBack = function0;
        this.$$dirty = i2;
        this.$$dirty1 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1385945674, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreen.<anonymous> (UpPassDemoScreen.kt:63)");
        }
        String str = this.$route;
        if (str == null) {
            str = UpPassDemoScreen.UpPassDemo.ROUTE;
        }
        UpPassDemoTopBarKt.UpPassDemoTopBar(str, this.$upPassThemeType, this.$companyThemeType, this.$faceCompareSelectedIndex, this.$onBack, composer, (this.$$dirty & 7168) | ((this.$$dirty1 >> 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}