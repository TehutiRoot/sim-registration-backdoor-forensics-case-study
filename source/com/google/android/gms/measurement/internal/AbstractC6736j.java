package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.google.android.gms.measurement.internal.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6736j implements InterfaceC21145ms2 {
    protected final zzfy zzs;

    public AbstractC6736j(zzfy zzfyVar) {
        Preconditions.checkNotNull(zzfyVar);
        this.zzs = zzfyVar;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final Context zzau() {
        throw null;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final Clock zzav() {
        throw null;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final zzab zzaw() {
        throw null;
    }

    public void zzax() {
        this.zzs.zzaz().zzax();
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final zzeo zzay() {
        throw null;
    }

    @Override // p000.InterfaceC21145ms2
    @Pure
    public final zzfv zzaz() {
        throw null;
    }

    public void zzg() {
        this.zzs.zzaz().zzg();
    }
}
