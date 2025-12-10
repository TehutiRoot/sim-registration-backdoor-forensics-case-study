package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes6.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a */
    ASN1Integer f74741a;

    /* renamed from: b */
    ASN1Integer f74742b;

    /* renamed from: p */
    ASN1Integer f74743p;

    /* renamed from: q */
    ASN1Integer f74744q;

    /* renamed from: x */
    ASN1Integer f74745x;

    /* renamed from: y */
    ASN1Integer f74746y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f74741a = new ASN1Integer(bigInteger);
        this.f74742b = new ASN1Integer(bigInteger2);
        this.f74743p = new ASN1Integer(bigInteger3);
        this.f74744q = new ASN1Integer(bigInteger4);
        this.f74745x = new ASN1Integer(i);
        this.f74746y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public BigInteger getA() {
        return this.f74741a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f74743p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f74744q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f74741a);
        aSN1EncodableVector.add(this.f74742b);
        aSN1EncodableVector.add(this.f74743p);
        aSN1EncodableVector.add(this.f74744q);
        aSN1EncodableVector.add(this.f74745x);
        aSN1EncodableVector.add(this.f74746y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f74741a = (ASN1Integer) objects.nextElement();
        this.f74742b = (ASN1Integer) objects.nextElement();
        this.f74743p = (ASN1Integer) objects.nextElement();
        this.f74744q = (ASN1Integer) objects.nextElement();
        this.f74745x = (ASN1Integer) objects.nextElement();
        this.f74746y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}