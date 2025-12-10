package com.google.android.gms.internal.firebase_ml;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzho extends zzgq {

    /* renamed from: c */
    public Object f45847c;

    public zzho(Object obj) {
        super(zzhn.MEDIA_TYPE);
        this.f45847c = zzml.checkNotNull(obj);
    }

    /* renamed from: a */
    public static boolean m47904a(boolean z, Writer writer, String str, Object obj) {
        String obj2;
        if (obj != null && !zzix.isNull(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            if (obj instanceof Enum) {
                obj2 = zzjd.zza((Enum) obj).getName();
            } else {
                obj2 = obj.toString();
            }
            String zzaq = zzjw.zzaq(obj2);
            if (zzaq.length() != 0) {
                writer.write("=");
                writer.write(zzaq);
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjq
    public final void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, zzfy()));
        boolean z = true;
        for (Map.Entry<String, Object> entry : zzix.zzf(this.f45847c).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String zzaq = zzjw.zzaq(entry.getKey());
                Class<?> cls = value.getClass();
                if (!(value instanceof Iterable) && !cls.isArray()) {
                    z = m47904a(z, bufferedWriter, zzaq, value);
                } else {
                    for (Object obj : zzjs.zzi(value)) {
                        z = m47904a(z, bufferedWriter, zzaq, obj);
                    }
                }
            }
        }
        bufferedWriter.flush();
    }
}
