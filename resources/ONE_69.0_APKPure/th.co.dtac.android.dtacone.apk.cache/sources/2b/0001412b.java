package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.IdCardDataItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$15$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n36#2:1533\n36#2:1540\n1097#3,6:1520\n1097#3,6:1527\n1097#3,6:1534\n1097#3,6:1541\n81#4:1547\n81#4:1548\n81#4:1549\n107#4,2:1550\n81#4:1552\n107#4,2:1553\n81#4:1555\n81#4:1556\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$15$1\n*L\n1062#1:1519\n1063#1:1526\n1098#1:1533\n1104#1:1540\n1062#1:1520,6\n1063#1:1527,6\n1098#1:1534,6\n1104#1:1541,6\n1055#1:1547\n1058#1:1548\n1062#1:1549\n1062#1:1550,2\n1063#1:1552\n1063#1:1553,2\n1066#1:1555\n1067#1:1556\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$15$1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$1$1 */
    /* loaded from: classes10.dex */
    public static final class C152341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152341(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152341> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152341(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.loadReviewImage();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$1$2 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152352 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C152352(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "removeOptionalPhoto", "removeOptionalPhoto(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((OneRegisterTrueOnlineViewModel) this.receiver).removeOptionalPhoto(i);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$1$3 */
    /* loaded from: classes10.dex */
    public static final class C152363 extends Lambda implements Function0<Unit> {
        final /* synthetic */ State<Boolean> $isMaximumPhoto$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $showMaximumPhotoDialog$delegate;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152363(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, State<Boolean> state, MutableState<Boolean> mutableState) {
            super(0);
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$isMaximumPhoto$delegate = state;
            this.$showMaximumPhotoDialog$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (OneTolNavGraphKt$oneTolNavGraph$1$15$1.invoke$lambda$9(this.$isMaximumPhoto$delegate)) {
                OneTolNavGraphKt$oneTolNavGraph$1$15$1.invoke$lambda$7(this.$showMaximumPhotoDialog$delegate, true);
                return;
            }
            this.$takePhotoViewModel.setOptionalPhotoName(this.$viewModel.getNextOptionalPhotoName());
            this.$takePhotoViewModel.setOptionalPhotoStateTakePhoto();
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.Review.TakePhoto.ROUTE, null, null, 6, null);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$1$4 */
    /* loaded from: classes10.dex */
    public static final class C152374 extends Lambda implements Function0<Unit> {
        final /* synthetic */ CustomerInformation $customerInfo;
        final /* synthetic */ State<Boolean> $isMinimumPhoto$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $showMinimumPhotoDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152374(CustomerInformation customerInformation, NavController navController, State<Boolean> state, MutableState<Boolean> mutableState) {
            super(0);
            this.$customerInfo = customerInformation;
            this.$navController = navController;
            this.$isMinimumPhoto$delegate = state;
            this.$showMinimumPhotoDialog$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$customerInfo.getAge() < 10) {
                NavController.navigate$default(this.$navController, OneTolScreen.Tol.Signature.ROUTE, null, null, 6, null);
            } else if (this.$customerInfo.getAge() < 20 && OneTolNavGraphKt$oneTolNavGraph$1$15$1.invoke$lambda$8(this.$isMinimumPhoto$delegate)) {
                OneTolNavGraphKt$oneTolNavGraph$1$15$1.invoke$lambda$4(this.$showMinimumPhotoDialog$delegate, true);
            } else {
                NavController.navigate$default(this.$navController, OneTolScreen.Tol.Consent.ROUTE, null, null, 6, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$15$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        this.$navController = navController;
    }

    private static final ReviewImageState invoke$lambda$0(State<? extends ReviewImageState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
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
            ComposerKt.traceEventStart(1728199218, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:1053)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getReviewImageState(), null, composer, 8, 1);
        IdCardDataItem idCardTypeData = this.$viewModel.getIdCardTypeData();
        String idCardValue = this.$viewModel.getIdCardValue();
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.isSmartCard(), null, composer, 8, 1);
        CustomerInformation customerInfo = this.$viewModel.getCustomerInfo();
        GisStatusOrderData gisOrder = this.$viewModel.getGisOrder();
        InstallInformation installInfo = this.$viewModel.getInstallInfo();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        int imageOptionalMin = this.$viewModel.getImageOptionalMin();
        int imageOptionalMax = this.$viewModel.getImageOptionalMax();
        State collectAsState3 = SnapshotStateKt.collectAsState(this.$viewModel.isMinTakePhotoOptional(), null, composer, 8, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.$viewModel.isMaxTakePhotoOptional(), null, composer, 8, 1);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152341(this.$viewModel, null), composer, 70);
        ReviewScreenKt.ReviewScreen(invoke$lambda$0(collectAsState), idCardTypeData, idCardValue, invoke$lambda$1(collectAsState2), customerInfo, gisOrder, installInfo, new C152352(this.$viewModel), new C152363(this.$takePhotoViewModel, this.$viewModel, this.$navController, collectAsState4, mutableState2), new C152374(customerInfo, this.$navController, collectAsState3, mutableState), composer, 2392064);
        composer.startReplaceableGroup(1738385370);
        if (invoke$lambda$3(mutableState)) {
            String stringResource = StringResources_androidKt.stringResource(R.string.one_tol_review_take_photo_minimum, new Object[]{Integer.valueOf(imageOptionalMin)}, composer, 64);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new OneTolNavGraphKt$oneTolNavGraph$1$15$1$5$1(mutableState);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogMessage(stringResource, (Function0) rememberedValue3, null, composer, 0, 4);
        }
        composer.endReplaceableGroup();
        if (invoke$lambda$6(mutableState2)) {
            String stringResource2 = StringResources_androidKt.stringResource(R.string.one_tol_review_take_photo_maximum, new Object[]{Integer.valueOf(imageOptionalMax)}, composer, 64);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(mutableState2);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new OneTolNavGraphKt$oneTolNavGraph$1$15$1$6$1(mutableState2);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogMessage(stringResource2, (Function0) rememberedValue4, null, composer, 0, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}