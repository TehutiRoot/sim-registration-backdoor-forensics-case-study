package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.type1.Type1CharStringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class Type2CharString extends Type1CharString {

    /* renamed from: j */
    public float f59326j;

    /* renamed from: k */
    public float f59327k;

    /* renamed from: l */
    public int f59328l;

    /* renamed from: m */
    public final List f59329m;

    /* renamed from: n */
    public final int f59330n;

    /* renamed from: com.tom_roush.fontbox.cff.Type2CharString$a */
    /* loaded from: classes5.dex */
    public class C9868a extends CharStringHandler {
        public C9868a() {
        }

        @Override // com.tom_roush.fontbox.cff.CharStringHandler
        public List handleCommand(List list, CharStringCommand charStringCommand) {
            return Type2CharString.this.m33006d(list, charStringCommand);
        }
    }

    public Type2CharString(Type1CharStringReader type1CharStringReader, String str, String str2, int i, List<Object> list, int i2, int i3) {
        super(type1CharStringReader, str, str2);
        this.f59328l = 0;
        this.f59330n = i;
        this.f59329m = list;
        this.f59326j = i2;
        this.f59327k = i3;
        m33000p(list);
    }

    /* renamed from: v */
    public static List m32994v(List list, int i) {
        int size = list.size() / i;
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 * i;
            i2++;
            arrayList.add(list.subList(i3, i2 * i));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List m33006d(List list, CharStringCommand charStringCommand) {
        Number valueOf;
        Number number;
        boolean z = true;
        this.commandCount++;
        String str = CharStringCommand.TYPE2_VOCABULARY.get(charStringCommand.getKey());
        boolean z2 = false;
        if ("hstem".equals(str)) {
            if (list.size() % 2 != 0) {
                z2 = true;
            }
            m32996t(m33002n(list, z2), true);
            return null;
        } else if ("vstem".equals(str)) {
            if (list.size() % 2 == 0) {
                z = false;
            }
            m32996t(m33002n(list, z), false);
            return null;
        } else if ("vmoveto".equals(str)) {
            if (list.size() <= 1) {
                z = false;
            }
            List m33002n = m33002n(list, z);
            m32995u();
            m33004l(m33002n, charStringCommand);
            return null;
        } else if ("rlineto".equals(str)) {
            m33003m(m32994v(list, 2), charStringCommand);
            return null;
        } else if ("hlineto".equals(str)) {
            m32998r(list, true);
            return null;
        } else if ("vlineto".equals(str)) {
            m32998r(list, false);
            return null;
        } else if ("rrcurveto".equals(str)) {
            m33003m(m32994v(list, 6), charStringCommand);
            return null;
        } else if ("endchar".equals(str)) {
            if (list.size() != 5 && list.size() != 1) {
                z = false;
            }
            List m33002n2 = m33002n(list, z);
            m33001o();
            if (m33002n2.size() == 4) {
                m33002n2.add(0, 0);
                m33004l(m33002n2, new CharStringCommand(12, 6));
                return null;
            }
            m33004l(m33002n2, charStringCommand);
            return null;
        } else if ("rmoveto".equals(str)) {
            if (list.size() <= 2) {
                z = false;
            }
            List m33002n3 = m33002n(list, z);
            m32995u();
            m33004l(m33002n3, charStringCommand);
            return null;
        } else if ("hmoveto".equals(str)) {
            if (list.size() <= 1) {
                z = false;
            }
            List m33002n4 = m33002n(list, z);
            m32995u();
            m33004l(m33002n4, charStringCommand);
            return null;
        } else if ("vhcurveto".equals(str)) {
            m32999q(list, false);
            return null;
        } else if ("hvcurveto".equals(str)) {
            m32999q(list, true);
            return null;
        } else if ("hflex".equals(str)) {
            m33003m(Arrays.asList(Arrays.asList((Number) list.get(0), 0, (Number) list.get(1), (Number) list.get(2), (Number) list.get(3), 0), Arrays.asList((Number) list.get(4), 0, (Number) list.get(5), Float.valueOf(-((Number) list.get(2)).floatValue()), (Number) list.get(6), 0)), new CharStringCommand(8));
            return null;
        } else if ("flex".equals(str)) {
            m33003m(Arrays.asList(list.subList(0, 6), list.subList(6, 12)), new CharStringCommand(8));
            return null;
        } else if ("hflex1".equals(str)) {
            m33003m(Arrays.asList(Arrays.asList((Number) list.get(0), (Number) list.get(1), (Number) list.get(2), (Number) list.get(3), (Number) list.get(4), 0), Arrays.asList((Number) list.get(5), 0, (Number) list.get(6), (Number) list.get(7), (Number) list.get(8), 0)), new CharStringCommand(8));
            return null;
        } else if ("flex1".equals(str)) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                i += ((Number) list.get(i4)).intValue();
                i2 += ((Number) list.get(i4 + 1)).intValue();
            }
            List subList = list.subList(0, 6);
            Number number2 = (Number) list.get(6);
            Number number3 = (Number) list.get(7);
            Number number4 = (Number) list.get(8);
            Number number5 = (Number) list.get(9);
            if (Math.abs(i) > Math.abs(i2)) {
                valueOf = (Number) list.get(10);
            } else {
                valueOf = Integer.valueOf(-i);
            }
            if (Math.abs(i) > Math.abs(i2)) {
                number = Integer.valueOf(-i2);
            } else {
                number = (Number) list.get(10);
            }
            m33003m(Arrays.asList(subList, Arrays.asList(number2, number3, number4, number5, valueOf, number)), new CharStringCommand(8));
            return null;
        } else if ("hstemhm".equals(str)) {
            if (list.size() % 2 != 0) {
                z2 = true;
            }
            m32996t(m33002n(list, z2), true);
            return null;
        } else if (!"hintmask".equals(str) && !"cntrmask".equals(str)) {
            if ("vstemhm".equals(str)) {
                if (list.size() % 2 == 0) {
                    z = false;
                }
                m32996t(m33002n(list, z), false);
                return null;
            } else if ("rcurveline".equals(str)) {
                if (list.size() >= 2) {
                    m33003m(m32994v(list.subList(0, list.size() - 2), 6), new CharStringCommand(8));
                    m33004l(list.subList(list.size() - 2, list.size()), new CharStringCommand(5));
                    return null;
                }
                return null;
            } else if ("rlinecurve".equals(str)) {
                if (list.size() >= 6) {
                    m33003m(m32994v(list.subList(0, list.size() - 6), 2), new CharStringCommand(5));
                    m33004l(list.subList(list.size() - 6, list.size()), new CharStringCommand(8));
                    return null;
                }
                return null;
            } else if ("vvcurveto".equals(str)) {
                m32997s(list, false);
                return null;
            } else if ("hhcurveto".equals(str)) {
                m32997s(list, true);
                return null;
            } else {
                m33004l(list, charStringCommand);
                return null;
            }
        } else {
            if (list.size() % 2 == 0) {
                z = false;
            }
            List m33002n5 = m33002n(list, z);
            if (!m33002n5.isEmpty()) {
                m32996t(m33002n5, false);
                return null;
            }
            return null;
        }
    }

    public int getGID() {
        return this.f59330n;
    }

    public List<Object> getType2Sequence() {
        return this.f59329m;
    }

    /* renamed from: l */
    public final void m33004l(List list, CharStringCommand charStringCommand) {
        this.type1Sequence.addAll(list);
        this.type1Sequence.add(charStringCommand);
    }

    /* renamed from: m */
    public final void m33003m(List list, CharStringCommand charStringCommand) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m33004l((List) it.next(), charStringCommand);
        }
    }

    /* renamed from: n */
    public final List m33002n(List list, boolean z) {
        if (this.type1Sequence.isEmpty()) {
            if (z) {
                m33004l(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(((Number) list.get(0)).floatValue() + this.f59327k)), new CharStringCommand(13));
                return list.subList(1, list.size());
            }
            m33004l(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(this.f59326j)), new CharStringCommand(13));
            return list;
        }
        return list;
    }

    /* renamed from: o */
    public final void m33001o() {
        CharStringCommand charStringCommand;
        if (this.f59328l > 0) {
            List<Object> list = this.type1Sequence;
            charStringCommand = (CharStringCommand) list.get(list.size() - 1);
        } else {
            charStringCommand = null;
        }
        CharStringCommand charStringCommand2 = new CharStringCommand(9);
        if (charStringCommand != null && !charStringCommand2.equals(charStringCommand)) {
            m33004l(Collections.emptyList(), charStringCommand2);
        }
    }

    /* renamed from: p */
    public final void m33000p(List list) {
        this.type1Sequence = new ArrayList();
        this.f59328l = 0;
        new C9868a().handleSequence(list);
    }

    /* renamed from: q */
    public final void m32999q(List list, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4 = 5;
        List list2 = list;
        boolean z3 = z;
        while (list2.size() >= 4) {
            if (list2.size() == i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3) {
                Number number = (Number) list2.get(0);
                Number number2 = (Number) list2.get(1);
                Number number3 = (Number) list2.get(2);
                if (z2) {
                    i3 = (Number) list2.get(4);
                } else {
                    i3 = 0;
                }
                Number[] numberArr = new Number[6];
                numberArr[0] = number;
                numberArr[1] = 0;
                numberArr[2] = number2;
                numberArr[3] = number3;
                numberArr[4] = i3;
                numberArr[i4] = (Number) list2.get(3);
                m33004l(Arrays.asList(numberArr), new CharStringCommand(8));
            } else {
                Number number4 = (Number) list2.get(0);
                Number number5 = (Number) list2.get(1);
                Number number6 = (Number) list2.get(2);
                Number number7 = (Number) list2.get(3);
                if (z2) {
                    i = (Number) list2.get(4);
                } else {
                    i = 0;
                }
                m33004l(Arrays.asList(0, number4, number5, number6, number7, i), new CharStringCommand(8));
            }
            if (z2) {
                i2 = 5;
            } else {
                i2 = 4;
            }
            list2 = list2.subList(i2, list2.size());
            z3 = !z3;
            i4 = 5;
        }
    }

    /* renamed from: r */
    public final void m32998r(List list, boolean z) {
        int i;
        while (!list.isEmpty()) {
            List subList = list.subList(0, 1);
            if (z) {
                i = 6;
            } else {
                i = 7;
            }
            m33004l(subList, new CharStringCommand(i));
            list = list.subList(1, list.size());
            z = !z;
        }
    }

    /* renamed from: s */
    public final void m32997s(List list, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char c = 5;
        List list2 = list;
        while (list2.size() >= 4) {
            if (list2.size() % 4 == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (z) {
                Number number = (Number) list2.get(i);
                if (i != 0) {
                    i7 = (Number) list2.get(0);
                } else {
                    i7 = 0;
                }
                if (i != 0) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                Number number2 = (Number) list2.get(i8);
                if (i != 0) {
                    i9 = 3;
                } else {
                    i9 = 2;
                }
                Number number3 = (Number) list2.get(i9);
                if (i != 0) {
                    i10 = 4;
                } else {
                    i10 = 3;
                }
                Number[] numberArr = new Number[6];
                numberArr[0] = number;
                numberArr[1] = i7;
                numberArr[2] = number2;
                numberArr[3] = number3;
                numberArr[4] = (Number) list2.get(i10);
                numberArr[c] = 0;
                m33004l(Arrays.asList(numberArr), new CharStringCommand(8));
            } else {
                if (i != 0) {
                    i2 = (Number) list2.get(0);
                } else {
                    i2 = 0;
                }
                Number number4 = (Number) list2.get(i);
                if (i != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                Number number5 = (Number) list2.get(i3);
                if (i != 0) {
                    i4 = 3;
                } else {
                    i4 = 2;
                }
                Number number6 = (Number) list2.get(i4);
                if (i != 0) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                m33004l(Arrays.asList(i2, number4, number5, number6, 0, (Number) list2.get(i5)), new CharStringCommand(8));
            }
            if (i != 0) {
                i6 = 5;
            } else {
                i6 = 4;
            }
            list2 = list2.subList(i6, list2.size());
            c = 5;
        }
    }

    /* renamed from: t */
    public final void m32996t(List list, boolean z) {
    }

    /* renamed from: u */
    public final void m32995u() {
        if (this.f59328l > 0) {
            m33001o();
        }
        this.f59328l++;
    }
}
