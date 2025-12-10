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
public abstract class AbstractC6519d {
    /* renamed from: a */
    public static String m47410a(zzll zzllVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m47407d(zzllVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m47409b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m47409b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m47409b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(TokenParser.f74644SP);
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(RH2.m66675a(zzjd.zzm((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzjd) {
                sb.append(": \"");
                sb.append(RH2.m66675a((zzjd) obj));
                sb.append('\"');
            } else if (obj instanceof zzke) {
                sb.append(" {");
                m47407d((zzke) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.f74644SP);
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m47409b(sb, i4, Action.KEY_ATTRIBUTE, entry2.getKey());
                m47409b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.f74644SP);
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
    public static final String m47408c(String str) {
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
    public static void m47407d(zzll zzllVar, StringBuilder sb, int i) {
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
                    m47409b(sb, i, m47408c(concat), zzke.m47164c(method2, zzllVar, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m47409b(sb, i, m47408c(concat2), zzke.m47164c(method3, zzllVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object m47164c = zzke.m47164c(method4, zzllVar, new Object[0]);
                    if (method5 == null) {
                        if (m47164c instanceof Boolean) {
                            if (((Boolean) m47164c).booleanValue()) {
                                m47409b(sb, i, m47408c(concat3), m47164c);
                            }
                        } else if (m47164c instanceof Integer) {
                            if (((Integer) m47164c).intValue() != 0) {
                                m47409b(sb, i, m47408c(concat3), m47164c);
                            }
                        } else if (m47164c instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m47164c).floatValue()) != 0) {
                                m47409b(sb, i, m47408c(concat3), m47164c);
                            }
                        } else if (m47164c instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m47164c).doubleValue()) != 0) {
                                m47409b(sb, i, m47408c(concat3), m47164c);
                            }
                        } else {
                            if (m47164c instanceof String) {
                                equals = m47164c.equals("");
                            } else if (m47164c instanceof zzjd) {
                                equals = m47164c.equals(zzjd.zzb);
                            } else if (m47164c instanceof zzll) {
                                if (m47164c != ((zzll) m47164c).zzbO()) {
                                    m47409b(sb, i, m47408c(concat3), m47164c);
                                }
                            } else {
                                if ((m47164c instanceof Enum) && ((Enum) m47164c).ordinal() == 0) {
                                }
                                m47409b(sb, i, m47408c(concat3), m47164c);
                            }
                            if (!equals) {
                                m47409b(sb, i, m47408c(concat3), m47164c);
                            }
                        }
                    } else if (((Boolean) zzke.m47164c(method5, zzllVar, new Object[0])).booleanValue()) {
                        m47409b(sb, i, m47408c(concat3), m47164c);
                    }
                }
            }
        }
        if (!(zzllVar instanceof zzkb)) {
            zzmo zzmoVar = ((zzke) zzllVar).zzc;
            if (zzmoVar != null) {
                zzmoVar.m47155c(sb, i);
                return;
            }
            return;
        }
        zzkb zzkbVar = (zzkb) zzllVar;
        throw null;
    }
}