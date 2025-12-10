package com.zxy.tiny.core;

import com.zxy.tiny.core.CompressEngine;

/* loaded from: classes5.dex */
public final class CompressEngineFactory {
    public static BitmapBatchCompressEngine buildBitmapBatchCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        BitmapBatchCompressEngine bitmapBatchCompressEngine = new BitmapBatchCompressEngine();
        bitmapBatchCompressEngine.f60974b = obj;
        bitmapBatchCompressEngine.f60973a = sourceType;
        return bitmapBatchCompressEngine;
    }

    public static BitmapCompressEngine buildBitmapCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        BitmapCompressEngine bitmapCompressEngine = new BitmapCompressEngine();
        bitmapCompressEngine.f60974b = obj;
        bitmapCompressEngine.f60973a = sourceType;
        return bitmapCompressEngine;
    }

    public static FileBatchCompressEngine buildFileBatchCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        FileBatchCompressEngine fileBatchCompressEngine = new FileBatchCompressEngine();
        fileBatchCompressEngine.f60974b = obj;
        fileBatchCompressEngine.f60973a = sourceType;
        return fileBatchCompressEngine;
    }

    public static FileCompressEngine buildFileCompressEngine(Object obj, CompressEngine.SourceType sourceType) {
        FileCompressEngine fileCompressEngine = new FileCompressEngine();
        fileCompressEngine.f60974b = obj;
        fileCompressEngine.f60973a = sourceType;
        return fileCompressEngine;
    }
}