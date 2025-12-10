package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class zzjf extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: a */
    public Map f45915a;

    /* renamed from: b */
    public final zziv f45916b;

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzjf$a */
    /* loaded from: classes3.dex */
    public final class C6517a implements Iterator {

        /* renamed from: a */
        public boolean f45917a;

        /* renamed from: b */
        public final Iterator f45918b;

        /* renamed from: c */
        public final Iterator f45919c;

        public C6517a(zzjf zzjfVar, Ez2 ez2) {
            this.f45918b = (Kz2) ez2.iterator();
            this.f45919c = zzjfVar.f45915a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (!this.f45918b.hasNext() && !this.f45919c.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (!this.f45917a) {
                if (this.f45918b.hasNext()) {
                    return (Map.Entry) this.f45918b.next();
                }
                this.f45917a = true;
            }
            return (Map.Entry) this.f45919c.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f45917a) {
                this.f45919c.remove();
            }
            this.f45918b.remove();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzjf$b */
    /* loaded from: classes3.dex */
    public final class C6518b extends AbstractSet {

        /* renamed from: a */
        public final Ez2 f45920a;

        public C6518b() {
            zzjf.this = r3;
            this.f45920a = (Ez2) new C23402zz2(r3, r3.f45916b.zzie()).entrySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            zzjf.this.f45915a.clear();
            this.f45920a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new C6517a(zzjf.this, this.f45920a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return zzjf.this.f45915a.size() + this.f45920a.size();
        }
    }

    /* loaded from: classes3.dex */
    public enum zzb {
        IGNORE_CASE
    }

    public zzjf() {
        this(EnumSet.noneOf(zzb.class));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new C6518b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        zzjd zzao = this.f45916b.zzao(str);
        if (zzao != null) {
            return zzao.zzh(this);
        }
        if (this.f45916b.zzie()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f45915a.get(str);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            zzb(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f45916b.zzao(str) == null) {
            if (this.f45916b.zzie()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.f45915a.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public zzjf zzb(String str, Object obj) {
        zzjd zzao = this.f45916b.zzao(str);
        if (zzao != null) {
            zzao.zzb(this, obj);
        } else {
            if (this.f45916b.zzie()) {
                str = str.toLowerCase(Locale.US);
            }
            this.f45915a.put(str, obj);
        }
        return this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf */
    public final Object put(String str, Object obj) {
        zzjd zzao = this.f45916b.zzao(str);
        if (zzao != null) {
            Object zzh = zzao.zzh(this);
            zzao.zzb(this, obj);
            return zzh;
        }
        if (this.f45916b.zzie()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f45915a.put(str, obj);
    }

    @Override // java.util.AbstractMap
    /* renamed from: zzfj */
    public zzjf clone() {
        try {
            zzjf zzjfVar = (zzjf) super.clone();
            zzix.zza(this, zzjfVar);
            zzjfVar.f45915a = (Map) zzix.clone(this.f45915a);
            return zzjfVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zziv zzik() {
        return this.f45916b;
    }

    public zzjf(EnumSet<zzb> enumSet) {
        this.f45915a = new zziq();
        this.f45916b = zziv.zza(getClass(), enumSet.contains(zzb.IGNORE_CASE));
    }
}
