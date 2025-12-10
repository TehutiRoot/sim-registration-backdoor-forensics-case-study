package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.message.TokenParser;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6558c {

    /* renamed from: a */
    public static final char[] f46856a;

    static {
        char[] cArr = new char[80];
        f46856a = cArr;
        Arrays.fill(cArr, (char) TokenParser.f74644SP);
    }

    /* renamed from: a */
    public static String m46957a(zzfo zzfoVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m46954d(zzfoVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m46956b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m46956b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m46956b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            m46955c(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(AbstractC22937wt2.m625a(new zzcy(((String) obj).getBytes(zzem.f46982b))));
                sb.append('\"');
            } else if (obj instanceof zzdb) {
                sb.append(": \"");
                sb.append(AbstractC22937wt2.m625a((zzdb) obj));
                sb.append('\"');
            } else if (obj instanceof zzed) {
                sb.append(" {");
                m46954d((zzed) obj, sb, i + 2);
                sb.append("\n");
                m46955c(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                m46956b(sb, i3, Action.KEY_ATTRIBUTE, entry2.getKey());
                m46956b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                m46955c(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    public static void m46955c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f46856a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: d */
    public static void m46954d(zzfo zzfoVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfoVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith(PDListAttributeObject.OWNER_LIST) && !substring.endsWith("OrBuilderList") && !substring.equals(PDListAttributeObject.OWNER_LIST) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m46956b(sb, i, substring.substring(0, substring.length() - 4), zzed.m46869e(method2, zzfoVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m46956b(sb, i, substring.substring(0, substring.length() - 3), zzed.m46869e(method, zzfoVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m46869e = zzed.m46869e(method4, zzfoVar, new Object[0]);
                    if (method5 == null) {
                        if (m46869e instanceof Boolean) {
                            if (!((Boolean) m46869e).booleanValue()) {
                            }
                            m46956b(sb, i, substring, m46869e);
                        } else if (m46869e instanceof Integer) {
                            if (((Integer) m46869e).intValue() == 0) {
                            }
                            m46956b(sb, i, substring, m46869e);
                        } else if (m46869e instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m46869e).floatValue()) == 0) {
                            }
                            m46956b(sb, i, substring, m46869e);
                        } else if (m46869e instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m46869e).doubleValue()) == 0) {
                            }
                            m46956b(sb, i, substring, m46869e);
                        } else {
                            if (m46869e instanceof String) {
                                equals = m46869e.equals("");
                            } else if (m46869e instanceof zzdb) {
                                equals = m46869e.equals(zzdb.zzb);
                            } else if (m46869e instanceof zzfo) {
                                if (m46869e == ((zzfo) m46869e).zzab()) {
                                }
                                m46956b(sb, i, substring, m46869e);
                            } else {
                                if ((m46869e instanceof Enum) && ((Enum) m46869e).ordinal() == 0) {
                                }
                                m46956b(sb, i, substring, m46869e);
                            }
                            if (equals) {
                            }
                            m46956b(sb, i, substring, m46869e);
                        }
                    } else {
                        if (!((Boolean) zzed.m46869e(method5, zzfoVar, new Object[0])).booleanValue()) {
                        }
                        m46956b(sb, i, substring, m46869e);
                    }
                }
            }
            i2 = 3;
        }
        if (zzfoVar instanceof zzdz) {
            Iterator m863f = ((zzdz) zzfoVar).zza.m863f();
            while (m863f.hasNext()) {
                Map.Entry entry2 = (Map.Entry) m863f.next();
                int i4 = ((C22048rl2) entry2.getKey()).f77614a;
                m46956b(sb, i, "[" + i4 + "]", entry2.getValue());
            }
        }
        zzgz zzgzVar = ((zzed) zzfoVar).zzc;
        if (zzgzVar != null) {
            zzgzVar.m46855e(sb, i);
        }
    }
}