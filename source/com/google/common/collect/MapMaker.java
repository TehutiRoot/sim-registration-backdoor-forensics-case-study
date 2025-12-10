package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@J2ktIncompatible
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class MapMaker {

    /* renamed from: a */
    public boolean f53312a;

    /* renamed from: b */
    public int f53313b = -1;

    /* renamed from: c */
    public int f53314c = -1;

    /* renamed from: d */
    public MapMakerInternalMap.Strength f53315d;

    /* renamed from: e */
    public MapMakerInternalMap.Strength f53316e;

    /* renamed from: f */
    public Equivalence f53317f;

    /* loaded from: classes4.dex */
    public enum Dummy {
        VALUE
    }

    /* renamed from: a */
    public int m40797a() {
        int i = this.f53314c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* renamed from: b */
    public int m40796b() {
        int i = this.f53313b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: c */
    public Equivalence m40795c() {
        return (Equivalence) MoreObjects.firstNonNull(this.f53317f, m40794d().defaultEquivalence());
    }

    @CanIgnoreReturnValue
    public MapMaker concurrencyLevel(int i) {
        boolean z;
        int i2 = this.f53314c;
        boolean z2 = false;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "concurrency level was already set to %s", i2);
        if (i > 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        this.f53314c = i;
        return this;
    }

    /* renamed from: d */
    public MapMakerInternalMap.Strength m40794d() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f53315d, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: e */
    public MapMakerInternalMap.Strength m40793e() {
        return (MapMakerInternalMap.Strength) MoreObjects.firstNonNull(this.f53316e, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: f */
    public MapMaker m40792f(Equivalence equivalence) {
        boolean z;
        Equivalence equivalence2 = this.f53317f;
        if (equivalence2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "key equivalence was already set to %s", equivalence2);
        this.f53317f = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.f53312a = true;
        return this;
    }

    /* renamed from: g */
    public MapMaker m40791g(MapMakerInternalMap.Strength strength) {
        boolean z;
        MapMakerInternalMap.Strength strength2 = this.f53315d;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Key strength was already set to %s", strength2);
        this.f53315d = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f53312a = true;
        }
        return this;
    }

    /* renamed from: h */
    public MapMaker m40790h(MapMakerInternalMap.Strength strength) {
        boolean z;
        MapMakerInternalMap.Strength strength2 = this.f53316e;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Value strength was already set to %s", strength2);
        this.f53316e = (MapMakerInternalMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f53312a = true;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public MapMaker initialCapacity(int i) {
        boolean z;
        int i2 = this.f53313b;
        boolean z2 = false;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "initial capacity was already set to %s", i2);
        if (i >= 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        this.f53313b = i;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
        if (!this.f53312a) {
            return new ConcurrentHashMap(m40796b(), 0.75f, m40797a());
        }
        return MapMakerInternalMap.create(this);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.f53313b;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.f53314c;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f53315d;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f53316e;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.f53317f != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakKeys() {
        return m40791g(MapMakerInternalMap.Strength.WEAK);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakValues() {
        return m40790h(MapMakerInternalMap.Strength.WEAK);
    }
}
