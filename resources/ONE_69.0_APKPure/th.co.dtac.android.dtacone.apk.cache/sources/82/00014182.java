package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.google.mlkit.vision.common.InputImage;
import java.util.concurrent.Executor;
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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoIdCardState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$5$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n76#2:1519\n25#3:1520\n25#3:1527\n25#3:1534\n1097#4,6:1521\n1097#4,6:1528\n1097#4,6:1535\n81#5:1541\n81#5:1542\n81#5:1543\n107#5,2:1544\n81#5:1546\n107#5,2:1547\n81#5:1549\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$5$1\n*L\n445#1:1519\n446#1:1520\n452#1:1527\n453#1:1534\n446#1:1521,6\n452#1:1528,6\n453#1:1535,6\n444#1:1541\n451#1:1542\n452#1:1543\n452#1:1544,2\n453#1:1546\n453#1:1547,2\n518#1:1549\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$5$1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$1 */
    /* loaded from: classes10.dex */
    public static final class C152911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152911(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, Continuation<? super C152911> continuation) {
            super(2, continuation);
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152911(this.$takePhotoViewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$takePhotoViewModel.clearCounterTakePhotoIdCard();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$2 */
    /* loaded from: classes10.dex */
    public static final class C152922 extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ LifecycleCameraController $cameraController;
        final /* synthetic */ MutableState<Boolean> $isTakingPhoto$delegate;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152922(LifecycleCameraController lifecycleCameraController, Context context, MutableState<Boolean> mutableState, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel) {
            super(2);
            this.$cameraController = lifecycleCameraController;
            this.$applicationContext = context;
            this.$isTakingPhoto$delegate = mutableState;
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final int i, final int i2) {
            OneTolNavGraphKt$oneTolNavGraph$1$5$1.invoke$lambda$6(this.$isTakingPhoto$delegate, true);
            LifecycleCameraController lifecycleCameraController = this.$cameraController;
            Executor mainExecutor = ContextCompat.getMainExecutor(this.$applicationContext);
            final OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel = this.$takePhotoViewModel;
            final MutableState<Boolean> mutableState = this.$isTakingPhoto$delegate;
            lifecycleCameraController.takePicture(mainExecutor, new ImageCapture.OnImageCapturedCallback() { // from class: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt.oneTolNavGraph.1.5.1.2.1
                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onCaptureSuccess(@NotNull ImageProxy image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    super.onCaptureSuccess(image);
                    OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel2 = OneRegisterTrueOnlineTakePhotoViewModel.this;
                    Bitmap bitmap = image.toBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "image.toBitmap()");
                    oneRegisterTrueOnlineTakePhotoViewModel2.takePhotoIdCard(bitmap, i, i2);
                    Image image2 = image.getImage();
                    if (image2 != null) {
                        InputImage fromMediaImage = InputImage.fromMediaImage(image2, image.getImageInfo().getRotationDegrees());
                        Intrinsics.checkNotNullExpressionValue(fromMediaImage, "fromMediaImage(\n        …                        )");
                        OneRegisterTrueOnlineTakePhotoViewModel.this.recognizeTextOnIdCard(fromMediaImage);
                    }
                    OneTolNavGraphKt$oneTolNavGraph$1$5$1.invoke$lambda$6(mutableState, false);
                }

                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onError(@NotNull ImageCaptureException exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    super.onError(exception);
                    OneTolNavGraphKt$oneTolNavGraph$1$5$1.invoke$lambda$6(mutableState, false);
                }
            });
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$3 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152943 extends FunctionReferenceImpl implements Function0<Unit> {
        public C152943(Object obj) {
            super(0, obj, OneRegisterTrueOnlineTakePhotoViewModel.class, "retakePhotoIdCard", "retakePhotoIdCard()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineTakePhotoViewModel) this.receiver).retakePhotoIdCard();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$4 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152954 extends FunctionReferenceImpl implements Function0<Unit> {
        public C152954(Object obj) {
            super(0, obj, OneRegisterTrueOnlineTakePhotoViewModel.class, "confirmUsePhotoIdCard", "confirmUsePhotoIdCard()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineTakePhotoViewModel) this.receiver).confirmUsePhotoIdCard();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$5 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152965 extends FunctionReferenceImpl implements Function0<Unit> {
        public C152965(Object obj) {
            super(0, obj, OneRegisterTrueOnlineTakePhotoViewModel.class, "confirmPreviewPhotoIdCard", "confirmPreviewPhotoIdCard()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineTakePhotoViewModel) this.receiver).confirmPreviewPhotoIdCard();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$6 */
    /* loaded from: classes10.dex */
    public static final class C152976 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $performNavigateTolPackage$delegate;
        final /* synthetic */ State<ProductType> $productType$delegate;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$1$6$WhenMappings */
        /* loaded from: classes10.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProductType.values().length];
                try {
                    iArr[ProductType.TWO_P.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProductType.THREE_P_OTT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProductType.FOUR_P_OTT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C152976(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, State<? extends ProductType> state, MutableState<Boolean> mutableState) {
            super(1);
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$productType$delegate = state;
            this.$performNavigateTolPackage$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("TakePhoto: takeMore: ");
            sb.append(z);
            String idCardBirthday = this.$takePhotoViewModel.getIdCardBirthday();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TakePhoto: idCardBirthday: ");
            sb2.append(idCardBirthday);
            String idCardBirthday2 = this.$takePhotoViewModel.getIdCardBirthday();
            if (idCardBirthday2 != null) {
                this.$viewModel.setCustomerInfoBirthday(idCardBirthday2);
            }
            this.$takePhotoViewModel.confirmTakeMorePhoto(z);
            if (!z) {
                ProductType invoke$lambda$0 = OneTolNavGraphKt$oneTolNavGraph$1$5$1.invoke$lambda$0(this.$productType$delegate);
                int i = invoke$lambda$0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke$lambda$0.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    this.$viewModel.getCampaignList();
                    OneTolNavGraphKt$oneTolNavGraph$1$5$1.invoke$lambda$9(this.$performNavigateTolPackage$delegate, true);
                    return;
                }
                NavController.navigate$default(this.$navController, OneTolScreen.Tol.TakePhoto.FaceRecognition.ROUTE, null, null, 6, null);
                return;
            }
            this.$takePhotoViewModel.setOptionalPhotoName(this.$viewModel.getNextOptionalPhotoName());
            this.$takePhotoViewModel.setOptionalPhotoStateTakePhoto();
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.TakePhoto.Optional.ROUTE, null, null, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$5$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        this.$navController = navController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductType invoke$lambda$0(State<? extends ProductType> state) {
        return state.getValue();
    }

    private static final CampaignPackageListState invoke$lambda$10(State<? extends CampaignPackageListState> state) {
        return state.getValue();
    }

    private static final TakePhotoIdCardState invoke$lambda$3(State<? extends TakePhotoIdCardState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
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
            ComposerKt.traceEventStart(107159990, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:442)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getProductType(), null, composer, 8, 1);
        Context applicationContext = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Object obj = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
            LifecycleCameraController lifecycleCameraController = new LifecycleCameraController(applicationContext);
            lifecycleCameraController.setEnabledUseCases(1);
            composer.updateRememberedValue(lifecycleCameraController);
            obj = lifecycleCameraController;
        }
        composer.endReplaceableGroup();
        LifecycleCameraController lifecycleCameraController2 = (LifecycleCameraController) obj;
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$takePhotoViewModel.getTakePhotoIdCardState(), null, composer, 8, 1);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue3;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152911(this.$takePhotoViewModel, null), composer, 70);
        TakePhotoIdCardScreenKt.TakePhotoIdCardScreen(invoke$lambda$3(collectAsState2), lifecycleCameraController2, invoke$lambda$5(mutableState), new C152922(lifecycleCameraController2, applicationContext, mutableState, this.$takePhotoViewModel), new C152943(this.$takePhotoViewModel), new C152954(this.$takePhotoViewModel), new C152965(this.$takePhotoViewModel), new C152976(this.$takePhotoViewModel, this.$viewModel, this.$navController, collectAsState, mutableState2), composer, 64);
        if (invoke$lambda$8(mutableState2)) {
            OneTolNavGraphKt.PerformNavigatePackageCampaign(invoke$lambda$10(SnapshotStateKt.collectAsState(this.$viewModel.getCampaignPackageListState(), null, composer, 8, 1)), this.$navController, composer, 64);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}