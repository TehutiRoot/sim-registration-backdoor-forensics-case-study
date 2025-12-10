package org.bouncycastle.math.p041ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p041ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement */
/* loaded from: classes6.dex */
public class SecP128R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q */
    public static final BigInteger f75361Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: x */
    protected int[] f75362x;

    public SecP128R1FieldElement() {
        this.f75362x = Nat128.create();
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.add(this.f75362x, ((SecP128R1FieldElement) eCFieldElement).f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat128.create();
        SecP128R1Field.addOne(this.f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.inv(((SecP128R1FieldElement) eCFieldElement).f75362x, create);
        SecP128R1Field.multiply(create, this.f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP128R1FieldElement) {
            return Nat128.m24431eq(this.f75362x, ((SecP128R1FieldElement) obj).f75362x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public String getFieldName() {
        return "SecP128R1Field";
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public int getFieldSize() {
        return f75361Q.bitLength();
    }

    public int hashCode() {
        return f75361Q.hashCode() ^ Arrays.hashCode(this.f75362x, 0, 4);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat128.create();
        SecP128R1Field.inv(this.f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean isOne() {
        return Nat128.isOne(this.f75362x);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean isZero() {
        return Nat128.isZero(this.f75362x);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.multiply(this.f75362x, ((SecP128R1FieldElement) eCFieldElement).f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat128.create();
        SecP128R1Field.negate(this.f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f75362x;
        if (Nat128.isZero(iArr) || Nat128.isOne(iArr)) {
            return this;
        }
        int[] create = Nat128.create();
        SecP128R1Field.square(iArr, create);
        SecP128R1Field.multiply(create, iArr, create);
        int[] create2 = Nat128.create();
        SecP128R1Field.squareN(create, 2, create2);
        SecP128R1Field.multiply(create2, create, create2);
        int[] create3 = Nat128.create();
        SecP128R1Field.squareN(create2, 4, create3);
        SecP128R1Field.multiply(create3, create2, create3);
        SecP128R1Field.squareN(create3, 2, create2);
        SecP128R1Field.multiply(create2, create, create2);
        SecP128R1Field.squareN(create2, 10, create);
        SecP128R1Field.multiply(create, create2, create);
        SecP128R1Field.squareN(create, 10, create3);
        SecP128R1Field.multiply(create3, create2, create3);
        SecP128R1Field.square(create3, create2);
        SecP128R1Field.multiply(create2, iArr, create2);
        SecP128R1Field.squareN(create2, 95, create2);
        SecP128R1Field.square(create2, create3);
        if (Nat128.m24431eq(iArr, create3)) {
            return new SecP128R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat128.create();
        SecP128R1Field.square(this.f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat128.create();
        SecP128R1Field.subtract(this.f75362x, ((SecP128R1FieldElement) eCFieldElement).f75362x, create);
        return new SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean testBitZero() {
        return Nat128.getBit(this.f75362x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat128.toBigInteger(this.f75362x);
    }

    public SecP128R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f75361Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f75362x = SecP128R1Field.fromBigInteger(bigInteger);
    }

    public SecP128R1FieldElement(int[] iArr) {
        this.f75362x = iArr;
    }
}
