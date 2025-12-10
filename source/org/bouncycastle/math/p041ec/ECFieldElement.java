package org.bouncycastle.math.p041ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

/* renamed from: org.bouncycastle.math.ec.ECFieldElement */
/* loaded from: classes6.dex */
public abstract class ECFieldElement implements ECConstants {

    /* renamed from: org.bouncycastle.math.ec.ECFieldElement$AbstractF2m */
    /* loaded from: classes6.dex */
    public static abstract class AbstractF2m extends ECFieldElement {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [org.bouncycastle.math.ec.ECFieldElement] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v3, types: [org.bouncycastle.math.ec.ECFieldElement] */
        public ECFieldElement halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                int i = (fieldSize + 1) >>> 1;
                int numberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(i);
                int i2 = 1;
                ECFieldElement eCFieldElement = this;
                while (numberOfLeadingZeros > 0) {
                    eCFieldElement = eCFieldElement.squarePow(i2 << 1).add(eCFieldElement);
                    numberOfLeadingZeros--;
                    i2 = i >>> numberOfLeadingZeros;
                    if ((i2 & 1) != 0) {
                        eCFieldElement = eCFieldElement.squarePow(2).add(this);
                    }
                }
                return eCFieldElement;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        public boolean hasFastTrace() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [org.bouncycastle.math.ec.ECFieldElement] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v2, types: [org.bouncycastle.math.ec.ECFieldElement] */
        public int trace() {
            int fieldSize = getFieldSize();
            int numberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
            int i = 1;
            ECFieldElement eCFieldElement = this;
            while (numberOfLeadingZeros > 0) {
                eCFieldElement = eCFieldElement.squarePow(i).add(eCFieldElement);
                numberOfLeadingZeros--;
                i = fieldSize >>> numberOfLeadingZeros;
                if ((i & 1) != 0) {
                    eCFieldElement = eCFieldElement.square().add(this);
                }
            }
            if (eCFieldElement.isZero()) {
                return 0;
            }
            if (eCFieldElement.isOne()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    /* renamed from: org.bouncycastle.math.ec.ECFieldElement$AbstractFp */
    /* loaded from: classes6.dex */
    public static abstract class AbstractFp extends ECFieldElement {
    }

    /* renamed from: org.bouncycastle.math.ec.ECFieldElement$F2m */
    /* loaded from: classes6.dex */
    public static class F2m extends AbstractF2m {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* renamed from: ks */
        private int[] f75336ks;

        /* renamed from: m */
        private int f75337m;
        private int representation;

        /* renamed from: x */
        LongArray f75338x;

        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.representation = 2;
                this.f75336ks = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else {
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.representation = 3;
                this.f75336ks = new int[]{i2, i3, i4};
            }
            this.f75337m = i;
            this.f75338x = new LongArray(bigInteger);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            LongArray longArray = (LongArray) this.f75338x.clone();
            longArray.addShiftedByWords(((F2m) eCFieldElement).f75338x, 0);
            return new F2m(this.f75337m, this.f75336ks, longArray);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement addOne() {
            return new F2m(this.f75337m, this.f75336ks, this.f75338x.addOne());
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public int bitLength() {
            return this.f75338x.degree();
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof F2m) {
                F2m f2m = (F2m) obj;
                return this.f75337m == f2m.f75337m && this.representation == f2m.representation && Arrays.areEqual(this.f75336ks, f2m.f75336ks) && this.f75338x.equals(f2m.f75338x);
            }
            return false;
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public int getFieldSize() {
            return this.f75337m;
        }

        public int getK1() {
            return this.f75336ks[0];
        }

        public int getK2() {
            int[] iArr = this.f75336ks;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f75336ks;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f75337m;
        }

        public int getRepresentation() {
            return this.representation;
        }

        public int hashCode() {
            return (this.f75338x.hashCode() ^ this.f75337m) ^ Arrays.hashCode(this.f75336ks);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement invert() {
            int i = this.f75337m;
            int[] iArr = this.f75336ks;
            return new F2m(i, iArr, this.f75338x.modInverse(i, iArr));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public boolean isOne() {
            return this.f75338x.isOne();
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public boolean isZero() {
            return this.f75338x.isZero();
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i = this.f75337m;
            int[] iArr = this.f75336ks;
            return new F2m(i, iArr, this.f75338x.modMultiply(((F2m) eCFieldElement).f75338x, i, iArr));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            LongArray longArray = this.f75338x;
            LongArray longArray2 = ((F2m) eCFieldElement).f75338x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f75338x;
            LongArray longArray4 = ((F2m) eCFieldElement3).f75338x;
            LongArray multiply = longArray.multiply(longArray2, this.f75337m, this.f75336ks);
            LongArray multiply2 = longArray3.multiply(longArray4, this.f75337m, this.f75336ks);
            if (multiply == longArray || multiply == longArray2) {
                multiply = (LongArray) multiply.clone();
            }
            multiply.addShiftedByWords(multiply2, 0);
            multiply.reduce(this.f75337m, this.f75336ks);
            return new F2m(this.f75337m, this.f75336ks, multiply);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement sqrt() {
            return (this.f75338x.isZero() || this.f75338x.isOne()) ? this : squarePow(this.f75337m - 1);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement square() {
            int i = this.f75337m;
            int[] iArr = this.f75336ks;
            return new F2m(i, iArr, this.f75338x.modSquare(i, iArr));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            LongArray longArray = this.f75338x;
            LongArray longArray2 = ((F2m) eCFieldElement).f75338x;
            LongArray longArray3 = ((F2m) eCFieldElement2).f75338x;
            LongArray square = longArray.square(this.f75337m, this.f75336ks);
            LongArray multiply = longArray2.multiply(longArray3, this.f75337m, this.f75336ks);
            if (square == longArray) {
                square = (LongArray) square.clone();
            }
            square.addShiftedByWords(multiply, 0);
            square.reduce(this.f75337m, this.f75336ks);
            return new F2m(this.f75337m, this.f75336ks, square);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement squarePow(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.f75337m;
            int[] iArr = this.f75336ks;
            return new F2m(i2, iArr, this.f75338x.modSquareN(i, i2, iArr));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public boolean testBitZero() {
            return this.f75338x.testBitZero();
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f75338x.toBigInteger();
        }

        public F2m(int i, int[] iArr, LongArray longArray) {
            this.f75337m = i;
            this.representation = iArr.length == 1 ? 2 : 3;
            this.f75336ks = iArr;
            this.f75338x = longArray;
        }
    }

    /* renamed from: org.bouncycastle.math.ec.ECFieldElement$Fp */
    /* loaded from: classes6.dex */
    public static class C12825Fp extends AbstractFp {

        /* renamed from: q */
        BigInteger f75339q;

        /* renamed from: r */
        BigInteger f75340r;

        /* renamed from: x */
        BigInteger f75341x;

        public C12825Fp(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, calculateResidue(bigInteger), bigInteger2);
        }

        public static BigInteger calculateResidue(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(bitLength).subtract(bigInteger);
        }

        private ECFieldElement checkSqrt(ECFieldElement eCFieldElement) {
            if (eCFieldElement.square().equals(this)) {
                return eCFieldElement;
            }
            return null;
        }

        private BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = ECConstants.ONE;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = ECConstants.TWO;
            BigInteger bigInteger8 = bigInteger6;
            for (int i = bitLength - 1; i >= lowestSetBit + 1; i--) {
                bigInteger4 = modMult(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i)) {
                    bigInteger8 = modMult(bigInteger4, bigInteger2);
                    bigInteger6 = modMult(bigInteger6, bigInteger5);
                    bigInteger7 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = modReduce(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger modReduce = modReduce(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger modReduce2 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = modReduce(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = modReduce2;
                    bigInteger6 = modReduce;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger modMult = modMult(bigInteger4, bigInteger8);
            BigInteger modMult2 = modMult(modMult, bigInteger2);
            BigInteger modReduce3 = modReduce(bigInteger6.multiply(bigInteger7).subtract(modMult));
            BigInteger modReduce4 = modReduce(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(modMult)));
            BigInteger modMult3 = modMult(modMult, modMult2);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                modReduce3 = modMult(modReduce3, modReduce4);
                modReduce4 = modReduce(modReduce4.multiply(modReduce4).subtract(modMult3.shiftLeft(1)));
                modMult3 = modMult(modMult3, modMult3);
            }
            return new BigInteger[]{modReduce3, modReduce4};
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new C12825Fp(this.f75339q, this.f75340r, modAdd(this.f75341x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger add = this.f75341x.add(ECConstants.ONE);
            if (add.compareTo(this.f75339q) == 0) {
                add = ECConstants.ZERO;
            }
            return new C12825Fp(this.f75339q, this.f75340r, add);
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new C12825Fp(this.f75339q, this.f75340r, modMult(this.f75341x, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C12825Fp) {
                C12825Fp c12825Fp = (C12825Fp) obj;
                return this.f75339q.equals(c12825Fp.f75339q) && this.f75341x.equals(c12825Fp.f75341x);
            }
            return false;
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public int getFieldSize() {
            return this.f75339q.bitLength();
        }

        public BigInteger getQ() {
            return this.f75339q;
        }

        public int hashCode() {
            return this.f75339q.hashCode() ^ this.f75341x.hashCode();
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement invert() {
            return new C12825Fp(this.f75339q, this.f75340r, modInverse(this.f75341x));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f75339q) >= 0 ? add.subtract(this.f75339q) : add;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f75339q) >= 0 ? shiftLeft.subtract(this.f75339q) : shiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f75339q.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f75339q.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            return BigIntegers.modOddInverse(this.f75339q, bigInteger);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            if (this.f75340r != null) {
                boolean z = bigInteger.signum() < 0;
                if (z) {
                    bigInteger = bigInteger.abs();
                }
                int bitLength = this.f75339q.bitLength();
                boolean equals = this.f75340r.equals(ECConstants.ONE);
                while (bigInteger.bitLength() > bitLength + 1) {
                    BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                    BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                    if (!equals) {
                        shiftRight = shiftRight.multiply(this.f75340r);
                    }
                    bigInteger = shiftRight.add(subtract);
                }
                while (bigInteger.compareTo(this.f75339q) >= 0) {
                    bigInteger = bigInteger.subtract(this.f75339q);
                }
                return (!z || bigInteger.signum() == 0) ? bigInteger : this.f75339q.subtract(bigInteger);
            }
            return bigInteger.mod(this.f75339q);
        }

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f75339q) : subtract;
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new C12825Fp(this.f75339q, this.f75340r, modMult(this.f75341x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f75341x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new C12825Fp(this.f75339q, this.f75340r, modReduce(bigInteger.multiply(bigInteger2).subtract(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            BigInteger bigInteger = this.f75341x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger4 = eCFieldElement3.toBigInteger();
            return new C12825Fp(this.f75339q, this.f75340r, modReduce(bigInteger.multiply(bigInteger2).add(bigInteger3.multiply(bigInteger4))));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement negate() {
            if (this.f75341x.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f75339q;
            return new C12825Fp(bigInteger, this.f75340r, bigInteger.subtract(this.f75341x));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement sqrt() {
            if (isZero() || isOne()) {
                return this;
            }
            if (!this.f75339q.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f75339q.testBit(1)) {
                BigInteger add = this.f75339q.shiftRight(2).add(ECConstants.ONE);
                BigInteger bigInteger = this.f75339q;
                return checkSqrt(new C12825Fp(bigInteger, this.f75340r, this.f75341x.modPow(add, bigInteger)));
            } else if (this.f75339q.testBit(2)) {
                BigInteger modPow = this.f75341x.modPow(this.f75339q.shiftRight(3), this.f75339q);
                BigInteger modMult = modMult(modPow, this.f75341x);
                if (modMult(modMult, modPow).equals(ECConstants.ONE)) {
                    return checkSqrt(new C12825Fp(this.f75339q, this.f75340r, modMult));
                }
                return checkSqrt(new C12825Fp(this.f75339q, this.f75340r, modMult(modMult, ECConstants.TWO.modPow(this.f75339q.shiftRight(2), this.f75339q))));
            } else {
                BigInteger shiftRight = this.f75339q.shiftRight(1);
                BigInteger modPow2 = this.f75341x.modPow(shiftRight, this.f75339q);
                BigInteger bigInteger2 = ECConstants.ONE;
                if (!modPow2.equals(bigInteger2)) {
                    return null;
                }
                BigInteger bigInteger3 = this.f75341x;
                BigInteger modDouble = modDouble(modDouble(bigInteger3));
                BigInteger add2 = shiftRight.add(bigInteger2);
                BigInteger subtract = this.f75339q.subtract(bigInteger2);
                Random random = new Random();
                while (true) {
                    BigInteger bigInteger4 = new BigInteger(this.f75339q.bitLength(), random);
                    if (bigInteger4.compareTo(this.f75339q) < 0 && modReduce(bigInteger4.multiply(bigInteger4).subtract(modDouble)).modPow(shiftRight, this.f75339q).equals(subtract)) {
                        BigInteger[] lucasSequence = lucasSequence(bigInteger4, bigInteger3, add2);
                        BigInteger bigInteger5 = lucasSequence[0];
                        BigInteger bigInteger6 = lucasSequence[1];
                        if (modMult(bigInteger6, bigInteger6).equals(modDouble)) {
                            return new C12825Fp(this.f75339q, this.f75340r, modHalfAbs(bigInteger6));
                        }
                        if (!bigInteger5.equals(ECConstants.ONE) && !bigInteger5.equals(subtract)) {
                            return null;
                        }
                    }
                }
            }
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f75339q;
            BigInteger bigInteger2 = this.f75340r;
            BigInteger bigInteger3 = this.f75341x;
            return new C12825Fp(bigInteger, bigInteger2, modMult(bigInteger3, bigInteger3));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f75341x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new C12825Fp(this.f75339q, this.f75340r, modReduce(bigInteger.multiply(bigInteger).subtract(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = this.f75341x;
            BigInteger bigInteger2 = eCFieldElement.toBigInteger();
            BigInteger bigInteger3 = eCFieldElement2.toBigInteger();
            return new C12825Fp(this.f75339q, this.f75340r, modReduce(bigInteger.multiply(bigInteger).add(bigInteger2.multiply(bigInteger3))));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new C12825Fp(this.f75339q, this.f75340r, modSubtract(this.f75341x, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.p041ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f75341x;
        }

        public C12825Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f75339q = bigInteger;
            this.f75340r = bigInteger2;
            this.f75341x = bigInteger3;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i) {
        ECFieldElement eCFieldElement = this;
        for (int i2 = 0; i2 < i; i2++) {
            eCFieldElement = eCFieldElement.square();
        }
        return eCFieldElement;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }
}
