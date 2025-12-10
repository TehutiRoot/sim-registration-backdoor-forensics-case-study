package com.chuckerteam.chucker.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28850d2 = {"Lcom/chuckerteam/chucker/api/ExportFormat;", "", "extension", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getExtension", "()Ljava/lang/String;", "LOG", "HAR", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public enum ExportFormat {
    LOG("txt"),
    HAR("har");
    
    @NotNull
    private final String extension;

    ExportFormat(String str) {
        this.extension = str;
    }

    @NotNull
    public final String getExtension() {
        return this.extension;
    }
}
