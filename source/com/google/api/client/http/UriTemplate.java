package com.google.api.client.http;

import ch.qos.logback.classic.spi.CallerData;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import com.google.common.base.Splitter;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.text.Typography;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes4.dex */
public class UriTemplate {

    /* renamed from: a */
    public static final Map f52159a = new HashMap();

    /* loaded from: classes4.dex */
    public enum CompositeOutput {
        PLUS('+', "", ",", false, true),
        HASH('#', "#", ",", false, true),
        DOT('.', ".", ".", false, false),
        FORWARD_SLASH('/', RemoteSettings.FORWARD_SLASH_STRING, RemoteSettings.FORWARD_SLASH_STRING, false, false),
        SEMI_COLON(';', ";", ";", true, false),
        QUERY('?', CallerData.f39639NA, "&", true, false),
        AMP(Character.valueOf(Typography.amp), "&", "&", true, false),
        SIMPLE(null, "", ",", false, false);
        
        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        CompositeOutput(Character ch2, String str, String str2, boolean z, boolean z2) {
            this.propertyPrefix = ch2;
            this.outputPrefix = (String) Preconditions.checkNotNull(str);
            this.explodeJoiner = (String) Preconditions.checkNotNull(str2);
            this.requiresVarAssignment = z;
            this.reservedExpansion = z2;
            if (ch2 != null) {
                UriTemplate.f52159a.put(ch2, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getEncodedValue(String str) {
            if (this.reservedExpansion) {
                return CharEscapers.escapeUriPathWithoutReserved(str);
            }
            return CharEscapers.escapeUriConformant(str);
        }

        public String getExplodeJoiner() {
            return this.explodeJoiner;
        }

        public String getOutputPrefix() {
            return this.outputPrefix;
        }

        public int getVarNameStartIndex() {
            if (this.propertyPrefix == null) {
                return 0;
            }
            return 1;
        }

        public boolean requiresVarAssignment() {
            return this.requiresVarAssignment;
        }
    }

    static {
        CompositeOutput.values();
    }

    /* renamed from: b */
    public static CompositeOutput m41745b(String str) {
        CompositeOutput compositeOutput = (CompositeOutput) f52159a.get(Character.valueOf(str.charAt(0)));
        if (compositeOutput == null) {
            return CompositeOutput.SIMPLE;
        }
        return compositeOutput;
    }

    /* renamed from: c */
    public static String m41744c(String str, Iterator it, boolean z, CompositeOutput compositeOutput) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = compositeOutput.getExplodeJoiner();
        } else {
            if (compositeOutput.requiresVarAssignment()) {
                sb.append(CharEscapers.escapeUriPath(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && compositeOutput.requiresVarAssignment()) {
                sb.append(CharEscapers.escapeUriPath(str));
                sb.append("=");
            }
            sb.append(compositeOutput.getEncodedValue(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static Map m41743d(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : Data.mapOf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !Data.isNull(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static String m41742e(String str, Map map, boolean z, CompositeOutput compositeOutput) {
        String str2;
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str3 = "=";
        if (z) {
            str2 = compositeOutput.getExplodeJoiner();
        } else {
            if (compositeOutput.requiresVarAssignment()) {
                sb.append(CharEscapers.escapeUriPath(str));
                sb.append("=");
            }
            str3 = ",";
            str2 = ",";
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encodedValue = compositeOutput.getEncodedValue((String) entry.getKey());
            String encodedValue2 = compositeOutput.getEncodedValue(entry.getValue().toString());
            sb.append(encodedValue);
            sb.append(str3);
            sb.append(encodedValue2);
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static String expand(String str, String str2, Object obj, boolean z) {
        GenericUrl genericUrl;
        if (str2.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            new GenericUrl(str).setRawPath(null);
            str2 = genericUrl.build() + str2;
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            str2 = str + str2;
        }
        return expand(str2, obj, z);
    }

    /* renamed from: f */
    public static String m41741f(String str, String str2, CompositeOutput compositeOutput) {
        if (!compositeOutput.requiresVarAssignment()) {
            return compositeOutput.getEncodedValue(str2);
        }
        return String.format("%s=%s", str, compositeOutput.getEncodedValue(str2));
    }

    public static String expand(String str, Object obj, boolean z) {
        String m41744c;
        Map m41743d = m41743d(obj);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int indexOf = str.indexOf(CameraActivity.REQUEST_CODE, i);
            if (indexOf != -1) {
                sb.append(str.substring(i, indexOf));
                int indexOf2 = str.indexOf(125, indexOf + 2);
                int i2 = indexOf2 + 1;
                String substring = str.substring(indexOf + 1, indexOf2);
                CompositeOutput m41745b = m41745b(substring);
                ListIterator<String> listIterator = Splitter.m41291on(',').splitToList(substring).listIterator();
                boolean z2 = true;
                while (listIterator.hasNext()) {
                    String next = listIterator.next();
                    boolean endsWith = next.endsWith(Marker.ANY_MARKER);
                    int varNameStartIndex = listIterator.nextIndex() == 1 ? m41745b.getVarNameStartIndex() : 0;
                    int length2 = next.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = next.substring(varNameStartIndex, length2);
                    Object remove = m41743d.remove(substring2);
                    if (remove != null) {
                        if (!z2) {
                            sb.append(m41745b.getExplodeJoiner());
                        } else {
                            sb.append(m41745b.getOutputPrefix());
                            z2 = false;
                        }
                        if (remove instanceof Iterator) {
                            m41744c = m41744c(substring2, (Iterator) remove, endsWith, m41745b);
                        } else if (!(remove instanceof Iterable) && !remove.getClass().isArray()) {
                            if (remove.getClass().isEnum()) {
                                String name = FieldInfo.m41701of((Enum) remove).getName();
                                if (name == null) {
                                    name = remove.toString();
                                }
                                m41744c = m41741f(substring2, name, m41745b);
                            } else if (!Data.isValueOfPrimitiveType(remove)) {
                                m41744c = m41742e(substring2, m41743d(remove), endsWith, m41745b);
                            } else {
                                m41744c = m41741f(substring2, remove.toString(), m41745b);
                            }
                        } else {
                            m41744c = m41744c(substring2, Types.iterableOf(remove).iterator(), endsWith, m41745b);
                        }
                        sb.append((Object) m41744c);
                    }
                }
                i = i2;
            } else if (i == 0 && !z) {
                return str;
            } else {
                sb.append(str.substring(i));
            }
        }
        if (z) {
            GenericUrl.m41771a(m41743d.entrySet(), sb, false);
        }
        return sb.toString();
    }
}
