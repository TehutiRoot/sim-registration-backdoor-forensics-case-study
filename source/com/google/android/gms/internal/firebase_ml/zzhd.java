package com.google.android.gms.internal.firebase_ml;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class zzhd {

    /* renamed from: a */
    public InputStream f45824a;

    /* renamed from: b */
    public final String f45825b;

    /* renamed from: c */
    public final String f45826c;

    /* renamed from: d */
    public final zzgz f45827d;

    /* renamed from: e */
    public zzhj f45828e;

    /* renamed from: f */
    public final int f45829f;

    /* renamed from: g */
    public final String f45830g;

    /* renamed from: h */
    public final zzhc f45831h;

    /* renamed from: i */
    public int f45832i;

    /* renamed from: j */
    public boolean f45833j;

    /* renamed from: k */
    public boolean f45834k;

    public zzhd(zzhc zzhcVar, zzhj zzhjVar) {
        StringBuilder sb;
        this.f45831h = zzhcVar;
        this.f45832i = zzhcVar.zzge();
        this.f45833j = zzhcVar.zzgf();
        this.f45828e = zzhjVar;
        this.f45825b = zzhjVar.getContentEncoding();
        int statusCode = zzhjVar.getStatusCode();
        boolean z = false;
        statusCode = statusCode < 0 ? 0 : statusCode;
        this.f45829f = statusCode;
        String reasonPhrase = zzhjVar.getReasonPhrase();
        this.f45830g = reasonPhrase;
        Logger logger = zzhh.f45840a;
        if (this.f45833j && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            String str = zzjt.zzajh;
            sb.append(str);
            String zzgp = zzhjVar.zzgp();
            if (zzgp != null) {
                sb.append(zzgp);
            } else {
                sb.append(statusCode);
                if (reasonPhrase != null) {
                    sb.append(TokenParser.f74560SP);
                    sb.append(reasonPhrase);
                }
            }
            sb.append(str);
        } else {
            sb = null;
        }
        zzhcVar.zzgh().zza(zzhjVar, z ? sb : null);
        String contentType = zzhjVar.getContentType();
        contentType = contentType == null ? zzhcVar.zzgh().getContentType() : contentType;
        this.f45826c = contentType;
        this.f45827d = m47909a(contentType);
        if (z) {
            logger.logp(Level.CONFIG, "com.google.api.client.http.HttpResponse", "<init>", sb.toString());
        }
    }

    /* renamed from: a */
    public static zzgz m47909a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new zzgz(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final Charset m47908b() {
        zzgz zzgzVar = this.f45827d;
        if (zzgzVar != null && zzgzVar.zzga() != null) {
            return this.f45827d.zzga();
        }
        return zziw.ISO_8859_1;
    }

    public final void disconnect() throws IOException {
        ignore();
        this.f45828e.disconnect();
    }

    public final InputStream getContent() throws IOException {
        if (!this.f45834k) {
            InputStream content = this.f45828e.getContent();
            if (content != null) {
                try {
                    String str = this.f45825b;
                    if (str != null && str.contains("gzip")) {
                        content = new GZIPInputStream(content);
                    }
                    Logger logger = zzhh.f45840a;
                    if (this.f45833j) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            content = new zzji(content, logger, level, this.f45832i);
                        }
                    }
                    this.f45824a = content;
                } catch (EOFException unused) {
                    content.close();
                } catch (Throwable th2) {
                    content.close();
                    throw th2;
                }
            }
            this.f45834k = true;
        }
        return this.f45824a;
    }

    public final String getContentType() {
        return this.f45826c;
    }

    public final int getStatusCode() {
        return this.f45829f;
    }

    public final String getStatusMessage() {
        return this.f45830g;
    }

    public final void ignore() throws IOException {
        InputStream content = getContent();
        if (content != null) {
            content.close();
        }
    }

    public final <T> T zza(Class<T> cls) throws IOException {
        int i = this.f45829f;
        if (!this.f45831h.getRequestMethod().equals("HEAD") && i / 100 != 1 && i != 204 && i != 304) {
            return (T) this.f45831h.zzgj().zza(getContent(), m47908b(), cls);
        }
        ignore();
        return null;
    }

    public final zzgx zzgg() {
        return this.f45831h.zzgh();
    }

    public final boolean zzgm() {
        int i = this.f45829f;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public final String zzgn() throws IOException {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zzml.checkNotNull(content);
            zzml.checkNotNull(byteArrayOutputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    content.close();
                    return byteArrayOutputStream.toString(m47908b().name());
                }
            }
        } catch (Throwable th2) {
            content.close();
            throw th2;
        }
    }
}
