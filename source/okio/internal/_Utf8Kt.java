package okio.internal;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.feitian.readerdk.Tool.C6150DK;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Utf8;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m28850d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 -Util.kt\nokio/_UtilKt\n*L\n1#1,60:1\n259#2,16:61\n276#2:78\n396#2,9:79\n127#2:88\n405#2,20:90\n278#2,3:110\n439#2,4:113\n127#2:117\n445#2,10:118\n127#2:128\n455#2,5:129\n127#2:134\n460#2,24:135\n282#2,3:159\n499#2,3:162\n285#2,12:165\n502#2:177\n127#2:178\n505#2,2:179\n127#2:181\n509#2,10:182\n127#2:192\n519#2,5:193\n127#2:198\n524#2,5:199\n127#2:204\n529#2,28:205\n301#2,6:233\n138#2,67:239\n66#3:77\n72#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
/* loaded from: classes6.dex */
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (Intrinsics.compare((int) charAt2, 128) >= 0) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (Intrinsics.compare((int) charAt3, 128) < 0) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) charAt3;
                        i2++;
                        while (true) {
                            i3 = i4;
                            if (i2 < length2 && Intrinsics.compare((int) str.charAt(i2), 128) < 0) {
                                i4 = i3 + 1;
                                bArr[i3] = (byte) str.charAt(i2);
                                i2++;
                            }
                        }
                    } else {
                        if (Intrinsics.compare((int) charAt3, 2048) < 0) {
                            bArr[i3] = (byte) ((charAt3 >> 6) | CertificateHolderAuthorization.CVCA);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 <= charAt3 && charAt3 < 57344) {
                            if (Intrinsics.compare((int) charAt3, (int) GeneratorBase.SURR1_LAST) <= 0 && length2 > (i = i2 + 1) && 56320 <= (charAt = str.charAt(i)) && charAt < 57344) {
                                int charAt4 = ((charAt3 << '\n') + str.charAt(i)) - 56613888;
                                bArr[i3] = (byte) ((charAt4 >> 18) | C6150DK.ERROR_RECEIVE_LRC);
                                bArr[i3 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                                bArr[i3 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i3 + 3] = (byte) ((charAt4 & 63) | 128);
                                i2 += 2;
                            } else {
                                bArr[i3] = Utf8.REPLACEMENT_BYTE;
                                i2++;
                                i3++;
                            }
                        } else {
                            bArr[i3] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((charAt3 & '?') | 128);
                        }
                        i2++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i3);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i2++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return copyOf2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = 3;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 >= 0 && i2 <= bArr.length && i10 <= i2) {
            char[] cArr = new char[i2 - i10];
            int i12 = 0;
            while (i10 < i2) {
                byte b2 = bArr[i10];
                if (b2 >= 0) {
                    int i13 = i12 + 1;
                    cArr[i12] = (char) b2;
                    i10++;
                    while (true) {
                        i12 = i13;
                        if (i10 < i2 && (b = bArr[i10]) >= 0) {
                            i10++;
                            i13 = i12 + 1;
                            cArr[i12] = (char) b;
                        }
                    }
                } else if ((b2 >> 5) == -2) {
                    int i14 = i10 + 1;
                    if (i2 <= i14) {
                        i3 = i12 + 1;
                        cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    } else {
                        byte b3 = bArr[i14];
                        if ((b3 & 192) == 128) {
                            int i15 = (b2 << 6) ^ (b3 ^ 3968);
                            if (i15 < 128) {
                                i4 = i12 + 1;
                                cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i4 = i12 + 1;
                                cArr[i12] = (char) i15;
                            }
                            Unit unit = Unit.INSTANCE;
                            i12 = i4;
                            i5 = 2;
                            i10 += i5;
                        } else {
                            i3 = i12 + 1;
                            cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    i12 = i3;
                    i5 = 1;
                    i10 += i5;
                } else if ((b2 >> 4) == -2) {
                    int i16 = i10 + 2;
                    if (i2 <= i16) {
                        int i17 = i12 + 1;
                        cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit3 = Unit.INSTANCE;
                        int i18 = i10 + 1;
                        if (i2 > i18 && (bArr[i18] & 192) == 128) {
                            i12 = i17;
                            i7 = 2;
                        } else {
                            i12 = i17;
                            i7 = 1;
                        }
                    } else {
                        byte b4 = bArr[i10 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i16];
                            if ((b5 & 192) == 128) {
                                int i19 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                                if (i19 < 2048) {
                                    i6 = i12 + 1;
                                    cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else if (55296 <= i19 && i19 < 57344) {
                                    i6 = i12 + 1;
                                    cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                } else {
                                    char c = (char) i19;
                                    i6 = i12 + 1;
                                    cArr[i12] = c;
                                }
                                Unit unit4 = Unit.INSTANCE;
                                i12 = i6;
                                i7 = 3;
                            } else {
                                cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                                Unit unit5 = Unit.INSTANCE;
                                i12++;
                                i7 = 2;
                            }
                        } else {
                            cArr[i12] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit6 = Unit.INSTANCE;
                            i12++;
                            i7 = 1;
                        }
                    }
                    i10 += i7;
                } else {
                    if ((b2 >> 3) == -2) {
                        int i20 = i10 + 3;
                        if (i2 <= i20) {
                            i8 = i12 + 1;
                            cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit7 = Unit.INSTANCE;
                            int i21 = i10 + 1;
                            if (i2 > i21 && (bArr[i21] & 192) == 128) {
                                int i22 = i10 + 2;
                                if (i2 > i22 && (bArr[i22] & 192) == 128) {
                                    i12 = i8;
                                    i10 += i11;
                                }
                                i12 = i8;
                                i11 = 2;
                                i10 += i11;
                            }
                            i12 = i8;
                            i11 = 1;
                            i10 += i11;
                        } else {
                            byte b6 = bArr[i10 + 1];
                            if ((b6 & 192) == 128) {
                                byte b7 = bArr[i10 + 2];
                                if ((b7 & 192) == 128) {
                                    byte b8 = bArr[i20];
                                    if ((b8 & 192) == 128) {
                                        int i23 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                        if (i23 > 1114111) {
                                            i9 = i12 + 1;
                                            cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if (55296 <= i23 && i23 < 57344) {
                                            i9 = i12 + 1;
                                            cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if (i23 < 65536) {
                                            i9 = i12 + 1;
                                            cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                        } else if (i23 != 65533) {
                                            cArr[i12] = (char) ((i23 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                            cArr[i12 + 1] = (char) ((i23 & 1023) + 56320);
                                            i9 = i12 + 2;
                                        } else {
                                            i9 = i12 + 1;
                                            cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                        }
                                        Unit unit8 = Unit.INSTANCE;
                                        i12 = i9;
                                        i11 = 4;
                                    } else {
                                        cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                        Unit unit9 = Unit.INSTANCE;
                                        i12++;
                                        i11 = 3;
                                    }
                                    i10 += i11;
                                } else {
                                    i8 = i12 + 1;
                                    cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                    Unit unit10 = Unit.INSTANCE;
                                    i12 = i8;
                                    i11 = 2;
                                    i10 += i11;
                                }
                            } else {
                                i8 = i12 + 1;
                                cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit11 = Unit.INSTANCE;
                                i12 = i8;
                                i11 = 1;
                                i10 += i11;
                            }
                        }
                    } else {
                        cArr[i12] = Utf8.REPLACEMENT_CHARACTER;
                        i10++;
                        i12++;
                    }
                    i11 = 3;
                }
            }
            return AbstractC20204hN1.concatToString(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i10 + " endIndex=" + i2);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }
}
