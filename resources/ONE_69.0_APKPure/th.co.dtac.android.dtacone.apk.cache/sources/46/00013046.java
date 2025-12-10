package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/navigation/NavArgumentBuilder;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$2 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$2 extends Lambda implements Function1<NavArgumentBuilder, Unit> {
    public static final OneConsentAndESignNavGraphKt$oneESignNavGraph$1$2 INSTANCE = new OneConsentAndESignNavGraphKt$oneESignNavGraph$1$2();

    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavArgumentBuilder navArgumentBuilder) {
        invoke2(navArgumentBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
    }
}