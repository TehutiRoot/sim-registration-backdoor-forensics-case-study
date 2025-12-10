package com.google.android.gms.internal.firebase_ml;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzcuj uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class zzaav {
    public static final zzaav zzcuh;
    public static final zzaav zzcui;
    public static final zzaav zzcuj;
    public static final zzaav zzcuk;
    public static final zzaav zzcul;
    public static final zzaav zzcum;
    public static final zzaav zzcun;
    public static final zzaav zzcuo;
    public static final zzaav zzcup;
    public static final zzaav zzcuq;
    public static final zzaav zzcur;
    public static final zzaav zzcus;
    public static final zzaav zzcut;
    public static final zzaav zzcuu;
    public static final zzaav zzcuv;
    public static final zzaav zzcuw;
    public static final zzaav zzcux;
    public static final zzaav zzcuy;
    private static final /* synthetic */ zzaav[] zzcvb;
    private final zzaay zzcuz;
    private final int zzcva;

    static {
        zzaav zzaavVar = new zzaav("DOUBLE", 0, zzaay.DOUBLE, 1);
        zzcuh = zzaavVar;
        zzaav zzaavVar2 = new zzaav("FLOAT", 1, zzaay.FLOAT, 5);
        zzcui = zzaavVar2;
        zzaay zzaayVar = zzaay.LONG;
        zzaav zzaavVar3 = new zzaav("INT64", 2, zzaayVar, 0);
        zzcuj = zzaavVar3;
        zzaav zzaavVar4 = new zzaav("UINT64", 3, zzaayVar, 0);
        zzcuk = zzaavVar4;
        zzaay zzaayVar2 = zzaay.INT;
        zzaav zzaavVar5 = new zzaav("INT32", 4, zzaayVar2, 0);
        zzcul = zzaavVar5;
        zzaav zzaavVar6 = new zzaav("FIXED64", 5, zzaayVar, 1);
        zzcum = zzaavVar6;
        zzaav zzaavVar7 = new zzaav("FIXED32", 6, zzaayVar2, 5);
        zzcun = zzaavVar7;
        zzaav zzaavVar8 = new zzaav("BOOL", 7, zzaay.BOOLEAN, 0);
        zzcuo = zzaavVar8;
        final zzaay zzaayVar3 = zzaay.STRING;
        zzaav zzaavVar9 = new zzaav("STRING", 8, zzaayVar3, 2) { // from class: com.google.android.gms.internal.firebase_ml.zzaau
        };
        zzcup = zzaavVar9;
        final zzaay zzaayVar4 = zzaay.MESSAGE;
        zzaav zzaavVar10 = new zzaav("GROUP", 9, zzaayVar4, 3) { // from class: com.google.android.gms.internal.firebase_ml.zzaax
        };
        zzcuq = zzaavVar10;
        zzaav zzaavVar11 = new zzaav("MESSAGE", 10, zzaayVar4, 2) { // from class: com.google.android.gms.internal.firebase_ml.zzaaw
        };
        zzcur = zzaavVar11;
        final zzaay zzaayVar5 = zzaay.BYTE_STRING;
        zzaav zzaavVar12 = new zzaav("BYTES", 11, zzaayVar5, 2) { // from class: com.google.android.gms.internal.firebase_ml.zzaaz
        };
        zzcus = zzaavVar12;
        zzaav zzaavVar13 = new zzaav("UINT32", 12, zzaayVar2, 0);
        zzcut = zzaavVar13;
        zzaav zzaavVar14 = new zzaav("ENUM", 13, zzaay.ENUM, 0);
        zzcuu = zzaavVar14;
        zzaav zzaavVar15 = new zzaav("SFIXED32", 14, zzaayVar2, 5);
        zzcuv = zzaavVar15;
        zzaav zzaavVar16 = new zzaav("SFIXED64", 15, zzaayVar, 1);
        zzcuw = zzaavVar16;
        zzaav zzaavVar17 = new zzaav("SINT32", 16, zzaayVar2, 0);
        zzcux = zzaavVar17;
        zzaav zzaavVar18 = new zzaav("SINT64", 17, zzaayVar, 0);
        zzcuy = zzaavVar18;
        zzcvb = new zzaav[]{zzaavVar, zzaavVar2, zzaavVar3, zzaavVar4, zzaavVar5, zzaavVar6, zzaavVar7, zzaavVar8, zzaavVar9, zzaavVar10, zzaavVar11, zzaavVar12, zzaavVar13, zzaavVar14, zzaavVar15, zzaavVar16, zzaavVar17, zzaavVar18};
    }

    private zzaav(String str, int i, zzaay zzaayVar, int i2) {
        this.zzcuz = zzaayVar;
        this.zzcva = i2;
    }

    public static zzaav[] values() {
        return (zzaav[]) zzcvb.clone();
    }

    public final zzaay zzxu() {
        return this.zzcuz;
    }

    public final int zzxv() {
        return this.zzcva;
    }
}