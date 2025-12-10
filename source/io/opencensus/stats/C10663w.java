package io.opencensus.stats;

import io.opencensus.stats.View;

/* renamed from: io.opencensus.stats.w */
/* loaded from: classes5.dex */
public final class C10663w extends View.Name {

    /* renamed from: a */
    public final String f63644a;

    public C10663w(String str) {
        if (str != null) {
            this.f63644a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }

    @Override // io.opencensus.stats.View.Name
    public String asString() {
        return this.f63644a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof View.Name) {
            return this.f63644a.equals(((View.Name) obj).asString());
        }
        return false;
    }

    public int hashCode() {
        return this.f63644a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Name{asString=" + this.f63644a + "}";
    }
}
