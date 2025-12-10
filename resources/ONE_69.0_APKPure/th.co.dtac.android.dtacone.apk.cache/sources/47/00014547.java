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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1", m29092f = "OneRegisterTrueOnlineTakePhotoViewModel.kt", m29091i = {0}, m29090l = {217}, m29089m = "invokeSuspend", m29088n = {"savedBitmap"}, m29087s = {"L$0"})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineTakePhotoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineTakePhotoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,254:1\n230#2,5:255\n230#2,5:260\n230#2,5:265\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineTakePhotoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1\n*L\n209#1:255,5\n212#1:260,5\n219#1:265,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    Object L$0;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineTakePhotoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1(OneRegisterTrueOnlineTakePhotoViewModel oneRegisterTrueOnlineTakePhotoViewModel, Bitmap bitmap, int i, int i2, Continuation<? super OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineTakePhotoViewModel;
        this.$bitmap = bitmap;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1(this.this$0, this.$bitmap, this.$width, this.$height, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        BitmapCollection m9348i;
        MutableSharedFlow mutableSharedFlow;
        BitmapCollection bitmapCollection;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                bitmapCollection = (BitmapCollection) this.L$0;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.f98149l;
            do {
                value = mutableStateFlow.getValue();
                TakePhotoOptionalState takePhotoOptionalState = (TakePhotoOptionalState) value;
            } while (!mutableStateFlow.compareAndSet(value, TakePhotoOptionalState.TakingPhoto.INSTANCE));
            if (this.this$0.getOptionalPhotoName() == null) {
                mutableStateFlow2 = this.this$0.f98149l;
                do {
                    value2 = mutableStateFlow2.getValue();
                    TakePhotoOptionalState takePhotoOptionalState2 = (TakePhotoOptionalState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new TakePhotoOptionalState.Error("Optional Photo name is not defined. (optionalPhotoName is null)")));
                return Unit.INSTANCE;
            }
            m9348i = this.this$0.m9348i(new BitmapCollection(this.this$0.getOptionalPhotoName(), this.$bitmap), this.$width, this.$height);
            mutableSharedFlow = this.this$0.f98151n;
            String name = m9348i.getName();
            Intrinsics.checkNotNull(name);
            this.L$0 = m9348i;
            this.label = 1;
            if (mutableSharedFlow.emit(name, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmapCollection = m9348i;
        }
        String optionalPhotoName = this.this$0.getOptionalPhotoName();
        StringBuilder sb = new StringBuilder();
        sb.append("takePhotoOptional: ");
        sb.append(optionalPhotoName);
        mutableStateFlow3 = this.this$0.f98149l;
        do {
            value3 = mutableStateFlow3.getValue();
            TakePhotoOptionalState takePhotoOptionalState3 = (TakePhotoOptionalState) value3;
        } while (!mutableStateFlow3.compareAndSet(value3, new TakePhotoOptionalState.PreviewPhoto(bitmapCollection.getBitmap())));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineTakePhotoViewModel$takePhotoOptional$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}