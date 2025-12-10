package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

@KeepForSdk
/* loaded from: classes4.dex */
public class LocalModelLoader {

    /* renamed from: a */
    public MappedByteBuffer f56960a;

    /* renamed from: b */
    public final Context f56961b;

    /* renamed from: c */
    public final LocalModel f56962c;

    @KeepForSdk
    public LocalModelLoader(@NonNull Context context, @NonNull LocalModel localModel) {
        this.f56961b = context;
        this.f56962c = localModel;
    }

    @NonNull
    @KeepForSdk
    public LocalModel getLocalModel() {
        return this.f56962c;
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public MappedByteBuffer load() throws MlKitException {
        Preconditions.checkNotNull(this.f56961b, "Context can not be null");
        Preconditions.checkNotNull(this.f56962c, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.f56960a;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        LocalModel localModel = this.f56962c;
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        String assetFilePath = localModel.getAssetFilePath();
        Uri uri = localModel.getUri();
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, PDPageLabelRange.STYLE_ROMAN_LOWER);
                FileChannel channel = randomAccessFile.getChannel();
                this.f56960a = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                channel.close();
                randomAccessFile.close();
            } catch (IOException e) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.f56962c.getAbsoluteFilePath())), 14, e);
            }
        } else if (assetFilePath != null) {
            try {
                AssetFileDescriptor openFd = this.f56961b.getAssets().openFd(assetFilePath);
                FileChannel channel2 = new FileInputStream(openFd.getFileDescriptor()).getChannel();
                this.f56960a = channel2.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                channel2.close();
                openFd.close();
            } catch (IOException e2) {
                throw new MlKitException("Can not load the file from asset: " + assetFilePath + ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression", 14, e2);
            }
        } else if (uri != null) {
            try {
                AssetFileDescriptor zza = zzi.zza(this.f56961b, uri, PDPageLabelRange.STYLE_ROMAN_LOWER);
                FileChannel channel3 = zza.createInputStream().getChannel();
                this.f56960a = channel3.map(FileChannel.MapMode.READ_ONLY, zza.getStartOffset(), zza.getLength());
                channel3.close();
                zza.close();
            } catch (IOException e3) {
                throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e3);
            }
        } else {
            throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
        }
        return this.f56960a;
    }
}