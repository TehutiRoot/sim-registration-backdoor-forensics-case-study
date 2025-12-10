package p000;

import com.google.zxing.common.BitArray;
import java.util.List;

/* renamed from: lb */
/* loaded from: classes5.dex */
public abstract class AbstractC12231lb {
    /* renamed from: a */
    public static BitArray m26454a(List list) {
        int size = list.size() << 1;
        int i = size - 1;
        if (((C0033AT) list.get(list.size() - 1)).m69096d() == null) {
            i = size - 2;
        }
        BitArray bitArray = new BitArray(i * 12);
        int i2 = 0;
        int value = ((C0033AT) list.get(0)).m69096d().getValue();
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & value) != 0) {
                bitArray.set(i2);
            }
            i2++;
        }
        for (int i4 = 1; i4 < list.size(); i4++) {
            C0033AT c0033at = (C0033AT) list.get(i4);
            int value2 = c0033at.m69097c().getValue();
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & value2) != 0) {
                    bitArray.set(i2);
                }
                i2++;
            }
            if (c0033at.m69096d() != null) {
                int value3 = c0033at.m69096d().getValue();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & value3) != 0) {
                        bitArray.set(i2);
                    }
                    i2++;
                }
            }
        }
        return bitArray;
    }
}
