package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* loaded from: classes4.dex */
public class LogFileManager {

    /* renamed from: c */
    public static final C8372b f54898c = new C8372b();

    /* renamed from: a */
    public final FileStore f54899a;

    /* renamed from: b */
    public InterfaceC11541jX f54900b;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.LogFileManager$b */
    /* loaded from: classes4.dex */
    public static final class C8372b implements InterfaceC11541jX {
        public C8372b() {
        }

        @Override // p000.InterfaceC11541jX
        /* renamed from: a */
        public byte[] mo29205a() {
            return null;
        }

        @Override // p000.InterfaceC11541jX
        /* renamed from: b */
        public void mo29204b() {
        }

        @Override // p000.InterfaceC11541jX
        /* renamed from: c */
        public void mo29203c(long j, String str) {
        }

        @Override // p000.InterfaceC11541jX
        /* renamed from: d */
        public void mo29202d() {
        }

        @Override // p000.InterfaceC11541jX
        /* renamed from: e */
        public String mo29201e() {
            return null;
        }
    }

    public LogFileManager(FileStore fileStore) {
        this.f54899a = fileStore;
        this.f54900b = f54898c;
    }

    /* renamed from: a */
    public final File m38947a(String str) {
        return this.f54899a.getSessionFile(str, "userlog");
    }

    /* renamed from: b */
    public void m38946b(File file, int i) {
        this.f54900b = new C8377a(file, i);
    }

    public void clearLog() {
        this.f54900b.mo29204b();
    }

    public byte[] getBytesForLog() {
        return this.f54900b.mo29205a();
    }

    @Nullable
    public String getLogString() {
        return this.f54900b.mo29201e();
    }

    public final void setCurrentSession(String str) {
        this.f54900b.mo29202d();
        this.f54900b = f54898c;
        if (str == null) {
            return;
        }
        m38946b(m38947a(str), 65536);
    }

    public void writeToLog(long j, String str) {
        this.f54900b.mo29203c(j, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        setCurrentSession(str);
    }
}
