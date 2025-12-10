package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity;

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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$bindingComposeView$1$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidRegistrationActivity$bindingComposeView$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OnePrepaidRegistrationActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$bindingComposeView$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C150791 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OnePrepaidRegistrationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C150791(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
            super(2);
            this.this$0 = onePrepaidRegistrationActivity;
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
                ComposerKt.traceEventStart(337518657, i, -1, "th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity.bindingComposeView.<anonymous>.<anonymous>.<anonymous> (OnePrepaidRegistrationActivity.kt:209)");
            }
            this.this$0.ComposeContent(composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidRegistrationActivity$bindingComposeView$1$1(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
        super(2);
        this.this$0 = onePrepaidRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        CompanyThemes companyThemes;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(552325395, i, -1, "th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity.bindingComposeView.<anonymous>.<anonymous> (OnePrepaidRegistrationActivity.kt:203)");
        }
        if (this.this$0.getViewModel().isTrue()) {
            companyThemes = CompanyThemes.ONE_TRUE;
        } else {
            companyThemes = CompanyThemes.ONE_DTAC;
        }
        ThemeKt.OneTheme(companyThemes, false, ComposableLambdaKt.composableLambda(composer, 337518657, true, new C150791(this.this$0)), composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}