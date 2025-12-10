package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocument;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneConsentAndESignNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,755:1\n76#2:756\n25#3:757\n1097#4,6:758\n81#5:764\n81#5:765\n81#5:766\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/screen/OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8\n*L\n426#1:756\n427#1:757\n427#1:758,6\n432#1:764\n433#1:765\n434#1:766\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8$1", m29092f = "OneConsentAndESignNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8$1 */
    /* loaded from: classes10.dex */
    public static final class C146951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ State<List<ImageDocument>> $optionalPhotoList$delegate;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C146951(OneConsentAndESignViewModel oneConsentAndESignViewModel, State<? extends List<ImageDocument>> state, Continuation<? super C146951> continuation) {
            super(2, continuation);
            this.$viewModel = oneConsentAndESignViewModel;
            this.$optionalPhotoList$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C146951(this.$viewModel, this.$optionalPhotoList$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8.invoke$lambda$4(this.$optionalPhotoList$delegate).isEmpty()) {
                    this.$viewModel.getOptionalList();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C146951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8$2 */
    /* loaded from: classes10.dex */
    public static final class C146962 extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ LifecycleCameraController $cameraController;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146962(LifecycleCameraController lifecycleCameraController, Context context, OneConsentAndESignViewModel oneConsentAndESignViewModel) {
            super(2);
            this.$cameraController = lifecycleCameraController;
            this.$applicationContext = context;
            this.$viewModel = oneConsentAndESignViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final int i, final int i2) {
            LifecycleCameraController lifecycleCameraController = this.$cameraController;
            Executor mainExecutor = ContextCompat.getMainExecutor(this.$applicationContext);
            final OneConsentAndESignViewModel oneConsentAndESignViewModel = this.$viewModel;
            lifecycleCameraController.takePicture(mainExecutor, new ImageCapture.OnImageCapturedCallback() { // from class: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt.oneESignNavGraph.1.8.2.1
                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onCaptureSuccess(@NotNull ImageProxy image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    super.onCaptureSuccess(image);
                    OneConsentAndESignViewModel oneConsentAndESignViewModel2 = OneConsentAndESignViewModel.this;
                    Bitmap bitmap = image.toBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "image.toBitmap()");
                    oneConsentAndESignViewModel2.takePhotoOptional(bitmap, i, i2);
                }
            });
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8$3 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C146983 extends FunctionReferenceImpl implements Function0<Unit> {
        public C146983(Object obj) {
            super(0, obj, OneConsentAndESignViewModel.class, "setOptionalPhotoStateTakePhoto", "setOptionalPhotoStateTakePhoto()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneConsentAndESignViewModel) this.receiver).setOptionalPhotoStateTakePhoto();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8$4 */
    /* loaded from: classes10.dex */
    public static final class C146994 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146994(OneConsentAndESignViewModel oneConsentAndESignViewModel) {
            super(0);
            this.$viewModel = oneConsentAndESignViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.getNextOptionalPhotoName();
            this.$viewModel.setOptionalPhotoStateTakePhoto();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8$5 */
    /* loaded from: classes10.dex */
    public static final class C147005 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ ValidateDocApproved $validateDocApproved;
        final /* synthetic */ OneConsentAndESignViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147005(OneConsentAndESignViewModel oneConsentAndESignViewModel, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
            super(0);
            this.$viewModel = oneConsentAndESignViewModel;
            this.$validateDocApproved = validateDocApproved;
            this.$navController = navController;
            this.$scope = coroutineScope;
            this.$onOptionTakeMorePhoto = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.updateValidateDocApproved(DocumentType.ADD_PHOTO.getDocType(), true);
            if (this.$validateDocApproved.isAllDocumentApproved()) {
                this.$viewModel.updateForms();
            } else {
                OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$8(OneConsentAndESignViewModel oneConsentAndESignViewModel, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
        super(4);
        this.$viewModel = oneConsentAndESignViewModel;
        this.$validateDocApproved = validateDocApproved;
        this.$navController = navController;
        this.$scope = coroutineScope;
        this.$onOptionTakeMorePhoto = function0;
    }

    private static final TakePhotoOptionalState invoke$lambda$2(State<? extends TakePhotoOptionalState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ImageDocument> invoke$lambda$4(State<? extends List<ImageDocument>> state) {
        return state.getValue();
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
            ComposerKt.traceEventStart(-638376237, i, -1, "th.co.dtac.android.dtacone.view.appOne.eSign.screen.oneESignNavGraph.<anonymous>.<anonymous> (OneConsentAndESignNavGraph.kt:424)");
        }
        Context applicationContext = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Object obj = rememberedValue;
        if (rememberedValue == Composer.Companion.getEmpty()) {
            LifecycleCameraController lifecycleCameraController = new LifecycleCameraController(applicationContext);
            lifecycleCameraController.setEnabledUseCases(1);
            composer.updateRememberedValue(lifecycleCameraController);
            obj = lifecycleCameraController;
        }
        composer.endReplaceableGroup();
        LifecycleCameraController lifecycleCameraController2 = (LifecycleCameraController) obj;
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getTakePhotoOptionalState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.isMaxTakePhotoOptional(), null, composer, 8, 1);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C146951(this.$viewModel, SnapshotStateKt.collectAsState(this.$viewModel.getOptionalPhotoList(), null, composer, 8, 1), null), composer, 70);
        TakePhotoOptionalScreenKt.TakePhotoOptionalScreen(invoke$lambda$2(collectAsState), invoke$lambda$3(collectAsState2), lifecycleCameraController2, new C146962(lifecycleCameraController2, applicationContext, this.$viewModel), new C146983(this.$viewModel), new C146994(this.$viewModel), new C147005(this.$viewModel, this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto), this.$viewModel.isRequiredOptionalList(), composer, 512, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}