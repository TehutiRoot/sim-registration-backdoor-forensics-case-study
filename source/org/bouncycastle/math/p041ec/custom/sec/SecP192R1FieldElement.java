package org.bouncycastle.math.p041ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.p041ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP192R1FieldElement */
/* loaded from: classes6.dex */
public class SecP192R1FieldElement extends ECFieldElement.AbstractFp {

    /* renamed from: Q */
    public static final BigInteger f75384Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: x */
    protected int[] f75385x;

    public SecP192R1FieldElement() {
        this.f75385x = Nat192.create();
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.add(this.f75385x, ((SecP192R1FieldElement) eCFieldElement).f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] create = Nat192.create();
        SecP192R1Field.addOne(this.f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.inv(((SecP192R1FieldElement) eCFieldElement).f75385x, create);
        SecP192R1Field.multiply(create, this.f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192R1FieldElement) {
            return Nat192.m24429eq(this.f75385x, ((SecP192R1FieldElement) obj).f75385x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public String getFieldName() {
        return "SecP192R1Field";
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public int getFieldSize() {
        return f75384Q.bitLength();
    }

    public int hashCode() {
        return f75384Q.hashCode() ^ Arrays.hashCode(this.f75385x, 0, 6);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement invert() {
        int[] create = Nat192.create();
        SecP192R1Field.inv(this.f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean isOne() {
        return Nat192.isOne(this.f75385x);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean isZero() {
        return Nat192.isZero(this.f75385x);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.multiply(this.f75385x, ((SecP192R1FieldElement) eCFieldElement).f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement negate() {
        int[] create = Nat192.create();
        SecP192R1Field.negate(this.f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f75385x;
        if (Nat192.isZero(iArr) || Nat192.isOne(iArr)) {
            return this;
        }
        int[] create = Nat192.create();
        int[] create2 = Nat192.create();
        SecP192R1Field.square(iArr, create);
        SecP192R1Field.multiply(create, iArr, create);
        SecP192R1Field.squareN(create, 2, create2);
        SecP192R1Field.multiply(create2, create, create2);
        SecP192R1Field.squareN(create2, 4, create);
        SecP192R1Field.multiply(create, create2, create);
        SecP192R1Field.squareN(create, 8, create2);
        SecP192R1Field.multiply(create2, create, create2);
        SecP192R1Field.squareN(create2, 16, create);
        SecP192R1Field.multiply(create, create2, create);
        SecP192R1Field.squareN(create, 32, create2);
        SecP192R1Field.multiply(create2, create, create2);
        SecP192R1Field.squareN(create2, 64, create);
        SecP192R1Field.multiply(create, create2, create);
        SecP192R1Field.squareN(create, 62, create);
        SecP192R1Field.square(create, create2);
        if (Nat192.m24429eq(iArr, create2)) {
            return new SecP192R1FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement square() {
        int[] create = Nat192.create();
        SecP192R1Field.square(this.f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] create = Nat192.create();
        SecP192R1Field.subtract(this.f75385x, ((SecP192R1FieldElement) eCFieldElement).f75385x, create);
        return new SecP192R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public boolean testBitZero() {
        return Nat192.getBit(this.f75385x, 0) == 1;
    }

    @Override // org.bouncycastle.math.p041ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat192.toBigInteger(this.f75385x);
    }

    public SecP192R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f75384Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f75385x = SecP192R1Field.fromBigInteger(bigInteger);
    }

    public SecP192R1FieldElement(int[] iArr) {
        this.f75385x = iArr;
    }
}
