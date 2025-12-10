package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.PdfBitmapConverter;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$1", m29092f = "SignaturePageScreen.kt", m29091i = {}, m29090l = {TypedValues.TransitionType.TYPE_INTERPOLATOR}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfPreview$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $base64Sting;
    final /* synthetic */ PdfBitmapConverter $pdfBitmapConverter;
    final /* synthetic */ MutableState<List<Bitmap>> $renderedBitmaps$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfPreview$1(PdfBitmapConverter pdfBitmapConverter, String str, MutableState<List<Bitmap>> mutableState, Continuation<? super SignaturePageScreenKt$PdfPreview$1> continuation) {
        super(2, continuation);
        this.$pdfBitmapConverter = pdfBitmapConverter;
        this.$base64Sting = str;
        this.$renderedBitmaps$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SignaturePageScreenKt$PdfPreview$1(this.$pdfBitmapConverter, this.$base64Sting, this.$renderedBitmaps$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableState<List<Bitmap>> mutableState;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    mutableState = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                MutableState<List<Bitmap>> mutableState2 = this.$renderedBitmaps$delegate;
                PdfBitmapConverter pdfBitmapConverter = this.$pdfBitmapConverter;
                String str = this.$base64Sting;
                this.L$0 = mutableState2;
                this.label = 1;
                Object base64PdfToBitmaps$default = PdfBitmapConverter.base64PdfToBitmaps$default(pdfBitmapConverter, str, null, null, this, 6, null);
                if (base64PdfToBitmaps$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                obj = base64PdfToBitmaps$default;
            }
            SignaturePageScreenKt.m1770e(mutableState, (List) obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SignaturePageScreenKt$PdfPreview$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}