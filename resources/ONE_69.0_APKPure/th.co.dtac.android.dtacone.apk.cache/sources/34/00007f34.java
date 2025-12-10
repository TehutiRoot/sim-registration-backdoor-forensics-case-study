package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R/\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0016\u0010\nR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0012\u0010\u000fR\u001b\u0010!\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001b\u0010&\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001b\u0010(\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "", "complete$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "complete", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "completeExceptionally$lottie_compose_release", "(Ljava/lang/Throwable;)V", "completeExceptionally", "Lkotlinx/coroutines/CompletableDeferred;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CompletableDeferred;", "compositionDeferred", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "value", OperatorName.CURVE_TO, "getError", "()Ljava/lang/Throwable;", "", "d", "Landroidx/compose/runtime/State;", "isLoading", "()Z", "e", "isComplete", OperatorName.FILL_NON_ZERO, "isFailure", OperatorName.NON_STROKING_GRAY, "isSuccess", "lottie-compose_release"}, m29141k = 1, m29140mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LottieCompositionResultImpl implements LottieCompositionResult {

    /* renamed from: a */
    public final CompletableDeferred f41259a = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    /* renamed from: b */
    public final MutableState f41260b;

    /* renamed from: c */
    public final MutableState f41261c;

    /* renamed from: d */
    public final State f41262d;

    /* renamed from: e */
    public final State f41263e;

    /* renamed from: f */
    public final State f41264f;

    /* renamed from: g */
    public final State f41265g;

    public LottieCompositionResultImpl() {
        MutableState m65148g;
        MutableState m65148g2;
        m65148g = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f41260b = m65148g;
        m65148g2 = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f41261c = m65148g2;
        this.f41262d = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isLoading$2(this));
        this.f41263e = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isComplete$2(this));
        this.f41264f = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isFailure$2(this));
        this.f41265g = SnapshotStateKt.derivedStateOf(new LottieCompositionResultImpl$isSuccess$2(this));
    }

    /* renamed from: a */
    public final void m50817a(Throwable th2) {
        this.f41261c.setValue(th2);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    @Nullable
    public Object await(@NotNull Continuation<? super LottieComposition> continuation) {
        return this.f41259a.await(continuation);
    }

    /* renamed from: b */
    public final void m50816b(LottieComposition lottieComposition) {
        this.f41260b.setValue(lottieComposition);
    }

    public final synchronized void complete$lottie_compose_release(@NotNull LottieComposition composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (isComplete()) {
            return;
        }
        m50816b(composition);
        this.f41259a.complete(composition);
    }

    public final synchronized void completeExceptionally$lottie_compose_release(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (isComplete()) {
            return;
        }
        m50817a(error);
        this.f41259a.completeExceptionally(error);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    @Nullable
    public Throwable getError() {
        return (Throwable) this.f41261c.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isComplete() {
        return ((Boolean) this.f41263e.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isFailure() {
        return ((Boolean) this.f41264f.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isLoading() {
        return ((Boolean) this.f41262d.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isSuccess() {
        return ((Boolean) this.f41265g.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.compose.LottieCompositionResult, androidx.compose.runtime.State
    @Nullable
    public LottieComposition getValue() {
        return (LottieComposition) this.f41260b.getValue();
    }
}