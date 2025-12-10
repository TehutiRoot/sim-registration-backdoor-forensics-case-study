package com.google.firebase.p015ml.common.internal.modeldownload;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznf;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.modeldownload.FirebaseLocalModel;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzf */
/* loaded from: classes4.dex */
public class zzf {

    /* renamed from: a */
    public MappedByteBuffer f55763a;

    /* renamed from: b */
    public final Context f55764b;

    /* renamed from: c */
    public final FirebaseLocalModel f55765c;

    public zzf(@NonNull Context context, @NonNull FirebaseLocalModel firebaseLocalModel) {
        this.f55764b = context;
        this.f55765c = firebaseLocalModel;
    }

    @NonNull
    @WorkerThread
    public MappedByteBuffer load() throws FirebaseMLException {
        String str;
        Preconditions.checkNotNull(this.f55764b, "Context can not be null");
        Preconditions.checkNotNull(this.f55765c, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.f55763a;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        if (this.f55765c.getFilePath() != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f55765c.getFilePath(), PDPageLabelRange.STYLE_ROMAN_LOWER);
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    this.f55763a = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    channel.close();
                    randomAccessFile.close();
                    return this.f55763a;
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            zznf.zza(th2, th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(this.f55765c.getFilePath());
                if (valueOf.length() != 0) {
                    str = "Can not open the local file: ".concat(valueOf);
                } else {
                    str = new String("Can not open the local file: ");
                }
                throw new FirebaseMLException(str, 14, e);
            }
        } else if (this.f55765c.getAssetFilePath() != null) {
            String assetFilePath = this.f55765c.getAssetFilePath();
            try {
                AssetFileDescriptor openFd = this.f55764b.getAssets().openFd(assetFilePath);
                FileInputStream fileInputStream = new FileInputStream(openFd.getFileDescriptor());
                FileChannel channel2 = fileInputStream.getChannel();
                try {
                    this.f55763a = channel2.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                    channel2.close();
                    fileInputStream.close();
                    openFd.close();
                    return this.f55763a;
                } catch (Throwable th4) {
                    if (channel2 != null) {
                        try {
                            channel2.close();
                        } catch (Throwable th5) {
                            zznf.zza(th4, th5);
                        }
                    }
                    throw th4;
                }
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder(String.valueOf(assetFilePath).length() + 186);
                sb.append("Can not load the file from asset: ");
                sb.append(assetFilePath);
                sb.append(". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression");
                throw new FirebaseMLException(sb.toString(), 14, e2);
            }
        } else {
            throw new FirebaseMLException("Can not load the model. Either filePath or assetFilePath must be set for the model.", 14);
        }
    }

    public final FirebaseLocalModel zzpe() {
        return this.f55765c;
    }
}
