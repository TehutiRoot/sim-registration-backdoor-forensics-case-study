package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes6.dex */
public class DHParameter extends ASN1Object {

    /* renamed from: g */
    ASN1Integer f74767g;

    /* renamed from: l */
    ASN1Integer f74768l;

    /* renamed from: p */
    ASN1Integer f74769p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f74769p = new ASN1Integer(bigInteger);
        this.f74767g = new ASN1Integer(bigInteger2);
        this.f74768l = i != 0 ? new ASN1Integer(i) : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f74767g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f74768l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f74769p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f74769p);
        aSN1EncodableVector.add(this.f74767g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f74768l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f74769p = ASN1Integer.getInstance(objects.nextElement());
        this.f74767g = ASN1Integer.getInstance(objects.nextElement());
        this.f74768l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }
}