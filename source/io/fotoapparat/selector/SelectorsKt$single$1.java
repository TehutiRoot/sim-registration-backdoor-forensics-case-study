package io.fotoapparat.selector;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "T", "", "invoke", "(Ljava/lang/Iterable;)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSelectors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectors.kt\nio/fotoapparat/selector/SelectorsKt$single$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes5.dex */
public final class SelectorsKt$single$1 extends Lambda implements Function1<Iterable<? extends T>, T> {
    final /* synthetic */ T $preference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorsKt$single$1(T t) {
        super(1);
        this.$preference = t;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Iterable<? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    @Nullable
    public final T invoke(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$null");
        Object obj = this.$preference;
        for (?? r1 : iterable) {
            if (Intrinsics.areEqual((Object) r1, obj)) {
                return r1;
            }
        }
        return null;
    }
}
