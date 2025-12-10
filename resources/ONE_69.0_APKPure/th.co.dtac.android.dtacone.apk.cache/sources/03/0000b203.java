package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes4.dex */
public final class ImmutableBundle {

    /* renamed from: b */
    public static final AndroidLogger f56284b = AndroidLogger.getInstance();

    /* renamed from: a */
    public final Bundle f56285a;

    public ImmutableBundle() {
        this(new Bundle());
    }

    /* renamed from: a */
    public final Optional m38149a(String str) {
        if (!containsKey(str)) {
            return Optional.absent();
        }
        try {
            return Optional.fromNullable((Integer) this.f56285a.get(str));
        } catch (ClassCastException e) {
            f56284b.debug("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public boolean containsKey(String str) {
        if (str != null && this.f56285a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (!containsKey(str)) {
            return Optional.absent();
        }
        try {
            return Optional.fromNullable((Boolean) this.f56285a.get(str));
        } catch (ClassCastException e) {
            f56284b.debug("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Double> getDouble(String str) {
        if (!containsKey(str)) {
            return Optional.absent();
        }
        Object obj = this.f56285a.get(str);
        if (obj == null) {
            return Optional.absent();
        }
        if (obj instanceof Float) {
            return Optional.m38148of(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return Optional.m38148of((Double) obj);
        }
        f56284b.debug("Metadata key %s contains type other than double: %s", str);
        return Optional.absent();
    }

    public Optional<Long> getLong(String str) {
        Optional m38149a = m38149a(str);
        if (m38149a.isAvailable()) {
            return Optional.m38148of(Long.valueOf(((Integer) m38149a.get()).intValue()));
        }
        return Optional.absent();
    }

    public ImmutableBundle(Bundle bundle) {
        this.f56285a = (Bundle) bundle.clone();
    }
}