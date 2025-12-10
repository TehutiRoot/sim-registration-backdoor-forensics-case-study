package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzv {

    /* renamed from: a */
    public final String f47443a = "\n";

    public zzv(String str) {
    }

    /* renamed from: a */
    public static final CharSequence m46651a(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static zzv zza(String str) {
        return new zzv("\n");
    }

    public final String zzb(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(m46651a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f47443a);
                    sb.append(m46651a(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}