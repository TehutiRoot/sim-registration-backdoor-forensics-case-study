package com.google.common.html;

import ch.qos.logback.core.CoreConstants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import kotlin.text.Typography;

@GwtCompatible
/* loaded from: classes4.dex */
public final class HtmlEscapers {

    /* renamed from: a */
    public static final Escaper f53877a = Escapers.builder().addEscape('\"', "&quot;").addEscape(CoreConstants.SINGLE_QUOTE_CHAR, "&#39;").addEscape(Typography.amp, "&amp;").addEscape(Typography.less, "&lt;").addEscape(Typography.greater, "&gt;").build();

    public static Escaper htmlEscaper() {
        return f53877a;
    }
}
