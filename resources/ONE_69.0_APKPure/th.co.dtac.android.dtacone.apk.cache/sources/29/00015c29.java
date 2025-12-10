package th.p047co.dtac.android.dtacone.widget.compose.consent;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneButtonKt;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$2$4 */
/* loaded from: classes9.dex */
public final class ConsentScreenKt$ConsentSection$2$4 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $isTrueThemes;
    final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;
    final /* synthetic */ ConsentNonTelco $selectedConsent;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt$ConsentSection$2$4$1 */
    /* loaded from: classes9.dex */
    public static final class C167521 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1<ConsentNonTelco, Unit> $onDecline;
        final /* synthetic */ ConsentNonTelco $selectedConsent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C167521(Function1<? super ConsentNonTelco, Unit> function1, ConsentNonTelco consentNonTelco) {
            super(0);
            this.$onDecline = function1;
            this.$selectedConsent = consentNonTelco;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function1<ConsentNonTelco, Unit> function1 = this.$onDecline;
            ConsentNonTelco consentNonTelco = this.$selectedConsent;
            Intrinsics.checkNotNull(consentNonTelco);
            function1.invoke(consentNonTelco);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentSection$2$4(ConsentNonTelco consentNonTelco, boolean z, Function1<? super ConsentNonTelco, Unit> function1) {
        super(3);
        this.$selectedConsent = consentNonTelco;
        this.$isTrueThemes = z;
        this.$onDecline = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1647505124, i, -1, "th.co.dtac.android.dtacone.widget.compose.consent.ConsentSection.<anonymous>.<anonymous> (ConsentScreen.kt:213)");
        }
        C167521 c167521 = new C167521(this.$onDecline, this.$selectedConsent);
        ConsentNonTelco consentNonTelco = this.$selectedConsent;
        OneButtonKt.OneButtonOutline(c167521, (consentNonTelco == null || (r10 = consentNonTelco.getConsentDecline()) == null) ? "" : "", SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), this.$isTrueThemes, composer, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}