package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ShadowKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.MrtrOnlineRegisterCreateRetailerProfile;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.activity.OneOnlineRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.compose.OneOnlineRegistrationScreen;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationVerifyOTPFragment;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OneOnlineRegistrationUpPassFlowFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C148221 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OneOnlineRegistrationUpPassFlowFragment this$0;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$1", m29092f = "OneOnlineRegistrationUpPassFlowFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C148231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OneOnlineRegistrationUpPassFlowFragment this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C148241 extends Lambda implements Function1<Resource<? extends String>, Unit> {
                final /* synthetic */ OneOnlineRegistrationUpPassFlowFragment this$0;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$1$1$WhenMappings */
                /* loaded from: classes10.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[StatusResource.values().length];
                        try {
                            iArr[StatusResource.LOADING.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[StatusResource.SUCCESS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[StatusResource.ERROR.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C148241(OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment) {
                    super(1);
                    this.this$0 = oneOnlineRegistrationUpPassFlowFragment;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
                    invoke2((Resource<String>) resource);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Resource<String> resource) {
                    Resource<String> resourceContentIfNotHandled;
                    OneOnlineRegistrationActivity m12942m;
                    OneOnlineRegisterViewModel viewModel;
                    OneOnlineRegisterViewModel viewModel2;
                    if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
                        return;
                    }
                    OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment = this.this$0;
                    if (WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()] != 2) {
                        return;
                    }
                    m12942m = oneOnlineRegistrationUpPassFlowFragment.m12942m();
                    OneOnlineRegistrationVerifyOTPFragment.Companion companion = OneOnlineRegistrationVerifyOTPFragment.Companion;
                    viewModel = oneOnlineRegistrationUpPassFlowFragment.getViewModel();
                    String phoneNumberSale = viewModel.getPhoneNumberSale();
                    String data = resourceContentIfNotHandled.getData();
                    viewModel2 = oneOnlineRegistrationUpPassFlowFragment.getViewModel();
                    MrtrOnlineRegisterCreateRetailerProfile submitCollection = viewModel2.getSubmitCollection();
                    m12942m.replaceFragmentByStackName(companion.newInstance(phoneNumberSale, data, Constant.OnlineRegistration.MANUAL_KYC, (submitCollection == null || (r0 = submitCollection.getSalesCode()) == null) ? "" : ""), OneOnlineRegistrationVerifyOTPFragment.TAG);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C148231(OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment, Continuation<? super C148231> continuation) {
                super(2, continuation);
                this.this$0 = oneOnlineRegistrationUpPassFlowFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C148231(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                OneOnlineRegisterViewModel viewModel;
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    viewModel = this.this$0.getViewModel();
                    viewModel.getRequestOtpLiveData().observe(this.this$0.getViewLifecycleOwner(), new OneOnlineRegistrationUpPassFlowFragment.C14821a(new C148241(this.this$0)));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C148231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nOneOnlineRegistrationUpPassFlowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOnlineRegistrationUpPassFlowFragment.kt\nth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,207:1\n72#2,6:208\n78#2:242\n82#2:250\n78#3,11:214\n91#3:249\n456#4,8:225\n464#4,3:239\n467#4,3:246\n4144#5,6:233\n154#6:243\n154#6:244\n154#6:245\n*S KotlinDebug\n*F\n+ 1 OneOnlineRegistrationUpPassFlowFragment.kt\nth/co/dtac/android/dtacone/view/appOne/onlineRegister/fragment/OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$2\n*L\n121#1:208,6\n121#1:242\n121#1:250\n121#1:214,11\n121#1:249\n121#1:225,8\n121#1:239,3\n121#1:246,3\n121#1:233,6\n125#1:243\n127#1:244\n132#1:245\n*E\n"})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$2 */
        /* loaded from: classes10.dex */
        public static final class C148252 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ OneOnlineRegistrationUpPassFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C148252(NavHostController navHostController, OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment) {
                super(2);
                this.$navController = navHostController;
                this.this$0 = oneOnlineRegistrationUpPassFlowFragment;
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
                    ComposerKt.traceEventStart(793352874, i, -1, "th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OneOnlineRegistrationUpPassFlowFragment.kt:119)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                NavHostController navHostController = this.$navController;
                OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment = this.this$0;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
                Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                BoxKt.Box(BackgroundKt.m69505backgroundbw27NRU$default(ShadowKt.m71609shadows4CzXII$default(SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(1)), C3623Dp.m73842constructorimpl(8), null, false, 0L, 0L, 26, null), Color.Companion.m71956getWhite0d7_KjU(), null, 2, null), composer, 0);
                SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(4)), composer, 6);
                NavHostKt.NavHost(navHostController, OneOnlineRegistrationScreen.Register.ROUTE, null, null, null, null, null, null, null, new OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1$1$2$1$1(navHostController, oneOnlineRegistrationUpPassFlowFragment), composer, 56, TypedValues.PositionType.TYPE_CURVE_FIT);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C148221(OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment) {
            super(2);
            this.this$0 = oneOnlineRegistrationUpPassFlowFragment;
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
                ComposerKt.traceEventStart(1576382927, i, -1, "th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (OneOnlineRegistrationUpPassFlowFragment.kt:88)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new C148231(this.this$0, null), composer, 70);
            SurfaceKt.m70812SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, Color.Companion.m71956getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 793352874, true, new C148252(rememberNavController, this.this$0)), composer, 12583302, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationUpPassFlowFragment$onCreateView$1$1(OneOnlineRegistrationUpPassFlowFragment oneOnlineRegistrationUpPassFlowFragment) {
        super(2);
        this.this$0 = oneOnlineRegistrationUpPassFlowFragment;
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
            ComposerKt.traceEventStart(-558203843, i, -1, "th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationUpPassFlowFragment.onCreateView.<anonymous>.<anonymous> (OneOnlineRegistrationUpPassFlowFragment.kt:87)");
        }
        ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableLambdaKt.composableLambda(composer, 1576382927, true, new C148221(this.this$0)), composer, 390, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}