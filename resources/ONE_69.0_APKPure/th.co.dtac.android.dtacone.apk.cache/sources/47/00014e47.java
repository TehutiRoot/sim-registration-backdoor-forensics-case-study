package th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormOwnerType;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_changesim.MrtrChangeSimActivity;
import th.p047co.dtac.android.dtacone.view.compose.upPass.FaceCompareNavGraphKt;
import th.p047co.dtac.android.dtacone.view.compose.upPass.IdDocOcrNavGraphKt;
import th.p047co.dtac.android.dtacone.view.compose.upPass.model.UpPassScreen;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.compose.MrtrChangeSimScreen;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneDialogKt;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimUpPassFlowFragment$onCreateView$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nMrtrChangeSimUpPassFlowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrChangeSimUpPassFlowFragment.kt\nth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,409:1\n81#2:410\n81#2:411\n81#2:412\n81#2:413\n81#2:414\n*S KotlinDebug\n*F\n+ 1 MrtrChangeSimUpPassFlowFragment.kt\nth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1\n*L\n132#1:410\n133#1:411\n134#1:412\n135#1:413\n136#1:414\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1 */
    /* loaded from: classes9.dex */
    public static final class C161631 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$1 */
        /* loaded from: classes9.dex */
        public static final class C161641 extends Lambda implements Function0<Unit> {
            final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C161641(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment) {
                super(0);
                this.this$0 = mrtrChangeSimUpPassFlowFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MrtrChangeSimViewModel m6561n;
                this.this$0.m6559p();
                m6561n = this.this$0.m6561n();
                m6561n.setShowTakeMorePhotoState(false);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$2 */
        /* loaded from: classes9.dex */
        public static final class C161652 extends Lambda implements Function0<Unit> {
            final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C161652(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment) {
                super(0);
                this.this$0 = mrtrChangeSimUpPassFlowFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MrtrChangeSimViewModel m6561n;
                this.this$0.m6557r();
                m6561n = this.this$0.m6561n();
                m6561n.setShowTakeMorePhotoState(false);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$3 */
        /* loaded from: classes9.dex */
        public static final class C161663 extends Lambda implements Function0<Unit> {
            final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C161663(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment) {
                super(0);
                this.this$0 = mrtrChangeSimUpPassFlowFragment;
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
                mutableStateFlow = this.this$0.f101729o;
                mutableStateFlow.setValue(Boolean.FALSE);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$4 */
        /* loaded from: classes9.dex */
        public static final class C161674 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C161674(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, NavHostController navHostController) {
                super(0);
                this.this$0 = mrtrChangeSimUpPassFlowFragment;
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
                UpPassViewModel upPassViewModel;
                mutableStateFlow = this.this$0.f101725k;
                mutableStateFlow.setValue(Boolean.FALSE);
                upPassViewModel = this.this$0.f101723i;
                if (upPassViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                    upPassViewModel = null;
                }
                upPassViewModel.resetFormState();
                NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.IdDocumentOcrFlow.IdDocumentOcr.ROUTE, null, null, 6, null);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$5 */
        /* loaded from: classes9.dex */
        public static final class C161685 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C161685(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, NavHostController navHostController) {
                super(0);
                this.this$0 = mrtrChangeSimUpPassFlowFragment;
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
                UpPassViewModel upPassViewModel;
                mutableStateFlow = this.this$0.f101727m;
                mutableStateFlow.setValue(Boolean.FALSE);
                upPassViewModel = this.this$0.f101723i;
                if (upPassViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                    upPassViewModel = null;
                }
                upPassViewModel.resetFormState();
                NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.IdDocumentOcrFlow.IdDocumentOcr.ROUTE, null, null, 6, null);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6 */
        /* loaded from: classes9.dex */
        public static final class C161696 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ State<Boolean> $isAlReadyOwnerOcr$delegate;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ String $ownerId;
            final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6$1 */
            /* loaded from: classes9.dex */
            public static final class C161701 extends Lambda implements Function1<NavGraphBuilder, Unit> {
                final /* synthetic */ State<Boolean> $isAlReadyOwnerOcr$delegate;
                final /* synthetic */ NavHostController $navController;
                final /* synthetic */ String $ownerId;
                final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6$1$1 */
                /* loaded from: classes9.dex */
                public static final class C161711 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
                    final /* synthetic */ NavHostController $navController;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C161711(NavHostController navHostController) {
                        super(4);
                        this.$navController = navHostController;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(composable, "$this$composable");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-577287697, i, -1, "th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MrtrChangeSimUpPassFlowFragment.kt:193)");
                        }
                        NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.IdDocumentOcrFlow.IdDocumentOcr.ROUTE, null, null, 6, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6$1$2 */
                /* loaded from: classes9.dex */
                public static final class C161722 extends Lambda implements Function1<UpPassFormResult, Unit> {
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ String $ownerId;
                    final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C161722(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, String str, NavHostController navHostController) {
                        super(1);
                        this.this$0 = mrtrChangeSimUpPassFlowFragment;
                        this.$ownerId = str;
                        this.$navController = navHostController;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
                        invoke2(upPassFormResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull UpPassFormResult it) {
                        MrtrChangeSimViewModel m6561n;
                        MrtrChangeSimViewModel m6561n2;
                        MrtrChangeSimViewModel m6561n3;
                        MutableStateFlow mutableStateFlow;
                        MrtrChangeSimViewModel m6561n4;
                        UpPassViewModel upPassViewModel;
                        MutableStateFlow mutableStateFlow2;
                        IdCardInformationCollection idCardInformation;
                        MrtrChangeSimViewModel m6561n5;
                        MrtrChangeSimViewModel m6561n6;
                        MrtrChangeSimViewModel m6561n7;
                        MutableStateFlow mutableStateFlow3;
                        MrtrChangeSimViewModel m6561n8;
                        UpPassViewModel upPassViewModel2;
                        MrtrChangeSimViewModel m6561n9;
                        MutableStateFlow mutableStateFlow4;
                        IdCardInformationCollection idCardInformation2;
                        MrtrChangeSimViewModel m6561n10;
                        MrtrChangeSimViewModel m6561n11;
                        MrtrChangeSimViewModel m6561n12;
                        UpPassViewModel upPassViewModel3;
                        MutableStateFlow mutableStateFlow5;
                        IdCardInformationCollection idCardInformation3;
                        Intrinsics.checkNotNullParameter(it, "it");
                        m6561n = this.this$0.m6561n();
                        UpPassViewModel upPassViewModel4 = null;
                        if (m6561n.isAttorney()) {
                            m6561n5 = this.this$0.m6561n();
                            if (!m6561n5.isOwner().getValue().booleanValue()) {
                                m6561n6 = this.this$0.m6561n();
                                IdCardInformationCollection cardInformation = m6561n6.getCardInformation();
                                String idCard = cardInformation != null ? cardInformation.getIdCard() : null;
                                IdDocumentResult idDocument = it.getIdDocument();
                                if (Intrinsics.areEqual(idCard, (idDocument == null || (idCardInformation2 = idDocument.getIdCardInformation()) == null) ? null : idCardInformation2.getIdCard())) {
                                    mutableStateFlow4 = this.this$0.f101725k;
                                    mutableStateFlow4.setValue(Boolean.TRUE);
                                    return;
                                }
                                m6561n7 = this.this$0.m6561n();
                                IdDocumentResult idDocument2 = it.getIdDocument();
                                m6561n7.setCardInformationAttoney(idDocument2 != null ? idDocument2.getIdCardInformation() : null);
                                IdDocumentResult idDocument3 = it.getIdDocument();
                                if (idDocument3 != null) {
                                    m6561n9 = this.this$0.m6561n();
                                    m6561n9.setOcrResult(idDocument3, it.isCardReader());
                                }
                                mutableStateFlow3 = this.this$0.f101732r;
                                mutableStateFlow3.setValue(Boolean.TRUE);
                                this.this$0.m6558q(BitmapUtil.IMAGE_ATTORNEY_ID_CARD, BitmapUtil.IMAGE_ATTORNEY_ID_CARD_WITH_WATERMARK);
                                m6561n8 = this.this$0.m6561n();
                                if (m6561n8.getRequireFaceRecognition()) {
                                    upPassViewModel2 = this.this$0.f101723i;
                                    if (upPassViewModel2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                                    } else {
                                        upPassViewModel4 = upPassViewModel2;
                                    }
                                    upPassViewModel4.resetFormState();
                                    NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompare.ROUTE, null, null, 6, null);
                                    return;
                                }
                                return;
                            }
                            String str = this.$ownerId;
                            IdDocumentResult idDocument4 = it.getIdDocument();
                            if (!Intrinsics.areEqual(str, (idDocument4 == null || (idCardInformation3 = idDocument4.getIdCardInformation()) == null) ? null : idCardInformation3.getIdCard())) {
                                mutableStateFlow5 = this.this$0.f101727m;
                                mutableStateFlow5.setValue(Boolean.TRUE);
                                return;
                            }
                            m6561n10 = this.this$0.m6561n();
                            m6561n10.setCardInformation(it.getIdDocument().getIdCardInformation());
                            this.this$0.m6558q(BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK);
                            m6561n11 = this.this$0.m6561n();
                            m6561n11.isOwner().setValue(Boolean.FALSE);
                            m6561n12 = this.this$0.m6561n();
                            m6561n12.setAlreadyOwnerOcr(true);
                            upPassViewModel3 = this.this$0.f101723i;
                            if (upPassViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                            } else {
                                upPassViewModel4 = upPassViewModel3;
                            }
                            upPassViewModel4.resetFormState();
                            NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.IdDocumentOcrFlow.IdDocumentOcr.ROUTE, null, null, 6, null);
                            return;
                        }
                        String str2 = this.$ownerId;
                        IdDocumentResult idDocument5 = it.getIdDocument();
                        if (!Intrinsics.areEqual(str2, (idDocument5 == null || (idCardInformation = idDocument5.getIdCardInformation()) == null) ? null : idCardInformation.getIdCard())) {
                            mutableStateFlow2 = this.this$0.f101727m;
                            mutableStateFlow2.setValue(Boolean.TRUE);
                            return;
                        }
                        m6561n2 = this.this$0.m6561n();
                        m6561n2.setCardInformation(it.getIdDocument().getIdCardInformation());
                        IdDocumentResult idDocument6 = it.getIdDocument();
                        m6561n3 = this.this$0.m6561n();
                        m6561n3.setOcrResult(idDocument6, it.isCardReader());
                        mutableStateFlow = this.this$0.f101733s;
                        mutableStateFlow.setValue(Boolean.TRUE);
                        this.this$0.m6558q(BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK);
                        m6561n4 = this.this$0.m6561n();
                        if (m6561n4.getRequireFaceRecognition()) {
                            upPassViewModel = this.this$0.f101723i;
                            if (upPassViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                            } else {
                                upPassViewModel4 = upPassViewModel;
                            }
                            upPassViewModel4.resetFormState();
                            NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.FaceCompareFlow.FaceCompare.ROUTE, null, null, 6, null);
                        }
                    }
                }

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6$1$3 */
                /* loaded from: classes9.dex */
                public static final class C161733 extends Lambda implements Function1<ExitCallbackState, Unit> {
                    final /* synthetic */ State<Boolean> $isAlReadyOwnerOcr$delegate;
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C161733(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, NavHostController navHostController, State<Boolean> state) {
                        super(1);
                        this.this$0 = mrtrChangeSimUpPassFlowFragment;
                        this.$navController = navHostController;
                        this.$isAlReadyOwnerOcr$delegate = state;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
                        invoke2(exitCallbackState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ExitCallbackState it) {
                        MrtrChangeSimViewModel m6561n;
                        MrtrChangeSimActivity m6562m;
                        MrtrChangeSimViewModel m6561n2;
                        MrtrChangeSimViewModel m6561n3;
                        UpPassViewModel upPassViewModel;
                        Intrinsics.checkNotNullParameter(it, "it");
                        m6561n = this.this$0.m6561n();
                        if (!m6561n.isAttorney() || !C161631.invoke$lambda$4(this.$isAlReadyOwnerOcr$delegate)) {
                            m6562m = this.this$0.m6562m();
                            m6562m.getSupportFragmentManager().popBackStack();
                            return;
                        }
                        m6561n2 = this.this$0.m6561n();
                        m6561n2.isOwner().setValue(Boolean.TRUE);
                        m6561n3 = this.this$0.m6561n();
                        m6561n3.setAlreadyOwnerOcr(false);
                        upPassViewModel = this.this$0.f101723i;
                        if (upPassViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                            upPassViewModel = null;
                        }
                        upPassViewModel.resetFormState();
                        NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.IdDocumentOcrFlow.IdDocumentOcr.ROUTE, null, null, 6, null);
                    }
                }

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6$1$4 */
                /* loaded from: classes9.dex */
                public static final class C161744 extends Lambda implements Function1<UpPassFormResult, Unit> {
                    final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C161744(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment) {
                        super(1);
                        this.this$0 = mrtrChangeSimUpPassFlowFragment;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
                        invoke2(upPassFormResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull UpPassFormResult it) {
                        MrtrChangeSimViewModel m6561n;
                        MutableStateFlow mutableStateFlow;
                        Intrinsics.checkNotNullParameter(it, "it");
                        m6561n = this.this$0.m6561n();
                        FaceCompareResult faceCompare = it.getFaceCompare();
                        Intrinsics.checkNotNull(faceCompare);
                        m6561n.setFaceRecognitionData(faceCompare);
                        this.this$0.m6558q(BitmapUtil.IMAGE_COMPARE, BitmapUtil.IMAGE_COMPARE_WATERMARK);
                        mutableStateFlow = this.this$0.f101731q;
                        mutableStateFlow.setValue(Boolean.TRUE);
                    }
                }

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment$onCreateView$1$1$1$6$1$5 */
                /* loaded from: classes9.dex */
                public static final class C161755 extends Lambda implements Function1<ExitCallbackState, Unit> {
                    final /* synthetic */ NavHostController $navController;
                    final /* synthetic */ MrtrChangeSimUpPassFlowFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C161755(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, NavHostController navHostController) {
                        super(1);
                        this.this$0 = mrtrChangeSimUpPassFlowFragment;
                        this.$navController = navHostController;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
                        invoke2(exitCallbackState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ExitCallbackState it) {
                        UpPassViewModel upPassViewModel;
                        Intrinsics.checkNotNullParameter(it, "it");
                        upPassViewModel = this.this$0.f101723i;
                        if (upPassViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
                            upPassViewModel = null;
                        }
                        upPassViewModel.resetFormState();
                        NavController.navigate$default(this.$navController, UpPassScreen.UpPassForms.IdDocumentOcrFlow.IdDocumentOcr.ROUTE, null, null, 6, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C161701(NavHostController navHostController, MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, State<Boolean> state, String str) {
                    super(1);
                    this.$navController = navHostController;
                    this.this$0 = mrtrChangeSimUpPassFlowFragment;
                    this.$isAlReadyOwnerOcr$delegate = state;
                    this.$ownerId = str;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
                    invoke2(navGraphBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavGraphBuilder NavHost) {
                    MrtrChangeSimViewModel m6561n;
                    UpPassFormOwnerType upPassFormOwnerType;
                    MrtrChangeSimViewModel m6561n2;
                    MrtrChangeSimViewModel m6561n3;
                    UpPassFormType m6560o;
                    Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                    NavGraphBuilderKt.composable$default(NavHost, MrtrChangeSimScreen.MrtrChangeSim.ROUTE, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-577287697, true, new C161711(this.$navController)), WebSocketProtocol.PAYLOAD_SHORT, null);
                    NavHostController navHostController = this.$navController;
                    m6561n = this.this$0.m6561n();
                    if (m6561n.isAttorney()) {
                        upPassFormOwnerType = !C161631.invoke$lambda$4(this.$isAlReadyOwnerOcr$delegate) ? UpPassFormOwnerType.Owner : UpPassFormOwnerType.Attorney;
                    } else {
                        upPassFormOwnerType = null;
                    }
                    UpPassFormOwnerType upPassFormOwnerType2 = upPassFormOwnerType;
                    m6561n2 = this.this$0.m6561n();
                    List<String> allowDocType = m6561n2.getAllowDocType();
                    m6561n3 = this.this$0.m6561n();
                    IdDocOcrNavGraphKt.idDocOcrNavGraph(NavHost, navHostController, new UpPassFormType.Ocr(upPassFormOwnerType2, allowDocType, false, m6561n3.getOrderType(), 4, null), new C161722(this.this$0, this.$ownerId, this.$navController), new C161733(this.this$0, this.$navController, this.$isAlReadyOwnerOcr$delegate));
                    NavHostController navHostController2 = this.$navController;
                    m6560o = this.this$0.m6560o();
                    FaceCompareNavGraphKt.faceCompareNavGraph(NavHost, navHostController2, m6560o, new C161744(this.this$0), new C161755(this.this$0, this.$navController));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C161696(NavHostController navHostController, MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment, State<Boolean> state, String str) {
                super(2);
                this.$navController = navHostController;
                this.this$0 = mrtrChangeSimUpPassFlowFragment;
                this.$isAlReadyOwnerOcr$delegate = state;
                this.$ownerId = str;
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
                    ComposerKt.traceEventStart(1943289101, i, -1, "th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MrtrChangeSimUpPassFlowFragment.kt:188)");
                }
                NavHostController navHostController = this.$navController;
                NavHostKt.NavHost(navHostController, MrtrChangeSimScreen.MrtrChangeSim.ROUTE, null, null, null, null, null, null, null, new C161701(navHostController, this.this$0, this.$isAlReadyOwnerOcr$delegate, this.$ownerId), composer, 56, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C161631(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment) {
            super(2);
            this.this$0 = mrtrChangeSimUpPassFlowFragment;
        }

        private static final boolean invoke$lambda$0(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$1(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$2(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$3(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4(State<Boolean> state) {
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
            MrtrChangeSimViewModel m6561n;
            StateFlow stateFlow;
            StateFlow stateFlow2;
            StateFlow stateFlow3;
            MrtrChangeSimViewModel m6561n2;
            MrtrChangeSimViewModel m6561n3;
            String str;
            State state;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1923235314, i, -1, "th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MrtrChangeSimUpPassFlowFragment.kt:129)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            m6561n = this.this$0.m6561n();
            State collectAsState = SnapshotStateKt.collectAsState(m6561n.getShowTakeMorePhotoState(), null, composer, 8, 1);
            stateFlow = this.this$0.f101726l;
            State collectAsState2 = SnapshotStateKt.collectAsState(stateFlow, null, composer, 8, 1);
            stateFlow2 = this.this$0.f101728n;
            State collectAsState3 = SnapshotStateKt.collectAsState(stateFlow2, null, composer, 8, 1);
            stateFlow3 = this.this$0.f101730p;
            State collectAsState4 = SnapshotStateKt.collectAsState(stateFlow3, null, composer, 8, 1);
            m6561n2 = this.this$0.m6561n();
            State collectAsState5 = SnapshotStateKt.collectAsState(m6561n2.getAlReadyOwnerOcr(), null, composer, 8, 1);
            boolean invoke$lambda$4 = invoke$lambda$4(collectAsState5);
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateView: ");
            sb.append(invoke$lambda$4);
            m6561n3 = this.this$0.m6561n();
            String ownerIdCardNumber = m6561n3.getOwnerIdCardNumber();
            if (ownerIdCardNumber == null) {
                ownerIdCardNumber = "";
            }
            String str2 = ownerIdCardNumber;
            composer.startReplaceableGroup(-252705541);
            if (invoke$lambda$0(collectAsState)) {
                str = str2;
                state = collectAsState5;
                OneDialogKt.OneDialogChooser(StringResources_androidKt.stringResource(R.string.prepaid_take_more_photo, composer, 0), StringResources_androidKt.stringResource(R.string.nextStep, composer, 0), StringResources_androidKt.stringResource(R.string.takeMorePhoto, composer, 0), new C161641(this.this$0), new C161652(this.this$0), composer, 0, 0);
            } else {
                str = str2;
                state = collectAsState5;
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-252704750);
            if (invoke$lambda$3(collectAsState4)) {
                OneDialogKt.OneDialogMessage(StringResources_androidKt.stringResource(R.string.server_error_try_again, composer, 0), new C161663(this.this$0), null, composer, 0, 4);
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-252704398);
            if (invoke$lambda$1(collectAsState2)) {
                OneDialogKt.OneDialogMessageRed(StringResources_androidKt.stringResource(R.string.mrtr_change_sim_validate_attorney_id_card_error, composer, 0), new C161674(this.this$0, rememberNavController), StringResources_androidKt.stringResource(R.string.ok, composer, 0), composer, 0, 0);
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-252703751);
            if (invoke$lambda$2(collectAsState3)) {
                OneDialogKt.OneDialogMessageRed(StringResources_androidKt.stringResource(R.string.mrtr_change_sim_validate_id_card_error, composer, 0), new C161685(this.this$0, rememberNavController), StringResources_androidKt.stringResource(R.string.ok, composer, 0), composer, 0, 0);
            }
            composer.endReplaceableGroup();
            SurfaceKt.m70812SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1943289101, true, new C161696(rememberNavController, this.this$0, state, str)), composer, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimUpPassFlowFragment$onCreateView$1$1(MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment) {
        super(2);
        this.this$0 = mrtrChangeSimUpPassFlowFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        UpPassViewModel upPassViewModel;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-463040800, i, -1, "th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment.onCreateView.<anonymous>.<anonymous> (MrtrChangeSimUpPassFlowFragment.kt:128)");
        }
        upPassViewModel = this.this$0.f101723i;
        if (upPassViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
            upPassViewModel = null;
        }
        ThemeKt.OneTheme(upPassViewModel.getTheme(), false, ComposableLambdaKt.composableLambda(composer, 1923235314, true, new C161631(this.this$0)), composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}