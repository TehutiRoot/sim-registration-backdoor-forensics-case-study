package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.internal.data.entity.HttpHeader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "header", "Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class FormatUtils$formatHeaders$1 extends Lambda implements Function1<HttpHeader, CharSequence> {
    final /* synthetic */ boolean $withMarkup;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormatUtils$formatHeaders$1(boolean z) {
        super(1);
        this.$withMarkup = z;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull HttpHeader header) {
        Intrinsics.checkNotNullParameter(header, "header");
        if (this.$withMarkup) {
            String name = header.getName();
            String value = header.getValue();
            return "<b> " + name + ": </b>" + value + " <br />";
        }
        String name2 = header.getName();
        String value2 = header.getValue();
        return name2 + ": " + value2 + "\n";
    }
}