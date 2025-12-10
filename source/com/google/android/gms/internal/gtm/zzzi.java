package com.google.android.gms.internal.gtm;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzzi {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, (char) TokenParser.f74560SP);
    }

    public static String zza(zzzg zzzgVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzzgVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            zzc(i, sb);
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
                sb.append(zzaai.zza(new zzua(((String) obj).getBytes(zzye.zzb))));
                sb.append('\"');
            } else if (obj instanceof zzud) {
                sb.append(": \"");
                sb.append(zzaai.zza((zzud) obj));
                sb.append('\"');
            } else if (obj instanceof zzxv) {
                sb.append(" {");
                zzd((zzxv) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                zzb(sb, i3, Action.KEY_ATTRIBUTE, entry2.getKey());
                zzb(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzzg zzzgVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzzgVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzxv.zzaj(method2, zzzgVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzxv.zzaj(method, zzzgVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaj = zzxv.zzaj(method4, zzzgVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaj instanceof Boolean) {
                            if (!((Boolean) zzaj).booleanValue()) {
                            }
                            zzb(sb, i, substring, zzaj);
                        } else if (zzaj instanceof Integer) {
                            if (((Integer) zzaj).intValue() == 0) {
                            }
                            zzb(sb, i, substring, zzaj);
                        } else if (zzaj instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaj).floatValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzaj);
                        } else if (zzaj instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaj).doubleValue()) == 0) {
                            }
                            zzb(sb, i, substring, zzaj);
                        } else {
                            if (zzaj instanceof String) {
                                equals = zzaj.equals("");
                            } else if (zzaj instanceof zzud) {
                                equals = zzaj.equals(zzud.zzb);
                            } else if (zzaj instanceof zzzg) {
                                if (zzaj == ((zzzg) zzaj).zzax()) {
                                }
                                zzb(sb, i, substring, zzaj);
                            } else {
                                if ((zzaj instanceof Enum) && ((Enum) zzaj).ordinal() == 0) {
                                }
                                zzb(sb, i, substring, zzaj);
                            }
                            if (equals) {
                            }
                            zzb(sb, i, substring, zzaj);
                        }
                    } else {
                        if (!((Boolean) zzxv.zzaj(method5, zzzgVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzaj);
                    }
                }
            }
            i2 = 3;
        }
        if (zzzgVar instanceof zzxr) {
            Iterator zzg = ((zzxr) zzzgVar).zza.zzg();
            while (zzg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzg.next();
                int i4 = ((zzxs) entry2.getKey()).zzb;
                zzb(sb, i, "[" + i4 + "]", entry2.getValue());
            }
        }
        zzaal zzaalVar = ((zzxv) zzzgVar).zzc;
        if (zzaalVar != null) {
            zzaalVar.zzi(sb, i);
        }
    }
}
