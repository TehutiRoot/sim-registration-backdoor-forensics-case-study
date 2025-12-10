package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BB\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012'\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u000fR\u001a\u0010\u0003\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R;\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "T", "", "property", "Lcom/airbnb/lottie/model/KeyPath;", "keyPath", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "callback", "<init>", "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Lkotlin/jvm/functions/Function1;)V", "value", "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getProperty$lottie_compose_release", "()Ljava/lang/Object;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/airbnb/lottie/model/KeyPath;", "getKeyPath$lottie_compose_release", "()Lcom/airbnb/lottie/model/KeyPath;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "getCallback$lottie_compose_release", "()Lkotlin/jvm/functions/Function1;", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LottieDynamicProperty<T> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Object f41270a;

    /* renamed from: b */
    public final KeyPath f41271b;

    /* renamed from: c */
    public final Function1 f41272c;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "T", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: com.airbnb.lottie.compose.LottieDynamicProperty$1 */
    /* loaded from: classes3.dex */
    public static final class C56931 extends Lambda implements Function1<LottieFrameInfo<T>, T> {
        final /* synthetic */ T $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56931(T t) {
            super(1);
            this.$value = t;
        }

        public final T invoke(@NotNull LottieFrameInfo<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$value;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((LottieFrameInfo<Object>) obj);
        }
    }

    static {
    }

    public LottieDynamicProperty(T t, @NotNull KeyPath keyPath, @NotNull Function1<? super LottieFrameInfo<T>, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f41270a = t;
        this.f41271b = keyPath;
        this.f41272c = callback;
    }

    @NotNull
    public final Function1<LottieFrameInfo<T>, T> getCallback$lottie_compose_release() {
        return this.f41272c;
    }

    @NotNull
    public final KeyPath getKeyPath$lottie_compose_release() {
        return this.f41271b;
    }

    public final T getProperty$lottie_compose_release() {
        return (T) this.f41270a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieDynamicProperty(T t, @NotNull KeyPath keyPath, T t2) {
        this((Object) t, keyPath, (Function1) new C56931(t2));
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
    }
}
