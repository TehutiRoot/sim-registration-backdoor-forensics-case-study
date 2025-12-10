package com.azimolabs.maskformatter;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public class CharTransforms {

    /* renamed from: a */
    public static Map f41638a;

    /* renamed from: com.azimolabs.maskformatter.CharTransforms$a */
    /* loaded from: classes3.dex */
    public static class C5726a {

        /* renamed from: a */
        public Pattern f41639a;

        /* renamed from: b */
        public boolean f41640b;

        /* renamed from: c */
        public boolean f41641c;

        public C5726a(String str, boolean z, boolean z2) {
            this.f41639a = Pattern.compile(str);
            this.f41640b = z;
            this.f41641c = z2;
        }

        /* renamed from: a */
        public char m50638a(char c) {
            if (this.f41640b) {
                c = Character.toUpperCase(c);
            } else if (this.f41641c) {
                c = Character.toLowerCase(c);
            }
            Pattern pattern = this.f41639a;
            if (pattern.matcher(c + "").matches()) {
                return c;
            }
            throw new InvalidTextException();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f41638a = hashMap;
        hashMap.put('9', new C5726a("[0-9]", false, false));
        f41638a.put('8', new C5726a("[0-8]", false, false));
        f41638a.put('7', new C5726a("[0-7]", false, false));
        f41638a.put('6', new C5726a("[0-6]", false, false));
        f41638a.put('5', new C5726a("[0-5]", false, false));
        f41638a.put('4', new C5726a("[0-4]", false, false));
        f41638a.put('3', new C5726a("[0-3]", false, false));
        f41638a.put('2', new C5726a("[0-2]", false, false));
        f41638a.put('1', new C5726a("[0-1]", false, false));
        f41638a.put('0', new C5726a("[0]", false, false));
        f41638a.put('*', new C5726a(".", false, false));
        f41638a.put('W', new C5726a("\\W", false, false));
        f41638a.put('d', new C5726a("\\d", false, false));
        f41638a.put('D', new C5726a("\\D", false, false));
        f41638a.put('s', new C5726a("\\s", false, false));
        f41638a.put('S', new C5726a("\\S", false, false));
        f41638a.put('A', new C5726a("[A-Z]", true, false));
        f41638a.put('a', new C5726a("[a-z]", false, true));
        f41638a.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), new C5726a("[A-ZÇÀÁÂÃÈÉÊẼÌÍÎĨÒÓÔÕÙÚÛŨ]", true, false));
        f41638a.put('z', new C5726a("[a-zçáàãâéèêẽíìĩîóòôõúùũüû]", false, true));
        f41638a.put('@', new C5726a("[a-zA-Z]", false, false));
        f41638a.put('#', new C5726a("[A-Za-zçáàãâéèêẽíìĩîóòôõúùũüûÇÀÁÂÃÈÉÊẼÌÍÎĨÒÓÔÕÙÚÛŨ]", false, false));
        f41638a.put(Character.valueOf(CoreConstants.PERCENT_CHAR), new C5726a("[A-Z0-9]", true, false));
        f41638a.put('w', new C5726a("\\w", false, false));
        f41638a.put('X', new C5726a("[[0-9]X]", false, false));
    }

    public static char transformChar(char c, char c2) throws InvalidTextException {
        C5726a c5726a = (C5726a) f41638a.get(Character.valueOf(c2));
        if (c5726a == null) {
            return c;
        }
        return c5726a.m50638a(c);
    }
}
