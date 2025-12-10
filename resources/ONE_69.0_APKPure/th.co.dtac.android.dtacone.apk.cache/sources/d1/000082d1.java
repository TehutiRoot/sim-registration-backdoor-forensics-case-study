package com.chuckerteam.chucker.internal.support;

import android.app.Activity;
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

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1", m29092f = "Sharable.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes3.dex */
public final class SharableKt$shareAsUtf8Text$content$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Sharable $this_shareAsUtf8Text;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharableKt$shareAsUtf8Text$content$1(Sharable sharable, Activity activity, Continuation<? super SharableKt$shareAsUtf8Text$content$1> continuation) {
        super(2, continuation);
        this.$this_shareAsUtf8Text = sharable;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SharableKt$shareAsUtf8Text$content$1(this.$this_shareAsUtf8Text, this.$activity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return SharableKt.toSharableUtf8Content(this.$this_shareAsUtf8Text, this.$activity);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return ((SharableKt$shareAsUtf8Text$content$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}