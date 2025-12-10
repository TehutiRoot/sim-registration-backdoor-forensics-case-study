package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.http.message.TokenParser;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6530d {
    /* renamed from: a */
    public static String m47401a(zzll zzllVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m47398d(zzllVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m47400b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m47400b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m47400b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(UG2.m66080a(zzjd.zzm((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzjd) {
                sb.append(": \"");
                sb.append(UG2.m66080a((zzjd) obj));
                sb.append('\"');
            } else if (obj instanceof zzke) {
                sb.append(" {");
                m47398d((zzke) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.f74560SP);
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m47400b(sb, i4, Action.KEY_ATTRIBUTE, entry2.getKey());
                m47400b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.f74560SP);
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static final String m47399c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m47398d(zzll zzllVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzllVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith(PDListAttributeObject.OWNER_LIST) && !str.endsWith("OrBuilderList") && !str.equals(PDListAttributeObject.OWNER_LIST)) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m47400b(sb, i, m47399c(concat), zzke.m47155c(method2, zzllVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m47400b(sb, i, m47399c(concat2), zzke.m47155c(method3, zzllVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object m47155c = zzke.m47155c(method4, zzllVar, new Object[0]);
                    if (method5 == null) {
                        if (m47155c instanceof Boolean) {
                            if (((Boolean) m47155c).booleanValue()) {
                                m47400b(sb, i, m47399c(concat3), m47155c);
                            }
                        } else if (m47155c instanceof Integer) {
                            if (((Integer) m47155c).intValue() != 0) {
                                m47400b(sb, i, m47399c(concat3), m47155c);
                            }
                        } else if (m47155c instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m47155c).floatValue()) != 0) {
                                m47400b(sb, i, m47399c(concat3), m47155c);
                            }
                        } else if (m47155c instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m47155c).doubleValue()) != 0) {
                                m47400b(sb, i, m47399c(concat3), m47155c);
                            }
                        } else {
                            if (m47155c instanceof String) {
                                equals = m47155c.equals("");
                            } else if (m47155c instanceof zzjd) {
                                equals = m47155c.equals(zzjd.zzb);
                            } else if (m47155c instanceof zzll) {
                                if (m47155c != ((zzll) m47155c).zzbO()) {
                                    m47400b(sb, i, m47399c(concat3), m47155c);
                                }
                            } else {
                                if ((m47155c instanceof Enum) && ((Enum) m47155c).ordinal() == 0) {
                                }
                                m47400b(sb, i, m47399c(concat3), m47155c);
                            }
                            if (!equals) {
                                m47400b(sb, i, m47399c(concat3), m47155c);
                            }
                        }
                    } else if (((Boolean) zzke.m47155c(method5, zzllVar, new Object[0])).booleanValue()) {
                        m47400b(sb, i, m47399c(concat3), m47155c);
                    }
                }
            }
        }
        if (!(zzllVar instanceof zzkb)) {
            zzmo zzmoVar = ((zzke) zzllVar).zzc;
            if (zzmoVar != null) {
                zzmoVar.m47146c(sb, i);
                return;
            }
            return;
        }
        zzkb zzkbVar = (zzkb) zzllVar;
        throw null;
    }
}
