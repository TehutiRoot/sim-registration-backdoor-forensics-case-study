package com.zxy.tiny.core;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class CompressEngine {

    /* renamed from: a */
    public SourceType f60961a;

    /* renamed from: b */
    public Object f60962b;

    /* loaded from: classes5.dex */
    public enum SourceType {
        FILE(1),
        BITMAP(2),
        URI(3),
        BYTE_ARRAY(4),
        INPUT_STREAM(5),
        RES_ID(6),
        FILE_ARRAY(7),
        BITMAP_ARRAY(8),
        URI_ARRAY(9),
        RES_ID_ARRAY(10);
        
        int value;

        SourceType(int i) {
        }

        public int getValue() {
            return this.value;
        }
    }

    public BitmapCompressEngine asBitmap() {
        return CompressEngineFactory.buildBitmapCompressEngine(this.f60962b, this.f60961a);
    }

    public FileCompressEngine asFile() {
        return CompressEngineFactory.buildFileCompressEngine(this.f60962b, this.f60961a);
    }

    public BitmapBatchCompressEngine batchAsBitmap() {
        return CompressEngineFactory.buildBitmapBatchCompressEngine(this.f60962b, this.f60961a);
    }

    public FileBatchCompressEngine batchAsFile() {
        return CompressEngineFactory.buildFileBatchCompressEngine(this.f60962b, this.f60961a);
    }

    public CompressEngine source(File file) {
        this.f60961a = SourceType.FILE;
        this.f60962b = file;
        return this;
    }

    public CompressEngine source(Bitmap bitmap) {
        this.f60961a = SourceType.BITMAP;
        this.f60962b = bitmap;
        return this;
    }

    public CompressEngine source(Uri uri) {
        this.f60961a = SourceType.URI;
        this.f60962b = uri;
        return this;
    }

    public CompressEngine source(byte[] bArr) {
        this.f60961a = SourceType.BYTE_ARRAY;
        this.f60962b = bArr;
        return this;
    }

    public CompressEngine source(InputStream inputStream) {
        this.f60961a = SourceType.INPUT_STREAM;
        this.f60962b = inputStream;
        return this;
    }

    public CompressEngine source(int i) {
        this.f60961a = SourceType.RES_ID;
        this.f60962b = Integer.valueOf(i);
        return this;
    }

    public CompressEngine source(File[] fileArr) {
        this.f60961a = SourceType.FILE_ARRAY;
        this.f60962b = fileArr;
        return this;
    }

    public CompressEngine source(Bitmap[] bitmapArr) {
        this.f60961a = SourceType.BITMAP_ARRAY;
        this.f60962b = bitmapArr;
        return this;
    }

    public CompressEngine source(Uri[] uriArr) {
        this.f60961a = SourceType.URI_ARRAY;
        this.f60962b = uriArr;
        return this;
    }

    public CompressEngine source(int[] iArr) {
        this.f60961a = SourceType.RES_ID_ARRAY;
        this.f60962b = iArr;
        return this;
    }
}
