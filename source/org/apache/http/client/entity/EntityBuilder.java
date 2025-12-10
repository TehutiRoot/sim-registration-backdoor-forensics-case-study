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
    public String f73683a;

    /* renamed from: b */
    public byte[] f73684b;

    /* renamed from: c */
    public InputStream f73685c;

    /* renamed from: d */
    public List f73686d;

    /* renamed from: e */
    public Serializable f73687e;

    /* renamed from: f */
    public File f73688f;

    /* renamed from: g */
    public ContentType f73689g;

    /* renamed from: h */
    public String f73690h;

    /* renamed from: i */
    public boolean f73691i;

    /* renamed from: j */
    public boolean f73692j;

    public static EntityBuilder create() {
        return new EntityBuilder();
    }

    /* renamed from: a */
    public final void m24832a() {
        this.f73683a = null;
        this.f73684b = null;
        this.f73685c = null;
        this.f73686d = null;
        this.f73687e = null;
        this.f73688f = null;
    }

    /* renamed from: b */
    public final ContentType m24831b(ContentType contentType) {
        ContentType contentType2 = this.f73689g;
        if (contentType2 != null) {
            return contentType2;
        }
        return contentType;
    }

    public HttpEntity build() {
        AbstractHttpEntity basicHttpEntity;
        Charset charset;
        ContentType contentType;
        String str = this.f73683a;
        if (str != null) {
            basicHttpEntity = new StringEntity(str, m24831b(ContentType.DEFAULT_TEXT));
        } else {
            byte[] bArr = this.f73684b;
            if (bArr != null) {
                basicHttpEntity = new ByteArrayEntity(bArr, m24831b(ContentType.DEFAULT_BINARY));
            } else {
                InputStream inputStream = this.f73685c;
                if (inputStream != null) {
                    basicHttpEntity = new InputStreamEntity(inputStream, -1L, m24831b(ContentType.DEFAULT_BINARY));
                } else {
                    List list = this.f73686d;
                    if (list != null) {
                        ContentType contentType2 = this.f73689g;
                        if (contentType2 != null) {
                            charset = contentType2.getCharset();
                        } else {
                            charset = null;
                        }
                        basicHttpEntity = new UrlEncodedFormEntity(list, charset);
                    } else {
                        Serializable serializable = this.f73687e;
                        if (serializable != null) {
                            basicHttpEntity = new SerializableEntity(serializable);
                            basicHttpEntity.setContentType(ContentType.DEFAULT_BINARY.toString());
                        } else {
                            File file = this.f73688f;
                            if (file != null) {
                                basicHttpEntity = new FileEntity(file, m24831b(ContentType.DEFAULT_BINARY));
                            } else {
                                basicHttpEntity = new BasicHttpEntity();
                            }
                        }
                    }
                }
            }
        }
        if (basicHttpEntity.getContentType() != null && (contentType = this.f73689g) != null) {
            basicHttpEntity.setContentType(contentType.toString());
        }
        basicHttpEntity.setContentEncoding(this.f73690h);
        basicHttpEntity.setChunked(this.f73691i);
        if (this.f73692j) {
            return new GzipCompressingEntity(basicHttpEntity);
        }
        return basicHttpEntity;
    }

    public EntityBuilder chunked() {
        this.f73691i = true;
        return this;
    }

    public byte[] getBinary() {
        return this.f73684b;
    }

    public String getContentEncoding() {
        return this.f73690h;
    }

    public ContentType getContentType() {
        return this.f73689g;
    }

    public File getFile() {
        return this.f73688f;
    }

    public List<NameValuePair> getParameters() {
        return this.f73686d;
    }

    public Serializable getSerializable() {
        return this.f73687e;
    }

    public InputStream getStream() {
        return this.f73685c;
    }

    public String getText() {
        return this.f73683a;
    }

    public EntityBuilder gzipCompress() {
        this.f73692j = true;
        return this;
    }

    public boolean isChunked() {
        return this.f73691i;
    }

    public boolean isGzipCompress() {
        return this.f73692j;
    }

    public EntityBuilder setBinary(byte[] bArr) {
        m24832a();
        this.f73684b = bArr;
        return this;
    }

    public EntityBuilder setContentEncoding(String str) {
        this.f73690h = str;
        return this;
    }

    public EntityBuilder setContentType(ContentType contentType) {
        this.f73689g = contentType;
        return this;
    }

    public EntityBuilder setFile(File file) {
        m24832a();
        this.f73688f = file;
        return this;
    }

    public EntityBuilder setParameters(List<NameValuePair> list) {
        m24832a();
        this.f73686d = list;
        return this;
    }

    public EntityBuilder setSerializable(Serializable serializable) {
        m24832a();
        this.f73687e = serializable;
        return this;
    }

    public EntityBuilder setStream(InputStream inputStream) {
        m24832a();
        this.f73685c = inputStream;
        return this;
    }

    public EntityBuilder setText(String str) {
        m24832a();
        this.f73683a = str;
        return this;
    }

    public EntityBuilder setParameters(NameValuePair... nameValuePairArr) {
        return setParameters(Arrays.asList(nameValuePairArr));
    }
}
