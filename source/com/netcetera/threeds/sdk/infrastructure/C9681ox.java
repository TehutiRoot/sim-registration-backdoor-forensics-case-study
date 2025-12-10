package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ox */
/* loaded from: classes5.dex */
public class C9681ox {
    public static String ThreeDS2Service(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            values(obj, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String get(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        valueOf(str, sb);
        return sb.toString();
    }

    public static void valueOf(String str, StringBuilder sb) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    sb.append("\\b");
                                    continue;
                                case '\t':
                                    sb.append("\\t");
                                    continue;
                                case '\n':
                                    sb.append("\\n");
                                    continue;
                                default:
                                    if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                        String hexString = Integer.toHexString(charAt);
                                        sb.append("\\u");
                                        for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                            sb.append('0');
                                        }
                                        sb.append(hexString.toUpperCase());
                                        continue;
                                    } else {
                                        sb.append(charAt);
                                        break;
                                    }
                            }
                        } else {
                            sb.append("\\\\");
                        }
                    } else {
                        sb.append("\\\"");
                    }
                } else {
                    sb.append("\\r");
                }
            } else {
                sb.append("\\f");
            }
        }
    }

    public static void values(Object obj, Writer writer) throws IOException {
        if (obj == null) {
            writer.write(AbstractJsonLexerKt.NULL);
        } else if (obj instanceof String) {
            writer.write(34);
            writer.write(get((String) obj));
            writer.write(34);
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            if (!d.isInfinite() && !d.isNaN()) {
                writer.write(obj.toString());
            } else {
                writer.write(AbstractJsonLexerKt.NULL);
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (!f.isInfinite() && !f.isNaN()) {
                writer.write(obj.toString());
            } else {
                writer.write(AbstractJsonLexerKt.NULL);
            }
        } else if (obj instanceof Number) {
            writer.write(obj.toString());
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof InterfaceC9679ov) {
            ((InterfaceC9679ov) obj).ThreeDS2Service(writer);
        } else if (obj instanceof InterfaceC9678ou) {
            writer.write(((InterfaceC9678ou) obj).valueOf());
        } else if (obj instanceof Map) {
            C9677ot.get((Map) obj, writer);
        } else if (obj instanceof Collection) {
            C9680ow.get((Collection) obj, writer);
        } else if (obj instanceof byte[]) {
            C9680ow.values((byte[]) obj, writer);
        } else if (obj instanceof short[]) {
            C9680ow.values((short[]) obj, writer);
        } else if (obj instanceof int[]) {
            C9680ow.values((int[]) obj, writer);
        } else if (obj instanceof long[]) {
            C9680ow.values((long[]) obj, writer);
        } else if (obj instanceof float[]) {
            C9680ow.ThreeDS2Service((float[]) obj, writer);
        } else if (obj instanceof double[]) {
            C9680ow.valueOf((double[]) obj, writer);
        } else if (obj instanceof boolean[]) {
            C9680ow.ThreeDS2Service((boolean[]) obj, writer);
        } else if (obj instanceof char[]) {
            C9680ow.values((char[]) obj, writer);
        } else if (obj instanceof Object[]) {
            C9680ow.ThreeDS2Service((Object[]) obj, writer);
        } else {
            values(obj.toString(), writer);
        }
    }
}
