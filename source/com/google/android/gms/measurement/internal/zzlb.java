package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzlb extends RC2 {
    public zzlb(zzkz zzkzVar) {
        super(zzkzVar);
    }

    /* renamed from: A */
    public static boolean m46160A(List list, int i) {
        if (i < list.size() * 64) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m46158C(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static final void m46156E(zzfr zzfrVar, String str, Object obj) {
        List zzp = zzfrVar.zzp();
        int i = 0;
        while (true) {
            if (i < zzp.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.zzfw) zzp.get(i)).zzg())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfrVar.zzj(i, zze);
        } else {
            zzfrVar.zze(zze);
        }
    }

    /* renamed from: b */
    public static final boolean m46155b(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        if (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final com.google.android.gms.internal.measurement.zzfw m46154c(zzfs zzfsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
            if (zzfwVar.zzg().equals(str)) {
                return zzfwVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final Object m46153d(zzfs zzfsVar, String str) {
        com.google.android.gms.internal.measurement.zzfw m46154c = m46154c(zzfsVar, str);
        if (m46154c != null) {
            if (m46154c.zzy()) {
                return m46154c.zzh();
            }
            if (m46154c.zzw()) {
                return Long.valueOf(m46154c.zzd());
            }
            if (m46154c.zzu()) {
                return Double.valueOf(m46154c.zza());
            }
            if (m46154c.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfw> zzi = m46154c.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzi) {
                    if (zzfwVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfw zzfwVar2 : zzfwVar.zzi()) {
                            if (zzfwVar2.zzy()) {
                                bundle.putString(zzfwVar2.zzg(), zzfwVar2.zzh());
                            } else if (zzfwVar2.zzw()) {
                                bundle.putLong(zzfwVar2.zzg(), zzfwVar2.zzd());
                            } else if (zzfwVar2.zzu()) {
                                bundle.putDouble(zzfwVar2.zzg(), zzfwVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public static final void m46150g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: h */
    public static final String m46149h(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static final void m46148i(StringBuilder sb, int i, String str, zzgh zzghVar) {
        Integer num;
        Integer num2;
        Long l;
        if (zzghVar == null) {
            return;
        }
        m46150g(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzghVar.zzb() != 0) {
            m46150g(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l2 : zzghVar.zzk()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzghVar.zzd() != 0) {
            m46150g(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l3 : zzghVar.zzn()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzghVar.zza() != 0) {
            m46150g(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                if (zzfqVar.zzh()) {
                    num2 = Integer.valueOf(zzfqVar.zza());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (zzfqVar.zzg()) {
                    l = Long.valueOf(zzfqVar.zzb());
                } else {
                    l = null;
                }
                sb.append(l);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzghVar.zzc() != 0) {
            m46150g(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (zzgj zzgjVar : zzghVar.zzm()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                if (zzgjVar.zzi()) {
                    num = Integer.valueOf(zzgjVar.zzb());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                int i10 = 0;
                for (Long l4 : zzgjVar.zzf()) {
                    long longValue = l4.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        m46150g(sb, 3);
        sb.append("}\n");
    }

    /* renamed from: j */
    public static final void m46147j(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m46150g(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: k */
    public static final void m46146k(StringBuilder sb, int i, String str, zzeq zzeqVar) {
        String str2;
        if (zzeqVar == null) {
            return;
        }
        m46150g(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            if (zzm != 1) {
                if (zzm != 2) {
                    if (zzm != 3) {
                        if (zzm != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            m46147j(sb, i, "comparison_type", str2);
        }
        if (zzeqVar.zzi()) {
            m46147j(sb, i, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            m46147j(sb, i, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            m46147j(sb, i, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            m46147j(sb, i, "max_comparison_value", zzeqVar.zzd());
        }
        m46150g(sb, i);
        sb.append("}\n");
    }

    /* renamed from: l */
    public static int m46145l(zzgb zzgbVar, String str) {
        if (zzgbVar != null) {
            for (int i = 0; i < zzgbVar.zzb(); i++) {
                if (str.equals(zzgbVar.zzao(i).zzf())) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: r */
    public static zzlk m46139r(zzlk zzlkVar, byte[] bArr) {
        zzjq zza = zzjq.zza();
        if (zza != null) {
            return zzlkVar.zzaA(bArr, zza);
        }
        return zzlkVar.zzaz(bArr);
    }

    /* renamed from: w */
    public static List m46134w(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: B */
    public final boolean m46159B(long j, long j2) {
        if (j != 0 && j2 > 0 && Math.abs(this.zzs.zzav().currentTimeMillis() - j) <= j2) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final byte[] m46157D(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: e */
    public final void m46152e(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it.next();
            if (zzfwVar != null) {
                m46150g(sb, i2);
                sb.append("param {\n");
                Double d = null;
                if (zzfwVar.zzx()) {
                    str = this.zzs.zzj().zze(zzfwVar.zzg());
                } else {
                    str = null;
                }
                m46147j(sb, i2, "name", str);
                if (zzfwVar.zzy()) {
                    str2 = zzfwVar.zzh();
                } else {
                    str2 = null;
                }
                m46147j(sb, i2, "string_value", str2);
                if (zzfwVar.zzw()) {
                    l = Long.valueOf(zzfwVar.zzd());
                } else {
                    l = null;
                }
                m46147j(sb, i2, "int_value", l);
                if (zzfwVar.zzu()) {
                    d = Double.valueOf(zzfwVar.zza());
                }
                m46147j(sb, i2, "double_value", d);
                if (zzfwVar.zzc() > 0) {
                    m46152e(sb, i2, zzfwVar.zzi());
                }
                m46150g(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: f */
    public final void m46151f(StringBuilder sb, int i, zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        m46150g(sb, i);
        sb.append("filter {\n");
        if (zzelVar.zzh()) {
            m46147j(sb, i, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            m46147j(sb, i, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                m46150g(sb, i2);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m46147j(sb, i2, "match_type", str);
                }
                if (zzd.zzh()) {
                    m46147j(sb, i2, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    m46147j(sb, i2, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    m46150g(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        m46150g(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m46150g(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            m46146k(sb, i + 1, "number_filter", zzelVar.zzc());
        }
        m46150g(sb, i);
        sb.append("}\n");
    }

    /* renamed from: m */
    public final long m46144m(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest m46107e = zzlh.m46107e();
        if (m46107e == null) {
            this.zzs.zzay().zzd().zza("Failed to get MD5");
            return 0L;
        }
        return zzlh.m46115O(m46107e.digest(bArr));
    }

    /* renamed from: n */
    public final Bundle m46143n(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(m46143n((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* renamed from: o */
    public final Parcelable m46142o(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: p */
    public final zzaw m46141p(zzaa zzaaVar) {
        String str;
        Object obj;
        Bundle m46143n = m46143n(zzaaVar.zze(), true);
        if (m46143n.containsKey("_o") && (obj = m46143n.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String zzb = zzgv.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzaw(zzb, new zzau(m46143n), str2, zzaaVar.zza());
    }

    /* renamed from: q */
    public final zzfs m46140q(zzar zzarVar) {
        zzfr zze = zzfs.zze();
        zze.zzl(zzarVar.f48265e);
        C17589Fc2 c17589Fc2 = new C17589Fc2(zzarVar.f48266f);
        while (c17589Fc2.hasNext()) {
            String next = c17589Fc2.next();
            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
            zze2.zzj(next);
            Object m46342i = zzarVar.f48266f.m46342i(next);
            Preconditions.checkNotNull(m46342i);
            m46132y(zze2, m46342i);
            zze.zze(zze2);
        }
        return (zzfs) zze.zzaE();
    }

    /* renamed from: s */
    public final String m46138s(zzga zzgaVar) {
        Long l;
        Long l2;
        Double d;
        if (zzgaVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzgc zzgcVar : zzgaVar.zzd()) {
            if (zzgcVar != null) {
                m46150g(sb, 1);
                sb.append("bundle {\n");
                if (zzgcVar.zzbj()) {
                    m46147j(sb, 1, "protocol_version", Integer.valueOf(zzgcVar.zzd()));
                }
                zzoz.zzc();
                if (this.zzs.zzf().zzs(null, zzeb.zzar) && zzgcVar.zzbm()) {
                    m46147j(sb, 1, "session_stitching_token", zzgcVar.zzK());
                }
                m46147j(sb, 1, "platform", zzgcVar.zzI());
                if (zzgcVar.zzbf()) {
                    m46147j(sb, 1, "gmp_version", Long.valueOf(zzgcVar.zzm()));
                }
                if (zzgcVar.zzbq()) {
                    m46147j(sb, 1, "uploading_gmp_version", Long.valueOf(zzgcVar.zzr()));
                }
                if (zzgcVar.zzbd()) {
                    m46147j(sb, 1, "dynamite_version", Long.valueOf(zzgcVar.zzj()));
                }
                if (zzgcVar.zzba()) {
                    m46147j(sb, 1, "config_version", Long.valueOf(zzgcVar.zzh()));
                }
                m46147j(sb, 1, "gmp_app_id", zzgcVar.zzF());
                m46147j(sb, 1, "admob_app_id", zzgcVar.zzw());
                m46147j(sb, 1, "app_id", zzgcVar.zzx());
                m46147j(sb, 1, "app_version", zzgcVar.zzA());
                if (zzgcVar.zzaY()) {
                    m46147j(sb, 1, "app_version_major", Integer.valueOf(zzgcVar.zza()));
                }
                m46147j(sb, 1, "firebase_instance_id", zzgcVar.zzE());
                if (zzgcVar.zzbc()) {
                    m46147j(sb, 1, "dev_cert_hash", Long.valueOf(zzgcVar.zzi()));
                }
                m46147j(sb, 1, "app_store", zzgcVar.zzz());
                if (zzgcVar.zzbp()) {
                    m46147j(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgcVar.zzq()));
                }
                if (zzgcVar.zzbn()) {
                    m46147j(sb, 1, "start_timestamp_millis", Long.valueOf(zzgcVar.zzp()));
                }
                if (zzgcVar.zzbe()) {
                    m46147j(sb, 1, "end_timestamp_millis", Long.valueOf(zzgcVar.zzk()));
                }
                if (zzgcVar.zzbi()) {
                    m46147j(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgcVar.zzo()));
                }
                if (zzgcVar.zzbh()) {
                    m46147j(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgcVar.zzn()));
                }
                m46147j(sb, 1, "app_instance_id", zzgcVar.zzy());
                m46147j(sb, 1, "resettable_device_id", zzgcVar.zzJ());
                m46147j(sb, 1, "ds_id", zzgcVar.zzD());
                if (zzgcVar.zzbg()) {
                    m46147j(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgcVar.zzaW()));
                }
                m46147j(sb, 1, "os_version", zzgcVar.zzH());
                m46147j(sb, 1, "device_model", zzgcVar.zzC());
                m46147j(sb, 1, "user_default_language", zzgcVar.zzL());
                if (zzgcVar.zzbo()) {
                    m46147j(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgcVar.zzf()));
                }
                if (zzgcVar.zzaZ()) {
                    m46147j(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgcVar.zzb()));
                }
                if (zzgcVar.zzbl()) {
                    m46147j(sb, 1, "service_upload", Boolean.valueOf(zzgcVar.zzaX()));
                }
                m46147j(sb, 1, "health_monitor", zzgcVar.zzG());
                if (zzgcVar.zzbk()) {
                    m46147j(sb, 1, "retry_counter", Integer.valueOf(zzgcVar.zze()));
                }
                if (zzgcVar.zzbb()) {
                    m46147j(sb, 1, "consent_signals", zzgcVar.zzB());
                }
                List<zzgl> zzO = zzgcVar.zzO();
                if (zzO != null) {
                    for (zzgl zzglVar : zzO) {
                        if (zzglVar != null) {
                            m46150g(sb, 2);
                            sb.append("user_property {\n");
                            if (zzglVar.zzs()) {
                                l = Long.valueOf(zzglVar.zzc());
                            } else {
                                l = null;
                            }
                            m46147j(sb, 2, "set_timestamp_millis", l);
                            m46147j(sb, 2, "name", this.zzs.zzj().zzf(zzglVar.zzf()));
                            m46147j(sb, 2, "string_value", zzglVar.zzg());
                            if (zzglVar.zzr()) {
                                l2 = Long.valueOf(zzglVar.zzb());
                            } else {
                                l2 = null;
                            }
                            m46147j(sb, 2, "int_value", l2);
                            if (zzglVar.zzq()) {
                                d = Double.valueOf(zzglVar.zza());
                            } else {
                                d = null;
                            }
                            m46147j(sb, 2, "double_value", d);
                            m46150g(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfo> zzM = zzgcVar.zzM();
                if (zzM != null) {
                    for (zzfo zzfoVar : zzM) {
                        if (zzfoVar != null) {
                            m46150g(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzfoVar.zzk()) {
                                m46147j(sb, 2, "audience_id", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzm()) {
                                m46147j(sb, 2, "new_audience", Boolean.valueOf(zzfoVar.zzj()));
                            }
                            m46148i(sb, 2, "current_data", zzfoVar.zzd());
                            if (zzfoVar.zzn()) {
                                m46148i(sb, 2, "previous_data", zzfoVar.zze());
                            }
                            m46150g(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfs> zzN = zzgcVar.zzN();
                if (zzN != null) {
                    for (zzfs zzfsVar : zzN) {
                        if (zzfsVar != null) {
                            m46150g(sb, 2);
                            sb.append("event {\n");
                            m46147j(sb, 2, "name", this.zzs.zzj().zzd(zzfsVar.zzh()));
                            if (zzfsVar.zzu()) {
                                m46147j(sb, 2, "timestamp_millis", Long.valueOf(zzfsVar.zzd()));
                            }
                            if (zzfsVar.zzt()) {
                                m46147j(sb, 2, "previous_timestamp_millis", Long.valueOf(zzfsVar.zzc()));
                            }
                            if (zzfsVar.zzs()) {
                                m46147j(sb, 2, "count", Integer.valueOf(zzfsVar.zza()));
                            }
                            if (zzfsVar.zzb() != 0) {
                                m46152e(sb, 2, zzfsVar.zzi());
                            }
                            m46150g(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m46150g(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: t */
    public final String m46137t(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            m46147j(sb, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        m46147j(sb, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String m46149h = m46149h(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!m46149h.isEmpty()) {
            m46147j(sb, 0, "filter_type", m46149h);
        }
        if (zzejVar.zzo()) {
            m46146k(sb, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            sb.append("  filters {\n");
            for (zzel zzelVar : zzejVar.zzh()) {
                m46151f(sb, 2, zzelVar);
            }
        }
        m46150g(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: u */
    public final String m46136u(zzes zzesVar) {
        if (zzesVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            m46147j(sb, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        m46147j(sb, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String m46149h = m46149h(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!m46149h.isEmpty()) {
            m46147j(sb, 0, "filter_type", m46149h);
        }
        m46151f(sb, 1, zzesVar.zzb());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: v */
    public final List m46135v(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(m46133x((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(m46133x((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(m46133x((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map m46133x(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m46133x(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m46133x(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m46133x(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlb.m46133x(android.os.Bundle, boolean):java.util.Map");
    }

    /* renamed from: y */
    public final void m46132y(com.google.android.gms.internal.measurement.zzfv zzfvVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        zzfvVar.zzg();
        zzfvVar.zze();
        zzfvVar.zzd();
        zzfvVar.zzf();
        if (obj instanceof String) {
            zzfvVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfvVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfvVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfv zze = com.google.android.gms.internal.measurement.zzfw.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfw) zze.zzaE());
                    }
                }
            }
            zzfvVar.zzb(arrayList);
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: z */
    public final void m46131z(zzgk zzgkVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgkVar.zzc();
        zzgkVar.zzb();
        zzgkVar.zza();
        if (obj instanceof String) {
            zzgkVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgkVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgkVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // p000.RC2
    public final boolean zzb() {
        return false;
    }
}
