package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class DeviceProfileWriter {

    /* renamed from: a */
    public final AssetManager f36514a;

    /* renamed from: b */
    public final Executor f36515b;

    /* renamed from: c */
    public final ProfileInstaller.DiagnosticsCallback f36516c;

    /* renamed from: e */
    public final File f36518e;

    /* renamed from: f */
    public final String f36519f;

    /* renamed from: g */
    public final String f36520g;

    /* renamed from: h */
    public final String f36521h;

    /* renamed from: j */
    public C1089PI[] f36523j;

    /* renamed from: k */
    public byte[] f36524k;

    /* renamed from: i */
    public boolean f36522i = false;

    /* renamed from: d */
    public final byte[] f36517d = m53752d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f36514a = assetManager;
        this.f36515b = executor;
        this.f36516c = diagnosticsCallback;
        this.f36519f = str;
        this.f36520g = str2;
        this.f36521h = str3;
        this.f36518e = file;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53755a(DeviceProfileWriter deviceProfileWriter, int i, Object obj) {
        deviceProfileWriter.m53750f(i, obj);
    }

    /* renamed from: d */
    public static byte[] m53752d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 34) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return ProfileVersion.f36543e;
            case 26:
                return ProfileVersion.f36542d;
            case 27:
                return ProfileVersion.f36541c;
            case 28:
            case 29:
            case 30:
                return ProfileVersion.f36540b;
            case 31:
            case 32:
            case 33:
            case 34:
                return ProfileVersion.f36539a;
            default:
                return null;
        }
    }

    /* renamed from: i */
    public static boolean m53747i() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 34) {
            return false;
        }
        if (i != 24 && i != 25) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final DeviceProfileWriter m53754b(C1089PI[] c1089piArr, byte[] bArr) {
        InputStream m53749g;
        try {
            m53749g = m53749g(this.f36514a, this.f36521h);
        } catch (FileNotFoundException e) {
            this.f36516c.onResultReceived(9, e);
        } catch (IOException e2) {
            this.f36516c.onResultReceived(7, e2);
        } catch (IllegalStateException e3) {
            this.f36523j = null;
            this.f36516c.onResultReceived(8, e3);
        }
        if (m53749g != null) {
            try {
                this.f36523j = AbstractC4871b.m53679q(m53749g, AbstractC4871b.m53681o(m53749g, AbstractC4871b.f36547b), bArr, c1089piArr);
                m53749g.close();
                return this;
            } catch (Throwable th2) {
                try {
                    m53749g.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (m53749g != null) {
            m53749g.close();
        }
        return null;
    }

    /* renamed from: c */
    public final void m53753c() {
        if (this.f36522i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.f36517d == null) {
            m53746j(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f36518e.exists()) {
            if (!this.f36518e.canWrite()) {
                m53746j(4, null);
                return false;
            }
        } else {
            try {
                this.f36518e.createNewFile();
            } catch (IOException unused) {
                m53746j(4, null);
                return false;
            }
        }
        this.f36522i = true;
        return true;
    }

    /* renamed from: e */
    public final InputStream m53751e(AssetManager assetManager) {
        try {
            return m53749g(assetManager, this.f36520g);
        } catch (FileNotFoundException e) {
            this.f36516c.onResultReceived(6, e);
            return null;
        } catch (IOException e2) {
            this.f36516c.onResultReceived(7, e2);
            return null;
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m53750f(int i, Object obj) {
        this.f36516c.onResultReceived(i, obj);
    }

    /* renamed from: g */
    public final InputStream m53749g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f36516c.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    /* renamed from: h */
    public final C1089PI[] m53748h(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C1089PI[] m53673w = AbstractC4871b.m53673w(inputStream, AbstractC4871b.m53681o(inputStream, AbstractC4871b.f36546a), this.f36519f);
                        try {
                            inputStream.close();
                            return m53673w;
                        } catch (IOException e) {
                            this.f36516c.onResultReceived(7, e);
                            return m53673w;
                        }
                    } catch (IOException e2) {
                        this.f36516c.onResultReceived(7, e2);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.f36516c.onResultReceived(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.f36516c.onResultReceived(7, e4);
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f36516c.onResultReceived(7, e5);
            }
            throw th2;
        }
    }

    /* renamed from: j */
    public final void m53746j(final int i, final Object obj) {
        this.f36515b.execute(new Runnable() { // from class: xG
            {
                DeviceProfileWriter.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DeviceProfileWriter.m53755a(DeviceProfileWriter.this, i, obj);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter read() {
        DeviceProfileWriter m53754b;
        m53753c();
        if (this.f36517d == null) {
            return this;
        }
        InputStream m53751e = m53751e(this.f36514a);
        if (m53751e != null) {
            this.f36523j = m53748h(m53751e);
        }
        C1089PI[] c1089piArr = this.f36523j;
        if (c1089piArr != null && m53747i() && (m53754b = m53754b(c1089piArr, this.f36517d)) != null) {
            return m53754b;
        }
        return this;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        ByteArrayOutputStream byteArrayOutputStream;
        C1089PI[] c1089piArr = this.f36523j;
        byte[] bArr = this.f36517d;
        if (c1089piArr != null && bArr != null) {
            m53753c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.f36516c.onResultReceived(7, e);
            } catch (IllegalStateException e2) {
                this.f36516c.onResultReceived(8, e2);
            }
            try {
                AbstractC4871b.m53706E(byteArrayOutputStream, bArr);
                if (!AbstractC4871b.m53709B(byteArrayOutputStream, bArr, c1089piArr)) {
                    this.f36516c.onResultReceived(5, null);
                    this.f36523j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f36524k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f36523j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PI[], byte[]] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean write() {
        byte[] bArr = this.f36524k;
        if (bArr == null) {
            return false;
        }
        m53753c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f36518e);
                    AbstractC13924sS.m22606l(byteArrayInputStream, fileOutputStream);
                    m53746j(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e) {
                m53746j(6, e);
                return false;
            } catch (IOException e2) {
                m53746j(7, e2);
                return false;
            }
        } finally {
            this.f36524k = null;
            this.f36523j = null;
        }
    }
}
