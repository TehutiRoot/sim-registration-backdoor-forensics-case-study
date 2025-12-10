package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.activity;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity$bindingComposeView$1$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationActivity$bindingComposeView$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OneOnlineRegistrationActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity$bindingComposeView$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C148071 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OneOnlineRegistrationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C148071(OneOnlineRegistrationActivity oneOnlineRegistrationActivity) {
            super(2);
            this.this$0 = oneOnlineRegistrationActivity;
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
                ComposerKt.traceEventStart(127901956, i, -1, "th.co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity.bindingComposeView.<anonymous>.<anonymous>.<anonymous> (OneOnlineRegistrationActivity.kt:118)");
            }
            this.this$0.ComposeContent(composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationActivity$bindingComposeView$1$1(OneOnlineRegistrationActivity oneOnlineRegistrationActivity) {
        super(2);
        this.this$0 = oneOnlineRegistrationActivity;
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
            ComposerKt.traceEventStart(1376535510, i, -1, "th.co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity.bindingComposeView.<anonymous>.<anonymous> (OneOnlineRegistrationActivity.kt:117)");
        }
        ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableLambdaKt.composableLambda(composer, 127901956, true, new C148071(this.this$0)), composer, 390, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}