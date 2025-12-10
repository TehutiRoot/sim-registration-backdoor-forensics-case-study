package th.p047co.dtac.android.dtacone.view.appOne.eSign.activity;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.compose.ESignTopAppBarKt;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneUpdateAppFormsState;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneUpdateUnifyFormState;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1 */
/* loaded from: classes10.dex */
public final class OneConsentEsignActivity$onCreate$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OneConsentEsignActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneConsentEsignActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentEsignActivity.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/activity/OneConsentEsignActivity$onCreate$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,318:1\n25#2:319\n25#2:330\n1097#3,6:320\n1097#3,3:331\n1100#3,3:337\n486#4,4:326\n490#4,2:334\n494#4:340\n486#5:336\n81#6:341\n81#6:342\n81#6:343\n81#6:344\n81#6:345\n81#6:346\n81#6:347\n*S KotlinDebug\n*F\n+ 1 OneConsentEsignActivity.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/activity/OneConsentEsignActivity$onCreate$1$1\n*L\n105#1:319\n112#1:330\n105#1:320,6\n112#1:331,3\n112#1:337,3\n112#1:326,4\n112#1:334,2\n112#1:340\n112#1:336\n104#1:341\n106#1:342\n107#1:343\n108#1:344\n109#1:345\n110#1:346\n111#1:347\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1 */
    /* loaded from: classes10.dex */
    public static final class C146571 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OneConsentEsignActivity this$0;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C146581 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ State<ValidateDocApproved> $validateDocApproved$delegate;
            final /* synthetic */ OneConsentEsignActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C146581(OneConsentEsignActivity oneConsentEsignActivity, NavHostController navHostController, CoroutineScope coroutineScope, State<ValidateDocApproved> state) {
                super(0);
                this.this$0 = oneConsentEsignActivity;
                this.$navController = navHostController;
                this.$scope = coroutineScope;
                this.$validateDocApproved$delegate = state;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MutableStateFlow mutableStateFlow;
                this.this$0.getViewModel().updateValidateDocApproved(DocumentType.ADD_PHOTO.getDocType(), true);
                if (C146571.invoke$lambda$2(this.$validateDocApproved$delegate).isAllDocumentApproved()) {
                    this.this$0.getViewModel().updateForms();
                } else {
                    OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove$default(C146571.invoke$lambda$2(this.$validateDocApproved$delegate), this.$navController, this.$scope, null, 8, null);
                }
                mutableStateFlow = this.this$0.f90755p;
                mutableStateFlow.setValue(Boolean.FALSE);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$2 */
        /* loaded from: classes10.dex */
        public static final class C146592 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ OneConsentEsignActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C146592(OneConsentEsignActivity oneConsentEsignActivity, NavHostController navHostController) {
                super(0);
                this.this$0 = oneConsentEsignActivity;
                this.$navController = navHostController;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MutableStateFlow mutableStateFlow;
                this.this$0.getViewModel().clearOptionalPhotoName();
                mutableStateFlow = this.this$0.f90755p;
                mutableStateFlow.setValue(Boolean.FALSE);
                NavController.navigate$default(this.$navController, OneESignScreen.ESign.TakePhoto.ROUTE, null, null, 6, null);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$3 */
        /* loaded from: classes10.dex */
        public static final class C146603 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ State<ValidateDocApproved> $validateDocApproved$delegate;
            final /* synthetic */ OneConsentEsignActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$3$1 */
            /* loaded from: classes10.dex */
            public static final class C146611 extends Lambda implements Function0<Unit> {
                final /* synthetic */ OneConsentEsignActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C146611(OneConsentEsignActivity oneConsentEsignActivity) {
                    super(0);
                    this.this$0 = oneConsentEsignActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MutableStateFlow mutableStateFlow;
                    mutableStateFlow = this.this$0.f90755p;
                    mutableStateFlow.setValue(Boolean.FALSE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C146603(OneConsentEsignActivity oneConsentEsignActivity, NavHostController navHostController, CoroutineScope coroutineScope, State<ValidateDocApproved> state) {
                super(0);
                this.this$0 = oneConsentEsignActivity;
                this.$navController = navHostController;
                this.$scope = coroutineScope;
                this.$validateDocApproved$delegate = state;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                UpPassViewModel upPassViewModel;
                this.this$0.getViewModel().setValidateIdCard(false);
                upPassViewModel = this.this$0.f90753n;
                if (upPassViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                    upPassViewModel = null;
                }
                upPassViewModel.resetFormState();
                if (C146571.invoke$lambda$2(this.$validateDocApproved$delegate).isAllDocumentApproved()) {
                    this.this$0.getViewModel().updateForms();
                } else {
                    OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(C146571.invoke$lambda$2(this.$validateDocApproved$delegate), this.$navController, this.$scope, new C146611(this.this$0));
                }
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nOneConsentEsignActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentEsignActivity.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/activity/OneConsentEsignActivity$onCreate$1$1$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,318:1\n154#2:319\n*S KotlinDebug\n*F\n+ 1 OneConsentEsignActivity.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/activity/OneConsentEsignActivity$onCreate$1$1$4\n*L\n179#1:319\n*E\n"})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$4 */
        /* loaded from: classes10.dex */
        public static final class C146624 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ State<NavBackStackEntry> $navBackStackEntry$delegate;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ MutableState<Boolean> $previewPdf;
            final /* synthetic */ OneConsentEsignActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$4$1 */
            /* loaded from: classes10.dex */
            public static final class C146631 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ State<NavBackStackEntry> $navBackStackEntry$delegate;
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ MutableState<Boolean> $previewPdf;
                final /* synthetic */ OneConsentEsignActivity this$0;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$4$1$1 */
                /* loaded from: classes10.dex */
                public static final class C146641 extends Lambda implements Function0<Unit> {
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ MutableState<Boolean> $previewPdf;
                    final /* synthetic */ OneConsentEsignActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C146641(NavHostController navHostController, MutableState<Boolean> mutableState, OneConsentEsignActivity oneConsentEsignActivity) {
                        super(0);
                        this.$navController = navHostController;
                        this.$previewPdf = mutableState;
                        this.this$0 = oneConsentEsignActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        NavDestination destination;
                        NavBackStackEntry previousBackStackEntry = this.$navController.getPreviousBackStackEntry();
                        String route = (previousBackStackEntry == null || (destination = previousBackStackEntry.getDestination()) == null) ? null : destination.getRoute();
                        if (this.$previewPdf.getValue().booleanValue()) {
                            this.$previewPdf.setValue(Boolean.FALSE);
                        } else if (this.$navController.getPreviousBackStackEntry() != null) {
                            if (Intrinsics.areEqual(route, OneESignScreen.ESign.QRScan.ROUTE)) {
                                this.this$0.getViewModel().setClearVerifyQrCodeState();
                            }
                            this.this$0.onBackPressedDispatcher().onBackPressed();
                        } else {
                            this.this$0.finish();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C146631(NavHostController navHostController, State<NavBackStackEntry> state, MutableState<Boolean> mutableState, OneConsentEsignActivity oneConsentEsignActivity) {
                    super(2);
                    this.$navController = navHostController;
                    this.$navBackStackEntry$delegate = state;
                    this.$previewPdf = mutableState;
                    this.this$0 = oneConsentEsignActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer, int i) {
                    NavDestination destination;
                    NavDestination destination2;
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1517464483, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneConsentEsignActivity.kt:180)");
                    }
                    NavBackStackEntry invoke$lambda$0 = C146571.invoke$lambda$0(this.$navBackStackEntry$delegate);
                    String str = (invoke$lambda$0 == null || (destination2 = invoke$lambda$0.getDestination()) == null || (str = destination2.getRoute()) == null) ? "" : "";
                    NavBackStackEntry previousBackStackEntry = this.$navController.getPreviousBackStackEntry();
                    ESignTopAppBarKt.ESignTopAppBar(str, (previousBackStackEntry == null || (destination = previousBackStackEntry.getDestination()) == null) ? null : destination.getRoute(), new C146641(this.$navController, this.$previewPdf, this.this$0), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C146624(NavHostController navHostController, State<NavBackStackEntry> state, MutableState<Boolean> mutableState, OneConsentEsignActivity oneConsentEsignActivity) {
                super(2);
                this.$navController = navHostController;
                this.$navBackStackEntry$delegate = state;
                this.$previewPdf = mutableState;
                this.this$0 = oneConsentEsignActivity;
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
                    ComposerKt.traceEventStart(178988830, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OneConsentEsignActivity.kt:176)");
                }
                SurfaceKt.m70812SurfaceT9BRK9s(null, null, Color.Companion.m71954getTransparent0d7_KjU(), 0L, 0.0f, C3623Dp.m73842constructorimpl(8), null, ComposableLambdaKt.composableLambda(composer, 1517464483, true, new C146631(this.$navController, this.$navBackStackEntry$delegate, this.$previewPdf, this.this$0)), composer, 12779904, 91);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$5 */
        /* loaded from: classes10.dex */
        public static final class C146655 extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ MutableState<Boolean> $previewPdf;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ State<ValidateDocApproved> $validateDocApproved$delegate;
            final /* synthetic */ OneConsentEsignActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$5$1 */
            /* loaded from: classes10.dex */
            public static final class C146661 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ PaddingValues $paddingValues;
                final /* synthetic */ MutableState<Boolean> $previewPdf;
                final /* synthetic */ CoroutineScope $scope;
                final /* synthetic */ State<ValidateDocApproved> $validateDocApproved$delegate;
                final /* synthetic */ OneConsentEsignActivity this$0;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$onCreate$1$1$5$1$1 */
                /* loaded from: classes10.dex */
                public static final class C146671 extends Lambda implements Function0<Unit> {
                    final /* synthetic */ OneConsentEsignActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C146671(OneConsentEsignActivity oneConsentEsignActivity) {
                        super(0);
                        this.this$0 = oneConsentEsignActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableStateFlow mutableStateFlow;
                        mutableStateFlow = this.this$0.f90755p;
                        mutableStateFlow.setValue(Boolean.TRUE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C146661(OneConsentEsignActivity oneConsentEsignActivity, PaddingValues paddingValues, NavHostController navHostController, MutableState<Boolean> mutableState, CoroutineScope coroutineScope, State<ValidateDocApproved> state) {
                    super(2);
                    this.this$0 = oneConsentEsignActivity;
                    this.$paddingValues = paddingValues;
                    this.$navController = navHostController;
                    this.$previewPdf = mutableState;
                    this.$scope = coroutineScope;
                    this.$validateDocApproved$delegate = state;
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
                        ComposerKt.traceEventStart(1251135182, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneConsentEsignActivity.kt:210)");
                    }
                    this.this$0.m14337d0(PaddingKt.padding(Modifier.Companion, this.$paddingValues), this.$navController, this.$previewPdf, C146571.invoke$lambda$2(this.$validateDocApproved$delegate), new C146671(this.this$0), this.$scope, composer, 2363840);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C146655(OneConsentEsignActivity oneConsentEsignActivity, NavHostController navHostController, MutableState<Boolean> mutableState, CoroutineScope coroutineScope, State<ValidateDocApproved> state) {
                super(3);
                this.this$0 = oneConsentEsignActivity;
                this.$navController = navHostController;
                this.$previewPdf = mutableState;
                this.$scope = coroutineScope;
                this.$validateDocApproved$delegate = state;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i) {
                int i2;
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 14) == 0) {
                    i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-892726477, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OneConsentEsignActivity.kt:206)");
                }
                SurfaceKt.m70812SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, Color.Companion.m71956getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1251135182, true, new C146661(this.this$0, paddingValues, this.$navController, this.$previewPdf, this.$scope, this.$validateDocApproved$delegate)), composer, 12583302, 122);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146571(OneConsentEsignActivity oneConsentEsignActivity) {
            super(2);
            this.this$0 = oneConsentEsignActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavBackStackEntry invoke$lambda$0(State<NavBackStackEntry> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ValidateDocApproved invoke$lambda$2(State<ValidateDocApproved> state) {
            return state.getValue();
        }

        private static final boolean invoke$lambda$3(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$4(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        private static final ValidateDocApproved invoke$lambda$5(State<ValidateDocApproved> state) {
            return state.getValue();
        }

        private static final OneUpdateAppFormsState invoke$lambda$6(State<? extends OneUpdateAppFormsState> state) {
            return state.getValue();
        }

        private static final OneUpdateUnifyFormState invoke$lambda$7(State<? extends OneUpdateUnifyFormState> state) {
            return state.getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            StateFlow stateFlow;
            CoroutineScope coroutineScope;
            State state;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1534914914, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity.onCreate.<anonymous>.<anonymous> (OneConsentEsignActivity.kt:101)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            State<NavBackStackEntry> currentBackStackEntryAsState = NavHostControllerKt.currentBackStackEntryAsState(rememberNavController, composer, 8);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getViewModel().getValidateDocApproved(), null, composer, 8, 1);
            State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getViewModel().getValidateIDCard(), null, composer, 8, 1);
            stateFlow = this.this$0.f90756q;
            State collectAsState3 = SnapshotStateKt.collectAsState(stateFlow, null, composer, 8, 1);
            State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getViewModel().getValidateDocUpload(), null, composer, 8, 1);
            State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getViewModel().getUpdateAppFormState(), null, composer, 8, 1);
            State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getViewModel().getUpdateUnifyFormState(), null, composer, 8, 1);
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(400961798);
            if (invoke$lambda$4(collectAsState3)) {
                coroutineScope = coroutineScope2;
                state = collectAsState;
                OneDialogKt.OneDialogChooser(StringResources_androidKt.stringResource(R.string.prepaid_take_more_photo, composer, 0), StringResources_androidKt.stringResource(R.string.nextStep, composer, 0), StringResources_androidKt.stringResource(R.string.takeMorePhoto, composer, 0), new C146581(this.this$0, rememberNavController, coroutineScope2, collectAsState), new C146592(this.this$0, rememberNavController), composer, 0, 0);
            } else {
                coroutineScope = coroutineScope2;
                state = collectAsState;
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(400963244);
            if (invoke$lambda$3(collectAsState2)) {
                OneDialogKt.OneDialogMessage(StringResources_androidKt.stringResource(R.string.one_unify_validate_id_card_error, composer, 0), new C146603(this.this$0, rememberNavController, coroutineScope, state), StringResources_androidKt.stringResource(R.string.ok, composer, 0), composer, 0, 0);
            }
            composer.endReplaceableGroup();
            OneConsentAndESignNavGraphKt.NavigateUpload(invoke$lambda$6(collectAsState5), invoke$lambda$5(collectAsState4), invoke$lambda$2(state), rememberNavController, this.this$0.getViewModel(), invoke$lambda$7(collectAsState6), coroutineScope, composer, 2134592);
            ScaffoldKt.m70701ScaffoldTvnljyQ(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m71956getWhite0d7_KjU(), null, 2, null), ComposableLambdaKt.composableLambda(composer, 178988830, true, new C146624(rememberNavController, currentBackStackEntryAsState, mutableState, this.this$0)), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(composer, -892726477, true, new C146655(this.this$0, rememberNavController, mutableState, coroutineScope, state)), composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentEsignActivity$onCreate$1(OneConsentEsignActivity oneConsentEsignActivity) {
        super(2);
        this.this$0 = oneConsentEsignActivity;
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
            ComposerKt.traceEventStart(-1768861900, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity.onCreate.<anonymous> (OneConsentEsignActivity.kt:100)");
        }
        ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableLambdaKt.composableLambda(composer, 1534914914, true, new C146571(this.this$0)), composer, 390, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}