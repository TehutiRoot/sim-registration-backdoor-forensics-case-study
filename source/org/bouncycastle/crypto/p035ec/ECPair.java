package org.bouncycastle.crypto.p035ec;

import org.bouncycastle.math.p041ec.ECPoint;

/* renamed from: org.bouncycastle.crypto.ec.ECPair */
/* loaded from: classes6.dex */
public class ECPair {

    /* renamed from: x */
    private final ECPoint f74929x;

    /* renamed from: y */
    private final ECPoint f74930y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f74929x = eCPoint;
        this.f74930y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f74929x;
    }

    public ECPoint getY() {
        return this.f74930y;
    }

    public int hashCode() {
        return this.f74929x.hashCode() + (this.f74930y.hashCode() * 37);
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
