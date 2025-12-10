package com.zxy.tiny.core;

import com.zxy.tiny.core.CompressEngine;

/* loaded from: classes5.dex */
public final class CompressEngineFactory {
    public static BitmapBatchCompressEngine buildBitmapBatchCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        BitmapBatchCompressEngine bitmapBatchCompressEngine = new BitmapBatchCompressEngine();
        bitmapBatchCompressEngine.f60962b = obj;
        bitmapBatchCompressEngine.f60961a = sourceType;
        return bitmapBatchCompressEngine;
    }

    public static BitmapCompressEngine buildBitmapCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        BitmapCompressEngine bitmapCompressEngine = new BitmapCompressEngine();
        bitmapCompressEngine.f60962b = obj;
        bitmapCompressEngine.f60961a = sourceType;
        return bitmapCompressEngine;
    }

    public static FileBatchCompressEngine buildFileBatchCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        FileBatchCompressEngine fileBatchCompressEngine = new FileBatchCompressEngine();
        fileBatchCompressEngine.f60962b = obj;
        fileBatchCompressEngine.f60961a = sourceType;
        return fileBatchCompressEngine;
    }

    public static FileCompressEngine buildFileCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        FileCompressEngine fileCompressEngine = new FileCompressEngine();
        fileCompressEngine.f60962b = obj;
        fileCompressEngine.f60961a = sourceType;
        return fileCompressEngine;
    }
}
