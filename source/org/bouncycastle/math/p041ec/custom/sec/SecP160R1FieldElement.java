package org.bouncycastle.math.p041ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p041ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP160R1FieldElement */
/* loaded from: classes6.dex */
public class SecP160R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q */
    public static final BigInteger f75368Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: x */
    protected int[] f75369x;

    public SecP160R1FieldElement() {
        this.f75369x = Nat160.create();
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.add(this.f75369x, ((SecP160R1FieldElement) eCFieldElement).f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat160.create();
        SecP160R1Field.addOne(this.f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.inv(((SecP160R1FieldElement) eCFieldElement).f75369x, create);
        SecP160R1Field.multiply(create, this.f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return Nat160.m24430eq(this.f75369x, ((SecP160R1FieldElement) obj).f75369x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public int getFieldSize() {
        return f75368Q.bitLength();
    }

    public int hashCode() {
        return f75368Q.hashCode() ^ Arrays.hashCode(this.f75369x, 0, 5);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat160.create();
        SecP160R1Field.inv(this.f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f75369x);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f75369x);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.multiply(this.f75369x, ((SecP160R1FieldElement) eCFieldElement).f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat160.create();
        SecP160R1Field.negate(this.f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f75369x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] create = Nat160.create();
        SecP160R1Field.square(iArr, create);
        SecP160R1Field.multiply(create, iArr, create);
        int[] create2 = Nat160.create();
        SecP160R1Field.squareN(create, 2, create2);
        SecP160R1Field.multiply(create2, create, create2);
        SecP160R1Field.squareN(create2, 4, create);
        SecP160R1Field.multiply(create, create2, create);
        SecP160R1Field.squareN(create, 8, create2);
        SecP160R1Field.multiply(create2, create, create2);
        SecP160R1Field.squareN(create2, 16, create);
        SecP160R1Field.multiply(create, create2, create);
        SecP160R1Field.squareN(create, 32, create2);
        SecP160R1Field.multiply(create2, create, create2);
        SecP160R1Field.squareN(create2, 64, create);
        SecP160R1Field.multiply(create, create2, create);
        SecP160R1Field.square(create, create2);
        SecP160R1Field.multiply(create2, iArr, create2);
        SecP160R1Field.squareN(create2, 29, create2);
        SecP160R1Field.square(create2, create);
        if (Nat160.m24430eq(iArr, create)) {
            return new SecP160R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat160.create();
        SecP160R1Field.square(this.f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat160.create();
        SecP160R1Field.subtract(this.f75369x, ((SecP160R1FieldElement) eCFieldElement).f75369x, create);
        return new SecP160R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f75369x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f75369x);
    }

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f75368Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f75369x = SecP160R1Field.fromBigInteger(bigInteger);
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f75369x = iArr;
    }
}
