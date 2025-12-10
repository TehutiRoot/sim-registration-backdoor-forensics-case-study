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
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$15$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n76#2:1519\n76#2:1527\n25#3:1520\n1097#4,6:1521\n81#5:1528\n81#5:1529\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$15$2\n*L\n1109#1:1519\n1117#1:1527\n1110#1:1520\n1110#1:1521,6\n1115#1:1528\n1116#1:1529\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$15$2 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {1119}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1 */
    /* loaded from: classes10.dex */
    public static final class C152381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1$1 */
        /* loaded from: classes10.dex */
        public static final class C152391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
            final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {1121}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C152401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
                final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
                int label;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$1$1$1$1 */
                /* loaded from: classes10.dex */
                public static final class C152411 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C152411(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152411> continuation) {
                        super(2, continuation);
                        this.$viewModel = oneRegisterTrueOnlineViewModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C152411 c152411 = new C152411(this.$viewModel, continuation);
                        c152411.L$0 = obj;
                        return c152411;
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
                        return ((C152411) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C152401(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152401> continuation) {
                    super(2, continuation);
                    this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
                    this.$viewModel = oneRegisterTrueOnlineViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C152401(this.$takePhotoViewModel, this.$viewModel, continuation);
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
                        C152411 c152411 = new C152411(this.$viewModel, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(onPhotoOptionalSaved, c152411, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C152401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C152391(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152391> continuation) {
                super(2, continuation);
                this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
                this.$viewModel = oneRegisterTrueOnlineViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C152391 c152391 = new C152391(this.$takePhotoViewModel, this.$viewModel, continuation);
                c152391.L$0 = obj;
                return c152391;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C152401(this.$takePhotoViewModel, this.$viewModel, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C152391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152381(Lifecycle lifecycle, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152381> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$takePhotoViewModel = oneRegisterTrueOnlineTakePhotoViewModel;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152381(this.$lifecycle, this.$takePhotoViewModel, this.$viewModel, continuation);
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
                C152391 c152391 = new C152391(this.$takePhotoViewModel, this.$viewModel, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c152391, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$2 */
    /* loaded from: classes10.dex */
    public static final class C152422 extends Lambda implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ LifecycleCameraController $cameraController;
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152422(LifecycleCameraController lifecycleCameraController, Context context, OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel) {
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
            lifecycleCameraController.takePicture(mainExecutor, new ImageCapture.OnImageCapturedCallback() { // from class: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt.oneTolNavGraph.1.15.2.2.1
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$3 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C152443 extends FunctionReferenceImpl implements Function0<Unit> {
        public C152443(Object obj) {
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$4 */
    /* loaded from: classes10.dex */
    public static final class C152454 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel $takePhotoViewModel;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152454(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel) {
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
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$15$2$5 */
    /* loaded from: classes10.dex */
    public static final class C152465 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152465(NavController navController) {
            super(0);
            this.$navController = navController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$navController.popBackStack();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$15$2(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
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
            ComposerKt.traceEventStart(-209097829, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:1107)");
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
        State collectAsState = SnapshotStateKt.collectAsState(this.$takePhotoViewModel.getTakePhotoOptionalState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.isMaxTakePhotoOptional(), null, composer, 8, 1);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152381(((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), this.$takePhotoViewModel, this.$viewModel, null), composer, 70);
        TakePhotoOptionalScreenKt.TakePhotoOptionalScreen(invoke$lambda$2(collectAsState), invoke$lambda$3(collectAsState2), lifecycleCameraController2, new C152422(lifecycleCameraController2, applicationContext, this.$takePhotoViewModel), new C152443(this.$takePhotoViewModel), new C152454(this.$takePhotoViewModel, this.$viewModel), new C152465(this.$navController), false, composer, 512, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}