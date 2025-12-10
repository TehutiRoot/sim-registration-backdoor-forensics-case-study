package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.a */
/* loaded from: classes4.dex */
public final class C8807a extends PhantomReference implements Cleaner.Cleanable {

    /* renamed from: a */
    public final Set f56946a;

    /* renamed from: b */
    public final Runnable f56947b;

    public /* synthetic */ C8807a(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, zzc zzcVar) {
        super(obj, referenceQueue);
        this.f56946a = set;
        this.f56947b = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.Cleaner.Cleanable
    public final void clean() {
        if (!this.f56946a.remove(this)) {
            return;
        }
        clear();
        this.f56947b.run();
    }
}