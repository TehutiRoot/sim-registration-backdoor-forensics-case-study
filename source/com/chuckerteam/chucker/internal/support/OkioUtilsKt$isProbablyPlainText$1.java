package com.chuckerteam.chucker.internal.support;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.support.OkioUtilsKt$isProbablyPlainText$1", m28800f = "OkioUtils.kt", m28799i = {0}, m28798l = {20}, m28797m = "invokeSuspend", m28796n = {"$this$sequence"}, m28795s = {"L$0"})
/* loaded from: classes3.dex */
public final class OkioUtilsKt$isProbablyPlainText$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Buffer $prefix;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioUtilsKt$isProbablyPlainText$1(Buffer buffer, Continuation<? super OkioUtilsKt$isProbablyPlainText$1> continuation) {
        super(2, continuation);
        this.$prefix = buffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OkioUtilsKt$isProbablyPlainText$1 okioUtilsKt$isProbablyPlainText$1 = new OkioUtilsKt$isProbablyPlainText$1(this.$prefix, continuation);
        okioUtilsKt$isProbablyPlainText$1.L$0 = obj;
        return okioUtilsKt$isProbablyPlainText$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SequenceScope sequenceScope;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
        }
        while (!this.$prefix.exhausted()) {
            Integer boxInt = Boxing.boxInt(this.$prefix.readUtf8CodePoint());
            this.L$0 = sequenceScope;
            this.label = 1;
            if (sequenceScope.yield(boxInt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SequenceScope<? super Integer> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OkioUtilsKt$isProbablyPlainText$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
