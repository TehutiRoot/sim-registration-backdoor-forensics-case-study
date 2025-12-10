package com.tom_roush.fontbox.cff;

import androidx.appcompat.app.AppCompatDelegate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public class Type2CharStringParser {

    /* renamed from: a */
    public int f59332a = 0;

    /* renamed from: b */
    public int f59333b = 0;

    /* renamed from: c */
    public List f59334c = null;

    /* renamed from: d */
    public final String f59335d;

    /* renamed from: e */
    public final String f59336e;

    public Type2CharStringParser(String str, String str2) {
        this.f59335d = str;
        this.f59336e = str2;
    }

    /* renamed from: a */
    public final int m32993a() {
        int i = this.f59332a + this.f59333b;
        int i2 = i / 8;
        if (i % 8 > 0) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: b */
    public final List m32992b(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z) {
        boolean z2;
        boolean z3;
        if (z) {
            this.f59332a = 0;
            this.f59333b = 0;
            this.f59334c = new ArrayList();
        }
        DataInput dataInput = new DataInput(bArr);
        if (bArr3 != null && bArr3.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArr2 != null && bArr2.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        while (dataInput.hasRemaining()) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            int i = 32768;
            if (readUnsignedByte == 10 && z2) {
                List list = this.f59334c;
                Integer num = (Integer) list.remove(list.size() - 1);
                int length = bArr3.length;
                if (length < 1240) {
                    i = 107;
                } else if (length < 33900) {
                    i = 1131;
                }
                int intValue = i + num.intValue();
                if (intValue < bArr3.length) {
                    m32992b(bArr3[intValue], bArr2, bArr3, false);
                    List list2 = this.f59334c;
                    Object obj = list2.get(list2.size() - 1);
                    if ((obj instanceof CharStringCommand) && ((CharStringCommand) obj).getKey().getValue()[0] == 11) {
                        List list3 = this.f59334c;
                        list3.remove(list3.size() - 1);
                    }
                }
            } else if (readUnsignedByte == 29 && z3) {
                List list4 = this.f59334c;
                Integer num2 = (Integer) list4.remove(list4.size() - 1);
                int length2 = bArr2.length;
                if (length2 < 1240) {
                    i = 107;
                } else if (length2 < 33900) {
                    i = 1131;
                }
                int intValue2 = i + num2.intValue();
                if (intValue2 < bArr2.length) {
                    m32992b(bArr2[intValue2], bArr2, bArr3, false);
                    List list5 = this.f59334c;
                    Object obj2 = list5.get(list5.size() - 1);
                    if ((obj2 instanceof CharStringCommand) && ((CharStringCommand) obj2).getKey().getValue()[0] == 11) {
                        List list6 = this.f59334c;
                        list6.remove(list6.size() - 1);
                    }
                }
            } else if (readUnsignedByte >= 0 && readUnsignedByte <= 27) {
                this.f59334c.add(m32990d(readUnsignedByte, dataInput));
            } else if (readUnsignedByte == 28) {
                this.f59334c.add(m32989e(readUnsignedByte, dataInput));
            } else if (readUnsignedByte >= 29 && readUnsignedByte <= 31) {
                this.f59334c.add(m32990d(readUnsignedByte, dataInput));
            } else if (readUnsignedByte >= 32 && readUnsignedByte <= 255) {
                this.f59334c.add(m32989e(readUnsignedByte, dataInput));
            } else {
                throw new IllegalArgumentException();
            }
        }
        return this.f59334c;
    }

    /* renamed from: c */
    public final List m32991c() {
        ArrayList arrayList = new ArrayList();
        int size = this.f59334c.size();
        while (true) {
            size--;
            if (size > -1) {
                Object obj = this.f59334c.get(size);
                if (!(obj instanceof Number)) {
                    return arrayList;
                }
                arrayList.add(0, (Number) obj);
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: d */
    public final CharStringCommand m32990d(int i, DataInput dataInput) {
        if (i == 1 || i == 18) {
            this.f59332a += m32991c().size() / 2;
        } else if (i == 3 || i == 19 || i == 20 || i == 23) {
            this.f59333b += m32991c().size() / 2;
        }
        if (i == 12) {
            return new CharStringCommand(i, dataInput.readUnsignedByte());
        }
        if (i != 19 && i != 20) {
            return new CharStringCommand(i);
        }
        int m32993a = m32993a() + 1;
        int[] iArr = new int[m32993a];
        iArr[0] = i;
        for (int i2 = 1; i2 < m32993a; i2++) {
            iArr[i2] = dataInput.readUnsignedByte();
        }
        return new CharStringCommand(iArr);
    }

    /* renamed from: e */
    public final Number m32989e(int i, DataInput dataInput) {
        if (i == 28) {
            return Integer.valueOf(dataInput.readShort());
        }
        if (i >= 32 && i <= 246) {
            return Integer.valueOf(i - 139);
        }
        if (i >= 247 && i <= 250) {
            return Integer.valueOf(((i - 247) * 256) + dataInput.readUnsignedByte() + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
        } else if (i >= 251 && i <= 254) {
            return Integer.valueOf((((-(i - 251)) * 256) - dataInput.readUnsignedByte()) - 108);
        } else if (i == 255) {
            return Double.valueOf(dataInput.readShort() + (dataInput.readUnsignedShort() / 65535.0d));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public List<Object> parse(byte[] bArr, byte[][] bArr2, byte[][] bArr3) throws IOException {
        return m32992b(bArr, bArr2, bArr3, true);
    }

    public Type2CharStringParser(String str, int i) {
        this.f59335d = str;
        this.f59336e = String.format(Locale.US, "%04x", Integer.valueOf(i));
    }
}
