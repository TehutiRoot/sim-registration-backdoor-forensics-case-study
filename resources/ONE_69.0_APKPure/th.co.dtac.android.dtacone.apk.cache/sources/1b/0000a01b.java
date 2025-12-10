package com.google.android.gms.vision;

import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzc {

    /* renamed from: c */
    public static final Object f48724c = new Object();

    /* renamed from: d */
    public static int f48725d;

    /* renamed from: a */
    public final SparseIntArray f48726a = new SparseIntArray();

    /* renamed from: b */
    public final SparseIntArray f48727b = new SparseIntArray();

    public final int zza(int i) {
        synchronized (f48724c) {
            try {
                int i2 = this.f48726a.get(i, -1);
                if (i2 != -1) {
                    return i2;
                }
                int i3 = f48725d;
                f48725d = i3 + 1;
                this.f48726a.append(i, i3);
                this.f48727b.append(i3, i);
                return i3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zzb(int i) {
        int i2;
        synchronized (f48724c) {
            i2 = this.f48727b.get(i);
        }
        return i2;
    }
}