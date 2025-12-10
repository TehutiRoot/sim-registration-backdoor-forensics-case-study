package com.google.android.gms.internal.firebase_ml;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzcpp uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzxu {
    public static final zzxu zzcpo;
    public static final zzxu zzcpp;
    public static final zzxu zzcpq;
    public static final zzxu zzcpr;
    public static final zzxu zzcps;
    public static final zzxu zzcpt;
    public static final zzxu zzcpu;
    public static final zzxu zzcpv;
    public static final zzxu zzcpw;
    public static final zzxu zzcpx;
    private static final /* synthetic */ zzxu[] zzcqb;
    private final Class<?> zzcpy;
    private final Class<?> zzcpz;
    private final Object zzcqa;

    static {
        zzxu zzxuVar = new zzxu("VOID", 0, Void.class, Void.class, null);
        zzcpo = zzxuVar;
        Class cls = Integer.TYPE;
        zzxu zzxuVar2 = new zzxu("INT", 1, cls, Integer.class, 0);
        zzcpp = zzxuVar2;
        zzxu zzxuVar3 = new zzxu("LONG", 2, Long.TYPE, Long.class, 0L);
        zzcpq = zzxuVar3;
        zzxu zzxuVar4 = new zzxu("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzcpr = zzxuVar4;
        zzxu zzxuVar5 = new zzxu("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zzcps = zzxuVar5;
        zzxu zzxuVar6 = new zzxu("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzcpt = zzxuVar6;
        zzxu zzxuVar7 = new zzxu("STRING", 6, String.class, String.class, "");
        zzcpu = zzxuVar7;
        zzxu zzxuVar8 = new zzxu("BYTE_STRING", 7, zzwd.class, zzwd.class, zzwd.zzcks);
        zzcpv = zzxuVar8;
        zzxu zzxuVar9 = new zzxu("ENUM", 8, cls, Integer.class, null);
        zzcpw = zzxuVar9;
        zzxu zzxuVar10 = new zzxu("MESSAGE", 9, Object.class, Object.class, null);
        zzcpx = zzxuVar10;
        zzcqb = new zzxu[]{zzxuVar, zzxuVar2, zzxuVar3, zzxuVar4, zzxuVar5, zzxuVar6, zzxuVar7, zzxuVar8, zzxuVar9, zzxuVar10};
    }

    private zzxu(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzcpy = cls;
        this.zzcpz = cls2;
        this.zzcqa = obj;
    }

    public static zzxu[] values() {
        return (zzxu[]) zzcqb.clone();
    }

    public final Class<?> zzvw() {
        return this.zzcpz;
    }
}
