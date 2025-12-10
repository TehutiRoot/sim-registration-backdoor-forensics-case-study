package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzcly uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzxe {
    private static final zzxe zzcly;
    private static final zzxe zzclz;
    private static final zzxe zzcma;
    private static final zzxe zzcmb;
    private static final zzxe zzcmc;
    private static final zzxe zzcmd;
    private static final zzxe zzcme;
    private static final zzxe zzcmf;
    private static final zzxe zzcmg;
    private static final zzxe zzcmh;
    private static final zzxe zzcmi;
    private static final zzxe zzcmj;
    private static final zzxe zzcmk;
    private static final zzxe zzcml;
    private static final zzxe zzcmm;
    private static final zzxe zzcmn;
    private static final zzxe zzcmo;
    private static final zzxe zzcmp;
    private static final zzxe zzcmq;
    private static final zzxe zzcmr;
    private static final zzxe zzcms;
    private static final zzxe zzcmt;
    private static final zzxe zzcmu;
    private static final zzxe zzcmv;
    private static final zzxe zzcmw;
    private static final zzxe zzcmx;
    private static final zzxe zzcmy;
    private static final zzxe zzcmz;
    private static final zzxe zzcna;
    private static final zzxe zzcnb;
    private static final zzxe zzcnc;
    private static final zzxe zzcnd;
    private static final zzxe zzcne;
    private static final zzxe zzcnf;
    private static final zzxe zzcng;
    public static final zzxe zzcnh;
    private static final zzxe zzcni;
    private static final zzxe zzcnj;
    private static final zzxe zzcnk;
    private static final zzxe zzcnl;
    private static final zzxe zzcnm;
    private static final zzxe zzcnn;
    private static final zzxe zzcno;
    private static final zzxe zzcnp;
    private static final zzxe zzcnq;
    private static final zzxe zzcnr;
    private static final zzxe zzcns;
    private static final zzxe zzcnt;
    public static final zzxe zzcnu;
    private static final zzxe zzcnv;
    private static final zzxe zzcnw;
    private static final zzxe[] zzcob;
    private static final Type[] zzcoc;
    private static final /* synthetic */ zzxe[] zzcod;

    /* renamed from: id */
    private final int f46106id;
    private final zzxu zzcnx;
    private final zzxg zzcny;
    private final Class<?> zzcnz;
    private final boolean zzcoa;

    static {
        zzxg zzxgVar = zzxg.SCALAR;
        zzxu zzxuVar = zzxu.zzcps;
        zzxe zzxeVar = new zzxe("DOUBLE", 0, 0, zzxgVar, zzxuVar);
        zzcly = zzxeVar;
        zzxu zzxuVar2 = zzxu.zzcpr;
        zzxe zzxeVar2 = new zzxe("FLOAT", 1, 1, zzxgVar, zzxuVar2);
        zzclz = zzxeVar2;
        zzxu zzxuVar3 = zzxu.zzcpq;
        zzxe zzxeVar3 = new zzxe("INT64", 2, 2, zzxgVar, zzxuVar3);
        zzcma = zzxeVar3;
        zzxe zzxeVar4 = new zzxe("UINT64", 3, 3, zzxgVar, zzxuVar3);
        zzcmb = zzxeVar4;
        zzxu zzxuVar4 = zzxu.zzcpp;
        zzxe zzxeVar5 = new zzxe("INT32", 4, 4, zzxgVar, zzxuVar4);
        zzcmc = zzxeVar5;
        zzxe zzxeVar6 = new zzxe("FIXED64", 5, 5, zzxgVar, zzxuVar3);
        zzcmd = zzxeVar6;
        zzxe zzxeVar7 = new zzxe("FIXED32", 6, 6, zzxgVar, zzxuVar4);
        zzcme = zzxeVar7;
        zzxu zzxuVar5 = zzxu.zzcpt;
        zzxe zzxeVar8 = new zzxe("BOOL", 7, 7, zzxgVar, zzxuVar5);
        zzcmf = zzxeVar8;
        zzxu zzxuVar6 = zzxu.zzcpu;
        zzxe zzxeVar9 = new zzxe("STRING", 8, 8, zzxgVar, zzxuVar6);
        zzcmg = zzxeVar9;
        zzxu zzxuVar7 = zzxu.zzcpx;
        zzxe zzxeVar10 = new zzxe("MESSAGE", 9, 9, zzxgVar, zzxuVar7);
        zzcmh = zzxeVar10;
        zzxu zzxuVar8 = zzxu.zzcpv;
        zzxe zzxeVar11 = new zzxe("BYTES", 10, 10, zzxgVar, zzxuVar8);
        zzcmi = zzxeVar11;
        zzxe zzxeVar12 = new zzxe("UINT32", 11, 11, zzxgVar, zzxuVar4);
        zzcmj = zzxeVar12;
        zzxu zzxuVar9 = zzxu.zzcpw;
        zzxe zzxeVar13 = new zzxe("ENUM", 12, 12, zzxgVar, zzxuVar9);
        zzcmk = zzxeVar13;
        zzxe zzxeVar14 = new zzxe("SFIXED32", 13, 13, zzxgVar, zzxuVar4);
        zzcml = zzxeVar14;
        zzxe zzxeVar15 = new zzxe("SFIXED64", 14, 14, zzxgVar, zzxuVar3);
        zzcmm = zzxeVar15;
        zzxe zzxeVar16 = new zzxe("SINT32", 15, 15, zzxgVar, zzxuVar4);
        zzcmn = zzxeVar16;
        zzxe zzxeVar17 = new zzxe("SINT64", 16, 16, zzxgVar, zzxuVar3);
        zzcmo = zzxeVar17;
        zzxe zzxeVar18 = new zzxe("GROUP", 17, 17, zzxgVar, zzxuVar7);
        zzcmp = zzxeVar18;
        zzxg zzxgVar2 = zzxg.VECTOR;
        zzxe zzxeVar19 = new zzxe("DOUBLE_LIST", 18, 18, zzxgVar2, zzxuVar);
        zzcmq = zzxeVar19;
        zzxe zzxeVar20 = new zzxe("FLOAT_LIST", 19, 19, zzxgVar2, zzxuVar2);
        zzcmr = zzxeVar20;
        zzxe zzxeVar21 = new zzxe("INT64_LIST", 20, 20, zzxgVar2, zzxuVar3);
        zzcms = zzxeVar21;
        zzxe zzxeVar22 = new zzxe("UINT64_LIST", 21, 21, zzxgVar2, zzxuVar3);
        zzcmt = zzxeVar22;
        zzxe zzxeVar23 = new zzxe("INT32_LIST", 22, 22, zzxgVar2, zzxuVar4);
        zzcmu = zzxeVar23;
        zzxe zzxeVar24 = new zzxe("FIXED64_LIST", 23, 23, zzxgVar2, zzxuVar3);
        zzcmv = zzxeVar24;
        zzxe zzxeVar25 = new zzxe("FIXED32_LIST", 24, 24, zzxgVar2, zzxuVar4);
        zzcmw = zzxeVar25;
        zzxe zzxeVar26 = new zzxe("BOOL_LIST", 25, 25, zzxgVar2, zzxuVar5);
        zzcmx = zzxeVar26;
        zzxe zzxeVar27 = new zzxe("STRING_LIST", 26, 26, zzxgVar2, zzxuVar6);
        zzcmy = zzxeVar27;
        zzxe zzxeVar28 = new zzxe("MESSAGE_LIST", 27, 27, zzxgVar2, zzxuVar7);
        zzcmz = zzxeVar28;
        zzxe zzxeVar29 = new zzxe("BYTES_LIST", 28, 28, zzxgVar2, zzxuVar8);
        zzcna = zzxeVar29;
        zzxe zzxeVar30 = new zzxe("UINT32_LIST", 29, 29, zzxgVar2, zzxuVar4);
        zzcnb = zzxeVar30;
        zzxe zzxeVar31 = new zzxe("ENUM_LIST", 30, 30, zzxgVar2, zzxuVar9);
        zzcnc = zzxeVar31;
        zzxe zzxeVar32 = new zzxe("SFIXED32_LIST", 31, 31, zzxgVar2, zzxuVar4);
        zzcnd = zzxeVar32;
        zzxe zzxeVar33 = new zzxe("SFIXED64_LIST", 32, 32, zzxgVar2, zzxuVar3);
        zzcne = zzxeVar33;
        zzxe zzxeVar34 = new zzxe("SINT32_LIST", 33, 33, zzxgVar2, zzxuVar4);
        zzcnf = zzxeVar34;
        zzxe zzxeVar35 = new zzxe("SINT64_LIST", 34, 34, zzxgVar2, zzxuVar3);
        zzcng = zzxeVar35;
        zzxg zzxgVar3 = zzxg.PACKED_VECTOR;
        zzxe zzxeVar36 = new zzxe("DOUBLE_LIST_PACKED", 35, 35, zzxgVar3, zzxuVar);
        zzcnh = zzxeVar36;
        zzxe zzxeVar37 = new zzxe("FLOAT_LIST_PACKED", 36, 36, zzxgVar3, zzxuVar2);
        zzcni = zzxeVar37;
        zzxe zzxeVar38 = new zzxe("INT64_LIST_PACKED", 37, 37, zzxgVar3, zzxuVar3);
        zzcnj = zzxeVar38;
        zzxe zzxeVar39 = new zzxe("UINT64_LIST_PACKED", 38, 38, zzxgVar3, zzxuVar3);
        zzcnk = zzxeVar39;
        zzxe zzxeVar40 = new zzxe("INT32_LIST_PACKED", 39, 39, zzxgVar3, zzxuVar4);
        zzcnl = zzxeVar40;
        zzxe zzxeVar41 = new zzxe("FIXED64_LIST_PACKED", 40, 40, zzxgVar3, zzxuVar3);
        zzcnm = zzxeVar41;
        zzxe zzxeVar42 = new zzxe("FIXED32_LIST_PACKED", 41, 41, zzxgVar3, zzxuVar4);
        zzcnn = zzxeVar42;
        zzxe zzxeVar43 = new zzxe("BOOL_LIST_PACKED", 42, 42, zzxgVar3, zzxuVar5);
        zzcno = zzxeVar43;
        zzxe zzxeVar44 = new zzxe("UINT32_LIST_PACKED", 43, 43, zzxgVar3, zzxuVar4);
        zzcnp = zzxeVar44;
        zzxe zzxeVar45 = new zzxe("ENUM_LIST_PACKED", 44, 44, zzxgVar3, zzxuVar9);
        zzcnq = zzxeVar45;
        zzxe zzxeVar46 = new zzxe("SFIXED32_LIST_PACKED", 45, 45, zzxgVar3, zzxuVar4);
        zzcnr = zzxeVar46;
        zzxe zzxeVar47 = new zzxe("SFIXED64_LIST_PACKED", 46, 46, zzxgVar3, zzxuVar3);
        zzcns = zzxeVar47;
        zzxe zzxeVar48 = new zzxe("SINT32_LIST_PACKED", 47, 47, zzxgVar3, zzxuVar4);
        zzcnt = zzxeVar48;
        zzxe zzxeVar49 = new zzxe("SINT64_LIST_PACKED", 48, 48, zzxgVar3, zzxuVar3);
        zzcnu = zzxeVar49;
        zzxe zzxeVar50 = new zzxe("GROUP_LIST", 49, 49, zzxgVar2, zzxuVar7);
        zzcnv = zzxeVar50;
        zzxe zzxeVar51 = new zzxe("MAP", 50, 50, zzxg.MAP, zzxu.zzcpo);
        zzcnw = zzxeVar51;
        zzcod = new zzxe[]{zzxeVar, zzxeVar2, zzxeVar3, zzxeVar4, zzxeVar5, zzxeVar6, zzxeVar7, zzxeVar8, zzxeVar9, zzxeVar10, zzxeVar11, zzxeVar12, zzxeVar13, zzxeVar14, zzxeVar15, zzxeVar16, zzxeVar17, zzxeVar18, zzxeVar19, zzxeVar20, zzxeVar21, zzxeVar22, zzxeVar23, zzxeVar24, zzxeVar25, zzxeVar26, zzxeVar27, zzxeVar28, zzxeVar29, zzxeVar30, zzxeVar31, zzxeVar32, zzxeVar33, zzxeVar34, zzxeVar35, zzxeVar36, zzxeVar37, zzxeVar38, zzxeVar39, zzxeVar40, zzxeVar41, zzxeVar42, zzxeVar43, zzxeVar44, zzxeVar45, zzxeVar46, zzxeVar47, zzxeVar48, zzxeVar49, zzxeVar50, zzxeVar51};
        zzcoc = new Type[0];
        zzxe[] values = values();
        zzcob = new zzxe[values.length];
        for (zzxe zzxeVar52 : values) {
            zzcob[zzxeVar52.f46106id] = zzxeVar52;
        }
    }

    private zzxe(String str, int i, int i2, zzxg zzxgVar, zzxu zzxuVar) {
        int i3;
        this.f46106id = i2;
        this.zzcny = zzxgVar;
        this.zzcnx = zzxuVar;
        int i4 = AbstractC6435F0.f45678a[zzxgVar.ordinal()];
        boolean z = true;
        if (i4 != 1) {
            if (i4 != 2) {
                this.zzcnz = null;
            } else {
                this.zzcnz = zzxuVar.zzvw();
            }
        } else {
            this.zzcnz = zzxuVar.zzvw();
        }
        this.zzcoa = (zzxgVar != zzxg.SCALAR || (i3 = AbstractC6435F0.f45679b[zzxuVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : false;
    }

    public static zzxe[] values() {
        return (zzxe[]) zzcod.clone();
    }

    /* renamed from: id */
    public final int m47431id() {
        return this.f46106id;
    }
}
