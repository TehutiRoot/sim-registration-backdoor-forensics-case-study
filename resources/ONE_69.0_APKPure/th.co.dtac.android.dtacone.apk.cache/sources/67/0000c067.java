package com.tom_roush.fontbox.cff;

import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class Type1CharStringParser {

    /* renamed from: a */
    public final String f59336a;

    /* renamed from: b */
    public final String f59337b;

    public Type1CharStringParser(String str, String str2) {
        this.f59336a = str;
        this.f59337b = str2;
    }

    /* renamed from: d */
    public static Integer m33001d(List list) {
        Object remove = list.remove(list.size() - 1);
        if (remove instanceof Integer) {
            return (Integer) remove;
        }
        CharStringCommand charStringCommand = (CharStringCommand) remove;
        if (charStringCommand.getKey().getValue()[0] == 12 && charStringCommand.getKey().getValue()[1] == 12) {
            return Integer.valueOf(((Integer) list.remove(list.size() - 1)).intValue() / ((Integer) list.remove(list.size() - 1)).intValue());
        }
        throw new IOException("Unexpected char string command: " + charStringCommand.getKey());
    }

    /* renamed from: a */
    public final List m33004a(byte[] bArr, List list, List list2) {
        DataInput dataInput = new DataInput(bArr);
        while (dataInput.hasRemaining()) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            if (readUnsignedByte == 10) {
                Object remove = list2.remove(list2.size() - 1);
                if (!(remove instanceof Integer)) {
                    Log.w("PdfBox-Android", "Parameter " + remove + " for CALLSUBR is ignored, integer expected in glyph '" + this.f59337b + "' of font " + this.f59336a);
                } else {
                    Integer num = (Integer) remove;
                    if (num.intValue() >= 0 && num.intValue() < list.size()) {
                        m33004a((byte[]) list.get(num.intValue()), list, list2);
                        Object obj = list2.get(list2.size() - 1);
                        if ((obj instanceof CharStringCommand) && ((CharStringCommand) obj).getKey().getValue()[0] == 11) {
                            list2.remove(list2.size() - 1);
                        }
                    } else {
                        Log.w("PdfBox-Android", "CALLSUBR is ignored, operand: " + num + ", subrs.size(): " + list.size() + " in glyph '" + this.f59337b + "' of font " + this.f59336a);
                        while (list2.get(list2.size() - 1) instanceof Integer) {
                            list2.remove(list2.size() - 1);
                        }
                    }
                }
            } else if (readUnsignedByte == 12 && dataInput.peekUnsignedByte(0) == 16) {
                dataInput.readByte();
                Integer num2 = (Integer) list2.remove(list2.size() - 1);
                ArrayDeque arrayDeque = new ArrayDeque();
                int intValue = ((Integer) list2.remove(list2.size() - 1)).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            for (int i = 0; i < num2.intValue(); i++) {
                                arrayDeque.push(m33001d(list2));
                            }
                        } else {
                            arrayDeque.push(m33001d(list2));
                        }
                    } else {
                        list2.add(1);
                        list2.add(new CharStringCommand(12, 16));
                    }
                } else {
                    arrayDeque.push(m33001d(list2));
                    arrayDeque.push(m33001d(list2));
                    list2.remove(list2.size() - 1);
                    list2.add(0);
                    list2.add(new CharStringCommand(12, 16));
                }
                while (dataInput.peekUnsignedByte(0) == 12 && dataInput.peekUnsignedByte(1) == 17) {
                    dataInput.readByte();
                    dataInput.readByte();
                    list2.add(arrayDeque.pop());
                }
                if (arrayDeque.size() > 0) {
                    Log.w("PdfBox-Android", "Value left on the PostScript stack in glyph " + this.f59337b + " of font " + this.f59336a);
                }
            } else if (readUnsignedByte >= 0 && readUnsignedByte <= 31) {
                list2.add(m33003b(dataInput, readUnsignedByte));
            } else if (readUnsignedByte >= 32 && readUnsignedByte <= 255) {
                list2.add(m33002c(dataInput, readUnsignedByte));
            } else {
                throw new IllegalArgumentException();
            }
        }
        return list2;
    }

    /* renamed from: b */
    public final CharStringCommand m33003b(DataInput dataInput, int i) {
        if (i == 12) {
            return new CharStringCommand(i, dataInput.readUnsignedByte());
        }
        return new CharStringCommand(i);
    }

    /* renamed from: c */
    public final Integer m33002c(DataInput dataInput, int i) {
        if (i >= 32 && i <= 246) {
            return Integer.valueOf(i - 139);
        }
        if (i >= 247 && i <= 250) {
            return Integer.valueOf(((i - 247) * 256) + dataInput.readUnsignedByte() + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
        } else if (i >= 251 && i <= 254) {
            return Integer.valueOf((((-(i - 251)) * 256) - dataInput.readUnsignedByte()) - 108);
        } else if (i == 255) {
            return Integer.valueOf(dataInput.readInt());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public List<Object> parse(byte[] bArr, List<byte[]> list) throws IOException {
        return m33004a(bArr, list, new ArrayList());
    }
}