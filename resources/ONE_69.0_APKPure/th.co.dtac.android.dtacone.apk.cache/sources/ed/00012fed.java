package th.p047co.dtac.android.dtacone.view.appOne.eSign.activity;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$ConsentAndESignScreen$3$1 */
/* loaded from: classes10.dex */
public final class OneConsentEsignActivity$ConsentAndESignScreen$3$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
    final /* synthetic */ int $durationMillis;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$ConsentAndESignScreen$3$1$1 */
    /* loaded from: classes10.dex */
    public static final class C146541 extends Lambda implements Function1<Integer, Integer> {
        public static final C146541 INSTANCE = new C146541();

        public C146541() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final Integer invoke(int i) {
            return Integer.valueOf(-i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentEsignActivity$ConsentAndESignScreen$3$1(int i) {
        super(1);
        this.$durationMillis = i;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final EnterTransition invoke(@NotNull AnimatedContentTransitionScope<NavBackStackEntry> NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(this.$durationMillis, 0, null, 6, null), C146541.INSTANCE);
    }
}