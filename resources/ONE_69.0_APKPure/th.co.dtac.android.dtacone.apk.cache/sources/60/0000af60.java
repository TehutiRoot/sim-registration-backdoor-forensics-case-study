package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.a */
/* loaded from: classes4.dex */
public class C8366a implements InterfaceC12361nX {

    /* renamed from: d */
    public static final Charset f54942d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f54943a;

    /* renamed from: b */
    public final int f54944b;

    /* renamed from: c */
    public QueueFile f54945c;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.a$a */
    /* loaded from: classes4.dex */
    public class C8367a implements QueueFile.ElementReader {

        /* renamed from: a */
        public final /* synthetic */ byte[] f54946a;

        /* renamed from: b */
        public final /* synthetic */ int[] f54947b;

        public C8367a(byte[] bArr, int[] iArr) {
            this.f54946a = bArr;
            this.f54947b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f54946a, this.f54947b[0], i);
                int[] iArr = this.f54947b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.a$b */
    /* loaded from: classes4.dex */
    public static class C8368b {

        /* renamed from: a */
        public final byte[] f54949a;

        /* renamed from: b */
        public final int f54950b;

        public C8368b(byte[] bArr, int i) {
            this.f54949a = bArr;
            this.f54950b = i;
        }
    }

    public C8366a(File file, int i) {
        this.f54943a = file;
        this.f54944b = i;
    }

    @Override // p000.InterfaceC12361nX
    /* renamed from: a */
    public byte[] mo26382a() {
        C8368b m38893g = m38893g();
        if (m38893g == null) {
            return null;
        }
        int i = m38893g.f54950b;
        byte[] bArr = new byte[i];
        System.arraycopy(m38893g.f54949a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // p000.InterfaceC12361nX
    /* renamed from: b */
    public void mo26381b() {
        mo26379d();
        this.f54943a.delete();
    }

    @Override // p000.InterfaceC12361nX
    /* renamed from: c */
    public void mo26380c(long j, String str) {
        m38892h();
        m38894f(j, str);
    }

    @Override // p000.InterfaceC12361nX
    /* renamed from: d */
    public void mo26379d() {
        CommonUtils.closeOrLog(this.f54945c, "There was a problem closing the Crashlytics log file.");
        this.f54945c = null;
    }

    @Override // p000.InterfaceC12361nX
    /* renamed from: e */
    public String mo26378e() {
        byte[] mo26382a = mo26382a();
        if (mo26382a != null) {
            return new String(mo26382a, f54942d);
        }
        return null;
    }

    /* renamed from: f */
    public final void m38894f(long j, String str) {
        int i;
        if (this.f54945c == null) {
            return;
        }
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        try {
            if (str.length() > this.f54944b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f54945c.m38929j(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).replaceAll("\n", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)).getBytes(f54942d));
            while (!this.f54945c.m38924o() && this.f54945c.m38913z() > this.f54944b) {
                this.f54945c.m38917v();
            }
        } catch (IOException e) {
            Logger.getLogger().m39129e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* renamed from: g */
    public final C8368b m38893g() {
        if (!this.f54943a.exists()) {
            return null;
        }
        m38892h();
        QueueFile queueFile = this.f54945c;
        if (queueFile == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[queueFile.m38913z()];
        try {
            this.f54945c.m38926m(new C8367a(bArr, iArr));
        } catch (IOException e) {
            Logger.getLogger().m39129e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C8368b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void m38892h() {
        if (this.f54945c == null) {
            try {
                this.f54945c = new QueueFile(this.f54943a);
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                logger.m39129e("Could not open log file: " + this.f54943a, e);
            }
        }
    }
}