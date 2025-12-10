package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes4.dex */
public final class ImmutableBundle {

    /* renamed from: b */
    public static final AndroidLogger f56272b = AndroidLogger.getInstance();

    /* renamed from: a */
    public final Bundle f56273a;

    public ImmutableBundle() {
        this(new Bundle());
    }

    /* renamed from: a */
    public final Optional m38157a(String str) {
        if (!containsKey(str)) {
            return Optional.absent();
        }
        try {
            return Optional.fromNullable((Integer) this.f56273a.get(str));
        } catch (ClassCastException e) {
            f56272b.debug("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public boolean containsKey(String str) {
        if (str != null && this.f56273a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public Optional<Boolean> getBoolean(String str) {
        if (!containsKey(str)) {
            return Optional.absent();
        }
        try {
            return Optional.fromNullable((Boolean) this.f56273a.get(str));
        } catch (ClassCastException e) {
            f56272b.debug("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return Optional.absent();
        }
    }

    public Optional<Double> getDouble(String str) {
        if (!containsKey(str)) {
            return Optional.absent();
        }
        Object obj = this.f56273a.get(str);
        if (obj == null) {
            return Optional.absent();
        }
        if (obj instanceof Float) {
            return Optional.m38156of(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return Optional.m38156of((Double) obj);
        }
        f56272b.debug("Metadata key %s contains type other than double: %s", str);
        return Optional.absent();
    }

    public Optional<Long> getLong(String str) {
        Optional m38157a = m38157a(str);
        if (m38157a.isAvailable()) {
            return Optional.m38156of(Long.valueOf(((Integer) m38157a.get()).intValue()));
        }
        return Optional.absent();
    }

    public ImmutableBundle(Bundle bundle) {
        this.f56273a = (Bundle) bundle.clone();
    }
}
