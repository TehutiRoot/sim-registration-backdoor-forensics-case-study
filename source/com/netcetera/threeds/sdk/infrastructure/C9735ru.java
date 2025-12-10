package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ru */
/* loaded from: classes5.dex */
public class C9735ru implements InterfaceC9732rq {
    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9688pd
    public boolean ThreeDS2ServiceInstance() {
        return true;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9732rq
    public byte[] valueOf(byte[] bArr) throws C9727rl {
        Inflater inflater = new Inflater(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
                try {
                    byte[] bArr2 = new byte[256];
                    while (true) {
                        int read = inflaterInputStream.read(bArr2);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            inflaterInputStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (IOException e) {
                throw new C9727rl("Problem decompressing data.", e);
            }
        } finally {
            inflater.end();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9732rq
    public byte[] ThreeDS2ServiceInstance(byte[] bArr) {
        Deflater deflater = new Deflater(8, true);
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                    deflaterOutputStream.write(bArr);
                    deflaterOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    deflaterOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (IOException e) {
                throw new C9734rt("Problem compressing data.", e);
            }
        } finally {
            deflater.end();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9688pd
    public String valueOf() {
        return "DEF";
    }
}
