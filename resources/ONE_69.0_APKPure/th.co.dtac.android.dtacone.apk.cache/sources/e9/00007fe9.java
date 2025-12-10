package com.azimolabs.maskformatter;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public class CharTransforms {

    /* renamed from: a */
    public static Map f41650a;

    /* renamed from: com.azimolabs.maskformatter.CharTransforms$a */
    /* loaded from: classes3.dex */
    public static class C5715a {

        /* renamed from: a */
        public Pattern f41651a;

        /* renamed from: b */
        public boolean f41652b;

        /* renamed from: c */
        public boolean f41653c;

        public C5715a(String str, boolean z, boolean z2) {
            this.f41651a = Pattern.compile(str);
            this.f41652b = z;
            this.f41653c = z2;
        }

        /* renamed from: a */
        public char m50635a(char c) {
            if (this.f41652b) {
                c = Character.toUpperCase(c);
            } else if (this.f41653c) {
                c = Character.toLowerCase(c);
            }
            Pattern pattern = this.f41651a;
            if (pattern.matcher(c + "").matches()) {
                return c;
            }
            throw new InvalidTextException();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f41650a = hashMap;
        hashMap.put('9', new C5715a("[0-9]", false, false));
        f41650a.put('8', new C5715a("[0-8]", false, false));
        f41650a.put('7', new C5715a("[0-7]", false, false));
        f41650a.put('6', new C5715a("[0-6]", false, false));
        f41650a.put('5', new C5715a("[0-5]", false, false));
        f41650a.put('4', new C5715a("[0-4]", false, false));
        f41650a.put('3', new C5715a("[0-3]", false, false));
        f41650a.put('2', new C5715a("[0-2]", false, false));
        f41650a.put('1', new C5715a("[0-1]", false, false));
        f41650a.put('0', new C5715a("[0]", false, false));
        f41650a.put('*', new C5715a(".", false, false));
        f41650a.put('W', new C5715a("\\W", false, false));
        f41650a.put('d', new C5715a("\\d", false, false));
        f41650a.put('D', new C5715a("\\D", false, false));
        f41650a.put('s', new C5715a("\\s", false, false));
        f41650a.put('S', new C5715a("\\S", false, false));
        f41650a.put('A', new C5715a("[A-Z]", true, false));
        f41650a.put('a', new C5715a("[a-z]", false, true));
        f41650a.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), new C5715a("[A-ZÇÀÁÂÃÈÉÊẼÌÍÎĨÒÓÔÕÙÚÛŨ]", true, false));
        f41650a.put('z', new C5715a("[a-zçáàãâéèêẽíìĩîóòôõúùũüû]", false, true));
        f41650a.put('@', new C5715a("[a-zA-Z]", false, false));
        f41650a.put('#', new C5715a("[A-Za-zçáàãâéèêẽíìĩîóòôõúùũüûÇÀÁÂÃÈÉÊẼÌÍÎĨÒÓÔÕÙÚÛŨ]", false, false));
        f41650a.put(Character.valueOf(CoreConstants.PERCENT_CHAR), new C5715a("[A-Z0-9]", true, false));
        f41650a.put('w', new C5715a("\\w", false, false));
        f41650a.put('X', new C5715a("[[0-9]X]", false, false));
    }

    public static char transformChar(char c, char c2) throws InvalidTextException {
        C5715a c5715a = (C5715a) f41650a.get(Character.valueOf(c2));
        if (c5715a == null) {
            return c;
        }
        return c5715a.m50635a(c);
    }
}