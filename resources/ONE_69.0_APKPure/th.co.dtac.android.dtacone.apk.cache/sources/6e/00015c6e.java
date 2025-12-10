package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$2$2$1", m29092f = "SignaturePageScreen.kt", m29091i = {}, m29090l = {745}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$2$2$1 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfPreview$2$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Offset> $offset$delegate;
    final /* synthetic */ MutableFloatState $scale$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$2$2$1$1 */
    /* loaded from: classes9.dex */
    public static final class C167661 extends Lambda implements Function1<Offset, Unit> {
        final /* synthetic */ MutableState<Offset> $offset$delegate;
        final /* synthetic */ MutableFloatState $scale$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C167661(MutableFloatState mutableFloatState, MutableState<Offset> mutableState) {
            super(1);
            this.$scale$delegate = mutableFloatState;
            this.$offset$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m75357invokek4lQ0M(offset.m71696unboximpl());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m75357invokek4lQ0M(long j) {
            float floatValue;
            floatValue = this.$scale$delegate.getFloatValue();
            float f = 2.0f;
            if (floatValue >= 2.0f) {
                f = 1.0f;
            }
            this.$scale$delegate.setFloatValue(AbstractC11695c.coerceIn(f, 1.0f, 5.0f));
            SignaturePageScreenKt$PdfPreview$2.invoke$lambda$4(this.$offset$delegate, Offset.Companion.m71702getZeroF1C5BW0());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfPreview$2$2$1(MutableFloatState mutableFloatState, MutableState<Offset> mutableState, Continuation<? super SignaturePageScreenKt$PdfPreview$2$2$1> continuation) {
        super(2, continuation);
        this.$scale$delegate = mutableFloatState;
        this.$offset$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SignaturePageScreenKt$PdfPreview$2$2$1 signaturePageScreenKt$PdfPreview$2$2$1 = new SignaturePageScreenKt$PdfPreview$2$2$1(this.$scale$delegate, this.$offset$delegate, continuation);
        signaturePageScreenKt$PdfPreview$2$2$1.L$0 = obj;
        return signaturePageScreenKt$PdfPreview$2$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SignaturePageScreenKt$PdfPreview$2$2$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C167661 c167661 = new C167661(this.$scale$delegate, this.$offset$delegate);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, c167661, null, null, null, this, 14, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}