package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28850d2 = {"<anonymous>", "Lkotlin/Pair;", "T1", "T2", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class LiveDataUtilsKt$combineLatest$2 extends Lambda implements Function2<T1, T2, Pair<? extends T1, ? extends T2>> {
    public static final LiveDataUtilsKt$combineLatest$2 INSTANCE = new LiveDataUtilsKt$combineLatest$2();

    public LiveDataUtilsKt$combineLatest$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((LiveDataUtilsKt$combineLatest$2) obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<T1, T2> invoke(T1 t1, T2 t2) {
        return TuplesKt.m28844to(t1, t2);
    }
}
