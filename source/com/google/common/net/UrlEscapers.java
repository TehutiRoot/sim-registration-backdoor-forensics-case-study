package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

@GwtCompatible
/* loaded from: classes4.dex */
public final class UrlEscapers {

    /* renamed from: a */
    public static final Escaper f54067a = new PercentEscaper(com.google.api.client.util.escape.PercentEscaper.SAFECHARS_URLENCODER, true);

    /* renamed from: b */
    public static final Escaper f54068b = new PercentEscaper("-._~!$'()*,;&=@:+", false);

    /* renamed from: c */
    public static final Escaper f54069c = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);

    public static Escaper urlFormParameterEscaper() {
        return f54067a;
    }

    public static Escaper urlFragmentEscaper() {
        return f54069c;
    }

    public static Escaper urlPathSegmentEscaper() {
        return f54068b;
    }
}
