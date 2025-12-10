package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import android.graphics.Bitmap;
import android.graphics.Matrix;
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
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$takePhotoOptional$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$takePhotoOptional$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$takePhotoOptional$1\n*L\n193#1:1160,5\n205#1:1165,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$takePhotoOptional$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$takePhotoOptional$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$takePhotoOptional$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, Bitmap bitmap, int i, int i2, Continuation<? super OneConsentAndESignViewModel$takePhotoOptional$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
        this.$bitmap = bitmap;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$takePhotoOptional$1(this.this$0, this.$bitmap, this.$width, this.$height, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        BitmapUtil bitmapUtil;
        MutableStateFlow mutableStateFlow3;
        Object value2;
        MutableStateFlow mutableStateFlow4;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.f90940D;
            do {
                value = mutableStateFlow.getValue();
                TakePhotoOptionalState takePhotoOptionalState = (TakePhotoOptionalState) value;
            } while (!mutableStateFlow.compareAndSet(value, TakePhotoOptionalState.TakingPhoto.INSTANCE));
            mutableStateFlow2 = this.this$0.f90947K;
            String str = (String) mutableStateFlow2.getValue();
            Bitmap bitmap = this.$bitmap;
            if (bitmap.getWidth() > bitmap.getHeight()) {
                Matrix matrix = new Matrix();
                matrix.postRotate(90.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            BitmapCollection bitmapCollection = new BitmapCollection(str, bitmap);
            bitmapUtil = this.this$0.f90957c;
            Bitmap bitmap2 = bitmapCollection.getBitmap();
            Intrinsics.checkNotNull(bitmap2);
            byte[] cropImageFull = bitmapUtil.cropImageFull(bitmap2, this.$width, this.$height);
            Intrinsics.checkNotNullExpressionValue(cropImageFull, "bitmapUtil.cropImageFull….bitmap!!, width, height)");
            Bitmap bitmap3 = BitmapExtKt.toBitmap(cropImageFull);
            mutableStateFlow3 = this.this$0.f90940D;
            OneConsentAndESignViewModel oneConsentAndESignViewModel = this.this$0;
            do {
                value2 = mutableStateFlow3.getValue();
                TakePhotoOptionalState takePhotoOptionalState2 = (TakePhotoOptionalState) value2;
                mutableStateFlow4 = oneConsentAndESignViewModel.f90947K;
                oneConsentAndESignViewModel.updatePhotoStoreLists((String) mutableStateFlow4.getValue(), ImageDocumentType.DOCUMENT, bitmap3);
            } while (!mutableStateFlow3.compareAndSet(value2, new TakePhotoOptionalState.PreviewPhoto(bitmap3)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$takePhotoOptional$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}