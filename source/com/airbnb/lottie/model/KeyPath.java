package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");

    /* renamed from: a */
    public final List f41302a;

    /* renamed from: b */
    public KeyPathElement f41303b;

    public KeyPath(String... strArr) {
        this.f41302a = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final boolean m50799a() {
        List list = this.f41302a;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f41302a.add(str);
        return keyPath;
    }

    /* renamed from: b */
    public final boolean m50798b(String str) {
        return "__container".equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyPath keyPath = (KeyPath) obj;
        if (!this.f41302a.equals(keyPath.f41302a)) {
            return false;
        }
        KeyPathElement keyPathElement = this.f41303b;
        KeyPathElement keyPathElement2 = keyPath.f41303b;
        if (keyPathElement != null) {
            return keyPathElement.equals(keyPathElement2);
        }
        if (keyPathElement2 == null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean fullyResolvesTo(String str, int i) {
        boolean z;
        boolean z2;
        if (i >= this.f41302a.size()) {
            return false;
        }
        if (i == this.f41302a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (String) this.f41302a.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals(org.slf4j.Marker.ANY_MARKER)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((!z && (i != this.f41302a.size() - 2 || !m50799a())) || !z2) {
                return false;
            }
            return true;
        } else if (!z && ((String) this.f41302a.get(i + 1)).equals(str)) {
            if (i != this.f41302a.size() - 2 && (i != this.f41302a.size() - 3 || !m50799a())) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f41302a.size() - 1) {
                return false;
            }
            return ((String) this.f41302a.get(i2)).equals(str);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPathElement getResolvedElement() {
        return this.f41303b;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f41302a.hashCode() * 31;
        KeyPathElement keyPathElement = this.f41303b;
        if (keyPathElement != null) {
            i = keyPathElement.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int incrementDepthBy(String str, int i) {
        if (m50798b(str)) {
            return 0;
        }
        if (!((String) this.f41302a.get(i)).equals("**")) {
            return 1;
        }
        if (i == this.f41302a.size() - 1 || !((String) this.f41302a.get(i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public String keysToString() {
        return this.f41302a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean matches(String str, int i) {
        if (m50798b(str)) {
            return true;
        }
        if (i >= this.f41302a.size()) {
            return false;
        }
        if (((String) this.f41302a.get(i)).equals(str) || ((String) this.f41302a.get(i)).equals("**") || ((String) this.f41302a.get(i)).equals(org.slf4j.Marker.ANY_MARKER)) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean propagateToChildren(String str, int i) {
        if ("__container".equals(str) || i < this.f41302a.size() - 1 || ((String) this.f41302a.get(i)).equals("**")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.f41303b = keyPathElement;
        return keyPath;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f41302a);
        sb.append(",resolved=");
        if (this.f41303b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public KeyPath(KeyPath keyPath) {
        this.f41302a = new ArrayList(keyPath.f41302a);
        this.f41303b = keyPath.f41303b;
    }
}
