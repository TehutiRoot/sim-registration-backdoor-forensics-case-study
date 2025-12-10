package io.fotoapparat.selector;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a,\u0010\u0004\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0002\b\u0003\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u0007\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0002\b\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a6\u0010\n\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0002\b\u0003\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\n\u0010\u0005\u001a6\u0010\u000b\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0002\b\u0003\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\u0005\u001ah\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001¢\u0006\u0002\b\u0003\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r28\u0010\u000f\u001a\u001d\u0012\u0019\b\u0001\u0012\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001¢\u0006\u0002\b\u00030\u000e\"\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ae\u0010\u0016\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0002\b\u0003\"\b\b\u0000\u0010\u0000*\u00020\u00122\u001f\u0010\u0013\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0002\b\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u0019\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0012\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m28850d2 = {"T", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "nothing", "()Lkotlin/jvm/functions/Function1;", "preference", "single", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "highest", "lowest", "Input", "Output", "", "functions", "firstAvailable", "([Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "", "selector", "", "predicate", "filtered", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "R", PDPageLabelRange.STYLE_LETTERS_LOWER, "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectors.kt\nio/fotoapparat/selector/SelectorsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n13579#2:65\n13580#2:67\n1#3:66\n*S KotlinDebug\n*F\n+ 1 Selectors.kt\nio/fotoapparat/selector/SelectorsKt\n*L\n58#1:65\n58#1:67\n*E\n"})
/* loaded from: classes5.dex */
public final class SelectorsKt {
    /* renamed from: a */
    public static final Object m30474a(Object[] objArr, Function1 function1) {
        for (Object obj : objArr) {
            Object invoke = function1.invoke(obj);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    @NotNull
    public static final <T> Function1<Iterable<? extends T>, T> filtered(@NotNull Function1<? super Iterable<? extends T>, ? extends T> selector, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new SelectorsKt$filtered$1(selector, predicate);
    }

    @SafeVarargs
    @NotNull
    public static final <Input, Output> Function1<Input, Output> firstAvailable(@NotNull Function1<? super Input, ? extends Output>... functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        return new SelectorsKt$firstAvailable$1(functions);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Function1<Iterable<? extends T>, T> highest() {
        return SelectorsKt$highest$1.INSTANCE;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Function1<Iterable<? extends T>, T> lowest() {
        return SelectorsKt$lowest$1.INSTANCE;
    }

    @NotNull
    public static final <T> Function1<Iterable<? extends T>, T> nothing() {
        return SelectorsKt$nothing$1.INSTANCE;
    }

    @NotNull
    public static final <T> Function1<Iterable<? extends T>, T> single(T t) {
        return new SelectorsKt$single$1(t);
    }
}
