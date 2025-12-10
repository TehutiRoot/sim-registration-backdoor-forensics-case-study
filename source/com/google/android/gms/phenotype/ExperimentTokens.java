package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@KeepForSdk
@SafeParcelable.Class(creator = "ExperimentTokensCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class ExperimentTokens extends AbstractSafeParcelable {

    /* renamed from: i */
    public static final byte[][] f48490i;

    /* renamed from: j */
    public static final ExperimentTokens f48491j;

    /* renamed from: a */
    public final String f48496a;

    /* renamed from: b */
    public final byte[] f48497b;

    /* renamed from: c */
    public final byte[][] f48498c;

    /* renamed from: d */
    public final byte[][] f48499d;

    /* renamed from: e */
    public final byte[][] f48500e;

    /* renamed from: f */
    public final byte[][] f48501f;

    /* renamed from: g */
    public final int[] f48502g;

    /* renamed from: h */
    public final byte[][] f48503h;
    @KeepForSdk
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new zzh();

    /* renamed from: k */
    public static final InterfaceC6760a f48492k = new C6763a();

    /* renamed from: l */
    public static final InterfaceC6760a f48493l = new C6764b();

    /* renamed from: m */
    public static final InterfaceC6760a f48494m = new C6765c();

    /* renamed from: n */
    public static final InterfaceC6760a f48495n = new C6766d();

    /* renamed from: com.google.android.gms.phenotype.ExperimentTokens$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6760a {
    }

    static {
        byte[][] bArr = new byte[0];
        f48490i = bArr;
        f48491j = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
    }

    @SafeParcelable.Constructor
    public ExperimentTokens(@SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) byte[] bArr, @SafeParcelable.Param(m48388id = 4) byte[][] bArr2, @SafeParcelable.Param(m48388id = 5) byte[][] bArr3, @SafeParcelable.Param(m48388id = 6) byte[][] bArr4, @SafeParcelable.Param(m48388id = 7) byte[][] bArr5, @SafeParcelable.Param(m48388id = 8) int[] iArr, @SafeParcelable.Param(m48388id = 9) byte[][] bArr6) {
        this.f48496a = str;
        this.f48497b = bArr;
        this.f48498c = bArr2;
        this.f48499d = bArr3;
        this.f48500e = bArr4;
        this.f48501f = bArr5;
        this.f48502g = iArr;
        this.f48503h = bArr6;
    }

    /* renamed from: b */
    public static List m46080b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static List m46079d(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public static void m46078g(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = AbstractJsonLexerKt.NULL;
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(OperatorName.SHOW_TEXT_LINE);
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append(OperatorName.SHOW_TEXT_LINE);
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (zzn.m46059a(this.f48496a, experimentTokens.f48496a) && Arrays.equals(this.f48497b, experimentTokens.f48497b) && zzn.m46059a(m46079d(this.f48498c), m46079d(experimentTokens.f48498c)) && zzn.m46059a(m46079d(this.f48499d), m46079d(experimentTokens.f48499d)) && zzn.m46059a(m46079d(this.f48500e), m46079d(experimentTokens.f48500e)) && zzn.m46059a(m46079d(this.f48501f), m46079d(experimentTokens.f48501f)) && zzn.m46059a(m46080b(this.f48502g), m46080b(experimentTokens.f48502g)) && zzn.m46059a(m46079d(this.f48503h), m46079d(experimentTokens.f48503h))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.f48496a;
        if (str == null) {
            sb = AbstractJsonLexerKt.NULL;
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2);
            sb3.append(OperatorName.SHOW_TEXT_LINE);
            sb3.append(str);
            sb3.append(OperatorName.SHOW_TEXT_LINE);
            sb = sb3.toString();
        }
        sb2.append(sb);
        sb2.append(", ");
        byte[] bArr = this.f48497b;
        sb2.append("direct");
        sb2.append("=");
        if (bArr == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
        } else {
            sb2.append(OperatorName.SHOW_TEXT_LINE);
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append(OperatorName.SHOW_TEXT_LINE);
        }
        sb2.append(", ");
        m46078g(sb2, "GAIA", this.f48498c);
        sb2.append(", ");
        m46078g(sb2, "PSEUDO", this.f48499d);
        sb2.append(", ");
        m46078g(sb2, "ALWAYS", this.f48500e);
        sb2.append(", ");
        m46078g(sb2, "OTHER", this.f48501f);
        sb2.append(", ");
        int[] iArr = this.f48502g;
        sb2.append("weak");
        sb2.append("=");
        if (iArr == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(i2);
                i++;
                z = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        m46078g(sb2, "directs", this.f48503h);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48496a, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f48497b, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.f48498c, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.f48499d, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.f48500e, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f48501f, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.f48502g, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.f48503h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
