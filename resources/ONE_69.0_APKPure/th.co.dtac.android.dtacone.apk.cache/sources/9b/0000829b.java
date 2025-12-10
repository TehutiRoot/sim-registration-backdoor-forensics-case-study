package com.chuckerteam.chucker.internal.support;

import android.graphics.Bitmap;
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

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.support.BitmapUtilsKt$calculateLuminance$2", m29092f = "BitmapUtils.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes3.dex */
public final class BitmapUtilsKt$calculateLuminance$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Double>, Object> {
    final /* synthetic */ int $color;
    final /* synthetic */ Bitmap $this_calculateLuminance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapUtilsKt$calculateLuminance$2(Bitmap bitmap, int i, Continuation<? super BitmapUtilsKt$calculateLuminance$2> continuation) {
        super(2, continuation);
        this.$this_calculateLuminance = bitmap;
        this.$color = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BitmapUtilsKt$calculateLuminance$2(this.$this_calculateLuminance, this.$color, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Bitmap m49930d;
        Double m49932b;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            m49930d = BitmapUtilsKt.m49930d(this.$this_calculateLuminance, this.$color);
            m49932b = BitmapUtilsKt.m49932b(m49930d, this.$color);
            return m49932b;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Double> continuation) {
        return ((BitmapUtilsKt$calculateLuminance$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}