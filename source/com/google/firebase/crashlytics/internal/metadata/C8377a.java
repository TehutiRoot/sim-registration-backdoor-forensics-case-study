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
public class C8377a implements InterfaceC11541jX {

    /* renamed from: d */
    public static final Charset f54930d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f54931a;

    /* renamed from: b */
    public final int f54932b;

    /* renamed from: c */
    public QueueFile f54933c;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.a$a */
    /* loaded from: classes4.dex */
    public class C8378a implements QueueFile.ElementReader {

        /* renamed from: a */
        public final /* synthetic */ byte[] f54934a;

        /* renamed from: b */
        public final /* synthetic */ int[] f54935b;

        public C8378a(byte[] bArr, int[] iArr) {
            this.f54934a = bArr;
            this.f54935b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f54934a, this.f54935b[0], i);
                int[] iArr = this.f54935b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.a$b */
    /* loaded from: classes4.dex */
    public static class C8379b {

        /* renamed from: a */
        public final byte[] f54937a;

        /* renamed from: b */
        public final int f54938b;

        public C8379b(byte[] bArr, int i) {
            this.f54937a = bArr;
            this.f54938b = i;
        }
    }

    public C8377a(File file, int i) {
        this.f54931a = file;
        this.f54932b = i;
    }

    @Override // p000.InterfaceC11541jX
    /* renamed from: a */
    public byte[] mo29205a() {
        C8379b m38901g = m38901g();
        if (m38901g == null) {
            return null;
        }
        int i = m38901g.f54938b;
        byte[] bArr = new byte[i];
        System.arraycopy(m38901g.f54937a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // p000.InterfaceC11541jX
    /* renamed from: b */
    public void mo29204b() {
        mo29202d();
        this.f54931a.delete();
    }

    @Override // p000.InterfaceC11541jX
    /* renamed from: c */
    public void mo29203c(long j, String str) {
        m38900h();
        m38902f(j, str);
    }

    @Override // p000.InterfaceC11541jX
    /* renamed from: d */
    public void mo29202d() {
        CommonUtils.closeOrLog(this.f54933c, "There was a problem closing the Crashlytics log file.");
        this.f54933c = null;
    }

    @Override // p000.InterfaceC11541jX
    /* renamed from: e */
    public String mo29201e() {
        byte[] mo29205a = mo29205a();
        if (mo29205a != null) {
            return new String(mo29205a, f54930d);
        }
        return null;
    }

    /* renamed from: f */
    public final void m38902f(long j, String str) {
        int i;
        if (this.f54933c == null) {
            return;
        }
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        try {
            if (str.length() > this.f54932b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f54933c.m38937j(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).replaceAll("\n", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR)).getBytes(f54930d));
            while (!this.f54933c.m38932o() && this.f54933c.m38921z() > this.f54932b) {
                this.f54933c.m38925v();
            }
        } catch (IOException e) {
            Logger.getLogger().m39137e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* renamed from: g */
    public final C8379b m38901g() {
        if (!this.f54931a.exists()) {
            return null;
        }
        m38900h();
        QueueFile queueFile = this.f54933c;
        if (queueFile == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[queueFile.m38921z()];
        try {
            this.f54933c.m38934m(new C8378a(bArr, iArr));
        } catch (IOException e) {
            Logger.getLogger().m39137e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C8379b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void m38900h() {
        if (this.f54933c == null) {
            try {
                this.f54933c = new QueueFile(this.f54931a);
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                logger.m39137e("Could not open log file: " + this.f54931a, e);
            }
        }
    }
}
