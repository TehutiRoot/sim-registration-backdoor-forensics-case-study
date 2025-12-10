package org.bouncycastle.math.p041ec.custom.sec;

import org.bouncycastle.math.p041ec.ECCurve;
import org.bouncycastle.math.p041ec.ECFieldElement;
import org.bouncycastle.math.p041ec.ECPoint;
import org.bouncycastle.math.raw.Nat;

/* renamed from: org.bouncycastle.math.ec.custom.sec.SecP521R1Point */
/* loaded from: classes6.dex */
public class SecP521R1Point extends ECPoint.AbstractFp {
    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.p041ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f75342x;
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f75343y;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) eCPoint.getXCoord();
        SecP521R1FieldElement secP521R1FieldElement4 = (SecP521R1FieldElement) eCPoint.getYCoord();
        SecP521R1FieldElement secP521R1FieldElement5 = (SecP521R1FieldElement) this.f75344zs[0];
        SecP521R1FieldElement secP521R1FieldElement6 = (SecP521R1FieldElement) eCPoint.getZCoord(0);
        int[] create = Nat.create(17);
        int[] create2 = Nat.create(17);
        int[] create3 = Nat.create(17);
        int[] create4 = Nat.create(17);
        boolean isOne = secP521R1FieldElement5.isOne();
        if (isOne) {
            iArr = secP521R1FieldElement3.f75416x;
            iArr2 = secP521R1FieldElement4.f75416x;
        } else {
            SecP521R1Field.square(secP521R1FieldElement5.f75416x, create3);
            SecP521R1Field.multiply(create3, secP521R1FieldElement3.f75416x, create2);
            SecP521R1Field.multiply(create3, secP521R1FieldElement5.f75416x, create3);
            SecP521R1Field.multiply(create3, secP521R1FieldElement4.f75416x, create3);
            iArr = create2;
            iArr2 = create3;
        }
        boolean isOne2 = secP521R1FieldElement6.isOne();
        if (isOne2) {
            iArr3 = secP521R1FieldElement.f75416x;
            iArr4 = secP521R1FieldElement2.f75416x;
        } else {
            SecP521R1Field.square(secP521R1FieldElement6.f75416x, create4);
            SecP521R1Field.multiply(create4, secP521R1FieldElement.f75416x, create);
            SecP521R1Field.multiply(create4, secP521R1FieldElement6.f75416x, create4);
            SecP521R1Field.multiply(create4, secP521R1FieldElement2.f75416x, create4);
            iArr3 = create;
            iArr4 = create4;
        }
        int[] create5 = Nat.create(17);
        SecP521R1Field.subtract(iArr3, iArr, create5);
        SecP521R1Field.subtract(iArr4, iArr2, create2);
        if (Nat.isZero(17, create5)) {
            return Nat.isZero(17, create2) ? twice() : curve.getInfinity();
        }
        SecP521R1Field.square(create5, create3);
        int[] create6 = Nat.create(17);
        SecP521R1Field.multiply(create3, create5, create6);
        SecP521R1Field.multiply(create3, iArr3, create3);
        SecP521R1Field.multiply(iArr4, create6, create);
        SecP521R1FieldElement secP521R1FieldElement7 = new SecP521R1FieldElement(create4);
        SecP521R1Field.square(create2, secP521R1FieldElement7.f75416x);
        int[] iArr5 = secP521R1FieldElement7.f75416x;
        SecP521R1Field.add(iArr5, create6, iArr5);
        int[] iArr6 = secP521R1FieldElement7.f75416x;
        SecP521R1Field.subtract(iArr6, create3, iArr6);
        int[] iArr7 = secP521R1FieldElement7.f75416x;
        SecP521R1Field.subtract(iArr7, create3, iArr7);
        SecP521R1FieldElement secP521R1FieldElement8 = new SecP521R1FieldElement(create6);
        SecP521R1Field.subtract(create3, secP521R1FieldElement7.f75416x, secP521R1FieldElement8.f75416x);
        SecP521R1Field.multiply(secP521R1FieldElement8.f75416x, create2, create2);
        SecP521R1Field.subtract(create2, create, secP521R1FieldElement8.f75416x);
        SecP521R1FieldElement secP521R1FieldElement9 = new SecP521R1FieldElement(create5);
        if (!isOne) {
            int[] iArr8 = secP521R1FieldElement9.f75416x;
            SecP521R1Field.multiply(iArr8, secP521R1FieldElement5.f75416x, iArr8);
        }
        if (!isOne2) {
            int[] iArr9 = secP521R1FieldElement9.f75416x;
            SecP521R1Field.multiply(iArr9, secP521R1FieldElement6.f75416x, iArr9);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement7, secP521R1FieldElement8, new ECFieldElement[]{secP521R1FieldElement9});
    }

    @Override // org.bouncycastle.math.p041ec.ECPoint
    public ECPoint detach() {
        return new SecP521R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    public ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
        return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
    }

    public ECFieldElement eight(ECFieldElement eCFieldElement) {
        return four(two(eCFieldElement));
    }

    public ECFieldElement four(ECFieldElement eCFieldElement) {
        return two(two(eCFieldElement));
    }

    @Override // org.bouncycastle.math.p041ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP521R1Point(this.curve, this.f75342x, this.f75343y.negate(), this.f75344zs);
    }

    public ECFieldElement three(ECFieldElement eCFieldElement) {
        return two(eCFieldElement).add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.p041ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f75343y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.p041ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f75343y;
        if (secP521R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f75342x;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) this.f75344zs[0];
        int[] create = Nat.create(17);
        int[] create2 = Nat.create(17);
        int[] create3 = Nat.create(17);
        SecP521R1Field.square(secP521R1FieldElement.f75416x, create3);
        int[] create4 = Nat.create(17);
        SecP521R1Field.square(create3, create4);
        boolean isOne = secP521R1FieldElement3.isOne();
        int[] iArr = secP521R1FieldElement3.f75416x;
        if (!isOne) {
            SecP521R1Field.square(iArr, create2);
            iArr = create2;
        }
        SecP521R1Field.subtract(secP521R1FieldElement2.f75416x, iArr, create);
        SecP521R1Field.add(secP521R1FieldElement2.f75416x, iArr, create2);
        SecP521R1Field.multiply(create2, create, create2);
        Nat.addBothTo(17, create2, create2, create2);
        SecP521R1Field.reduce23(create2);
        SecP521R1Field.multiply(create3, secP521R1FieldElement2.f75416x, create3);
        Nat.shiftUpBits(17, create3, 2, 0);
        SecP521R1Field.reduce23(create3);
        Nat.shiftUpBits(17, create4, 3, 0, create);
        SecP521R1Field.reduce23(create);
        SecP521R1FieldElement secP521R1FieldElement4 = new SecP521R1FieldElement(create4);
        SecP521R1Field.square(create2, secP521R1FieldElement4.f75416x);
        int[] iArr2 = secP521R1FieldElement4.f75416x;
        SecP521R1Field.subtract(iArr2, create3, iArr2);
        int[] iArr3 = secP521R1FieldElement4.f75416x;
        SecP521R1Field.subtract(iArr3, create3, iArr3);
        SecP521R1FieldElement secP521R1FieldElement5 = new SecP521R1FieldElement(create3);
        SecP521R1Field.subtract(create3, secP521R1FieldElement4.f75416x, secP521R1FieldElement5.f75416x);
        int[] iArr4 = secP521R1FieldElement5.f75416x;
        SecP521R1Field.multiply(iArr4, create2, iArr4);
        int[] iArr5 = secP521R1FieldElement5.f75416x;
        SecP521R1Field.subtract(iArr5, create, iArr5);
        SecP521R1FieldElement secP521R1FieldElement6 = new SecP521R1FieldElement(create2);
        SecP521R1Field.twice(secP521R1FieldElement.f75416x, secP521R1FieldElement6.f75416x);
        if (!isOne) {
            int[] iArr6 = secP521R1FieldElement6.f75416x;
            SecP521R1Field.multiply(iArr6, secP521R1FieldElement3.f75416x, iArr6);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement4, secP521R1FieldElement5, new ECFieldElement[]{secP521R1FieldElement6});
    }

    @Override // org.bouncycastle.math.p041ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f75343y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public ECFieldElement two(ECFieldElement eCFieldElement) {
        return eCFieldElement.add(eCFieldElement);
    }

    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
