package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoIdCardState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1", m29092f = "OneRegisterTrueOnlineTakePhotoViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineTakePhotoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineTakePhotoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n230#2,5:255\n230#2,5:261\n1#3:260\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineTakePhotoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1\n*L\n96#1:255,5\n107#1:261,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneRegisterTrueOnlineTakePhotoViewModel.STATE.values().length];
            try {
                iArr[OneRegisterTrueOnlineTakePhotoViewModel.STATE.DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneRegisterTrueOnlineTakePhotoViewModel.STATE.COMPLETED_TIMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, Bitmap bitmap, int i, int i2, Continuation<? super OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineTakePhotoViewModel;
        this.$bitmap = bitmap;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1(this.this$0, this.$bitmap, this.$width, this.$height, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        BitmapCollection m9349h;
        int i;
        FaceDetection faceDetection;
        int i2;
        int i3;
        OneRegisterTrueOnlineTakePhotoViewModel.STATE state;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        Object faceDetected;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.f98143f;
            do {
                value = mutableStateFlow.getValue();
                TakePhotoIdCardState takePhotoIdCardState = (TakePhotoIdCardState) value;
            } while (!mutableStateFlow.compareAndSet(value, TakePhotoIdCardState.TakingPhoto.INSTANCE));
            m9349h = this.this$0.m9349h(new BitmapCollection(BitmapUtil.IMAGE_ID_CARD, this.$bitmap), this.$width, this.$height);
            String name = m9349h.getName();
            if (name != null) {
                i = this.this$0.m9352e(name);
            } else {
                i = 3;
            }
            faceDetection = this.this$0.f98139b;
            Bitmap bitmap = m9349h.getBitmap();
            Intrinsics.checkNotNull(bitmap);
            boolean onDetected = faceDetection.onDetected(bitmap);
            OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel = this.this$0;
            i2 = oneRegisterTrueOnlineTakePhotoViewModel.f98142e;
            oneRegisterTrueOnlineTakePhotoViewModel.f98142e = i2 + 1;
            if (!onDetected) {
                i3 = this.this$0.f98142e;
                if (i3 > i) {
                    state = OneRegisterTrueOnlineTakePhotoViewModel.STATE.COMPLETED_TIMES;
                } else {
                    state = OneRegisterTrueOnlineTakePhotoViewModel.STATE.NOT_FOND;
                }
            } else {
                state = OneRegisterTrueOnlineTakePhotoViewModel.STATE.DETECTED;
            }
            OneRegisterTrueOnlineTakePhotoViewModel.STATE state2 = state;
            mutableStateFlow2 = this.this$0.f98143f;
            do {
                value2 = mutableStateFlow2.getValue();
                TakePhotoIdCardState takePhotoIdCardState2 = (TakePhotoIdCardState) value2;
                int i4 = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        faceDetected = TakePhotoIdCardState.FaceNotDetected.INSTANCE;
                    } else {
                        faceDetected = new TakePhotoIdCardState.CompleteNumberOfTime(m9349h.getBitmap(), null, null, null, 14, null);
                    }
                } else {
                    faceDetected = new TakePhotoIdCardState.FaceDetected(m9349h.getBitmap(), null, null, 6, null);
                }
            } while (!mutableStateFlow2.compareAndSet(value2, faceDetected));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineTakePhotoViewModel$takePhotoIdCard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}