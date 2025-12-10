package com.google.common.xml;

import ch.qos.logback.core.CoreConstants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import kotlin.text.Typography;
import okio.Utf8;
import org.apache.http.message.TokenParser;

@GwtCompatible
/* loaded from: classes4.dex */
public class XmlEscapers {

    /* renamed from: a */
    public static final Escaper f54493a;

    /* renamed from: b */
    public static final Escaper f54494b;

    /* renamed from: c */
    public static final Escaper f54495c;

    static {
        Escapers.Builder builder = Escapers.builder();
        builder.setSafeRange((char) 0, Utf8.REPLACEMENT_CHARACTER);
        builder.setUnsafeReplacement("�");
        for (char c = 0; c <= 31; c = (char) (c + 1)) {
            if (c != '\t' && c != '\n' && c != '\r') {
                builder.addEscape(c, "�");
            }
        }
        builder.addEscape(Typography.amp, "&amp;");
        builder.addEscape(Typography.less, "&lt;");
        builder.addEscape(Typography.greater, "&gt;");
        f54494b = builder.build();
        builder.addEscape(CoreConstants.SINGLE_QUOTE_CHAR, "&apos;");
        builder.addEscape('\"', "&quot;");
        f54493a = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape(TokenParser.f74557CR, "&#xD;");
        f54495c = builder.build();
    }

    public static Escaper xmlAttributeEscaper() {
        return f54495c;
    }

    public static Escaper xmlContentEscaper() {
        return f54494b;
    }
}
