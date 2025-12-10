package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class FileContent extends AbstractInputStreamContent {

    /* renamed from: c */
    public final File f52045c;

    public FileContent(String str, File file) {
        super(str);
        this.f52045c = (File) Preconditions.checkNotNull(file);
    }

    public File getFile() {
        return this.f52045c;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream(this.f52045c);
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.f52045c.length();
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public FileContent setCloseInputStream(boolean z) {
        return (FileContent) super.setCloseInputStream(z);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public FileContent setType(String str) {
        return (FileContent) super.setType(str);
    }
}