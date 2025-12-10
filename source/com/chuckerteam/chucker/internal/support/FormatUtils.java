package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.internal.data.entity.HttpHeader;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/FormatUtils;", "", "<init>", "()V", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "httpHeaders", "", "withMarkup", "", "formatHeaders", "(Ljava/util/List;Z)Ljava/lang/String;", "", "bytes", "si", "formatByteCount", "(JZ)Ljava/lang/String;", "json", "formatJson", "(Ljava/lang/String;)Ljava/lang/String;", "xml", "formatXml", "form", "formatUrlEncodedForm", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FormatUtils {
    @NotNull
    public static final FormatUtils INSTANCE = new FormatUtils();

    @NotNull
    public final String formatByteCount(long j, boolean z) {
        int i;
        String str;
        String str2;
        if (z) {
            i = 1000;
        } else {
            i = 1024;
        }
        if (j < i) {
            return j + " B";
        }
        double d = j;
        double d2 = i;
        int log = (int) (Math.log(d) / Math.log(d2));
        if (z) {
            str = "kMGTPE";
        } else {
            str = "KMGTPE";
        }
        char charAt = str.charAt(log - 1);
        if (z) {
            str2 = "";
        } else {
            str2 = "i";
        }
        String str3 = charAt + str2;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(d2, log)), str3}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    @NotNull
    public final String formatHeaders(@Nullable List<HttpHeader> list, boolean z) {
        String joinToString$default;
        if (list == null || (joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, "", null, null, 0, null, new FormatUtils$formatHeaders$1(z), 30, null)) == null) {
            return "";
        }
        return joinToString$default;
    }

    @NotNull
    public final String formatJson(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String json2 = JsonConverter.INSTANCE.getInstance().toJson(JsonParser.parseString(json));
            Intrinsics.checkNotNullExpressionValue(json2, "{\n            val je = J…ance.toJson(je)\n        }");
            return json2;
        } catch (JsonParseException unused) {
            return json;
        }
    }

    @NotNull
    public final String formatUrlEncodedForm(@NotNull String form) {
        Intrinsics.checkNotNullParameter(form, "form");
        try {
            if (AbstractC20204hN1.isBlank(form)) {
                return form;
            }
            return CollectionsKt___CollectionsKt.joinToString$default(StringsKt__StringsKt.split$default((CharSequence) form, new String[]{"&"}, false, 0, 6, (Object) null), "\n", null, null, 0, null, FormatUtils$formatUrlEncodedForm$1.INSTANCE, 30, null);
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return form;
        }
    }

    @NotNull
    public final String formatXml(@NotNull String xml) {
        Intrinsics.checkNotNullParameter(xml, "xml");
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance()");
            newInstance.setExpandEntityReferences(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            Intrinsics.checkNotNullExpressionValue(newDocumentBuilder, "documentFactory.newDocumentBuilder()");
            Charset defaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
            byte[] bytes = xml.getBytes(defaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            Document parse = newDocumentBuilder.parse(new InputSource(new ByteArrayInputStream(bytes)));
            Intrinsics.checkNotNullExpressionValue(parse, "documentBuilder.parse(inputSource)");
            DOMSource dOMSource = new DOMSource(parse);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            TransformerFactory newInstance2 = TransformerFactory.newInstance();
            newInstance2.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Transformer newTransformer = newInstance2.newTransformer();
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.transform(dOMSource, streamResult);
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "{\n            val docume…iter.toString()\n        }");
            return stringWriter2;
        } catch (IOException | TransformerException | SAXParseException unused) {
            return xml;
        }
    }
}
