package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes6.dex */
public class McEliecePublicKey extends ASN1Object {

    /* renamed from: g */
    private final GF2Matrix f75553g;

    /* renamed from: n */
    private final int f75554n;

    /* renamed from: t */
    private final int f75555t;

    public McEliecePublicKey(int i, int i2, GF2Matrix gF2Matrix) {
        this.f75554n = i;
        this.f75555t = i2;
        this.f75553g = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f75553g);
    }

    public int getN() {
        return this.f75554n;
    }

    public int getT() {
        return this.f75555t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f75554n));
        aSN1EncodableVector.add(new ASN1Integer(this.f75555t));
        aSN1EncodableVector.add(new DEROctetString(this.f75553g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f75554n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f75555t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f75553g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}