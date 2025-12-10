package th.p047co.dtac.android.dtacone.view.appOne.tol.activity;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout.TopAppBarKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineActivity$onCreate$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineActivity.kt\nth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity$onCreate$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,506:1\n25#2:507\n1097#3,6:508\n81#4:514\n81#4:515\n81#4:516\n107#4,2:517\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineActivity.kt\nth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity$onCreate$1$1\n*L\n154#1:507\n154#1:508,6\n151#1:514\n153#1:515\n154#1:516\n154#1:517,2\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1 */
    /* loaded from: classes10.dex */
    public static final class C151711 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineActivity.kt\nth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity$onCreate$1$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,506:1\n36#2:507\n1097#3,6:508\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineActivity.kt\nth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity$onCreate$1$1$1\n*L\n174#1:507\n174#1:508,6\n*E\n"})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C151721 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ String $currentRoute;
            final /* synthetic */ State<ProductType> $productType$delegate;
            final /* synthetic */ MutableState<Boolean> $showDialog$delegate;
            final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$1$1 */
            /* loaded from: classes10.dex */
            public /* synthetic */ class C151731 extends FunctionReferenceImpl implements Function0<Unit> {
                public C151731(Object obj) {
                    super(0, obj, OneRegisterTrueOnlineViewModel.class, "getGisOrderStatus", "getGisOrderStatus()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((OneRegisterTrueOnlineViewModel) this.receiver).getGisOrderStatus();
                }
            }

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$1$2 */
            /* loaded from: classes10.dex */
            public static final class C151742 extends Lambda implements Function0<Unit> {
                final /* synthetic */ String $currentRoute;
                final /* synthetic */ MutableState<Boolean> $showDialog$delegate;
                final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C151742(String str, OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity, MutableState<Boolean> mutableState) {
                    super(0);
                    this.$currentRoute = str;
                    this.this$0 = oneRegisterTrueOnlineActivity;
                    this.$showDialog$delegate = mutableState;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NavHostController navHostController;
                    String campaignEntryFeeReasonCode;
                    if (!Intrinsics.areEqual(this.$currentRoute, OneTolScreen.Tol.TolPackage.FeeInfo.ROUTE) || !this.this$0.getViewModel().getSelectCheckBoxReason() || ((campaignEntryFeeReasonCode = this.this$0.getViewModel().getCampaignInfo().getCampaignEntryFeeReasonCode()) != null && campaignEntryFeeReasonCode.length() != 0)) {
                        navHostController = this.this$0.f97657p;
                        if (navHostController == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navController");
                            navHostController = null;
                        }
                        if (navHostController.navigateUp()) {
                            return;
                        }
                        this.this$0.finish();
                        return;
                    }
                    C151711.invoke$lambda$4(this.$showDialog$delegate, true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C151721(String str, OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity, MutableState<Boolean> mutableState, State<? extends ProductType> state) {
                super(2);
                this.$currentRoute = str;
                this.this$0 = oneRegisterTrueOnlineActivity;
                this.$showDialog$delegate = mutableState;
                this.$productType$delegate = state;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.Composer] */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2138300463, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OneRegisterTrueOnlineActivity.kt:156)");
                }
                String str = this.$currentRoute;
                if (str == null) {
                    str = "";
                }
                TopAppBarKt.TolTopAppBar(str, C151711.invoke$lambda$1(this.$productType$delegate), new C151731(this.this$0.getViewModel()), new C151742(this.$currentRoute, this.this$0, this.$showDialog$delegate), composer, 0, 0);
                if (C151711.invoke$lambda$3(this.$showDialog$delegate)) {
                    MutableState<Boolean> mutableState = this.$showDialog$delegate;
                    composer.startReplaceableGroup(1157296644);
                    boolean changed = composer.changed(mutableState);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new OneRegisterTrueOnlineActivity$onCreate$1$1$1$3$1(mutableState);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    OneDialogKt.OneDialogMessage("กรุณาเลือกเหตุผลการยกเลิกค่าแรกเข้า", rememberedValue, null, composer, 6, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$2 */
        /* loaded from: classes10.dex */
        public static final class C151752 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ String $currentRoute;
            final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$2$1 */
            /* loaded from: classes10.dex */
            public static final class C151761 extends Lambda implements Function0<Unit> {
                final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C151761(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
                    super(0);
                    this.this$0 = oneRegisterTrueOnlineActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NavHostController navHostController;
                    navHostController = this.this$0.f97657p;
                    if (navHostController == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navController");
                        navHostController = null;
                    }
                    NavController.navigate$default(navHostController, OneTolScreen.Tol.TolPackage.SmartSearch.ROUTE, null, null, 6, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C151752(String str, OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
                super(2);
                this.$currentRoute = str;
                this.this$0 = oneRegisterTrueOnlineActivity;
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
                    ComposerKt.traceEventStart(437564364, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OneRegisterTrueOnlineActivity.kt:177)");
                }
                if (Intrinsics.areEqual(this.$currentRoute, OneTolScreen.Tol.TolPackage.CampaignSelection.ROUTE)) {
                    OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity = this.this$0;
                    oneRegisterTrueOnlineActivity.SmartSearchButton(new C151761(oneRegisterTrueOnlineActivity), composer, 64);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$3 */
        /* loaded from: classes10.dex */
        public static final class C151773 extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineActivity.kt\nth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity$onCreate$1$1$3$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,506:1\n36#2:507\n36#2:514\n36#2:521\n36#2:528\n1097#3,6:508\n1097#3,6:515\n1097#3,6:522\n1097#3,6:529\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineActivity.kt\nth/co/dtac/android/dtacone/view/appOne/tol/activity/OneRegisterTrueOnlineActivity$onCreate$1$1$3$1\n*L\n198#1:507\n204#1:514\n210#1:521\n216#1:528\n198#1:508,6\n204#1:515,6\n210#1:522,6\n216#1:529,6\n*E\n"})
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$3$1 */
            /* loaded from: classes10.dex */
            public static final class C151781 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ PaddingValues $paddingValues;
                final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity$onCreate$1$1$3$1$5 */
                /* loaded from: classes10.dex */
                public static final class C151795 extends Lambda implements Function1<NavGraphBuilder, Unit> {
                    final /* synthetic */ OneRegisterTrueOnlineActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C151795(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
                        super(1);
                        this.this$0 = oneRegisterTrueOnlineActivity;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
                        invoke2(navGraphBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull NavGraphBuilder NavHost) {
                        NavHostController navHostController;
                        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                        OneRegisterTrueOnlineViewModel viewModel = this.this$0.getViewModel();
                        OneRegisterTrueOnlineIdCardReaderViewModel cardReaderViewModel = this.this$0.getCardReaderViewModel();
                        OneRegisterTrueOnlineTakePhotoViewModel takePhotoViewModel = this.this$0.getTakePhotoViewModel();
                        navHostController = this.this$0.f97657p;
                        if (navHostController == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navController");
                            navHostController = null;
                        }
                        OneTolNavGraphKt.oneTolNavGraph(NavHost, viewModel, cardReaderViewModel, takePhotoViewModel, navHostController);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C151781(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity, PaddingValues paddingValues) {
                    super(2);
                    this.this$0 = oneRegisterTrueOnlineActivity;
                    this.$paddingValues = paddingValues;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer, int i) {
                    NavHostController navHostController;
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-663639073, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneRegisterTrueOnlineActivity.kt:191)");
                    }
                    navHostController = this.this$0.f97657p;
                    if (navHostController == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navController");
                        navHostController = null;
                    }
                    NavHostController navHostController2 = navHostController;
                    Modifier padding = PaddingKt.padding(Modifier.Companion, this.$paddingValues);
                    composer.startReplaceableGroup(1157296644);
                    boolean changed = composer.changed((Object) 300);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new OneRegisterTrueOnlineActivity$onCreate$1$1$3$1$1$1(300);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    Function1 function1 = (Function1) rememberedValue;
                    composer.startReplaceableGroup(1157296644);
                    boolean changed2 = composer.changed((Object) 300);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new OneRegisterTrueOnlineActivity$onCreate$1$1$3$1$2$1(300);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Function1 function12 = (Function1) rememberedValue2;
                    composer.startReplaceableGroup(1157296644);
                    boolean changed3 = composer.changed((Object) 300);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new OneRegisterTrueOnlineActivity$onCreate$1$1$3$1$3$1(300);
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    Function1 function13 = (Function1) rememberedValue3;
                    composer.startReplaceableGroup(1157296644);
                    boolean changed4 = composer.changed((Object) 300);
                    Object rememberedValue4 = composer.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new OneRegisterTrueOnlineActivity$onCreate$1$1$3$1$4$1(300);
                        composer.updateRememberedValue(rememberedValue4);
                    }
                    composer.endReplaceableGroup();
                    NavHostKt.NavHost(navHostController2, OneTolScreen.Tol.ROUTE, padding, null, null, function1, function12, function13, (Function1) rememberedValue4, new C151795(this.this$0), composer, 56, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C151773(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
                super(3);
                this.this$0 = oneRegisterTrueOnlineActivity;
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
                    ComposerKt.traceEventStart(1033795076, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (OneRegisterTrueOnlineActivity.kt:187)");
                }
                SurfaceKt.m70812SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, Color.Companion.m71956getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, -663639073, true, new C151781(this.this$0, paddingValues)), composer, 12583302, 122);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C151711(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
            super(2);
            this.this$0 = oneRegisterTrueOnlineActivity;
        }

        private static final NavBackStackEntry invoke$lambda$0(State<NavBackStackEntry> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProductType invoke$lambda$1(State<? extends ProductType> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$3(MutableState<Boolean> mutableState) {
            return mutableState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$4(MutableState<Boolean> mutableState, boolean z) {
            mutableState.setValue(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            NavHostController navHostController;
            NavDestination destination;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1060067981, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity.onCreate.<anonymous>.<anonymous> (OneRegisterTrueOnlineActivity.kt:148)");
            }
            this.this$0.f97657p = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            navHostController = this.this$0.f97657p;
            if (navHostController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                navHostController = null;
            }
            NavBackStackEntry invoke$lambda$0 = invoke$lambda$0(NavHostControllerKt.currentBackStackEntryAsState(navHostController, composer, 8));
            String route = (invoke$lambda$0 == null || (destination = invoke$lambda$0.getDestination()) == null) ? null : destination.getRoute();
            State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getViewModel().getProductType(), null, composer, 8, 1);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Color.Companion companion = Color.Companion;
            ScaffoldKt.m70701ScaffoldTvnljyQ(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), companion.m71956getWhite0d7_KjU(), null, 2, null), ComposableLambdaKt.composableLambda(composer, 2138300463, true, new C151721(route, this.this$0, (MutableState) rememberedValue, collectAsState)), null, null, ComposableLambdaKt.composableLambda(composer, 437564364, true, new C151752(route, this.this$0)), 0, companion.m71956getWhite0d7_KjU(), 0L, null, ComposableLambdaKt.composableLambda(composer, 1033795076, true, new C151773(this.this$0)), composer, 806903856, 428);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineActivity$onCreate$1(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
        super(2);
        this.this$0 = oneRegisterTrueOnlineActivity;
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
            ComposerKt.traceEventStart(1802462405, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity.onCreate.<anonymous> (OneRegisterTrueOnlineActivity.kt:147)");
        }
        ThemeKt.OneTheme(null, false, ComposableLambdaKt.composableLambda(composer, -1060067981, true, new C151711(this.this$0)), composer, 384, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}