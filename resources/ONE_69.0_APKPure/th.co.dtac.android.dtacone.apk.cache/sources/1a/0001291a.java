package th.p047co.dtac.android.dtacone.view.activity.upPass;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavHostControllerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassThemeType;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoScreenKt;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.UpPassDemoScreen;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUpPassDemoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassDemoActivity.kt\nth/co/dtac/android/dtacone/view/activity/upPass/UpPassDemoActivity$onCreate$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,211:1\n81#2:212\n81#2:213\n81#2:214\n81#2:215\n81#2:216\n81#2:217\n81#2:218\n81#2:219\n*S KotlinDebug\n*F\n+ 1 UpPassDemoActivity.kt\nth/co/dtac/android/dtacone/view/activity/upPass/UpPassDemoActivity$onCreate$1\n*L\n78#1:212\n79#1:213\n80#1:214\n81#1:215\n82#1:216\n83#1:217\n84#1:218\n85#1:219\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1 */
/* loaded from: classes10.dex */
public final class UpPassDemoActivity$onCreate$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UpPassDemoActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1 */
    /* loaded from: classes10.dex */
    public static final class C144431 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ State<List<String>> $allowDocumentType$delegate;
        final /* synthetic */ State<Boolean> $allowManualKYC$delegate;
        final /* synthetic */ State<Boolean> $allowManualKYC2ndLine$delegate;
        final /* synthetic */ State<Integer> $faceCompareIndex$delegate;
        final /* synthetic */ State<Integer> $maxAttempt$delegate;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ State<Integer> $ocrIndex$delegate;
        final /* synthetic */ State<Integer> $themeIndex$delegate;
        final /* synthetic */ UpPassDemoActivity this$0;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C144441 extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144441(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MutableStateFlow mutableStateFlow;
                UpPassThemeType upPassThemeType;
                CompanyThemes companyThemes;
                String str;
                MutableStateFlow mutableStateFlow2;
                UpPassViewModel upPassViewModel;
                UpPassViewModel upPassViewModel2;
                mutableStateFlow = this.this$0.f88047r;
                mutableStateFlow.setValue(Integer.valueOf(i));
                if (i == 2) {
                    upPassThemeType = UpPassThemeType.DtacOne;
                } else if (i != 3) {
                    upPassThemeType = UpPassThemeType.AppOne;
                } else {
                    upPassThemeType = UpPassThemeType.Unify;
                }
                if (i == 0) {
                    companyThemes = CompanyThemes.ONE_DTAC;
                } else if (i != 2) {
                    companyThemes = CompanyThemes.ONE_TRUE;
                } else {
                    companyThemes = CompanyThemes.OLD_DTAC;
                }
                if (i != 0 && i != 2) {
                    str = "TRUE";
                } else {
                    str = Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE;
                }
                mutableStateFlow2 = this.this$0.f88045p;
                mutableStateFlow2.setValue(companyThemes);
                upPassViewModel = this.this$0.f88043n;
                UpPassViewModel upPassViewModel3 = null;
                if (upPassViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                    upPassViewModel = null;
                }
                upPassViewModel.setThemeType(upPassThemeType);
                upPassViewModel2 = this.this$0.f88043n;
                if (upPassViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                } else {
                    upPassViewModel3 = upPassViewModel2;
                }
                upPassViewModel3.setCompany(str);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$10 */
        /* loaded from: classes10.dex */
        public static final class C1444510 extends Lambda implements Function1<ExitCallbackState, Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ UpPassDemoActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$10$1 */
            /* loaded from: classes10.dex */
            public static final class C144461 extends Lambda implements Function1<NavOptionsBuilder, Unit> {
                public static final C144461 INSTANCE = new C144461();

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$10$1$1 */
                /* loaded from: classes10.dex */
                public static final class C144471 extends Lambda implements Function1<PopUpToBuilder, Unit> {
                    public static final C144471 INSTANCE = new C144471();

                    public C144471() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PopUpToBuilder popUpToBuilder) {
                        invoke2(popUpToBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull PopUpToBuilder popUpTo) {
                        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                        popUpTo.setInclusive(true);
                    }
                }

                public C144461() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                    invoke2(navOptionsBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavOptionsBuilder navigate) {
                    Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                    navigate.popUpTo(UpPassDemoScreen.UpPassDemo.ROUTE, C144471.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1444510(UpPassDemoActivity upPassDemoActivity, NavHostController navHostController) {
                super(1);
                this.this$0 = upPassDemoActivity;
                this.$navController = navHostController;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
                invoke2(exitCallbackState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ExitCallbackState state) {
                UpPassViewModel upPassViewModel;
                UpPassViewModel upPassViewModel2;
                Intrinsics.checkNotNullParameter(state, "state");
                StringBuilder sb = new StringBuilder();
                sb.append("onExit: ");
                sb.append(state);
                UpPassViewModel upPassViewModel3 = null;
                if (Intrinsics.areEqual(state, ExitCallbackState.FaceCompareRetakeIdDocument.INSTANCE)) {
                    upPassViewModel2 = this.this$0.f88043n;
                    if (upPassViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                    } else {
                        upPassViewModel3 = upPassViewModel2;
                    }
                    upPassViewModel3.resetFormState();
                    this.this$0.m16172f0(this.$navController, true);
                } else if (Intrinsics.areEqual(state, ExitCallbackState.FaceCompareFailed.INSTANCE)) {
                    upPassViewModel = this.this$0.f88043n;
                    if (upPassViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                    } else {
                        upPassViewModel3 = upPassViewModel;
                    }
                    upPassViewModel3.resetCompany();
                    this.$navController.navigate(UpPassDemoScreen.UpPassDemo.SelectOptionsScreen.ROUTE, C144461.INSTANCE);
                } else {
                    this.this$0.m16174d0();
                }
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$11 */
        /* loaded from: classes10.dex */
        public static final class C1444811 extends Lambda implements Function0<Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1444811(UpPassDemoActivity upPassDemoActivity) {
                super(0);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.m16174d0();
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$2 */
        /* loaded from: classes10.dex */
        public static final class C144492 extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144492(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = this.this$0.f88049t;
                mutableStateFlow.setValue(Integer.valueOf(i));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$3 */
        /* loaded from: classes10.dex */
        public static final class C144503 extends Lambda implements Function1<List<? extends String>, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144503(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
                invoke2((List<String>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable List<String> list) {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = this.this$0.f88051v;
                mutableStateFlow.setValue(list);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$4 */
        /* loaded from: classes10.dex */
        public static final class C144514 extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144514(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = this.this$0.f88053x;
                mutableStateFlow.setValue(Integer.valueOf(i));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$5 */
        /* loaded from: classes10.dex */
        public static final class C144525 extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144525(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = this.this$0.f88055z;
                mutableStateFlow.setValue(Boolean.valueOf(z));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$6 */
        /* loaded from: classes10.dex */
        public static final class C144536 extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144536(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = this.this$0.f88038B;
                mutableStateFlow.setValue(Integer.valueOf(i));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$7 */
        /* loaded from: classes10.dex */
        public static final class C144547 extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144547(UpPassDemoActivity upPassDemoActivity) {
                super(1);
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                MutableStateFlow mutableStateFlow;
                mutableStateFlow = this.this$0.f88040D;
                mutableStateFlow.setValue(Boolean.valueOf(z));
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$8 */
        /* loaded from: classes10.dex */
        public static final class C144558 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144558(UpPassDemoActivity upPassDemoActivity, NavHostController navHostController) {
                super(0);
                this.this$0 = upPassDemoActivity;
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
                UpPassDemoActivity.m16171g0(this.this$0, this.$navController, false, 2, null);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity$onCreate$1$1$9 */
        /* loaded from: classes10.dex */
        public static final class C144569 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ UpPassDemoActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C144569(NavHostController navHostController, UpPassDemoActivity upPassDemoActivity) {
                super(0);
                this.$navController = navHostController;
                this.this$0 = upPassDemoActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.$navController.getPreviousBackStackEntry() == null) {
                    this.this$0.m16174d0();
                } else {
                    this.this$0.getOnBackPressedDispatcher().onBackPressed();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C144431(NavHostController navHostController, State<Integer> state, State<Integer> state2, State<? extends List<String>> state3, State<Integer> state4, State<Boolean> state5, State<Integer> state6, State<Boolean> state7, UpPassDemoActivity upPassDemoActivity) {
            super(2);
            this.$navController = navHostController;
            this.$themeIndex$delegate = state;
            this.$ocrIndex$delegate = state2;
            this.$allowDocumentType$delegate = state3;
            this.$faceCompareIndex$delegate = state4;
            this.$allowManualKYC$delegate = state5;
            this.$maxAttempt$delegate = state6;
            this.$allowManualKYC2ndLine$delegate = state7;
            this.this$0 = upPassDemoActivity;
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
                ComposerKt.traceEventStart(-1044946581, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity.onCreate.<anonymous>.<anonymous> (UpPassDemoActivity.kt:85)");
            }
            UpPassDemoScreenKt.UpPassDemoScreen(UpPassDemoActivity$onCreate$1.invoke$lambda$1(this.$themeIndex$delegate), UpPassDemoActivity$onCreate$1.invoke$lambda$2(this.$ocrIndex$delegate), UpPassDemoActivity$onCreate$1.invoke$lambda$3(this.$allowDocumentType$delegate), UpPassDemoActivity$onCreate$1.invoke$lambda$4(this.$faceCompareIndex$delegate), UpPassDemoActivity$onCreate$1.invoke$lambda$5(this.$allowManualKYC$delegate), UpPassDemoActivity$onCreate$1.invoke$lambda$6(this.$maxAttempt$delegate), UpPassDemoActivity$onCreate$1.invoke$lambda$7(this.$allowManualKYC2ndLine$delegate), this.$navController, new C144441(this.this$0), new C144492(this.this$0), new C144503(this.this$0), new C144514(this.this$0), new C144525(this.this$0), new C144536(this.this$0), new C144547(this.this$0), new C144558(this.this$0, this.$navController), new C144569(this.$navController, this.this$0), new C1444510(this.this$0, this.$navController), new C1444811(this.this$0), composer, 16777728, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoActivity$onCreate$1(UpPassDemoActivity upPassDemoActivity) {
        super(2);
        this.this$0 = upPassDemoActivity;
    }

    private static final CompanyThemes invoke$lambda$0(State<? extends CompanyThemes> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$2(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> invoke$lambda$3(State<? extends List<String>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$4(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$6(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
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
        StateFlow stateFlow2;
        StateFlow stateFlow3;
        StateFlow stateFlow4;
        StateFlow stateFlow5;
        StateFlow stateFlow6;
        StateFlow stateFlow7;
        StateFlow stateFlow8;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(739615549, i, -1, "th.co.dtac.android.dtacone.view.activity.upPass.UpPassDemoActivity.onCreate.<anonymous> (UpPassDemoActivity.kt:75)");
        }
        NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
        stateFlow = this.this$0.f88046q;
        State collectAsState = SnapshotStateKt.collectAsState(stateFlow, null, composer, 8, 1);
        stateFlow2 = this.this$0.f88048s;
        State collectAsState2 = SnapshotStateKt.collectAsState(stateFlow2, null, composer, 8, 1);
        stateFlow3 = this.this$0.f88050u;
        State collectAsState3 = SnapshotStateKt.collectAsState(stateFlow3, null, composer, 8, 1);
        stateFlow4 = this.this$0.f88052w;
        State collectAsState4 = SnapshotStateKt.collectAsState(stateFlow4, null, composer, 8, 1);
        stateFlow5 = this.this$0.f88054y;
        State collectAsState5 = SnapshotStateKt.collectAsState(stateFlow5, null, composer, 8, 1);
        stateFlow6 = this.this$0.f88037A;
        State collectAsState6 = SnapshotStateKt.collectAsState(stateFlow6, null, composer, 8, 1);
        stateFlow7 = this.this$0.f88039C;
        State collectAsState7 = SnapshotStateKt.collectAsState(stateFlow7, null, composer, 8, 1);
        stateFlow8 = this.this$0.f88041E;
        ThemeKt.OneTheme(invoke$lambda$0(collectAsState), false, ComposableLambdaKt.composableLambda(composer, -1044946581, true, new C144431(rememberNavController, collectAsState2, collectAsState3, collectAsState4, collectAsState5, collectAsState6, collectAsState7, SnapshotStateKt.collectAsState(stateFlow8, null, composer, 8, 1), this.this$0)), composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}