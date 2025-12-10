package io.opencensus.stats;

import io.opencensus.stats.View;

/* renamed from: io.opencensus.stats.w */
/* loaded from: classes5.dex */
public final class C10650w extends View.Name {

    /* renamed from: a */
    public final String f63707a;

    public C10650w(String str) {
        if (str != null) {
            this.f63707a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }

    @Override // io.opencensus.stats.View.Name
    public String asString() {
        return this.f63707a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof View.Name) {
            return this.f63707a.equals(((View.Name) obj).asString());
        }
        return false;
    }

    public int hashCode() {
        return this.f63707a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Name{asString=" + this.f63707a + "}";
    }
}