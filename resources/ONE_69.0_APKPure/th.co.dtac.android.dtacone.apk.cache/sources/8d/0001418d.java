package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import android.content.Context;
import android.graphics.Bitmap;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$5$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n76#2:1519\n76#2:1527\n25#3:1520\n25#3:1528\n1097#4,6:1521\n1097#4,6:1529\n81#5:1535\n81#5:1536\n81#5:1537\n107#5,2:1538\n81#5:1540\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$5$3\n*L\n528#1:1519\n536#1:1527\n529#1:1520\n537#1:1528\n529#1:1521,6\n537#1:1529,6\n534#1:1535\n535#1:1536\n537#1:1537\n537#1:1538,2\n577#1:1540\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$5$3 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {539}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1 */
    /* loaded from: classes10.dex */
    public static final class C152991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1$1 */
        /* loaded from: classes10.dex */
        public static final class C153001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
            final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {541}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C153011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
                final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
                int label;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$1$1$1$1 */
                /* loaded from: classes10.dex */
                public static final class C153021 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C153021(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C153021> continuation) {
                        super(2, continuation);
                        this.$viewModel = oneRegisterTrueOnlineViewModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C153021 c153021 = new C153021(this.$viewModel, continuation);
                        c153021.L$0 = obj;
                        return c153021;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.$viewModel.addOptionalPhotoName((String) this.L$0);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull String str, @Nullable Continuation<? super Unit> continuation) {
                        return ((C153021) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C153011(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C153011> continuation) {
                    super(2, continuation);
                    this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
                    this.$viewModel = oneRegisterTrueOnlineViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C153011(this.$takePhotoViewModel, this.$viewModel, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<String> onPhotoOptionalSaved = this.$takePhotoViewModel.getOnPhotoOptionalSaved();
                        C153021 c153021 = new C153021(this.$viewModel, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(onPhotoOptionalSaved, c153021, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C153011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C153001(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C153001> continuation) {
                super(2, continuation);
                this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
                this.$viewModel = oneRegisterTrueOnlineViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C153001 c153001 = new C153001(this.$takePhotoViewModel, this.$viewModel, continuation);
                c153001.L$0 = obj;
                return c153001;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C153011(this.$takePhotoViewModel, this.$viewModel, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C153001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152991(Lifecycle lifecycle, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152991> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152991(this.$lifecycle, this.$takePhotoViewModel, this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C153001 c153001 = new C153001(this.$takePhotoViewModel, this.$viewModel, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c153001, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$2 */
    /* loaded from: classes10.dex */
    public static final class C153032 extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ LifecycleCameraController $cameraController;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153032(LifecycleCameraController lifecycleCameraController, Context context, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel) {
            super(2);
            this.$cameraController = lifecycleCameraController;
            this.$applicationContext = context;
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final int i, final int i2) {
            LifecycleCameraController lifecycleCameraController = this.$cameraController;
            Executor mainExecutor = ContextCompat.getMainExecutor(this.$applicationContext);
            final OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel = this.$takePhotoViewModel;
            lifecycleCameraController.takePicture(mainExecutor, new ImageCapture.OnImageCapturedCallback() { // from class: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt.oneTolNavGraph.1.5.3.2.1
                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onCaptureSuccess(@NotNull ImageProxy image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    super.onCaptureSuccess(image);
                    OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel2 = OneRegisterTrueOnlineTakePhotoViewModel.this;
                    Bitmap bitmap = image.toBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "image.toBitmap()");
                    oneRegisterTrueOnlineTakePhotoViewModel2.takePhotoOptional(bitmap, i, i2);
                }

                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onError(@NotNull ImageCaptureException exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    super.onError(exception);
                }
            });
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$3 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C153053 extends FunctionReferenceImpl implements Function0<Unit> {
        public C153053(Object obj) {
            super(0, obj, OneRegisterTrueOnlineTakePhotoViewModel.class, "setOptionalPhotoStateTakePhoto", "setOptionalPhotoStateTakePhoto()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OneRegisterTrueOnlineTakePhotoViewModel) this.receiver).setOptionalPhotoStateTakePhoto();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$4 */
    /* loaded from: classes10.dex */
    public static final class C153064 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153064(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel) {
            super(0);
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$takePhotoViewModel.setOptionalPhotoName(this.$viewModel.getNextOptionalPhotoName());
            this.$takePhotoViewModel.setOptionalPhotoStateTakePhoto();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$5$3$5 */
    /* loaded from: classes10.dex */
    public static final class C153075 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MutableState<Boolean> $performNavigateTolPackage$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153075(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, MutableState<Boolean> mutableState) {
            super(0);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$performNavigateTolPackage$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.getCampaignList();
            OneTolNavGraphKt$oneTolNavGraph$1$5$3.invoke$lambda$6(this.$performNavigateTolPackage$delegate, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$5$3(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final TakePhotoOptionalState invoke$lambda$2(State<? extends TakePhotoOptionalState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final CampaignPackageListState invoke$lambda$7(State<? extends CampaignPackageListState> state) {
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
            ComposerKt.traceEventStart(-813916930, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:526)");
        }
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
        State collectAsState = SnapshotStateKt.collectAsState(this.$takePhotoViewModel.getTakePhotoOptionalState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.isMaxTakePhotoOptional(), null, composer, 8, 1);
        Lifecycle lifecycle = ((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152991(lifecycle, this.$takePhotoViewModel, this.$viewModel, null), composer, 70);
        TakePhotoOptionalScreenKt.TakePhotoOptionalScreen(invoke$lambda$2(collectAsState), invoke$lambda$3(collectAsState2), lifecycleCameraController2, new C153032(lifecycleCameraController2, applicationContext, this.$takePhotoViewModel), new C153053(this.$takePhotoViewModel), new C153064(this.$takePhotoViewModel, this.$viewModel), new C153075(this.$viewModel, mutableState), false, composer, 512, 128);
        if (invoke$lambda$5(mutableState)) {
            OneTolNavGraphKt.PerformNavigatePackageCampaign(invoke$lambda$7(SnapshotStateKt.collectAsState(this.$viewModel.getCampaignPackageListState(), null, composer, 8, 1)), this.$navController, composer, 64);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}