package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: Pz */
/* loaded from: classes4.dex */
public class C1138Pz {

    /* renamed from: a */
    public final FileChannel f4918a;

    /* renamed from: b */
    public final FileLock f4919b;

    public C1138Pz(FileChannel fileChannel, FileLock fileLock) {
        this.f4918a = fileChannel;
        this.f4919b = fileLock;
    }

    /* renamed from: a */
    public static C1138Pz m66698a(Context context, String str) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
                try {
                    return new C1138Pz(fileChannel, fileLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            fileChannel = null;
            fileLock = null;
        }
    }

    /* renamed from: b */
    public void m66697b() {
        try {
            this.f4919b.release();
            this.f4918a.close();
        } catch (IOException unused) {
        }
    }
}
