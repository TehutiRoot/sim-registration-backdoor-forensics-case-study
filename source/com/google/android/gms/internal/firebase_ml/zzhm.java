package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes3.dex */
public final class zzhm {

    /* renamed from: a */
    public static final Map f45846a = new HashMap();

    static {
        zzhl.values();
    }

    /* renamed from: a */
    public static String m47907a(String str, Iterator it, boolean z, zzhl zzhlVar) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = zzhlVar.zzgu();
        } else {
            if (zzhlVar.zzgv()) {
                sb.append(zzjw.zzas(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && zzhlVar.zzgv()) {
                sb.append(zzjw.zzas(str));
                sb.append("=");
            }
            sb.append(zzhlVar.zzak(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static Map m47906b(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : zzix.zzf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !zzix.isNull(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    public static String zza(String str, String str2, Object obj, boolean z) {
        int i;
        String m47907a;
        String str3;
        String sb;
        String str4 = str2;
        int i2 = -1;
        int i3 = 1;
        if (str4.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            zzgu zzguVar = new zzgu(str);
            zzguVar.zzu(null);
            String valueOf = String.valueOf(zzguVar.zzfz());
            str4 = str2.length() != 0 ? valueOf.concat(str4) : new String(valueOf);
        } else if (!str4.startsWith("http://") && !str4.startsWith("https://")) {
            String valueOf2 = String.valueOf(str);
            str4 = str2.length() != 0 ? valueOf2.concat(str4) : new String(valueOf2);
        }
        Map m47906b = m47906b(obj);
        StringBuilder sb2 = new StringBuilder();
        int length = str4.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            int indexOf = str4.indexOf(CameraActivity.REQUEST_CODE, i4);
            if (indexOf == i2) {
                sb2.append(str4.substring(i4));
                break;
            }
            sb2.append(str4.substring(i4, indexOf));
            int indexOf2 = str4.indexOf(125, indexOf + 2);
            int i5 = indexOf2 + 1;
            String substring = str4.substring(indexOf + i3, indexOf2);
            zzhl zzhlVar = (zzhl) f45846a.get(Character.valueOf(substring.charAt(0)));
            if (zzhlVar == null) {
                zzhlVar = zzhl.SIMPLE;
            }
            ListIterator<String> listIterator = zzmn.zza(zzlw.zza(',')).zza(substring).listIterator();
            boolean z2 = true;
            while (listIterator.hasNext()) {
                String next = listIterator.next();
                boolean endsWith = next.endsWith(Marker.ANY_MARKER);
                if (listIterator.nextIndex() == i3) {
                    i = zzhlVar.zzgw();
                } else {
                    i = 0;
                }
                int length2 = next.length();
                if (endsWith) {
                    length2 += i2;
                }
                String substring2 = next.substring(i, length2);
                Object remove = m47906b.remove(substring2);
                if (remove != null) {
                    if (!z2) {
                        sb2.append(zzhlVar.zzgu());
                    } else {
                        sb2.append(zzhlVar.zzgt());
                        z2 = false;
                    }
                    if (remove instanceof Iterator) {
                        m47907a = m47907a(substring2, (Iterator) remove, endsWith, zzhlVar);
                    } else {
                        if (!(remove instanceof Iterable) && !remove.getClass().isArray()) {
                            if (remove.getClass().isEnum()) {
                                if (zzjd.zza((Enum) remove).getName() != null) {
                                    if (zzhlVar.zzgv()) {
                                        Object[] objArr = new Object[2];
                                        objArr[0] = substring2;
                                        objArr[i3] = remove;
                                        remove = String.format("%s=%s", objArr);
                                    }
                                    remove = zzjw.zzas(remove.toString());
                                }
                                m47907a = remove;
                            } else if (!zzix.zzg(remove)) {
                                Map m47906b2 = m47906b(remove);
                                if (m47906b2.isEmpty()) {
                                    sb = "";
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    String str5 = "=";
                                    if (endsWith) {
                                        str3 = zzhlVar.zzgu();
                                    } else {
                                        if (zzhlVar.zzgv()) {
                                            sb3.append(zzjw.zzas(substring2));
                                            sb3.append("=");
                                        }
                                        str5 = ",";
                                        str3 = ",";
                                    }
                                    Iterator it = m47906b2.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        String zzak = zzhlVar.zzak((String) entry.getKey());
                                        String zzak2 = zzhlVar.zzak(entry.getValue().toString());
                                        sb3.append(zzak);
                                        sb3.append(str5);
                                        sb3.append(zzak2);
                                        if (it.hasNext()) {
                                            sb3.append(str3);
                                        }
                                    }
                                    sb = sb3.toString();
                                }
                                m47907a = sb;
                            } else {
                                if (zzhlVar.zzgv()) {
                                    remove = String.format("%s=%s", substring2, remove);
                                }
                                if (zzhlVar.zzgx()) {
                                    m47907a = zzjw.zzat(remove.toString());
                                } else {
                                    m47907a = zzjw.zzas(remove.toString());
                                }
                            }
                        } else {
                            m47907a = m47907a(substring2, zzjs.zzi(remove).iterator(), endsWith, zzhlVar);
                        }
                        sb2.append(m47907a);
                        i2 = -1;
                        i3 = 1;
                    }
                    sb2.append(m47907a);
                    i2 = -1;
                    i3 = 1;
                }
            }
            i4 = i5;
        }
        zzgu.m47921a(m47906b.entrySet(), sb2);
        return sb2.toString();
    }
}
