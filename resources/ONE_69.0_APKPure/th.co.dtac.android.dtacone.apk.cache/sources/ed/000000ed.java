package p000;

import com.google.android.gms.internal.firebase_ml.zzhx;
import com.google.android.gms.internal.firebase_ml.zzib;
import com.google.android.gms.internal.firebase_ml.zzig;
import com.google.android.gms.internal.firebase_ml.zzih;
import com.google.android.gms.internal.firebase_ml.zzml;
import com.google.android.gms.internal.firebase_ml.zzth;
import com.google.android.gms.internal.firebase_ml.zztj;
import java.io.EOFException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: Ay2 */
/* loaded from: classes3.dex */
public final class Ay2 extends zzib {

    /* renamed from: c */
    public final zzth f269c;

    /* renamed from: d */
    public final zzig f270d;

    /* renamed from: e */
    public List f271e = new ArrayList();

    /* renamed from: f */
    public zzih f272f;

    /* renamed from: g */
    public String f273g;

    public Ay2(zzig zzigVar, zzth zzthVar) {
        this.f270d = zzigVar;
        this.f269c = zzthVar;
        zzthVar.setLenient(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final void close() {
        this.f269c.close();
    }

    /* renamed from: f */
    public final void m69175f() {
        boolean z;
        zzih zzihVar = this.f272f;
        if (zzihVar != zzih.VALUE_NUMBER_INT && zzihVar != zzih.VALUE_NUMBER_FLOAT) {
            z = false;
        } else {
            z = true;
        }
        zzml.checkArgument(z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final int getIntValue() {
        m69175f();
        return Integer.parseInt(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final String getText() {
        return this.f273g;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzhx zzhh() {
        return this.f270d;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzih zzhi() {
        zztj zztjVar;
        zzih zzihVar;
        zzih zzihVar2 = this.f272f;
        if (zzihVar2 != null) {
            int i = AbstractC22606uy2.f107955a[zzihVar2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f269c.beginObject();
                    this.f271e.add(null);
                }
            } else {
                this.f269c.beginArray();
                this.f271e.add(null);
            }
        }
        try {
            zztjVar = this.f269c.zzrm();
        } catch (EOFException unused) {
            zztjVar = zztj.END_DOCUMENT;
        }
        switch (AbstractC22606uy2.f107956b[zztjVar.ordinal()]) {
            case 1:
                this.f273g = "[";
                this.f272f = zzih.START_ARRAY;
                break;
            case 2:
                this.f273g = "]";
                this.f272f = zzih.END_ARRAY;
                List list = this.f271e;
                list.remove(list.size() - 1);
                this.f269c.endArray();
                break;
            case 3:
                this.f273g = "{";
                this.f272f = zzih.START_OBJECT;
                break;
            case 4:
                this.f273g = "}";
                this.f272f = zzih.END_OBJECT;
                List list2 = this.f271e;
                list2.remove(list2.size() - 1);
                this.f269c.endObject();
                break;
            case 5:
                if (this.f269c.nextBoolean()) {
                    this.f273g = "true";
                    this.f272f = zzih.VALUE_TRUE;
                    break;
                } else {
                    this.f273g = "false";
                    this.f272f = zzih.VALUE_FALSE;
                    break;
                }
            case 6:
                this.f273g = AbstractJsonLexerKt.NULL;
                this.f272f = zzih.VALUE_NULL;
                this.f269c.nextNull();
                break;
            case 7:
                this.f273g = this.f269c.nextString();
                this.f272f = zzih.VALUE_STRING;
                break;
            case 8:
                String nextString = this.f269c.nextString();
                this.f273g = nextString;
                if (nextString.indexOf(46) == -1) {
                    zzihVar = zzih.VALUE_NUMBER_INT;
                } else {
                    zzihVar = zzih.VALUE_NUMBER_FLOAT;
                }
                this.f272f = zzihVar;
                break;
            case 9:
                this.f273g = this.f269c.nextName();
                this.f272f = zzih.FIELD_NAME;
                List list3 = this.f271e;
                list3.set(list3.size() - 1, this.f273g);
                break;
            default:
                this.f273g = null;
                this.f272f = null;
                break;
        }
        return this.f272f;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzih zzhj() {
        return this.f272f;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final String zzhk() {
        if (this.f271e.isEmpty()) {
            return null;
        }
        List list = this.f271e;
        return (String) list.get(list.size() - 1);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzib zzhl() {
        zzih zzihVar = this.f272f;
        if (zzihVar != null) {
            int i = AbstractC22606uy2.f107955a[zzihVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f269c.skipValue();
                    this.f273g = "}";
                    this.f272f = zzih.END_OBJECT;
                }
            } else {
                this.f269c.skipValue();
                this.f273g = "]";
                this.f272f = zzih.END_ARRAY;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final byte zzhm() {
        m69175f();
        return Byte.parseByte(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final short zzhn() {
        m69175f();
        return Short.parseShort(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final float zzho() {
        m69175f();
        return Float.parseFloat(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final long zzhp() {
        m69175f();
        return Long.parseLong(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final double zzhq() {
        m69175f();
        return Double.parseDouble(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final BigInteger zzhr() {
        m69175f();
        return new BigInteger(this.f273g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final BigDecimal zzhs() {
        m69175f();
        return new BigDecimal(this.f273g);
    }
}