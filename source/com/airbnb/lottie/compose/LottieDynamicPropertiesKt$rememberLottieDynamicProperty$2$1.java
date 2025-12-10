package com.airbnb.lottie.compose;

import androidx.compose.runtime.State;
import com.airbnb.lottie.value.LottieFrameInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1 extends Lambda implements Function1<LottieFrameInfo<T>, T> {
    final /* synthetic */ State<Function1<LottieFrameInfo<T>, T>> $callbackState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1(State<? extends Function1<? super LottieFrameInfo<T>, ? extends T>> state) {
        super(1);
        this.$callbackState$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((LottieFrameInfo<Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public final T invoke(@NotNull LottieFrameInfo<T> it) {
        Function1 m50818a;
        Intrinsics.checkNotNullParameter(it, "it");
        m50818a = LottieDynamicPropertiesKt.m50818a(this.$callbackState$delegate);
        return m50818a.invoke(it);
    }
}
