package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes5.dex */
public abstract class AbstractExpandedDecoder {

    /* renamed from: a */
    public final BitArray f57923a;

    /* renamed from: b */
    public final J50 f57924b;

    public AbstractExpandedDecoder(BitArray bitArray) {
        this.f57923a = bitArray;
        this.f57924b = new J50(bitArray);
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
        if (bitArray.get(1)) {
            return new C10264g(bitArray);
        }
        if (!bitArray.get(2)) {
            return new C1145Q4(bitArray);
        }
        int m67794g = J50.m67794g(bitArray, 1, 4);
        if (m67794g != 4) {
            if (m67794g != 5) {
                int m67794g2 = J50.m67794g(bitArray, 1, 5);
                if (m67794g2 != 12) {
                    if (m67794g2 != 13) {
                        switch (J50.m67794g(bitArray, 1, 7)) {
                            case 56:
                                return new C10118e(bitArray, "310", "11");
                            case 57:
                                return new C10118e(bitArray, "320", "11");
                            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                return new C10118e(bitArray, "310", "13");
                            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                return new C10118e(bitArray, "320", "13");
                            case 60:
                                return new C10118e(bitArray, "310", "15");
                            case 61:
                                return new C10118e(bitArray, "320", "15");
                            case 62:
                                return new C10118e(bitArray, "310", "17");
                            case 63:
                                return new C10118e(bitArray, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: " + bitArray);
                        }
                    }
                    return new C10039d(bitArray);
                }
                return new C5414c(bitArray);
            }
            return new C5339b(bitArray);
        }
        return new C1861a(bitArray);
    }

    public final J50 getGeneralDecoder() {
        return this.f57924b;
    }

    public final BitArray getInformation() {
        return this.f57923a;
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
