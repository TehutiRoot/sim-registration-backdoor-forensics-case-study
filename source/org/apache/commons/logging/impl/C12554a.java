package org.apache.commons.logging.impl;

import java.util.Enumeration;
import org.apache.commons.logging.impl.WeakHashtable;

/* renamed from: org.apache.commons.logging.impl.a */
/* loaded from: classes6.dex */
public class C12554a implements Enumeration {

    /* renamed from: a */
    public final /* synthetic */ Enumeration f73621a;

    /* renamed from: b */
    public final /* synthetic */ WeakHashtable f73622b;

    public C12554a(WeakHashtable weakHashtable, Enumeration enumeration) {
        this.f73622b = weakHashtable;
        this.f73621a = enumeration;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f73621a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return ((WeakHashtable.C12552b) this.f73621a.nextElement()).m24836b();
    }
}
