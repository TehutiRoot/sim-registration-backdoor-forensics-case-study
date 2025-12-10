package org.apache.http.client.entity;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.SerializableEntity;
import org.apache.http.entity.StringEntity;

/* loaded from: classes6.dex */
public class EntityBuilder {

    /* renamed from: a */
    public String f73767a;

    /* renamed from: b */
    public byte[] f73768b;

    /* renamed from: c */
    public InputStream f73769c;

    /* renamed from: d */
    public List f73770d;

    /* renamed from: e */
    public Serializable f73771e;

    /* renamed from: f */
    public File f73772f;

    /* renamed from: g */
    public ContentType f73773g;

    /* renamed from: h */
    public String f73774h;

    /* renamed from: i */
    public boolean f73775i;

    /* renamed from: j */
    public boolean f73776j;

    public static EntityBuilder create() {
        return new EntityBuilder();
    }

    /* renamed from: a */
    public final void m25022a() {
        this.f73767a = null;
        this.f73768b = null;
        this.f73769c = null;
        this.f73770d = null;
        this.f73771e = null;
        this.f73772f = null;
    }

    /* renamed from: b */
    public final ContentType m25021b(ContentType contentType) {
        ContentType contentType2 = this.f73773g;
        if (contentType2 != null) {
            return contentType2;
        }
        return contentType;
    }

    public HttpEntity build() {
        AbstractHttpEntity basicHttpEntity;
        Charset charset;
        ContentType contentType;
        String str = this.f73767a;
        if (str != null) {
            basicHttpEntity = new StringEntity(str, m25021b(ContentType.DEFAULT_TEXT));
        } else {
            byte[] bArr = this.f73768b;
            if (bArr != null) {
                basicHttpEntity = new ByteArrayEntity(bArr, m25021b(ContentType.DEFAULT_BINARY));
            } else {
                InputStream inputStream = this.f73769c;
                if (inputStream != null) {
                    basicHttpEntity = new InputStreamEntity(inputStream, -1L, m25021b(ContentType.DEFAULT_BINARY));
                } else {
                    List list = this.f73770d;
                    if (list != null) {
                        ContentType contentType2 = this.f73773g;
                        if (contentType2 != null) {
                            charset = contentType2.getCharset();
                        } else {
                            charset = null;
                        }
                        basicHttpEntity = new UrlEncodedFormEntity(list, charset);
                    } else {
                        Serializable serializable = this.f73771e;
                        if (serializable != null) {
                            basicHttpEntity = new SerializableEntity(serializable);
                            basicHttpEntity.setContentType(ContentType.DEFAULT_BINARY.toString());
                        } else {
                            File file = this.f73772f;
                            if (file != null) {
                                basicHttpEntity = new FileEntity(file, m25021b(ContentType.DEFAULT_BINARY));
                            } else {
                                basicHttpEntity = new BasicHttpEntity();
                            }
                        }
                    }
                }
            }
        }
        if (basicHttpEntity.getContentType() != null && (contentType = this.f73773g) != null) {
            basicHttpEntity.setContentType(contentType.toString());
        }
        basicHttpEntity.setContentEncoding(this.f73774h);
        basicHttpEntity.setChunked(this.f73775i);
        if (this.f73776j) {
            return new GzipCompressingEntity(basicHttpEntity);
        }
        return basicHttpEntity;
    }

    public EntityBuilder chunked() {
        this.f73775i = true;
        return this;
    }

    public byte[] getBinary() {
        return this.f73768b;
    }

    public String getContentEncoding() {
        return this.f73774h;
    }

    public ContentType getContentType() {
        return this.f73773g;
    }

    public File getFile() {
        return this.f73772f;
    }

    public List<NameValuePair> getParameters() {
        return this.f73770d;
    }

    public Serializable getSerializable() {
        return this.f73771e;
    }

    public InputStream getStream() {
        return this.f73769c;
    }

    public String getText() {
        return this.f73767a;
    }

    public EntityBuilder gzipCompress() {
        this.f73776j = true;
        return this;
    }

    public boolean isChunked() {
        return this.f73775i;
    }

    public boolean isGzipCompress() {
        return this.f73776j;
    }

    public EntityBuilder setBinary(byte[] bArr) {
        m25022a();
        this.f73768b = bArr;
        return this;
    }

    public EntityBuilder setContentEncoding(String str) {
        this.f73774h = str;
        return this;
    }

    public EntityBuilder setContentType(ContentType contentType) {
        this.f73773g = contentType;
        return this;
    }

    public EntityBuilder setFile(File file) {
        m25022a();
        this.f73772f = file;
        return this;
    }

    public EntityBuilder setParameters(List<NameValuePair> list) {
        m25022a();
        this.f73770d = list;
        return this;
    }

    public EntityBuilder setSerializable(Serializable serializable) {
        m25022a();
        this.f73771e = serializable;
        return this;
    }

    public EntityBuilder setStream(InputStream inputStream) {
        m25022a();
        this.f73769c = inputStream;
        return this;
    }

    public EntityBuilder setText(String str) {
        m25022a();
        this.f73767a = str;
        return this;
    }

    public EntityBuilder setParameters(NameValuePair... nameValuePairArr) {
        return setParameters(Arrays.asList(nameValuePairArr));
    }
}