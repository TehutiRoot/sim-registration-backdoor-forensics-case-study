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

/* renamed from: Dx2 */
/* loaded from: classes3.dex */
public final class Dx2 extends zzib {

    /* renamed from: c */
    public final zzth f1154c;

    /* renamed from: d */
    public final zzig f1155d;

    /* renamed from: e */
    public List f1156e = new ArrayList();

    /* renamed from: f */
    public zzih f1157f;

    /* renamed from: g */
    public String f1158g;

    public Dx2(zzig zzigVar, zzth zzthVar) {
        this.f1155d = zzigVar;
        this.f1154c = zzthVar;
        zzthVar.setLenient(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final void close() {
        this.f1154c.close();
    }

    /* renamed from: f */
    public final void m68573f() {
        boolean z;
        zzih zzihVar = this.f1157f;
        if (zzihVar != zzih.VALUE_NUMBER_INT && zzihVar != zzih.VALUE_NUMBER_FLOAT) {
            z = false;
        } else {
            z = true;
        }
        zzml.checkArgument(z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final int getIntValue() {
        m68573f();
        return Integer.parseInt(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final String getText() {
        return this.f1158g;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzhx zzhh() {
        return this.f1155d;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzih zzhi() {
        zztj zztjVar;
        zzih zzihVar;
        zzih zzihVar2 = this.f1157f;
        if (zzihVar2 != null) {
            int i = AbstractC23052xx2.f108580a[zzihVar2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f1154c.beginObject();
                    this.f1156e.add(null);
                }
            } else {
                this.f1154c.beginArray();
                this.f1156e.add(null);
            }
        }
        try {
            zztjVar = this.f1154c.zzrm();
        } catch (EOFException unused) {
            zztjVar = zztj.END_DOCUMENT;
        }
        switch (AbstractC23052xx2.f108581b[zztjVar.ordinal()]) {
            case 1:
                this.f1158g = "[";
                this.f1157f = zzih.START_ARRAY;
                break;
            case 2:
                this.f1158g = "]";
                this.f1157f = zzih.END_ARRAY;
                List list = this.f1156e;
                list.remove(list.size() - 1);
                this.f1154c.endArray();
                break;
            case 3:
                this.f1158g = "{";
                this.f1157f = zzih.START_OBJECT;
                break;
            case 4:
                this.f1158g = "}";
                this.f1157f = zzih.END_OBJECT;
                List list2 = this.f1156e;
                list2.remove(list2.size() - 1);
                this.f1154c.endObject();
                break;
            case 5:
                if (this.f1154c.nextBoolean()) {
                    this.f1158g = "true";
                    this.f1157f = zzih.VALUE_TRUE;
                    break;
                } else {
                    this.f1158g = "false";
                    this.f1157f = zzih.VALUE_FALSE;
                    break;
                }
            case 6:
                this.f1158g = AbstractJsonLexerKt.NULL;
                this.f1157f = zzih.VALUE_NULL;
                this.f1154c.nextNull();
                break;
            case 7:
                this.f1158g = this.f1154c.nextString();
                this.f1157f = zzih.VALUE_STRING;
                break;
            case 8:
                String nextString = this.f1154c.nextString();
                this.f1158g = nextString;
                if (nextString.indexOf(46) == -1) {
                    zzihVar = zzih.VALUE_NUMBER_INT;
                } else {
                    zzihVar = zzih.VALUE_NUMBER_FLOAT;
                }
                this.f1157f = zzihVar;
                break;
            case 9:
                this.f1158g = this.f1154c.nextName();
                this.f1157f = zzih.FIELD_NAME;
                List list3 = this.f1156e;
                list3.set(list3.size() - 1, this.f1158g);
                break;
            default:
                this.f1158g = null;
                this.f1157f = null;
                break;
        }
        return this.f1157f;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzih zzhj() {
        return this.f1157f;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final String zzhk() {
        if (this.f1156e.isEmpty()) {
            return null;
        }
        List list = this.f1156e;
        return (String) list.get(list.size() - 1);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final zzib zzhl() {
        zzih zzihVar = this.f1157f;
        if (zzihVar != null) {
            int i = AbstractC23052xx2.f108580a[zzihVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f1154c.skipValue();
                    this.f1158g = "}";
                    this.f1157f = zzih.END_OBJECT;
                }
            } else {
                this.f1154c.skipValue();
                this.f1158g = "]";
                this.f1157f = zzih.END_ARRAY;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final byte zzhm() {
        m68573f();
        return Byte.parseByte(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final short zzhn() {
        m68573f();
        return Short.parseShort(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final float zzho() {
        m68573f();
        return Float.parseFloat(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final long zzhp() {
        m68573f();
        return Long.parseLong(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final double zzhq() {
        m68573f();
        return Double.parseDouble(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final BigInteger zzhr() {
        m68573f();
        return new BigInteger(this.f1158g);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzib
    public final BigDecimal zzhs() {
        m68573f();
        return new BigDecimal(this.f1158g);
    }
}
