package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassThemeType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$UpPassDemoTopBar$6 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$UpPassDemoTopBar$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CompanyThemes $company;
    final /* synthetic */ int $faceCompareSelectedIndex;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ String $route;
    final /* synthetic */ UpPassThemeType $theme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$UpPassDemoTopBar$6(String str, UpPassThemeType upPassThemeType, CompanyThemes companyThemes, int i, Function0<Unit> function0, int i2, int i3) {
        super(2);
        this.$route = str;
        this.$theme = upPassThemeType;
        this.$company = companyThemes;
        this.$faceCompareSelectedIndex = i;
        this.$onBack = function0;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        UpPassDemoTopBarKt.UpPassDemoTopBar(this.$route, this.$theme, this.$company, this.$faceCompareSelectedIndex, this.$onBack, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}