package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzvs;
import com.google.android.gms.internal.firebase_ml.zzvt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzvt<MessageType extends zzvt<MessageType, BuilderType>, BuilderType extends zzvs<MessageType, BuilderType>> implements zzys {
    protected int zzckg = 0;

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzxl.m47422a(iterable);
        if (iterable instanceof zzyd) {
            List<?> zzvz = ((zzyd) iterable).zzvz();
            zzyd zzydVar = (zzyd) list;
            int size = list.size();
            for (Object obj : zzvz) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzydVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzydVar.size() - 1; size2 >= size; size2--) {
                        zzydVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzwd) {
                    zzydVar.zze((zzwd) obj);
                } else {
                    zzydVar.add((String) obj);
                }
            }
        } else if (iterable instanceof KL2) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    /* renamed from: a */
    public void mo47430a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo47429b() {
        throw new UnsupportedOperationException();
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzva()];
            zzwq zzg = zzwq.zzg(bArr);
            zzb(zzg);
            zzg.zzul();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzys
    public final zzwd zzts() {
        try {
            C6431D0 zzdd = zzwd.zzdd(zzva());
            zzb(zzdd.m48055b());
            return zzdd.m48056a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
