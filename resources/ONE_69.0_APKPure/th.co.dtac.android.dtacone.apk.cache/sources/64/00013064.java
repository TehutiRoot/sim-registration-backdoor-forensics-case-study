package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneConsentAndESignNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,755:1\n76#2:756\n81#3:757\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7\n*L\n394#1:756\n395#1:757\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7$1 */
    /* loaded from: classes10.dex */
    public static final class C146941 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146941(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Context context = this.$context;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7(OneConsentAndESignViewModel oneConsentAndESignViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneConsentAndESignViewModel;
        this.$navController = navController;
    }

    private static final CompanyThemes invoke$lambda$0(State<? extends CompanyThemes> state) {
        return state.getValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.ROUTE) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.ConsentTMN.ROUTE) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.BlackList.ROUTE) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.Consent.ROUTE) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.Signature.ROUTE) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.QRScan.ROUTE) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        r12.startReplaceableGroup(1033444620);
        r7 = androidx.compose.p003ui.res.StringResources_androidKt.stringResource(th.p047co.dtac.android.dtacone.R.string.one_signature_success_title, r12, 0);
        r12.endReplaceableGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.ROUTE) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.ConsentTMN.ROUTE) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.BlackList.ROUTE) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.Consent.ROUTE) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.Signature.ROUTE) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
        if (r1.equals(th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen.ESign.QRScan.ROUTE) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
        r11 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.animation.AnimatedContentScope r10, @org.jetbrains.annotations.NotNull androidx.navigation.NavBackStackEntry r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$7.invoke(androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, int):void");
    }
}