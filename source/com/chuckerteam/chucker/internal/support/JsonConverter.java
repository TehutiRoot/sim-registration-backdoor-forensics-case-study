package com.chuckerteam.chucker.internal.support;

import com.google.gson.Gson;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/JsonConverter;", "", "<init>", "()V", "Lcom/google/gson/Gson;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Lazy;", "getNonNullSerializerInstance", "()Lcom/google/gson/Gson;", "nonNullSerializerInstance", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getInstance", "instance", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class JsonConverter {
    @NotNull
    public static final JsonConverter INSTANCE = new JsonConverter();

    /* renamed from: a */
    public static final Lazy f42938a = LazyKt__LazyJVMKt.lazy(JsonConverter$nonNullSerializerInstance$2.INSTANCE);

    /* renamed from: b */
    public static final Lazy f42939b = LazyKt__LazyJVMKt.lazy(JsonConverter$instance$2.INSTANCE);

    @NotNull
    public final Gson getInstance() {
        Object value = f42939b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-instance>(...)");
        return (Gson) value;
    }

    @NotNull
    public final Gson getNonNullSerializerInstance() {
        Object value = f42938a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-nonNullSerializerInstance>(...)");
        return (Gson) value;
    }
}
