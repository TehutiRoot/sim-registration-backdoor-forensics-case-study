package io.fotoapparat.selector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "T", "", "", "invoke", "(Ljava/lang/Iterable;)Ljava/lang/Object;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSelectors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectors.kt\nio/fotoapparat/selector/SelectorsKt$filtered$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n766#2:65\n857#2,2:66\n*S KotlinDebug\n*F\n+ 1 Selectors.kt\nio/fotoapparat/selector/SelectorsKt$filtered$1\n*L\n54#1:65\n54#1:66,2\n*E\n"})
/* loaded from: classes5.dex */
public final class SelectorsKt$filtered$1 extends Lambda implements Function1<Iterable<? extends T>, T> {
    final /* synthetic */ Function1<T, Boolean> $predicate;
    final /* synthetic */ Function1<Iterable<? extends T>, T> $selector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectorsKt$filtered$1(Function1<? super Iterable<? extends T>, ? extends T> function1, Function1<? super T, Boolean> function12) {
        super(1);
        this.$selector = function1;
        this.$predicate = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Iterable<? extends Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    @Nullable
    public final T invoke(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$null");
        Function1<Iterable<? extends T>, T> function1 = this.$selector;
        Function1<T, Boolean> function12 = this.$predicate;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (function12.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return function1.invoke(arrayList);
    }
}
