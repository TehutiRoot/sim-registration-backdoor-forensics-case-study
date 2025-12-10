package com.chuckerteam.chucker.internal.support;

import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "entry", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class FormatUtils$formatUrlEncodedForm$1 extends Lambda implements Function1<String, CharSequence> {
    public static final FormatUtils$formatUrlEncodedForm$1 INSTANCE = new FormatUtils$formatUrlEncodedForm$1();

    public FormatUtils$formatUrlEncodedForm$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull String entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        List split$default = StringsKt__StringsKt.split$default((CharSequence) entry, new String[]{"="}, false, 0, 6, (Object) null);
        String str = (String) split$default.get(0);
        String decode = split$default.size() > 1 ? URLDecoder.decode((String) split$default.get(1), "UTF-8") : "";
        return str + ": " + decode;
    }
}
