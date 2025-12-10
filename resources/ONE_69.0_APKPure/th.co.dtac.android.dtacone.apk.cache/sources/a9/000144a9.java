package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.camera.view.LifecycleCameraController;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.bouncycastle.asn1.eac.EACTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoIdCardState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1", m29092f = "TakePhotoIdCardScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nTakePhotoIdCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePhotoIdCardScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/takePhoto/TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,430:1\n1#2:431\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleCameraController $cameraController;
    final /* synthetic */ MutableState<Boolean> $isNotDetected$delegate;
    final /* synthetic */ TakePhotoIdCardState $takePhotoState;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1$1", m29092f = "TakePhotoIdCardScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1$1 */
    /* loaded from: classes10.dex */
    public static final class C156011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $isNotDetected$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C156011(MutableState<Boolean> mutableState, Continuation<? super C156011> continuation) {
            super(2, continuation);
            this.$isNotDetected$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C156011(this.$isNotDetected$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TakePhotoIdCardScreenKt.m9400o(this.$isNotDetected$delegate, true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C156011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1$2", m29092f = "TakePhotoIdCardScreen.kt", m29091i = {}, m29090l = {EACTags.HISTORICAL_BYTES}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1$2 */
    /* loaded from: classes10.dex */
    public static final class C156022 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $isNotDetected$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C156022(MutableState<Boolean> mutableState, Continuation<? super C156022> continuation) {
            super(2, continuation);
            this.$isNotDetected$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C156022(this.$isNotDetected$delegate, continuation);
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
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                this.label = 1;
                if (DelayKt.m74842delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            TakePhotoIdCardScreenKt.m9400o(this.$isNotDetected$delegate, false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C156022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1(TakePhotoIdCardState takePhotoIdCardState, LifecycleCameraController lifecycleCameraController, MutableState<Boolean> mutableState, Continuation<? super TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1> continuation) {
        super(2, continuation);
        this.$takePhotoState = takePhotoIdCardState;
        this.$cameraController = lifecycleCameraController;
        this.$isNotDetected$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1 takePhotoIdCardScreenKt$TakePhotoIdCardScreen$1 = new TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1(this.$takePhotoState, this.$cameraController, this.$isNotDetected$delegate, continuation);
        takePhotoIdCardScreenKt$TakePhotoIdCardScreen$1.L$0 = obj;
        return takePhotoIdCardScreenKt$TakePhotoIdCardScreen$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        LifecycleCameraController lifecycleCameraController;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TakePhotoIdCardState takePhotoIdCardState = this.$takePhotoState;
            if (takePhotoIdCardState instanceof TakePhotoIdCardState.FaceNotDetected) {
                AbstractC1539Vc.m65885e(coroutineScope, null, null, new C156011(this.$isNotDetected$delegate, null), 3, null);
                AbstractC1539Vc.m65885e(coroutineScope, null, null, new C156022(this.$isNotDetected$delegate, null), 3, null);
            } else {
                if (takePhotoIdCardState instanceof TakePhotoIdCardState.FaceDetected) {
                    z = true;
                } else {
                    z = takePhotoIdCardState instanceof TakePhotoIdCardState.CompleteNumberOfTime;
                }
                if (z && (lifecycleCameraController = this.$cameraController) != null) {
                    lifecycleCameraController.unbind();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}