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
    public final AssetManager f36602a;

    /* renamed from: b */
    public final Executor f36603b;

    /* renamed from: c */
    public final ProfileInstaller.DiagnosticsCallback f36604c;

    /* renamed from: e */
    public final File f36606e;

    /* renamed from: f */
    public final String f36607f;

    /* renamed from: g */
    public final String f36608g;

    /* renamed from: h */
    public final String f36609h;

    /* renamed from: j */
    public C1149QI[] f36611j;

    /* renamed from: k */
    public byte[] f36612k;

    /* renamed from: i */
    public boolean f36610i = false;

    /* renamed from: d */
    public final byte[] f36605d = m53703d();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.f36602a = assetManager;
        this.f36603b = executor;
        this.f36604c = diagnosticsCallback;
        this.f36607f = str;
        this.f36608g = str2;
        this.f36609h = str3;
        this.f36606e = file;
    }

    /* renamed from: a */
    public static /* synthetic */ void m53706a(DeviceProfileWriter deviceProfileWriter, int i, Object obj) {
        deviceProfileWriter.m53701f(i, obj);
    }

    /* renamed from: d */
    public static byte[] m53703d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 34) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return ProfileVersion.f36631e;
            case 26:
                return ProfileVersion.f36630d;
            case 27:
                return ProfileVersion.f36629c;
            case 28:
            case 29:
            case 30:
                return ProfileVersion.f36628b;
            case 31:
            case 32:
            case 33:
            case 34:
                return ProfileVersion.f36627a;
            default:
                return null;
        }
    }

    /* renamed from: i */
    public static boolean m53698i() {
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
    public final DeviceProfileWriter m53705b(C1149QI[] c1149qiArr, byte[] bArr) {
        InputStream m53700g;
        try {
            m53700g = m53700g(this.f36602a, this.f36609h);
        } catch (FileNotFoundException e) {
            this.f36604c.onResultReceived(9, e);
        } catch (IOException e2) {
            this.f36604c.onResultReceived(7, e2);
        } catch (IllegalStateException e3) {
            this.f36611j = null;
            this.f36604c.onResultReceived(8, e3);
        }
        if (m53700g != null) {
            try {
                this.f36611j = AbstractC4853b.m53630q(m53700g, AbstractC4853b.m53632o(m53700g, AbstractC4853b.f36635b), bArr, c1149qiArr);
                m53700g.close();
                return this;
            } catch (Throwable th2) {
                try {
                    m53700g.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (m53700g != null) {
            m53700g.close();
        }
        return null;
    }

    /* renamed from: c */
    public final void m53704c() {
        if (this.f36610i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.f36605d == null) {
            m53697j(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f36606e.exists()) {
            if (!this.f36606e.canWrite()) {
                m53697j(4, null);
                return false;
            }
        } else {
            try {
                this.f36606e.createNewFile();
            } catch (IOException unused) {
                m53697j(4, null);
                return false;
            }
        }
        this.f36610i = true;
        return true;
    }

    /* renamed from: e */
    public final InputStream m53702e(AssetManager assetManager) {
        try {
            return m53700g(assetManager, this.f36608g);
        } catch (FileNotFoundException e) {
            this.f36604c.onResultReceived(6, e);
            return null;
        } catch (IOException e2) {
            this.f36604c.onResultReceived(7, e2);
            return null;
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m53701f(int i, Object obj) {
        this.f36604c.onResultReceived(i, obj);
    }

    /* renamed from: g */
    public final InputStream m53700g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f36604c.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    /* renamed from: h */
    public final C1149QI[] m53699h(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C1149QI[] m53624w = AbstractC4853b.m53624w(inputStream, AbstractC4853b.m53632o(inputStream, AbstractC4853b.f36634a), this.f36607f);
                        try {
                            inputStream.close();
                            return m53624w;
                        } catch (IOException e) {
                            this.f36604c.onResultReceived(7, e);
                            return m53624w;
                        }
                    } catch (IOException e2) {
                        this.f36604c.onResultReceived(7, e2);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.f36604c.onResultReceived(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.f36604c.onResultReceived(7, e4);
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f36604c.onResultReceived(7, e5);
            }
            throw th2;
        }
    }

    /* renamed from: j */
    public final void m53697j(final int i, final Object obj) {
        this.f36603b.execute(new Runnable() { // from class: yG
            @Override // java.lang.Runnable
            public final void run() {
                DeviceProfileWriter.m53706a(DeviceProfileWriter.this, i, obj);
            }
        });
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter read() {
        DeviceProfileWriter m53705b;
        m53704c();
        if (this.f36605d == null) {
            return this;
        }
        InputStream m53702e = m53702e(this.f36602a);
        if (m53702e != null) {
            this.f36611j = m53699h(m53702e);
        }
        C1149QI[] c1149qiArr = this.f36611j;
        if (c1149qiArr != null && m53698i() && (m53705b = m53705b(c1149qiArr, this.f36605d)) != null) {
            return m53705b;
        }
        return this;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        ByteArrayOutputStream byteArrayOutputStream;
        C1149QI[] c1149qiArr = this.f36611j;
        byte[] bArr = this.f36605d;
        if (c1149qiArr != null && bArr != null) {
            m53704c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.f36604c.onResultReceived(7, e);
            } catch (IllegalStateException e2) {
                this.f36604c.onResultReceived(8, e2);
            }
            try {
                AbstractC4853b.m53657E(byteArrayOutputStream, bArr);
                if (!AbstractC4853b.m53660B(byteArrayOutputStream, bArr, c1149qiArr)) {
                    this.f36604c.onResultReceived(5, null);
                    this.f36611j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f36612k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f36611j = null;
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

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], QI[]] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean write() {
        byte[] bArr = this.f36612k;
        if (bArr == null) {
            return false;
        }
        m53704c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f36606e);
                    AbstractC16979wS.m742l(byteArrayInputStream, fileOutputStream);
                    m53697j(1, null);
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
                m53697j(6, e);
                return false;
            } catch (IOException e2) {
                m53697j(7, e2);
                return false;
            }
        } finally {
            this.f36612k = null;
            this.f36611j = null;
        }
    }
}